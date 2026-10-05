package defpackage;

import android.graphics.Typeface;
import android.text.Spannable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class w91 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ w91(ns0 ns0Var, j40 j40Var) {
        this.f = 2;
        this.h = ns0Var;
        this.g = j40Var;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        boolean z;
        nv0 nv0Var;
        hp2 hp2Var = (hp2) this.g;
        cs0 cs0Var = (cs0) this.h;
        nv0 nv0Var2 = (nv0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ry) obj).getClass();
        if (nv0Var2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            yp1 yp1Var = yp1.a;
            bq1 bq1VarK = f80.K(n92.J(j43.c(yp1Var, 1.0f), n92.q0), 24.0f, 8.0f);
            qy qyVarA = oy.a(new jj(12.0f, true, new c(1)), f5.s, nv0Var2, 6);
            int iHashCode = Long.hashCode(nv0Var2.T);
            n52 n52VarL = nv0Var2.l();
            bq1 bq1VarM = lr.M(nv0Var2, bq1VarK);
            w10.c.getClass();
            nv0Var2.d0();
            if (nv0Var2.S) {
                nv0Var2.k(tb1.Y);
            } else {
                nv0Var2.m0();
            }
            y02.F(f5.E, nv0Var2, qyVarA);
            y02.F(f5.D, nv0Var2, n52VarL);
            y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode));
            y02.C(nv0Var2);
            y02.F(f5.C, nv0Var2, bq1VarM);
            mg3.b(oz2.M(2131624320, nv0Var2), null, 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).g, nv0Var2, 1572864, 0, 131006);
            if (hp2Var.c.isEmpty()) {
                nv0Var2.a0(-641345266);
                mg3.b(oz2.M(2131624353, nv0Var2), null, ((fy) nv0Var2.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262138);
                nv0Var = nv0Var2;
                nv0Var.p(false);
                z = true;
            } else {
                nv0Var2.a0(-641130033);
                z = true;
                char c = 1;
                bq1 bq1VarG = j43.g(j43.c(yp1Var, 1.0f), 0.0f, 420.0f, 1);
                jj jjVar = new jj(4.0f, true, new c(1));
                boolean zH = nv0Var2.h(hp2Var);
                Object objO = nv0Var2.O();
                if (zH || objO == c20.a) {
                    objO = new aw2(c == true ? 1 : 0, hp2Var);
                    nv0Var2.j0(objO);
                }
                lr.g(24582, 494, null, null, jjVar, null, (ns0) objO, nv0Var2, null, bq1VarG, null, false);
                nv0Var = nv0Var2;
                nv0Var.p(false);
            }
            gq.m(cs0Var, new py0(f5.u), false, null, null, null, rn.f0, nv0Var, 805306368, 508);
            nv0Var.p(z);
        } else {
            nv0Var2.U();
        }
        return dm3.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        Spannable spannable = (Spannable) this.g;
        ba baVar = (ba) this.h;
        h83 h83Var = (h83) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        zb3 zb3Var = h83Var.f;
        xq0 xq0Var = h83Var.c;
        if (xq0Var == null) {
            xq0Var = xq0.h;
        }
        vq0 vq0Var = h83Var.d;
        int i = vq0Var != null ? vq0Var.a : 0;
        wq0 wq0Var = h83Var.e;
        int i2 = wq0Var != null ? wq0Var.a : 65535;
        ca caVar = (ca) baVar.g;
        ml3 ml3VarB = ((aq0) caVar.e).b(zb3Var, xq0Var, i, i2);
        if (ml3VarB instanceof ml3) {
            Object obj4 = ml3VarB.f;
            obj4.getClass();
            typeface = (Typeface) obj4;
        } else {
            pi piVar = new pi(ml3VarB, caVar.j);
            caVar.j = piVar;
            Object obj5 = piVar.i;
            obj5.getClass();
            typeface = (Typeface) obj5;
        }
        spannable.setSpan(new cq0(1, typeface), iIntValue, iIntValue2, 33);
        return dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x069e  */
    @Override // defpackage.ss0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.Object r58, java.lang.Object r59, java.lang.Object r60) {
        /*
            Method dump skipped, instruction units count: 3282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w91.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ w91(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
