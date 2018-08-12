package com.gsonkeno.mvntraining;

import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
   private static Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args ) throws IOException {
        Gson gson = new Gson();
        Map<String,Object> map = new HashMap<>();
        map.put("name","zhangwei");
        map.put("age",20);
        System.out.println(gson.toJson(map));

        logger.info(gson.toJson(map));

        String configPath = System.getProperty("spring.config.path");
        ApplicationContext ctx = new FileSystemXmlApplicationContext(configPath);
        UserService bean = ctx.getBean(UserService.class);
        bean.execute();

        String propertiesPath = System.getProperty("application.properties.path");
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File(propertiesPath)));
        Object user = properties.get("user");
        System.out.println(user);

    }
}
