package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sg3 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ sg3(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj = this.g;
        switch (i) {
            case 0:
                break;
            case 1:
                fh3 fh3Var = (fh3) obj;
                fh3Var.D = null;
                y02.w(fh3Var);
                lq.J(fh3Var);
                vr.J(fh3Var);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((li3) obj).S.h(Boolean.valueOf(!r2.R));
                break;
            default:
                ((xo3) obj).h.setValue(dm3Var);
                break;
        }
        return dm3Var;
    }
}
