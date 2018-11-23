package com.flnet.operationsystem.entity;

import lombok.Data;

import javax.persistence.Table;
import java.util.Date;

/**
 * @description: 权限模块实体
 * @author: zhangjingui
 * @create: 2018-11-16 09:32
 **/
@Data
@Table(name = "sys_acl_module")
public class SysAclModule {

    // 权限模块id
    private Integer id;

    // 权限模块名称
    private String name;

    // 上级权限模块id
    private Integer parent_id;

    // 权限模块层级
    private Integer level;

    // 权限模块在当前层级下的顺序，由小到大
    private Integer seq;

    // 状态，1：正常，0：冻结
    private Integer status;

    // 备注
    private String remark;

    // 操作者
    private String operator;

    // 最后一次操作时间
    private Date operate_time;

    // 最后一次更新操作者的ip地址
    private String operate_ip;
}

