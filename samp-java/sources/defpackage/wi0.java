package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wi0 extends u71 implements rs0 {
    public final /* synthetic */ gk3 g;
    public final /* synthetic */ cs0 h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi0(gk3 gk3Var, cs0 cs0Var, int i) {
        super(2);
        this.g = gk3Var;
        this.h = cs0Var;
        this.i = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iY = jo3.y(this.i | 1);
        dj0.a(this.g, this.h, (nv0) obj, iY);
        return dm3.a;
    }
}
