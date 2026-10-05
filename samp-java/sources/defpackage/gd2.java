package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gd2 implements of1 {
    public static final gd2 n = new gd2();
    public int f;
    public int g;
    public Handler j;
    public boolean h = true;
    public boolean i = true;
    public final rf1 k = new rf1(this, true);
    public final v l = new v(11, this);
    public final k71 m = new k71(9, this);

    public final void a() {
        int i = this.g + 1;
        this.g = i;
        if (i == 1) {
            if (this.h) {
                this.k.e(ef1.ON_RESUME);
                this.h = false;
            } else {
                Handler handler = this.j;
                handler.getClass();
                handler.removeCallbacks(this.l);
            }
        }
    }

    @Override // defpackage.of1
    public final gf1 getLifecycle() {
        return this.k;
    }
}
