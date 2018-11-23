package com.flnet.operationsystem.common.es.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 记录运营系统登录日志实体
 * @author: zhangjingui
 * @create: 2018-11-21 10:26
 **/
@Data
@Document(indexName = "opt_sys_user_login",type = "type")
public class OptUserLoginPo implements Serializable {
//    @Transient
//    public static final String INDEX_NAME = "opt_sys_user_login";
//    @Transient
//    public static final String TYPE = "type";
    @Id
    private String id;
    private String username;
    private String position;
    private Date date;
    private String ip;
}

