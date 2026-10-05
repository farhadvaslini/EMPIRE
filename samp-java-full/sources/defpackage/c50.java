package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c50 implements cn1 {
    public final /* synthetic */ ye1 a;
    public final /* synthetic */ sf3 b;
    public final /* synthetic */ hs3 c;
    public final /* synthetic */ x50 d;
    public final /* synthetic */ ns0 e;
    public final /* synthetic */ bg3 f;
    public final /* synthetic */ iy1 g;
    public final /* synthetic */ ua0 h;
    public final /* synthetic */ so i;
    public final /* synthetic */ int j;

    public c50(ye1 ye1Var, sf3 sf3Var, hs3 hs3Var, x50 x50Var, ns0 ns0Var, bg3 bg3Var, iy1 iy1Var, ua0 ua0Var, so soVar, int i) {
        this.a = ye1Var;
        this.b = sf3Var;
        this.c = hs3Var;
        this.d = x50Var;
        this.e = ns0Var;
        this.f = bg3Var;
        this.g = iy1Var;
        this.h = ua0Var;
        this.i = soVar;
        this.j = i;
    }

    @Override // defpackage.cn1
    public final int b(k51 k51Var, List list, int i) {
        ye1 ye1Var = this.a;
        ye1Var.a.a(k51Var.getLayoutDirection());
        qk qkVar = (qk) ye1Var.a.g;
        if (qkVar != null) {
            return w22.j(qkVar.c());
        }
        c.q("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    @Override // defpackage.cn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dn1 c(en1 en1Var, List list, long j) {
        long j2;
        pg3 pg3Var;
        ye1 ye1Var;
        pg3 pg3Var2;
        qg3 qg3Var;
        pg3 pg3Var3;
        c50 c50Var;
        ye1 ye1Var2;
        og3 og3Var;
        ye1 ye1Var3 = this.a;
        t63 t63VarL = jo3.l();
        ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
        t63 t63VarS = jo3.s(t63VarL);
        try {
            qg3 qg3VarD = ye1Var3.d();
            pg3 pg3Var4 = qg3VarD != null ? qg3VarD.a : null;
            db0 db0Var = ye1Var3.a;
            bb1 layoutDirection = en1Var.getLayoutDirection();
            boolean z = db0Var.a;
            int iH = Integer.MAX_VALUE;
            if (pg3Var4 != null) {
                br1 br1Var = pg3Var4.b;
                og3 og3Var2 = pg3Var4.a;
                af afVar = (af) db0Var.b;
                gh3 gh3Var = (gh3) db0Var.c;
                List list2 = (List) db0Var.f;
                ua0 ua0Var = (ua0) db0Var.d;
                zp0 zp0Var = (zp0) db0Var.e;
                if (br1Var.a.b()) {
                    j2 = j;
                    pg3Var = pg3Var4;
                } else {
                    af afVar2 = og3Var2.a;
                    pg3 pg3Var5 = pg3Var4;
                    long j3 = og3Var2.j;
                    if (s51.n(afVar2, afVar) && og3Var2.b.c(gh3Var) && s51.n(og3Var2.c, list2) && og3Var2.d == Integer.MAX_VALUE && og3Var2.e == z && og3Var2.f == 1 && s51.n(og3Var2.g, ua0Var) && og3Var2.h == layoutDirection && s51.n(og3Var2.i, zp0Var) && m30.k(j) == m30.k(j3) && (!z || (m30.i(j) == m30.i(j3) && m30.h(j) == m30.h(j3)))) {
                        pg3Var3 = new pg3(new og3(og3Var2.a, (gh3) db0Var.c, og3Var2.c, og3Var2.d, og3Var2.e, og3Var2.f, og3Var2.g, og3Var2.h, og3Var2.i, j), br1Var, n30.d(j, (((long) w22.j(br1Var.e)) & 4294967295L) | (((long) w22.j(br1Var.d)) << 32)));
                        ye1Var = ye1Var3;
                        pg3Var2 = pg3Var5;
                        qg3Var = qg3VarD;
                    } else {
                        j2 = j;
                        pg3Var = pg3Var5;
                    }
                }
                db0Var.a(layoutDirection);
                int iK = m30.k(j2);
                if (z && m30.e(j2)) {
                    iH = m30.i(j2);
                }
                if (iK != iH) {
                    qk qkVar = (qk) db0Var.g;
                    if (qkVar == null) {
                        c.q("layoutIntrinsics must be called first");
                        return null;
                    }
                    iH = y02.h(w22.j(qkVar.c()), iK, iH);
                }
                qk qkVar2 = (qk) db0Var.g;
                if (qkVar2 == null) {
                    c.q("layoutIntrinsics must be called first");
                    return null;
                }
                br1 br1Var2 = new br1(qkVar2, lq.y(0, iH, 0, m30.h(j2)), Integer.MAX_VALUE, 1);
                ye1Var = ye1Var3;
                pg3Var2 = pg3Var;
                qg3Var = qg3VarD;
                pg3Var3 = new pg3(new og3((af) db0Var.b, (gh3) db0Var.c, (List) db0Var.f, Integer.MAX_VALUE, db0Var.a, 1, (ua0) db0Var.d, layoutDirection, (zp0) db0Var.e, j2), br1Var2, n30.d(j2, (((long) w22.j(br1Var2.d)) << 32) | (((long) w22.j(br1Var2.e)) & 4294967295L)));
            }
            long j4 = pg3Var3.c;
            Integer numValueOf = Integer.valueOf((int) (j4 >> 32));
            Integer numValueOf2 = Integer.valueOf((int) (j4 & 4294967295L));
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            br1 br1Var3 = pg3Var3.b;
            br1Var3.a.b();
            pg3 pg3Var6 = pg3Var2;
            if (s51.n(pg3Var6, pg3Var3)) {
                c50Var = this;
                ye1Var2 = ye1Var;
            } else {
                ye1Var2 = ye1Var;
                ye1Var2.i.setValue(new qg3(pg3Var3, qg3Var != null ? qg3Var.c : null));
                ye1Var2.p = false;
                c50Var = this;
                sf3 sf3Var = c50Var.b;
                if (sf3Var.k() && sf3Var.j() && ((re1) c50Var.c).a() && yg3.c(((yg3) ye1Var2.A.getValue()).a) && yg3.c(((yg3) ye1Var2.B.getValue()).a) && ye1Var2.b()) {
                    if (!s51.n((pg3Var6 == null || (og3Var = pg3Var6.a) == null) ? null : og3Var.a, pg3Var3.a.a)) {
                        cl3.t(c50Var.d, null, new j(sf3Var, c50Var.i, null, 14), 3);
                    }
                }
                c50Var.e.h(pg3Var3);
                gq.L(ye1Var2, c50Var.f, c50Var.g);
            }
            ye1Var2.g.setValue(new jd0(c50Var.h.X0(c50Var.j == 1 ? w22.j(br1Var3.b(0)) : 0)));
            return en1Var.I0(iIntValue, iIntValue2, om1.Y(new r32(l5.a, Integer.valueOf(Math.round(pg3Var3.d))), new r32(l5.b, Integer.valueOf(Math.round(pg3Var3.e)))), new u0(19));
        } finally {
            jo3.v(t63VarL, t63VarS, ns0VarE);
        }
    }
}
