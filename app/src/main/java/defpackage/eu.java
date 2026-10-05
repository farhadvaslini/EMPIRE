package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class eu implements rs0 {
    public final /* synthetic */ ut2 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ d00 i;
    public final /* synthetic */ gh3 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ x12 l;

    public eu(ut2 ut2Var, boolean z, boolean z2, d00 d00Var, gh3 gh3Var, float f, x12 x12Var) {
        this.f = ut2Var;
        this.g = z;
        this.h = z2;
        this.i = d00Var;
        this.j = gh3Var;
        this.k = f;
        this.l = x12Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            ut2 ut2Var = this.f;
            boolean z = this.g;
            boolean z2 = this.h;
            gu.a(this.i, this.j, !z ? ut2Var.f : !z2 ? ut2Var.b : ut2Var.k, !z ? ut2Var.g : !z2 ? ut2Var.c : ut2Var.l, !z ? ut2Var.h : !z2 ? ut2Var.d : ut2Var.m, this.k, this.l, nv0Var, 0);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
