package com.wy.json;

import com.google.gson.Gson;

/**
 * @program: PersonalStudy
 * @description:
 * @author: Wuyong
 * @create: 2019-05-15 14:29
 **/
public class TestGson {
    private static final Gson gson = new Gson();
    public static void main(String[] args) {
        MonitorResultModel monitorResultModel = new MonitorResultModel();
        monitorResultModel.setMonitorInfoId(224);
        monitorResultModel.setCarNumber("渝A12345");
        monitorResultModel.setCurrentDate1("2019年5月15日 00:00:00");
        monitorResultModel.setCurrentAddress("50010819051320012005-1");
        monitorResultModel.setVhcUrl("test");
        monitorResultModel.setAlarmTime("2019年5月15日 22:00:00");
        monitorResultModel.setVendorPlateNo("鲁B88888");
        String json = gson.toJson(monitorResultModel);
        System.out.println(json);
    }
}
