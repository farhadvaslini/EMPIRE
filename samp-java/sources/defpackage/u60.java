package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class u60 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ z60 g;

    public /* synthetic */ u60(z60 z60Var, int i) {
        this.f = i;
        this.g = z60Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        z60 z60Var = this.g;
        switch (i) {
            case 0:
                z60Var.f.h(z60Var);
                z60Var.g();
                return dm3.a;
            case 1:
                return Float.valueOf(((Number) z60Var.h.d()).floatValue());
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return zx0.a(zx0.e, 0.0f, 0.0f, z60Var.b(), 11);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new q13(0L, z60Var.b(), 23);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new u21(z60Var.b() * 8.0f, z60Var.b(), 22);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return zx0.a(zx0.e, 0.0f, 0.0f, z60Var.b(), 11);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return Float.valueOf(lq.N(1.0f, 1.2f, z60Var.b()));
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                float fB = z60Var.b();
                return new u21(4.0f * fB, fB, 22);
            case 8:
                float fB2 = z60Var.b();
                zx0 zx0Var = zx0.f;
                return zx0.a(zx0Var, zx0Var.a / 1.5f, zx0Var.b / 1.5f, fB2, 8);
            case vr.g /* 9 */:
                float fB3 = z60Var.b();
                zx0 zx0Var2 = zx0.f;
                return zx0.a(zx0Var2, zx0Var2.a / 1.5f, zx0Var2.b / 1.5f, fB3, 8);
            default:
                float fB4 = z60Var.b();
                return new u21(4.0f * fB4, fB4, 22);
        }
    }
}
