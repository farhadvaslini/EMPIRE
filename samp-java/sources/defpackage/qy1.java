package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qy1 implements OnBackAnimationCallback {
    public final /* synthetic */ py1 a;

    public qy1(py1 py1Var) {
        this.a = py1Var;
    }

    public final void onBackCancelled() {
        py1 py1Var = this.a;
        lv1 lv1Var = py1Var.a;
        if (lv1Var == null) {
            c.q("This input is not added to any dispatcher.");
            return;
        }
        if (!py1Var.b) {
            lv1Var.d(py1Var, null);
        }
        qv1 qv1Var = lv1Var.b;
        qv1Var.getClass();
        if (py1Var.equals(qv1Var.h) && -1 == qv1Var.g) {
            nv1 nv1VarC = qv1Var.f;
            if (nv1VarC == null) {
                nv1VarC = qv1Var.c(-1);
            }
            qv1Var.f = null;
            qv1Var.g = 0;
            qv1Var.h = null;
            if (nv1VarC != null) {
                nv1VarC.a();
            }
            i93 i93Var = qv1Var.a;
            i93Var.getClass();
            i93Var.j(null, rv1.h);
        }
        py1Var.b = false;
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        kv1 kv1VarK = lq.k(backEvent);
        py1 py1Var = this.a;
        lv1 lv1Var = py1Var.a;
        if (lv1Var == null) {
            c.q("This input is not added to any dispatcher.");
            return;
        }
        if (py1Var.b) {
            qv1 qv1Var = lv1Var.b;
            qv1Var.getClass();
            if (py1Var.equals(qv1Var.h) && -1 == qv1Var.g) {
                nv1 nv1VarC = qv1Var.f;
                if (nv1VarC == null) {
                    nv1VarC = qv1Var.c(-1);
                }
                if (nv1VarC != null) {
                    nv1VarC.c(kv1VarK);
                }
                i93 i93Var = qv1Var.a;
                sv1 sv1Var = new sv1(kv1VarK);
                i93Var.getClass();
                i93Var.j(null, sv1Var);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        kv1 kv1VarK = lq.k(backEvent);
        py1 py1Var = this.a;
        lv1 lv1Var = py1Var.a;
        if (lv1Var == null) {
            c.q("This input is not added to any dispatcher.");
        } else {
            if (py1Var.b) {
                return;
            }
            lv1Var.d(py1Var, kv1VarK);
            py1Var.b = true;
        }
    }
}
