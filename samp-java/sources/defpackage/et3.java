package defpackage;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class et3 extends dt3 {
    public h31 t;
    public h31 u;
    public h31 v;

    public et3(mt3 mt3Var, WindowInsets windowInsets) {
        super(mt3Var, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.jt3
    public h31 k() {
        if (this.u == null) {
            this.u = h31.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.u;
    }

    @Override // defpackage.jt3
    public h31 m() {
        if (this.t == null) {
            this.t = h31.c(this.c.getSystemGestureInsets());
        }
        return this.t;
    }

    @Override // defpackage.jt3
    public h31 o() {
        if (this.v == null) {
            this.v = h31.c(this.c.getTappableElementInsets());
        }
        return this.v;
    }

    @Override // defpackage.bt3, defpackage.jt3
    public mt3 r(int i, int i2, int i3, int i4) {
        return mt3.c(this.c.inset(i, i2, i3, i4), null);
    }

    public et3(mt3 mt3Var, et3 et3Var) {
        super(mt3Var, et3Var);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.ct3, defpackage.jt3
    public void z(h31 h31Var) {
    }
}
