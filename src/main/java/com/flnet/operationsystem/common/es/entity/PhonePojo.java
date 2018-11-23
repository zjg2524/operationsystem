package com.flnet.operationsystem.common.es.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @description:
 * @author: zhangjingui
 * @create: 2018-11-22 08:47
 **/
@Data
@Document(indexName = "goods",type = "phone")
public class PhonePojo {

    private String id;
    private String name;
    private int price;
    private String desc;
}

