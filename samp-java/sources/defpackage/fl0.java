package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fl0 implements yo2 {
    public final xo2 a;

    public fl0(Throwable th) {
        this.a = new xo2(this, th, 2);
    }

    @Override // defpackage.yo2
    public final yo2 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.yo2
    public final xo2 c() {
        return this.a;
    }

    @Override // defpackage.yo2, defpackage.zj0
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.yo2
    public final jj2 d() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.yo2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.yo2
    public final xo2 g() {
        return this.a;
    }
}
