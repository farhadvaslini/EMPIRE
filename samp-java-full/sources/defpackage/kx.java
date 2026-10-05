package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class kx {
    public int f;
    public Object g;

    public kx(int i) {
        this.f = i;
    }

    public abstract int A();

    public abstract long B();

    public abstract boolean C(int i);

    public void D() {
        int iZ;
        do {
            iZ = z();
            if (iZ == 0) {
                return;
            }
            int i = this.f;
            if (i >= 100) {
                throw new z51("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f = i + 1;
            this.f--;
        } while (C(iZ));
    }

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract mt3 f(mt3 mt3Var, List list);

    public abstract ar2 h(ss3 ss3Var, ar2 ar2Var);

    public abstract void i(int i);

    public abstract int j(int i);

    public abstract boolean k();

    public abstract jq l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int r();

    public abstract long s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract String x();

    public abstract String y();

    public abstract int z();

    public void d(ss3 ss3Var) {
    }

    public void e(ss3 ss3Var) {
    }
}
