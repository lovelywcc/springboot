package com.wcc.easypoi.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author wangcc
 * @create 2020-03-05 19:06
 **/
@Data
@NoArgsConstructor //此处注意必须要有空构造函数，否则会报错“对象创建错误”
@AllArgsConstructor
public class Goods {

    //未添加@Excel注解，不解析
    private String id;

    //商品编号，主键（Integer类型的取值）
    @Excel(name = "NO",width = 20)
    private Integer no;
    //商品名称（String类型的取值）
    @Excel(name = "商品名称",width = 20)
    private String name;
    //1 食品 2 服装 3 酒水 4 花卉
    //商品所属类别（Integer类型的取值，对应的数值要转成相应的文字）
    @Excel(name = "商品类别",width = 20)
    private Integer type;
    //商品保质器（测试日期值得获取）
    @Excel(name = "保质期",width = 20,exportFormat = "yyyy-MM-dd")
    private Date shelfLife;
    //库存是否还有?0 无 1有(测试Integer类型的三目运算)
    @Excel(name = "库存是否还有",width = 20)
    private Integer isHave;

    //该商品是否经过了审核"0" 未过，"1" 通过(测试String类型的三目运算)
    //未添加@Excel注解，不解析
    private String  isAudit;

    public Goods(Integer no, String name, Integer type, Date shelfLife, Integer isHave, String isAudit) {
        this.no = no;
        this.name = name;
        this.type = type;
        this.shelfLife = shelfLife;
        this.isHave = isHave;
        this.isAudit = isAudit;
    }
}
