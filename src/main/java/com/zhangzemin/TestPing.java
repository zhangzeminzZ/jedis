package com.zhangzemin;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * 测试jedis连通
 */
public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("121.40.250.195",6379);
        jedis.set("k1","v1");
        jedis.set("k2","v2");
        jedis.set("k3","v3");
        System.out.println(jedis.get("k1"));
        System.out.println(jedis.get("k2"));
        System.out.println(jedis.get("k3"));

        Set<String> keys = jedis.keys("*");
        System.out.println(keys.size());
    }
}
