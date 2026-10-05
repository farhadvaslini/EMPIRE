package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class n22 implements tc1 {
    public final i32 a;

    public n22(i32 i32Var) {
        this.a = i32Var;
    }

    @Override // defpackage.tc1
    public final int a() {
        return this.a.n();
    }

    @Override // defpackage.tc1
    public final int b() {
        return Math.min(r1.n() - 1, ((fn1) qx.y0(this.a.m().a)).a);
    }

    @Override // defpackage.tc1
    public final boolean c() {
        return !this.a.m().a.isEmpty();
    }

    @Override // defpackage.tc1
    public final int d() {
        int i;
        i32 i32Var = this.a;
        if (i32Var.m().a.size() == 0) {
            return 0;
        }
        int iZ = t22.z(i32Var.m());
        int i2 = i32Var.m().b + i32Var.m().c;
        if (i2 != 0 && (i = iZ / i2) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // defpackage.tc1
    public final int e() {
        return Math.max(0, this.a.e);
    }
}
