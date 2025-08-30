package com.github.payment.task;


import com.github.payment.entity.OrderInfo;
import com.github.payment.entity.RefundInfo;
import com.github.payment.enums.PayType;
import com.github.payment.service.OrderInfoService;
import com.github.payment.service.RefundInfoService;
import com.github.payment.service.WxPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Component
public class WxPayTask {

    @Resource
    private OrderInfoService orderInfoService;

    @Resource
    private WxPayService wxPayService;

    @Resource
    private RefundInfoService refundInfoService;



    @Scheduled(cron = "0/30 * * * * ?")
    public void orderConfirm() throws Exception {
        log.info("orderConfirm 被执行......");

        List<OrderInfo> orderInfoList = orderInfoService.getNoPayOrderByDuration(1, PayType.WXPAY.getType());

        for (OrderInfo orderInfo : orderInfoList) {
            String orderNo = orderInfo.getOrderNo();
            log.warn("超时订单 ===> {}", orderNo);

            //核实订单状态：调用微信支付查单接口
            wxPayService.checkOrderStatus(orderNo);
        }
    }



    @Scheduled(cron = "0/30 * * * * ?")
    public void refundConfirm() throws Exception {
        log.info("refundConfirm 被执行......");

        //找出申请退款超过5分钟并且未成功的退款单
        List<RefundInfo> refundInfoList = refundInfoService.getNoRefundOrderByDuration(5);

        for (RefundInfo refundInfo : refundInfoList) {
            String refundNo = refundInfo.getRefundNo();
            log.warn("超时未退款的退款单号 ===> {}", refundNo);

            //核实订单状态：调用微信支付查询退款接口
            wxPayService.checkRefundStatus(refundNo);
        }
    }

}
