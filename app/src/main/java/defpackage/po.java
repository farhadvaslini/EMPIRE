package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class po {
    public final qs1 a;

    public po(int i) {
        switch (i) {
            case 1:
                this.a = new qs1(new oc1[16]);
                break;
            default:
                this.a = new qs1(new v30[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        qs1 qs1Var = this.a;
        int i = qs1Var.h;
        hr[] hrVarArr = new hr[i];
        for (int i2 = 0; i2 < i; i2++) {
            hrVarArr[i2] = ((v30) qs1Var.f[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            hrVarArr[i3].C(cancellationException);
        }
        if (qs1Var.h == 0) {
            return;
        }
        p21.c("uncancelled requests present");
    }

    public void b() {
        qs1 qs1Var = this.a;
        l41 l41VarS = y02.S(0, qs1Var.h);
        int i = l41VarS.f;
        int i2 = l41VarS.g;
        if (i <= i2) {
            while (true) {
                ((v30) qs1Var.f[i]).b.t(dm3.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        qs1Var.g();
    }
}
