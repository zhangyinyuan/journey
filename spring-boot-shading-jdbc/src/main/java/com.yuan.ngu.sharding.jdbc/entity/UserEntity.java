package com.yuan.ngu.sharding.jdbc.entity;

import lombok.Setter;

import java.io.Serializable;

@Setter
public class UserEntity  implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private Long order_id;
    private Long user_id;
    private String userName;
    private String passWord;
    private UserSexEnum userSex;
    private String nickName;
}
