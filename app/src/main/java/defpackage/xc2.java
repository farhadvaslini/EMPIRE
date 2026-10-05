package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xc2 implements ua0 {
    public final /* synthetic */ ua0 f;
    public boolean g;
    public boolean h;
    public final dt1 i = new dt1();

    public xc2(ua0 ua0Var) {
        this.f = ua0Var;
    }

    @Override // defpackage.ua0
    public final long C0(long j) {
        return this.f.C0(j);
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.f.G();
    }

    @Override // defpackage.ua0
    public final float H0(long j) {
        return this.f.H0(j);
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
        return this.f.T(f);
    }

    @Override // defpackage.ua0
    public final float X0(int i) {
        return this.f.X0(i);
    }

    @Override // defpackage.ua0
    public final float a1(float f) {
        return this.f.a1(f);
    }

    public final void c() {
        this.h = true;
        dt1 dt1Var = this.i;
        if (dt1Var.e()) {
            dt1Var.i(null);
        }
    }

    @Override // defpackage.ua0
    public final int f0(long j) {
        return this.f.f0(j);
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.f.h();
    }

    public final void i() {
        this.g = true;
        dt1 dt1Var = this.i;
        if (dt1Var.e()) {
            dt1Var.i(null);
        }
    }

    @Override // defpackage.ua0
    public final float j0(long j) {
        return this.f.j0(j);
    }

    @Override // defpackage.ua0
    public final int p0(float f) {
        return this.f.p0(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(q40 q40Var) {
        vc2 vc2Var;
        if (q40Var instanceof vc2) {
            vc2Var = (vc2) q40Var;
            int i = vc2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vc2Var.k = i - Integer.MIN_VALUE;
            } else {
                vc2Var = new vc2(this, q40Var);
            }
        }
        Object obj = vc2Var.i;
        int i2 = vc2Var.k;
        if (i2 == 0) {
            y02.Q(obj);
            vc2Var.k = 1;
            Object objF = this.i.f(vc2Var);
            y50 y50Var = y50.f;
            if (objF == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        this.g = false;
        this.h = false;
        return dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(q40 q40Var) {
        wc2 wc2Var;
        if (q40Var instanceof wc2) {
            wc2Var = (wc2) q40Var;
            int i = wc2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wc2Var.k = i - Integer.MIN_VALUE;
            } else {
                wc2Var = new wc2(this, q40Var);
            }
        }
        Object obj = wc2Var.i;
        int i2 = wc2Var.k;
        dt1 dt1Var = this.i;
        if (i2 == 0) {
            y02.Q(obj);
            if (!this.g && !this.h) {
                wc2Var.k = 1;
                Object objF = dt1Var.f(wc2Var);
                y50 y50Var = y50.f;
                if (objF == y50Var) {
                    return y50Var;
                }
            }
            return Boolean.valueOf(this.g);
        }
        if (i2 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y02.Q(obj);
        dt1Var.i(null);
        return Boolean.valueOf(this.g);
    }
}
