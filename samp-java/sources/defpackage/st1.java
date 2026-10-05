package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class st1 {
    public final qt1 a;
    public final fu1 b;
    public final Bundle c;
    public ff1 d;
    public final xt1 e;
    public final String f;
    public final Bundle g;
    public final uq2 h;
    public boolean i;
    public final rf1 j;
    public ff1 k;
    public final xq2 l;

    public st1(qt1 qt1Var) {
        this.a = qt1Var;
        this.b = qt1Var.g;
        this.c = qt1Var.h;
        this.d = qt1Var.i;
        this.e = qt1Var.j;
        this.f = qt1Var.k;
        this.g = qt1Var.l;
        this.h = new uq2(new vq2(qt1Var, new it1(14, qt1Var)));
        xb3 xb3Var = new xb3(new x91(23));
        this.j = new rf1(qt1Var, true);
        this.k = ff1.g;
        this.l = (xq2) xb3Var.getValue();
        new xb3(new x91(24));
    }

    public final Bundle a() {
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
        bundleU.putAll(bundle);
        return bundleU;
    }

    public final void b() {
        if (!this.i) {
            uq2 uq2Var = this.h;
            uq2Var.a.a();
            this.i = true;
            if (this.e != null) {
                f80.A(this.a);
            }
            uq2Var.a(this.g);
        }
        int iOrdinal = this.d.ordinal();
        int iOrdinal2 = this.k.ordinal();
        rf1 rf1Var = this.j;
        if (iOrdinal < iOrdinal2) {
            ff1 ff1Var = this.d;
            rf1Var.getClass();
            ff1Var.getClass();
            rf1Var.d("setCurrentState");
            rf1Var.f(ff1Var);
            return;
        }
        ff1 ff1Var2 = this.k;
        rf1Var.getClass();
        ff1Var2.getClass();
        rf1Var.d("setCurrentState");
        rf1Var.f(ff1Var2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(rk2.a(qt1.class).c());
        sb.append("(" + this.f + ')');
        sb.append(" destination=");
        sb.append(this.b);
        return sb.toString();
    }
}
