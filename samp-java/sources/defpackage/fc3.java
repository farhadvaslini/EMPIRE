package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fc3 extends aq1 implements kb1 {
    public jd0 A;
    public e93 t;
    public int u;
    public boolean v;
    public s83 w;
    public ed x;
    public ed y;
    public jd0 z;

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        float f;
        bl3 bl3Var = rn.h1;
        boolean zIsEmpty = ((List) this.t.getValue()).isEmpty();
        oi0 oi0Var = oi0.f;
        if (zIsEmpty) {
            return en1Var.I0(0, 0, oi0Var, new u0(19));
        }
        boolean z = this.v;
        e93 e93Var = this.t;
        float f2 = z ? ((mc3) ((List) e93Var.getValue()).get(this.u)).c : ((mc3) ((List) e93Var.getValue()).get(this.u)).b;
        jd0 jd0Var = this.A;
        if (jd0Var != null) {
            ed edVar = this.y;
            if (edVar == null) {
                edVar = new ed(jd0Var, bl3Var, null, 12);
                this.y = edVar;
            }
            if (jd0.b(f2, ((jd0) edVar.e.getValue()).f)) {
                f = f2;
            } else {
                f = f2;
                cl3.t(d1(), null, new ec3(edVar, f2, this, null, 0), 3);
            }
        } else {
            f = f2;
            this.A = new jd0(f);
        }
        float f3 = ((mc3) ((List) this.t.getValue()).get(this.u)).a;
        jd0 jd0Var2 = this.z;
        if (jd0Var2 != null) {
            ed edVar2 = this.x;
            if (edVar2 == null) {
                edVar2 = new ed(jd0Var2, bl3Var, null, 12);
                this.x = edVar2;
            }
            if (!jd0.b(f3, ((jd0) edVar2.e.getValue()).f)) {
                cl3.t(d1(), null, new ec3(edVar2, f3, this, null, 1), 3);
            }
        } else {
            this.z = new jd0(f3);
        }
        bb1 layoutDirection = en1Var.getLayoutDirection();
        ed edVar3 = this.x;
        if (layoutDirection != bb1.f) {
            if (edVar3 != null) {
                f3 = ((jd0) edVar3.d()).f;
            }
            f3 = -f3;
        } else if (edVar3 != null) {
            f3 = ((jd0) edVar3.d()).f;
        }
        ed edVar4 = this.y;
        if (edVar4 != null) {
            f = ((jd0) edVar4.d()).f;
        }
        i62 i62VarT = xm1Var.t(m30.b(j, en1Var.p0(f), en1Var.p0(f), 0, 0, 12));
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0Var, new j8(i62VarT, en1Var, f3, 1));
    }
}
