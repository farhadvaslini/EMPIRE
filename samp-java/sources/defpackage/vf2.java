package defpackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vf2 implements ts0 {
    public final /* synthetic */ List f;
    public final /* synthetic */ long g;
    public final /* synthetic */ SimpleDateFormat h;

    public vf2(List list, long j, SimpleDateFormat simpleDateFormat) {
        this.f = list;
        this.g = j;
        this.h = simpleDateFormat;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        float f;
        r32 r32Var;
        long j;
        Object next;
        Iterator it;
        wx wxVar;
        nc1 nc1Var = (nc1) obj;
        int iIntValue = ((Number) obj2).intValue();
        nv0 nv0Var = (nv0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (nv0Var.f(nc1Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= nv0Var.d(iIntValue) ? 32 : 16;
        }
        if (nv0Var.R(i & 1, (i & 147) != 146)) {
            bt btVar = (bt) this.f.get(iIntValue);
            nv0Var.a0(960234828);
            long j2 = btVar.d;
            boolean zE = nv0Var.e(j2);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (zE || objO == zjVar) {
                uk2 uk2Var = tp2.a;
                objO = tp2.c(btVar.b, btVar.a);
                nv0Var.j0(objO);
            }
            List list = (List) objO;
            boolean zE2 = nv0Var.e(j2) | nv0Var.f(list);
            long j3 = this.g;
            boolean zE3 = zE2 | nv0Var.e(j3);
            Object objO2 = nv0Var.O();
            if (zE3 || objO2 == zjVar) {
                uk2 uk2Var2 = tp2.a;
                ArrayList arrayList = new ArrayList(rx.d0(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new wx(((sp2) it2.next()).b));
                }
                uk2 uk2Var3 = tp2.a;
                if (arrayList.isEmpty()) {
                    objO2 = new rp2(Float.POSITIVE_INFINITY, wx.f);
                    f = 4.5f;
                } else {
                    f = 4.5f;
                    List listL = vr.L(new wx(wx.f), new wx(wx.b(0.94f, tp2.d)), new wx(wx.b(0.96f, tp2.e)));
                    ArrayList arrayList2 = new ArrayList(rx.d0(listL, 10));
                    Iterator it3 = listL.iterator();
                    while (it3.hasNext()) {
                        long j4 = ((wx) it3.next()).a;
                        Iterator it4 = arrayList.iterator();
                        if (!it4.hasNext()) {
                            c.n();
                            return null;
                        }
                        long j5 = ((wx) it4.next()).a;
                        long j6 = this.g;
                        float fB = tp2.b(j5, j4, j6);
                        while (it4.hasNext()) {
                            fB = Math.min(fB, tp2.b(((wx) it4.next()).a, j4, j6));
                            it4 = it4;
                        }
                        arrayList2.add(new r32(new wx(j4), Float.valueOf(fB)));
                    }
                    r32 r32Var2 = (r32) qx.q0(arrayList2);
                    if (((Number) r32Var2.g).floatValue() < 4.5f && (r32Var = (r32) qx.B0(arrayList2, new w92(2, new up0(19)))) != null) {
                        r32Var2 = r32Var;
                    }
                    objO2 = new rp2(((Number) r32Var2.g).floatValue(), ((wx) r32Var2.f).a);
                }
                nv0Var.j0(objO2);
            } else {
                f = 4.5f;
            }
            rp2 rp2Var = (rp2) objO2;
            boolean zE4 = nv0Var.e(j2) | nv0Var.f(rp2Var) | nv0Var.e(j3);
            Object objO3 = nv0Var.O();
            if (zE4 || objO3 == zjVar) {
                uk2 uk2Var4 = tp2.a;
                wx wxVar2 = new wx(tp2.a(rp2Var.a, j3));
                nv0Var.j0(wxVar2);
                objO3 = wxVar2;
            }
            long j7 = ((wx) objO3).a;
            boolean zE5 = nv0Var.e(j2) | nv0Var.f(list) | nv0Var.e(j7);
            Object objO4 = nv0Var.O();
            if (zE5 || objO4 == zjVar) {
                uk2 uk2Var5 = tp2.a;
                list.getClass();
                ye yeVar = new ye();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    sp2 sp2Var = (sp2) it5.next();
                    long j8 = j7;
                    if (tp2.b(sp2Var.b, j8, j7) >= f) {
                        it = it5;
                        wxVar = null;
                    } else {
                        Iterator it6 = vr.L(new wx(tp2.d), new wx(tp2.e)).iterator();
                        if (it6.hasNext()) {
                            next = it6.next();
                            if (it6.hasNext()) {
                                it = it5;
                                long j9 = ((wx) next).a;
                                float fB2 = tp2.b(sp2Var.b, j9, j9);
                                do {
                                    Object next2 = it6.next();
                                    Object obj5 = next;
                                    long j10 = ((wx) next2).a;
                                    float fB3 = tp2.b(sp2Var.b, j10, j10);
                                    if (Float.compare(fB2, fB3) < 0) {
                                        fB2 = fB3;
                                        next = next2;
                                    } else {
                                        next = obj5;
                                    }
                                } while (it6.hasNext());
                            } else {
                                it = it5;
                            }
                        } else {
                            it = it5;
                            next = null;
                        }
                        wxVar = (wx) next;
                    }
                    long j11 = sp2Var.b;
                    int iC = yeVar.c(wxVar == null ? new h83(j11, 0L, (xq0) null, (vq0) null, (wq0) null, (zb3) null, (String) null, 0L, (nl) null, (eg3) null, (qj1) null, 0L, (ne3) null, (r13) null, 65534) : new h83(j11, 0L, (xq0) null, (vq0) null, (wq0) null, (zb3) null, (String) null, 0L, (nl) null, (eg3) null, (qj1) null, wxVar.a, (ne3) null, (r13) null, 63486));
                    try {
                        yeVar.f.append(sp2Var.a);
                        yeVar.b(iC);
                        it5 = it;
                        j7 = j8;
                    } catch (Throwable th) {
                        yeVar.b(iC);
                        throw th;
                    }
                }
                j = j7;
                objO4 = yeVar.d();
                nv0Var.j0(objO4);
            } else {
                j = j7;
            }
            af afVar = (af) objO4;
            boolean zE6 = nv0Var.e(j2) | nv0Var.e(j);
            Object objO5 = nv0Var.O();
            if (zE6 || objO5 == zjVar) {
                uk2 uk2Var6 = tp2.a;
                wx wxVar3 = new wx(tp2.e(j) < 0.5f ? wx.b(0.78f, wx.c) : wx.b(0.68f, wx.b));
                nv0Var.j0(wxVar3);
                objO5 = wxVar3;
            }
            long j12 = ((wx) objO5).a;
            yp1 yp1Var = yp1.a;
            bq1 bq1VarK = f80.K(gq.t(j43.c(yp1Var, 1.0f), uo2.a(6.0f)).d(wx.d(rp2Var.a) > 0.0f ? gv3.v(yp1Var, rp2Var.a, cl3.q0) : yp1Var), 8.0f, 4.0f);
            dp2 dp2VarA = cp2.a(n92.b, f5.p, nv0Var, 48);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarK);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, dp2VarA);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            String str = this.h.format(new Date(btVar.c));
            str.getClass();
            r93 r93Var = ql3.a;
            mg3.b(str, null, j12, 0L, null, zb3.c, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(r93Var)).o, nv0Var, 0, 0, 130938);
            oz2.g(nv0Var, j43.o(yp1Var, 8.0f));
            mg3.c(afVar, new jc1(1.0f, true), 0L, 0L, 0L, 0L, 2, false, 20, 0, null, null, ((ol3) nv0Var.j(r93Var)).l, nv0Var, 0, 241660);
            nv0Var.p(true);
            nv0Var.p(false);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
