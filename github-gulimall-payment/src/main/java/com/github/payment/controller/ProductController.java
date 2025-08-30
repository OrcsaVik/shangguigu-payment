package com.github.payment.controller;


import com.github.payment.entity.Product;
import com.github.payment.service.ProductService;
import com.github.payment.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin //开放前端的跨域访问
@Api(tags = "商品管理")
@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Resource
    private ProductService productService;


    @ApiOperation("商品列表")
    @GetMapping("/list")
    public R list(){

        List<Product> list = productService.list();
        return R.ok().data("productList", list);
    }

}
