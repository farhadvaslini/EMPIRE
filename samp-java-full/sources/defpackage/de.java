package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class de extends u71 implements rs0 {
    public final /* synthetic */ boolean g;
    public final /* synthetic */ bq1 h;
    public final /* synthetic */ ij0 i;
    public final /* synthetic */ ek0 j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(boolean z, bq1 bq1Var, ij0 ij0Var, ek0 ek0Var, String str, int i) {
        super(2);
        this.g = z;
        this.h = bq1Var;
        this.i = ij0Var;
        this.j = ek0Var;
        this.k = str;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = jo3.y(1572871);
        vm1.d(this.g, this.h, this.i, this.j, this.k, (nv0) obj, iY);
        return dm3.a;
    }
}
