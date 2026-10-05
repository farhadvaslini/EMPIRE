package defpackage;

import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class em {
    public static final r93 a = new r93(new v3(17));
    public static Boolean b;

    public static final void a(final af afVar, final gh3 gh3Var, final zp0 zp0Var, final List list, final boolean z, nv0 nv0Var) {
        Executor executor = (Executor) nv0Var.j(a);
        if (executor == null || !b(afVar.g.length())) {
            nv0Var.a0(317137883);
            nv0Var.p(false);
            return;
        }
        nv0Var.a0(315439796);
        final bb1 bb1Var = (bb1) nv0Var.j(s20.n);
        final ua0 ua0Var = (ua0) nv0Var.j(s20.h);
        try {
            executor.execute(new Runnable() { // from class: dm
                @Override // java.lang.Runnable
                public final void run() {
                    ns1 ns1VarC;
                    gh3 gh3Var2 = gh3Var;
                    bb1 bb1Var2 = bb1Var;
                    af afVar2 = afVar;
                    ua0 ua0Var2 = ua0Var;
                    zp0 zp0Var2 = zp0Var;
                    boolean z2 = z;
                    Trace.beginSection("BackgroundTextMeasurement");
                    try {
                        t63 t63VarJ = a73.j();
                        ns1 ns1Var = t63VarJ instanceof ns1 ? (ns1) t63VarJ : null;
                        if (ns1Var == null || (ns1VarC = ns1Var.C(null, null)) == null) {
                            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
                            t63 t63VarJ2 = ns1VarC.j();
                            try {
                                gh3 gh3VarY = n32.y(gh3Var2, bb1Var2);
                                List list2 = list;
                                if (list2 == null) {
                                    list2 = ni0.f;
                                }
                                qk qkVar = new qk(afVar2, ua0Var2, zp0Var2, gh3VarY, list2, z2);
                                qkVar.c();
                                qkVar.a();
                                t63.q(t63VarJ2);
                                ns1VarC.w().q();
                                ns1VarC.c();
                                Trace.endSection();
                            } catch (Throwable th) {
                                t63.q(t63VarJ2);
                                throw th;
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
        nv0Var.p(false);
    }

    public static final boolean b(int i) {
        if (Build.VERSION.SDK_INT >= 28 && i >= 8 && i < 1000) {
            if (b == null) {
                b = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            }
            Boolean bool = b;
            bool.getClass();
            if (bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
