package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wm extends o32 {
    public final g9 e;
    public final long f;
    public final int g;
    public final long h;
    public float i;
    public yx j;

    public wm(g9 g9Var) {
        int i;
        long width = (((long) g9Var.a.getWidth()) << 32) | (((long) g9Var.a.getHeight()) & 4294967295L);
        this.e = g9Var;
        this.f = width;
        this.g = 1;
        int i2 = (int) (width >> 32);
        if (i2 < 0 || (i = (int) (width & 4294967295L)) < 0 || i2 > g9Var.a.getWidth() || i > g9Var.a.getHeight()) {
            c.p("Failed requirement.");
            throw null;
        }
        this.h = width;
        this.i = 1.0f;
    }

    @Override // defpackage.o32
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.o32
    public final void b(yx yxVar) {
        this.j = yxVar;
    }

    @Override // defpackage.o32
    public final long d() {
        return lr.T(this.h);
    }

    @Override // defpackage.o32
    public final void e(vb1 vb1Var) {
        rr rrVar = vb1Var.f;
        qf0.E0(vb1Var, this.e, this.f, (((long) Math.round(Float.intBitsToFloat((int) (rrVar.a() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (rrVar.a() & 4294967295L)))) & 4294967295L), this.i, this.j, this.g, 328);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wm)) {
            return false;
        }
        wm wmVar = (wm) obj;
        return s51.n(this.e, wmVar.e) && i41.a(0L, 0L) && p41.b(this.f, wmVar.f) && this.g == wmVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + nc2.c(this.f, nc2.c(0L, this.e.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String strD = i41.d(0L);
        String strC = p41.c(this.f);
        int i = this.g;
        return "BitmapPainter(image=" + this.e + ", srcOffset=" + strD + ", srcSize=" + strC + ", filterQuality=" + (i == 0 ? "None" : i == 1 ? "Low" : i == 2 ? "Medium" : i == 3 ? "High" : "Unknown") + ")";
    }
}
