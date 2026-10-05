package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class c0 extends d0 implements RandomAccess {
    public final d0 f;
    public final int g;
    public final int h;

    public c0(d0 d0Var, int i, int i2) {
        this.f = d0Var;
        this.g = i;
        f80.y(i, i2, d0Var.a());
        this.h = i2 - i;
    }

    @Override // defpackage.t
    public final int a() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            c.i(nc2.g(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.f.get(this.g + i);
    }

    @Override // defpackage.d0, java.util.List
    public final List subList(int i, int i2) {
        f80.y(i, i2, this.h);
        int i3 = this.g;
        return new c0(this.f, i + i3, i3 + i2);
    }
}
