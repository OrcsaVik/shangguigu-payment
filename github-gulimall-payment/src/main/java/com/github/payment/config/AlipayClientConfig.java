package com.github.payment.alipayConfig;


import com.alipay.api.*;
import com.github.payment.config.AlipayProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class AlipayClientConfig {

    @Resource
    private AlipayProperties alipayProperties;

    @Bean
    public AlipayClient alipayClient() throws AlipayApiException {

        AlipayConfig alipayConfig = new AlipayConfig();

        //设置网关地址
        alipayConfig.setServerUrl(alipayProperties.getGatewayUrl());
        alipayConfig.setAppId(alipayProperties.getAppId());
        alipayConfig.setPrivateKey(alipayProperties.getMerchantPrivateKey());
        alipayConfig.setAlipayPublicKey(alipayProperties.getAlipayPublicKey());
        alipayConfig.setFormat(AlipayConstants.FORMAT_JSON);
        alipayConfig.setCharset(AlipayConstants.CHARSET_UTF8);
        alipayConfig.setSignType(AlipayConstants.SIGN_TYPE_RSA2);
        //构造client
        AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig);

        return alipayClient;
    }
}
