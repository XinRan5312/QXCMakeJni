package com.xinran.qxcmakejnidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * https://mp.weixin.qq.com/s?__biz=MzA5MzI3NjE2MA==&mid=2650241555&idx=1&sn=6514cb0fe74875cef40fd9d2b1b1b28e&chksm=88638b7cbf14026aadaea60a8c399a45ea572db3c1fb530da99c802f2ed71eb5dfa8bf740471&mpshare=1&scene=1&srcid=1010nRlWltLA7PgFSkb4yenI#rd
 *
 * 使用CMake来进行Android NDK开发:
 *
 * ndk 开发有两种编译方式，一种是通过 ndk-build 来构建；

 一种是通过 CMake 构建原生库。通过 CMake 构建原生库是 Google 新提出来的方式，比较方便、强大。
 */

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
