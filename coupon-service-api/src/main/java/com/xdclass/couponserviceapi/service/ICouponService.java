package com.xdclass.couponserviceapi.service;

import com.xdclass.couponserviceapi.dto.CouponDto;
import com.xdclass.couponserviceapi.dto.UserCouponDto;

import java.util.List;
import java.util.Set;


public interface ICouponService {

    /***
     * 获取有效时间的可用优惠券列表
     * // 1、是否存在远程调用 HTTP、RPC Metrics
     * // 2、大量内存处理  list.contain() ==>set.contain
     * @return
     */
    public List<CouponDto> getCouponList();

    public String saveUserCoupon(UserCouponDto dto);

    /**
     * 获取 Coupon公告栏 最近 N条数据
     */
    public List<String> queryCouponList();

    /**
     * 更新 公告栏中的 值
     * @param couponId
     */
    public void updateCoupon(String couponId);
}
