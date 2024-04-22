package com.example.util;

import cn.hutool.core.date.DateUtil;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @ClassName SignUtil
 * @Description 生成sign工具类
 * @Author 申延胜
 * @DATE 2024/4/19 9:35
 **/
public class SignUtil {
    private static final Logger logger = LoggerFactory.getLogger(SignUtil.class);
    /**
     * @Description: 传参排序
     * @Author: 申延胜
     * @param jsonObject
     * @return java.lang.String
     * @Date: 2024-04-19 09:36:57
     */
    public static String getSortedString(JSONObject jsonObject){
        SortedMap<String,Object> sortMap = new TreeMap<>();
        StringBuffer sbf = new StringBuffer();
        for (Map.Entry<String, Object> objectEntry : jsonObject.entrySet()) {
            String key = objectEntry.getKey();
            Object value = objectEntry.getValue();
            if ("sign".equals(key)){
                continue;
            }
            sortMap.put(key,value);
        }
        Set mapEntrySet = sortMap.entrySet();
        Iterator it = mapEntrySet.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry)it.next();
            String k = (String) entry.getKey();
            Object v = entry.getValue();
            sbf.append(k+"="+v+"&");
        }
        String  sbfString = sbf.toString();
        System.out.println("排序后的字符串："+sbfString.substring(0,sbfString.length()-1));
        return  sbfString.substring(0,sbfString.length()-1);
    }

    /**
     * @Description: 生成sign
     * @Author: 申延胜
     * @param data 参数字符串
     * @return java.lang.String
     * @Date: 2024-04-19 09:38:33
     */
    private static String sha256_HMAC(String data) {
        String sign = "";
        try {
            //调用md5加密
            String str = Md5Utils.encryptToMd5(data);
            //全部转成大写
            sign = str.toUpperCase();
        } catch (Exception e) {
            logger.error("生成签名错误：{}", e.getMessage(), e);
        }
        return sign;
    }

    public static void main(String[] args) {
        //当前时间时间戳
        long l = DateUtil.currentSeconds();

        String data = "{\n" +
                "    \"dt\": "+ l +",\n" +
                "    \"appid\": \"WXTX\",\n" +

                "}";
        JSONObject jsonObject = JSONObject.parseObject(data);
        //对参数进行排序
        String sortData = getSortedString(jsonObject);
        System.out.println(sortData);
        String sign = sha256_HMAC(sortData);
        System.out.println(sign);
    }

}
