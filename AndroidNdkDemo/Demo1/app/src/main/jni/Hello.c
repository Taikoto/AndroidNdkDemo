//
// Created by Administrator on 2017/8/13 0013.
//

#include <stdio.h>
#include <stdlib.h>
#include <jni.h>

jstring Java_com_example_administrator_ndkdemo_JNI_sayHello(JNIEnv* env,jobject jobj){
    char *text = "hello world !!!!!";
    return (*env)->NewStringUTF(env,text);
}