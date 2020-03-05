package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wangcc
 * @create 2020-01-02 11:35
 **/
@RestController
@RequestMapping("wcc")
public class SbController {

    @Autowired
    private SbMapper sbMapper;

    @RequestMapping("hello")
    private String hello(){
        List<SbDomain> sbDomains = sbMapper.selectAll();
        for (int i = 0; i < sbDomains.size(); i++) {
            SbDomain sbOne = sbDomains.get(i);
            SbDomain sbTwo = null;
            System.out.println(123);
            if (i<(sbDomains.size()-1)){
                sbTwo = sbDomains.get(i+1);
                if (sbOne.getSbId()==sbTwo.getSbId()&&((sbOne.getId()-sbTwo.getId())>1)){
                    System.out.println(sbOne);
                }
            }
        }
        return sbDomains.get(0).getSbName();
    }
}
