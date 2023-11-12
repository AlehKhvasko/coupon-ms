package com.cognizant.productcouponms.controllers;

import com.cognizant.productcouponms.model.Coupon;
import com.cognizant.productcouponms.repository.CouponRepoInterface;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/couponapi")
public class CouponRestController {
    private CouponRepoInterface couponRepoInterface;

    public CouponRestController(CouponRepoInterface couponRepoInterface) {
        this.couponRepoInterface = couponRepoInterface;
    }

    @RequestMapping(value = "/coupons", method = RequestMethod.POST)
    public Coupon createCoupon (@RequestBody Coupon coupon){
        return couponRepoInterface.save(coupon);
    }

    @RequestMapping(value = "/coupons/{code}", method = RequestMethod.GET)
    public Coupon getCoupon(@PathVariable("code") String code){
        return couponRepoInterface.findByCode(code);
    }
}
