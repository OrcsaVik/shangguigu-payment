package com.github.payment.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.payment.entity.RefundInfo;

import java.util.List;

public interface RefundInfoService extends IService<RefundInfo> {


    /**
     * Wechat and aliPay使用同一套创建方法
     * @param orderNo
     * @param reason
     * @return
     */
    RefundInfo createRefundByOrderNo(String orderNo, String reason);

    void updateRefund(String content);

    /**
     * 获取指定分钟内的订单
     * @param minutes
     * @return
     */
    List<RefundInfo> getNoRefundOrderByDuration(int minutes);


    void updateRefundForAliPay(String refundNo, String content, String refundStatus);
}
