package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ze2 extends ja0 implements dw1 {
    public boolean v;
    public cs0 w;
    public af2 y;
    public float z;
    public boolean x = true;
    public final kw1 A = new kw1(this, null);
    public final z32 B = new z32(0.0f);
    public final z32 C = new z32(0.0f);

    public ze2(boolean z, cs0 cs0Var, af2 af2Var, float f) {
        this.v = z;
        this.w = cs0Var;
        this.y = af2Var;
        this.z = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s1(ze2 ze2Var, q40 q40Var) {
        ve2 ve2Var;
        ze2Var.getClass();
        if (q40Var instanceof ve2) {
            ve2Var = (ve2) q40Var;
            int i = ve2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ve2Var.k = i - Integer.MIN_VALUE;
            } else {
                ve2Var = new ve2(ze2Var, q40Var);
            }
        }
        ve2 ve2Var2 = ve2Var;
        Object obj = ve2Var2.i;
        int i2 = ve2Var2.k;
        dm3 dm3Var = dm3.a;
        try {
            if (i2 == 0) {
                y02.Q(obj);
                af2 af2Var = ze2Var.y;
                ve2Var2.k = 1;
                Object objC = ed.c(af2Var.a, new Float(1.0f), null, null, ve2Var2, 14);
                y50 y50Var = y50.f;
                if (objC != y50Var) {
                    objC = dm3Var;
                }
                if (objC == y50Var) {
                    return y50Var;
                }
            } else {
                if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
            }
            if (ze2Var.s) {
                ze2Var.x1(ze2Var.v1());
                ze2Var.y1(ze2Var.v1());
            }
            return dm3Var;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G0(long j, p40 p40Var) {
        xe2 xe2Var;
        if (p40Var instanceof xe2) {
            xe2Var = (xe2) p40Var;
            int i = xe2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xe2Var.k = i - Integer.MIN_VALUE;
            } else {
                xe2Var = new xe2(this, (q40) p40Var);
            }
        }
        Object objW1 = xe2Var.i;
        int i2 = xe2Var.k;
        if (i2 == 0) {
            y02.Q(objW1);
            float fC = lp3.c(j);
            xe2Var.k = 1;
            objW1 = w1(fC, xe2Var);
            Object obj = y50.f;
            if (objW1 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objW1);
        }
        return new lp3(d32.h(0.0f, ((Number) objW1).floatValue()));
    }

    @Override // defpackage.dw1
    public final long Q0(int i, long j) {
        if (!this.y.a.e() && this.x && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < 0.0f) {
            return u1(j);
        }
        return 0L;
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.aq1
    public final void h1() {
        p1(this.A);
        cl3.t(d1(), null, new we2(this, null, 0), 3);
        y1(this.v ? v1() : 0.0f);
    }

    @Override // defpackage.dw1
    public final long l0(long j, int i, long j2) {
        if (this.y.a.e() || !this.x) {
            return 0L;
        }
        int i2 = 1;
        if (i != 1) {
            return 0L;
        }
        long jU1 = u1(j2);
        cl3.t(d1(), null, new we2(this, null, i2), 3);
        return jU1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t1(q40 q40Var) {
        ue2 ue2Var;
        if (q40Var instanceof ue2) {
            ue2Var = (ue2) q40Var;
            int i = ue2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ue2Var.k = i - Integer.MIN_VALUE;
            } else {
                ue2Var = new ue2(this, q40Var);
            }
        }
        ue2 ue2Var2 = ue2Var;
        Object obj = ue2Var2.i;
        int i2 = ue2Var2.k;
        dm3 dm3Var = dm3.a;
        try {
            if (i2 == 0) {
                y02.Q(obj);
                af2 af2Var = this.y;
                ue2Var2.k = 1;
                Object objC = ed.c(af2Var.a, new Float(0.0f), null, null, ue2Var2, 14);
                y50 y50Var = y50.f;
                if (objC != y50Var) {
                    objC = dm3Var;
                }
                if (objC == y50Var) {
                    return y50Var;
                }
            } else {
                if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
            }
            x1(0.0f);
            y1(0.0f);
            return dm3Var;
        } catch (Throwable th) {
            x1(0.0f);
            y1(0.0f);
            throw th;
        }
    }

    public final long u1(long j) {
        float fG;
        float fV1;
        if (this.v) {
            fG = 0.0f;
        } else {
            z32 z32Var = this.C;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + z32Var.g();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            fG = fIntBitsToFloat - z32Var.g();
            x1(fIntBitsToFloat);
            if (z32Var.g() * 0.5f <= v1()) {
                fV1 = z32Var.g() * 0.5f;
            } else {
                float fG2 = y02.g(Math.abs((z32Var.g() * 0.5f) / v1()) - 1.0f, 0.0f, 2.0f);
                fV1 = v1() + (v1() * (fG2 - (((float) Math.pow(fG2, 2.0d)) / 4.0f)));
            }
            y1(fV1);
        }
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fG)) & 4294967295L);
    }

    public final int v1() {
        return vr.X(this).E.p0(this.z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w1(float f, q40 q40Var) {
        ye2 ye2Var;
        if (q40Var instanceof ye2) {
            ye2Var = (ye2) q40Var;
            int i = ye2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ye2Var.l = i - Integer.MIN_VALUE;
            } else {
                ye2Var = new ye2(this, q40Var);
            }
        }
        Object obj = ye2Var.j;
        int i2 = ye2Var.l;
        if (i2 == 0) {
            y02.Q(obj);
            if (this.v) {
                return new Float(0.0f);
            }
            z32 z32Var = this.C;
            if (z32Var.g() * 0.5f > v1()) {
                this.w.a();
            }
            if (z32Var.g() == 0.0f || f < 0.0f) {
                f = 0.0f;
            }
            ye2Var.i = f;
            ye2Var.l = 1;
            Object objT1 = t1(ye2Var);
            Object obj2 = y50.f;
            if (objT1 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = ye2Var.i;
            y02.Q(obj);
        }
        x1(0.0f);
        return new Float(f);
    }

    public final void x1(float f) {
        this.C.h(f);
    }

    public final void y1(float f) {
        this.B.h(f);
    }
}
