package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gf3 {
    public final af a;
    public final long b;
    public final pg3 c;
    public final iy1 d;
    public final xg3 e;
    public long f;
    public final af g;
    public final bg3 h;
    public final qg3 i;

    public gf3(bg3 bg3Var, iy1 iy1Var, qg3 qg3Var, xg3 xg3Var) {
        af afVar = bg3Var.a;
        long j = bg3Var.b;
        pg3 pg3Var = qg3Var != null ? qg3Var.a : null;
        this.a = afVar;
        this.b = j;
        this.c = pg3Var;
        this.d = iy1Var;
        this.e = xg3Var;
        this.f = j;
        this.g = afVar;
        this.h = bg3Var;
        this.i = qg3Var;
    }

    public final List a(ns0 ns0Var) {
        if (!yg3.c(this.f)) {
            return vr.L(new dz(0, ""), new nz2(yg3.f(this.f), yg3.f(this.f)));
        }
        eh0 eh0Var = (eh0) ns0Var.h(this);
        if (eh0Var != null) {
            return vr.K(eh0Var);
        }
        return null;
    }

    public final Integer b() {
        pg3 pg3Var = this.c;
        if (pg3Var == null) {
            return null;
        }
        br1 br1Var = pg3Var.b;
        int iE = yg3.e(this.f);
        iy1 iy1Var = this.d;
        return Integer.valueOf(iy1Var.n(br1Var.c(br1Var.d(iy1Var.r(iE)), true)));
    }

    public final Integer c() {
        pg3 pg3Var = this.c;
        if (pg3Var == null) {
            return null;
        }
        int iF = yg3.f(this.f);
        iy1 iy1Var = this.d;
        return Integer.valueOf(iy1Var.n(pg3Var.g(pg3Var.b.d(iy1Var.r(iF)))));
    }

    public final Integer d() {
        int length;
        pg3 pg3Var = this.c;
        if (pg3Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            af afVar = this.a;
            if (iR < afVar.g.length()) {
                int length2 = this.g.g.length() - 1;
                if (iR <= length2) {
                    length2 = iR;
                }
                long j = pg3Var.j(length2);
                int i = yg3.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > iR) {
                    length = this.d.n(i2);
                    break;
                }
                iR++;
            } else {
                length = afVar.g.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int iN;
        pg3 pg3Var = this.c;
        if (pg3Var == null) {
            return null;
        }
        int iR = r();
        while (true) {
            if (iR <= 0) {
                iN = 0;
                break;
            }
            int length = this.g.g.length() - 1;
            if (iR <= length) {
                length = iR;
            }
            long j = pg3Var.j(length);
            int i = yg3.c;
            int i2 = (int) (j >> 32);
            if (i2 < iR) {
                iN = this.d.n(i2);
                break;
            }
            iR--;
        }
        return Integer.valueOf(iN);
    }

    public final boolean f() {
        pg3 pg3Var = this.c;
        return (pg3Var != null ? pg3Var.h(r()) : null) != sl2.g;
    }

    public final int g(pg3 pg3Var, int i) {
        int iR = r();
        xg3 xg3Var = this.e;
        if (xg3Var.a == null) {
            xg3Var.a = Float.valueOf(pg3Var.c(iR).a);
        }
        br1 br1Var = pg3Var.b;
        int iD = br1Var.d(iR) + i;
        if (iD < 0) {
            return 0;
        }
        if (iD >= br1Var.f) {
            return this.g.g.length();
        }
        float fB = br1Var.b(iD) - 1.0f;
        Float f = xg3Var.a;
        f.getClass();
        float fFloatValue = f.floatValue();
        if ((f() && fFloatValue >= pg3Var.f(iD)) || (!f() && fFloatValue <= pg3Var.e(iD))) {
            return br1Var.c(iD, true);
        }
        return this.d.n(br1Var.g((((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(qg3 qg3Var, int i) {
        jk2 jk2VarC0;
        ab1 ab1Var = qg3Var.b;
        pg3 pg3Var = qg3Var.a;
        if (ab1Var == null) {
            jk2VarC0 = jk2.e;
        } else {
            ab1 ab1Var2 = qg3Var.c;
            jk2VarC0 = ab1Var2 != null ? ab1Var2.c0(ab1Var, true) : null;
            if (jk2VarC0 == null) {
            }
        }
        long j = this.h.b;
        int i2 = yg3.c;
        iy1 iy1Var = this.d;
        jk2 jk2VarC = pg3Var.c(iy1Var.r((int) (j & 4294967295L)));
        float f = jk2VarC.a;
        return iy1Var.n(pg3Var.b.g((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (jk2VarC0.c() & 4294967295L)) * i) + jk2VarC.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        xg3 xg3Var = this.e;
        xg3Var.a = null;
        af afVar = this.g;
        if (afVar.g.length() > 0) {
            if (f()) {
                k();
                return;
            }
            xg3Var.a = null;
            if (afVar.g.length() > 0) {
                String str = afVar.g;
                long j = this.f;
                int i = yg3.c;
                int iL = n32.l((int) (j & 4294967295L), str);
                if (iL != -1) {
                    q(iL, iL);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        af afVar = this.g;
        String str = afVar.g;
        String str2 = afVar.g;
        if (str.length() > 0) {
            int iM = d32.m(str2, yg3.e(this.f));
            if (iM == yg3.e(this.f) && iM != str2.length()) {
                iM = d32.m(str2, iM + 1);
            }
            q(iM, iM);
        }
    }

    public final void k() {
        this.e.a = null;
        af afVar = this.g;
        if (afVar.g.length() > 0) {
            String str = afVar.g;
            long j = this.f;
            int i = yg3.c;
            int iM = n32.m((int) (j & 4294967295L), str);
            if (iM != -1) {
                q(iM, iM);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        af afVar = this.g;
        String str = afVar.g;
        String str2 = afVar.g;
        if (str.length() > 0) {
            int iN = d32.n(str2, yg3.f(this.f));
            if (iN == yg3.f(this.f) && iN != 0) {
                iN = d32.n(str2, iN - 1);
            }
            q(iN, iN);
        }
    }

    public final void m() {
        xg3 xg3Var = this.e;
        xg3Var.a = null;
        af afVar = this.g;
        if (afVar.g.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            xg3Var.a = null;
            if (afVar.g.length() > 0) {
                String str = afVar.g;
                long j = this.f;
                int i = yg3.c;
                int iL = n32.l((int) (j & 4294967295L), str);
                if (iL != -1) {
                    q(iL, iL);
                }
            }
        }
    }

    public final void n() {
        Integer numB;
        this.e.a = null;
        if (this.g.g.length() <= 0 || (numB = b()) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        q(iIntValue, iIntValue);
    }

    public final void o() {
        Integer numC;
        this.e.a = null;
        if (this.g.g.length() <= 0 || (numC = c()) == null) {
            return;
        }
        int iIntValue = numC.intValue();
        q(iIntValue, iIntValue);
    }

    public final void p() {
        if (this.g.g.length() > 0) {
            int i = yg3.c;
            this.f = d32.f((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void q(int i, int i2) {
        this.f = d32.f(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = yg3.c;
        return this.d.r((int) (j & 4294967295L));
    }
}
