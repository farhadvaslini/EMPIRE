package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pl2 implements Runnable {
    public kq0 f;
    public lq0 g;
    public Handler h;

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        try {
            objCall = this.f.call();
        } catch (Exception unused) {
            objCall = null;
        }
        this.h.post(new x2(this.g, false, objCall, 6));
    }
}
