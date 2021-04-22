package com.skylike.skymall.member.feign;

import com.skylike.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("skymall-coupon")
public interface ConponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupon();
}
