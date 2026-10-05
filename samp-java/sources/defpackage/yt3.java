package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yt3 implements xt3 {
    public final va0 b;

    public yt3() {
        this.b = Build.VERSION.SDK_INT >= 34 ? wa0.f : f5.P;
        vr.m(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
