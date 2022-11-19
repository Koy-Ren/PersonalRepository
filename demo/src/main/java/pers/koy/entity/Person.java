package pers.koy.entity;

import lombok.Data;

@Data
public class Person {

    private Integer id;

    private String name;

    private String alias;

    private String createTime;

    private String backup;
}
