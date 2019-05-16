package com.wy.json;

import java.util.Date;

public class MonitorResultModel {
    private int id;// 布控结果信息主键

    private int monitorInfoId;// 对应布控信息主键

    private String vhcUrl;// 图片地址

    private String carNumber;// 车牌号码

    private String carBrand;// 车辆品牌

    private String carModel;// 车辆型号

    private String carYear;// 车辆年款

    private String carSeries;// 车辆系列

    private String carSpeed;// 车速

    private String currentDate1;// 拍摄日期

    private String currentAddress;// 拍摄地点

    private String carBrandColor;// 车牌底色

    private String carColor;// 车身颜色

    private String carCharacteristic;// 车辆特征

    private String carType;// 车辆类别

    private String rate;// 匹配度

    private String plateType;// 车牌类别

    private String uuid;// UUID
    
    private Date passTime;
    
    private String alarmTime;
    
    private String carPosition;
    
    private String vendorPlateNo; //原（海康）车牌


    private String vhcKey;
    private boolean newflag;
    private String latitude;
    private String longitude;

    @Override
    public String toString() {
        return "MonitorResultModel{" +
                "id=" + id +
                ", monitorInfoId=" + monitorInfoId +
                ", vhcUrl='" + vhcUrl + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carYear='" + carYear + '\'' +
                ", carSeries='" + carSeries + '\'' +
                ", carSpeed='" + carSpeed + '\'' +
                ", currentDate1='" + currentDate1 + '\'' +
                ", currentAddress='" + currentAddress + '\'' +
                ", carBrandColor='" + carBrandColor + '\'' +
                ", carColor='" + carColor + '\'' +
                ", carCharacteristic='" + carCharacteristic + '\'' +
                ", carType='" + carType + '\'' +
                ", rate='" + rate + '\'' +
                ", plateType='" + plateType + '\'' +
                ", uuid='" + uuid + '\'' +
                ", passTime=" + passTime +
                ", alarmTime='" + alarmTime + '\'' +
                ", carPosition='" + carPosition + '\'' +
                ", vendorPlateNo='" + vendorPlateNo + '\'' +
                ", vhcKey='" + vhcKey + '\'' +
                ", newflag=" + newflag +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonitorInfoId() {
        return monitorInfoId;
    }

    public void setMonitorInfoId(int monitorInfoId) {
        this.monitorInfoId = monitorInfoId;
    }

    public String getVhcUrl() {
        return vhcUrl;
    }

    public void setVhcUrl(String vhcUrl) {
        this.vhcUrl = vhcUrl;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public String getCarSeries() {
        return carSeries;
    }

    public void setCarSeries(String carSeries) {
        this.carSeries = carSeries;
    }

    public String getCarSpeed() {
        return carSpeed;
    }

    public void setCarSpeed(String carSpeed) {
        this.carSpeed = carSpeed;
    }

    public String getCurrentDate1() {
        return currentDate1;
    }

    public void setCurrentDate1(String currentDate1) {
        this.currentDate1 = currentDate1;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getCarBrandColor() {
        return carBrandColor;
    }

    public void setCarBrandColor(String carBrandColor) {
        this.carBrandColor = carBrandColor;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarCharacteristic() {
        return carCharacteristic;
    }

    public void setCarCharacteristic(String carCharacteristic) {
        this.carCharacteristic = carCharacteristic;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getPlateType() {
        return plateType;
    }

    public void setPlateType(String plateType) {
        this.plateType = plateType;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getPassTime() {
        return passTime;
    }

    public void setPassTime(Date passTime) {
        this.passTime = passTime;
    }

    public String getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(String alarmTime) {
        this.alarmTime = alarmTime;
    }

    public String getCarPosition() {
        return carPosition;
    }

    public void setCarPosition(String carPosition) {
        this.carPosition = carPosition;
    }

    public String getVendorPlateNo() {
        return vendorPlateNo;
    }

    public void setVendorPlateNo(String vendorPlateNo) {
        this.vendorPlateNo = vendorPlateNo;
    }

    public String getVhcKey() {
        return vhcKey;
    }

    public void setVhcKey(String vhcKey) {
        this.vhcKey = vhcKey;
    }

    public boolean isNewflag() {
        return newflag;
    }

    public void setNewflag(boolean newflag) {
        this.newflag = newflag;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
