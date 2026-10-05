package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class oa3 implements nv2, fg0 {
    public final nv2 a;
    public final int b;
    public final int c;

    public oa3(nv2 nv2Var, int i, int i2) {
        nv2Var.getClass();
        this.a = nv2Var;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            c.g(by1.e(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            c.g(by1.e(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        c.g(nc2.g(i2, i, "endIndex should be not less than startIndex, but was ", " < "));
        throw null;
    }

    @Override // defpackage.fg0
    public final nv2 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new oa3(this.a, i3, i + i3);
    }

    @Override // defpackage.fg0
    public final nv2 b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? ri0.a : new oa3(this.a, i3 + i, i2);
    }

    @Override // defpackage.nv2
    public final Iterator iterator() {
        return new yv0(this);
    }
}
