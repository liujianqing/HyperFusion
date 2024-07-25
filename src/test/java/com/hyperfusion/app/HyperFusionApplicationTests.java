package com.hyperfusion.app;


import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@Slf4j
class HyperFusionApplicationTests {

    @Test
    void contextLoads() {
        log.info("contextLoads");
    }

    @Autowired
    private RestTemplate restTemplate;

    @Test
    void testRestTemplate() {
        String url = "https://jsonplaceholder.typicode.com/posts/1";
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        log.info("Response: {}", response);
        if (response.getStatusCode() == HttpStatus.OK) {
            log.info("ResponseBody: {}", response.getBody());
        }
    }

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    void testStoreJsonInRedis() {
        // 创建一个 JSON 对象
        Map<String, Object> jsonObject = new HashMap<>();
        jsonObject.put("id", 1);
        jsonObject.put("name", "John Doe");
        jsonObject.put("email", "john.doe@example.com");

        // 序列化对象为 JSON 字符串
        String jsonString = JSON.toJSONString(jsonObject);

        // 存储 JSON 字符串到 Redis
        String key = "user:1";
        redisTemplate.opsForValue().set(key, jsonString, 60, java.util.concurrent.TimeUnit.SECONDS);

        // 从 Redis 中获取 JSON 字符串
        String retrievedJsonString = (String) redisTemplate.opsForValue().get(key);

        // 反序列化 JSON 字符串为对象
        Map<String, Object> retrievedJsonObject = JSONObject.parseObject(retrievedJsonString);

        // 打印结果
        log.info("Retrieved value: {}", retrievedJsonObject);
    }

}
