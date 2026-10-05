package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class k33 {
    public k33 a(m23 m23Var, i23 i23Var, long j, long j2, long j3) {
        throw new IllegalStateException(("Active match can only be configured in ActiveMatchFoundConfigPending or ActiveMatchConfigured state. Current state: " + this).toString());
    }

    public boolean b() {
        return this instanceof g3;
    }

    public jk2 c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public pl e() {
        return null;
    }

    public jk2 f(m23 m23Var) {
        return c();
    }

    public abstract k33 g(i23 i23Var);

    public abstract k33 h();

    public void i(jk2 jk2Var) {
    }
}
