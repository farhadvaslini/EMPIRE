#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_empire_game_GameClientActivity_nativeStatus(
        JNIEnv* env, jobject, jstring host, jint port, jstring nickname) {
    const char* h = env->GetStringUTFChars(host, nullptr);
    const char* n = env->GetStringUTFChars(nickname, nullptr);
    std::string out = "Client Core Ready\nServer: " + std::string(h) + ":" + std::to_string((int)port) +
                       "\nNickname: " + std::string(n) +
                       "\nWaiting for authorized game engine";
    env->ReleaseStringUTFChars(host, h);
    env->ReleaseStringUTFChars(nickname, n);
    return env->NewStringUTF(out.c_str());
}
