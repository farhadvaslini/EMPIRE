package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0 {
    public x0[] f;
    public int g;
    public int h;
    public va3 i;

    public final x0 c() {
        x0 x0VarD;
        va3 va3Var;
        synchronized (this) {
            try {
                x0[] x0VarArrE = this.f;
                if (x0VarArrE == null) {
                    x0VarArrE = e();
                    this.f = x0VarArrE;
                } else if (this.g >= x0VarArrE.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(x0VarArrE, x0VarArrE.length * 2);
                    this.f = (x0[]) objArrCopyOf;
                    x0VarArrE = (x0[]) objArrCopyOf;
                }
                int i = this.h;
                do {
                    x0VarD = x0VarArrE[i];
                    if (x0VarD == null) {
                        x0VarD = d();
                        x0VarArrE[i] = x0VarD;
                    }
                    i++;
                    if (i >= x0VarArrE.length) {
                        i = 0;
                    }
                } while (!x0VarD.a(this));
                this.h = i;
                this.g++;
                va3Var = this.i;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (va3Var != null) {
            va3Var.w(1);
        }
        return x0VarD;
    }

    public abstract x0 d();

    public abstract x0[] e();

    public final void f(x0 x0Var) {
        va3 va3Var;
        int i;
        p40[] p40VarArrB;
        synchronized (this) {
            try {
                int i2 = this.g - 1;
                this.g = i2;
                va3Var = this.i;
                if (i2 == 0) {
                    this.h = 0;
                }
                x0Var.getClass();
                p40VarArrB = x0Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p40 p40Var : p40VarArrB) {
            if (p40Var != null) {
                p40Var.t(dm3.a);
            }
        }
        if (va3Var != null) {
            va3Var.w(-1);
        }
    }

    public final va3 g() {
        va3 va3Var;
        synchronized (this) {
            va3Var = this.i;
            if (va3Var == null) {
                int i = this.g;
                va3Var = new va3(1, Integer.MAX_VALUE, jp.g);
                va3Var.q(Integer.valueOf(i));
                this.i = va3Var;
            }
        }
        return va3Var;
    }
}
