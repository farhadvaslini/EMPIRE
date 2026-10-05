package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class po3 implements js3 {
    public final String a;
    public final d42 b;

    public po3(q31 q31Var, String str) {
        this.a = str;
        this.b = b32.w(q31Var);
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

    public final q31 e() {
        return (q31) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof po3) {
            return s51.n(e(), ((po3) obj).e());
        }
        return false;
    }

    public final void f(q31 q31Var) {
        this.b.setValue(q31Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ")";
    }
}
