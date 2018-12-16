LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := Hello
LOCAL_LDFLAGS := -Wl,--build-id
LOCAL_SRC_FILES := \
	D:\workspace\ndkdemo\app\src\main\jni\Hello.c \

LOCAL_C_INCLUDES += D:\workspace\ndkdemo\app\src\main\jni
LOCAL_C_INCLUDES += D:\workspace\ndkdemo\app\src\debug\jni

include $(BUILD_SHARED_LIBRARY)
