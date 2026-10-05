package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class um1 {
    public static final r93 a = new r93(new x91(21));

    public static final void a(fy fyVar, oq1 oq1Var, f23 f23Var, ol3 ol3Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(904511636);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(fyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(oq1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.f(f23Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.f(ol3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.h(d00Var) ? 16384 : 8192;
        }
        if (nv0Var.R(i2 & 1, (i2 & 9363) != 9362)) {
            nv0Var.W();
            if ((i & 1) != 0 && !nv0Var.A()) {
                nv0Var.U();
            }
            nv0Var.q();
            mo2 mo2VarA = ko2.a(0.0f, 7, 0L, false);
            long j = fyVar.a;
            boolean zE = nv0Var.e(j);
            Object objO = nv0Var.O();
            if (zE || objO == c20.a) {
                objO = new ah3(j, wx.b(0.4f, j));
                nv0Var.j0(objO);
            }
            vr.d(new he2[]{hy.a.a(fyVar), a.a(oq1Var), l11.a.a(mo2VarA), g23.a.a(f23Var), bh3.a.a((ah3) objO), ql3.a.a(ol3Var)}, gq.N(-1750539308, new z4(i3, ol3Var, d00Var), nv0Var), nv0Var, 56);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new tm1(fyVar, oq1Var, f23Var, ol3Var, d00Var, i, 0);
        }
    }

    public static final void b(fy fyVar, f23 f23Var, ol3 ol3Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        f23 f23Var2;
        ol3 ol3Var2;
        int i3;
        nv0Var.b0(-449719819);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(fyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.h(d00Var) ? 2048 : 1024;
        }
        if (nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                f23Var2 = (f23) nv0Var.j(g23.a);
                ol3Var2 = (ol3) nv0Var.j(ql3.a);
                i3 = i2 & (-1009);
            } else {
                nv0Var.U();
                i3 = i2 & (-1009);
                f23Var2 = f23Var;
                ol3Var2 = ol3Var;
            }
            nv0Var.q();
            a(fyVar, (oq1) nv0Var.j(a), f23Var2, ol3Var2, d00Var, nv0Var, ((i3 << 3) & 57344) | (i3 & 14));
        } else {
            nv0Var.U();
            f23Var2 = f23Var;
            ol3Var2 = ol3Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new v4(fyVar, f23Var2, ol3Var2, d00Var, i, 5);
        }
    }
}
