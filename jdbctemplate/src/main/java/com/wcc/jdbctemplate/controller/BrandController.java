package com.wcc.jdbctemplate.controller;

import com.wcc.jdbctemplate.model.TbBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.awt.*;
import java.util.List;

/**
 * @author wangcc
 * @create 2019-12-04 13:16
 **/
@RestController
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("selectBrand")
    public List<TbBrand> selectAllBrand(){
        String sql = "select * from tb_brand limit 2 ";
        System.out.println(jdbcTemplate);
        List<TbBrand> tbBrands = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<>(TbBrand.class));
        return tbBrands;
    }
}
