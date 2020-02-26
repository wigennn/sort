package com.wigen;

import org.apache.commons.lang3.StringUtils;

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
        Map<String, String> map = new HashMap<>();
        map.put("1", "2");
        System.out.println(map);

        String s = " ";
        boolean b = StringUtils.isNotEmpty(s);
        boolean a = StringUtils.isNotBlank(s);

        System.out.println(s.length());
    }
}
