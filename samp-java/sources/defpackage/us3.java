package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class us3 extends at3 {
    public final WindowInsets.Builder e;

    public us3(mt3 mt3Var) {
        super(mt3Var);
        WindowInsets windowInsetsB = mt3Var.b();
        this.e = windowInsetsB != null ? w93.j(windowInsetsB) : xw0.g();
    }

    @Override // defpackage.at3
    public mt3 b() {
        a();
        mt3 mt3VarC = mt3.c(this.e.build(), null);
        h31[] h31VarArr = this.b;
        jt3 jt3Var = mt3VarC.a;
        jt3Var.w(h31VarArr);
        jt3Var.v(null);
        jt3Var.B(this.c);
        jt3Var.C(this.d);
        return mt3VarC;
    }

    @Override // defpackage.at3
    public void e(h31 h31Var) {
        this.e.setMandatorySystemGestureInsets(h31Var.d());
    }

    @Override // defpackage.at3
    public void f(h31 h31Var) {
        this.e.setStableInsets(h31Var.d());
    }

    @Override // defpackage.at3
    public void g(h31 h31Var) {
        this.e.setSystemGestureInsets(h31Var.d());
    }

    @Override // defpackage.at3
    public void h(h31 h31Var) {
        this.e.setSystemWindowInsets(h31Var.d());
    }

    @Override // defpackage.at3
    public void i(h31 h31Var) {
        this.e.setTappableElementInsets(h31Var.d());
    }

    public us3() {
        this.e = xw0.g();
    }
}
