package entities;

import lombok.Data;

@Data
public class indentItem {
    private Long id;//菜品ID
    private String name;//菜品名字
    private Float price;//菜品价格
    private String description;//菜品描述
}