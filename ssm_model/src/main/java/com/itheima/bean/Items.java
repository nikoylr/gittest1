package com.itheima.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Items {

    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;
	//bug
}