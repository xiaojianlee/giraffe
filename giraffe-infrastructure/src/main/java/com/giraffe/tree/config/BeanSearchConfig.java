package com.giraffe.tree.config;

import cn.zhxu.bs.BeanSearcher;
import cn.zhxu.bs.MapSearcher;
import cn.zhxu.bs.Searcher;
import cn.zhxu.bs.SearcherBuilder;
import cn.zhxu.bs.implement.DefaultSqlExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/***
 * @description
 * @author lixiaojian-jk
 * @create 2023/7/31
 **/
@Configuration
public class BeanSearchConfig {


    @Bean
    public DefaultSqlExecutor defaultSqlExecutor(DataSource dataSource){
        DefaultSqlExecutor sqlExecutor = new DefaultSqlExecutor(dataSource);
        return sqlExecutor;
    }

    @Bean
    public MapSearcher mapSearcher(DefaultSqlExecutor defaultSqlExecutor) {
        // 使用默认数据源
// 构建 Map 检索器
        MapSearcher mapSearcher = SearcherBuilder.mapSearcher()
                .sqlExecutor(defaultSqlExecutor)
                .build();

        return mapSearcher;
    }

    @Bean
    public BeanSearcher beanSearcher(DefaultSqlExecutor defaultSqlExecutor){
        // 构建 Bean 检索器
        BeanSearcher beanSearcher = SearcherBuilder.beanSearcher()
                .sqlExecutor(defaultSqlExecutor)
                .build();
        return beanSearcher;
    }
}
