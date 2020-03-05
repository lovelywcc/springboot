package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author wangcc
 * @create 2020-01-02 10:42
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sb")
public class SbDomain {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;

    @Column(name = "lx_id")
    private int lxId;

    @Column(name = "sb_name")
    private String sbName;

    @Column(name = "qy_id")
    private int qyId;

    @Column(name = "sb_id")
    private int sbId;
}
