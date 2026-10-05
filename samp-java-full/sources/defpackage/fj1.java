package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class fj1 extends vq3 {
    public static final z90 c = new z90(2);
    public final l83 b = new l83(0);

    @Override // defpackage.vq3
    public final void d() {
        l83 l83Var = this.b;
        if (l83Var.e() > 0) {
            l83Var.f(0).getClass();
            qn1.b();
            return;
        }
        int i = l83Var.i;
        Object[] objArr = l83Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        l83Var.i = 0;
        l83Var.f = false;
    }
}
