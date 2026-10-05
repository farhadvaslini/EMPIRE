package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hl0 extends ed3 {
    public final /* synthetic */ yo2 e;
    public final /* synthetic */ il0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl0(String str, yo2 yo2Var, il0 il0Var) {
        super(str, true);
        this.e = yo2Var;
        this.f = il0Var;
    }

    @Override // defpackage.ed3
    public final long a() throws InterruptedException {
        xo2 xo2Var;
        yo2 yo2Var = this.e;
        try {
            xo2Var = yo2Var.g();
        } catch (Throwable th) {
            xo2Var = new xo2(yo2Var, th, 2);
        }
        il0 il0Var = this.f;
        if (!il0Var.i.contains(yo2Var)) {
            return -1L;
        }
        il0Var.j.put(xo2Var);
        return -1L;
    }
}
