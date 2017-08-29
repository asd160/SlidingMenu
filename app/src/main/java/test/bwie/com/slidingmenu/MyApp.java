package test.bwie.com.slidingmenu;

import android.app.Application;

import org.xutils.x;

/**
 * Created by Administrator on 2017/8/29.
 */

public class MyApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.init(this);//权限使用
    }
}
