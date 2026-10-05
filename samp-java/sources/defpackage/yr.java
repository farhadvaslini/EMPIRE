package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yr {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public yr(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.e93 a(boolean r15, defpackage.qr1 r16, defpackage.nv0 r17, int r18) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yr.a(boolean, qr1, nv0, int):e93");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof yr)) {
            return false;
        }
        yr yrVar = (yr) obj;
        return jd0.b(this.a, yrVar.a) && jd0.b(this.b, yrVar.b) && jd0.b(0.0f, 0.0f) && jd0.b(this.c, yrVar.c) && jd0.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + nc2.a(nc2.a(nc2.a(Float.hashCode(this.a) * 31, this.b, 31), 0.0f, 31), this.c, 31);
    }
}
