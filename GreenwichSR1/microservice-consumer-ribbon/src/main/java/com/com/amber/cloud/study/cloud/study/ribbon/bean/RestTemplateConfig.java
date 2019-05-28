package com.com.amber.cloud.study.cloud.study.ribbon.bean;


import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    /**
     * 设置Ribbon策略，不配置则默认使用轮询策略
     * @return
     */
//    @Bean
//    public IRule ribbonRule() {
//        return new RandomRule(); //随机
//        return new RoundRobinRule(); //轮询
//        return new BestAvailableRule(); //用来选取最少并发量请求的服务器
//        return new WeightedResponseTimeRule(); //对RoundRobinRule的扩展，增加了根据实例的运行情况来计算权重，并根据权重来挑选实例，以达到更优的分配效果
//    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
