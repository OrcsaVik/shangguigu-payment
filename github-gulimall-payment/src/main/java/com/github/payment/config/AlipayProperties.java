package com.github.payment.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Vik
 * @date 2025-08-27 13:55
 * @description
 */
@Component
@ConfigurationProperties(prefix = "alipay")
@Getter
public class AlipayProperties {

    private String appId;
    private String sellerId;
    private String gatewayUrl;
    private String merchantPrivateKey;
    private String alipayPublicKey;
    private String contentKey;
    private String returnUrl;
    private String notifyUrl;

}
