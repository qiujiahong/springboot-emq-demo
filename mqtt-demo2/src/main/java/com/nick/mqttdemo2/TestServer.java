package com.nick.mqttdemo2;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestServer {
    public  void test(String data){
        log.info("call test function:{}",data);
    }
}
