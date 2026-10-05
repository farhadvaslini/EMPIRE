package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class y22 implements dn1 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final t02 e;
    public final int f;
    public final int g;
    public final int h;
    public final fn1 i;
    public final fn1 j;
    public final float k;
    public final int l;
    public final boolean m;
    public final m22 n;
    public final dn1 o;
    public final boolean p;
    public final List q;
    public final List r;
    public final x50 s;
    public final ua0 t;
    public final long u;

    public y22(List list, int i, int i2, int i3, t02 t02Var, int i4, int i5, int i6, fn1 fn1Var, fn1 fn1Var2, float f, int i7, boolean z, m22 m22Var, dn1 dn1Var, boolean z2, List list2, List list3, x50 x50Var, ua0 ua0Var, long j) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = t02Var;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = fn1Var;
        this.j = fn1Var2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = m22Var;
        this.o = dn1Var;
        this.p = z2;
        this.q = list2;
        this.r = list3;
        this.s = x50Var;
        this.t = ua0Var;
        this.u = j;
    }

    @Override // defpackage.dn1
    public final void a() {
        this.o.a();
    }

    @Override // defpackage.dn1
    public final rs0 b() {
        return this.o.b();
    }

    @Override // defpackage.dn1
    public final Map c() {
        return this.o.c();
    }

    @Override // defpackage.dn1
    public final int d() {
        return this.o.d();
    }

    @Override // defpackage.dn1
    public final ns0 e() {
        return this.o.e();
    }

    @Override // defpackage.dn1
    public final ns0 f() {
        return this.o.f();
    }

    @Override // defpackage.dn1
    public final int g() {
        return this.o.g();
    }

    public final y22 h(int i) {
        int i2;
        int i3 = this.b + this.c;
        if (this.p) {
            return null;
        }
        List list = this.a;
        if (list.isEmpty() || this.i == null || (i2 = this.l - i) < 0 || i2 >= i3) {
            return null;
        }
        float f = this.k - (i3 != 0 ? i / i3 : 0.0f);
        if (this.j == null || f >= 0.5f || f <= -0.5f) {
            return null;
        }
        fn1 fn1Var = (fn1) qx.q0(list);
        fn1 fn1Var2 = (fn1) qx.y0(list);
        int i4 = this.g;
        int i5 = this.f;
        if (i < 0) {
            if (Math.min((fn1Var.j + i3) - i5, (fn1Var2.j + i3) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - fn1Var.j, i4 - fn1Var2.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((fn1) list.get(i6)).a(i);
        }
        List list2 = this.q;
        int size2 = list2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((fn1) list2.get(i7)).a(i);
        }
        List list3 = this.r;
        int size3 = list3.size();
        for (int i8 = 0; i8 < size3; i8++) {
            ((fn1) list3.get(i8)).a(i);
        }
        return new y22(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, f, i2, this.m || i > 0, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u);
    }

    public final long i() {
        dn1 dn1Var = this.o;
        return (((long) dn1Var.g()) << 32) | (((long) dn1Var.d()) & 4294967295L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ y22(int i, int i2, int i3, int i4, int i5, int i6, m22 m22Var, dn1 dn1Var, x50 x50Var, ua0 ua0Var, long j) {
        ni0 ni0Var = ni0.f;
        this(ni0Var, i, i2, i3, t02.g, i4, i5, i6, null, null, 0.0f, 0, false, m22Var, dn1Var, false, ni0Var, ni0Var, x50Var, ua0Var, j);
    }
}
