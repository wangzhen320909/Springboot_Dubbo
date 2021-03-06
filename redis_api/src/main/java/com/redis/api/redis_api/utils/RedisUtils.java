//package com.redis.api.redis_api.utils;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.ZSetOperations.TypedTuple;
//import org.springframework.stereotype.Component;
//import org.springframework.util.CollectionUtils;
//
//import java.util.concurrent.TimeUnit;
//
//@Component
//class RedisUtil {
//    @Autowired
//    private RedisTemplate<String, Object> redisTemplate;
//
//    /**
//     * 指定缓存失效时间
//     * @param key 键
//     * @param time 时间(秒)
//     * @return
//     */
//    public boolean expire(String key, long time) {
//        try {
//            if (time > 0) {
//                redisTemplate.expire(key, time, TimeUnit.SECONDS);
//            }
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//    /**
//     * 根据key 获取过期时间
//     * @param key 键 不能为null
//     * @return 时间(秒) 返回0代表为永久有效
//     */
//    public long getExpire(String key) {
//        return redisTemplate.getExpire(key, TimeUnit.SECONDS);
//    }
//    /**
//     * 判断key是否存在
//     * @param key 键
//     * @return true 存在 false不存在
//     */
//    public boolean hasKey(String key) {
//        try {
//            return redisTemplate.hasKey(key);
//        } catch (Exception e) {
//            return false;
//        }
//    }
//
//}
