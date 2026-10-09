#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_empire_game_GameClientActivity_nativeStatus(
        JNIEnv* env,
        jobject /* thiz */,
        jstring host,
        jint port,
        jstring nickname) {
    const char* hostChars = host ? env->GetStringUTFChars(host, nullptr) : "";
    const char* nickChars = nickname ? env->GetStringUTFChars(nickname, nullptr) : "Player";

    std::string result = "EMPIRE GAME client bridge ready | server=";
    result += hostChars;
    result += ":";
    result += std::to_string(static_cast<int>(port));
    result += " | nickname=";
    result += nickChars;

    if (host && hostChars) env->ReleaseStringUTFChars(host, hostChars);
    if (nickname && nickChars) env->ReleaseStringUTFChars(nickname, nickChars);

    return env->NewStringUTF(result.c_str());
}
