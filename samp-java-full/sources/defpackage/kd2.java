package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kd2 extends x implements js, lv2 {
    public final np k;

    public kd2(o50 o50Var, np npVar) {
        super(o50Var, true);
        this.k = npVar;
    }

    @Override // defpackage.q61
    public final void G(CancellationException cancellationException) {
        this.k.i(cancellationException, true);
        F(cancellationException);
    }

    @Override // defpackage.lv2
    public final Object a(p40 p40Var, Object obj) {
        return this.k.a(p40Var, obj);
    }

    @Override // defpackage.q61, defpackage.j61, defpackage.js
    public final void c(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new k61(I(), null, this);
        }
        G(cancellationException);
    }

    @Override // defpackage.js
    public final Object e(mb3 mb3Var) {
        np npVar = this.k;
        npVar.getClass();
        return np.G(npVar, mb3Var);
    }

    @Override // defpackage.js
    public final Object g() {
        return this.k.g();
    }

    @Override // defpackage.js
    public final kp iterator() {
        np npVar = this.k;
        npVar.getClass();
        return new kp(npVar);
    }

    @Override // defpackage.lv2
    public final Object l(Object obj) {
        return this.k.l(obj);
    }

    @Override // defpackage.x
    public final void p0(Throwable th, boolean z) {
        if (this.k.i(th, false) || z) {
            return;
        }
        lr.K(this.j, th);
    }

    @Override // defpackage.x
    public final void q0(Object obj) {
        lv2.q(this.k);
    }

    @Override // defpackage.js
    public final Object s(vy vyVar) {
        np npVar = this.k;
        npVar.getClass();
        return np.H(npVar, vyVar);
    }
}
