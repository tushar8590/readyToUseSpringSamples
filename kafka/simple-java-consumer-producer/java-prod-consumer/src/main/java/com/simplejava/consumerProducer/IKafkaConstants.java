package com.simplejava.consumerProducer;

public interface IKafkaConstants {
	 public static String KAFKA_BROKERS = "localhost:9092"; // this could be the comma sep list of servers in a cluster
	    public static Integer MESSAGE_COUNT=1000; // total messages to be sent by producer, generally not needed for prod applications
	    public static String CLIENT_ID="client1";  // ID of producer
	    public static String TOPIC_NAME="demo";
	    public static String GROUP_ID_CONFIG="consumerGroup1";
	    public static Integer MAX_NO_MESSAGE_FOUND_COUNT=100;
	    public static String OFFSET_RESET_LATEST="latest";
	    public static String OFFSET_RESET_EARLIER="earliest";
	    public static Integer MAX_POLL_RECORDS=1;
}
