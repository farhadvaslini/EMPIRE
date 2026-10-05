package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yb1 implements sa3, en1 {
    public final /* synthetic */ bc1 f;
    public final /* synthetic */ hc1 g;

    public yb1(hc1 hc1Var) {
        this.g = hc1Var;
        this.f = hc1Var.m;
    }

    @Override // defpackage.ua0
    public final long C0(long j) {
        return this.f.C0(j);
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.f.h;
    }

    @Override // defpackage.ua0
    public final float H0(long j) {
        return this.f.H0(j);
    }

    @Override // defpackage.en1
    public final dn1 I0(int i, int i2, Map map, ns0 ns0Var) {
        return this.f.o0(i, i2, map, null, ns0Var);
    }

    @Override // defpackage.k51
    public final boolean M() {
        return this.f.M();
    }

    @Override // defpackage.ua0
    public final long P0(float f) {
        return this.f.P0(f);
    }

    @Override // defpackage.ua0
    public final long Q(float f) {
        return this.f.Q(f);
    }

    @Override // defpackage.ua0
    public final long R(long j) {
        return this.f.R(j);
    }

    @Override // defpackage.ua0
    public final float T(float f) {
        return this.f.h() * f;
    }

    @Override // defpackage.ua0
    public final float X0(int i) {
        return this.f.X0(i);
    }

    @Override // defpackage.ua0
    public final float a1(float f) {
        return f / this.f.h();
    }

    @Override // defpackage.sa3
    public final List e0(rs0 rs0Var, Object obj) {
        hc1 hc1Var = this.g;
        tb1 tb1Var = hc1Var.f;
        is1 is1Var = hc1Var.l;
        tb1 tb1Var2 = (tb1) is1Var.g(obj);
        if (tb1Var2 != null && ((qs1) ((yr1) tb1Var.o()).g).i(tb1Var2) < hc1Var.i) {
            return tb1Var2.m();
        }
        is1 is1Var2 = hc1Var.q;
        is1 is1Var3 = hc1Var.o;
        qs1 qs1Var = hc1Var.r;
        if (qs1Var.h < hc1Var.j) {
            m21.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        tb1 tb1Var3 = (tb1) is1Var.g(obj);
        int i = qs1Var.h;
        int i2 = hc1Var.j;
        if (i == i2) {
            qs1Var.b(obj);
        } else {
            Object[] objArr = qs1Var.f;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        hc1Var.j++;
        boolean zB = is1Var3.b(obj);
        if (zB || tb1Var3 != null) {
            if (!zB && tb1Var3 != null) {
                hc1Var.j(((qs1) ((yr1) tb1Var.o()).g).i(tb1Var3), ((qs1) ((yr1) tb1Var.o()).g).h);
                hc1Var.t++;
                is1Var.k(obj);
                is1Var3.m(obj, tb1Var3);
                is1Var2.m(obj, hc1Var.d(obj));
                if (tb1Var.H()) {
                    hc1Var.g();
                }
            }
            tb1 tb1Var4 = (tb1) is1Var3.g(obj);
            zb1 zb1Var = tb1Var4 != null ? (zb1) hc1Var.k.g(tb1Var4) : null;
            if (zb1Var != null && zb1Var.d) {
                hc1Var.m(tb1Var4, obj, false, rs0Var);
            }
            if ((zb1Var != null ? zb1Var.f : null) != null) {
                hc1Var.b(zb1Var, true);
            }
        } else {
            hc1Var.k(obj, rs0Var, false);
            is1Var2.m(obj, hc1Var.d(obj));
        }
        tb1 tb1Var5 = (tb1) is1Var3.g(obj);
        if (tb1Var5 == null) {
            return ni0.f;
        }
        List listN0 = tb1Var5.M.p.N0();
        yr1 yr1Var = (yr1) listN0;
        int i3 = ((qs1) yr1Var.g).h;
        for (int i4 = 0; i4 < i3; i4++) {
            ((bn1) yr1Var.get(i4)).k.b = true;
        }
        return listN0;
    }

    @Override // defpackage.ua0
    public final int f0(long j) {
        return this.f.f0(j);
    }

    @Override // defpackage.k51
    public final bb1 getLayoutDirection() {
        return this.f.f;
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.f.g;
    }

    @Override // defpackage.ua0
    public final float j0(long j) {
        return this.f.j0(j);
    }

    @Override // defpackage.en1
    public final dn1 o0(int i, int i2, Map map, ns0 ns0Var, ns0 ns0Var2) {
        return this.f.o0(i, i2, map, ns0Var, ns0Var2);
    }

    @Override // defpackage.ua0
    public final int p0(float f) {
        return this.f.p0(f);
    }
}
