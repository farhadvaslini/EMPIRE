package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class d23 {
    public bb1 a;
    public long b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;

    public d23(bb1 bb1Var, ua0 ua0Var, zp0 zp0Var, gh3 gh3Var, Object obj) {
        this.a = bb1Var;
        this.c = ua0Var;
        this.d = zp0Var;
        this.e = gh3Var;
        this.f = obj;
        this.g = b32.w(Boolean.TRUE);
        this.b = 0L;
    }

    public static void a(d23 d23Var, bb1 bb1Var, ua0 ua0Var, gh3 gh3Var, int i) {
        if ((i & 1) != 0) {
            bb1Var = d23Var.a;
        }
        if ((i & 2) != 0) {
            ua0Var = (ua0) d23Var.c;
        }
        zp0 zp0Var = (zp0) d23Var.d;
        if ((i & 8) != 0) {
            gh3Var = (gh3) d23Var.e;
        }
        Object obj = d23Var.f;
        bb1 bb1Var2 = d23Var.a;
        d42 d42Var = (d42) d23Var.g;
        if (bb1Var == bb1Var2 && s51.n(ua0Var, (ua0) d23Var.c) && s51.n(zp0Var, (zp0) d23Var.d) && s51.n(gh3Var, (gh3) d23Var.e)) {
            if (s51.n(obj, d23Var.f)) {
                return;
            }
            d23Var.f = obj;
            d42Var.setValue(Boolean.TRUE);
            return;
        }
        d23Var.a = bb1Var;
        d23Var.c = ua0Var;
        d23Var.d = zp0Var;
        d23Var.e = gh3Var;
        d42Var.setValue(Boolean.TRUE);
    }

    public d23(cs0 cs0Var) {
        cs0Var.getClass();
        this.c = cs0Var;
        this.b = 9205357640488583168L;
        this.g = new c23(0, this);
    }
}
