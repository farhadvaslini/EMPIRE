package defpackage;

import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tw0 implements p12 {
    public qw0 f;
    public final ow0 g;
    public final h7 h;
    public rs0 i;
    public cs0 j;
    public boolean l;
    public float[] n;
    public boolean o;
    public int s;
    public vr u;
    public boolean v;
    public boolean w;
    public boolean y;
    public long k = 9223372034707292159L;
    public final float[] m = wm1.a();
    public ua0 p = lq.h();
    public bb1 q = bb1.f;
    public final rr r = new rr();
    public long t = wj3.b;
    public boolean x = true;
    public final s z = new s(27, this);

    public tw0(qw0 qw0Var, ow0 ow0Var, h7 h7Var, rs0 rs0Var, cs0 cs0Var) {
        this.f = qw0Var;
        this.g = ow0Var;
        this.h = h7Var;
        this.i = rs0Var;
        this.j = cs0Var;
    }

    public final float[] a() {
        float[] fArrA = this.n;
        if (fArrA == null) {
            fArrA = wm1.a();
            this.n = fArrA;
        }
        if (this.w) {
            this.w = false;
            float[] fArrB = b();
            if (this.x) {
                return fArrB;
            }
            if (!gq.I(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.v;
        float[] fArr = this.m;
        if (z) {
            qw0 qw0Var = this.f;
            long jP = qw0Var.z;
            sw0 sw0Var = qw0Var.a;
            if ((9223372034707292159L & jP) == 9205357640488583168L) {
                jP = d32.p(lr.T(this.k));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jP >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jP & 4294967295L));
            float fH = sw0Var.H();
            float fZ = sw0Var.z();
            float fK = sw0Var.K();
            float fO = sw0Var.O();
            float fR = sw0Var.R();
            float fE = sw0Var.e();
            float fV = sw0Var.v();
            double d = ((double) fK) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fZ * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fZ * fSin);
            double d2 = ((double) fO) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fH * fCos2);
            float f10 = (f3 * fCos2) + ((-fH) * fSin2);
            double d3 = ((double) fR) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * fE;
            float f16 = f14 * fE;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * fE;
            float f18 = f12 * fV;
            float f19 = fCos * fCos3 * fV;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fV;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.v = false;
            this.x = pq.G(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.o || this.l) {
            return;
        }
        this.h.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zN = h7.n();
        h7 h7Var = this.h;
        if (zN) {
            h7Var.O(-4.0f);
        }
        qw0 qw0Var = this.f;
        if (!i41.a(qw0Var.t, j)) {
            qw0Var.t = j;
            qw0Var.a.G(qw0Var.u, (int) (j >> 32), (int) (j & 4294967295L));
        }
        ViewParent parent = h7Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(h7Var, h7Var);
        }
    }

    public final void e(long j) {
        if (p41.b(j, this.k)) {
            return;
        }
        if (h7.n()) {
            this.h.O(-4.0f);
        }
        this.k = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.o) {
            this.o = z;
            h7 h7Var = this.h;
            as1 as1Var = h7Var.F;
            boolean z2 = h7Var.H;
            if (!z) {
                if (z2) {
                    return;
                }
                as1Var.k(this);
                as1 as1Var2 = h7Var.G;
                if (as1Var2 != null) {
                    as1Var2.k(this);
                    return;
                }
                return;
            }
            if (!z2) {
                as1Var.b(this);
                return;
            }
            as1 as1Var3 = h7Var.G;
            if (as1Var3 == null) {
                as1Var3 = new as1();
                h7Var.G = as1Var3;
            }
            as1Var3.b(this);
        }
    }

    public final void g() {
        h7.n();
        if (this.o) {
            if (!wj3.a(this.t, wj3.b) && !p41.b(this.f.u, this.k)) {
                qw0 qw0Var = this.f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.t >> 32)) * ((int) (this.k >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.t & 4294967295L)) * ((int) (this.k & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!gy1.b(qw0Var.z, jFloatToRawIntBits)) {
                    qw0Var.z = jFloatToRawIntBits;
                    qw0Var.a.S(jFloatToRawIntBits);
                }
            }
            this.f.e(this.p, this.q, this.k, this.z);
            f(false);
        }
    }
}
