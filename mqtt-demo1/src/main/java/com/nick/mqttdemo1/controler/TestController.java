package com.nick.mqttdemo1.controler;

import com.nick.mqttdemo1.server.MqttTestServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private MqttTestServer mqttTestServer;

    @GetMapping("/sendMq")
    public  String sendMqtt(String sendData){
        mqttTestServer.sendToMqtt(sendData, "hello");
        log.info("send success");
        return "send success";
    }


}
