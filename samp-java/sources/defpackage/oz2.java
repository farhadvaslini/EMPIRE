package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class oz2 {
    public static w01 a;

    public static LinkedHashSet A(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(om1.X(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && s51.n(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static String B(JSONObject jSONObject, String str, int i) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null || objOpt == JSONObject.NULL) {
            return "";
        }
        if (!(objOpt instanceof String)) {
            c.g("Invalid ".concat(str));
            return null;
        }
        String string = y93.G0((String) objOpt).toString();
        if (string.length() <= i) {
            return string;
        }
        c.g(str.concat(" is too long"));
        return null;
    }

    public static List C(JSONObject jSONObject, String str, int i) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null || objOpt == JSONObject.NULL) {
            return ni0.f;
        }
        if (!(objOpt instanceof JSONArray)) {
            c.g("Invalid ".concat(str));
            return null;
        }
        JSONArray jSONArray = (JSONArray) objOpt;
        if (jSONArray.length() > i) {
            c.g(nc2.i("Too many ", str, " entries"));
            return null;
        }
        ai1 ai1Var = new ai1(jSONArray.length());
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object objOpt2 = jSONArray.opt(i2);
            String str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
            if (str2 == null) {
                throw new IllegalStateException(("Invalid " + str + " entry").toString());
            }
            String string = y93.G0(str2).toString();
            if (string.length() <= 0 || string.length() > 128) {
                c.g(nc2.i("Invalid ", str, " entry length"));
                return null;
            }
            ai1Var.add(string);
        }
        return vr.r(ai1Var);
    }

    public static final long D(float f, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        kh3[] kh3VarArr = jh3.b;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.k82 E(java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oz2.E(java.lang.String):k82");
    }

    public static LinkedHashSet F(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(om1.X(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final Object G(Object[] objArr, cs0 cs0Var, nv0 nv0Var) {
        return I(Arrays.copyOf(objArr, objArr.length), r51.G1, cs0Var, nv0Var, 3456, 0);
    }

    public static final Object H(Object[] objArr, zq2 zq2Var, cs0 cs0Var, nv0 nv0Var, int i) {
        return I(Arrays.copyOf(objArr, objArr.length), zq2Var, cs0Var, nv0Var, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object I(Object[] objArr, zq2 zq2Var, cs0 cs0Var, nv0 nv0Var, int i, int i2) {
        Object[] objArr2;
        zq2 zq2Var2;
        Object obj;
        Object objD;
        long j = nv0Var.T;
        ur.r(36);
        String string = Long.toString(j, 36);
        string.getClass();
        zq2Var.getClass();
        gq2 gq2Var = (gq2) nv0Var.j(iq2.a);
        Object objO = nv0Var.O();
        Object obj2 = c20.a;
        if (objO == obj2) {
            Object objD2 = (gq2Var == null || (objD = gq2Var.d(string)) == null) ? null : zq2Var.d(objD);
            if (objD2 == null) {
                objD2 = cs0Var.a();
            }
            objArr2 = objArr;
            zq2Var2 = zq2Var;
            Object cq2Var = new cq2(zq2Var2, gq2Var, string, objD2, objArr2);
            nv0Var.j0(cq2Var);
            objO = cq2Var;
        } else {
            objArr2 = objArr;
            zq2Var2 = zq2Var;
        }
        cq2 cq2Var2 = (cq2) objO;
        Object objA = Arrays.equals(objArr2, cq2Var2.j) ? cq2Var2.i : null;
        if (objA == null) {
            objA = cs0Var.a();
        }
        boolean zH = nv0Var.h(cq2Var2) | ((((i & 112) ^ 48) > 32 && nv0Var.h(zq2Var2)) || (i & 48) == 32) | nv0Var.h(gq2Var) | nv0Var.f(string) | nv0Var.h(objA) | nv0Var.h(objArr2);
        Object objO2 = nv0Var.O();
        if (zH || objO2 == obj2) {
            Object[] objArr3 = objArr2;
            obj = objA;
            Object xh2Var = new xh2(cq2Var2, zq2Var2, gq2Var, string, obj, objArr3);
            nv0Var.j0(xh2Var);
            objO2 = xh2Var;
        } else {
            obj = objA;
        }
        rn.t((cs0) objO2, nv0Var);
        return obj;
    }

    public static String J(JSONObject jSONObject, String str, int i) {
        Object objOpt = jSONObject.opt(str);
        String str2 = objOpt instanceof String ? (String) objOpt : null;
        if (str2 == null) {
            throw new IllegalStateException("Missing or invalid ".concat(str).toString());
        }
        String string = y93.G0(str2).toString();
        if (string.length() > 0 && string.length() <= i) {
            return string;
        }
        c.g(nc2.i("Invalid ", str, " length"));
        return null;
    }

    public static void K(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            o1.e(window, z);
        } else {
            if (i >= 30) {
                o1.d(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static Set L(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return si0.f;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            setSingleton.getClass();
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(om1.X(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static final String M(int i, nv0 nv0Var) {
        return ((Resources) nv0Var.j(x7.c)).getString(i);
    }

    public static final String N(int i, Object[] objArr, nv0 nv0Var) {
        return ((Resources) nv0Var.j(x7.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void O(vu2 vu2Var, int i, ur2 ur2Var) {
        vu2 vu2Var2;
        qs1 qs1Var = new qs1(new vu2[16]);
        List listI = vu2Var.i(false, false);
        while (true) {
            qs1Var.d(qs1Var.h, listI);
            while (true) {
                int i2 = qs1Var.h;
                if (i2 == 0) {
                    return;
                }
                vu2Var2 = (vu2) qs1Var.k(i2 - 1);
                boolean zT = w7.T(vu2Var2);
                qu2 qu2Var = vu2Var2.d;
                is1 is1Var = qu2Var.f;
                if (!zT && !is1Var.c(zu2.j)) {
                    ex1 ex1VarD = vu2Var2.d();
                    if (ex1VarD == null) {
                        throw nc2.d("Expected semantics node to have a coordinator.");
                    }
                    m41 m41VarL = br.L(vr.q(ex1VarD, true));
                    if (m41VarL.a < m41VarL.c && m41VarL.b < m41VarL.d) {
                        Object objG = qu2Var.f.g(pu2.e);
                        if (objG == null) {
                            objG = null;
                        }
                        rs0 rs0Var = (rs0) objG;
                        Object objG2 = is1Var.g(zu2.w);
                        tr2 tr2Var = (tr2) (objG2 != null ? objG2 : null);
                        if (rs0Var == null || tr2Var == null || ((Number) tr2Var.b.a()).floatValue() <= 0.0f) {
                            break;
                        }
                        int i3 = 1 + i;
                        ur2Var.h(new vr2(vu2Var2, i3, m41VarL, ex1VarD));
                        O(vu2Var2, i3, ur2Var);
                    }
                }
            }
            listI = vu2Var2.i(false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x040d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.CharSequence r45, final defpackage.rs0 r46, final defpackage.ef3 r47, final defpackage.ss0 r48, final defpackage.rs0 r49, final defpackage.rs0 r50, final defpackage.rs0 r51, final defpackage.rs0 r52, final boolean r53, final boolean r54, final boolean r55, final defpackage.t41 r56, final defpackage.x12 r57, final defpackage.se3 r58, final defpackage.d00 r59, defpackage.nv0 r60, final int r61, final int r62) {
        /*
            Method dump skipped, instruction units count: 1900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oz2.a(java.lang.CharSequence, rs0, ef3, ss0, rs0, rs0, rs0, rs0, boolean, boolean, boolean, t41, x12, se3, d00, nv0, int, int):void");
    }

    public static final void b(long j, gh3 gh3Var, rs0 rs0Var, nv0 nv0Var, int i) {
        long j2;
        gh3 gh3Var2;
        rs0 rs0Var2;
        nv0 nv0Var2;
        nv0Var.b0(396611577);
        int i2 = (nv0Var.e(j) ? 4 : 2) | i | (nv0Var.f(gh3Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(rs0Var) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            nv0Var2 = nv0Var;
            jo3.b(j, gh3Var, rs0Var, nv0Var2, i2 & 1022);
            j2 = j;
            gh3Var2 = gh3Var;
            rs0Var2 = rs0Var;
        } else {
            j2 = j;
            gh3Var2 = gh3Var;
            rs0Var2 = rs0Var;
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ge2(j2, gh3Var2, rs0Var2, i, 1);
        }
    }

    public static final void c(long j, rs0 rs0Var, nv0 nv0Var, int i) {
        nv0Var.b0(590397809);
        int i2 = (nv0Var.e(j) ? 4 : 2) | i | (nv0Var.h(rs0Var) ? 32 : 16);
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            vr.c(nc2.f(j, t30.a), rs0Var, nv0Var, (i2 & 112) | 8);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new f8(j, rs0Var, i);
        }
    }

    public static final void d(z53 z53Var, bq1 bq1Var, nv0 nv0Var, int i) {
        Object obj = a10.a;
        nv0Var.b0(-977568115);
        int i2 = (i & 6) == 0 ? (nv0Var.f(z53Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(obj) ? 256 : 128;
        }
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            String strP = g12.P(2131624409, nv0Var);
            Object objO = nv0Var.O();
            Object obj2 = objO;
            if (objO == c20.a) {
                el0 el0Var = new el0();
                el0Var.a = new Object();
                el0Var.b = new ArrayList();
                nv0Var.j0(el0Var);
                obj2 = el0Var;
            }
            el0 el0Var2 = (el0) obj2;
            Object obj3 = el0Var2.a;
            ArrayList arrayList = el0Var2.b;
            if (s51.n(z53Var, obj3)) {
                nv0Var.a0(1443908949);
                nv0Var.p(false);
            } else {
                nv0Var.a0(1154891761);
                el0Var2.a = z53Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((z53) ((dl0) arrayList.get(i3)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(z53Var)) {
                    arrayList3.add(z53Var);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj4 = arrayList3.get(i4);
                    if (obj4 != null) {
                        arrayList4.add(obj4);
                    }
                }
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    z53 z53Var2 = (z53) arrayList4.get(i5);
                    arrayList.add(new dl0(z53Var2, gq.N(-1952400805, new w53(z53Var2, z53Var, el0Var2, strP), nv0Var)));
                }
                nv0Var.p(false);
            }
            cn1 cn1VarD = eo.d(f5.g, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1Var);
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
            xj2 xj2VarZ = nv0Var.z();
            if (xj2VarZ == null) {
                c.q("no recompose scope found");
                return;
            }
            xj2VarZ.b |= 1;
            el0Var2.c = xj2VarZ;
            nv0Var.a0(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                dl0 dl0Var = (dl0) arrayList.get(i6);
                z53 z53Var3 = (z53) dl0Var.a;
                d00 d00Var = dl0Var.b;
                nv0Var.Y(1325010085, z53Var3);
                d00Var.e(gq.N(-1893791890, new x53(z53Var3, 0), nv0Var), nv0Var, 6);
                nv0Var.p(false);
            }
            nv0Var.p(false);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xc(z53Var, bq1Var, i);
        }
    }

    public static final void e(mg2 mg2Var, cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, bq1 bq1Var, cs0 cs0Var4, boolean z, nv0 nv0Var, int i) {
        bq1 bq1Var2;
        r32 r32Var;
        boolean z2;
        float f;
        String strF;
        int i2;
        nv0 nv0Var2 = nv0Var;
        mg2Var.getClass();
        cs0Var.getClass();
        cs0Var2.getClass();
        cs0Var3.getClass();
        nv0Var2.b0(634254817);
        int i3 = i | (nv0Var2.f(mg2Var) ? 4 : 2) | (nv0Var2.h(cs0Var) ? 32 : 16) | (nv0Var2.h(cs0Var2) ? 256 : 128) | (nv0Var2.h(cs0Var3) ? 2048 : 1024) | 24576 | (nv0Var2.h(cs0Var4) ? 131072 : 65536) | (nv0Var2.g(z) ? 1048576 : 524288);
        if (nv0Var2.R(i3 & 1, (599187 & i3) != 599186)) {
            so3 so3Var = n92.o0;
            yp1 yp1Var = yp1.a;
            bq1 bq1VarK = f80.K(j43.c(n92.J(yp1Var, so3Var), 1.0f), 4.0f, 8.0f);
            dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var2, 48);
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
            y02.F(f5.E, nv0Var2, dp2VarA);
            y02.F(f5.D, nv0Var2, n52VarL);
            y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode));
            y02.C(nv0Var2);
            y02.F(f5.C, nv0Var2, bq1VarM);
            gv3.f(cs0Var, null, false, null, null, gv3.n, nv0Var2, ((i3 >> 3) & 14) | 1572864, 62);
            g(nv0Var2, j43.o(yp1Var, 4.0f));
            boolean z3 = mg2Var instanceof kg2;
            if (z3) {
                nv0Var2.a0(1948331302);
                r32Var = new r32(new wx(vp.c(4287137928L)), M(2131624595, nv0Var2));
                nv0Var2.p(false);
            } else if (mg2Var instanceof jg2) {
                nv0Var2.a0(1948335332);
                r32Var = new r32(new wx(vp.c(4294945280L)), M(2131624594, nv0Var2));
                nv0Var2.p(false);
            } else if (mg2Var instanceof ig2) {
                nv0Var2.a0(1948339267);
                r32Var = new r32(new wx(vp.c(4278242406L)), M(2131624593, nv0Var2));
                nv0Var2.p(false);
            } else {
                if (!(mg2Var instanceof lg2)) {
                    throw by1.d(nv0Var2, 1948329223, false);
                }
                nv0Var2.a0(1948343039);
                r32Var = new r32(new wx(vp.c(4294919236L)), M(2131624596, nv0Var2));
                nv0Var2.p(false);
            }
            long j = ((wx) r32Var.f).a;
            w01 w01VarB = ur.a;
            if (w01VarB != null) {
                z2 = z3;
                f = 10.0f;
            } else {
                v01 v01Var = new v01("Filled.Circle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i4 = vo3.a;
                z2 = z3;
                w73 w73Var = new w73(wx.b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new q42(12.0f, 2.0f));
                arrayList.add(new n42(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f));
                arrayList.add(new a52(4.47f, 10.0f, 10.0f, 10.0f));
                arrayList.add(new a52(10.0f, -4.47f, 10.0f, -10.0f));
                arrayList.add(new s42(17.53f, 2.0f, 12.0f, 2.0f));
                arrayList.add(m42.c);
                v01.a(v01Var, arrayList, w73Var);
                w01VarB = v01Var.b();
                ur.a = w01VarB;
                f = 10.0f;
            }
            s01.a(w01VarB, null, j43.k(yp1Var, f), j, nv0Var, 432, 0);
            g(nv0Var, j43.o(yp1Var, 6.0f));
            if (mg2Var instanceof ig2) {
                nv0Var.a0(1948357162);
                nv0Var.p(false);
                strF = ((ig2) mg2Var).a;
            } else if (mg2Var instanceof lg2) {
                nv0Var.a0(1948359748);
                nv0Var.p(false);
                strF = ((lg2) mg2Var).a;
            } else {
                strF = by1.f(nv0Var, 1948360803, 2131624603, nv0Var, false);
            }
            mg3.b(strF, new jc1(1.0f, true), 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(ql3.a)).i, nv0Var, 1572864, 0, 131004);
            vm1.d(mg2Var instanceof jg2, null, null, null, null, nv0Var, 1572870);
            nv0Var2 = nv0Var;
            if (z2) {
                nv0Var2.a0(270167426);
                gv3.f(cs0Var2, null, false, null, null, gv3.p, nv0Var2, ((i3 >> 6) & 14) | 1572864, 62);
                i2 = 0;
                nv0Var2.p(false);
            } else {
                nv0Var2.a0(270430709);
                gv3.f(cs0Var3, null, false, null, null, gv3.q, nv0Var2, ((i3 >> 9) & 14) | 1572864, 62);
                i2 = 0;
                nv0Var2.p(false);
            }
            gv3.f(cs0Var4, null, false, null, null, gq.N(1101304904, new ti2(i2, z), nv0Var2), nv0Var2, ((i3 >> 15) & 14) | 1572864, 62);
            if (z2) {
                nv0Var2.a0(271232741);
                g(nv0Var2, j43.o(yp1Var, 48.0f));
                nv0Var2.p(false);
            } else {
                nv0Var2.a0(271294245);
                nv0Var2.p(false);
            }
            nv0Var2.p(true);
            bq1Var2 = yp1Var;
        } else {
            nv0Var2.U();
            bq1Var2 = bq1Var;
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new zr(mg2Var, cs0Var, cs0Var2, cs0Var3, bq1Var2, cs0Var4, z, i);
        }
    }

    public static final void f(c63 c63Var, bq1 bq1Var, ss0 ss0Var, nv0 nv0Var, int i) {
        nv0Var.b0(-1077081618);
        int i2 = (nv0Var.f(bq1Var) ? 32 : 16) | i | 384;
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            ss0Var = a10.a;
            z53 z53Var = (z53) c63Var.b.getValue();
            h1 h1Var = (h1) nv0Var.j(s20.a);
            boolean zF = nv0Var.f(z53Var) | nv0Var.h(h1Var);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                objO = new hd1(z53Var, h1Var, null, 25);
                nv0Var.j0(objO);
            }
            rn.l((rs0) objO, nv0Var, z53Var);
            d((z53) c63Var.b.getValue(), bq1Var, nv0Var, i2 & 1008);
        } else {
            nv0Var.U();
        }
        ss0 ss0Var2 = ss0Var;
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new w1((Object) c63Var, (Object) bq1Var, (Object) ss0Var2, i, 20);
        }
    }

    public static final void g(nv0 nv0Var, bq1 bq1Var) {
        p8 p8Var = p8.i;
        int iHashCode = Long.hashCode(nv0Var.T);
        bq1 bq1VarM = lr.M(nv0Var, bq1Var);
        n52 n52VarL = nv0Var.l();
        w10.c.getClass();
        nv0Var.d0();
        if (nv0Var.S) {
            nv0Var.k(tb1.Y);
        } else {
            nv0Var.m0();
        }
        y02.F(f5.E, nv0Var, p8Var);
        y02.F(f5.D, nv0Var, n52VarL);
        y02.C(nv0Var);
        y02.F(f5.C, nv0Var, bq1VarM);
        y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
        nv0Var.p(true);
    }

    public static final void h(final an3 an3Var, final pn3 pn3Var, final String str, final cs0 cs0Var, final cs0 cs0Var2, final cs0 cs0Var3, nv0 nv0Var, final int i) {
        xj2 xj2VarT;
        rs0 rs0Var;
        an3Var.getClass();
        pn3Var.getClass();
        str.getClass();
        cs0Var.getClass();
        cs0Var2.getClass();
        cs0Var3.getClass();
        nv0Var.b0(-1610148760);
        int i2 = i | (nv0Var.f(an3Var) ? 4 : 2) | (nv0Var.f(pn3Var) ? 32 : 16) | (nv0Var.h(cs0Var) ? 2048 : 1024) | (nv0Var.h(cs0Var2) ? 16384 : 8192) | (nv0Var.h(cs0Var3) ? 131072 : 65536);
        if (nv0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            vm3 vm3Var = an3Var instanceof vm3 ? (vm3) an3Var : null;
            if (vm3Var == null) {
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    final int i3 = 0;
                    rs0Var = new rs0(an3Var, pn3Var, str, cs0Var, cs0Var2, cs0Var3, i, i3) { // from class: in3
                        public final /* synthetic */ int f;
                        public final /* synthetic */ an3 g;
                        public final /* synthetic */ pn3 h;
                        public final /* synthetic */ String i;
                        public final /* synthetic */ cs0 j;
                        public final /* synthetic */ cs0 k;
                        public final /* synthetic */ cs0 l;

                        {
                            this.f = i3;
                        }

                        @Override // defpackage.rs0
                        public final Object f(Object obj, Object obj2) {
                            int i4 = this.f;
                            dm3 dm3Var = dm3.a;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = jo3.y(385);
                                    oz2.h(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY2 = jo3.y(385);
                                    oz2.h(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY2);
                                    break;
                            }
                            return dm3Var;
                        }
                    };
                    xj2VarT.d = rs0Var;
                }
                return;
            }
            qn3 qn3Var = vm3Var.a;
            boolean z = (pn3Var instanceof ln3) || (pn3Var instanceof on3);
            boolean zG = nv0Var.g(z) | ((i2 & 458752) == 131072);
            Object objO = nv0Var.O();
            if (zG || objO == c20.a) {
                objO = new qv(3, cs0Var3, z);
                nv0Var.j0(objO);
            }
            rn.a((cs0) objO, gq.N(-1053959504, new nh2(13, pn3Var, cs0Var), nv0Var), null, gq.N(-963899214, new fw(pn3Var, cs0Var2, z, cs0Var3, 5), nv0Var), null, vm1.P, gq.N(1318674869, new w1(qn3Var, str, pn3Var, 21), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, 1772592, 16276);
        } else {
            nv0Var.U();
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final int i4 = 1;
            rs0Var = new rs0(an3Var, pn3Var, str, cs0Var, cs0Var2, cs0Var3, i, i4) { // from class: in3
                public final /* synthetic */ int f;
                public final /* synthetic */ an3 g;
                public final /* synthetic */ pn3 h;
                public final /* synthetic */ String i;
                public final /* synthetic */ cs0 j;
                public final /* synthetic */ cs0 k;
                public final /* synthetic */ cs0 l;

                {
                    this.f = i4;
                }

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    int i42 = this.f;
                    dm3 dm3Var = dm3.a;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iY = jo3.y(385);
                            oz2.h(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iY2 = jo3.y(385);
                            oz2.h(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY2);
                            break;
                    }
                    return dm3Var;
                }
            };
            xj2VarT.d = rs0Var;
        }
    }

    public static final Charset i(xy2 xy2Var) {
        int iOrdinal = xy2Var.ordinal();
        if (iOrdinal == 0) {
            return ys.a;
        }
        if (iOrdinal == 1) {
            Charset charsetForName = Charset.forName("GBK");
            charsetForName.getClass();
            return charsetForName;
        }
        if (iOrdinal != 2) {
            c.k();
            return null;
        }
        Charset charsetForName2 = Charset.forName("windows-1251");
        charsetForName2.getClass();
        return charsetForName2;
    }

    public static final boolean j(gh3 gh3Var) {
        w62 w62Var;
        k72 k72Var = gh3Var.c;
        ci0 ci0Var = (k72Var == null || (w62Var = k72Var.b) == null) ? null : new ci0(w62Var.b);
        boolean z = false;
        if (ci0Var != null && ci0Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final Object[] k(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        uj.L(objArr, objArr2, 0, i, 6);
        uj.J(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final void l(Logger logger, ed3 ed3Var, hd3 hd3Var, String str) {
        logger.fine(hd3Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + ed3Var.a);
    }

    public static final Object[] m(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        uj.L(objArr, objArr2, 0, i, 6);
        uj.J(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] n(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        uj.L(objArr, objArr2, 0, i, 6);
        uj.J(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final void o(vd3 vd3Var, Context context, final boolean z, final String str, final long j) {
        if (yg3.c(j) || str.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        final Context context2 = context;
        List list = (List) r51.E1.h(context2);
        if (list.isEmpty()) {
            return;
        }
        as1 as1Var = vd3Var.a;
        as1 as1Var2 = vd3Var.a;
        ie3 ie3Var = ie3.b;
        as1Var.b(ie3Var);
        int size = list.size();
        int i = 0;
        while (i < size) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
            as1Var2.b(new ee3(new hd2(i), resolveInfo.loadLabel(packageManager).toString(), 0, new ns0() { // from class: id2
                @Override // defpackage.ns0
                public final Object h(Object obj) {
                    r51.F1.j(context2, resolveInfo, Boolean.valueOf(z), str, new yg3(j));
                    ((je3) obj).close();
                    return dm3.a;
                }
            }));
            i++;
            context2 = context;
        }
        as1Var2.b(ie3Var);
    }

    public static final void p(pr prVar, vr vrVar, da daVar) {
        vrVar.getClass();
        if (vrVar instanceof w02) {
            pr.k(prVar, ((w02) vrVar).l);
            return;
        }
        if (vrVar instanceof x02) {
            daVar.getClass();
            daVar.h();
            da.b(daVar, ((x02) vrVar).l);
            prVar.s(daVar);
            return;
        }
        if (vrVar instanceof v02) {
            prVar.s(((v02) vrVar).l);
        } else {
            c.k();
        }
    }

    public static final String q(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final String r(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final g5 s(ef3 ef3Var) {
        if (ef3Var instanceof ef3) {
            return ef3Var.a;
        }
        c.l(ef3Var, "Unknown position: ");
        return null;
    }

    public static final Object t(qu2 qu2Var, cv2 cv2Var) {
        Object objG = qu2Var.f.g(cv2Var);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static final pb2 u(View view) {
        pb2 pb2Var = (pb2) view.getTag(2131230854);
        if (pb2Var != null) {
            return pb2Var;
        }
        pb2 pb2Var2 = new pb2();
        view.setTag(2131230854, pb2Var2);
        return pb2Var2;
    }

    public static final long v(double d) {
        return D((float) d, 4294967296L);
    }

    public static final long w(int i) {
        return D(i, 4294967296L);
    }

    public static final w01 x() {
        w01 w01Var = a;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.VideogameAsset", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(21.0f, 6.0f);
        tx0Var.h(3.0f, 6.0f);
        tx0Var.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        tx0Var.o(8.0f);
        tx0Var.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        tx0Var.g(18.0f);
        tx0Var.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        tx0Var.h(23.0f, 8.0f);
        tx0Var.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        tx0Var.c();
        tx0Var.j(11.0f, 13.0f);
        tx0Var.h(8.0f, 13.0f);
        tx0Var.o(3.0f);
        tx0Var.h(6.0f, 16.0f);
        tx0Var.o(-3.0f);
        tx0Var.h(3.0f, 13.0f);
        tx0Var.o(-2.0f);
        tx0Var.g(3.0f);
        tx0Var.h(6.0f, 8.0f);
        tx0Var.g(2.0f);
        tx0Var.o(3.0f);
        tx0Var.g(3.0f);
        tx0Var.o(2.0f);
        tx0Var.c();
        tx0Var.j(15.5f, 15.0f);
        tx0Var.e(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        tx0Var.l(0.67f, -1.5f, 1.5f, -1.5f);
        tx0Var.l(1.5f, 0.67f, 1.5f, 1.5f);
        tx0Var.l(-0.67f, 1.5f, -1.5f, 1.5f);
        tx0Var.c();
        tx0Var.j(19.5f, 12.0f);
        tx0Var.e(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        tx0Var.k(18.67f, 9.0f, 19.5f, 9.0f);
        tx0Var.l(1.5f, 0.67f, 1.5f, 1.5f);
        tx0Var.l(-0.67f, 1.5f, -1.5f, 1.5f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        a = w01VarB;
        return w01VarB;
    }

    public static final int y(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static boolean z(String str) {
        if (!y93.q0(str) && !y93.B0(str, '/') && !y93.B0(str, '\\') && !y93.i0(str, '\\') && !y93.i0(str, (char) 0)) {
            List<String> listZ0 = y93.z0(str, new char[]{'/'}, 6);
            if (!listZ0.isEmpty()) {
                for (String str2 : listZ0) {
                    if (y93.q0(str2) || str2.equals(".") || str2.equals("..")) {
                    }
                }
            }
            return true;
        }
        return false;
    }
}
