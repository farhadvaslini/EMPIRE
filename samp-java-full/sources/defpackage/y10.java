package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y10 implements rs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ a20 g;
    public final /* synthetic */ h7 h;
    public final /* synthetic */ d00 i;

    public /* synthetic */ y10(h7 h7Var, a20 a20Var, d00 d00Var) {
        this.h = h7Var;
        this.g = a20Var;
        this.i = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        d00 d00Var = this.i;
        h7 h7Var = this.h;
        a20 a20Var = this.g;
        nv0 nv0Var = (nv0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    nv0Var.a0(866651995);
                    s20.a(h7Var, a20Var.l, d00Var, nv0Var, 0);
                    nv0Var.p(false);
                }
                break;
            default:
                num.getClass();
                a20Var.a(h7Var, d00Var, nv0Var, jo3.y(1));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ y10(a20 a20Var, h7 h7Var, d00 d00Var, int i) {
        this.g = a20Var;
        this.h = h7Var;
        this.i = d00Var;
    }
}
