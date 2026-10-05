package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ps1 extends u10 {
    public final d42 b;
    public final d42 c;

    public ps1(Object obj) {
        super(3);
        this.b = b32.w(obj);
        this.c = b32.w(obj);
    }

    @Override // defpackage.u10
    public final Object h() {
        return this.b.getValue();
    }

    @Override // defpackage.u10
    public final Object i() {
        return this.c.getValue();
    }

    @Override // defpackage.u10
    public final void m(Object obj) {
        this.b.setValue(obj);
    }

    @Override // defpackage.u10
    public final void o() {
    }

    @Override // defpackage.u10
    public final void n(gk3 gk3Var) {
    }
}
