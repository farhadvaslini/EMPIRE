package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class m61 extends uj1 implements kc0, g11 {
    public q61 l;

    @Override // defpackage.kc0
    public final void a() {
        q().h0(this);
    }

    @Override // defpackage.g11
    public final boolean b() {
        return true;
    }

    @Override // defpackage.g11
    public final gx1 d() {
        return null;
    }

    public j61 getParent() {
        return q();
    }

    public final q61 q() {
        q61 q61Var = this.l;
        if (q61Var != null) {
            return q61Var;
        }
        s51.F("job");
        throw null;
    }

    public abstract boolean r();

    public abstract void s(Throwable th);

    @Override // defpackage.uj1
    public final String toString() {
        return getClass().getSimpleName() + '@' + f80.D(this) + "[job@" + f80.D(q()) + ']';
    }
}
