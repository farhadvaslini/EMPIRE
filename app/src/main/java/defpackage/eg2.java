package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class eg2 implements cs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ cf2 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public eg2(ns0 ns0Var, cf2 cf2Var, cs0 cs0Var) {
        this.h = ns0Var;
        this.g = cf2Var;
        this.i = cs0Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj = this.i;
        cf2 cf2Var = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                ((ns0) obj2).h(cf2Var.c);
                ((cs0) obj).a();
                break;
            default:
                ((os1) obj2).setValue(cf2Var);
                ((os1) obj).setValue(Boolean.TRUE);
                break;
        }
        return dm3Var;
    }

    public eg2(cf2 cf2Var, os1 os1Var, os1 os1Var2) {
        this.g = cf2Var;
        this.h = os1Var;
        this.i = os1Var2;
    }
}
