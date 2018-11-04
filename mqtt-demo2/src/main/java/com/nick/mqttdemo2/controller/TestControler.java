package com.nick.mqttdemo2.controller;

import com.nick.mqttdemo2.send.MqttTestServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/mq")
public class TestControler {

    @Autowired
    MqttTestServer mqttTestServer ;

    @GetMapping("send")
    public String send(String sendData){
        mqttTestServer.sendToMqtt(sendData,"hello");
        log.info("send ->: {}",sendData);
        return "send success";
    }

}
