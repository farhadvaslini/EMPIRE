package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ee1 implements dn1 {
    public final fe1 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final dn1 e;
    public final float f;
    public final boolean g;
    public final x50 h;
    public final ua0 i;
    public final long j;
    public final int k;
    public final List l;
    public final int m;
    public final int n;
    public final int o;
    public final t02 p;
    public final int q;
    public final int r;

    public ee1(fe1 fe1Var, int i, boolean z, float f, dn1 dn1Var, float f2, boolean z2, x50 x50Var, ua0 ua0Var, long j, int i2, List list, int i3, int i4, int i5, t02 t02Var, int i6, int i7) {
        this.a = fe1Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = dn1Var;
        this.f = f2;
        this.g = z2;
        this.h = x50Var;
        this.i = ua0Var;
        this.j = j;
        this.k = i2;
        this.l = list;
        this.m = i3;
        this.n = i4;
        this.o = i5;
        this.p = t02Var;
        this.q = i6;
        this.r = i7;
    }

    @Override // defpackage.dn1
    public final void a() {
        this.e.a();
    }

    @Override // defpackage.dn1
    public final rs0 b() {
        return this.e.b();
    }

    @Override // defpackage.dn1
    public final Map c() {
        return this.e.c();
    }

    @Override // defpackage.dn1
    public final int d() {
        return this.e.d();
    }

    @Override // defpackage.dn1
    public final ns0 e() {
        return this.e.e();
    }

    @Override // defpackage.dn1
    public final ns0 f() {
        return this.e.f();
    }

    @Override // defpackage.dn1
    public final int g() {
        return this.e.g();
    }

    public final ee1 h(int i, boolean z) {
        fe1 fe1Var;
        if (this.g) {
            return null;
        }
        List list = this.l;
        if (list.isEmpty() || (fe1Var = this.a) == null) {
            return null;
        }
        int iA = fe1Var.a();
        int i2 = this.b - i;
        if (i2 < 0 || i2 >= iA) {
            return null;
        }
        fe1 fe1Var2 = (fe1) qx.q0(list);
        fe1 fe1Var3 = (fe1) qx.y0(list);
        if (fe1Var2.o || fe1Var3.o) {
            return null;
        }
        int i3 = fe1Var2.j;
        int i4 = this.n;
        int i5 = this.m;
        if (i < 0) {
            if (Math.min((fe1Var2.a() + i3) - i5, (fe1Var3.a() + fe1Var3.j) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - i3, i4 - fe1Var3.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            fe1 fe1Var4 = (fe1) list.get(i6);
            fe1Var4.getClass();
            int[] iArr = fe1Var4.q;
            if (!fe1Var4.o) {
                fe1Var4.j += i;
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if ((i7 & 1) != 0) {
                        iArr[i7] = iArr[i7] + i;
                    }
                }
                if (z) {
                    int size2 = fe1Var4.b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        nc2.u(((is1) fe1Var4.i.a).g(fe1Var4.g));
                    }
                }
            }
        }
        return new ee1(this.a, i2, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, list, this.m, this.n, this.o, this.p, this.q, this.r);
    }

    public final long i() {
        dn1 dn1Var = this.e;
        return (((long) dn1Var.g()) << 32) | (((long) dn1Var.d()) & 4294967295L);
    }
}
