package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class v22 implements ad1 {
    public final i32 a;
    public final vp b;
    public final h9 c;

    public v22(i32 i32Var, u22 u22Var, h9 h9Var) {
        this.a = i32Var;
        this.b = u22Var;
        this.c = h9Var;
    }

    @Override // defpackage.ad1
    public final int a() {
        return this.b.G().b;
    }

    @Override // defpackage.ad1
    public final Object b(int i) {
        h9 h9Var = this.c;
        Object[] objArr = (Object[]) h9Var.d;
        int i2 = i - h9Var.b;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.b.H(i) : obj;
    }

    @Override // defpackage.ad1
    public final void d(int i, Object obj, nv0 nv0Var, int i2) {
        nv0Var.b0(-1201380429);
        int i3 = (nv0Var.d(i) ? 4 : 2) | i2 | (nv0Var.h(obj) ? 32 : 16) | (nv0Var.f(this) ? 256 : 128);
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            br.e(obj, i, this.a.y, gq.N(1142237095, new h8(i, 3, this), nv0Var), nv0Var, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xc(this, i, obj, i2, 8);
        }
    }

    @Override // defpackage.ad1
    public final int e(Object obj) {
        return this.c.e(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v22)) {
            return false;
        }
        return s51.n(this.b, ((v22) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
