package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rb3 implements ua0, p40 {
    public final /* synthetic */ sb3 f;
    public final jr g;
    public jr h;
    public ab2 i = ab2.g;
    public final li0 j = li0.f;
    public final /* synthetic */ sb3 k;

    public rb3(sb3 sb3Var, jr jrVar) {
        this.k = sb3Var;
        this.f = sb3Var;
        this.g = jrVar;
    }

    @Override // defpackage.ua0
    public final long C0(long j) {
        return this.f.C0(j);
    }

    public final long E() {
        sb3 sb3Var = this.k;
        long jC0 = sb3Var.C0(vr.X(sb3Var).G.g());
        long j = sb3Var.D;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jC0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jC0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final oq3 F() {
        return vr.X(this.k).G;
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.f.G();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(long j, rs0 rs0Var, ml mlVar) {
        pb3 pb3Var;
        Throwable th;
        w83 w83Var;
        jr jrVar;
        if (mlVar instanceof pb3) {
            pb3Var = (pb3) mlVar;
            int i = pb3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                pb3Var.l = i - Integer.MIN_VALUE;
            } else {
                pb3Var = new pb3(this, mlVar);
            }
        }
        Object objF = pb3Var.j;
        int i2 = pb3Var.l;
        if (i2 != 0) {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w83Var = pb3Var.i;
            try {
                y02.Q(objF);
                w83Var.c(gr.g);
                return objF;
            } catch (Throwable th2) {
                th = th2;
                w83Var.c(gr.g);
                throw th;
            }
        }
        y02.Q(objF);
        if (j <= 0 && (jrVar = this.h) != null) {
            jrVar.t(new qn2(new bb2(j)));
        }
        w83 w83VarT = cl3.t(this.k.d1(), null, new sc(j, this, null), 3);
        try {
            pb3Var.i = w83VarT;
            pb3Var.l = 1;
            objF = rs0Var.f(this, pb3Var);
            Object obj = y50.f;
            if (objF == obj) {
                return obj;
            }
            w83Var = w83VarT;
            w83Var.c(gr.g);
            return objF;
        } catch (Throwable th3) {
            th = th3;
            w83Var = w83VarT;
            w83Var.c(gr.g);
            throw th;
        }
    }

    @Override // defpackage.ua0
    public final float H0(long j) {
        return this.f.H0(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(long j, rs0 rs0Var, q40 q40Var) {
        qb3 qb3Var;
        if (q40Var instanceof qb3) {
            qb3Var = (qb3) q40Var;
            int i = qb3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qb3Var.k = i - Integer.MIN_VALUE;
            } else {
                qb3Var = new qb3(this, q40Var);
            }
        }
        Object obj = qb3Var.i;
        int i2 = qb3Var.k;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    y02.Q(obj);
                    return obj;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
            qb3Var.k = 1;
            Object objH = H(j, rs0Var, qb3Var);
            Object obj2 = y50.f;
            return objH == obj2 ? obj2 : objH;
        } catch (bb2 unused) {
            return null;
        }
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

    public final Object c(ab2 ab2Var, ml mlVar) {
        jr jrVar = new jr(1, vr.I(mlVar));
        jrVar.s();
        this.i = ab2Var;
        this.h = jrVar;
        return jrVar.q();
    }

    @Override // defpackage.ua0
    public final int f0(long j) {
        return this.f.f0(j);
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.f.h();
    }

    @Override // defpackage.p40
    public final o50 i() {
        return this.j;
    }

    @Override // defpackage.ua0
    public final float j0(long j) {
        return this.f.j0(j);
    }

    @Override // defpackage.ua0
    public final int p0(float f) {
        return this.f.p0(f);
    }

    @Override // defpackage.p40
    public final void t(Object obj) {
        sb3 sb3Var = this.k;
        synchronized (sb3Var.A) {
            sb3Var.z.j(this);
        }
        this.g.t(obj);
    }
}
