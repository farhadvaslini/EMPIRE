package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class pt implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ dv2 g;

    public /* synthetic */ pt(dv2 dv2Var, int i) {
        this.f = i;
        this.g = dv2Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) throws Throwable {
        Boolean boolValueOf;
        int i = this.f;
        boolean z = false;
        mi3 mi3Var = mi3.g;
        mi3 mi3Var2 = mi3.f;
        dv2 dv2Var = this.g;
        switch (i) {
            case 0:
                nk3 nk3Var = (nk3) obj;
                nk3Var.getClass();
                g42 g42Var = (g42) nk3Var;
                g42Var.u = true;
                g42Var.t.h(dv2Var);
                y02.w(g42Var);
                return Boolean.FALSE;
            case 1:
                AutofillValue autofillValue = ((z8) obj).a;
                boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        mi3Var = mi3Var2;
                    }
                    bv2.k(dv2Var, mi3Var);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                AutofillValue autofillValue2 = ((z8) obj).a;
                boolValueOf = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        mi3Var = mi3Var2;
                    }
                    bv2.k(dv2Var, mi3Var);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
