package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wb implements ge3 {
    public final View a;
    public final ns0 b;
    public final cs0 c;
    public final zs1 d = new zs1();
    public final p73 e = new p73(new qb(this, 0));
    public final qb f = new qb(this, 1);
    public final qb g = new qb(this, 2);
    public ActionMode h;
    public vb i;
    public Runnable j;

    public wb(View view, ns0 ns0Var, cs0 cs0Var) {
        this.a = view;
        this.b = ns0Var;
        this.c = cs0Var;
    }

    @Override // defpackage.ge3
    public final Object a(yd3 yd3Var, mb3 mb3Var) {
        p40 p40Var = null;
        x5 x5Var = new x5(this, yd3Var, p40Var, 1);
        zs1 zs1Var = this.d;
        zs1Var.getClass();
        Object objW = ur.w(new e51(ts1.f, zs1Var, x5Var, p40Var, 1), mb3Var);
        return objW == y50.f ? objW : dm3.a;
    }
}
