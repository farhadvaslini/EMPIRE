package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.qg3 r9, int r10) {
        /*
            r8 = this;
            ab1 r0 = r9.b
            pg3 r1 = r9.a
            if (r0 == 0) goto L13
            ab1 r9 = r9.c
            if (r9 == 0) goto L10
            r2 = 1
            jk2 r9 = r9.c0(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            jk2 r9 = defpackage.jk2.e
        L15:
            bg3 r0 = r8.h
            long r2 = r0.b
            int r0 = defpackage.yg3.c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            iy1 r8 = r8.d
            int r0 = r8.r(r0)
            jk2 r0 = r1.c(r0)
            float r2 = r0.a
            float r0 = r0.b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r2 = r2 << r0
            long r9 = r9 & r4
            long r9 = r9 | r2
            br1 r0 = r1.b
            int r9 = r0.g(r9)
            int r8 = r8.n(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf3.h(qg3, int):int");
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
