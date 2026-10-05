package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pf0 extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf0(int i, Object obj, Object obj2) {
        super(1);
        this.g = i;
        this.h = obj;
        this.i = obj2;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.g;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.h;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                qf0 qf0Var = (qf0) obj;
                qf0 qf0Var2 = (qf0) obj2;
                ua0 ua0VarO = qf0Var.Z().o();
                bb1 bb1VarW = qf0Var.Z().w();
                pr prVarK = qf0Var.Z().k();
                long jA = qf0Var.Z().A();
                qw0 qw0Var = (qw0) qf0Var.Z().h;
                ns0 ns0Var = (ns0) obj3;
                ua0 ua0VarO2 = qf0Var2.Z().o();
                bb1 bb1VarW2 = qf0Var2.Z().w();
                pr prVarK2 = qf0Var2.Z().k();
                long jA2 = qf0Var2.Z().A();
                qw0 qw0Var2 = (qw0) qf0Var2.Z().h;
                pi piVarZ = qf0Var2.Z();
                piVarZ.N(ua0VarO);
                piVarZ.O(bb1VarW);
                piVarZ.M(prVarK);
                piVarZ.Q(jA);
                piVarZ.h = qw0Var;
                prVarK.l();
                try {
                    ns0Var.h(qf0Var2);
                    return dm3Var;
                } finally {
                    prVarK.i();
                    pi piVarZ2 = qf0Var2.Z();
                    piVarZ2.N(ua0VarO2);
                    piVarZ2.O(bb1VarW2);
                    piVarZ2.M(prVarK2);
                    piVarZ2.Q(jA2);
                    piVarZ2.h = qw0Var2;
                }
            default:
                ((h62) obj).C((i62) obj2, 0, 0, ((av3) obj3).t);
                return dm3Var;
        }
    }
}
