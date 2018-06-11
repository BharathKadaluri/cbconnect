package com.tesco.eos.kafka;

import com.couchbase.client.core.message.dcp.MutationMessage;
import com.couchbase.kafka.DCPEvent;
import com.couchbase.kafka.coder.AbstractEncoder;
import kafka.utils.VerifiableProperties;
import org.jboss.netty.util.CharsetUtil;

public class KafkaEncoder extends AbstractEncoder {

    public KafkaEncoder(final VerifiableProperties properties) {
        super(properties);
    }
    @Override
    public byte[] toBytes(DCPEvent dcpEvent) {
        MutationMessage mutationMessage = (MutationMessage) dcpEvent.message();
        return mutationMessage.content().toString(CharsetUtil.UTF_8).getBytes();
    }
}
