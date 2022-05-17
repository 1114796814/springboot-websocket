package com.example.springbootwebsocketdemo;
import com.alibaba.fastjson.JSONObject;

import com.alibaba.fastjson.JSON;
import com.example.springbootwebsocketdemo.bean.Person;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//@SpringBootTest
class SpringbootWebsocketDemoApplicationTests {

    @Test
    void contextLoads() {
        Person person = new Person();
        person.setAge(0);
        person.setName("123");
        person.setCity("12312");
        person.setUnivisity("12312");
        person.setFlag(false);
        person.setList(Lists.newArrayList(1,2,3,4));
        HashSet<String> stringHashSet = new HashSet<String>();
        stringHashSet.add("sada");
        stringHashSet.add("sada");
        stringHashSet.add("sada");
        stringHashSet.add("sada");
        person.setSet(stringHashSet);
        Map<String, Boolean> stringIntegerMap = new HashMap<String, Boolean>();
        stringIntegerMap.put("415",true);
        stringIntegerMap.put("4",false);



        person.setMap(stringIntegerMap);

        Object o =JSON.toJSON(person);
        System.out.println(o);
        JSONObject jsonObject = JSON.parseObject(o.toString());
        Person person1 = (Person) JSON.toJavaObject(jsonObject,Person.class);

        System.out.println(person1);
    }

}
