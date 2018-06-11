package com.tesco.eos.services;

import com.couchbase.kafka.state.ConnectorState;

public interface KafkaConnector {
    /**
     * Start the connector from the current state
     */
    void startConnector();

    /**
     * Stop the connector as it is and persist the current state
     */
    void stopConnector();

    /**
     * Resume the connector from the existing state
     */
    void resumeConnector();

    /**
     * Get the existing state of the connector
     * @return
     */
    ConnectorState getCurrentState();
}
