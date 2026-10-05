package defpackage;

import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yj0 {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;

    public yj0() {
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = true;
    }

    public static IOException a(yj0 yj0Var, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            yj0Var.e(iOException);
        }
        if (z3) {
            pj0 pj0Var = ((ij2) yj0Var.b).i;
            if (iOException != null) {
                pj0Var.getClass();
            } else {
                pj0Var.getClass();
            }
        }
        if (z2) {
            pj0 pj0Var2 = ((ij2) yj0Var.b).i;
            if (iOException != null) {
                pj0Var2.getClass();
            } else {
                pj0Var2.getClass();
            }
        }
        return ((ij2) yj0Var.b).i(yj0Var, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public jj2 b() {
        zj0 zj0VarF = ((ak0) this.d).f();
        jj2 jj2Var = zj0VarF instanceof jj2 ? (jj2) zj0VarF : null;
        if (jj2Var != null) {
            return jj2Var;
        }
        c.q("no connection for CONNECT tunnels");
        return null;
    }

    public nj2 c(ln2 ln2Var) throws IOException {
        yj0 yj0Var;
        try {
            String strB = ln2.b(ln2Var, "Content-Type");
            long jG = ((ak0) this.d).g(ln2Var);
            yj0Var = this;
            try {
                return new nj2(strB, jG, new ej2(new xj0(yj0Var, ((ak0) this.d).b(ln2Var), jG, false)));
            } catch (IOException e) {
                e = e;
                IOException iOException = e;
                ((ij2) yj0Var.b).i.getClass();
                yj0Var.e(iOException);
                throw iOException;
            }
        } catch (IOException e2) {
            e = e2;
            yj0Var = this;
        }
    }

    public kn2 d() throws IOException {
        try {
            kn2 kn2VarH = ((ak0) this.d).h();
            if (kn2VarH == null) {
                return kn2VarH;
            }
            kn2VarH.n = this;
            return kn2VarH;
        } catch (IOException e) {
            ((ij2) this.b).i.getClass();
            e(e);
            throw e;
        }
    }

    public void e(IOException iOException) {
        this.a = true;
        ((ak0) this.d).f().b((ij2) this.b, iOException);
    }

    public a31 f() throws SocketException {
        ij2 ij2Var = (ij2) this.b;
        if (ij2Var.o) {
            c.q("Check failed.");
            return null;
        }
        ij2Var.o = true;
        ij2Var.j.i();
        synchronized (ij2Var) {
            if (ij2Var.w == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (ij2Var.s || ij2Var.t) {
                throw new IllegalStateException("Check failed.");
            }
            if (ij2Var.q) {
                throw new IllegalStateException("Check failed.");
            }
            if (!ij2Var.r) {
                throw new IllegalStateException("Check failed.");
            }
            ij2Var.r = false;
            ij2Var.s = true;
            ij2Var.t = true;
        }
        zj0 zj0VarF = ((ak0) this.d).f();
        zj0VarF.getClass();
        jj2 jj2Var = (jj2) zj0VarF;
        jj2Var.e.setSoTimeout(0);
        jj2Var.h();
        return new a31(this);
    }

    public yj0(ij2 ij2Var, bk0 bk0Var, ak0 ak0Var) {
        bk0Var.getClass();
        this.b = ij2Var;
        this.c = bk0Var;
        this.d = ak0Var;
    }

    public yj0(zc1 zc1Var, ra3 ra3Var, sc2 sc2Var) {
        this.b = zc1Var;
        this.c = ra3Var;
        this.d = sc2Var;
        this.a = true;
    }
}
