package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.inputmethod.ExtractedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class t22 implements gr3 {
    public static w01 a = null;
    public static final float b = 0.38f;

    public t22() {
        new ConcurrentHashMap();
    }

    public static final af A(bg3 bg3Var) {
        af afVar = bg3Var.a;
        long j = bg3Var.b;
        afVar.getClass();
        return afVar.subSequence(yg3.f(j), yg3.e(j));
    }

    public static final af B(bg3 bg3Var, int i) {
        af afVar = bg3Var.a;
        af afVar2 = bg3Var.a;
        long j = bg3Var.b;
        int iE = yg3.e(j);
        int iE2 = yg3.e(j);
        int length = iE2 + i;
        if (((i ^ length) & (iE2 ^ length)) < 0) {
            length = afVar2.g.length();
        }
        return afVar.subSequence(iE, Math.min(length, afVar2.g.length()));
    }

    public static final af C(bg3 bg3Var, int i) {
        af afVar = bg3Var.a;
        long j = bg3Var.b;
        int iF = yg3.f(j);
        int i2 = iF - i;
        if (((iF ^ i2) & (i ^ iF)) < 0) {
            i2 = 0;
        }
        return afVar.subSequence(Math.max(0, i2), yg3.f(j));
    }

    public static final pg3 D(qu2 qu2Var) {
        ns0 ns0Var;
        ArrayList arrayList = new ArrayList();
        Object objG = qu2Var.f.g(pu2.a);
        if (objG == null) {
            objG = null;
        }
        y0 y0Var = (y0) objG;
        if (y0Var == null || (ns0Var = (ns0) y0Var.b) == null || !((Boolean) ns0Var.h(arrayList)).booleanValue()) {
            return null;
        }
        return (pg3) arrayList.get(0);
    }

    public static final int E(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean F(float f, float f2, da daVar) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        da daVarA = ga.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            ga.b("Invalid rectangle, make sure no value is NaN");
        }
        if (daVarA.b == null) {
            daVarA.b = new RectF();
        }
        RectF rectF = daVarA.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = daVarA.a;
        RectF rectF2 = daVarA.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        da daVarA2 = ga.a();
        daVarA2.f(daVar, daVarA, 1);
        boolean zIsEmpty = daVarA2.a.isEmpty();
        daVarA2.g();
        daVarA.g();
        return !zIsEmpty;
    }

    public static final boolean G(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static la2 H(String str) {
        str.getClass();
        ou2 ou2VarU = n32.u(str, false);
        if (ou2VarU != null) {
            return new la2(ou2VarU);
        }
        c.q("Invalid semantic version");
        return null;
    }

    public static final void I(Bundle bundle, String str, List list) {
        bundle.putStringArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
    }

    public static final bq1 J(float f) {
        yp1 yp1Var = yp1.a;
        return f == 0.0f ? yp1Var : vm1.A(yp1Var, 0.0f, 0.0f, 0.0f, 0.0f, f, 0L, null, false, 0L, 0L, 1048319);
    }

    public static final tc K(zc zcVar, int i) {
        Object next;
        Iterator<T> it = zcVar.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((tb1) ((Map.Entry) next).getKey()).g == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (tc) entry.getValue();
        }
        return null;
    }

    public static final Object L(ei3 ei3Var, rs0 rs0Var) {
        lq.K(ei3Var, true, new nc0(ur.D(ei3Var.k.i()).h(ei3Var.l, ei3Var, ei3Var.j)));
        return b32.C(ei3Var, false, ei3Var, rs0Var);
    }

    public static final q31 M(h31 h31Var) {
        return new q31(h31Var.a, h31Var.b, h31Var.c, h31Var.d);
    }

    public static final String N(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final void O(ne neVar, pe peVar) {
        peVar.g.setValue(neVar.e.getValue());
        ue ueVar = peVar.h;
        ue ueVar2 = neVar.f;
        int iB = ueVar.b();
        for (int i = 0; i < iB; i++) {
            ueVar.e(ueVar2.a(i), i);
        }
        peVar.j = neVar.h;
        peVar.i = neVar.g;
        peVar.k = ((Boolean) neVar.i.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(long j, rs0 rs0Var, q40 q40Var) {
        fi3 fi3Var;
        qk2 qk2Var;
        if (q40Var instanceof fi3) {
            fi3Var = (fi3) q40Var;
            int i = fi3Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fi3Var.k = i - Integer.MIN_VALUE;
            } else {
                fi3Var = new fi3(q40Var);
            }
        }
        Object obj = fi3Var.j;
        int i2 = fi3Var.k;
        if (i2 == 0) {
            y02.Q(obj);
            if (j > 0) {
                qk2 qk2Var2 = new qk2();
                try {
                    fi3Var.i = qk2Var2;
                    fi3Var.k = 1;
                    ei3 ei3Var = new ei3(j, fi3Var);
                    qk2Var2.f = ei3Var;
                    Object objL = L(ei3Var, rs0Var);
                    y50 y50Var = y50.f;
                    return objL == y50Var ? y50Var : objL;
                } catch (di3 e) {
                    e = e;
                    qk2Var = qk2Var2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qk2Var = fi3Var.i;
        try {
            y02.Q(obj);
            return obj;
        } catch (di3 e2) {
            e = e2;
        }
        if (e.f != qk2Var.f) {
            throw e;
        }
        return null;
    }

    public static final Object Q(long j, rs0 rs0Var, n9 n9Var) {
        zj zjVar = ig0.f;
        long jC = 0;
        boolean z = j > 0;
        if (z) {
            long jB = ig0.b(j, vp.U(999999L, lg0.NANOSECONDS));
            jC = ((((int) jB) & 1) != 1 || jB == ig0.g || jB == ig0.h) ? ig0.c(jB, lg0.MILLISECONDS) : jB >> 1;
        } else if (z) {
            c.k();
            return null;
        }
        return P(jC, rs0Var, n9Var);
    }

    public static final void d(ym0 ym0Var, long j, nv0 nv0Var, int i) {
        nv0Var.b0(-1353562852);
        int i2 = (nv0Var.f(ym0Var) ? 4 : 2) | i | (nv0Var.e(j) ? 32 : 16);
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            Object objO = nv0Var.O();
            Object obj = c20.a;
            Object obj2 = objO;
            if (objO == obj) {
                da daVarA = ga.a();
                daVarA.i(1);
                nv0Var.j0(daVarA);
                obj2 = daVarA;
            }
            Object obj3 = (da) obj2;
            Object objO2 = nv0Var.O();
            if (objO2 == obj) {
                objO2 = b32.j(new it1(8, ym0Var));
                nv0Var.j0(objO2);
            }
            Object objB = gd.b(((Number) ((e93) objO2).getValue()).floatValue(), uq.R(pq1.h, nv0Var), null, nv0Var, 0, 28);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objO3 = nv0Var.O();
            if (z || objO3 == obj) {
                objO3 = new xc1(17, ym0Var);
                nv0Var.j0(objO3);
            }
            AtomicInteger atomicInteger = su2.a;
            bq1 bq1VarK = j43.k(new pu((ns0) objO3), 16.0f);
            boolean zF = (i3 == 4) | nv0Var.f(objB) | ((i2 & 112) == 32) | nv0Var.h(obj3);
            Object objO4 = nv0Var.O();
            if (zF || objO4 == obj) {
                Object inVar = new in(ym0Var, objB, j, obj3, 2);
                nv0Var.j0(inVar);
                objO4 = inVar;
            }
            vr.a(0, (ns0) objO4, nv0Var, bq1VarK);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new f8(ym0Var, j, i);
        }
    }

    public static final void e(boolean z, rs0 rs0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-642000585);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (nv0Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(rs0Var) ? 32 : 16;
        }
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            Object objA = jj1.a(nv0Var);
            if (objA == null) {
                nv0Var.a0(1512740606);
                objA = kj1.a(nv0Var);
            } else {
                nv0Var.a0(1512737723);
            }
            nv0Var.p(false);
            if (objA == null) {
                c.q("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = nv0Var.f(objA);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (zF || objO == zjVar) {
                mv1 mv1Var = objA instanceof mv1 ? (mv1) objA : null;
                lv1 navigationEventDispatcher = mv1Var != null ? mv1Var.getNavigationEventDispatcher() : null;
                yy1 yy1Var = objA instanceof yy1 ? (yy1) objA : null;
                objO = new uk(navigationEventDispatcher, yy1Var != null ? yy1Var.getOnBackPressedDispatcher() : null);
                nv0Var.j0(objO);
            }
            uk ukVar = (uk) objO;
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar) {
                objO2 = rn.A(nv0Var);
                nv0Var.j0(objO2);
            }
            x50 x50Var = (x50) objO2;
            long j = nv0Var.T;
            boolean zF2 = nv0Var.f(ukVar) | nv0Var.e(j);
            Object objO3 = nv0Var.O();
            if (zF2 || objO3 == zjVar) {
                objO3 = new n10(x50Var, new bc2(j, objA));
                nv0Var.j0(objO3);
            }
            n10 n10Var = (n10) objO3;
            nv0Var.a0(-348514256);
            boolean zH = nv0Var.h(n10Var) | nv0Var.h(rs0Var);
            Object objO4 = nv0Var.O();
            if (zH || objO4 == zjVar) {
                objO4 = new me1(6, n10Var, rs0Var);
                nv0Var.j0(objO4);
            }
            rn.t((cs0) objO4, nv0Var);
            int i4 = i2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i5 = i4 & 14;
            boolean zH2 = nv0Var.h(n10Var) | (i5 == 4);
            Object objO5 = nv0Var.O();
            if (zH2 || objO5 == zjVar) {
                objO5 = new wk(i3, n10Var, z);
                nv0Var.j0(objO5);
            }
            lq.i(boolValueOf, n10Var, null, (ns0) objO5, nv0Var, i5);
            boolean zH3 = nv0Var.h(ukVar) | nv0Var.h(n10Var);
            Object objO6 = nv0Var.O();
            if (zH3 || objO6 == zjVar) {
                objO6 = new er1(9, ukVar, n10Var);
                nv0Var.j0(objO6);
            }
            rn.h(ukVar, n10Var, (ns0) objO6, nv0Var);
            nv0Var.p(false);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xk(z, rs0Var, i, 3);
        }
    }

    public static final void f(boolean z, cs0 cs0Var, bq1 bq1Var, af2 af2Var, h5 h5Var, ss0 ss0Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        af2 af2Var2;
        h5 h5Var2;
        ss0 ss0Var2;
        af2 af2Var3;
        int i3;
        h5 h5Var3;
        ss0 ss0VarN;
        nv0Var.b0(-532332839);
        if ((i & 6) == 0) {
            i2 = (nv0Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        int i4 = i2 | 221184;
        if ((1572864 & i) == 0) {
            i4 |= nv0Var.h(d00Var) ? 1048576 : 524288;
        }
        if (nv0Var.R(i4 & 1, (599187 & i4) != 599186)) {
            nv0Var.W();
            int i5 = 6;
            if ((i & 1) == 0 || nv0Var.A()) {
                Object[] objArr = new Object[0];
                Object objO = nv0Var.O();
                if (objO == c20.a) {
                    objO = new f62(i5);
                    nv0Var.j0(objO);
                }
                af2Var3 = (af2) oz2.H(objArr, af2.b, (cs0) objO, nv0Var, 384);
                i3 = i4 & (-7169);
                h5Var3 = f5.g;
                ss0VarN = gq.N(1028036671, new te2(af2Var3, z), nv0Var);
            } else {
                nv0Var.U();
                i3 = i4 & (-7169);
                af2Var3 = af2Var;
                h5Var3 = h5Var;
                ss0VarN = ss0Var;
            }
            nv0Var.q();
            bq1 bq1VarD = bq1Var.d(new se2(z, cs0Var, af2Var3, re2.c));
            cn1 cn1VarD = eo.d(h5Var3, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarD);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            Integer numValueOf = Integer.valueOf(6 | ((i3 >> 15) & 112));
            jo joVar = jo.a;
            d00Var.e(joVar, nv0Var, numValueOf);
            ss0VarN.e(joVar, nv0Var, Integer.valueOf(6 | ((i3 >> 12) & 112)));
            nv0Var.p(true);
            af2Var2 = af2Var3;
            h5Var2 = h5Var3;
            ss0Var2 = ss0VarN;
        } else {
            nv0Var.U();
            af2Var2 = af2Var;
            h5Var2 = h5Var;
            ss0Var2 = ss0Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gt(z, cs0Var, bq1Var, af2Var2, h5Var2, ss0Var2, d00Var, i);
        }
    }

    public static final bu2 g(g51 g51Var, m22 m22Var) {
        h60 h60VarB = g51Var.b();
        lx lxVar = (lx) g51Var.d;
        boolean z = h60VarB == h60.f;
        return new bu2(j(lxVar, z, true, m22Var), j(lxVar, z, false, m22Var), z);
    }

    public static final ExtractedText h(bg3 bg3Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = bg3Var.a.g;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = bg3Var.b;
        extractedText.selectionStart = yg3.f(j);
        extractedText.selectionEnd = yg3.e(j);
        extractedText.flags = !y93.i0(bg3Var.a.g, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final au2 i(final g51 g51Var, final lx lxVar, au2 au2Var) {
        int i = lxVar.c;
        int i2 = lxVar.b;
        boolean z = g51Var.b;
        final int i3 = z ? i2 : i;
        pg3 pg3Var = (pg3) lxVar.e;
        int i4 = lxVar.d;
        wt0 wt0Var = new wt0(i3, 1, lxVar);
        pe1 pe1Var = pe1.f;
        final lc1 lc1VarJ = ur.J(pe1Var, wt0Var);
        final int i5 = z ? i : i2;
        lc1 lc1VarJ2 = ur.J(pe1Var, new cs0() { // from class: cu2
            @Override // defpackage.cs0
            public final Object a() {
                lx lxVar2 = lxVar;
                pg3 pg3Var2 = (pg3) lxVar2.e;
                int iIntValue = ((Number) lc1VarJ.getValue()).intValue();
                g51 g51Var2 = g51Var;
                boolean z2 = g51Var2.b;
                boolean z3 = g51Var2.b() == h60.f;
                int i6 = i3;
                long j = pg3Var2.j(i6);
                br1 br1Var = pg3Var2.b;
                int i7 = yg3.c;
                int iG = (int) (j >> 32);
                int iD = br1Var.d(iG);
                int i8 = br1Var.f;
                if (iD != iIntValue) {
                    iG = iIntValue >= i8 ? pg3Var2.g(i8 - 1) : pg3Var2.g(iIntValue);
                }
                int iC = (int) (j & 4294967295L);
                if (br1Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i8 ? br1Var.c(i8 - 1, false) : br1Var.c(iIntValue, false);
                }
                int i9 = i5;
                if (iG == i9) {
                    return lxVar2.a(iC);
                }
                if (iC == i9) {
                    return lxVar2.a(iG);
                }
                if (!(z2 ^ z3) ? i6 >= iG : i6 > iC) {
                    iG = iC;
                }
                return lxVar2.a(iG);
            }
        });
        if (1 != au2Var.c) {
            return (au2) lc1VarJ2.getValue();
        }
        if (i3 == i4) {
            return au2Var;
        }
        if (((Number) lc1VarJ.getValue()).intValue() != pg3Var.b.d(i4)) {
            return (au2) lc1VarJ2.getValue();
        }
        int i6 = au2Var.b;
        long j = pg3Var.j(i6);
        if (i4 != -1) {
            if (i3 != i4) {
                h60 h60Var = h60.f;
                if (((z ? 1 : 0) ^ ((i2 < i ? h60.g : i2 > i ? h60Var : h60.h) != h60Var ? 0 : 1)) == 0) {
                }
            }
            return lxVar.a(i3);
        }
        int i7 = yg3.c;
        return (i6 == ((int) (j >> 32)) || i6 == ((int) (j & 4294967295L))) ? (au2) lc1VarJ2.getValue() : lxVar.a(i3);
    }

    public static final au2 j(lx lxVar, boolean z, boolean z2, m22 m22Var) {
        long jF;
        long j;
        int i = z2 ? lxVar.b : lxVar.c;
        switch (m22Var.f) {
            case 8:
                String str = ((pg3) lxVar.e).a.a.g;
                jF = d32.f(d32.n(str, i), d32.m(str, i));
                break;
            default:
                jF = ((pg3) lxVar.e).j(i);
                break;
        }
        if (z ^ z2) {
            int i2 = yg3.c;
            j = jF >> 32;
        } else {
            int i3 = yg3.c;
            j = 4294967295L & jF;
        }
        return lxVar.a((int) j);
    }

    public static final Object k(float f, float f2, float f3, oe oeVar, rs0 rs0Var, mb3 mb3Var) {
        bl3 bl3Var = rn.f1;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        ns0 ns0Var = bl3Var.a;
        ue ueVarC = (ue) ns0Var.h(f6);
        if (ueVarC == null) {
            ueVarC = ((ue) ns0Var.h(f4)).c();
        }
        ue ueVar = ueVarC;
        Object objL = l(new pe(bl3Var, f4, ueVar, 56), new dd3(oeVar, bl3Var, f4, f5, ueVar), Long.MIN_VALUE, new aw2(10, rs0Var), mb3Var);
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        if (objL != y50Var) {
            objL = dm3Var;
        }
        return objL == y50Var ? objL : dm3Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(3:13|83|14)(2:18|19))(8:21|(11:87|23|24|92|25|26|91|27|(2:29|(1:31)(2:32|33))(1:34)|(1:37)|65)(7:47|85|48|49|89|50|(7:52|53|94|54|55|56|(1:63)(2:58|(2:61|62)(1:60)))(2:70|71))|40|74|(1:76)|77|(1:81)|82)|38|89|50|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0182, code lost:
    
        if (defpackage.lq.I(r9.i()).a(r5, r9) == r14) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018c, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c6, code lost:
    
        if (defpackage.lq.I(r9.i()).a(new defpackage.cw0(r5, r10), r9) == r14) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0120 A[Catch: CancellationException -> 0x018b, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x018b, blocks: (B:50:0x010b, B:52:0x0120), top: B:89:0x010b }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(pe peVar, je jeVar, long j, final ns0 ns0Var, q40 q40Var) {
        lb3 lb3Var;
        final pe peVar2;
        qk2 qk2Var;
        pe peVar3;
        final float fY;
        Object objA;
        ns0 ns0Var2;
        qk2 qk2Var2;
        qk2 qk2Var3;
        ne neVar;
        ne neVar2;
        Object obj;
        final ns0 ns0Var3;
        final qk2 qk2Var4;
        final je jeVar2;
        final pe peVar4;
        final je jeVar3 = jeVar;
        f5 f5Var = f5.a0;
        if (q40Var instanceof lb3) {
            lb3Var = (lb3) q40Var;
            int i = lb3Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                lb3Var.n = i - Integer.MIN_VALUE;
            } else {
                lb3Var = new lb3(q40Var);
            }
        }
        lb3 lb3Var2 = lb3Var;
        o50 o50Var = lb3Var2.g;
        Object obj2 = lb3Var2.m;
        int i2 = lb3Var2.n;
        int i3 = 6;
        int i4 = 0;
        y50 y50Var = y50.f;
        if (i2 == 0) {
            y02.Q(obj2);
            final Object objB = jeVar3.b(0L);
            final ue ueVarF = jeVar3.f(0L);
            final qk2 qk2Var5 = new qk2();
            if (j == Long.MIN_VALUE) {
                try {
                    o50Var.getClass();
                    fY = y(o50Var);
                    peVar2 = peVar;
                } catch (CancellationException e) {
                    e = e;
                    peVar2 = peVar;
                }
                try {
                    ns0 ns0Var4 = new ns0() { // from class: ib3
                        @Override // defpackage.ns0
                        public final Object h(Object obj3) {
                            long jLongValue = ((Long) obj3).longValue();
                            je jeVar4 = jeVar3;
                            bl3 bl3VarD = jeVar4.d();
                            Object objE = jeVar4.e();
                            pe peVar5 = peVar2;
                            ne neVar3 = new ne(objB, bl3VarD, ueVarF, jLongValue, objE, jLongValue, new jb3(peVar5, 1));
                            t22.w(neVar3, jLongValue, fY, jeVar4, peVar5, ns0Var);
                            qk2Var5.f = neVar3;
                            return dm3.a;
                        }
                    };
                    qk2Var = qk2Var5;
                    try {
                        lb3Var2.i = peVar2;
                        lb3Var2.j = jeVar3;
                        lb3Var2.k = ns0Var;
                        lb3Var2.l = qk2Var;
                        lb3Var2.n = 1;
                        if (!jeVar3.a()) {
                            objA = lq.I(lb3Var2.i()).a(new cw0(ns0Var4, i3), lb3Var2);
                        } else {
                            if (lb3Var2.i().m(f5Var) != null) {
                                throw new ClassCastException();
                            }
                            objA = lq.I(lb3Var2.i()).a(ns0Var4, lb3Var2);
                        }
                        if (objA != y50Var) {
                            peVar3 = peVar2;
                            ns0Var2 = ns0Var;
                            qk2Var2 = qk2Var;
                        }
                        return y50Var;
                    } catch (CancellationException e2) {
                        e = e2;
                        peVar3 = peVar2;
                        qk2Var2 = qk2Var;
                    }
                } catch (CancellationException e3) {
                    e = e3;
                    qk2Var = qk2Var5;
                    peVar3 = peVar2;
                    qk2Var2 = qk2Var;
                    neVar = (ne) qk2Var2.f;
                    if (neVar != null) {
                    }
                    neVar2 = (ne) qk2Var2.f;
                    if (neVar2 != null) {
                        peVar3.k = false;
                    }
                    throw e;
                }
            } else {
                qk2Var = qk2Var5;
                try {
                    ne neVar3 = new ne(objB, jeVar3.d(), ueVarF, j, jeVar3.e(), j, new jb3(peVar, i4));
                    o50Var.getClass();
                    w(neVar3, j, y(o50Var), jeVar3, peVar, ns0Var);
                    qk2Var.f = neVar3;
                    peVar3 = peVar;
                    jeVar3 = jeVar;
                    ns0Var2 = ns0Var;
                    qk2Var3 = qk2Var;
                    obj = qk2Var3.f;
                    obj.getClass();
                    if (((Boolean) ((ne) obj).i.getValue()).booleanValue()) {
                        return dm3.a;
                    }
                    try {
                        o50 o50Var2 = lb3Var2.g;
                        o50Var2.getClass();
                        final float fY2 = y(o50Var2);
                        ns0 ns0Var5 = new ns0() { // from class: kb3
                            @Override // defpackage.ns0
                            public final Object h(Object obj3) {
                                long jLongValue = ((Long) obj3).longValue();
                                Object obj4 = qk2Var4.f;
                                obj4.getClass();
                                t22.w((ne) obj4, jLongValue, fY2, jeVar2, peVar4, ns0Var3);
                                return dm3.a;
                            }
                        };
                        qk2Var2 = qk2Var4;
                        jeVar3 = jeVar2;
                        peVar3 = peVar4;
                        ns0Var2 = ns0Var3;
                        lb3Var2.i = peVar3;
                        lb3Var2.j = jeVar3;
                        lb3Var2.k = ns0Var2;
                        lb3Var2.l = qk2Var2;
                        lb3Var2.n = 2;
                        if (!jeVar3.a()) {
                        } else if (lb3Var2.i().m(f5Var) != null) {
                            throw new ClassCastException();
                        }
                    } catch (CancellationException e4) {
                        e = e4;
                        qk2Var2 = qk2Var4;
                        peVar3 = peVar4;
                    }
                    ns0Var3 = ns0Var2;
                    qk2Var4 = qk2Var3;
                    jeVar2 = jeVar3;
                    peVar4 = peVar3;
                } catch (CancellationException e5) {
                    e = e5;
                    peVar3 = peVar;
                    qk2Var2 = qk2Var;
                }
            }
            qk2Var2 = qk2Var;
            neVar = (ne) qk2Var2.f;
            if (neVar != null) {
                neVar.i.setValue(Boolean.FALSE);
            }
            neVar2 = (ne) qk2Var2.f;
            if (neVar2 != null && neVar2.g == peVar3.i) {
                peVar3.k = false;
            }
            throw e;
        }
        if (i2 != 1 && i2 != 2) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qk2Var2 = lb3Var2.l;
        ns0Var2 = lb3Var2.k;
        jeVar3 = lb3Var2.j;
        peVar3 = lb3Var2.i;
        try {
            y02.Q(obj2);
        } catch (CancellationException e6) {
            e = e6;
        }
        qk2Var3 = qk2Var2;
        obj = qk2Var3.f;
        obj.getClass();
        if (((Boolean) ((ne) obj).i.getValue()).booleanValue()) {
        }
    }

    public static /* synthetic */ Object m(float f, float f2, oe oeVar, rs0 rs0Var, mb3 mb3Var, int i) {
        if ((i & 8) != 0) {
            oeVar = n92.F(0.0f, 0.0f, null, 7);
        }
        return k(f, f2, 0.0f, oeVar, rs0Var, mb3Var);
    }

    public static final Object n(pe peVar, h80 h80Var, boolean z, ns0 ns0Var, q40 q40Var) {
        Object objL = l(peVar, new g80(h80Var, peVar.f, peVar.g.getValue(), peVar.h), z ? peVar.i : Long.MIN_VALUE, ns0Var, q40Var);
        return objL == y50.f ? objL : dm3.a;
    }

    public static final Object o(pe peVar, Float f, oe oeVar, boolean z, ns0 ns0Var, q40 q40Var) {
        Object objL = l(peVar, new dd3(oeVar, peVar.f, peVar.g.getValue(), f, peVar.h), z ? peVar.i : Long.MIN_VALUE, ns0Var, q40Var);
        return objL == y50.f ? objL : dm3.a;
    }

    public static final au2 p(au2 au2Var, lx lxVar, int i) {
        return new au2(((pg3) lxVar.e).a(i), i, au2Var.c);
    }

    public static final xd3 r(ia0 ia0Var) {
        ie3 ie3Var;
        vd3 vd3Var = new vd3();
        n32.B(ia0Var, zd3.a, new aw2(new aw2(11, vd3Var), new vw2(1, vd3Var, vd3.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 6)));
        as1 as1Var = new as1();
        as1 as1Var2 = vd3Var.a;
        Object[] objArr = as1Var2.a;
        int i = as1Var2.b;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        wd3 wd3Var = null;
        while (true) {
            ie3Var = ie3.b;
            if (i3 >= i) {
                break;
            }
            wd3 wd3Var2 = (wd3) objArr[i3];
            if (!z || wd3Var2 != ie3Var) {
                if (wd3Var2 == ie3Var && wd3Var == ie3Var) {
                    z = false;
                    break;
                    break;
                }
                if (wd3Var2 != ie3Var) {
                    as1 as1Var3 = vd3Var.b;
                    Object[] objArr2 = as1Var3.a;
                    int i4 = as1Var3.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (!((Boolean) ((ns0) objArr2[i5]).h(wd3Var2)).booleanValue()) {
                            z = false;
                            break;
                        }
                    }
                }
                as1Var.b(wd3Var2);
                z = false;
                wd3Var = wd3Var2;
            }
            i3++;
        }
        if (((wd3) (as1Var.i() ? null : as1Var.a[as1Var.b - 1])) == ie3Var) {
            as1Var.l(as1Var.b - 1);
        }
        yr1 yr1Var = as1Var.c;
        if (yr1Var == null) {
            yr1Var = new yr1(i2, as1Var);
            as1Var.c = yr1Var;
        }
        return new xd3(yr1Var);
    }

    public static final void w(ne neVar, long j, float f, je jeVar, pe peVar, ns0 ns0Var) {
        long jC = f == 0.0f ? jeVar.c() : (long) ((j - neVar.c) / f);
        neVar.g = j;
        neVar.e.setValue(jeVar.b(jC));
        neVar.f = jeVar.f(jC);
        if (jeVar.g(jC)) {
            neVar.h = neVar.g;
            neVar.i.setValue(Boolean.FALSE);
        }
        O(neVar, peVar);
        ns0Var.h(neVar);
    }

    public static final void x(qf0 qf0Var, da daVar, jk2 jk2Var, long j, float f, wj wjVar) {
        daVar.g();
        daVar.a.moveTo(0.0f, 0.0f);
        float fT = qf0Var.T(10.0f);
        float f2 = wjVar.b;
        daVar.e((fT * f2) / 2.0f, qf0Var.T(5.0f) * f2);
        daVar.e(qf0Var.T(10.0f) * f2, 0.0f);
        float fMin = Math.min(jk2Var.c - jk2Var.a, jk2Var.d - jk2Var.b) / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jk2Var.b() >> 32)) + fMin) - ((qf0Var.T(10.0f) * f2) / 2.0f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jk2Var.b() & 4294967295L)) - qf0Var.T(2.5f);
        daVar.j((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
        float fT2 = wjVar.a - qf0Var.T(2.5f);
        long jY0 = qf0Var.y0();
        pi piVarZ = qf0Var.Z();
        long jA = piVarZ.A();
        piVarZ.k().l();
        try {
            ((yl1) piVarZ.g).F(fT2, jY0);
            qf0.b1(qf0Var, daVar, j, f, new ga3(qf0Var.T(2.5f), 0.0f, 0, 0, null, 30), 48);
        } finally {
            nc2.t(piVarZ, jA);
        }
    }

    public static final float y(o50 o50Var) {
        iq1 iq1Var = (iq1) o50Var.m(f5.d0);
        float fV = iq1Var != null ? iq1Var.v() : 1.0f;
        if (fV >= 0.0f) {
            return fV;
        }
        ac2.b("negative scale factor");
        return fV;
    }

    public static final int z(y22 y22Var) {
        return (int) (y22Var.e == t02.f ? y22Var.i() & 4294967295L : y22Var.i() >> 32);
    }

    public abstract void q();

    public abstract Typeface s(Context context, pq0 pq0Var, Resources resources, int i);

    public abstract Typeface t(Context context, zq0[] zq0VarArr, int i);

    public Typeface u(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface v(Context context, Resources resources, int i, String str);

    @Override // defpackage.gr3
    public void b() {
    }

    @Override // defpackage.gr3
    public void c() {
    }
}
