package com.mqttPub;


import com.mqttCall.MqttCall;
import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class MqttPub {
    // tcp://MQTT安装的服务器地址:MQTT定义的端口号
    public static final String HOST = "tcp://47.93.19.134:1883";
    // 定义一个主题
    public static final String TOPIC = "root/topic/123";
    // 定义MQTT的ID，可以在MQTT服务配置中指定
    private static final String clientid = "server11";
    private MqttClient client;
    private MqttTopic topic11;
    private String userName = "root";
    private String passWord = "root";

    private MqttMessage message;

    public MqttPub() throws MqttException {
        // MemoryPersistence设置clientid的保存形式，默认为以内存保存
        client = new MqttClient(HOST, clientid, new MemoryPersistence());
        connect();
    }

    /**
     * 44      * 用来连接服务器
     * 45
     */
    private void connect() {
        MqttConnectOptions options = new MqttConnectOptions();
        options.setCleanSession(false);
        options.setPassword(passWord.toCharArray());
        // 设置超时时间
        options.setConnectionTimeout(10);
        // 设置会话心跳时间
        options.setKeepAliveInterval(20);
        try {
            client.setCallback(new MqttCall());
            client.connect(options);

            topic11 = client.getTopic(TOPIC);
        } catch (Exception e) {
        }
    }

    /**
     * 66      *
     * 67      * @param topic
     * 68      * @param message
     * 69      * @throws MqttPersistenceException
     * 70      * @throws MqttException
     * 71
     */
    public void publish(MqttTopic topic, MqttMessage message) throws MqttPersistenceException, MqttException {
        MqttDeliveryToken token = topic.publish(message);
        token.waitForCompletion();
        System.out.println("message is published completely! " + token.isComplete());
    }

    /**
     * 79      * 启动入口
     * 80      *
     * 81      * @param args
     * 82      * @throws MqttException
     * 83
     */
    public static void main(String[] args) throws MqttException {
        MqttPub server = new MqttPub();
        server.message = new MqttMessage();
        server.message.setQos(1);
        server.message.setRetained(true);
        server.message.setPayload("hello,topic14".getBytes());
        server.publish(server.topic11, server.message);
        System.out.println(server.message.isRetained() + "------ratained状态");
    }

}
