package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class es2 implements qs2 {
    public static final ar2 k = new ar2(0, new br2(14), new cr2(12));
    public final a42 a;
    public float g;
    public final cb0 i;
    public final cb0 j;
    public final a42 b = new a42(0);
    public final a42 c = new a42(0);
    public final d42 d = b32.w(Boolean.FALSE);
    public final qr1 e = new qr1();
    public final a42 f = new a42(Integer.MAX_VALUE);
    public final l90 h = new l90(new xc1(24, this));

    public es2(int i) {
        this.a = new a42(i);
        final int i2 = 0;
        this.i = b32.j(new cs0(this) { // from class: ds2
            public final /* synthetic */ es2 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                int i3 = i2;
                es2 es2Var = this.g;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(es2Var.a.g() < es2Var.f.g());
                    default:
                        return Boolean.valueOf(es2Var.a.g() > 0);
                }
            }
        });
        final int i3 = 1;
        this.j = b32.j(new cs0(this) { // from class: ds2
            public final /* synthetic */ es2 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                int i32 = i3;
                es2 es2Var = this.g;
                switch (i32) {
                    case 0:
                        return Boolean.valueOf(es2Var.a.g() < es2Var.f.g());
                    default:
                        return Boolean.valueOf(es2Var.a.g() > 0);
                }
            }
        });
    }

    @Override // defpackage.qs2
    public final boolean a() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    @Override // defpackage.qs2
    public final boolean b() {
        return this.h.b();
    }

    @Override // defpackage.qs2
    public final boolean c() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    @Override // defpackage.qs2
    public final Object d(ts1 ts1Var, rs0 rs0Var, q40 q40Var) {
        Object objD = this.h.d(ts1Var, rs0Var, q40Var);
        return objD == y50.f ? objD : dm3.a;
    }

    @Override // defpackage.qs2
    public final float e(float f) {
        return this.h.e(f);
    }
}
