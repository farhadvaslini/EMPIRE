package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class x02 extends vr {
    public final ro2 l;
    public final da m;

    public x02(ro2 ro2Var) {
        da daVarA;
        this.l = ro2Var;
        if (w22.A(ro2Var)) {
            daVarA = null;
        } else {
            daVarA = ga.a();
            da.b(daVarA, ro2Var);
        }
        this.m = daVarA;
    }

    @Override // defpackage.vr
    public final jk2 A() {
        ro2 ro2Var = this.l;
        return new jk2(ro2Var.a, ro2Var.b, ro2Var.c, ro2Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x02) {
            return this.l.equals(((x02) obj).l);
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode();
    }
}
