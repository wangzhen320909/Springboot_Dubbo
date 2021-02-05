package com.test.demowzg.wzg_test.controller;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("getTest")
    public String getTest(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "wzg");
        jsonObject.put("age", "14");
        return jsonObject.toString();
    }

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "wzg");
        jsonObject.put("age", "14");
        System.out.println(jsonObject);
        jsonObject.element("sex", "man");
        System.out.println(jsonObject);

        Map<String, String> map = new HashMap<>();
        map.put("name", "syx");
        map.put("age", "32");
        map.put("sex", "girl");
        JSONObject jsonObjectMap = JSONObject.fromObject(map);
        System.out.println("jsonObjectMap: "+ jsonObjectMap);
        String json = jsonObjectMap.toString();

        com.alibaba.fastjson.JSONObject jsonObjectAlibaba =
                (com.alibaba.fastjson.JSONObject)com.alibaba.fastjson.JSONObject.parse(json);

        System.out.println(jsonObjectAlibaba);

        String jsonString = "{\"id\":1, \"name\":\"lzj\", \"cars\":[\"audi\", \"baoma\", \"benci\"]}";
        JsonParser parser = new JsonParser();
        JsonElement jsonNode = parser.parse(jsonString);
        System.out.println(jsonNode);


        Map<String, Object> mapList = new HashMap<>();
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("name", "liuqing");
        dataMap.put("age", "14");
        dataMap.put("sex", "boy");
        mapList.put("body", dataMap);
        mapList.put("class", "3nian");
        mapList.put("address", "NewYUOR");
        String mapStr = com.alibaba.fastjson.JSONObject.toJSONString(mapList);
        System.out.println(mapStr);
        JSONObject  mapJSONOBJECT = JSONObject.fromObject(mapList);
        System.out.println("mapJSONOBJECT: " + mapJSONOBJECT);
        System.out.println("body: " + mapJSONOBJECT.getJSONObject("body"));
    }
}
