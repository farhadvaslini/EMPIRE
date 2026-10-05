package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ro3 extends mo3 {
    public final bx0 b;
    public String c;
    public boolean d;
    public final lf0 e;
    public cs0 f;
    public final d42 g;
    public xm h;
    public final d42 i;
    public long j;
    public float k;
    public float l;
    public final qo3 m;

    public ro3(bx0 bx0Var) {
        this.b = bx0Var;
        bx0Var.i = new qo3(this, 0);
        this.c = "";
        this.d = true;
        this.e = new lf0();
        this.f = new v3(23);
        this.g = b32.w(null);
        this.i = b32.w(new h43(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new qo3(this, 1);
    }

    @Override // defpackage.mo3
    public final void a(qf0 qf0Var) {
        e(qf0Var, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.qf0 r35, float r36, defpackage.yx r37) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro3.e(qf0, float, yx):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        d42 d42Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((h43) d42Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((h43) d42Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
