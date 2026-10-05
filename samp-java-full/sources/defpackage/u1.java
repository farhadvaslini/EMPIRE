package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u1 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ u1(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0459  */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [aq1] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [aq1] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32, types: [qs1] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [qs1] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r6v0, types: [p40] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [dy1] */
    /* JADX WARN: Type inference failed for: r6v12, types: [dy1] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        aj1 aj1Var;
        vu2 vu2Var;
        tb1 tb1Var;
        jk2 jk2Var;
        ?? r6;
        List listD0;
        long jA;
        Object value;
        Map map;
        ?? dy1Var = 0;
        d01VarArr = null;
        d01[] d01VarArr = null;
        int i = 0;
        switch (this.f) {
            case 0:
                cj1 cj1Var = (cj1) this.g;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.h;
                cj1Var.getClass();
                accessibilityManager.removeAccessibilityStateChangeListener(cj1Var);
                bj1 bj1Var = cj1Var.i;
                if (bj1Var != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(bj1Var);
                }
                if (Build.VERSION.SDK_INT >= 33 && (aj1Var = cj1Var.j) != null) {
                    p1.j(accessibilityManager, l1.e(aj1Var));
                }
                return dm3.a;
            case 1:
                return Boolean.valueOf(h7.d((h7) this.g, (KeyEvent) this.h));
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                bs2 bs2Var = (bs2) this.g;
                o7 o7Var = (o7) this.h;
                tr2 tr2Var = bs2Var.j;
                tr2 tr2Var2 = bs2Var.k;
                Float f = bs2Var.h;
                Float f2 = bs2Var.i;
                float fFloatValue = (tr2Var == null || f == null) ? 0.0f : ((Number) tr2Var.a.a()).floatValue() - f.floatValue();
                float fFloatValue2 = (tr2Var2 == null || f2 == null) ? 0.0f : ((Number) tr2Var2.a.a()).floatValue() - f2.floatValue();
                if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                    int iV = o7Var.v(bs2Var.f);
                    xu2 xu2Var = (xu2) o7Var.n().b(o7Var.p);
                    if (xu2Var != null) {
                        try {
                            s1 s1Var = o7Var.r;
                            if (s1Var != null) {
                                s1Var.a.setBoundsInScreen(o7Var.f(xu2Var));
                            }
                            break;
                        } catch (IllegalStateException unused) {
                        }
                    }
                    xu2 xu2Var2 = (xu2) o7Var.n().b(o7Var.q);
                    if (xu2Var2 != null) {
                        try {
                            s1 s1Var2 = o7Var.s;
                            if (s1Var2 != null) {
                                s1Var2.a.setBoundsInScreen(o7Var.f(xu2Var2));
                            }
                            break;
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    o7Var.i.invalidate();
                    xu2 xu2Var3 = (xu2) o7Var.n().b(iV);
                    if (xu2Var3 != null && (vu2Var = xu2Var3.a) != null && (tb1Var = vu2Var.c) != null) {
                        if (tr2Var != null) {
                            o7Var.u.i(iV, tr2Var);
                        }
                        if (tr2Var2 != null) {
                            o7Var.v.i(iV, tr2Var2);
                        }
                        o7Var.r(tb1Var);
                    }
                }
                if (tr2Var != null) {
                    bs2Var.h = (Float) tr2Var.a.a();
                }
                if (tr2Var2 != null) {
                    bs2Var.i = (Float) tr2Var2.a.a();
                }
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((qk2) this.g).f = ((cs0) this.h).a();
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((js) this.g).l(this.h);
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((c10) this.g).c = (cs0) this.h;
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                il ilVar = (il) this.g;
                vb1 vb1Var = (vb1) this.h;
                ilVar.B = ilVar.w.a(vb1Var.f.a(), vb1Var.getLayoutDirection(), vb1Var);
                return dm3.a;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                bg3 bg3Var = (bg3) this.g;
                os1 os1Var = (os1) this.h;
                if (!yg3.b(bg3Var.b, ((bg3) os1Var.getValue()).b) || !s51.n(bg3Var.c, ((bg3) os1Var.getValue()).c)) {
                    os1Var.setValue(bg3Var);
                }
                return dm3.a;
            case 8:
                tg3 tg3Var = (tg3) this.g;
                af afVar = (af) this.h;
                if (tg3Var == null) {
                    return afVar;
                }
                l73 l73Var = tg3Var.c;
                boolean zIsEmpty = l73Var.isEmpty();
                af afVar2 = tg3Var.b;
                if (!zIsEmpty) {
                    sd3 sd3Var = new sd3(afVar2);
                    int size = l73Var.size();
                    while (i < size) {
                        ((ns0) l73Var.get(i)).h(sd3Var);
                        i++;
                    }
                    afVar2 = sd3Var.b;
                }
                tg3Var.b = afVar2;
                return afVar2 == null ? afVar : afVar2;
            case vr.g /* 9 */:
                cl3.t((x50) this.g, null, new jm((jj3) this.h, dy1Var, i), 3);
                return Boolean.TRUE;
            case vr.h /* 10 */:
                cs0 cs0Var = (cs0) this.g;
                ex1 ex1Var = (ex1) this.h;
                if (cs0Var != null && (jk2Var = (jk2) cs0Var.a()) != null) {
                    return jk2Var;
                }
                if (!ex1Var.w1().s) {
                    ex1Var = null;
                }
                if (ex1Var != null) {
                    return b32.b(0L, lr.T(ex1Var.h));
                }
                return null;
            case 11:
                ((nq) this.g).v.h((oq) this.h);
                return dm3.a;
            case vr.i /* 12 */:
                j20 j20Var = (j20) this.g;
                Object obj = this.h;
                nv0 nv0Var = j20Var.f;
                j53 j53Var = nv0Var.c;
                i53 i53VarC = j53Var.c();
                int i2 = 0;
                while (i2 < j53Var.g) {
                    try {
                        if (i53VarC.l(i2)) {
                            Object objN = i53VarC.n(i2);
                            if (objN != obj) {
                                rv0 rv0Var = objN instanceof rv0 ? (rv0) objN : null;
                                if ((rv0Var != null ? rv0Var.a : null) == obj) {
                                }
                            }
                            dy1 dy1Var2 = new dy1(i2, null);
                            i53VarC.c();
                            r6 = dy1Var2;
                            if (r6 != 0) {
                                int i3 = r6.a;
                                Integer num = r6.b;
                                i53 i53VarC2 = j53Var.c();
                                try {
                                    ArrayList arrayListV = pq.V(i53VarC2, i3, num);
                                    i53VarC2.c();
                                    listD0 = qx.D0(arrayListV, nv0Var.H());
                                } finally {
                                }
                            } else {
                                listD0 = ni0.f;
                            }
                            return new t10(listD0, nv0Var.C);
                        }
                        int[] iArr = i53VarC.b;
                        int i4 = i2 + 1;
                        int iB = (i4 < i53VarC.c ? iArr[(i4 * 5) + 4] : i53VarC.e) - l53.b(iArr, i2);
                        for (int i5 = 0; i5 < iB; i5++) {
                            Object objH = i53VarC.h(i2, i5);
                            if (objH != obj) {
                                rv0 rv0Var2 = objH instanceof rv0 ? (rv0) objH : null;
                                if ((rv0Var2 != null ? rv0Var2.a : null) != obj) {
                                }
                            }
                            dy1Var = new dy1(i2, Integer.valueOf(i5));
                            if (r6 != 0) {
                            }
                            return new t10(listD0, nv0Var.C);
                        }
                        i2 = i4;
                    } finally {
                    }
                }
                if (r6 != 0) {
                }
                return new t10(listD0, nv0Var.C);
            case 13:
                return new i41(uq.H(((yd3) this.g).B((ab1) ((cs0) this.h).a())));
            case 14:
                ((ee3) this.g).d.h((je3) this.h);
                return dm3.a;
            case jo3.g /* 15 */:
                ((mb0) this.g).e((qt1) this.h, false);
                return dm3.a;
            case 16:
                ((qk2) this.g).f = ur.z((pp0) this.h, g62.a);
                return dm3.a;
            case 17:
                ((qk2) this.g).f = ((rp0) this.h).r1();
                return dm3.a;
            case 18:
                ((qk2) this.g).f = ur.z((wp0) this.h, g62.a);
                return dm3.a;
            case 19:
                return Boolean.valueOf(GameActivity.K0((GameActivity) this.g, (byte[]) this.h));
            case 20:
                ((iy0) this.g).d((aq1) this.h);
                return dm3.a;
            case 21:
                wz0 wz0Var = (wz0) this.g;
                d01 d01Var = (d01) this.h;
                try {
                    wz0Var.f.c(d01Var);
                    break;
                } catch (IOException e) {
                    m62 m62Var = m62.a;
                    m62.a.j("Http2Connection.Listener failure for " + wz0Var.h, 4, e);
                    try {
                        d01Var.d(nj0.i, e);
                        break;
                    } catch (IOException unused3) {
                    }
                }
                return dm3.a;
            case 22:
                gw gwVar = (gw) this.g;
                pz2 pz2Var = (pz2) this.h;
                qk2 qk2Var = new qk2();
                wz0 wz0Var2 = (wz0) gwVar.h;
                synchronized (wz0Var2.B) {
                    synchronized (wz0Var2) {
                        try {
                            pz2 pz2Var2 = wz0Var2.w;
                            pz2 pz2Var3 = new pz2();
                            pz2Var2.getClass();
                            for (int i6 = 0; i6 < 10; i6++) {
                                if (((1 << i6) & pz2Var2.a) != 0) {
                                    pz2Var3.b(i6, pz2Var2.b[i6]);
                                }
                            }
                            for (int i7 = 0; i7 < 10; i7++) {
                                if (((1 << i7) & pz2Var.a) != 0) {
                                    pz2Var3.b(i7, pz2Var.b[i7]);
                                }
                            }
                            qk2Var.f = pz2Var3;
                            jA = ((long) pz2Var3.a()) - ((long) pz2Var2.a());
                            if (jA != 0 && !wz0Var2.g.isEmpty()) {
                                d01VarArr = (d01[]) wz0Var2.g.values().toArray(new d01[0]);
                            }
                            pz2 pz2Var4 = (pz2) qk2Var.f;
                            pz2Var4.getClass();
                            wz0Var2.w = pz2Var4;
                            hd3.b(wz0Var2.o, wz0Var2.h + " onSettings", new u1(23, wz0Var2, qk2Var));
                        } finally {
                        }
                    }
                    try {
                        wz0Var2.B.b((pz2) qk2Var.f);
                    } catch (IOException e2) {
                        nj0 nj0Var = nj0.i;
                        wz0Var2.b(nj0Var, nj0Var, e2);
                    }
                    break;
                }
                if (d01VarArr != null) {
                    int length = d01VarArr.length;
                    while (i < length) {
                        d01 d01Var2 = d01VarArr[i];
                        synchronized (d01Var2) {
                            d01Var2.j += jA;
                            if (jA > 0) {
                                d01Var2.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return dm3.a;
            case 23:
                wz0 wz0Var3 = (wz0) this.g;
                wz0Var3.f.a(wz0Var3, (pz2) ((qk2) this.h).f);
                return dm3.a;
            case 24:
                cs0 cs0Var2 = (cs0) this.g;
                b42 b42Var = (b42) this.h;
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (jUptimeMillis - b42Var.g() > 500) {
                    b42Var.h(jUptimeMillis);
                    cs0Var2.a();
                }
                return dm3.a;
            case 25:
                vg2 vg2Var = (vg2) this.g;
                os1 os1Var2 = (os1) this.h;
                dh2 dh2Var = dh2.a;
                String str = vg2Var.a;
                i93 i93Var = dh2.b;
                vg2 vg2Var2 = (vg2) ((Map) i93Var.getValue()).get(str);
                if (vg2Var2 != null) {
                    vi2 vi2Var = vg2Var2.g;
                    w83 w83Var = vi2Var.K;
                    if (w83Var != null) {
                        w83Var.c(null);
                    }
                    vi2Var.K = null;
                    vi2Var.J = null;
                    vi2Var.f();
                    i93 i93Var2 = vi2Var.e;
                    kg2 kg2Var = kg2.a;
                    i93Var2.getClass();
                    i93Var2.j(null, kg2Var);
                    i93 i93Var3 = vi2Var.g;
                    ni0 ni0Var = ni0.f;
                    i93Var3.getClass();
                    i93Var3.j(null, ni0Var);
                    i93 i93Var4 = vi2Var.i;
                    i93Var4.getClass();
                    i93Var4.j(null, ni0Var);
                    i93 i93Var5 = vi2Var.k;
                    i93Var5.getClass();
                    i93Var5.j(null, ni0Var);
                    i93 i93Var6 = vi2Var.o;
                    i93Var6.getClass();
                    i93Var6.j(null, ni0Var);
                    i93 i93Var7 = vi2Var.q;
                    i93Var7.getClass();
                    i93Var7.j(null, ni0Var);
                    i93 i93Var8 = vi2Var.s;
                    i93Var8.getClass();
                    i93Var8.j(null, ni0Var);
                    i93 i93Var9 = vi2Var.u;
                    i93Var9.getClass();
                    i93Var9.j(null, ni0Var);
                    i93 i93Var10 = vi2Var.w;
                    hp3 hp3Var = new hp3();
                    i93Var10.getClass();
                    i93Var10.j(null, hp3Var);
                    i93 i93Var11 = vi2Var.y;
                    lj1 lj1Var = new lj1();
                    i93Var11.getClass();
                    i93Var11.j(null, lj1Var);
                    vi2Var.M = -1;
                    vi2Var.m.i(null);
                    i93 i93Var12 = vi2Var.E;
                    i93Var12.getClass();
                    i93Var12.j(null, 0);
                    i93 i93Var13 = vi2Var.F;
                    Boolean bool = Boolean.FALSE;
                    i93Var13.getClass();
                    i93Var13.j(null, bool);
                    do {
                        value = i93Var.getValue();
                        Map map2 = (Map) value;
                        map2.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                        linkedHashMap.remove(str);
                        int size2 = linkedHashMap.size();
                        map = linkedHashMap;
                        if (size2 == 0) {
                            map = oi0.f;
                        } else if (size2 == 1) {
                            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                            Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
                            mapSingletonMap.getClass();
                            map = mapSingletonMap;
                        }
                    } while (!i93Var.h(value, map));
                    cl3.t(dh2.h, null, new l80(vg2Var2, dy1Var, 9), 3);
                }
                os1Var2.setValue(null);
                return dm3.a;
            case 26:
                ((os1) this.h).setValue((xy2) this.g);
                return dm3.a;
            case 27:
                go3 go3Var = (go3) this.g;
                ((os1) this.h).setValue(Boolean.FALSE);
                i93 i93Var14 = go3Var.i;
                ym3 ym3Var = ym3.a;
                i93Var14.getClass();
                i93Var14.j(null, ym3Var);
                cl3.t(f80.F(go3Var), null, new do3(go3Var, dy1Var, 2), 3);
                i93 i93Var15 = go3Var.k;
                nn3 nn3Var = nn3.a;
                i93Var15.getClass();
                i93Var15.j(null, nn3Var);
                return dm3.a;
            case 28:
                tb1 tb1Var2 = (tb1) this.g;
                qk2 qk2Var2 = (qk2) this.h;
                ax1 ax1Var = tb1Var2.L;
                if ((ax1Var.f.i & 8) != 0) {
                    for (aq1 aq1Var = ax1Var.e; aq1Var != null; aq1Var = aq1Var.j) {
                        if ((aq1Var.h & 8) != 0) {
                            ?? J = aq1Var;
                            ?? qs1Var = 0;
                            while (J != 0) {
                                if (J instanceof tu2) {
                                    tu2 tu2Var = (tu2) J;
                                    if (tu2Var.M0()) {
                                        qu2 qu2Var = new qu2();
                                        qk2Var2.f = qu2Var;
                                        qu2Var.i = true;
                                    }
                                    if (tu2Var.N0()) {
                                        ((qu2) qk2Var2.f).h = true;
                                    }
                                    tu2Var.K0((dv2) qk2Var2.f);
                                } else if ((J.h & 8) != 0 && (J instanceof ja0)) {
                                    aq1 aq1Var2 = ((ja0) J).u;
                                    int i8 = 0;
                                    J = J;
                                    qs1Var = qs1Var;
                                    while (aq1Var2 != null) {
                                        if ((aq1Var2.h & 8) != 0) {
                                            i8++;
                                            qs1Var = qs1Var;
                                            if (i8 == 1) {
                                                J = aq1Var2;
                                            } else {
                                                if (qs1Var == 0) {
                                                    qs1Var = new qs1(new aq1[16]);
                                                }
                                                if (J != 0) {
                                                    qs1Var.b(J);
                                                    J = 0;
                                                }
                                                qs1Var.b(aq1Var2);
                                            }
                                        }
                                        aq1Var2 = aq1Var2.k;
                                        J = J;
                                        qs1Var = qs1Var;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                J = vr.j(qs1Var);
                            }
                        }
                    }
                }
                return dm3.a;
            default:
                cb0 cb0Var = (cb0) this.g;
                i32 i32Var = (i32) this.h;
                u22 u22Var = (u22) cb0Var.getValue();
                return new v22(i32Var, u22Var, new h9((l41) i32Var.d.f.getValue(), u22Var));
        }
    }
}
