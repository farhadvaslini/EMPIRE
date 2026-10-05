package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rd1 implements pd1 {
    public final /* synthetic */ i32 a;
    public final /* synthetic */ boolean b;

    public rd1(i32 i32Var, boolean z) {
        this.a = i32Var;
        this.b = z;
    }

    @Override // defpackage.pd1
    public final int a() {
        i32 i32Var = this.a;
        return (int) (i32Var.m().e == t02.f ? i32Var.m().i() & 4294967295L : i32Var.m().i() >> 32);
    }

    @Override // defpackage.pd1
    public final float b() {
        return b32.h(this.a);
    }

    @Override // defpackage.pd1
    public final px c() {
        boolean z = this.b;
        i32 i32Var = this.a;
        return z ? new px(i32Var.n(), 1) : new px(1, i32Var.n());
    }

    @Override // defpackage.pd1
    public final Object d(int i, wd1 wd1Var) {
        i32 i32Var = this.a;
        i32Var.getClass();
        Object objD = i32Var.d(ts1.f, new wd1(i32Var, i, (p40) null, 2), wd1Var);
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        if (objD != y50Var) {
            objD = dm3Var;
        }
        return objD == y50Var ? objD : dm3Var;
    }

    @Override // defpackage.pd1
    public final int e() {
        i32 i32Var = this.a;
        return (-i32Var.m().f) + i32Var.m().d;
    }

    @Override // defpackage.pd1
    public final float f() {
        i32 i32Var = this.a;
        return k32.a(i32Var.m(), i32Var.n());
    }
}
