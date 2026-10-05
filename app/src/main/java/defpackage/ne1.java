package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ne1 extends w83 {
    public final p40 k;

    public ne1(o50 o50Var, rs0 rs0Var) {
        super(o50Var, false);
        this.k = vr.w(this, this, rs0Var);
    }

    @Override // defpackage.q61
    public final void e0() throws Throwable {
        try {
            s51.A(vr.I(this.k), dm3.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof vb0) {
                th = ((vb0) th).f;
            }
            t(y02.l(th));
            throw th;
        }
    }
}
