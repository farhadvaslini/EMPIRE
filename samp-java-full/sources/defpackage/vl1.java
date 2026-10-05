package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vl1 extends s3 {
    public final t3 a;

    public vl1(t3 t3Var) {
        this.a = t3Var;
    }

    @Override // defpackage.s3
    public final void a(Object obj) throws Exception {
        y3 y3Var = this.a.a;
        if (y3Var != null) {
            y3Var.a(obj);
        } else {
            c.q("Launcher has not been initialized");
        }
    }
}
