package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nn implements rs0 {
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;

    public nn(float f, float f2) {
        this.f = f;
        this.g = f2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            eo.a(j43.l(yp1.a, this.f, this.g), nv0Var, 0);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
