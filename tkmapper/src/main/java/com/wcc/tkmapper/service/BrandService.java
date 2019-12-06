package com.wcc.tkmapper.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wcc.mybatis.domain.TbBrand;
import com.wcc.tkmapper.dao.TbBrandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangcc
 * @create 2019-12-04 19:33
 **/
@Service
public class BrandService {

    @Autowired
    private TbBrandDao brandDao;
    public PageInfo<TbBrand> findAll() {
        PageHelper.startPage(1,3);
        List<TbBrand> brands = brandDao.selectAll();
        PageInfo pageInfo = new PageInfo(brands);
        return pageInfo;
    }
}
