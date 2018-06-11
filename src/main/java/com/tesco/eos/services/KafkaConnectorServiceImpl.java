package com.tesco.eos.services;

import com.couchbase.kafka.CouchbaseKafkaConnector;
import com.couchbase.kafka.state.ConnectorState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class KafkaConnectorServiceImpl implements KafkaConnector{

    @Autowired
    private CouchbaseKafkaConnector connector;

    @Override
    @Async("processExecutor")
    public void startConnector() {
        connector.run();

    }

    @Override
    public void stopConnector() {
        //stop and persist the state
        //TODO: stop and persis the partition state
    }

    @Override
    public void resumeConnector() {
        //TODO: Resume from the existing Connector state
    }


    @Override
    public ConnectorState getCurrentState() {
        //TODO: Get the current state
        return null;
    }

}
