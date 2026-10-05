package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class n32 {
    public static w01 a;

    public static final void A(za2 za2Var, long j, ns0 ns0Var, boolean z) {
        MotionEvent motionEventA = za2Var.a();
        if (motionEventA == null) {
            c.p("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        ns0Var.h(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        motionEventA.setAction(action);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ns0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [aq1] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [aq1] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void B(ia0 ia0Var, Object obj, ns0 ns0Var) {
        ax1 ax1Var;
        if (!((aq1) ia0Var).f.s) {
            m21.c("visitAncestors called on an unattached node");
        }
        aq1 aq1Var = ((aq1) ia0Var).f.j;
        tb1 tb1VarX = vr.X(ia0Var);
        while (tb1VarX != null) {
            if ((tb1VarX.L.f.i & 262144) != 0) {
                while (aq1Var != null) {
                    if ((aq1Var.h & 262144) != 0) {
                        ?? J = aq1Var;
                        ?? qs1Var = 0;
                        while (J != 0) {
                            if (J instanceof nk3) {
                                nk3 nk3Var = (nk3) J;
                                if (!(obj.equals(nk3Var.K()) ? ((Boolean) ns0Var.h(nk3Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((J.h & 262144) != 0 && (J instanceof ja0)) {
                                aq1 aq1Var2 = ((ja0) J).u;
                                int i = 0;
                                J = J;
                                qs1Var = qs1Var;
                                while (aq1Var2 != null) {
                                    if ((aq1Var2.h & 262144) != 0) {
                                        i++;
                                        qs1Var = qs1Var;
                                        if (i == 1) {
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
                                if (i == 1) {
                                }
                            }
                            J = vr.j(qs1Var);
                        }
                    }
                    aq1Var = aq1Var.j;
                }
            }
            tb1VarX = tb1VarX.u();
            aq1Var = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [ia0, java.lang.Object, nk3] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ns0] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [aq1] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [aq1] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void C(nk3 nk3Var, ns0 ns0Var) {
        ax1 ax1Var;
        aq1 aq1Var = (aq1) nk3Var;
        if (!aq1Var.f.s) {
            m21.c("visitAncestors called on an unattached node");
        }
        aq1 aq1Var2 = aq1Var.f.j;
        tb1 tb1VarX = vr.X(nk3Var);
        while (tb1VarX != null) {
            if ((tb1VarX.L.f.i & 262144) != 0) {
                while (aq1Var2 != null) {
                    if ((aq1Var2.h & 262144) != 0) {
                        ?? J = aq1Var2;
                        ?? qs1Var = 0;
                        while (J != 0) {
                            boolean zBooleanValue = true;
                            if (J instanceof nk3) {
                                nk3 nk3Var2 = (nk3) J;
                                if (s51.n(nk3Var.K(), nk3Var2.K()) && nk3Var.getClass() == nk3Var2.getClass()) {
                                    zBooleanValue = ((Boolean) ns0Var.h(nk3Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((J.h & 262144) != 0 && (J instanceof ja0)) {
                                aq1 aq1Var3 = ((ja0) J).u;
                                int i = 0;
                                J = J;
                                qs1Var = qs1Var;
                                while (aq1Var3 != null) {
                                    if ((aq1Var3.h & 262144) != 0) {
                                        i++;
                                        qs1Var = qs1Var;
                                        if (i == 1) {
                                            J = aq1Var3;
                                        } else {
                                            if (qs1Var == 0) {
                                                qs1Var = new qs1(new aq1[16]);
                                            }
                                            if (J != 0) {
                                                qs1Var.b(J);
                                                J = 0;
                                            }
                                            qs1Var.b(aq1Var3);
                                        }
                                    }
                                    aq1Var3 = aq1Var3.k;
                                    J = J;
                                    qs1Var = qs1Var;
                                }
                                if (i == 1) {
                                }
                            }
                            J = vr.j(qs1Var);
                        }
                    }
                    aq1Var2 = aq1Var2.j;
                }
            }
            tb1VarX = tb1VarX.u();
            aq1Var2 = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ns0] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [aq1] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static final void D(aq1 aq1Var, String str, ns0 ns0Var) {
        if (!aq1Var.f.s) {
            m21.c("visitSubtreeIf called on an unattached node");
        }
        qs1 qs1Var = new qs1(new aq1[16]);
        aq1 aq1Var2 = aq1Var.f;
        aq1 aq1Var3 = aq1Var2.k;
        if (aq1Var3 == null) {
            vr.h(qs1Var, aq1Var2);
        } else {
            qs1Var.b(aq1Var3);
        }
        while (true) {
            int i = qs1Var.h;
            if (i == 0) {
                return;
            }
            aq1 aq1Var4 = (aq1) qs1Var.k(i - 1);
            if ((aq1Var4.i & 262144) != 0) {
                for (aq1 aq1Var5 = aq1Var4; aq1Var5 != null && aq1Var5.s; aq1Var5 = aq1Var5.k) {
                    if ((aq1Var5.h & 262144) != 0) {
                        ?? J = aq1Var5;
                        ?? qs1Var2 = 0;
                        while (J != 0) {
                            if (J instanceof nk3) {
                                nk3 nk3Var = (nk3) J;
                                mk3 mk3Var = str.equals(nk3Var.K()) ? (mk3) ns0Var.h(nk3Var) : mk3.f;
                                if (mk3Var == mk3.h) {
                                    return;
                                }
                                if (mk3Var == mk3.g) {
                                    break;
                                }
                            } else if ((J.h & 262144) != 0 && (J instanceof ja0)) {
                                aq1 aq1Var6 = ((ja0) J).u;
                                int i2 = 0;
                                J = J;
                                qs1Var2 = qs1Var2;
                                while (aq1Var6 != null) {
                                    if ((aq1Var6.h & 262144) != 0) {
                                        i2++;
                                        qs1Var2 = qs1Var2;
                                        if (i2 == 1) {
                                            J = aq1Var6;
                                        } else {
                                            if (qs1Var2 == 0) {
                                                qs1Var2 = new qs1(new aq1[16]);
                                            }
                                            if (J != 0) {
                                                qs1Var2.b(J);
                                                J = 0;
                                            }
                                            qs1Var2.b(aq1Var6);
                                        }
                                    }
                                    aq1Var6 = aq1Var6.k;
                                    J = J;
                                    qs1Var2 = qs1Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            J = vr.j(qs1Var2);
                        }
                    }
                }
            }
            vr.h(qs1Var, aq1Var4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, nk3] */
    /* JADX WARN: Type inference failed for: r13v0, types: [ns0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [aq1] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void E(nk3 nk3Var, ns0 ns0Var) {
        aq1 aq1Var = (aq1) nk3Var;
        if (!aq1Var.f.s) {
            m21.c("visitSubtreeIf called on an unattached node");
        }
        qs1 qs1Var = new qs1(new aq1[16]);
        aq1 aq1Var2 = aq1Var.f;
        aq1 aq1Var3 = aq1Var2.k;
        if (aq1Var3 == null) {
            vr.h(qs1Var, aq1Var2);
        } else {
            qs1Var.b(aq1Var3);
        }
        while (true) {
            int i = qs1Var.h;
            if (i == 0) {
                return;
            }
            aq1 aq1Var4 = (aq1) qs1Var.k(i - 1);
            if ((aq1Var4.i & 262144) != 0) {
                for (aq1 aq1Var5 = aq1Var4; aq1Var5 != null && aq1Var5.s; aq1Var5 = aq1Var5.k) {
                    if ((aq1Var5.h & 262144) != 0) {
                        ?? J = aq1Var5;
                        ?? qs1Var2 = 0;
                        while (J != 0) {
                            if (J instanceof nk3) {
                                nk3 nk3Var2 = (nk3) J;
                                mk3 mk3Var = (s51.n(nk3Var.K(), nk3Var2.K()) && nk3Var.getClass() == nk3Var2.getClass()) ? (mk3) ns0Var.h(nk3Var2) : mk3.f;
                                if (mk3Var == mk3.h) {
                                    return;
                                }
                                if (mk3Var == mk3.g) {
                                    break;
                                }
                            } else if ((J.h & 262144) != 0 && (J instanceof ja0)) {
                                aq1 aq1Var6 = ((ja0) J).u;
                                int i2 = 0;
                                J = J;
                                qs1Var2 = qs1Var2;
                                while (aq1Var6 != null) {
                                    if ((aq1Var6.h & 262144) != 0) {
                                        i2++;
                                        qs1Var2 = qs1Var2;
                                        if (i2 == 1) {
                                            J = aq1Var6;
                                        } else {
                                            if (qs1Var2 == 0) {
                                                qs1Var2 = new qs1(new aq1[16]);
                                            }
                                            if (J != 0) {
                                                qs1Var2.b(J);
                                                J = 0;
                                            }
                                            qs1Var2.b(aq1Var6);
                                        }
                                    }
                                    aq1Var6 = aq1Var6.k;
                                    J = J;
                                    qs1Var2 = qs1Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            J = vr.j(qs1Var2);
                        }
                    }
                }
            }
            vr.h(qs1Var, aq1Var4);
        }
    }

    public static String F(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(ys.a);
        bytes.getClass();
        if (bytes.length <= 24) {
            return str;
        }
        int i = 0;
        int length = 0;
        while (i < str.length()) {
            int iCharCount = Character.charCount(str.codePointAt(i)) + i;
            byte[] bytes2 = str.substring(i, iCharCount).getBytes(ys.a);
            bytes2.getClass();
            length += bytes2.length;
            if (length > 24) {
                break;
            }
            i = iCharCount;
        }
        return str.substring(0, i);
    }

    public static final double G(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [nv0] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static final void a(hb0 hb0Var, ts0 ts0Var, cs0 cs0Var, cs0 cs0Var2, nv0 nv0Var, int i) {
        ?? arrayList;
        Integer num;
        ?? arrayList2;
        int i2;
        ?? r4;
        List list;
        os1 os1Var;
        String str = hb0Var.d;
        String str2 = hb0Var.c;
        ts0Var.getClass();
        cs0Var.getClass();
        cs0Var2.getClass();
        nv0Var.b0(-1844092494);
        int i3 = i | (nv0Var.f(hb0Var) ? 4 : 2) | (nv0Var.h(ts0Var) ? 32 : 16) | (nv0Var.h(cs0Var) ? 256 : 128);
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = new a42(-1);
                nv0Var.j0(objO);
            }
            a42 a42Var = (a42) objO;
            Object objO2 = nv0Var.O();
            if (objO2 == obj) {
                objO2 = b32.w("");
                nv0Var.j0(objO2);
            }
            os1 os1Var2 = (os1) objO2;
            boolean zF = nv0Var.f(str2);
            Object objO3 = nv0Var.O();
            if (zF || objO3 == obj) {
                uk2 uk2Var = tp2.a;
                objO3 = tp2.d(str2);
                nv0Var.j0(objO3);
            }
            String str3 = (String) objO3;
            boolean zF2 = nv0Var.f(str);
            Object objO4 = nv0Var.O();
            if (zF2 || objO4 == obj) {
                uk2 uk2Var2 = tp2.a;
                objO4 = tp2.d(str);
                nv0Var.j0(objO4);
            }
            String str4 = (String) objO4;
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            byte b = 0;
            Object objO5 = nv0Var.O();
            ni0 ni0Var = ni0.f;
            ?? r8 = objO5;
            if (z || objO5 == obj) {
                if (hb0Var.a()) {
                    List<String> listA0 = y93.A0(str, new String[]{"\n"});
                    arrayList = new ArrayList(rx.d0(listA0, 10));
                    for (String str5 : listA0) {
                        uk2 uk2Var3 = tp2.a;
                        arrayList.add(tp2.d(str5));
                    }
                } else {
                    arrayList = ni0Var;
                }
                nv0Var.j0(arrayList);
                r8 = arrayList;
            }
            List list2 = (List) r8;
            boolean zF3 = (i4 == 4) | nv0Var.f(list2);
            Object objO6 = nv0Var.O();
            if (zF3 || objO6 == obj) {
                if (hb0Var.a()) {
                    ArrayList arrayList3 = new ArrayList(rx.d0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(y93.A0((String) it.next(), new String[]{"\t"}));
                    }
                    objO6 = arrayList3;
                } else {
                    objO6 = ni0Var;
                }
                nv0Var.j0(objO6);
            }
            List list3 = (List) objO6;
            boolean zF4 = nv0Var.f(list3);
            Object objO7 = nv0Var.O();
            if (zF4 || objO7 == obj) {
                Iterator it2 = list3.iterator();
                if (it2.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((List) it2.next()).size());
                    while (it2.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((List) it2.next()).size());
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    num = numValueOf;
                } else {
                    num = null;
                }
                objO7 = Integer.valueOf(num != null ? num.intValue() : 0);
                nv0Var.j0(objO7);
            }
            int iIntValue = ((Number) objO7).intValue();
            boolean zF5 = nv0Var.f(list3) | nv0Var.d(iIntValue);
            Object objO8 = nv0Var.O();
            if (zF5 || objO8 == obj) {
                if (iIntValue <= 1) {
                    arrayList2 = ni0Var;
                    i2 = i3;
                } else {
                    ArrayList arrayList4 = new ArrayList(iIntValue);
                    for (int i5 = 0; i5 < iIntValue; i5++) {
                        arrayList4.add(0);
                    }
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((List) it3.next()).iterator();
                        Iterator it5 = it3;
                        int i6 = 0;
                        while (it4.hasNext()) {
                            arrayList4.set(i6, Integer.valueOf(Math.max(((Number) arrayList4.get(i6)).intValue(), ((String) it4.next()).length())));
                            i6++;
                        }
                        it3 = it5;
                    }
                    int iH0 = qx.H0(arrayList4);
                    if (iH0 < 1) {
                        iH0 = 1;
                    }
                    arrayList2 = new ArrayList(rx.d0(arrayList4, 10));
                    int size = arrayList4.size();
                    i2 = i3;
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj2 = arrayList4.get(i7);
                        i7++;
                        arrayList2.add(Float.valueOf(((Number) obj2).intValue() / iH0));
                        arrayList4 = arrayList4;
                    }
                }
                nv0Var.j0(arrayList2);
                r4 = arrayList2;
            } else {
                i2 = i3;
                r4 = objO8;
            }
            List list4 = (List) r4;
            boolean zD = nv0Var.d(a42Var.g()) | (i4 == 4);
            Object objO9 = nv0Var.O();
            if (zD || objO9 == obj) {
                objO9 = b32.j(new me1(8, hb0Var, a42Var));
                nv0Var.j0(objO9);
            }
            e93 e93Var = (e93) objO9;
            boolean zD2 = nv0Var.d(a42Var.g()) | nv0Var.f(list2) | (i4 == 4) | nv0Var.f((String) os1Var2.getValue());
            Object objO10 = nv0Var.O();
            if (zD2 || objO10 == obj) {
                n8 n8Var = new n8(hb0Var, list2, a42Var, os1Var2, 7);
                list = list2;
                os1Var = os1Var2;
                objO10 = b32.j(n8Var);
                nv0Var.j0(objO10);
            } else {
                list = list2;
                os1Var = os1Var2;
            }
            e93 e93Var2 = (e93) objO10;
            rn.a(cs0Var, gq.N(-1619944342, new r81((Object) ts0Var, (Object) hb0Var, (Object) e93Var, (Object) e93Var2, (Object) a42Var, 5), nv0Var), null, gq.N(-1049672536, new r81(cs0Var, hb0Var, ts0Var, e93Var, e93Var2, 6), nv0Var), null, gq.N(-479400730, new z71(str3, 7, b), nv0Var), gq.N(-194264827, new rg2(hb0Var, str4, iIntValue, list3, list, a42Var, list4, os1Var), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, ((i2 >> 6) & 14) | 1772592, 16276);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ul(hb0Var, ts0Var, cs0Var, cs0Var2, i, 9);
        }
    }

    public static final sm1 b(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new sm1(matcher, charSequence);
        }
        return null;
    }

    public static final boolean c(int i, KeyEvent keyEvent) {
        return ((int) (ur.E(keyEvent) >> 32)) == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final float d(h62 h62Var, boolean z, uy0[] uy0VarArr, float f) {
        float f2 = Float.NaN;
        for (uy0 uy0Var : uy0VarArr) {
            float fI = h62Var.i(uy0Var);
            if (Float.isNaN(f2)) {
                f2 = fI;
            } else if (z == (fI > f2)) {
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static final void e(nr1 nr1Var, int i) {
        if (nr1Var.b == 0 || !(nr1Var.c(0) == i || nr1Var.c(nr1Var.b - 1) == i)) {
            int i2 = nr1Var.b;
            nr1Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iC = nr1Var.c(i3);
                if (i <= iC) {
                    break;
                }
                nr1Var.f(i2, iC);
                i2 = i3;
            }
            nr1Var.f(i2, i);
        }
    }

    public static final void f(is1 is1Var, Object obj, Object obj2) {
        int iF = is1Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : is1Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof js1) {
                ((js1) obj3).a(obj2);
            } else if (obj3 != obj2) {
                js1 js1Var = new js1();
                js1Var.a(obj3);
                js1Var.a(obj2);
                obj2 = js1Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            is1Var.c[iF] = obj2;
            return;
        }
        int i = ~iF;
        is1Var.b[i] = obj;
        is1Var.c[i] = obj2;
    }

    public static final void g(op3 op3Var, gb2 gb2Var) {
        ol1 ol1Var = (ol1) op3Var.a;
        ol1Var.getClass();
        np3 np3Var = ol1Var.b;
        np3 np3Var2 = ol1Var.a;
        boolean zL = w22.l(gb2Var);
        long j = gb2Var.b;
        if (zL) {
            d70[] d70VarArr = np3Var2.d;
            uj.O(0, d70VarArr.length, null, d70VarArr);
            np3Var2.e = 0;
            d70[] d70VarArr2 = np3Var.d;
            uj.O(0, d70VarArr2.length, null, d70VarArr2);
            np3Var.e = 0;
            ol1Var.c = 0L;
        }
        if (!w22.n(gb2Var)) {
            List listB = gb2Var.b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                hy0 hy0Var = (hy0) listB.get(i);
                ol1Var.a(hy0Var.a, gy1.e(hy0Var.e, 0L));
            }
            ol1Var.a(j, gy1.e(gb2Var.n, 0L));
        }
        if (w22.n(gb2Var) && j - ol1Var.c > 40) {
            d70[] d70VarArr3 = np3Var2.d;
            uj.O(0, d70VarArr3.length, null, d70VarArr3);
            np3Var2.e = 0;
            d70[] d70VarArr4 = np3Var.d;
            uj.O(0, d70VarArr4.length, null, d70VarArr4);
            np3Var.e = 0;
            ol1Var.c = 0L;
        }
        ol1Var.c = j;
    }

    public static int h(Context context) {
        context.getClass();
        return y02.h(vm1.M((r2.widthPixels / context.getResources().getDisplayMetrics().density) / 40.0f), 8, 16);
    }

    public static int i(String str, String str2) {
        String strI0 = y93.I0(str, '0');
        if (strI0.length() == 0) {
            strI0 = "0";
        }
        String strI02 = y93.I0(str2, '0');
        String str3 = strI02.length() != 0 ? strI02 : "0";
        int iR = s51.r(strI0.length(), str3.length());
        Integer numValueOf = Integer.valueOf(iR);
        if (iR == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : strI0.compareTo(str3);
    }

    public static is1 j() {
        long[] jArr = nr2.a;
        return new is1();
    }

    public static final float k(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, pi] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int l(int i, String str) {
        ?? r5;
        ?? r52;
        int spanEnd;
        nh0 nh0VarP = p();
        Integer num = null;
        if (nh0VarP != null) {
            if (!(nh0VarP.c() == 1)) {
                c.q("Not initialized yet");
                return 0;
            }
            jo3.h(str, "charSequence cannot be null");
            ?? r4 = nh0VarP.e.b;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r52 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                kl3[] kl3VarArr = (kl3[]) spanned.getSpans(i, i + 1, kl3.class);
                if (kl3VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(kl3VarArr[0]);
                    r52 = str;
                } else {
                    ?? r53 = str;
                    spanEnd = ((zh0) r4.I(r53, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new zh0(i))).h;
                    r52 = r53;
                }
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r52;
            if (spanEnd != -1) {
                num = numValueOf;
                r5 = r52;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    public static final int m(int i, String str) {
        nh0 nh0VarP = p();
        Integer num = null;
        if (nh0VarP != null) {
            Integer numValueOf = Integer.valueOf(nh0VarP.b(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final cr3 n(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            cr3 cr3Var = tag instanceof cr3 ? (cr3) tag : null;
            if (cr3Var != null) {
                return cr3Var;
            }
            Object objU = w22.u(view);
            view = objU instanceof View ? (View) objU : null;
        }
        return null;
    }

    public static final Rect o(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final nh0 p() {
        if (!nh0.d()) {
            return null;
        }
        nh0 nh0VarA = nh0.a();
        if (nh0VarA.c() == 1) {
            return nh0VarA;
        }
        return null;
    }

    public static final w01 q() {
        w01 w01Var = a;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new q42(8.0f, 5.0f));
        arrayList.add(new c52(14.0f));
        arrayList.add(new x42(11.0f, -7.0f));
        arrayList.add(m42.c);
        v01.a(v01Var, arrayList, w73Var);
        w01 w01VarB = v01Var.b();
        a = w01VarB;
        return w01VarB;
    }

    public static boolean r(String str) {
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if ('0' <= cCharAt && cCharAt < ':') {
                }
            }
            return true;
        }
        return false;
    }

    public static List s(m53 m53Var, int i, m53 m53Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        int i2;
        int i3;
        int iU = m53Var.u(i);
        int i4 = i + iU;
        int iF = m53Var.f(i);
        int iF2 = m53Var.f(i4);
        int i5 = iF2 - iF;
        boolean z5 = i >= 0 && (m53Var.b[(m53Var.r(i) * 5) + 1] & 201326592) != 0;
        m53Var2.w(iU);
        m53Var2.x(i5, m53Var2.t);
        if (m53Var.g < i4) {
            m53Var.B(i4);
        }
        if (m53Var.k < iF2) {
            m53Var.C(iF2, i4);
        }
        int[] iArr = m53Var2.b;
        int i6 = m53Var2.t;
        int i7 = i6 * 5;
        uj.G(i7, i * 5, i4 * 5, m53Var.b, iArr);
        Object[] objArr = m53Var2.c;
        int i8 = m53Var2.i;
        System.arraycopy(m53Var.c, iF, objArr, i8, i5);
        int i9 = m53Var2.v;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + iU;
        int iG = i8 - m53Var2.g(iArr, i6);
        int i12 = m53Var2.m;
        int i13 = m53Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int iG2 = m53Var2.g(iArr, i15) + iG;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = m53Var2.k;
            }
            iArr2[(i15 * 5) + 4] = m53.i(iG2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        m53Var2.m = i14;
        int iA = l53.a(m53Var.d, i, m53Var.p());
        int iA2 = l53.a(m53Var.d, i4, m53Var.p());
        if (iA < iA2) {
            ArrayList arrayList = m53Var.d;
            ArrayList arrayList2 = new ArrayList(iA2 - iA);
            for (int i17 = iA; i17 < iA2; i17++) {
                iv0 iv0Var = (iv0) arrayList.get(i17);
                iv0Var.a += i10;
                arrayList2.add(iv0Var);
            }
            m53Var2.d.addAll(l53.a(m53Var2.d, m53Var2.t, m53Var2.p()), arrayList2);
            arrayList.subList(iA, iA2).clear();
            list = arrayList2;
        } else {
            list = ni0.f;
        }
        if (!list.isEmpty()) {
            HashMap map = m53Var.e;
            HashMap map2 = m53Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = m53Var2.v;
        m53Var2.O(i9);
        int iE = m53Var.E(m53Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iE >= 0;
            if (z7) {
                m53Var.P();
                m53Var.a(iE - m53Var.t);
                m53Var.P();
            }
            m53Var.a(i - m53Var.t);
            boolean zH = m53Var.H();
            if (z7) {
                m53Var.M();
                m53Var.j();
                m53Var.M();
                m53Var.j();
            }
            z4 = zH;
        } else {
            boolean zI = m53Var.I(i, iU);
            m53Var.J(iF, i5, i - 1);
            z4 = zI;
        }
        if (z4) {
            e20.a("Unexpectedly removed anchors");
        }
        int i20 = m53Var2.o;
        int i21 = iArr3[i7 + 1];
        m53Var2.o = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            m53Var2.t = i11;
            m53Var2.i = i8 + i5;
        }
        if (z6) {
            m53Var2.T(i9);
        }
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        if (r9 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        if (r2.length() <= 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
    
        if (r4 >= r2.length()) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        r5 = r2.charAt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0073, code lost:
    
        if ('0' > r5) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0075, code lost:
    
        if (r5 >= ':') goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007e, code lost:
    
        if (r2.length() <= 1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
    
        if (defpackage.y93.B0(r2, '0') == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0021, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0021, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List t(String str, boolean z) {
        if (str.length() != 0) {
            List<String> listZ0 = y93.z0(str, new char[]{'.'}, 6);
            if (listZ0.isEmpty()) {
                return listZ0;
            }
            loop0: for (String str2 : listZ0) {
                if (str2.length() > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= str2.length()) {
                            break;
                        }
                        char cCharAt = str2.charAt(i);
                        if (('0' > cCharAt || cCharAt >= ':') && (('A' > cCharAt || cCharAt >= '[') && (('a' > cCharAt || cCharAt >= '{') && cCharAt != '-'))) {
                            break loop0;
                        }
                        i++;
                    }
                }
            }
            return listZ0;
        }
        return null;
    }

    public static ou2 u(String str, boolean z) {
        List list;
        if (z && y93.B0(str, 'v')) {
            str = str.substring(1);
        }
        if (str.length() == 0) {
            return null;
        }
        List listZ0 = y93.z0(str, new char[]{'+'}, 2);
        String str2 = (String) listZ0.get(0);
        int size = listZ0.size();
        List listT = ni0.f;
        if (size == 2) {
            List listT2 = t((String) listZ0.get(1), true);
            if (listT2 == null) {
                return null;
            }
            list = listT2;
        } else {
            list = listT;
        }
        List listZ02 = y93.z0(str2, new char[]{'-'}, 2);
        List<String> listZ03 = y93.z0((CharSequence) listZ02.get(0), new char[]{'.'}, 6);
        if (listZ03.size() != 3) {
            return null;
        }
        if (!listZ03.isEmpty()) {
            for (String str3 : listZ03) {
                if (!r(str3)) {
                    return null;
                }
                if (str3.length() > 1 && y93.B0(str3, '0')) {
                    return null;
                }
            }
        }
        if (listZ02.size() == 2 && (listT = t((String) listZ02.get(1), false)) == null) {
            return null;
        }
        return new ou2((String) listZ03.get(0), (String) listZ03.get(1), (String) listZ03.get(2), listT, list);
    }

    public static final void v(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            m21.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fK = k(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fK);
                }
            }
            float fSqrt = (float) Math.sqrt(k(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : k(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fK2 = k(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fK2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fK2 / fArr11[i14];
        }
    }

    public static final boolean w(is1 is1Var, Object obj, Object obj2) {
        Object objG = is1Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof js1)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            is1Var.k(obj);
            return true;
        }
        js1 js1Var = (js1) objG;
        boolean zL = js1Var.l(obj2);
        if (zL && js1Var.g()) {
            is1Var.k(obj);
        }
        return zL;
    }

    public static final void x(is1 is1Var, Object obj) {
        boolean zG;
        long[] jArr = is1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = is1Var.b[i4];
                        Object obj3 = is1Var.c[i4];
                        if (obj3 instanceof js1) {
                            js1 js1Var = (js1) obj3;
                            js1Var.l(obj);
                            zG = js1Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            is1Var.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final gh3 y(gh3 gh3Var, bb1 bb1Var) {
        long j;
        fg3 fg3Var;
        int i;
        int i2;
        wg3 wg3Var;
        h83 h83Var = gh3Var.a;
        dg3 dg3Var = i83.d;
        dg3 dg3Var2 = h83Var.a;
        if (dg3Var2.equals(cg3.a)) {
            dg3Var2 = i83.d;
        }
        dg3 dg3Var3 = dg3Var2;
        long j2 = h83Var.b;
        kh3[] kh3VarArr = jh3.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = i83.a;
        }
        long j3 = j2;
        xq0 xq0Var = h83Var.c;
        if (xq0Var == null) {
            xq0Var = xq0.h;
        }
        xq0 xq0Var2 = xq0Var;
        vq0 vq0Var = h83Var.d;
        vq0 vq0Var2 = new vq0(vq0Var != null ? vq0Var.a : 0);
        wq0 wq0Var = h83Var.e;
        wq0 wq0Var2 = new wq0(wq0Var != null ? wq0Var.a : 65535);
        zb3 zb3Var = h83Var.f;
        if (zb3Var == null) {
            zb3Var = zb3.a;
        }
        zb3 zb3Var2 = zb3Var;
        String str = h83Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = h83Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = i83.b;
        }
        long j5 = j4;
        nl nlVar = h83Var.i;
        float f = nlVar != null ? nlVar.a : 0.0f;
        nl nlVar2 = new nl(Float.isNaN(f) ? 0.0f : f);
        eg3 eg3Var = h83Var.j;
        if (eg3Var == null) {
            eg3Var = eg3.c;
        }
        eg3 eg3Var2 = eg3Var;
        qj1 qj1VarN = h83Var.k;
        if (qj1VarN == null) {
            qj1 qj1Var = qj1.h;
            qj1VarN = p62.a.n();
        }
        qj1 qj1Var2 = qj1VarN;
        long j6 = h83Var.l;
        if (j6 == 16) {
            j6 = i83.c;
        }
        long j7 = j6;
        ne3 ne3Var = h83Var.m;
        if (ne3Var == null) {
            ne3Var = ne3.b;
        }
        ne3 ne3Var2 = ne3Var;
        r13 r13Var = h83Var.n;
        if (r13Var == null) {
            r13Var = r13.d;
        }
        r13 r13Var2 = r13Var;
        f72 f72Var = h83Var.o;
        rf0 rf0Var = h83Var.p;
        if (rf0Var == null) {
            rf0Var = fm0.a;
        }
        h83 h83Var2 = new h83(dg3Var3, j3, xq0Var2, vq0Var2, wq0Var2, zb3Var2, str2, j5, nlVar2, eg3Var2, qj1Var2, j7, ne3Var2, r13Var2, f72Var, rf0Var);
        x32 x32Var = gh3Var.b;
        int i3 = y32.b;
        int i4 = x32Var.a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = x32Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = bb1Var.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        c.k();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = x32Var.c;
            if ((j & 1095216660480L) == 0) {
                j = y32.a;
            }
            fg3Var = x32Var.d;
            if (fg3Var == null) {
                fg3Var = fg3.c;
            }
            w62 w62Var = x32Var.e;
            eg1 eg1Var = x32Var.f;
            i = x32Var.g;
            if (i == 0) {
                i = zf1.b;
            }
            i2 = x32Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            wg3Var = x32Var.i;
            if (wg3Var == null) {
                wg3Var = wg3.c;
            }
            return new gh3(h83Var2, new x32(i4, i6, j, fg3Var, w62Var, eg1Var, i, i2, wg3Var), gh3Var.c);
        }
        int iOrdinal2 = bb1Var.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            c.k();
            return null;
        }
        i6 = i5;
        j = x32Var.c;
        if ((j & 1095216660480L) == 0) {
        }
        fg3Var = x32Var.d;
        if (fg3Var == null) {
        }
        w62 w62Var2 = x32Var.e;
        eg1 eg1Var2 = x32Var.f;
        i = x32Var.g;
        if (i == 0) {
        }
        i2 = x32Var.h;
        if (i2 == 0) {
        }
        wg3Var = x32Var.i;
        if (wg3Var == null) {
        }
        return new gh3(h83Var2, new x32(i4, i6, j, fg3Var, w62Var2, eg1Var2, i, i2, wg3Var), gh3Var.c);
    }

    public static final int z(nr1 nr1Var) {
        int iC;
        int i = nr1Var.b;
        int iC2 = nr1Var.c(0);
        while (nr1Var.b != 0 && nr1Var.c(0) == iC2) {
            nr1Var.f(0, nr1Var.d());
            nr1Var.e(nr1Var.b - 1);
            int i2 = nr1Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int iC3 = nr1Var.c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int iC4 = nr1Var.c(i6);
                if (i5 >= i2 || (iC = nr1Var.c(i5)) <= iC4) {
                    if (iC4 > iC3) {
                        nr1Var.f(i4, iC4);
                        nr1Var.f(i6, iC3);
                        i4 = i6;
                    }
                } else if (iC > iC3) {
                    nr1Var.f(i4, iC);
                    nr1Var.f(i5, iC3);
                    i4 = i5;
                }
            }
        }
        return iC2;
    }
}
