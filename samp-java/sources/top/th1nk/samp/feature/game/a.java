package top.th1nk.samp.feature.game;

import android.util.Log;
import com.bytedance.shadowhook.ShadowHook;
import com.wardrumstudios.utils.WarMedia;
import defpackage.u13;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class a extends WarMedia {
    public static a gtasaSelf;
    static String vmVersion;

    static {
        u13 u13Var = new u13();
        u13Var.f = 1;
        ShadowHook.a(u13Var);
        vmVersion = null;
        Log.i("GTASA", "**** Loading SO's");
        try {
            vmVersion = System.getProperty("java.vm.version");
            Log.i("GTASA", "vmVersion " + vmVersion);
            System.loadLibrary("ImmEmulatorJ");
        } catch (ExceptionInInitializerError | UnsatisfiedLinkError unused) {
        }
        System.loadLibrary("GTASA");
        System.loadLibrary("bass");
        System.loadLibrary("samp");
    }
}
