package entities;

import lombok.Data;

//商家类
@Data
public class Merchants {
    private Long id;//商家编号
    private String name;//店铺名字
    private String address;//店铺地址
    private String description;//店铺描述
    private String phoneNumber;//商家联系方式
    private Indent IndentID;//外键，订单ID
}
