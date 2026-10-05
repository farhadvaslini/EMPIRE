package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ad implements js3 {
    public final int a;
    public final String b;
    public final d42 c = b32.w(h31.e);
    public final d42 d = b32.w(Boolean.TRUE);

    public ad(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.js3
    public final int a(ua0 ua0Var) {
        return e().d;
    }

    @Override // defpackage.js3
    public final int b(ua0 ua0Var) {
        return e().b;
    }

    @Override // defpackage.js3
    public final int c(ua0 ua0Var, bb1 bb1Var) {
        return e().c;
    }

    @Override // defpackage.js3
    public final int d(ua0 ua0Var, bb1 bb1Var) {
        return e().a;
    }

    public final h31 e() {
        return (h31) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ad) {
            return this.a == ((ad) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(mt3 mt3Var, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(mt3Var.a.i(i2));
            f(mt3Var.a.u(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + "(" + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ")";
    }
}
