package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bk3 {
    public final bl3 a;
    public final d42 b = b32.w(null);
    public final /* synthetic */ gk3 c;

    public bk3(gk3 gk3Var, bl3 bl3Var, String str) {
        this.c = gk3Var;
        this.a = bl3Var;
    }

    public final ak3 a(ns0 ns0Var, Object obj, ue ueVar, ns0 ns0Var2) {
        d42 d42Var = this.b;
        ak3 ak3Var = (ak3) d42Var.getValue();
        gk3 gk3Var = this.c;
        if (ak3Var == null) {
            Object objH = ns0Var2.h(gk3Var.a.h());
            Object objH2 = ns0Var2.h(gk3Var.a.h());
            bl3 bl3Var = this.a;
            ue ueVar2 = (ue) bl3Var.a.h(objH2);
            ueVar2.d();
            ek3 ek3Var = new ek3(gk3Var, objH, ueVar2, bl3Var);
            ak3Var = new ak3(this, ek3Var, ns0Var, ns0Var2);
            d42Var.setValue(ak3Var);
            gk3Var.j.add(ek3Var);
        }
        ak3Var.h = ns0Var2;
        ak3Var.g = ns0Var;
        ak3Var.a(gk3Var.f(), obj, ueVar);
        return ak3Var;
    }
}
