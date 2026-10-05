package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bl2 extends y implements r50 {
    public final /* synthetic */ j20 g;
    public final /* synthetic */ cl2 h;

    /* JADX WARN: Illegal instructions before constructor call */
    public bl2(j20 j20Var, cl2 cl2Var) {
        f5 f5Var = f5.N;
        this.g = j20Var;
        this.h = cl2Var;
        super(f5Var);
    }

    @Override // defpackage.r50
    public final void n(o50 o50Var, Throwable th) throws Throwable {
        j20 j20Var = this.g;
        cl2 cl2Var = this.h;
        uq.O(th, new u1(12, j20Var, cl2Var));
        r50 r50Var = (r50) cl2Var.f.m(f5.N);
        if (r50Var == null) {
            throw th;
        }
        r50Var.n(o50Var, th);
    }
}
