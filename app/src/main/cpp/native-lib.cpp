#include <jni.h>
#include <android/log.h>
#include <atomic>

#define LOG_TAG "EMPIRE_CLIENT"

static std::atomic<bool> running(false);

extern "C"
JNIEXPORT jstring JNICALL
Java_com_empire_game_GameClientActivity_nativeGetStatus(
        JNIEnv* env,
        jobject) {

    const char* status = running
        ? "هسته کلاینت فعال است"
        : "هسته کلاینت آماده است";

    return env->NewStringUTF(status);
}

extern "C"
JNIEXPORT jboolean JNICALL
Java_com_empire_game_GameClientActivity_nativeStartClient(
        JNIEnv* env,
        jobject) {

    running = true;

    __android_log_print(
        ANDROID_LOG_INFO,
        LOG_TAG,
        "EMPIRE CLIENT STARTED - 85.133.205.240:7777"
    );

    return JNI_TRUE;
}

extern "C"
JNIEXPORT void JNICALL
Java_com_empire_game_GameClientActivity_nativeStopClient(
        JNIEnv* env,
        jobject) {

    running = false;

    __android_log_print(
        ANDROID_LOG_INFO,
        LOG_TAG,
        "EMPIRE CLIENT STOPPED"
    );
}
