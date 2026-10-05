package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class hb3 {
    public static final t20 a = new t20(new f62(17));

    public static final void a(bq1 bq1Var, z13 z13Var, long j, long j2, float f, float f2, ln lnVar, d00 d00Var, nv0 nv0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            bq1Var = yp1.a;
        }
        if ((i2 & 2) != 0) {
            z13Var = cl3.q0;
        }
        if ((i2 & 4) != 0) {
            j = ((fy) nv0Var.j(hy.a)).p;
        }
        if ((i2 & 8) != 0) {
            j2 = hy.b(j, nv0Var);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            lnVar = null;
        }
        t20 t20Var = a;
        float f3 = f + ((jd0) nv0Var.j(t20Var)).f;
        vr.d(new he2[]{nc2.f(j2, t30.a), t20Var.a(new jd0(f3))}, gq.N(421772006, new eb3(bq1Var, z13Var, j, f3, lnVar, f2, d00Var), nv0Var), nv0Var, 56);
    }

    public static final void b(boolean z, cs0 cs0Var, bq1 bq1Var, boolean z2, z13 z13Var, long j, long j2, float f, ln lnVar, qr1 qr1Var, d00 d00Var, nv0 nv0Var, int i, int i2) {
        qr1 qr1Var2;
        long jB = (i2 & 64) != 0 ? hy.b(j, nv0Var) : j2;
        float f2 = (i2 & 256) != 0 ? 0.0f : f;
        if (qr1Var == null) {
            nv0Var.a0(1528143336);
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = nc2.e(nv0Var);
            }
            nv0Var.p(false);
            qr1Var2 = (qr1) objO;
        } else {
            nv0Var.a0(-227800369);
            nv0Var.p(false);
            qr1Var2 = qr1Var;
        }
        t20 t20Var = a;
        float f3 = ((jd0) nv0Var.j(t20Var)).f + 0.0f;
        vr.d(new he2[]{nc2.f(jB, t30.a), t20Var.a(new jd0(f3))}, gq.N(1508735219, new gb3(bq1Var, z13Var, j, f3, lnVar, z, qr1Var2, z2, cs0Var, f2, d00Var), nv0Var), nv0Var, 56);
    }

    public static final void c(cs0 cs0Var, bq1 bq1Var, boolean z, z13 z13Var, long j, long j2, float f, ln lnVar, qr1 qr1Var, d00 d00Var, nv0 nv0Var, int i, int i2) {
        qr1 qr1Var2;
        long jB = (i2 & 32) != 0 ? hy.b(j, nv0Var) : j2;
        float f2 = (i2 & 128) != 0 ? 0.0f : f;
        if (qr1Var == null) {
            nv0Var.a0(-1701037204);
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = nc2.e(nv0Var);
            }
            nv0Var.p(false);
            qr1Var2 = (qr1) objO;
        } else {
            nv0Var.a0(2023337163);
            nv0Var.p(false);
            qr1Var2 = qr1Var;
        }
        t20 t20Var = a;
        float f3 = ((jd0) nv0Var.j(t20Var)).f + 0.0f;
        vr.d(new he2[]{nc2.f(jB, t30.a), t20Var.a(new jd0(f3))}, gq.N(849208527, new fb3(bq1Var, z13Var, j, f3, lnVar, qr1Var2, z, cs0Var, f2, d00Var), nv0Var), nv0Var, 56);
    }

    public static final bq1 d(bq1 bq1Var, z13 z13Var, long j, ln lnVar, float f) {
        z13 z13Var2;
        bq1 bq1VarB;
        bq1 knVar = yp1.a;
        if (f > 0.0f) {
            z13Var2 = z13Var;
            bq1VarB = vm1.B(knVar, 0.0f, 0.0f, 0.0f, f, z13Var2, 124895);
        } else {
            z13Var2 = z13Var;
            bq1VarB = knVar;
        }
        bq1 bq1VarD = bq1Var.d(bq1VarB);
        if (lnVar != null) {
            knVar = new kn(lnVar.a, lnVar.b, z13Var2);
        }
        return gq.t(gv3.v(bq1VarD.d(knVar), j, z13Var2), z13Var2);
    }

    public static final long e(long j, float f, nv0 nv0Var) {
        fy fyVar = (fy) nv0Var.j(hy.a);
        boolean zBooleanValue = ((Boolean) nv0Var.j(hy.b)).booleanValue();
        long j2 = fyVar.p;
        return (wx.c(j, j2) && zBooleanValue) ? jd0.b(f, 0.0f) ? j2 : vp.x(wx.b(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, fyVar.t), j2) : j;
    }
}
