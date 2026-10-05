package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rk3 extends xw {
    public mi3 R;

    @Override // defpackage.r
    public final void s1(dv2 dv2Var) {
        bv2.k(dv2Var, this.R);
        bv2.c(dv2Var, f5.K);
        bv2.f(dv2Var, new z8(AutofillValue.forToggle(this.R != mi3.h)));
        bv2.b(dv2Var, new pt(dv2Var, 2));
    }
}
