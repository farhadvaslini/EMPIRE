package com.bytedance.shadowhook;

import defpackage.u13;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ShadowHook {
    public static boolean a = false;
    public static boolean b = false;

    public static synchronized void a(u13 u13Var) {
        if (b) {
            return;
        }
        b = true;
        System.currentTimeMillis();
        synchronized (ShadowHook.class) {
            if (!a) {
                try {
                    System.loadLibrary("shadowhook");
                    a = true;
                } catch (Throwable unused) {
                    System.currentTimeMillis();
                    return;
                }
            }
            try {
                nativeInit(u13Var.f, false);
            } catch (Throwable unused2) {
            }
            System.currentTimeMillis();
        }
    }

    private static native String nativeGetArch();

    private static native boolean nativeGetDebuggable();

    private static native boolean nativeGetDisable();

    private static native int nativeGetInitErrno();

    private static native int nativeGetMode();

    private static native boolean nativeGetRecordable();

    private static native String nativeGetRecords(int i);

    private static native String nativeGetVersion();

    private static native int nativeInit(int i, boolean z);

    private static native void nativeSetDebuggable(boolean z);

    private static native void nativeSetDisable(boolean z);

    private static native void nativeSetRecordable(boolean z);

    private static native String nativeToErrmsg(int i);
}
