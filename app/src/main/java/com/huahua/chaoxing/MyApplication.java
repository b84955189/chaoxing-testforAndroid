package com.huahua.chaoxing;

import android.app.Application;

import com.simple.spiderman.SpiderMan;
import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.xuexiang.xui.XUI;

/**
 * @author by Administrator
 * Email 1986754601@qq.com
 * Date on 2020/3/8.
 * 作用：
 * PS: Not easy to write code, please indicate.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 异常处理，不需要处理时注释掉这两句即可！
//        CrashHandler crashHandler = CrashHandler.getInstance();
        // 注册crashHandler
//        crashHandler.init(getApplicationContext());
        SpiderMan.init(this);
        Bugly.init(getApplicationContext(), "adea638331", true);
        Beta.autoCheckUpgrade = true;

        XUI.init(this); //初始化UI框架
        XUI.debug(true);  //开启UI框架调试日志

    }
}
