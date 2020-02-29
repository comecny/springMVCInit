package com.mmall.common;


import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.awt.SunHints;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class TokenCache {

    private static Logger logger = LoggerFactory.getLogger(TokenCache.class);

    public static final String TOKEN_PREFIX = "token_";
    
    //LRU算法
    private static LoadingCache<String, String> localCache = 
            CacheBuilder
            .newBuilder()
            .initialCapacity(10000)
            .maximumSize(10000)
            .expireAfterAccess(12, TimeUnit.HOURS)
            .build(new CacheLoader<String, String>() {

                @Override
                public String load(String s) throws Exception {
                    return "null";
                }
            });

    public static void setKey(String key,String value){
        localCache.put(key,value);
    }
    
    public static String getKey(String key) throws ExecutionException {
        String value = null;
        value = localCache.get(key);
        if ("null".equals(value)){
            return null;
        }
        return value;
    }
}