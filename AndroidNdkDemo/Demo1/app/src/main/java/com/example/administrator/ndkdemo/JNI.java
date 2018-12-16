package com.example.administrator.ndkdemo;

/**
 * Created by Administrator on 2017/8/13 0013.
 */

public class JNI {

    public static native String sayHello();

    static {
        System.loadLibrary("Hello");
    }
}