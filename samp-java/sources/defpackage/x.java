package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class x extends q61 implements p40, x50 {
    public final o50 j;

    public x(o50 o50Var, boolean z) {
        super(z);
        V((j61) o50Var.m(f5.b0));
        this.j = o50Var.k(this);
    }

    @Override // defpackage.q61
    public final String I() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // defpackage.q61
    public final void U(kz kzVar) {
        lr.K(this.j, kzVar);
    }

    @Override // defpackage.q61
    public final void d0(Object obj) {
        if (!(obj instanceof jz)) {
            q0(obj);
        } else {
            jz jzVar = (jz) obj;
            p0(jzVar.a, jz.b.get(jzVar) == 1);
        }
    }

    @Override // defpackage.x50
    public final o50 h() {
        return this.j;
    }

    @Override // defpackage.p40
    public final o50 i() {
        return this.j;
    }

    public final void r0(a60 a60Var, x xVar, rs0 rs0Var) throws IllegalAccessException, InvocationTargetException {
        Object objF;
        int iOrdinal = a60Var.ordinal();
        dm3 dm3Var = dm3.a;
        if (iOrdinal == 0) {
            try {
                s51.A(vr.I(vr.w(xVar, this, rs0Var)), dm3Var);
                return;
            } finally {
                th = th;
                if (th instanceof vb0) {
                    th = ((vb0) th).f;
                }
                t(y02.l(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                rs0Var.getClass();
                vr.I(vr.w(xVar, this, rs0Var)).t(dm3Var);
                return;
            }
            if (iOrdinal != 3) {
                c.k();
                return;
            }
            try {
                o50 o50Var = this.j;
                Object objF2 = cl3.F(o50Var, null);
                try {
                    if (rs0Var instanceof ml) {
                        cl3.i(2, rs0Var);
                        objF = rs0Var.f(xVar, this);
                    } else {
                        objF = vr.c0(rs0Var, xVar, this);
                    }
                    cl3.A(o50Var, objF2);
                    if (objF != y50.f) {
                        t(objF);
                    }
                } catch (Throwable th) {
                    cl3.A(o50Var, objF2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // defpackage.p40
    public final void t(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = rn2.a(obj);
        if (thA != null) {
            obj = new jz(thA, false);
        }
        Object objZ = Z(obj);
        if (objZ == s51.n) {
            return;
        }
        A(objZ);
    }

    public void q0(Object obj) {
    }

    public void p0(Throwable th, boolean z) {
    }
}
