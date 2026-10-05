package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cu implements rs0 {
    public final /* synthetic */ d00 f;
    public final /* synthetic */ gh3 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ rs0 i;
    public final /* synthetic */ st j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ float l;
    public final /* synthetic */ x12 m;

    public cu(d00 d00Var, gh3 gh3Var, long j, rs0 rs0Var, st stVar, boolean z, float f, x12 x12Var) {
        this.f = d00Var;
        this.g = gh3Var;
        this.h = j;
        this.i = rs0Var;
        this.j = stVar;
        this.k = z;
        this.l = f;
        this.m = x12Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            st stVar = this.j;
            boolean z = this.k;
            gu.d(this.f, this.g, this.h, this.i, z ? stVar.c : stVar.g, z ? stVar.d : stVar.h, this.l, this.m, nv0Var, 24576);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
