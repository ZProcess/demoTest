package com.mqttCall;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MqttCall implements MqttCallback {

    public void connectionLost(Throwable throwable) {
        System.out.println("连接断开，可以做重连");
    }

    public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
        System.out.println("接收消息主题 : " + topic);
        System.out.println("接收消息Qos : " + mqttMessage.getQos());
        System.out.println("接收消息内容 : " + new String(mqttMessage.getPayload()));
    }

    public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        System.out.println("deliveryComplete222---------" + iMqttDeliveryToken.isComplete());
    }
}
