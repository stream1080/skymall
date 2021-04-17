package com.skylike.skymall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.skylike.skymall.product.entity.BrandEntity;
import com.skylike.skymall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SkymallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("一加");
        brandEntity.setBrandId(14l);
        brandService.updateById(brandEntity);
      //  brandService.save(brandEntity);
        System.out.println("插入成功");

//        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",9l));
//        list.forEach((item)->{
//            System.out.println(item);
//        });
//        brandEntity =  brandService.query();

    }

}
