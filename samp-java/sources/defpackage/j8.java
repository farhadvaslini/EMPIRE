package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class j8 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j8(float f, g9 g9Var, xm xmVar) {
        this.f = 0;
        this.g = f;
        this.h = g9Var;
        this.i = xmVar;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.i;
        float f = this.g;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                g9 g9Var = (g9) obj3;
                xm xmVar = (xm) obj2;
                vb1 vb1Var = (vb1) obj;
                vb1Var.c();
                rr rrVar = vb1Var.f;
                pi piVar = rrVar.g;
                long jA = piVar.A();
                piVar.k().l();
                try {
                    yl1 yl1Var = (yl1) piVar.g;
                    yl1Var.H(f, 0.0f);
                    yl1Var.F(45.0f, 0L);
                    rrVar.t(g9Var, xmVar);
                    return dm3Var;
                } finally {
                    nc2.t(piVar, jA);
                }
            case 1:
                ((h62) obj).C((i62) obj3, ((en1) obj2).p0(f), 0, 0.0f);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                i62 i62Var = (i62) obj3;
                h62 h62Var = (h62) obj;
                ed edVar = ((ai3) obj2).x;
                h62.F(h62Var, i62Var, edVar != null ? (int) ((Number) edVar.d()).floatValue() : (int) f, 0);
                return dm3Var;
            default:
                um3 um3Var = (um3) obj3;
                ns0 ns0Var = (ns0) obj2;
                long jLongValue = ((Long) obj).longValue();
                if (um3Var.b == Long.MIN_VALUE) {
                    um3Var.b = jLongValue;
                }
                float f2 = um3Var.e;
                qe qeVar = new qe(f2);
                qe qeVar2 = um3.f;
                long jB = f == 0.0f ? um3Var.a.b(new qe(f2), qeVar2, um3Var.c) : vm1.N((jLongValue - um3Var.b) / f);
                float f3 = ((qe) um3Var.a.p(jB, qeVar, qeVar2, um3Var.c)).a;
                um3Var.c = (qe) um3Var.a.l(jB, qeVar, qeVar2, um3Var.c);
                um3Var.b = jLongValue;
                float f4 = um3Var.e - f3;
                um3Var.e = f3;
                ns0Var.h(Float.valueOf(f4));
                return dm3Var;
        }
    }

    public /* synthetic */ j8(i62 i62Var, Object obj, float f, int i) {
        this.f = i;
        this.h = i62Var;
        this.i = obj;
        this.g = f;
    }

    public /* synthetic */ j8(um3 um3Var, float f, ns0 ns0Var) {
        this.f = 3;
        this.h = um3Var;
        this.g = f;
        this.i = ns0Var;
    }
}
