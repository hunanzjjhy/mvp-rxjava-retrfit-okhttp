package com.huyong.entity;

/**
 * Created by Administrator on 2016/11/9.
 */
public class TestBean {

    /**
     * status : 200
     * token : 66ab29f3c00435c5fdeff4607173b8f2
     */

    private ResultBean result;
    /**
     * id : 134
     * addTime : 2015-11-06 11:26:00
     * username : 15012710280
     * imUsername : 11446780360437
     * registWay : 0
     * header : /upload/doctor/header/1451457153617.jpg
     * fullname : 黄仁黔
     * fullPinyin : huangrenqian
     * simplePinyin : hrq
     * sex : 1
     * birthYear : 1971
     * province : 6
     * city : 77
     * district : 707
     * hospitalId : 2
     * departmentId : 4
     * doctorTitleId : 5
     * goodAtProgram : 我的
     * goodAt : 152,153,
     * background : 我
     * achievement : 我
     * qrCode : /qrcode/1/1451457153896.png
     * recommendValue : 0.0
     * tuwenSwitch : true
     * tuwenPrice : 0.01
     * telSwitch : false
     * telPrice : 0.01
     * followSwitch : true
     * followPrice : 0.01
     * menzhenSwitch : false
     * menzhenPrice : 0.01
     * tuwenTimeType : 0
     * telTimeType : 0
     * followTimeType : 0
     * menzhenTimeType : 0
     * verified : 1
     * recommended : true
     */

    private DataBean data;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ResultBean {
        private int status;
        private String token;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }

    public static class DataBean {
        private int id;
        private String addTime;
        private String username;
        private String imUsername;
        private int registWay;
        private String header;
        private String fullname;
        private String fullPinyin;
        private String simplePinyin;
        private int sex;
        private int birthYear;
        private int province;
        private int city;
        private int district;
        private int hospitalId;
        private int departmentId;
        private int doctorTitleId;
        private String goodAtProgram;
        private String goodAt;
        private String background;
        private String achievement;
        private String qrCode;
        private double recommendValue;
        private boolean tuwenSwitch;
        private double tuwenPrice;
        private boolean telSwitch;
        private double telPrice;
        private boolean followSwitch;
        private double followPrice;
        private boolean menzhenSwitch;
        private double menzhenPrice;
        private int tuwenTimeType;
        private int telTimeType;
        private int followTimeType;
        private int menzhenTimeType;
        private int verified;
        private boolean recommended;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getAddTime() {
            return addTime;
        }

        public void setAddTime(String addTime) {
            this.addTime = addTime;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getImUsername() {
            return imUsername;
        }

        public void setImUsername(String imUsername) {
            this.imUsername = imUsername;
        }

        public int getRegistWay() {
            return registWay;
        }

        public void setRegistWay(int registWay) {
            this.registWay = registWay;
        }

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public String getFullPinyin() {
            return fullPinyin;
        }

        public void setFullPinyin(String fullPinyin) {
            this.fullPinyin = fullPinyin;
        }

        public String getSimplePinyin() {
            return simplePinyin;
        }

        public void setSimplePinyin(String simplePinyin) {
            this.simplePinyin = simplePinyin;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getBirthYear() {
            return birthYear;
        }

        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
        }

        public int getProvince() {
            return province;
        }

        public void setProvince(int province) {
            this.province = province;
        }

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public int getDistrict() {
            return district;
        }

        public void setDistrict(int district) {
            this.district = district;
        }

        public int getHospitalId() {
            return hospitalId;
        }

        public void setHospitalId(int hospitalId) {
            this.hospitalId = hospitalId;
        }

        public int getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(int departmentId) {
            this.departmentId = departmentId;
        }

        public int getDoctorTitleId() {
            return doctorTitleId;
        }

        public void setDoctorTitleId(int doctorTitleId) {
            this.doctorTitleId = doctorTitleId;
        }

        public String getGoodAtProgram() {
            return goodAtProgram;
        }

        public void setGoodAtProgram(String goodAtProgram) {
            this.goodAtProgram = goodAtProgram;
        }

        public String getGoodAt() {
            return goodAt;
        }

        public void setGoodAt(String goodAt) {
            this.goodAt = goodAt;
        }

        public String getBackground() {
            return background;
        }

        public void setBackground(String background) {
            this.background = background;
        }

        public String getAchievement() {
            return achievement;
        }

        public void setAchievement(String achievement) {
            this.achievement = achievement;
        }

        public String getQrCode() {
            return qrCode;
        }

        public void setQrCode(String qrCode) {
            this.qrCode = qrCode;
        }

        public double getRecommendValue() {
            return recommendValue;
        }

        public void setRecommendValue(double recommendValue) {
            this.recommendValue = recommendValue;
        }

        public boolean isTuwenSwitch() {
            return tuwenSwitch;
        }

        public void setTuwenSwitch(boolean tuwenSwitch) {
            this.tuwenSwitch = tuwenSwitch;
        }

        public double getTuwenPrice() {
            return tuwenPrice;
        }

        public void setTuwenPrice(double tuwenPrice) {
            this.tuwenPrice = tuwenPrice;
        }

        public boolean isTelSwitch() {
            return telSwitch;
        }

        public void setTelSwitch(boolean telSwitch) {
            this.telSwitch = telSwitch;
        }

        public double getTelPrice() {
            return telPrice;
        }

        public void setTelPrice(double telPrice) {
            this.telPrice = telPrice;
        }

        public boolean isFollowSwitch() {
            return followSwitch;
        }

        public void setFollowSwitch(boolean followSwitch) {
            this.followSwitch = followSwitch;
        }

        public double getFollowPrice() {
            return followPrice;
        }

        public void setFollowPrice(double followPrice) {
            this.followPrice = followPrice;
        }

        public boolean isMenzhenSwitch() {
            return menzhenSwitch;
        }

        public void setMenzhenSwitch(boolean menzhenSwitch) {
            this.menzhenSwitch = menzhenSwitch;
        }

        public double getMenzhenPrice() {
            return menzhenPrice;
        }

        public void setMenzhenPrice(double menzhenPrice) {
            this.menzhenPrice = menzhenPrice;
        }

        public int getTuwenTimeType() {
            return tuwenTimeType;
        }

        public void setTuwenTimeType(int tuwenTimeType) {
            this.tuwenTimeType = tuwenTimeType;
        }

        public int getTelTimeType() {
            return telTimeType;
        }

        public void setTelTimeType(int telTimeType) {
            this.telTimeType = telTimeType;
        }

        public int getFollowTimeType() {
            return followTimeType;
        }

        public void setFollowTimeType(int followTimeType) {
            this.followTimeType = followTimeType;
        }

        public int getMenzhenTimeType() {
            return menzhenTimeType;
        }

        public void setMenzhenTimeType(int menzhenTimeType) {
            this.menzhenTimeType = menzhenTimeType;
        }

        public int getVerified() {
            return verified;
        }

        public void setVerified(int verified) {
            this.verified = verified;
        }

        public boolean isRecommended() {
            return recommended;
        }

        public void setRecommended(boolean recommended) {
            this.recommended = recommended;
        }
    }
}

