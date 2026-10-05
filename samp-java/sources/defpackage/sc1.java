package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sc1 extends aq1 implements kb1 {
    public static final qc1 w = new qc1();
    public tc1 t;
    public po u;
    public t02 v;

    public final boolean p1(oc1 oc1Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.v != t02.f) {
                }
            } else if (i != 1 && i != 2) {
                c.q("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (q1(i) ? oc1Var.a > 0 : oc1Var.b < this.t.a() - 1) {
                return true;
            }
        } else if (this.v != t02.g) {
            if (q1(i)) {
            }
        }
        return false;
    }

    public final boolean q1(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 5) {
            return false;
        }
        if (i == 6) {
            return true;
        }
        if (i == 3) {
            int iOrdinal = vr.X(this).F.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            c.k();
            return false;
        }
        if (i != 4) {
            c.q("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = vr.X(this).F.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        c.k();
        return false;
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        i62 i62VarT = xm1Var.t(j);
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new z6(i62VarT, 6));
    }
}
