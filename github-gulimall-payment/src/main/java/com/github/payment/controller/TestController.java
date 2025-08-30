package com.github.payment.controller;


import com.github.payment.config.WxPayConfig;
import com.github.payment.vo.R;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(tags = "测试控制器")
@RestController
@RequestMapping("/api/test")
@Slf4j
public class TestController {
    @Resource

    private WxPayConfig wxPayConfig;

    @GetMapping
    public R getWxPayConfig(){

        String mchId = wxPayConfig.getMchId();
        log.info("启动配置类--wxPayConfig success");
        return R.ok().data("mchId", mchId);
    }
}
