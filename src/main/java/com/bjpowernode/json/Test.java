package com.bjpowernode.json;/**
 * ClassName:Test
 * Package:com.bjpowernode.json
 * Description
 *
 * @date ：${Date}
 */

import com.alibaba.fastjson.JSONObject;

/**
 * Author：Rainyu
 * 2019/10/17
 */

/**
 * json字符串转json对象
 */
public class Test {

    public static void main(String[] args) {
        String jsonString = "{\n" +
                "\t\"name\": \"你好\",\n" +
                "\t\"age\": \"13\"\n" +
                "}";
        JSONObject jsonObject = JSONObject.parseObject (jsonString);
        String jsonObjectString = jsonObject.getString ("name");
        System.out.println (jsonObjectString);
    }
}
