package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kk0 {
    public static final kk0 a = new kk0();

    static {
        if (!((16.0f >= 0.0f) & (16.0f >= 0.0f) & (0.0f >= 0.0f)) || !(0.0f >= 0.0f)) {
            k21.a("Padding must be non-negative");
        }
    }

    public final void a(boolean z, bq1 bq1Var, nv0 nv0Var, int i) {
        nv0 nv0Var2;
        nv0Var.b0(-1732824199);
        int i2 = (nv0Var.g(z) ? 4 : 2) | i | 48;
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            w01 w01VarB = gq.g;
            if (w01VarB == null) {
                v01 v01Var = new v01("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i3 = vo3.a;
                w73 w73Var = new w73(wx.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new q42(7.0f, 10.0f));
                arrayList.add(new x42(5.0f, 5.0f));
                arrayList.add(new x42(5.0f, -5.0f));
                arrayList.add(m42.c);
                v01.a(v01Var, arrayList, w73Var);
                w01VarB = v01Var.b();
                gq.g = w01VarB;
            }
            nv0Var2 = nv0Var;
            s01.a(w01VarB, null, t22.J(z ? 180.0f : 0.0f), 0L, nv0Var2, 48, 8);
            bq1Var = yp1.a;
        } else {
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        bq1 bq1Var2 = bq1Var;
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new zv(this, z, bq1Var2, i, 1);
        }
    }
}
