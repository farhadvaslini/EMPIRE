package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class q50 extends y implements m50 {
    public static final p50 g = new p50(f5.L, new n20(1));

    public q50() {
        super(f5.L);
    }

    public abstract void B(o50 o50Var, Runnable runnable);

    public void C(o50 o50Var, Runnable runnable) throws vb0 {
        s51.B(this, o50Var, runnable);
    }

    public boolean D(o50 o50Var) {
        return !(this instanceof wl3);
    }

    public q50 E(int i) {
        uq.k(i);
        return new yf1(this, i);
    }

    @Override // defpackage.y, defpackage.o50
    public final m50 m(n50 n50Var) {
        m50 m50Var;
        n50Var.getClass();
        if (n50Var instanceof p50) {
            p50 p50Var = (p50) n50Var;
            n50 n50Var2 = this.f;
            if ((n50Var2 == p50Var || p50Var.g == n50Var2) && (m50Var = (m50) p50Var.f.h(this)) != null) {
                return m50Var;
            }
        } else if (f5.L == n50Var) {
            return this;
        }
        return null;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + f80.D(this);
    }

    @Override // defpackage.y, defpackage.o50
    public final o50 u(n50 n50Var) {
        n50Var.getClass();
        if (n50Var instanceof p50) {
            p50 p50Var = (p50) n50Var;
            n50 n50Var2 = this.f;
            if ((n50Var2 != p50Var && p50Var.g != n50Var2) || ((m50) p50Var.f.h(this)) == null) {
                return this;
            }
        } else if (f5.L != n50Var) {
            return this;
        }
        return li0.f;
    }
}
