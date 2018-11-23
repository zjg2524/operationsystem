package com.flnet.operationsystem.common.es.jpa;

import com.flnet.operationsystem.common.es.entity.PhonePojo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @description:
 * @author: zhangjingui
 * @create: 2018-11-22 08:49
 **/
//@NoRepositoryBean
public interface PhoneRepository extends ElasticsearchRepository<PhonePojo,String>{
}