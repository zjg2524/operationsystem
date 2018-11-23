package com.flnet.operationsystem;


import com.flnet.operationsystem.common.es.entity.OptUserLoginPo;
import com.flnet.operationsystem.common.es.entity.PhonePojo;
import com.flnet.operationsystem.common.es.jpa.OptUserLoginPoRepository;
import org.elasticsearch.index.query.MatchAllQueryBuilder;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.search.sort.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperationsystemApplicationTests {

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    OptUserLoginPoRepository optUserLoginPoRepository;

    @Test
    public void test01()
    {
//        Iterable<OptUserLoginPo> all = optUserLoginPoRepository.findAll();
//        for (OptUserLoginPo optUserLoginPo : all) {
//            System.out.println(optUserLoginPo
//            );
//        }


        OptUserLoginPo bean = getBean();
        OptUserLoginPo save = optUserLoginPoRepository.save(bean);
        System.out.println(save);
    }
    @Test
    public void test02()
    {
        FieldSortBuilder sort = SortBuilders.fieldSort("date").order(SortOrder.DESC);
        SearchQuery query = new NativeSearchQueryBuilder().withQuery(new MatchAllQueryBuilder()).withSort(sort).build();
        List<OptUserLoginPo> pos = elasticsearchTemplate.queryForList(query, OptUserLoginPo.class);
        for (OptUserLoginPo po : pos) {

            System.out.println(po);
        }

    }
    @Test
    public void contextLoads(int i) {

        OptUserLoginPo optUserLoginPo = new OptUserLoginPo();
        optUserLoginPo.setDate(new Date());
        optUserLoginPo.setUsername("qaz123"+i);
        optUserLoginPo.setPosition("huizhou"+i);
        optUserLoginPo.setIp("192.168.0.1"+i);
        MatchQueryBuilder matchQueryBuilder = new MatchQueryBuilder("username", "root");
        NativeSearchQuery build = new NativeSearchQueryBuilder().withQuery(new MatchAllQueryBuilder()).build();
        List<? extends OptUserLoginPo> optUserLoginPos = elasticsearchTemplate.queryForList(build, optUserLoginPo.getClass());
        System.out.println(optUserLoginPos);


    }

    /*@Test
    public void queryInfo()
    {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchQuery("username","root"));
        Search search = new Search.Builder(searchSourceBuilder.toString()).addIndex(OptUserLoginPo.INDEX_NAME).addType(OptUserLoginPo.TYPE).build();
        try {
            SearchResult result = jestClient.execute(search);
            System.out.println(result.getJsonObject());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
/*
    @Test
    public void jpaTest()
    {
        OptUserLoginPo optUserLoginPo = new OptUserLoginPo();
        optUserLoginPo.setDate(new Date());
        optUserLoginPo.setUserName("qaz123");
        optUserLoginPo.setPosition("huizhou");
        optUserLoginPo.setIp("192.168.0.1");
        testRepository.save(optUserLoginPo);
    }*/


public OptUserLoginPo getBean()
{
    OptUserLoginPo optUserLoginPo = new OptUserLoginPo();
    optUserLoginPo.setDate(new Date());
    optUserLoginPo.setUsername("qaz123");
    optUserLoginPo.setPosition("huizhou");
    optUserLoginPo.setIp("192.168.0.1");

    return optUserLoginPo;
}


public PhonePojo getPhonePojo()
{
    PhonePojo phonePojo = new PhonePojo();
    phonePojo.setDesc("nb phone");
    phonePojo.setName("nb");
    phonePojo.setPrice(998);
    return phonePojo;
}
}
