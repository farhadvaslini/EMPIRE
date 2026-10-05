package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xf1 implements js3 {
    public final js3 a;
    public final int b;

    public xf1(js3 js3Var, int i) {
        this.a = js3Var;
        this.b = i;
    }

    @Override // defpackage.js3
    public final int a(ua0 ua0Var) {
        if ((this.b & 32) != 0) {
            return this.a.a(ua0Var);
        }
        return 0;
    }

    @Override // defpackage.js3
    public final int b(ua0 ua0Var) {
        if ((this.b & 16) != 0) {
            return this.a.b(ua0Var);
        }
        return 0;
    }

    @Override // defpackage.js3
    public final int c(ua0 ua0Var, bb1 bb1Var) {
        if (((bb1Var == bb1.f ? 4 : 1) & this.b) != 0) {
            return this.a.c(ua0Var, bb1Var);
        }
        return 0;
    }

    @Override // defpackage.js3
    public final int d(ua0 ua0Var, bb1 bb1Var) {
        if (((bb1Var == bb1.f ? 8 : 2) & this.b) != 0) {
            return this.a.d(ua0Var, bb1Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf1)) {
            return false;
        }
        xf1 xf1Var = (xf1) obj;
        return s51.n(this.a, xf1Var.a) && this.b == xf1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        int i2 = jo3.c;
        if ((i & i2) == i2) {
            jo3.z(sb, "Start");
        }
        int i3 = jo3.e;
        if ((i & i3) == i3) {
            jo3.z(sb, "Left");
        }
        if ((i & 16) == 16) {
            jo3.z(sb, "Top");
        }
        int i4 = jo3.d;
        if ((i & i4) == i4) {
            jo3.z(sb, "End");
        }
        int i5 = jo3.f;
        if ((i & i5) == i5) {
            jo3.z(sb, "Right");
        }
        if ((i & 32) == 32) {
            jo3.z(sb, "Bottom");
        }
        return "(" + this.a + " only " + nc2.i("WindowInsetsSides(", sb.toString(), ")") + ")";
    }
}
