package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class be1 implements ad1 {
    public final ie1 a;
    public final ae1 b;
    public final nc1 c;
    public final h9 d;

    public be1(ie1 ie1Var, ae1 ae1Var, nc1 nc1Var, h9 h9Var) {
        this.a = ie1Var;
        this.b = ae1Var;
        this.c = nc1Var;
        this.d = h9Var;
    }

    @Override // defpackage.ad1
    public final int a() {
        return this.b.G().b;
    }

    @Override // defpackage.ad1
    public final Object b(int i) {
        h9 h9Var = this.d;
        Object[] objArr = (Object[]) h9Var.d;
        int i2 = i - h9Var.b;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.b.H(i) : obj;
    }

    @Override // defpackage.ad1
    public final Object c(int i) {
        h51 h51VarD = this.b.g.d(i);
        return h51VarD.c.a().h(Integer.valueOf(i - h51VarD.a));
    }

    @Override // defpackage.ad1
    public final void d(int i, Object obj, nv0 nv0Var, int i2) {
        nv0Var.b0(-462424778);
        int i3 = 2;
        int i4 = (nv0Var.d(i) ? 4 : 2) | i2 | (nv0Var.h(obj) ? 32 : 16) | (nv0Var.f(this) ? 256 : 128);
        if (nv0Var.R(i4 & 1, (i4 & 147) != 146)) {
            br.e(obj, i, this.a.r, gq.N(-824725566, new h8(i, i3, this), nv0Var), nv0Var, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xc(this, i, obj, i2, 7);
        }
    }

    @Override // defpackage.ad1
    public final int e(Object obj) {
        return this.d.e(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be1)) {
            return false;
        }
        return s51.n(this.b, ((be1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
