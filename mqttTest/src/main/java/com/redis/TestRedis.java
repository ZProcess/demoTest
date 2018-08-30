package com.redis;

import redis.clients.jedis.Jedis;

public class TestRedis {
    public static void main(String[] args) {
        Jedis redis=new Jedis("192.168.30.129",6379);
        System.out.println(redis.ping());
        System.out.println("redis 连接成功");
        redis.set("hello","zjc");
        String result=redis.get("hello");
        System.out.println(result);

    }
}
