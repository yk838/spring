package com.yk.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @author yk
 * @date 2021/6/24  0:30
 */
//工具类
public class JsonUtils {
    public static String getJson(Object object) throws JsonProcessingException {
        return getJson(object, "yyyy-MM-dd HH:mm:ss");
    }

    private static String getJson(Object object, String dataFormat) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //不使用时间差的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //自定义日期格式对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        //指定日期格式
        mapper.setDateFormat(simpleDateFormat);
        try {
            //将我们的对象解析成为json格式
            return mapper.writeValueAsString(object);
        }catch (JsonMappingException e){
            e.printStackTrace();
        }
        return null;
    }
}