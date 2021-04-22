package com.skylike.skymall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skylike.skymall.coupon.entity.CouponEntity;
import com.skylike.skymall.coupon.service.CouponService;
import com.skylike.common.utils.PageUtils;
import com.skylike.common.utils.R;

/**
 * 1.首先，修改 pom.xml 文件，引入 Nacos Config Starter。
 *  <dependency>
 *      <groupId>com.alibaba.cloud</groupId>
 *      <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *  </dependency>
 *      2.4以上需要引入一下依赖
 *  <dependency>
 *      <groupId>org.springframework.cloud</groupId>
 *      <artifactId>spring-cloud-starter-bootstrap</artifactId>
 *      <version>3.0.0</version>
 *  </dependency>
 *
 *  2.在应用的 /src/main/resources/bootstrap.properties 配置文件中配置 Nacos Config 元数据
 *  spring.application.name=nacos-config-example
 *  spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *
 *  3.在配置中心添加一个数据集 Data Id skymall-conpon.properties
 *  4.在controller中添加注解 @Refreshscope 动态获取并刷新配置
 *    @Value("${配置项变量名}")获取配置。
 *    如果存在应用配置文件和配置中心的配置文件，则配置中心的为优先配置
 */

/**
 * nacos配置中心细节
 * 1.命名空间，配置隔离
 *  在boostrap.properties中，配置使用的命名空间的的ID
 *  每一个微服务之间相互隔离。每一个微服务使用自己的命名空间
 * 2.配置集：所有的配置的集合
 * 3.配置ID：类似文件名 Data ID
 * 4.配置分组
 *   默认所有的配置集都属于：DEFAULT_GROUP
 *   可以在boostrap.properties配置其他分组
 * 5.同时加载多个配置集
 *   微服务的任何配置信息都可以在配置中心中配置
 *   只需要在bootstrap.properties中加载配置中心中的配置文件
 */





/**
 * 优惠券信息
 *
 * @author stream
 * @email stream@gmail.com
 * @date 2021-04-17 08:36:39
 */
@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @Value("${coupon.user.name}")
    private String name;
    @Value("${coupon.user.age}")
    private Integer age;

    @RequestMapping("/test")
    public R test(){

        return R.ok().put("name",name).put("age",age);
    }

    /**
     * 模拟一个优惠券
     * @return
     */
    @RequestMapping("/member/list")
    public R membercoupon(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满100减10");
        return R.ok().put("coupon",Arrays.asList(couponEntity));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
