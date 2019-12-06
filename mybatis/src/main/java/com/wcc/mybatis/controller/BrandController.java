package com.wcc.mybatis.controller;

import com.wcc.mybatis.dao.UserDao;
import com.wcc.mybatis.domain.TbBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangcc
 * @create 2019-12-04 17:51
 **/
@RestController
@RequestMapping("wcc")
public class BrandController {

    @Autowired
    private UserDao userDao;

    @GetMapping ("brand")
    public List<TbBrand> findAll(){
        List<TbBrand> tbBrands = userDao.findAll();
        return tbBrands;
    }
    @GetMapping (value = "brandOne")
    public TbBrand findBrandByName(@RequestParam("brandName") String name){
        TbBrand brand = userDao.queryBrandByName(name);
        return brand;
    }
}

