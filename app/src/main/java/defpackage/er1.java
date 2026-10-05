package defpackage;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class er1 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ er1(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Type inference failed for: r12v0, types: [p40] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // defpackage.ns0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj) {
        gf1 lifecycle;
        ug3 ug3VarA;
        ug3 ug3VarA2;
        ug3 ug3VarA3;
        pg3 pg3Var;
        da daVarI;
        og3 og3Var;
        int i = 7;
        int i2 = 11;
        int i3 = 2;
        h83 h83VarC = 0;
        h83VarC = 0;
        boolean z = true;
        switch (this.f) {
            case 0:
                ((ir1) this.g).c.add(new fr1(obj, (lv2) this.h));
                return dm3.a;
            case 1:
                fu1 fu1Var = (fu1) this.g;
                wt1 wt1Var = ((nu1) this.h).b;
                wu1 wu1Var = (wu1) obj;
                wu1Var.getClass();
                bl0 bl0Var = wu1Var.a;
                bl0Var.a = 0;
                bl0Var.b = 0;
                if (fu1Var instanceof iu1) {
                    int i4 = fu1.j;
                    Iterator it = pq.y(fu1Var).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            fu1 fu1Var2 = (fu1) it.next();
                            fu1 fu1VarF = wt1Var.f();
                            if (s51.n(fu1Var2, fu1VarF != null ? fu1VarF.h : null)) {
                            }
                        } else {
                            int i5 = iu1.l;
                            wu1Var.b = uq.o(wt1Var.g()).g.a;
                            wu1Var.c = true;
                        }
                    }
                }
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new zk(5, (e93) this.g, (h10) this.h);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nu1 nu1Var = (nu1) this.g;
                of1 of1Var = (of1) this.h;
                nu1Var.getClass();
                of1Var.getClass();
                wt1 wt1Var2 = nu1Var.b;
                x1 x1Var = wt1Var2.r;
                if (!of1Var.equals(wt1Var2.n)) {
                    of1 of1Var2 = wt1Var2.n;
                    if (of1Var2 != null && (lifecycle = of1Var2.getLifecycle()) != null) {
                        lifecycle.b(x1Var);
                    }
                    wt1Var2.n = of1Var;
                    of1Var.getLifecycle().a(x1Var);
                }
                return new ta(2);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                w12 w12Var = (w12) this.g;
                i62 i62Var = (i62) this.h;
                h62 h62Var = (h62) obj;
                boolean z2 = w12Var.x;
                float f = w12Var.t;
                if (z2) {
                    h62.F(h62Var, i62Var, h62Var.p0(f), h62Var.p0(w12Var.u));
                } else {
                    h62Var.C(i62Var, h62Var.p0(f), h62Var.p0(w12Var.u), 0.0f);
                }
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((rs0) this.g).f(Integer.valueOf(((rc2) obj).a), Integer.valueOf(((pi) this.h).x().b));
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                os1 os1Var = (os1) this.g;
                h62 h62Var2 = (h62) obj;
                o8 o8Var = new o8(i3, (ArrayList) this.h);
                h62Var2.f = true;
                o8Var.h(h62Var2);
                h62Var2.f = false;
                os1Var.getValue();
                return dm3.a;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                rs0 rs0Var = (rs0) this.g;
                String str = (String) this.h;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                rs0Var.f(str, bool);
                return dm3.a;
            case 8:
                pl plVar = (pl) this.g;
                mb2 mb2Var = (mb2) this.h;
                MotionEvent motionEvent = (MotionEvent) obj;
                if (motionEvent.getActionMasked() == 0) {
                    plVar.h = ((Boolean) ((mc) mb2Var.f()).h(motionEvent)).booleanValue() ? lb2.g : lb2.h;
                } else {
                    ((mc) mb2Var.f()).h(motionEvent);
                }
                return dm3.a;
            case vr.g /* 9 */:
                uk ukVar = (uk) this.g;
                n10 n10Var = (n10) this.h;
                ukVar.a(n10Var);
                return new zk(6, ukVar, n10Var);
            case vr.h /* 10 */:
                e93 e93Var = (e93) this.g;
                e93 e93Var2 = (e93) this.h;
                qf0 qf0Var = (qf0) obj;
                float fT = qf0Var.T(2.0f);
                float f2 = fT / 2.0f;
                qf0.a0(qf0Var, ((wx) e93Var.getValue()).a, qf0Var.T(gv3.J / 2.0f) - f2, 0L, new ga3(fT, 0.0f, 0, 0, null, 30), 108);
                if (jd0.a(((jd0) e93Var2.getValue()).f, 0.0f) > 0) {
                    qf0.a0(qf0Var, ((wx) e93Var.getValue()).a, qf0Var.T(((jd0) e93Var2.getValue()).f) - f2, 0L, fm0.a, 108);
                }
                return dm3.a;
            case 11:
                l20 l20Var = (l20) this.g;
                js1 js1Var = (js1) this.h;
                l20Var.z(obj);
                if (js1Var != null) {
                    js1Var.a(obj);
                }
                return dm3.a;
            case vr.i /* 12 */:
                ek2 ek2Var = (ek2) this.g;
                Throwable th = (Throwable) this.h;
                Throwable th2 = (Throwable) obj;
                synchronized (ek2Var.c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                uq.j(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    ek2Var.e = th;
                    i93 i93Var = ek2Var.u;
                    bk2 bk2Var = bk2.f;
                    i93Var.getClass();
                    i93Var.j(null, bk2Var);
                }
                return dm3.a;
            case 13:
                ((ss1) this.g).a.setValue(new ck0((js3) this.h, (js3) obj));
                return dm3.a;
            case 14:
                us2 us2Var = (us2) this.g;
                ws2 ws2Var = (ws2) this.h;
                yd0 yd0Var = (yd0) obj;
                float f3 = yd0Var.b ? -1.0f : 1.0f;
                long j = yd0Var.a;
                us2Var.a(1, gy1.f(f3, ws2Var.d == t02.g ? gy1.a(j, 0.0f, 1) : gy1.a(j, 0.0f, 2)));
                return dm3.a;
            case jo3.g /* 15 */:
                kq2 kq2Var = (kq2) obj;
                return s51.n(kq2Var.e, (String) this.g) ? kq2.a(kq2Var, null, (String) this.h, 7) : kq2Var;
            case 16:
                kq2 kq2Var2 = (kq2) obj;
                return s51.n(kq2Var2.e, (String) this.g) ? kq2.a(kq2Var2, (xy2) this.h, null, 11) : kq2Var2;
            case 17:
                h62.I((h62) obj, (i62) this.g, 0, 0, ((x33) this.h).N);
                return dm3.a;
            case 18:
                e93 e93Var3 = (e93) this.g;
                os1 os1Var2 = (os1) this.h;
                h43 h43Var = (h43) obj;
                float fFloatValue = ((Number) e93Var3.getValue()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (h43Var.a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (h43Var.a & 4294967295L)) * fFloatValue;
                if (Float.intBitsToFloat((int) (((h43) os1Var2.getValue()).a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((h43) os1Var2.getValue()).a & 4294967295L)) != fIntBitsToFloat2) {
                    os1Var2.setValue(new h43((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                return dm3.a;
            case 19:
                oq oqVar = (oq) obj;
                return oqVar.c(new s(14, new er1(20, ((z13) this.g).a(oqVar.f.a(), oqVar.f.getLayoutDirection(), oqVar), (te3) this.h)));
            case 20:
                y02.o((qf0) obj, (vr) this.g, ((te3) this.h).a());
                return dm3.a;
            case 21:
                return new zk(i, (os1) this.g, (qr1) this.h);
            case 22:
                cs0 cs0Var = (cs0) this.g;
                cs0 cs0Var2 = (cs0) this.h;
                je3 je3Var = (je3) obj;
                cs0Var.a();
                if (cs0Var2 != null ? ((Boolean) cs0Var2.a()).booleanValue() : true) {
                    je3Var.close();
                }
                return dm3.a;
            case 23:
                ze zeVar = (ze) this.g;
                a42 a42Var = ((pg1) this.h).b;
                sd3 sd3Var = (sd3) obj;
                og1 og1Var = (og1) zeVar.a;
                ug3 ug3VarA4 = og1Var.a();
                h83 h83Var = ug3VarA4 != null ? ug3VarA4.a : null;
                h83 h83VarC2 = ((a42Var.g() & 1) == 0 || (ug3VarA3 = og1Var.a()) == null) ? null : ug3VarA3.b;
                if (h83Var != null) {
                    h83VarC2 = h83Var.c(h83VarC2);
                }
                h83 h83VarC3 = ((a42Var.g() & 2) == 0 || (ug3VarA2 = og1Var.a()) == null) ? null : ug3VarA2.c;
                if (h83VarC2 != null) {
                    h83VarC3 = h83VarC2.c(h83VarC3);
                }
                if ((a42Var.g() & 4) != 0 && (ug3VarA = og1Var.a()) != null) {
                    h83VarC = ug3VarA.d;
                }
                if (h83VarC3 != null) {
                    h83VarC = h83VarC3.c(h83VarC);
                }
                sd3Var.b = sd3Var.a.b(new v1(new mk2(), zeVar, h83VarC, 27));
                return dm3.a;
            case 24:
                tg3 tg3Var = (tg3) this.g;
                ze zeVar2 = (ze) this.h;
                uw0 uw0Var = (uw0) obj;
                af afVar = tg3Var.b;
                d42 d42Var = tg3Var.a;
                pg3 pg3Var2 = (pg3) d42Var.getValue();
                if (s51.n(afVar, (pg3Var2 == null || (og3Var = pg3Var2.a) == null) ? null : og3Var.a) && (pg3Var = (pg3) d42Var.getValue()) != null) {
                    br1 br1Var = pg3Var.b;
                    ze zeVarC = tg3.c(zeVar2, pg3Var);
                    if (zeVarC == null) {
                        daVarI = null;
                    } else {
                        int i6 = zeVarC.c;
                        int i7 = zeVarC.b;
                        daVarI = pg3Var.i(i7, i6);
                        jk2 jk2VarB = pg3Var.b(i7);
                        int i8 = i6 - 1;
                        daVarI.j(((((long) Float.floatToRawIntBits(br1Var.d(i7) == br1Var.d(i8) ? Math.min(pg3Var.b(i8).a, jk2VarB.a) : 0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(jk2VarB.b)))) ^ (-9223372034707292160L));
                    }
                }
                c23 c23Var = daVarI != null ? new c23(z ? 1 : 0, daVarI) : null;
                if (c23Var != null) {
                    uw0Var.P(c23Var);
                    uw0Var.o(true);
                }
                return dm3.a;
            case 25:
                List list = (List) this.g;
                List list2 = (List) this.h;
                h62 h62Var3 = (h62) obj;
                if (list != null) {
                    int size = list.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        r32 r32Var = (r32) list.get(i9);
                        h62.E(h62Var3, (i62) r32Var.f, ((i41) r32Var.g).a);
                    }
                }
                if (list2 != null) {
                    int size2 = list2.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        r32 r32Var2 = (r32) list2.get(i10);
                        i62 i62Var2 = (i62) r32Var2.f;
                        cs0 cs0Var3 = (cs0) r32Var2.g;
                        h62.E(h62Var3, i62Var2, cs0Var3 != null ? ((i41) cs0Var3.a()).a : 0L);
                    }
                }
                return dm3.a;
            case 26:
                cl3.t((x50) this.g, null, new s60((gk3) this.h, null), 1);
                return new ta(3);
            case 27:
                Object obj2 = this.g;
                x50 x50Var = (x50) this.h;
                cs0 cs0Var4 = (cs0) obj;
                if (obj2 == Thread.currentThread()) {
                    cs0Var4.a();
                } else {
                    cl3.t(x50Var, null, new hm(cs0Var4, h83VarC, 10), 3);
                }
                return dm3.a;
            case 28:
                gk3 gk3Var = (gk3) this.g;
                ek3 ek3Var = (ek3) this.h;
                gk3Var.j.add(ek3Var);
                return new zk(i2, gk3Var, ek3Var);
            default:
                gk3 gk3Var2 = (gk3) this.g;
                gk3 gk3Var3 = (gk3) this.h;
                gk3Var2.k.add(gk3Var3);
                return new zk(9, gk3Var2, gk3Var3);
        }
    }

    public /* synthetic */ er1(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj2;
        this.h = obj3;
    }
}
