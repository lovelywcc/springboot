package com.wcc.mybatis.dao;

import com.wcc.mybatis.domain.TbBrand;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author wangcc
 * @create 2019-12-04 17:35
 **/

public interface UserDao {
    @Select("select * from tb_brand")
    List<TbBrand> findAll();

    TbBrand queryBrandByName(String name);
}
