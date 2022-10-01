package com.shrcb.servlet.entity;

import lombok.Data;

/**
 * @author GanSumin
 */

@Data
public class User {

    /**
     * id 主键
     */
    private Integer id;
    /**
     * 用户名称
     */
    private String name;

    /**
     * 年龄
     */

    private Integer age;

}
