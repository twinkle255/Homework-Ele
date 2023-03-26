package entities;

import lombok.Data;

//商家类
@Data
public class Merchants {
    private Long id;//商家编号
    private String name;//店铺名字
    private String address;//店铺地址
    private Indent IndentID;//外键，订单ID


}
