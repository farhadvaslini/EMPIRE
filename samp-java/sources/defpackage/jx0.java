package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jx0 extends q50 implements ga0 {
    public final Handler h;
    public final String i;
    public final boolean j;
    public final jx0 k;

    public jx0(Handler handler, String str, boolean z) {
        this.h = handler;
        this.i = str;
        this.j = z;
        this.k = z ? this : new jx0(handler, str, true);
    }

    @Override // defpackage.q50
    public final void B(o50 o50Var, Runnable runnable) {
        if (this.h.post(runnable)) {
            return;
        }
        F(o50Var, runnable);
    }

    @Override // defpackage.q50
    public final boolean D(o50 o50Var) {
        return (this.j && s51.n(Looper.myLooper(), this.h.getLooper())) ? false : true;
    }

    public final void F(o50 o50Var, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        j61 j61Var = (j61) o50Var.m(f5.b0);
        if (j61Var != null) {
            j61Var.c(cancellationException);
        }
        j90 j90Var = ac0.a;
        x80.h.B(o50Var, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jx0)) {
            return false;
        }
        jx0 jx0Var = (jx0) obj;
        return jx0Var.h == this.h && jx0Var.j == this.j;
    }

    @Override // defpackage.ga0
    public final kc0 h(long j, final ei3 ei3Var, o50 o50Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.h.postDelayed(ei3Var, j)) {
            return new kc0() { // from class: ix0
                @Override // defpackage.kc0
                public final void a() {
                    this.f.h.removeCallbacks(ei3Var);
                }
            };
        }
        F(o50Var, ei3Var);
        return lx1.f;
    }

    public final int hashCode() {
        return (this.j ? 1231 : 1237) ^ System.identityHashCode(this.h);
    }

    @Override // defpackage.ga0
    public final void i(long j, jr jrVar) {
        a8 a8Var = new a8(5, jrVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.h.postDelayed(a8Var, j)) {
            jrVar.v(new i(18, this, a8Var));
        } else {
            F(jrVar.j, a8Var);
        }
    }

    @Override // defpackage.q50
    public final String toString() {
        jx0 jx0Var;
        String str;
        j90 j90Var = ac0.a;
        jx0 jx0Var2 = tl1.a;
        if (this == jx0Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                jx0Var = jx0Var2.k;
            } catch (UnsupportedOperationException unused) {
                jx0Var = null;
            }
            str = this == jx0Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.i;
        if (string == null) {
            string = this.h.toString();
        }
        if (!this.j) {
            return string;
        }
        return string + ".immediate";
    }

    public jx0(Handler handler) {
        this(handler, null, false);
    }
}
