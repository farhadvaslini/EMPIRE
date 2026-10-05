package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class u23 {
    public final d42 a;
    public final d42 b;
    public final wc1 c;
    public final long d;
    public ab1 e;
    public long f;
    public float g;
    public float h;
    public long i;
    public long j;
    public float k;
    public np3 l;

    public u23() {
        Boolean bool = Boolean.FALSE;
        this.a = b32.w(bool);
        this.b = b32.w(bool);
        this.c = new wc1(1);
        this.d = hq1.a();
        this.f = wx.f;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = wj3.b;
        this.j = 0L;
        this.k = 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qe a() {
        float fFloatValue;
        if (!c()) {
            return null;
        }
        np3 np3Var = this.l;
        if (np3Var != null) {
            float fB = np3Var.b();
            Float fValueOf = Float.isNaN(fB) ? null : Float.valueOf(fB);
            fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        }
        return new qe(fFloatValue);
    }

    public final re b() {
        if (!c()) {
            return null;
        }
        float fB = lp3.b(0L);
        Float fValueOf = Float.valueOf(fB);
        if (Float.isNaN(fB)) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        float fC = lp3.c(0L);
        Float fValueOf2 = Float.isNaN(fC) ? null : Float.valueOf(fC);
        return new re(fFloatValue, fValueOf2 != null ? fValueOf2.floatValue() : 0.0f);
    }

    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void e(boolean z) {
        d42 d42Var = this.a;
        boolean zBooleanValue = ((Boolean) d42Var.getValue()).booleanValue();
        d42 d42Var2 = this.b;
        if (zBooleanValue && !z) {
            d42Var2.setValue(Boolean.TRUE);
        } else if (z) {
            d42Var2.setValue(Boolean.FALSE);
        }
        d42Var.setValue(Boolean.valueOf(z));
    }
}
