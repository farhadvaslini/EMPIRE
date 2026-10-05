package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ce extends u71 implements rs0 {
    public final /* synthetic */ boolean g;
    public final /* synthetic */ bq1 h;
    public final /* synthetic */ ij0 i;
    public final /* synthetic */ ek0 j;
    public final /* synthetic */ String k;
    public final /* synthetic */ d00 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(boolean z, bq1 bq1Var, ij0 ij0Var, ek0 ek0Var, String str, d00 d00Var, int i, int i2) {
        super(2);
        this.g = z;
        this.h = bq1Var;
        this.i = ij0Var;
        this.j = ek0Var;
        this.k = str;
        this.l = d00Var;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        vm1.c(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, jo3.y(this.m | 1), this.n);
        return dm3.a;
    }
}
