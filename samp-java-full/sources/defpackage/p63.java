package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p63 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ float g;
    public final /* synthetic */ nk2 h;
    public final /* synthetic */ cs2 i;
    public final /* synthetic */ ns0 j;

    public /* synthetic */ p63(float f, nk2 nk2Var, cs2 cs2Var, ns0 ns0Var, int i) {
        this.f = i;
        this.g = f;
        this.h = nk2Var;
        this.i = cs2Var;
        this.j = ns0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        float fA;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        ns0 ns0Var = this.j;
        cs2 cs2Var = this.i;
        nk2 nk2Var = this.h;
        float f = this.g;
        ne neVar = (ne) obj;
        switch (i) {
            case 0:
                float fAbs = Math.abs(((Number) neVar.e.getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                d42 d42Var = neVar.e;
                if (fAbs < fAbs2) {
                    g12.A(neVar, cs2Var, ns0Var, ((Number) d42Var.getValue()).floatValue() - nk2Var.f);
                    nk2Var.f = ((Number) d42Var.getValue()).floatValue();
                } else {
                    float fE = g12.E(((Number) d42Var.getValue()).floatValue(), f);
                    g12.A(neVar, cs2Var, ns0Var, fE - nk2Var.f);
                    neVar.a();
                    nk2Var.f = fE;
                }
                break;
            default:
                float fE2 = g12.E(((Number) neVar.e.getValue()).floatValue(), f);
                float f2 = fE2 - nk2Var.f;
                try {
                    fA = cs2Var.a(f2);
                } catch (CancellationException unused) {
                    neVar.a();
                    fA = 0.0f;
                }
                ns0Var.h(Float.valueOf(fA));
                if (Math.abs(f2 - fA) > 0.5f || fE2 != ((Number) neVar.e.getValue()).floatValue()) {
                    neVar.a();
                }
                nk2Var.f += fA;
                break;
        }
        return dm3Var;
    }
}
