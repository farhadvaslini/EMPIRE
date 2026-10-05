package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cq2 implements al2 {
    public zq2 f;
    public gq2 g;
    public String h;
    public Object i;
    public Object[] j;
    public fq2 k;
    public final it1 l = new it1(11, this);

    public cq2(zq2 zq2Var, gq2 gq2Var, String str, Object obj, Object[] objArr) {
        this.f = zq2Var;
        this.g = gq2Var;
        this.h = str;
        this.i = obj;
        this.j = objArr;
    }

    @Override // defpackage.al2
    public final void a() throws PendingIntent.CanceledException {
        b();
    }

    public final void b() throws PendingIntent.CanceledException {
        String strR;
        gq2 gq2Var = this.g;
        fq2 fq2Var = this.k;
        if (fq2Var != null) {
            qn1.m(fq2Var, ") is not null", "entry(");
            return;
        }
        if (gq2Var != null) {
            it1 it1Var = this.l;
            Object objA = it1Var.a();
            if (objA == null || gq2Var.b(objA)) {
                this.k = gq2Var.a(this.h, it1Var);
                return;
            }
            if (objA instanceof f73) {
                f73 f73Var = (f73) objA;
                if (f73Var.d() == f5.f0 || f73Var.d() == m22.u || f73Var.d() == m22.k) {
                    strR = "MutableState containing " + f73Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strR = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strR = oz2.r(objA);
            }
            throw new IllegalArgumentException(strR);
        }
    }

    @Override // defpackage.al2
    public final void d() {
        fq2 fq2Var = this.k;
        if (fq2Var != null) {
            ((pi) fq2Var).S();
        }
    }

    @Override // defpackage.al2
    public final void e() {
        fq2 fq2Var = this.k;
        if (fq2Var != null) {
            ((pi) fq2Var).S();
        }
    }
}
