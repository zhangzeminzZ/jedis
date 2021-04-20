package com.zhangzemin;

import redis.clients.jedis.Jedis;

/**
 * jedis主从复制
 */
public class TestMS {
    public static void main(String[] args) {
        Jedis jedis_M = new Jedis("121.40.250.195",6379);
        Jedis jedis_S = new Jedis("121.40.250.195",6380);
        jedis_S.slaveof("121.40.250.195",6379);
        jedis_M.set("class","1122");
        String result = jedis_S.get("class");
        System.out.println(result);
    }
}
