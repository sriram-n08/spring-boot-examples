package com.in28minutes.springboot.microservice.example.currencyconversion;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import org.springframework.cloud.netflix.ribbon.StaticServerList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//class LocalRibbonClientConfiguration {
//    @Bean
//    public ServerList<Server> ribbonServerList() {
//        // return new ConfigurationBasedServerList();
//        StaticServerList<Server> staticServerList = new StaticServerList<>((new Server("localhost", 8001)),
//                new Server("localhost", 8000));
//        return staticServerList;
//    }
//}