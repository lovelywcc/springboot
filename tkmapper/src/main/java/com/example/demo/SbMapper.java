package com.example.demo;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author wangcc
 * @create 2020-01-02 10:54
 **/
@Repository
public interface SbMapper extends Mapper<SbDomain>,MySqlMapper<SbDomain> {

}
