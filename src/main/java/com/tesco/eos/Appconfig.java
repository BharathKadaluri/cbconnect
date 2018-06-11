package com.tesco.eos;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class Appconfig {

    //Kafka, zooker config
    private String zooKeeperServers;
    private String kafkaTopic;

    // Couchbase sever configuration
    private String couchbaseServer;
    private String couchbaseBucket;
    private String couchbasePassword;


    public String getZooKeeperServers() {
        return zooKeeperServers;
    }

    public void setZooKeeperServers(String zooKeeperServers) {
        this.zooKeeperServers = zooKeeperServers;
    }

    public String getKafkaTopic() {
        return kafkaTopic;
    }

    public void setKafkaTopic(String kafkaTopic) {
        this.kafkaTopic = kafkaTopic;
    }

    public String getCouchbaseServer() {
        return couchbaseServer;
    }

    public void setCouchbaseServer(String couchbaseServer) {
        this.couchbaseServer = couchbaseServer;
    }

    public String getCouchbaseBucket() {
        return couchbaseBucket;
    }

    public void setCouchbaseBucket(String couchbaseBucket) {
        this.couchbaseBucket = couchbaseBucket;
    }

    public String getCouchbasePassword() {
        return couchbasePassword;
    }

    public void setCouchbasePassword(String couchbasePassword) {
        this.couchbasePassword = couchbasePassword;
    }
}
