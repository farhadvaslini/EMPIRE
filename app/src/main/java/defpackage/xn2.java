package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xn2 implements yo2 {
    public final jj2 a;

    public xn2(jj2 jj2Var) {
        jj2Var.getClass();
        this.a = jj2Var;
    }

    @Override // defpackage.yo2
    public final yo2 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.yo2
    public final xo2 c() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.yo2, defpackage.zj0
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.yo2
    public final jj2 d() {
        return this.a;
    }

    @Override // defpackage.yo2
    public final boolean e() {
        return true;
    }

    @Override // defpackage.yo2
    public final xo2 g() {
        throw new IllegalStateException("already connected");
    }
}
