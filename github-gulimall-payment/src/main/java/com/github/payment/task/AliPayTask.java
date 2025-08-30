package com.github.payment.task;


import com.github.payment.entity.OrderInfo;
import com.github.payment.enums.PayType;
import com.github.payment.service.AliPayService;
import com.github.payment.service.OrderInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Component
public class AliPayTask {

    @Resource
    private OrderInfoService orderInfoService;

    @Resource
    private AliPayService aliPayService;



    /**
     * 从第0秒开始每隔30秒执行1次，查询创建超过5分钟，并且未支付的订单
     */
    @Scheduled(cron = "0 0/2 * * * ?")
    public void orderConfirm(){

        log.info("orderConfirm 被执行......");

        List<OrderInfo> orderInfoList = orderInfoService.getNoPayOrderByDuration(5, PayType.ALIPAY.getType());

        for (OrderInfo orderInfo : orderInfoList) {
            String orderNo = orderInfo.getOrderNo();
            log.warn("超时订单 ===> {}", orderNo);

            //核实订单状态：调用支付宝查单接口
            aliPayService.checkOrderStatus(orderNo);
        }
    }
}
