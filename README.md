Rxjava+ReTrofit+okHttp+MVP

Rxjava+ReTrofit+okHttp网络请求框架很火就参考了一些大神的博客加上MVP框架思想写了这一版博客。可能有不合理的地方，敬请指正。

	1.Retrofit+Rxjava+okhttp基本使用方法
    2.统一处理请求数据格式
    3.回调Subscriber处理
    4.返回数据的统一判断
    5.弱引用管理生命周期，防止泄露
	6.MVP框架思想
	
Rxjava
百度谷歌吧。
	
ReTrofit基本设置
1.首先确保在AndroidManifest.xml中请求了网络权限 
<uses-permission android:name="android.permission.INTERNET"/>  
2.在app/build.gradle添加引用
    /*okhttp*/
    compile 'com.squareup.okhttp3:okhttp:3.3.1'
    compile 'com.squareup.okhttp3:logging-interceptor:3.4.1'

    /*rx-android-java*/
    compile 'io.reactivex:rxjava:1.1.9'
    compile 'io.reactivex:rxandroid:1.2.1'

    /*retrofit*/
    compile 'com.squareup.retrofit2:retrofit:2.1.0'
    compile 'com.squareup.retrofit2:converter-gson:2.1.0'
    compile 'com.squareup.retrofit2:adapter-rxjava:2.1.0'
    compile 'com.squareup.retrofit2:retrofit-converters:2.1.0'

    /*gson*/
    compile 'com.google.code.gson:gson:2.6.2'
	
okHttp
百度谷歌吧。
	
本项目用到的测试接口为一个查询IP地址的接口：
http://ip.taobao.com/service/getIpInfo.php?ip=63.36.36.36
成功查询到的返回格式为：
{
    "code": 0,
    "data": {
        "country": "美国",
        "country_id": "US",
        "area": "",
        "area_id": "",
        "region": "",
        "region_id": "",
        "city": "",
        "city_id": "",
        "county": "",
        "county_id": "",
        "isp": "",
        "isp_id": "",
        "ip": "63.36.36.36"
    }
}
失败情况暂时不考虑，因为这接口不好的地方是失败返回的格式和一般我们的项目写法不一致{"code":1,"data":"invaild ip."}
还是就是本人加上了一个字段message，为了失败成功有个后台返回的统一提示语。

说这么多，看代码吧。不懂Q我。1255432619