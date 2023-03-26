package entities;

import lombok.Data;

//订单类
@Data
public class Indent {
    private Long id;//订单ID
    private indentItem indentItemID;//外键，菜品ID
    private Users userID;//外键，下单用户ID
    private Merchants merchantsID;//外键，餐厅ID
    private Float allPrice;//菜品总价
}
