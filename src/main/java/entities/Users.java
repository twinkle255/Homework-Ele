package entities;

import lombok.Data;

//用户类
@Data
public class Users {
    private Long id;//用户ID
    private String name;//用户姓名
    private String phoneNumber;//用户联系方式
    private String address;//家庭住址
}
