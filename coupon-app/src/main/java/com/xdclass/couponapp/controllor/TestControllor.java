package com.xdclass.couponapp.controllor;

import com.xdclass.couponapp.service.CouponServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class TestControllor {

    @Resource
    private CouponServiceImpl couponServiceImpl;

    @RequestMapping("/test")
    public String test(Integer id){
        return couponServiceImpl.getUserById(id);
    }



}
