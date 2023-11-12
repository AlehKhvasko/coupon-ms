package com.cognizant.productcouponms.repository;

import com.cognizant.productcouponms.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepoInterface extends JpaRepository<Coupon, Long> {
    Coupon findByCode(String code);
}
