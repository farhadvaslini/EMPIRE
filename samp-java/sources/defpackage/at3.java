package defpackage;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class at3 {
    public final mt3 a;
    public h31[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public at3(mt3 mt3Var) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.a = mt3Var;
        c(mt3Var);
    }

    public final void a() {
        h31[] h31VarArr = this.b;
        if (h31VarArr != null) {
            h31 h31VarI = h31VarArr[0];
            h31 h31VarI2 = h31VarArr[1];
            mt3 mt3Var = this.a;
            if (h31VarI2 == null) {
                h31VarI2 = mt3Var.a.i(2);
            }
            if (h31VarI == null) {
                h31VarI = mt3Var.a.i(1);
            }
            h(h31.a(h31VarI, h31VarI2));
            h31 h31Var = this.b[y02.u(16)];
            if (h31Var != null) {
                g(h31Var);
            }
            h31 h31Var2 = this.b[y02.u(32)];
            if (h31Var2 != null) {
                e(h31Var2);
            }
            h31 h31Var3 = this.b[y02.u(64)];
            if (h31Var3 != null) {
                i(h31Var3);
            }
        }
    }

    public abstract mt3 b();

    public void c(mt3 mt3Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listF = mt3Var.a.f(i);
            int iU = y02.u(i);
            this.c[iU] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            if (i != 8) {
                List<Rect> listG = mt3Var.a.g(i);
                this.d[iU] = (Rect[]) listG.toArray(new Rect[listG.size()]);
            }
        }
    }

    public void d(int i, h31 h31Var) {
        if (this.b == null) {
            this.b = new h31[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[y02.u(i2)] = h31Var;
            }
        }
    }

    public abstract void f(h31 h31Var);

    public abstract void h(h31 h31Var);

    public at3() {
        this(new mt3((mt3) null));
    }

    public void e(h31 h31Var) {
    }

    public void g(h31 h31Var) {
    }

    public void i(h31 h31Var) {
    }
}
