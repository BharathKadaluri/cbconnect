package com.tesco.eos.controllers;

import com.tesco.eos.models.Response;
import com.tesco.eos.services.KafkaConnector;
import com.tesco.eos.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;

@RestController
@Path("/connector")
public class KafkaCbController {

    @Autowired
    private KafkaConnector kafkaConnector;

    /**
     * Start the connector
     * @return
     */
    @RequestMapping(path = "/start")
    public Response startConnector(){
        kafkaConnector.startConnector();
        return new Response(Constants.SUCCESS);
    }
}
