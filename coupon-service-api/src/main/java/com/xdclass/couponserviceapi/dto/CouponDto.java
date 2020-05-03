package com.xdclass.couponserviceapi.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author john
 */
public class CouponDto implements Serializable {

    private Integer id;

    private String code;

    private String picUrl;

    private Integer achieveAmount;

    private Integer reduceAmount;

    private Integer stock;

    private String title;

    private Integer status;

    private Date createTime;

    private Date startTime;

    private Date endTime;
}
