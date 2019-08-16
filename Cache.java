package com.icebartech.core.netty;

import io.netty.channel.ChannelId;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Created by liuao on 2019/8/16.
 * @desc
 */
public class Cache {

    private static Map<Long, ChannelId> cache = new HashMap<>();
    public static Long UserId = 1L;

    public static void addCache(Long id, ChannelId channelId){
        cache.put(id,channelId);
    }

    public static ChannelId getCache(Long id){
        return cache.get(id);
    }

    public static void removeCache(Long id){
        cache.remove(id);
    }

}
