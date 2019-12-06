package com.wcc.tkmapper.controller;

import com.github.pagehelper.PageInfo;
import com.wcc.mybatis.domain.TbBrand;
import com.wcc.tkmapper.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangcc
 * @create 2019-12-04 19:31
 **/
@RequestMapping("brand")
@RestController
public class TbBrandController {
   @Autowired
    private BrandService brandService;
   @GetMapping("all")
    public PageInfo<TbBrand> findAll(){
       PageInfo<TbBrand> pageInfo = brandService.findAll();
       return pageInfo;
   }
}
