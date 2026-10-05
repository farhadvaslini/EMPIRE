package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gp1 extends w {
    public final d42 o;
    public boolean p;

    public gp1(Context context) {
        super(context);
        this.o = b32.w(o00.a);
    }

    @Override // defpackage.w
    public final void a(int i, nv0 nv0Var) {
        nv0Var.b0(576708319);
        int i2 = (nv0Var.h(this) ? 4 : 2) | i;
        if (nv0Var.R(i2 & 1, (i2 & 3) != 2)) {
            ((rs0) this.o.getValue()).f(nv0Var, 0);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new u(i, 20, this);
        }
    }

    @Override // defpackage.w
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.p;
    }
}
