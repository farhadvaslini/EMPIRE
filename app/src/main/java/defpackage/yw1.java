package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yw1 implements zq {
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    public yw1(int i, jr jrVar, ns0 ns0Var, ll2 ll2Var, AtomicReference atomicReference, boolean z) {
        this.c = jrVar;
        this.a = i;
        this.d = ll2Var;
        this.e = atomicReference;
        this.b = z;
        this.f = ns0Var;
    }

    @Override // defpackage.zq
    public void a(ij2 ij2Var, ln2 ln2Var) {
        Object qn2Var;
        boolean z;
        ns0 ns0Var;
        ll2 ll2Var = (ll2) this.d;
        int i = this.a;
        int i2 = ln2Var.i;
        jr jrVar = (jr) this.c;
        if (!(jrVar.r() instanceof qx1)) {
            ln2Var.close();
            return;
        }
        String strB = ln2.b(ln2Var, "Location");
        boolean zContains = v72.c.contains(Integer.valueOf(i2));
        Object obj = this.f;
        if (zContains && strB != null) {
            ln2Var.close();
            if (i >= 5) {
                v72.d(jrVar, new IllegalArgumentException("Too many redirects"));
                return;
            }
            i01 i01VarH = ll2Var.a.h(strB);
            if (i01VarH == null || !i01VarH.f()) {
                v72.d(jrVar, new IllegalArgumentException("Invalid HTTPS redirect URL"));
                return;
            }
            AtomicReference atomicReference = (AtomicReference) this.e;
            boolean z2 = this.b;
            pl plVarA = ll2Var.a();
            plVarA.g = i01VarH;
            plVarA.s();
            v72.a(i + 1, jrVar, (ns0) obj, new ll2(plVarA), atomicReference, z2);
            return;
        }
        try {
            z = this.b;
            ns0Var = (ns0) obj;
            try {
            } finally {
            }
        } catch (Exception e) {
            qn2Var = new qn2(e);
        }
        if (!ln2Var.u) {
            throw new IllegalStateException(("HTTP " + i2).toString());
        }
        if (z && !fa3.Y(ln2Var.f.a.b(), ".splug", true)) {
            throw new IllegalArgumentException("Plugin package URL must end with .splug");
        }
        qn2Var = ns0Var.h(ln2Var);
        ln2Var.close();
        if (jrVar.r() instanceof qx1) {
            jrVar.t(new rn2(qn2Var));
        }
    }

    @Override // defpackage.zq
    public void b(ij2 ij2Var, IOException iOException) {
        v72.d((jr) this.c, iOException);
    }

    public boolean c(int i, int i2) {
        zp1 zp1Var = (zp1) ((as1) this.d).g(this.a + i);
        zp1 zp1Var2 = (zp1) ((as1) this.e).g(this.a + i2);
        return s51.n(zp1Var, zp1Var2) || zp1Var.getClass() == zp1Var2.getClass();
    }

    public yw1(ax1 ax1Var, aq1 aq1Var, int i, as1 as1Var, as1 as1Var2, boolean z) {
        this.f = ax1Var;
        this.c = aq1Var;
        this.a = i;
        this.d = as1Var;
        this.e = as1Var2;
        this.b = z;
    }
}
