package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class d11 extends d0 {
    public final j0 f;
    public final int g;
    public final int h;

    public d11(j0 j0Var, int i, int i2) {
        this.f = j0Var;
        this.g = i;
        ur.s(i, i2, j0Var.a());
        this.h = i2 - i;
    }

    @Override // defpackage.t
    public final int a() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ur.p(i, this.h);
        return this.f.get(this.g + i);
    }

    @Override // defpackage.d0, java.util.List
    public final List subList(int i, int i2) {
        ur.s(i, i2, this.h);
        int i3 = this.g;
        return new d11(this.f, i + i3, i3 + i2);
    }
}
