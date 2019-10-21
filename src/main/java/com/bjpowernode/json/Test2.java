package com.bjpowernode.json;/**
 * ClassName:Test2
 * Package:com.bjpowernode.json
 * Description
 *
 * @date ：${Date}
 */

/**
 *Author：Rainyu
 *2019/10/17
 */

import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.internal.scripts.JO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 对象转json字符串
 */
public class Test2 {
    public static void main(String[] args) {
        Map<String,Object> map = new HashMap ();
        map.put ("name", "张三");
        map.put ("age", 12);
        String jsonStirng = JSONObject.toJSONString (map);
        System.out.println (jsonStirng);





    }
}
