package com.wistron.wcd.study;


import net.sf.json.JSONObject;

public class HttpClientDemo {
    public static void main(String[] args) {
        String joStr = "{\"evt_ns\": \"wcd.cim.m2\",\"evt_tp\": \"mtct.smtcycletime.app\",\"evt_dt\": 1540437213000,\"evt_pid\": \"AUTO INSTALLER\"," +
                "\"evt_pubBy\": \"nifi\",\"evt_data\": {\"plant\": \"F721\",\"line\": \"AP3\",\"machineName\": \"AUTO INSTALLER\",\"stage\": \"1\",\"cycleTimeTransfer\": 10.19,\"stagecount\": 1,\"stageDetails\": null,\"dept\": \"DIP\"}}";
       // 将json字符串转化为JSONObject
        JSONObject jsonObject = JSONObject.fromObject(joStr);
        HttpClientUtil.httpPostWithJson(jsonObject,"http://10.62.240.22:11116/","wcd_study_201810251058");
//        String str = HttpClientUtil.doGet("http://10.62.240.22:11116/");
//        System.out.println(str);

    }
}
