package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class q40 extends ml {
    public final o50 g;
    public transient p40 h;

    public q40(p40 p40Var) {
        this(p40Var, p40Var != null ? p40Var.i() : null);
    }

    @Override // defpackage.p40
    public o50 i() {
        o50 o50Var = this.g;
        o50Var.getClass();
        return o50Var;
    }

    @Override // defpackage.ml
    public void p() {
        p40 p40Var = this.h;
        if (p40Var != null && p40Var != this) {
            m50 m50VarM = i().m(f5.L);
            m50VarM.getClass();
            wb0 wb0Var = (wb0) p40Var;
            wb0Var.j();
            jr jrVarL = wb0Var.l();
            if (jrVarL != null) {
                jrVarL.m();
            }
        }
        this.h = iz.g;
    }

    public q40(p40 p40Var, o50 o50Var) {
        super(p40Var);
        this.g = o50Var;
    }
}
