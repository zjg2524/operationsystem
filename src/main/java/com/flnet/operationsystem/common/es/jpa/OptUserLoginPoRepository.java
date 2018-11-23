package com.flnet.operationsystem.common.es.jpa;

import com.flnet.operationsystem.common.es.entity.OptUserLoginPo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @description:
 * @author: zhangjingui
 * @create: 2018-11-22 08:09
 **/
//@NoRepositoryBean
public interface OptUserLoginPoRepository  extends ElasticsearchRepository<OptUserLoginPo,String>{
}