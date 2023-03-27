package entities;

import lombok.Data;
//订单中的菜品
@Data
public class indentItem {
    private Long id;//菜品ID
    private String name;//菜品名字
    private Float initialPrice;//菜品原价
    private Float discount;//折扣
    private Float finalPrice;//最终价格
    private String description;//菜品描述
}