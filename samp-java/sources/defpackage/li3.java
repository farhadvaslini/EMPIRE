package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class li3 extends xw {
    public boolean R;
    public ns0 S;
    public final sg3 T;

    public li3(boolean z, qr1 qr1Var, boolean z2, no2 no2Var, ns0 ns0Var) {
        super(qr1Var, null, false, z2, null, no2Var, new et(10, ns0Var, z));
        this.R = z;
        this.S = ns0Var;
        this.T = new sg3(2, this);
    }

    @Override // defpackage.r
    public final void s1(dv2 dv2Var) {
        bv2.k(dv2Var, this.R ? mi3.f : mi3.g);
        bv2.c(dv2Var, f5.K);
        bv2.f(dv2Var, new z8(AutofillValue.forToggle(this.R)));
        bv2.b(dv2Var, new pt(dv2Var, 1));
    }
}
