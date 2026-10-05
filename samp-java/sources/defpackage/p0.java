package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class p0 extends r51 {
    @Override // defpackage.r51
    public final boolean m(r0 r0Var, n0 n0Var) {
        n0 n0Var2 = n0.b;
        synchronized (r0Var) {
            try {
                if (r0Var.g != n0Var) {
                    return false;
                }
                r0Var.g = n0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r51
    public final boolean n(r0 r0Var, Object obj, Object obj2) {
        synchronized (r0Var) {
            try {
                if (r0Var.f != obj) {
                    return false;
                }
                r0Var.f = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r51
    public final boolean o(r0 r0Var, q0 q0Var, q0 q0Var2) {
        synchronized (r0Var) {
            try {
                if (r0Var.h != q0Var) {
                    return false;
                }
                r0Var.h = q0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r51
    public final void y(q0 q0Var, q0 q0Var2) {
        q0Var.b = q0Var2;
    }

    @Override // defpackage.r51
    public final void z(q0 q0Var, Thread thread) {
        q0Var.a = thread;
    }
}
