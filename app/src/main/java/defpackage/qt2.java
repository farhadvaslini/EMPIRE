package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qt2 {
    public static final qt2 a = new qt2();
    public static final float b = w7.Y;
    public static final float c = w7.d0;
    public static final b22 d = xp.b;

    public static z13 c(int i, nv0 nv0Var) {
        z13 z13VarA = g23.a(w7.b0, nv0Var);
        z13VarA.getClass();
        to2 to2Var = (to2) z13VarA;
        if (i == 0) {
            kd0 kd0Var = a23.i;
            return to2.b(to2Var, null, kd0Var, kd0Var, null, 9);
        }
        if (i != 1) {
            return cl3.q0;
        }
        kd0 kd0Var2 = a23.i;
        return to2.b(to2Var, kd0Var2, null, null, kd0Var2, 6);
    }

    public final void a(int i, nv0 nv0Var) {
        nv0 nv0Var2;
        nv0Var.b0(-1273041460);
        int i2 = 0;
        if (nv0Var.R(i & 1, (i & 3) != 2)) {
            w01 w01VarB = gq.f;
            if (w01VarB == null) {
                v01 v01Var = new v01("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i3 = vo3.a;
                w73 w73Var = new w73(wx.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new q42(9.0f, 16.17f));
                arrayList.add(new p42(4.83f, 12.0f));
                arrayList.add(new x42(-1.42f, 1.41f));
                arrayList.add(new p42(9.0f, 19.0f));
                arrayList.add(new p42(21.0f, 7.0f));
                arrayList.add(new x42(-1.41f, -1.41f));
                arrayList.add(m42.c);
                v01.a(v01Var, arrayList, w73Var);
                w01VarB = v01Var.b();
                gq.f = w01VarB;
            }
            nv0Var2 = nv0Var;
            s01.a(w01VarB, null, j43.k(yp1.a, c), 0L, nv0Var2, 48, 8);
        } else {
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new pt2(i, i2, this);
        }
    }

    public final void b(boolean z, rs0 rs0Var, nv0 nv0Var, int i) {
        rs0 rs0Var2;
        nv0Var.b0(-657462570);
        int i2 = i | (nv0Var.g(z) ? 4 : 2) | 432;
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            d00 d00Var = t00.a;
            nv0Var.a0(-1416314439);
            vm1.c(z, null, dj0.f(uq.R(pq1.h, nv0Var), 2).a(new ij0(new fk3((cl0) null, (q43) null, (hs) null, new kr2(0.0f, d32.g(0.0f, 1.0f), uq.R(pq1.g, nv0Var)), (LinkedHashMap) null, 119))), ek0.b, null, gq.N(2059591811, new i00(3), nv0Var), nv0Var, (i2 & 14) | 196608, 18);
            nv0Var.p(false);
            rs0Var2 = d00Var;
        } else {
            nv0Var.U();
            rs0Var2 = rs0Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new zv(this, z, rs0Var2, i, 3);
        }
    }
}
