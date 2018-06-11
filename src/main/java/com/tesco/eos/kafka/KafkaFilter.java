package com.tesco.eos.kafka;
import com.couchbase.client.core.message.dcp.MutationMessage;
import com.couchbase.kafka.DCPEvent;
import com.couchbase.kafka.filter.Filter;

public class KafkaFilter implements Filter {
    @Override
    public boolean pass(DCPEvent dcpEvent) {
        return dcpEvent.message() instanceof MutationMessage;
    }
}
