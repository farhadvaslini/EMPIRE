package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ v1(cs0 cs0Var, cs0 cs0Var2, ns0 ns0Var) {
        this.f = 25;
        this.i = cs0Var;
        this.g = cs0Var2;
        this.h = ns0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Type inference failed for: r15v0, types: [p40] */
    /* JADX WARN: Type inference failed for: r15v15 */
    @Override // defpackage.ns0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj) throws Throwable {
        pr prVar;
        br1 br1Var;
        float fT;
        of0 of0Var;
        Object objG;
        ye1 ye1Var;
        ze zeVar;
        int i = this.f;
        t02 t02Var = t02.f;
        int i2 = 11;
        int i3 = 2;
        boolean zBooleanValue = false;
        z = false;
        z = false;
        z = false;
        boolean z = false;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                of1 of1Var = (of1) obj4;
                x1 x1Var = new x1(zBooleanValue ? 1 : 0, (ns0) obj3);
                of1Var.getLifecycle().a(x1Var);
                return new y1((cs0) obj2, of1Var, x1Var, zBooleanValue ? 1 : 0);
            case 1:
                pq3 pq3Var = (pq3) obj4;
                tb1 tb1Var = (tb1) obj3;
                pq3 pq3Var2 = (pq3) obj2;
                pr prVarK = ((qf0) obj).Z().k();
                if (pq3Var.g.getVisibility() != 8) {
                    pq3Var.D = true;
                    q12 q12Var = tb1Var.t;
                    h7Var = q12Var instanceof h7 ? (h7) q12Var : 0;
                    if (h7Var != 0) {
                        Canvas canvasA = o6.a(prVarK);
                        h7Var.getAndroidViewsHandler$ui().getClass();
                        pq3Var2.draw(canvasA);
                    }
                    pq3Var.D = false;
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ns0 ns0Var = (ns0) obj3;
                os1 os1Var = (os1) obj2;
                bg3 bg3Var = (bg3) obj;
                ((os1) obj4).setValue(bg3Var);
                boolean zN = s51.n((String) os1Var.getValue(), bg3Var.a.g);
                af afVar = bg3Var.a;
                os1Var.setValue(afVar.g);
                if (!zN) {
                    ns0Var.h(afVar.g);
                }
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                u1 u1Var = new u1(9, (x50) obj3, (jj3) obj2);
                a71[] a71VarArr = bv2.a;
                ((dv2) obj).a(pu2.c, new y0((String) obj4, u1Var));
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                y30 y30Var = (y30) obj4;
                j61 j61Var = (j61) obj3;
                us2 us2Var = (us2) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                f = y30Var.v ? 1.0f : -1.0f;
                ws2 ws2Var = y30Var.u;
                long jF = ws2Var.f(ws2Var.i(f * fFloatValue));
                ws2 ws2Var2 = us2Var.a;
                float fH = ws2Var.h(ws2Var.f(ws2Var2.d(ws2Var2.k, jF, 1))) * f;
                if (Math.abs(fH) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fH + " < " + fFloatValue + ")");
                    cancellationException.initCause(null);
                    j61Var.c(cancellationException);
                }
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ye1 ye1Var2 = (ye1) obj4;
                long j = ((bg3) obj3).b;
                iy1 iy1Var = (iy1) obj2;
                qf0 qf0Var = (qf0) obj;
                qg3 qg3VarD = ye1Var2.d();
                if (qg3VarD != null) {
                    pr prVarK2 = qf0Var.Z().k();
                    long j2 = ((yg3) ye1Var2.A.getValue()).a;
                    long j3 = ((yg3) ye1Var2.B.getValue()).a;
                    pg3 pg3Var = qg3VarD.a;
                    br1 br1Var2 = pg3Var.b;
                    og3 og3Var = pg3Var.a;
                    w9 w9Var = ye1Var2.y;
                    long j4 = ye1Var2.z;
                    if (!yg3.c(j2)) {
                        w9Var.h(j4);
                        int iR = iy1Var.r(yg3.f(j2));
                        int iR2 = iy1Var.r(yg3.e(j2));
                        if (iR != iR2) {
                            prVarK2.h(pg3Var.i(iR, iR2), w9Var);
                        }
                    } else if (!yg3.c(j3)) {
                        long jB = og3Var.b.b();
                        wx wxVar = jB != 16 ? new wx(jB) : null;
                        long j5 = wxVar != null ? wxVar.a : wx.b;
                        w9Var.h(wx.b(wx.d(j5) * 0.2f, j5));
                        int iR3 = iy1Var.r(yg3.f(j3));
                        int iR4 = iy1Var.r(yg3.e(j3));
                        if (iR3 != iR4) {
                            prVarK2.h(pg3Var.i(iR3, iR4), w9Var);
                        }
                    } else if (!yg3.c(j)) {
                        w9Var.h(j4);
                        int iR5 = iy1Var.r(yg3.f(j));
                        int iR6 = iy1Var.r(yg3.e(j));
                        if (iR5 != iR6) {
                            prVarK2.h(pg3Var.i(iR5, iR6), w9Var);
                        }
                    }
                    i = (!pg3Var.d() || og3Var.f == 3) ? 0 : 1;
                    if (i != 0) {
                        long j6 = pg3Var.c;
                        jk2 jk2VarB = b32.b(0L, (((long) Float.floatToRawIntBits((int) (j6 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j6 & 4294967295L))) & 4294967295L));
                        prVarK2.l();
                        pr.k(prVarK2, jk2VarB);
                    }
                    h83 h83Var = og3Var.b.a;
                    ne3 ne3Var = h83Var.m;
                    dg3 dg3Var = h83Var.a;
                    if (ne3Var == null) {
                        ne3Var = ne3.b;
                    }
                    ne3 ne3Var2 = ne3Var;
                    r13 r13Var = h83Var.n;
                    if (r13Var == null) {
                        r13Var = r13.d;
                    }
                    r13 r13Var2 = r13Var;
                    rf0 rf0Var = h83Var.p;
                    if (rf0Var == null) {
                        rf0Var = fm0.a;
                    }
                    rf0 rf0Var2 = rf0Var;
                    try {
                        dp dpVarB = dg3Var.b();
                        cg3 cg3Var = cg3.a;
                        try {
                            if (dpVarB != null) {
                                if (dg3Var != cg3Var) {
                                    br1Var = br1Var2;
                                    fT = dg3Var.t();
                                } else {
                                    br1Var = br1Var2;
                                    fT = 1.0f;
                                }
                                prVar = prVarK2;
                                br1.j(br1Var, prVar, dpVarB, fT, r13Var2, ne3Var2, rf0Var2);
                            } else {
                                prVar = prVarK2;
                                br1.i(br1Var2, prVar, dg3Var != cg3Var ? dg3Var.a() : wx.b, r13Var2, ne3Var2, rf0Var2);
                            }
                            if (i != 0) {
                                prVar.i();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (i != 0) {
                                prVarK2.i();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nk2 nk2Var = (nk2) obj4;
                ne neVar = (ne) obj;
                float fFloatValue2 = ((Number) neVar.e.getValue()).floatValue() - nk2Var.f;
                float fA = ((ts2) obj3).a(fFloatValue2);
                nk2Var.f = ((Number) neVar.e.getValue()).floatValue();
                ((nk2) obj2).f = ((Number) neVar.a.b.h(neVar.f)).floatValue();
                if (Math.abs(fFloatValue2 - fA) > 0.5f) {
                    neVar.a();
                }
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                Context context = (Context) obj3;
                je3 je3Var = (je3) obj2;
                k40 k40Var = (k40) obj;
                List list = ((xd3) obj4).a;
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    wd3 wd3Var = (wd3) list.get(i4);
                    if (wd3Var instanceof ee3) {
                        ee3 ee3Var = (ee3) wd3Var;
                        k40.b(k40Var, new u(9, ee3Var), ee3Var.c == 0 ? null : new d00(-1930700965, new w90(zBooleanValue ? 1 : 0, ee3Var), true), new u1(14, ee3Var, je3Var), 6);
                    } else if (wd3Var instanceof ke3) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            ke3 ke3Var = (ke3) wd3Var;
                            if (context != null) {
                                int i5 = ke3Var.c;
                                TextClassification textClassification = ke3Var.b;
                                Drawable drawable = ke3Var.d;
                                if (i5 < 0) {
                                    k40.b(k40Var, new pt2(i2, textClassification), drawable != null ? new d00(-1123224187, new de3(drawable, zBooleanValue ? 1 : 0), true) : null, new me1(25, context, textClassification), 6);
                                } else {
                                    RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i5);
                                    k40.b(k40Var, new pt2(12, remoteAction), drawable != null ? new d00(1106162332, new de3(drawable, i), true) : null, new it1(27, remoteAction), 6);
                                }
                            }
                        }
                    } else if (wd3Var instanceof ie3) {
                        k40Var.a.add(n92.l);
                    }
                }
                return dm3Var;
            case 8:
                l73 l73Var = (l73) obj4;
                qt1 qt1Var = (qt1) obj3;
                l73Var.add(qt1Var);
                return new y1((mb0) obj2, qt1Var, l73Var, i3);
            case vr.g /* 9 */:
                xe0 xe0Var = (xe0) obj3;
                i62 i62Var = (i62) obj2;
                h62 h62Var = (h62) obj;
                boolean zM = ((en1) obj4).M();
                d6 d6Var = xe0Var.t;
                float fD = zM ? d6Var.d().d(xe0Var.t.h.getValue()) : d6Var.f();
                t02 t02Var2 = xe0Var.v;
                float f = t02Var2 == t02.g ? fD : 0.0f;
                if (t02Var2 != t02Var) {
                    fD = 0.0f;
                }
                h62Var.f = true;
                h62Var.C(i62Var, vm1.M(f), vm1.M(fD), 0.0f);
                h62Var.f = false;
                return dm3Var;
            case vr.h /* 10 */:
                c6 c6Var = (c6) obj4;
                t02 t02Var3 = (t02) obj2;
                long j7 = ((yd0) obj).a;
                long jF2 = ((df0) obj3).S ? gy1.f(-1.0f, j7) : gy1.f(1.0f, j7);
                af0 af0Var = bf0.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (t02Var3 == t02Var ? jF2 & 4294967295L : jF2 >> 32));
                switch (c6Var.a) {
                    case 0:
                        d6 d6Var2 = (d6) c6Var.b;
                        a6.a(d6Var2.n, d6Var2.e(fIntBitsToFloat));
                        return dm3Var;
                    default:
                        ((h53) c6Var.b).a(fIntBitsToFloat);
                        return dm3Var;
                }
            case 11:
                ep0 ep0Var = (ep0) obj2;
                ns0 ns0Var2 = (ns0) obj3;
                rp0 rp0Var = (rp0) obj;
                if (!s51.n(rp0Var, (rp0) obj4)) {
                    if (s51.n(rp0Var, ep0Var.c)) {
                        c.q("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ns0Var2.h(rp0Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case vr.i /* 12 */:
                vr vrVar = (vr) obj4;
                da daVar = (da) obj3;
                by0 by0Var = (by0) obj2;
                qf0 qf0Var2 = (qf0) obj;
                qf0Var2.getClass();
                ((yl1) qf0Var2.Z().g).H(1.0f, 1.0f);
                try {
                    pr prVarK3 = qf0Var2.Z().k();
                    prVarK3.l();
                    oz2.p(prVarK3, vrVar, daVar);
                    y02.n(prVarK3, vrVar, by0Var.w);
                    prVarK3.i();
                    return dm3Var;
                } finally {
                    ((yl1) qf0Var2.Z().g).H(-1.0f, -1.0f);
                }
            case 13:
                List list2 = (List) obj4;
                ae1 ae1Var = (ae1) obj;
                ae1Var.getClass();
                ae1.W(ae1Var, null, rn.i, 3);
                ae1Var.X(list2.size(), new la(10, new n20(13), list2), new jw(1, list2), new d00(802480018, new f91(list2, (ns0) obj3, (os1) obj2, zBooleanValue ? 1 : 0), true));
                return dm3Var;
            case 14:
                vb1 vb1Var = (vb1) obj4;
                rr rrVar = vb1Var.f;
                ns0 ns0Var3 = (ns0) obj3;
                qf0 qf0Var3 = (qf0) obj;
                of0 of0Var2 = vb1Var.g;
                vb1Var.g = (of0) obj2;
                try {
                    ua0 ua0VarO = qf0Var3.Z().o();
                    bb1 bb1VarW = qf0Var3.Z().w();
                    pr prVarK4 = qf0Var3.Z().k();
                    long jA = qf0Var3.Z().A();
                    qw0 qw0Var = (qw0) qf0Var3.Z().h;
                    ua0 ua0VarO2 = rrVar.g.o();
                    bb1 bb1VarW2 = rrVar.g.w();
                    pr prVarK5 = rrVar.g.k();
                    long jA2 = rrVar.g.A();
                    pi piVar = rrVar.g;
                    try {
                        qw0 qw0Var2 = (qw0) piVar.h;
                        piVar.N(ua0VarO);
                        piVar.O(bb1VarW);
                        piVar.M(prVarK4);
                        piVar.Q(jA);
                        piVar.h = qw0Var;
                        prVarK4.l();
                        try {
                            ns0Var3.h(vb1Var);
                            prVarK4.i();
                            pi piVar2 = rrVar.g;
                            piVar2.N(ua0VarO2);
                            piVar2.O(bb1VarW2);
                            piVar2.M(prVarK5);
                            piVar2.Q(jA2);
                            piVar2.h = qw0Var2;
                            vb1Var.g = of0Var2;
                            return dm3Var;
                        } catch (Throwable th3) {
                            of0Var = of0Var2;
                            try {
                                prVarK4.i();
                                pi piVar3 = rrVar.g;
                                piVar3.N(ua0VarO2);
                                piVar3.O(bb1VarW2);
                                piVar3.M(prVarK5);
                                piVar3.Q(jA2);
                                piVar3.h = qw0Var2;
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                vb1Var.g = of0Var;
                                throw th;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        of0Var = of0Var2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    of0Var = of0Var2;
                }
                break;
            case jo3.g /* 15 */:
                os1 os1Var2 = (os1) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                List list3 = (List) obj2;
                h62 h62Var2 = (h62) obj;
                h62Var2.f = true;
                int size2 = arrayList.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    ((fe1) arrayList.get(i6)).c(h62Var2);
                }
                int size3 = list3.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    ((fe1) list3.get(i7)).c(h62Var2);
                }
                h62Var2.f = false;
                os1Var2.getValue();
                return dm3Var;
            case 16:
                of1 of1Var2 = (of1) obj4;
                qk2 qk2Var = new qk2();
                kf1 kf1Var = new kf1((vf1) obj2, qk2Var, (ns0) obj3, zBooleanValue ? 1 : 0);
                of1Var2.getLifecycle().a(kf1Var);
                return new y1(of1Var2, kf1Var, qk2Var);
            case 17:
                s33 s33Var = (s33) obj3;
                cl3.t((x50) obj4, null, new q10(s33Var, ((Float) obj).floatValue(), h7Var, i3), 3).r(new pp1(s33Var, (cs0) obj2, i));
                return dm3Var;
            case 18:
                ir1 ir1Var = (ir1) obj3;
                qk2 qk2Var2 = (qk2) obj2;
                if (((Set) obj4).contains(obj) && (objG = ir1Var.b.g(obj)) != null) {
                    if (objG instanceof js1) {
                        js1 js1Var = (js1) objG;
                        Object[] objArr = js1Var.b;
                        long[] jArr = js1Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j8 = jArr[i8];
                                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        if ((255 & j8) < 128) {
                                            lv2 lv2Var = (lv2) objArr[(i8 << 3) + i10];
                                            if (qk2Var2.f == null) {
                                                qk2Var2.f = new ArrayList();
                                            }
                                            ((List) qk2Var2.f).add(lv2Var);
                                        }
                                        j8 >>= 8;
                                    }
                                    if (i9 == 8) {
                                        if (i8 != length) {
                                            i8++;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        lv2 lv2Var2 = (lv2) objG;
                        if (qk2Var2.f == null) {
                            qk2Var2.f = new ArrayList();
                        }
                        ((List) qk2Var2.f).add(lv2Var2);
                    }
                }
                return dm3Var;
            case 19:
                x12 x12Var = (x12) obj3;
                g5 g5Var = (g5) obj2;
                vb1 vb1Var2 = (vb1) obj;
                long j9 = ((h43) ((we3) obj4).get()).a;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 >> 32));
                if (fIntBitsToFloat2 > 0.0f) {
                    float fT2 = vb1Var2.T(4.0f);
                    rr rrVar2 = vb1Var2.f;
                    float fA2 = g5Var.a(vm1.M(fIntBitsToFloat2), vm1.M((Float.intBitsToFloat((int) (rrVar2.a() >> 32)) - r8) - vb1Var2.T(x12Var.b(vb1Var2.getLayoutDirection()))), vb1Var2.getLayoutDirection()) + vb1Var2.T(x12Var.a(vb1Var2.getLayoutDirection()));
                    float f2 = fIntBitsToFloat2 / 2.0f;
                    float f3 = fA2 + f2;
                    float f4 = (f3 - f2) - fT2;
                    float f5 = f4 < 0.0f ? 0.0f : f4;
                    float f6 = f3 + f2 + fT2;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (rrVar2.a() >> 32));
                    float f7 = f6 > fIntBitsToFloat3 ? fIntBitsToFloat3 : f6;
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                    float f8 = (-fIntBitsToFloat4) / 2.0f;
                    float f9 = fIntBitsToFloat4 / 2.0f;
                    pi piVar4 = rrVar2.g;
                    long jA3 = piVar4.A();
                    piVar4.k().l();
                    try {
                        ((yl1) piVar4.g).t(f5, f8, f7, f9, 0);
                        vb1Var2.c();
                    } finally {
                        nc2.t(piVar4, jA3);
                    }
                } else {
                    vb1Var2.c();
                }
                return dm3Var;
            case 20:
                os1 os1Var3 = (os1) obj2;
                y31 y31Var = (y31) obj;
                y31Var.getClass();
                ((os1) obj3).setValue(y31Var);
                String str = y31Var.a.b;
                str.getClass();
                m92 m92VarH = ((oa2) obj4).c.h(str);
                Object obj5 = m92VarH != null ? m92VarH.b : null;
                if (obj5 == null) {
                    obj5 = si0.f;
                }
                os1Var3.setValue(obj5);
                return dm3Var;
            case 21:
                List list4 = (List) obj4;
                ae1 ae1Var2 = (ae1) obj;
                ae1Var2.getClass();
                ae1Var2.X(list4.size(), null, new jw(11, list4), new d00(2039820996, new f91(list4, (ns0) obj3, (a42) obj2, i3), true));
                return dm3Var;
            case 22:
                eq2 eq2Var = (eq2) obj4;
                jq2 jq2Var = (jq2) obj2;
                is1 is1Var = eq2Var.g;
                if (is1Var.b(obj3)) {
                    qn1.m(obj3, " was used multiple times ", "Key ");
                    return null;
                }
                eq2Var.f.remove(obj3);
                is1Var.m(obj3, jq2Var);
                return new y1(eq2Var, obj3, jq2Var, 4);
            case 23:
                g51 g51Var = (g51) obj4;
                qn1 qn1Var = (qn1) obj3;
                mk2 mk2Var = (mk2) obj2;
                gb2 gb2Var = (gb2) obj;
                long j10 = gb2Var.c;
                sf3 sf3Var = (sf3) g51Var.d;
                if (sf3Var.k() && sf3Var.n().a.g.length() != 0 && (ye1Var = sf3Var.d) != null && ye1Var.d() != null) {
                    g51Var.d(sf3Var.n(), j10, false, qn1Var);
                    z = true;
                }
                if (z) {
                    gb2Var.a();
                    mk2Var.f = true;
                }
                return dm3Var;
            case 24:
                String str2 = (String) obj;
                str2.getClass();
                ((rs0) obj4).f(str2, new v91((Context) obj3, i3));
                ((os1) obj2).setValue(Boolean.FALSE);
                return dm3Var;
            case 25:
                return new s33((cs0) obj2, (cs0) obj4, (t33) obj, (ns0) obj3);
            case 26:
                z00 z00Var = (z00) obj2;
                Throwable th7 = (Throwable) obj;
                ((s) obj4).h(th7);
                np npVar = (np) ((pl) obj3).i;
                npVar.i(th7, false);
                while (true) {
                    Object objA = vs.a(npVar.g());
                    if (objA == null) {
                        return dm3Var;
                    }
                    z00Var.f(objA, th7);
                }
                break;
            case 27:
                mk2 mk2Var2 = (mk2) obj4;
                ze zeVar2 = (ze) obj3;
                h83 h83Var2 = (h83) obj2;
                ze zeVar3 = (ze) obj;
                if (mk2Var2.f) {
                    Object obj6 = zeVar3.a;
                    int i11 = zeVar3.c;
                    int i12 = zeVar3.b;
                    if ((obj6 instanceof h83) && i12 == zeVar2.b && i11 == zeVar2.c) {
                        if (h83Var2 == null) {
                            h83Var2 = new h83(0L, 0L, (xq0) null, (vq0) null, (wq0) null, (zb3) null, (String) null, 0L, (nl) null, (eg3) null, (qj1) null, 0L, (ne3) null, (r13) null, 65535);
                        }
                        zeVar = new ze(i12, i11, h83Var2);
                    } else {
                        zeVar = zeVar3;
                    }
                }
                mk2Var2.f = zeVar2.equals(zeVar3);
                return zeVar;
            default:
                ns0 ns0Var4 = (ns0) obj3;
                jg3 jg3Var = (jg3) ((qk2) obj2).f;
                bg3 bg3VarN = ((a31) obj4).n((List) obj);
                if (jg3Var != null) {
                    jg3Var.a(null, bg3VarN);
                }
                ns0Var4.h(bg3VarN);
                return dm3Var;
        }
    }

    public /* synthetic */ v1(y30 y30Var, um3 um3Var, j61 j61Var, us2 us2Var) {
        this.f = 4;
        this.g = y30Var;
        this.h = j61Var;
        this.i = us2Var;
    }

    public /* synthetic */ v1(ns0 ns0Var, os1 os1Var, os1 os1Var2) {
        this.f = 2;
        this.h = ns0Var;
        this.g = os1Var;
        this.i = os1Var2;
    }

    public /* synthetic */ v1(os1 os1Var, ArrayList arrayList, List list, boolean z) {
        this.f = 15;
        this.g = os1Var;
        this.h = arrayList;
        this.i = list;
    }

    public /* synthetic */ v1(nk2 nk2Var, ts2 ts2Var, nk2 nk2Var2, s80 s80Var) {
        this.f = 6;
        this.g = nk2Var;
        this.h = ts2Var;
        this.i = nk2Var2;
    }

    public /* synthetic */ v1(Object obj, Object obj2, ns0 ns0Var, int i) {
        this.f = i;
        this.g = obj;
        this.i = obj2;
        this.h = ns0Var;
    }

    public /* synthetic */ v1(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
