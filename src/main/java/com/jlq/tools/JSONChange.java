package com.jlq.tools;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/22 23:48
 */

public class JSONChange {


    /**
     *  Json转换成对象
     * @param obj
     * @param jsonStr
     * @return Object
     */
    public static Object jsonToObj(Object obj,String jsonStr){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return  mapper.readValue(jsonStr,obj.getClass());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *  对象转Json
     * @param obj
     * @return json字符串
     */
    public static String objToJson(Object obj){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}


