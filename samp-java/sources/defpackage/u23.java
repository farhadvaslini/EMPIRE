package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qe a() {
        /*
            r2 = this;
            boolean r0 = r2.c()
            r1 = 0
            if (r0 == 0) goto L28
            np3 r2 = r2.l
            if (r2 == 0) goto L21
            float r2 = r2.b()
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L1a
            r1 = r0
        L1a:
            if (r1 == 0) goto L21
            float r2 = r1.floatValue()
            goto L22
        L21:
            r2 = 0
        L22:
            qe r0 = new qe
            r0.<init>(r2)
            return r0
        L28:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u23.a():qe");
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
