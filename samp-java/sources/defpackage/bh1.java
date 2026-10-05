package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class bh1 implements rs0 {
    public final /* synthetic */ z60 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ x50 j;
    public final /* synthetic */ ed k;

    public /* synthetic */ bh1(z60 z60Var, float f, boolean z, int i, x50 x50Var, ed edVar) {
        this.f = z60Var;
        this.g = f;
        this.h = z;
        this.i = i;
        this.j = x50Var;
        this.k = edVar;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        gb2 gb2Var = (gb2) obj;
        float fFloatValue = ((Float) obj2).floatValue();
        gb2Var.getClass();
        gb2Var.a();
        z60 z60Var = this.f;
        float fD = ((fFloatValue / this.g) * (this.h ? 1.0f : -1.0f)) + z60Var.d();
        int i = 1;
        float f = this.i - 1;
        if (fD < 0.0f) {
            fD = 0.0f;
        }
        if (fD <= f) {
            f = fD;
        }
        z60Var.h(f);
        cl3.t(this.j, null, new q10(this.k, fFloatValue, null, i), 3);
        return dm3.a;
    }
}
