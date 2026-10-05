package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class eo1 implements rs0 {
    public final /* synthetic */ un1 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ rs0 h;

    public eo1(un1 un1Var, boolean z, rs0 rs0Var) {
        this.f = un1Var;
        this.g = z;
        this.h = rs0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 2;
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            nv0Var.a0(-864293207);
            nv0Var.p(false);
            t20 t20Var = t30.a;
            boolean z = this.g;
            un1 un1Var = this.f;
            vr.c(nc2.f(z ? un1Var.a : un1Var.d, t20Var), gq.N(-893579015, new y4(i, this.h), nv0Var), nv0Var, 56);
            nv0Var.a0(-863072055);
            nv0Var.p(false);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
