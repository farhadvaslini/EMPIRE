package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class fd1 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ i32 g;

    public /* synthetic */ fd1(i32 i32Var, int i) {
        this.f = i;
        this.g = i32Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int iN;
        int iK;
        int i = this.f;
        i32 i32Var = this.g;
        switch (i) {
            case 0:
                iN = i32Var.n();
                break;
            case 1:
                iN = i32Var.n();
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return Integer.valueOf(i32Var.k.b() ? i32Var.r.g() : i32Var.k());
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                boolean zB = i32Var.k.b();
                a42 a42Var = i32Var.q;
                if (!zB) {
                    iK = i32Var.k();
                } else if (a42Var.g() != -1) {
                    iK = a42Var.g();
                } else {
                    float fAbs = Math.abs(i32Var.l());
                    ua0 ua0Var = i32Var.n;
                    j32 j32Var = k32.a;
                    if (fAbs >= Math.abs(Math.min(ua0Var.T(56.0f), i32Var.o() / 2.0f) / i32Var.o())) {
                        boolean zBooleanValue = ((Boolean) i32Var.D.getValue()).booleanValue();
                        int i2 = i32Var.e;
                        iK = zBooleanValue ? i2 + 1 : i2;
                    } else {
                        iK = i32Var.k();
                    }
                }
                iN = i32Var.j(iK);
                break;
            default:
                iN = i32Var.n();
                break;
        }
        return Integer.valueOf(iN);
    }
}
