package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class z00 implements rs0 {
    public final /* synthetic */ int f;

    public /* synthetic */ z00(int i) {
        this.f = 21;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v130 */
    /* JADX WARN: Type inference failed for: r1v131 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44, types: [aq1] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49, types: [aq1] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [qs1] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [qs1] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r8v14 */
    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        bz bzVar;
        int i = this.f;
        Bundle bundleU = null;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s01.a(pq.z(), null, null, 0L, nv0Var, 48, 12);
                } else {
                    nv0Var.U();
                }
                return dm3Var;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mg3.b(oz2.M(2131624226, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    w01 w01VarB = jo3.b;
                    if (w01VarB == null) {
                        v01 v01Var = new v01("Filled.Speed", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = vo3.a;
                        w73 w73Var = new w73(wx.b);
                        tx0 tx0Var = new tx0(1);
                        tx0Var.j(20.38f, 8.57f);
                        tx0Var.i(-1.23f, 1.85f);
                        tx0Var.a(8.0f, 8.0f, -0.22f, 7.58f, true);
                        tx0Var.h(5.07f, 18.0f);
                        l42 l42Var = new l42(8.0f, 8.0f, 0.0f, false, true, 15.58f, 6.85f);
                        ArrayList arrayList = tx0Var.a;
                        arrayList.add(l42Var);
                        tx0Var.i(1.85f, -1.23f);
                        arrayList.add(new l42(10.0f, 10.0f, 0.0f, false, false, 3.35f, 19.0f));
                        tx0Var.a(2.0f, 2.0f, 1.72f, 1.0f, false);
                        tx0Var.g(13.85f);
                        tx0Var.a(2.0f, 2.0f, 1.74f, -1.0f, false);
                        tx0Var.a(10.0f, 10.0f, -0.27f, -10.44f, false);
                        tx0Var.c();
                        tx0Var.j(10.59f, 15.41f);
                        tx0Var.a(2.0f, 2.0f, 2.83f, 0.0f, false);
                        tx0Var.i(5.66f, -8.49f);
                        tx0Var.i(-8.49f, 5.66f);
                        tx0Var.a(2.0f, 2.0f, 0.0f, 2.83f, false);
                        tx0Var.c();
                        v01.a(v01Var, arrayList, w73Var);
                        w01VarB = v01Var.b();
                        jo3.b = w01VarB;
                    }
                    s01.a(w01VarB, null, null, 0L, nv0Var3, 48, 12);
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    s01.a(pq.z(), null, null, 0L, nv0Var4, 48, 12);
                } else {
                    nv0Var4.U();
                }
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    mg3.b(oz2.M(2131624226, nv0Var5), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var5, 0, 0, 262142);
                } else {
                    nv0Var5.U();
                }
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    s01.a(s51.v(), oz2.M(2131624103, nv0Var6), null, 0L, nv0Var6, 0, 12);
                } else {
                    nv0Var6.U();
                }
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    nv0Var7.U();
                }
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                nv0 nv0Var8 = (nv0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (nv0Var8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    mg3.b(oz2.M(2131624630, nv0Var8), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var8, 0, 0, 262142);
                } else {
                    nv0Var8.U();
                }
                return dm3Var;
            case 8:
                nv0 nv0Var9 = (nv0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!nv0Var9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    nv0Var9.U();
                }
                return dm3Var;
            case vr.g /* 9 */:
                ((tb1) ((w10) obj)).g0((bq1) obj2);
                return dm3Var;
            case vr.h /* 10 */:
                p20 p20Var = (p20) obj2;
                tb1 tb1Var = (tb1) ((w10) obj);
                tb1Var.H = p20Var;
                ax1 ax1Var = tb1Var.L;
                r93 r93Var = s20.h;
                n52 n52Var = (n52) p20Var;
                n52Var.getClass();
                tb1Var.c0((ua0) vp.Q(n52Var, r93Var));
                n52 n52Var2 = (n52) p20Var;
                bb1 bb1Var = (bb1) vp.Q(n52Var2, s20.n);
                if (tb1Var.F != bb1Var) {
                    tb1Var.F = bb1Var;
                    tb1Var.E();
                    tb1 tb1VarU = tb1Var.u();
                    if (tb1VarU != null) {
                        tb1VarU.C();
                    } else {
                        q12 q12Var = tb1Var.t;
                        if (q12Var != null) {
                            ((h7) q12Var).invalidate();
                        }
                    }
                    tb1Var.D();
                    for (aq1 aq1Var = ax1Var.f; aq1Var != null; aq1Var = aq1Var.k) {
                        aq1Var.Z0();
                    }
                }
                tb1Var.h0((oq3) vp.Q(n52Var2, s20.t));
                aq1 aq1Var2 = ax1Var.f;
                if ((aq1Var2.i & 32768) != 0) {
                    while (aq1Var2 != null) {
                        if ((aq1Var2.h & 32768) != 0) {
                            ?? J = aq1Var2;
                            ?? qs1Var = 0;
                            while (J != 0) {
                                if (J instanceof m20) {
                                    aq1 aq1Var3 = ((aq1) ((m20) J)).f;
                                    if (aq1Var3.s) {
                                        fx1.c(aq1Var3);
                                    } else {
                                        aq1Var3.o = true;
                                    }
                                } else if ((J.h & 32768) != 0 && (J instanceof ja0)) {
                                    aq1 aq1Var4 = ((ja0) J).u;
                                    int i3 = 0;
                                    J = J;
                                    qs1Var = qs1Var;
                                    while (aq1Var4 != null) {
                                        if ((aq1Var4.h & 32768) != 0) {
                                            i3++;
                                            qs1Var = qs1Var;
                                            if (i3 == 1) {
                                                J = aq1Var4;
                                            } else {
                                                if (qs1Var == 0) {
                                                    qs1Var = new qs1(new aq1[16]);
                                                }
                                                if (J != 0) {
                                                    qs1Var.b(J);
                                                    J = 0;
                                                }
                                                qs1Var.b(aq1Var4);
                                            }
                                        }
                                        aq1Var4 = aq1Var4.k;
                                        J = J;
                                        qs1Var = qs1Var;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                J = vr.j(qs1Var);
                            }
                        }
                        if ((aq1Var2.i & 32768) != 0) {
                            aq1Var2 = aq1Var2.k;
                        }
                    }
                }
                return dm3Var;
            case 11:
                ((tb1) ((w10) obj)).f0((cn1) obj2);
                return dm3Var;
            case vr.i /* 12 */:
                ((Integer) obj2).getClass();
                ((tb1) ((w10) obj)).getClass();
                return dm3Var;
            case 13:
                o50 o50Var = (o50) obj;
                m50 m50Var = (m50) obj2;
                o50Var.getClass();
                m50Var.getClass();
                o50 o50VarU = o50Var.u(m50Var.getKey());
                li0 li0Var = li0.f;
                if (o50VarU == li0Var) {
                    return m50Var;
                }
                f5 f5Var = f5.L;
                q50 q50Var = (q50) o50VarU.m(f5Var);
                if (q50Var == null) {
                    bzVar = new bz(m50Var, o50VarU);
                } else {
                    o50 o50VarU2 = o50VarU.u(f5Var);
                    if (o50VarU2 == li0Var) {
                        return new bz(q50Var, m50Var);
                    }
                    bzVar = new bz(q50Var, new bz(m50Var, o50VarU2));
                }
                return bzVar;
            case 14:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case jo3.g /* 15 */:
                return ((o50) obj).k((m50) obj2);
            case 16:
                return ((o50) obj).k((m50) obj2);
            case 17:
                uo1 uo1Var = (uo1) obj;
                Throwable cancellationException = (Throwable) obj2;
                uo1Var.getClass();
                gz gzVar = uo1Var.b;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                gzVar.Y(new jz(cancellationException, false));
                return dm3Var;
            case 18:
                i90 i90Var = (i90) obj2;
                return vr.L(Integer.valueOf(i90Var.k()), Float.valueOf(y02.g(i90Var.l(), -0.5f, 0.5f)), Integer.valueOf(i90Var.n()));
            case 19:
                qf0 qf0Var = (qf0) obj;
                ns0 ns0Var = (ns0) obj2;
                qf0Var.getClass();
                ns0Var.getClass();
                ns0Var.h(qf0Var);
                return dm3Var;
            case 20:
                return (gy1) obj2;
            case 21:
                ((Integer) obj2).getClass();
                da1.a(jo3.y(1), (nv0) obj);
                return dm3Var;
            case 22:
                ie1 ie1Var = (ie1) obj2;
                return vr.L(Integer.valueOf(ie1Var.g()), Integer.valueOf(ie1Var.h()));
            case 23:
                Map mapC = ((le1) obj2).c();
                if (mapC.isEmpty()) {
                    return null;
                }
                return mapC;
            case 24:
                ((z60) obj).getClass();
                return dm3Var;
            case 25:
                ((z60) obj).getClass();
                return dm3Var;
            case 26:
                ((z60) obj).getClass();
                return dm3Var;
            case 27:
                ((il1) obj2).getClass();
                return dm3Var;
            case 28:
                nu1 nu1Var = (nu1) obj2;
                wt1 wt1Var = nu1Var.b;
                LinkedHashMap linkedHashMap = wt1Var.m;
                mj<qt1> mjVar = wt1Var.f;
                LinkedHashMap linkedHashMap2 = wt1Var.l;
                ArrayList arrayList2 = new ArrayList();
                Bundle bundleU2 = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                for (Map.Entry entry : om1.b0(wt1Var.s.a).entrySet()) {
                    ((yv1) entry.getValue()).getClass();
                }
                if (!arrayList2.isEmpty()) {
                    bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                    t22.I(bundleU2, "android-support-nav:controller:navigatorState:names", arrayList2);
                    bundleU.putBundle("android-support-nav:controller:navigatorState", bundleU2);
                }
                if (!mjVar.isEmpty()) {
                    if (bundleU == null) {
                        bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    for (qt1 qt1Var : mjVar) {
                        qt1Var.getClass();
                        int i4 = qt1Var.g.g.a;
                        String str = qt1Var.k;
                        st1 st1Var = qt1Var.m;
                        Bundle bundleA = st1Var.a();
                        Bundle bundleU3 = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                        st1Var.h.b(bundleU3);
                        Bundle bundleU4 = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                        str.getClass();
                        bundleU4.putString("nav-entry-state:id", str);
                        bundleU4.putInt("nav-entry-state:destination-id", i4);
                        if (bundleA == null) {
                            bundleA = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                        }
                        bundleU4.putBundle("nav-entry-state:args", bundleA);
                        bundleU4.putBundle("nav-entry-state:saved-state", bundleU3);
                        arrayList3.add(bundleU4);
                    }
                    bundleU.putParcelableArrayList("android-support-nav:controller:backStack", arrayList3);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundleU == null) {
                        bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList4 = new ArrayList();
                    int i5 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int iIntValue10 = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        int i6 = i5 + 1;
                        iArr[i5] = iIntValue10;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList4.add(str2);
                        i5 = i6;
                    }
                    bundleU.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    t22.I(bundleU, "android-support-nav:controller:backStackIds", arrayList4);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundleU == null) {
                        bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        mj mjVar2 = (mj) entry3.getValue();
                        arrayList5.add(str3);
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        Iterator it = mjVar2.iterator();
                        while (it.hasNext()) {
                            w9 w9Var = ((tt1) it.next()).a;
                            w9Var.getClass();
                            Bundle bundleU5 = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                            String str4 = (String) w9Var.b;
                            str4.getClass();
                            bundleU5.putString("nav-entry-state:id", str4);
                            bundleU5.putInt("nav-entry-state:destination-id", w9Var.a);
                            Bundle bundleU6 = (Bundle) w9Var.c;
                            if (bundleU6 == null) {
                                bundleU6 = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                            }
                            bundleU5.putBundle("nav-entry-state:args", bundleU6);
                            Bundle bundle = (Bundle) w9Var.d;
                            bundle.getClass();
                            bundleU5.putBundle("nav-entry-state:saved-state", bundle);
                            arrayList6.add(bundleU5);
                        }
                        bundleU.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str3, arrayList6);
                    }
                    t22.I(bundleU, "android-support-nav:controller:backStackStates", arrayList5);
                }
                if (nu1Var.e) {
                    if (bundleU == null) {
                        bundleU = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
                    }
                    bundleU.putBoolean("android-support-nav:controller:deepLinkHandled", nu1Var.e);
                }
                return bundleU;
            default:
                return Integer.valueOf(((xm1) obj).x0(((Integer) obj2).intValue()));
        }
    }

    public /* synthetic */ z00(int i, byte b) {
        this.f = i;
    }
}
