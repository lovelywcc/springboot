package com.wcc.mybatis.domain;

import sun.awt.SunHints;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author wangcc
 * @create 2019-12-04 13:20
 **/
@Table(name="tb_brand")
public class TbBrand {
    @Id
    @GeneratedValue(generator="JDBC")
    private Long id;
    private String name;
    private String image;
    private String letter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
