package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c5 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ rs0 g;
    public final /* synthetic */ d00 h;

    public /* synthetic */ c5(rs0 rs0Var, d00 d00Var, int i) {
        this.f = i;
        this.g = rs0Var;
        this.h = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        d00 d00Var = this.h;
        rs0 rs0Var = this.g;
        int i2 = 0;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    if (rs0Var == null) {
                        nv0Var.a0(-1102039173);
                    } else {
                        nv0Var.a0(795734342);
                        rs0Var.f(nv0Var, 0);
                    }
                    nv0Var.p(false);
                    d00Var.f(nv0Var, 0);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    b22 b22Var = e5.a;
                    e5.b(gq.N(-459506658, new c5(rs0Var, d00Var, i2), nv0Var2), nv0Var2, 438);
                }
                break;
        }
        return dm3Var;
    }
}
