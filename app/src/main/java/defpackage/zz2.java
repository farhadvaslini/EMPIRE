package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zz2 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ot0 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ e92 i;
    public final /* synthetic */ d92 j;
    public final /* synthetic */ os1 k;

    public /* synthetic */ zz2(ot0 ot0Var, String str, e92 e92Var, d92 d92Var, os1 os1Var, int i) {
        this.f = i;
        this.g = ot0Var;
        this.h = str;
        this.i = e92Var;
        this.j = d92Var;
        this.k = os1Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.k;
        d92 d92Var = this.j;
        e92 e92Var = this.i;
        ot0 ot0Var = this.g;
        switch (i) {
            case 0:
                os1Var.setValue(Boolean.FALSE);
                ot0Var.h(new d82(this.h, e92Var.b, ((q82) d92Var).a, "action", "click"));
                break;
            case 1:
                ot0Var.h(new d82(this.h, e92Var.b, ((c92) d92Var).a, "string", (String) os1Var.getValue()));
                break;
            default:
                os1Var.setValue(Boolean.valueOf(!((Boolean) os1Var.getValue()).booleanValue()));
                ot0Var.h(new d82(this.h, e92Var.b, ((a92) d92Var).a, "boolean", String.valueOf(((Boolean) os1Var.getValue()).booleanValue())));
                break;
        }
        return dm3Var;
    }
}
