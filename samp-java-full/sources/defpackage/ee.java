package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ee extends u71 implements rs0 {
    public final /* synthetic */ ry g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ bq1 i;
    public final /* synthetic */ ij0 j;
    public final /* synthetic */ ek0 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ d00 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ry ryVar, boolean z, bq1 bq1Var, ij0 ij0Var, ek0 ek0Var, String str, d00 d00Var, int i, int i2) {
        super(2);
        this.g = ryVar;
        this.h = z;
        this.i = bq1Var;
        this.j = ij0Var;
        this.k = ek0Var;
        this.l = str;
        this.m = d00Var;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        vm1.b(this.g, this.h, this.i, this.j, this.k, this.l, this.m, (nv0) obj, jo3.y(this.n | 1), this.o);
        return dm3.a;
    }
}
