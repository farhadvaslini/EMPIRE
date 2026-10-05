package defpackage;

import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fj extends n32 {
    public static volatile fj c;
    public final Object b;

    public fj(int i) {
        switch (i) {
            case 1:
                this.b = new Object();
                Executors.newFixedThreadPool(4, new u90());
                break;
            default:
                this.b = new fj(1);
                break;
        }
    }
}
