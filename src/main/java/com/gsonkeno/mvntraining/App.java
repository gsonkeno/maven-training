package com.gsonkeno.mvntraining;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        map.put("name","zhangwei");
        map.put("age",20);
        System.out.println(gson.toJson(map));
    }
}
