package com.example.springbootwebsocketdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author xiuchen lang 22920192204222
 * @date 2022/05/17 20:53
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    Integer age;
    String name;
    String city;
    String univisity;
    Boolean flag;
    List<Integer> list;
    Set<String> set;
    Map<String, Boolean> map;
}
