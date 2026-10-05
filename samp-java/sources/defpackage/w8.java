package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class w8 {
    public final ua0 a;
    public long b = 9205357640488583168L;
    public final ug0 c;
    public final d42 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final ja0 i;

    public w8(Context context, ua0 ua0Var, long j, x12 x12Var) {
        this.a = ua0Var;
        ug0 ug0Var = new ug0(context, vp.T(j));
        this.c = ug0Var;
        this.d = new d42(dm3.a, f5.f0);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        v8 v8Var = new v8(0, this);
        za2 za2Var = ob3.a;
        sb3 sb3Var = new sb3(null, null, null, v8Var);
        this.i = Build.VERSION.SDK_INT >= 31 ? new kw0(sb3Var, this, ug0Var) : new kw0(sb3Var, this, ug0Var, x12Var);
    }

    public final void a() {
        boolean z;
        ug0 ug0Var = this.c;
        EdgeEffect edgeEffect = ug0Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = ug0Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = ug0Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = ug0Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, defpackage.vs2 r21, defpackage.q40 r22) {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w8.b(long, vs2, q40):java.lang.Object");
    }

    public final long c() {
        long jP = this.b;
        if ((9223372034707292159L & jP) == 9205357640488583168L) {
            jP = d32.p(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jP >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jP & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(dm3.a);
        }
    }

    public final boolean e() {
        ug0 ug0Var = this.c;
        EdgeEffect edgeEffect = ug0Var.d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? lf.c(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = ug0Var.e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? lf.c(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = ug0Var.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? lf.c(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = ug0Var.g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? lf.c(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        float fD = -fIntBitsToFloat2;
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fD = lf.d(edgeEffectB, fD, f);
        } else {
            edgeEffectB.onPull(fD, f);
        }
        return (i2 >= 31 ? lf.c(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fD) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        float f = 1.0f - fIntBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = lf.d(edgeEffectC, fIntBitsToFloat2, f);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f);
        }
        return (i2 >= 31 ? lf.c(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        float fD = -fIntBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fD = lf.d(edgeEffectD, fD, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fD, fIntBitsToFloat);
        }
        return (i2 >= 31 ? lf.c(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fD) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            fIntBitsToFloat2 = lf.d(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i2 >= 31 ? lf.c(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean zA = h43.a(this.g, 0L);
        boolean zA2 = h43.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iM = vm1.M(Float.intBitsToFloat((int) (j >> 32)));
            long jM = (((long) vm1.M(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iM) << 32);
            ug0 ug0Var = this.c;
            ug0Var.c = jM;
            EdgeEffect edgeEffect = ug0Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jM >> 32), (int) (jM & 4294967295L));
            }
            EdgeEffect edgeEffect2 = ug0Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jM >> 32), (int) (jM & 4294967295L));
            }
            EdgeEffect edgeEffect3 = ug0Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jM & 4294967295L), (int) (jM >> 32));
            }
            EdgeEffect edgeEffect4 = ug0Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jM & 4294967295L), (int) (jM >> 32));
            }
            EdgeEffect edgeEffect5 = ug0Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jM >> 32), (int) (jM & 4294967295L));
            }
            EdgeEffect edgeEffect6 = ug0Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jM >> 32), (int) (jM & 4294967295L));
            }
            EdgeEffect edgeEffect7 = ug0Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jM & 4294967295L), (int) (jM >> 32));
            }
            EdgeEffect edgeEffect8 = ug0Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jM), (int) (jM >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
