package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kf3 implements qs2 {
    public final /* synthetic */ qs2 a;
    public final cb0 b;
    public final cb0 c;

    public kf3(qs2 qs2Var, final lf3 lf3Var) {
        this.a = qs2Var;
        final int i = 0;
        this.b = b32.j(new cs0() { // from class: jf3
            @Override // defpackage.cs0
            public final Object a() {
                int i2 = i;
                lf3 lf3Var2 = lf3Var;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(lf3Var2.a.g() < lf3Var2.b.g());
                    default:
                        return Boolean.valueOf(lf3Var2.a.g() > 0.0f);
                }
            }
        });
        final int i2 = 1;
        this.c = b32.j(new cs0() { // from class: jf3
            @Override // defpackage.cs0
            public final Object a() {
                int i22 = i2;
                lf3 lf3Var2 = lf3Var;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(lf3Var2.a.g() < lf3Var2.b.g());
                    default:
                        return Boolean.valueOf(lf3Var2.a.g() > 0.0f);
                }
            }
        });
    }

    @Override // defpackage.qs2
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.qs2
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.qs2
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.qs2
    public final Object d(ts1 ts1Var, rs0 rs0Var, q40 q40Var) {
        return this.a.d(ts1Var, rs0Var, q40Var);
    }

    @Override // defpackage.qs2
    public final float e(float f) {
        return this.a.e(f);
    }
}
