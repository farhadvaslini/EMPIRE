package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zx0 {
    public static final zx0 e = new zx0(null, 15);
    public static final zx0 f;
    public final float a;
    public final float b;
    public final float c;
    public final gy0 d;

    static {
        gy0.a.getClass();
        f = new zx0(dy0.c, 7);
        new zx0(dy0.d, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zx0(gy0 gy0Var, int i) {
        if ((i & 8) != 0) {
            gy0.a.getClass();
            gy0Var = dy0.b;
        }
        this(0.5f, 0.25f, 1.0f, gy0Var);
    }

    public static zx0 a(zx0 zx0Var, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f2 = zx0Var.a;
        }
        if ((i & 2) != 0) {
            f3 = zx0Var.b;
        }
        gy0 gy0Var = zx0Var.d;
        zx0Var.getClass();
        gy0Var.getClass();
        return new zx0(f2, f3, f4, gy0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx0)) {
            return false;
        }
        zx0 zx0Var = (zx0) obj;
        return jd0.b(this.a, zx0Var.a) && jd0.b(this.b, zx0Var.b) && Float.compare(this.c, zx0Var.c) == 0 && s51.n(this.d, zx0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + nc2.a(nc2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("Highlight(width=", jd0.c(this.a), ", blurRadius=", jd0.c(this.b), ", alpha=");
        sbN.append(this.c);
        sbN.append(", style=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }

    public zx0(float f2, float f3, float f4, gy0 gy0Var) {
        gy0Var.getClass();
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = gy0Var;
    }
}
