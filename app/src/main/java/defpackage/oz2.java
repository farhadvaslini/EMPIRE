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
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import top.th1nk.samp.R;

/* JADX INFO: loaded from: classes.dex */
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
    */
    public static k82 E(String str) {
        Integer numValueOf;
        Object qn2Var;
        Object next;
        ou2 ou2VarU;
        JSONObject jSONObject = new JSONObject(str);
        Object objOpt = jSONObject.opt("schemaVersion");
        r72 r72Var = null;
        if (objOpt instanceof Integer) {
            numValueOf = (Integer) objOpt;
        } else if (objOpt instanceof Long) {
            Number number = (Number) objOpt;
            int iLongValue = (int) number.longValue();
            numValueOf = ((long) iLongValue) == number.longValue() ? Integer.valueOf(iLongValue) : null;
        }
        if (numValueOf == null) {
            c.q("Missing or invalid schemaVersion");
            return null;
        }
        int iIntValue = numValueOf.intValue();
        if (iIntValue != 1) {
            c.g(by1.e(iIntValue, "Unsupported plugin manifest schema: "));
            return null;
        }
        String strJ = J(jSONObject, "id", 128);
        if (!k82.l.c(strJ)) {
            c.p("Invalid plugin id");
            return null;
        }
        String strJ2 = J(jSONObject, "name", 128);
        String strJ3 = J(jSONObject, "version", 64);
        int i = 0;
        try {
            ou2VarU = n32.u(strJ3, false);
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        if (ou2VarU == null) {
            throw new IllegalStateException("Invalid semantic version");
        }
        qn2Var = new la2(ou2VarU);
        if (qn2Var instanceof qn2) {
            c.p("Invalid plugin version");
            return null;
        }
        String strJ4 = J(jSONObject, "apiVersion", 64);
        if (!q72.a(strJ4)) {
            c.g("Unsupported plugin API version: ".concat(strJ4));
            return null;
        }
        String strJ5 = J(jSONObject, "entry", 256);
        if (!fa3.Y(strJ5, ".lua", true)) {
            c.p("Plugin entry must be a Lua file");
            return null;
        }
        if (!z(strJ5)) {
            c.p("Invalid plugin entry path");
            return null;
        }
        String strB = B(jSONObject, "activationMode", 32);
        if (strB.length() == 0) {
            strB = "restart-required";
        }
        mj0 mj0Var = p72.j;
        mj0Var.getClass();
        a0 a0Var = new a0(i, mj0Var);
        while (true) {
            if (!a0Var.hasNext()) {
                next = null;
                break;
            }
            next = a0Var.next();
            if (((p72) next).f.equals(strB)) {
                break;
            }
        }
        p72 p72Var = (p72) next;
        if (p72Var == null) {
            throw new IllegalStateException("Unsupported plugin activation mode: ".concat(strB).toString());
        }
        List listC = C(jSONObject, "permissions", 64);
        uk2 uk2Var = k82.m;
        if (listC == null || !listC.isEmpty()) {
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                if (!uk2Var.c((CharSequence) it.next())) {
                    c.p("Invalid plugin permission");
                    return null;
                }
            }
        }
        Set set = xv0.a;
        if (listC == null || !listC.isEmpty()) {
            Iterator it2 = listC.iterator();
            while (it2.hasNext()) {
                if (!set.contains((String) it2.next())) {
                    c.p("Unsupported plugin permission");
                    return null;
                }
            }
        }
        List listC2 = C(jSONObject, "contexts", 8);
        Set set2 = k82.n;
        if (listC2 == null || !listC2.isEmpty()) {
            Iterator it3 = listC2.iterator();
            while (it3.hasNext()) {
                if (!set2.contains((String) it3.next())) {
                    c.p("Invalid plugin context");
                    return null;
                }
            }
        }
        Object objOpt2 = jSONObject.opt("author");
        if (objOpt2 != null && objOpt2 != JSONObject.NULL) {
            if (!(objOpt2 instanceof JSONObject)) {
                c.q("Invalid author");
                return null;
            }
            r72Var = new r72(J((JSONObject) objOpt2, "name", 128));
        }
        return new k82(iIntValue, strJ, strJ2, strJ3, strJ4, strJ5, B(jSONObject, "description", 2048), p72Var, qx.n0(listC), qx.n0(listC2), r72Var);
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
    */
    public static final void a(final CharSequence charSequence, final rs0 rs0Var, final ef3 ef3Var, final ss0 ss0Var, final rs0 rs0Var2, final rs0 rs0Var3, final rs0 rs0Var4, final rs0 rs0Var5, final boolean z, final boolean z2, final boolean z3, final t41 t41Var, final x12 x12Var, final se3 se3Var, final d00 d00Var, nv0 nv0Var, final int i, final int i2) {
        int i3;
        int i4;
        float f;
        int iOrdinal;
        float f2;
        int iOrdinal2;
        d42 d42Var;
        float f3;
        int iOrdinal3;
        float f4;
        int iOrdinal4;
        float f5;
        int iOrdinal5;
        int[] iArr;
        iy iyVarF;
        boolean zF;
        Object objO;
        zj zjVar;
        int[] iArr2;
        f31 f31Var;
        iy iyVarF2;
        boolean zF2;
        Object objO2;
        Object objO3;
        se3 se3Var2;
        zj zjVar2;
        int i5;
        gh3 gh3Var;
        d00 d00Var2;
        d00 d00Var3;
        Object objO4;
        d00 d00VarN;
        Object objO5;
        d00 d00Var4;
        d00 d00Var5;
        d00 d00VarN2;
        Object objO6;
        os1 os1Var;
        boolean zF3;
        Object objO7;
        int i6;
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(546805032);
        if ((i & 6) == 0) {
            i3 = i | (nv0Var2.d(1) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= nv0Var2.h(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= nv0Var2.h(rs0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= nv0Var2.f(ef3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= nv0Var2.h(ss0Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= nv0Var2.h(rs0Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= nv0Var2.h(rs0Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= nv0Var2.h(rs0Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= nv0Var2.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= nv0Var2.h(null) ? 536870912 : 268435456;
        }
        int i7 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (nv0Var2.h(rs0Var5) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= nv0Var2.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= nv0Var2.g(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= nv0Var2.g(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= nv0Var2.f(t41Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= nv0Var2.f(x12Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= nv0Var2.f(se3Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= nv0Var2.h(d00Var) ? 8388608 : 4194304;
        }
        int i8 = i4;
        if (nv0Var2.R(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) pq.o(t41Var, nv0Var2, (i8 >> 12) & 14).getValue()).booleanValue();
            f31 f31Var2 = f31.h;
            f31 f31Var3 = f31.g;
            f31 f31Var4 = f31.f;
            f31 f31Var5 = zBooleanValue ? f31Var4 : charSequence.length() == 0 ? f31Var3 : f31Var2;
            long j = !z2 ? se3Var.z : z3 ? se3Var.A : zBooleanValue ? se3Var.x : se3Var.y;
            ol3 ol3Var = (ol3) nv0Var2.j(ql3.a);
            gh3 gh3Var2 = ol3Var.j;
            gh3 gh3Var3 = ol3Var.l;
            long jB = gh3Var2.b();
            int i9 = wx.h;
            long j2 = wx.g;
            boolean z4 = (wx.c(jB, j2) && !wx.c(gh3Var3.b(), j2)) || (!wx.c(gh3Var2.b(), j2) && wx.c(gh3Var3.b(), j2));
            long jB2 = gh3Var3.b();
            if (z4 && jB2 == 16) {
                jB2 = j;
            }
            long jB3 = gh3Var2.b();
            long j3 = (z4 && jB3 == 16) ? j : jB3;
            boolean z5 = z4;
            boolean z6 = ss0Var != null;
            gk3 gk3VarD0 = w7.d0(f31Var5, "TextFieldInputState", nv0Var2, 48, 0);
            u10 u10Var = gk3VarD0.a;
            d42 d42Var2 = gk3VarD0.d;
            s83 s83VarR = uq.R(pq1.g, nv0Var2);
            bl3 bl3Var = rn.f1;
            f31 f31Var6 = (f31) u10Var.h();
            nv0Var2.a0(-1436405362);
            int iOrdinal6 = f31Var6.ordinal();
            float f6 = 0.0f;
            if (iOrdinal6 == 0) {
                f = 1.0f;
                nv0Var2.p(false);
                Float fValueOf = Float.valueOf(f);
                f31 f31Var7 = (f31) d42Var2.getValue();
                nv0Var2.a0(-1436405362);
                iOrdinal = f31Var7.ordinal();
                if (iOrdinal == 0) {
                    f2 = 1.0f;
                    nv0Var2.p(false);
                    Float fValueOf2 = Float.valueOf(f2);
                    gk3VarD0.f();
                    nv0Var2.a0(-709912974);
                    nv0Var2.p(false);
                    ek3 ek3VarH = w7.H(gk3VarD0, fValueOf, fValueOf2, s83VarR, bl3Var, nv0Var2, 196608);
                    pq1 pq1Var = pq1.i;
                    s83 s83VarR2 = uq.R(pq1Var, nv0Var2);
                    s83 s83VarR3 = uq.R(pq1.j, nv0Var2);
                    f31 f31Var8 = (f31) u10Var.h();
                    nv0Var2.a0(-1093194547);
                    iOrdinal2 = f31Var8.ordinal();
                    if (iOrdinal2 != 0) {
                        d42Var = d42Var2;
                        if (iOrdinal2 == 1) {
                            if (z6) {
                            }
                            nv0Var2.p(false);
                            Float fValueOf3 = Float.valueOf(f3);
                            f31 f31Var9 = (f31) d42Var.getValue();
                            nv0Var2.a0(-1093194547);
                            iOrdinal3 = f31Var9.ordinal();
                            if (iOrdinal3 == 0) {
                                f4 = 1.0f;
                                nv0Var2.p(false);
                                Float fValueOf4 = Float.valueOf(f4);
                                ck3 ck3VarF = gk3VarD0.f();
                                nv0Var2.a0(-984009111);
                                s83 s83Var = (ck3VarF.b(f31Var4, f31Var3) && (ck3VarF.b(f31Var3, f31Var4) || ck3VarF.b(f31Var2, f31Var3))) ? s83VarR3 : s83VarR2;
                                nv0Var2.p(false);
                                ek3 ek3VarH2 = w7.H(gk3VarD0, fValueOf3, fValueOf4, s83Var, bl3Var, nv0Var2, 196608);
                                f31 f31Var10 = (f31) u10Var.h();
                                nv0Var2.a0(-1258455321);
                                iOrdinal4 = f31Var10.ordinal();
                                if (iOrdinal4 == 0) {
                                    f5 = 1.0f;
                                    nv0Var2.p(false);
                                    Float fValueOf5 = Float.valueOf(f5);
                                    f31 f31Var11 = (f31) d42Var.getValue();
                                    nv0Var2.a0(-1258455321);
                                    iOrdinal5 = f31Var11.ordinal();
                                    if (iOrdinal5 == 0) {
                                        f6 = 1.0f;
                                        nv0Var2.p(false);
                                        Float fValueOf6 = Float.valueOf(f6);
                                        gk3VarD0.f();
                                        nv0Var2.a0(2126293195);
                                        nv0Var2.p(false);
                                        ek3 ek3VarH3 = w7.H(gk3VarD0, fValueOf5, fValueOf6, s83VarR2, bl3Var, nv0Var2, 196608);
                                        s83 s83VarR4 = uq.R(pq1Var, nv0Var2);
                                        f31 f31Var12 = (f31) d42Var.getValue();
                                        nv0Var2.a0(-12973394);
                                        iArr = af3.a;
                                        long j4 = iArr[f31Var12.ordinal()] == 1 ? jB2 : j3;
                                        nv0Var2.p(false);
                                        iyVarF = wx.f(j4);
                                        zF = nv0Var2.f(iyVarF);
                                        objO = nv0Var2.O();
                                        zjVar = c20.a;
                                        if (zF || objO == zjVar) {
                                            iArr2 = iArr;
                                            bl3 bl3Var2 = new bl3(hd.m, new kd(2, iyVarF));
                                            nv0Var2.j0(bl3Var2);
                                            objO = bl3Var2;
                                        } else {
                                            iArr2 = iArr;
                                        }
                                        bl3 bl3Var3 = (bl3) objO;
                                        f31 f31Var13 = (f31) u10Var.h();
                                        nv0Var2.a0(-12973394);
                                        long j5 = iArr2[f31Var13.ordinal()] != 1 ? jB2 : j3;
                                        nv0Var2.p(false);
                                        wx wxVar = new wx(j5);
                                        f31Var = (f31) d42Var.getValue();
                                        nv0Var2.a0(-12973394);
                                        if (iArr2[f31Var.ordinal()] != 1) {
                                            jB2 = j3;
                                        }
                                        nv0Var2.p(false);
                                        wx wxVar2 = new wx(jB2);
                                        gk3VarD0.f();
                                        nv0Var2.a0(1954111929);
                                        nv0Var2.p(false);
                                        ek3 ek3VarH4 = w7.H(gk3VarD0, wxVar, wxVar2, s83VarR4, bl3Var3, nv0Var2, 196608);
                                        nv0Var2.a0(-464752477);
                                        nv0Var2.p(false);
                                        iyVarF2 = wx.f(j);
                                        zF2 = nv0Var2.f(iyVarF2);
                                        objO2 = nv0Var2.O();
                                        if (!zF2 || objO2 == zjVar) {
                                            bl3 bl3Var4 = new bl3(hd.m, new kd(2, iyVarF2));
                                            nv0Var2.j0(bl3Var4);
                                            objO2 = bl3Var4;
                                        }
                                        bl3 bl3Var5 = (bl3) objO2;
                                        nv0Var2.a0(-464752477);
                                        nv0Var2.p(false);
                                        wx wxVar3 = new wx(j);
                                        nv0Var2.a0(-464752477);
                                        nv0Var2.p(false);
                                        wx wxVar4 = new wx(j);
                                        gk3VarD0.f();
                                        nv0Var2.a0(1190923886);
                                        nv0Var2.p(false);
                                        ek3 ek3VarH5 = w7.H(gk3VarD0, wxVar3, wxVar4, s83VarR4, bl3Var5, nv0Var2, 196608);
                                        objO3 = nv0Var2.O();
                                        if (objO3 == zjVar) {
                                            objO3 = new ze3();
                                            nv0Var2.j0(objO3);
                                        }
                                        ze3 ze3Var = (ze3) objO3;
                                        if (ss0Var != null) {
                                            nv0Var2.a0(-1891724857);
                                            nv0Var2.p(false);
                                            se3Var2 = se3Var;
                                            zjVar2 = zjVar;
                                            i5 = i7;
                                            gh3Var = gh3Var2;
                                            d00Var3 = null;
                                            d00Var2 = null;
                                        } else {
                                            nv0Var2.a0(-1891724856);
                                            se3Var2 = se3Var;
                                            zjVar2 = zjVar;
                                            i5 = i7;
                                            gh3Var = gh3Var2;
                                            d00Var2 = null;
                                            d00 d00VarN3 = gq.N(-1076580032, new up1(gh3Var, gh3Var3, ek3VarH, ek3VarH5, z5, ek3VarH4, ss0Var, ze3Var), nv0Var2);
                                            nv0Var2.p(false);
                                            d00Var3 = d00VarN3;
                                        }
                                        long j6 = z2 ? se3Var2.D : z3 ? se3Var2.E : zBooleanValue ? se3Var2.B : se3Var2.C;
                                        objO4 = nv0Var2.O();
                                        if (objO4 == zjVar2) {
                                            objO4 = b32.k(new qu1(ek3VarH2, 7), m22.u);
                                            nv0Var2.j0(objO4);
                                        }
                                        e93 e93Var = (e93) objO4;
                                        if (rs0Var2 == null && charSequence.length() == 0 && ((Boolean) e93Var.getValue()).booleanValue()) {
                                            nv0Var2.a0(-1890614312);
                                            d00VarN = gq.N(1405547205, new ye3(ek3VarH2, j6, gh3Var, rs0Var2), nv0Var2);
                                            nv0Var2.p(false);
                                        } else {
                                            nv0Var2.a0(-1890217110);
                                            nv0Var2.p(false);
                                            d00VarN = d00Var2;
                                        }
                                        objO5 = nv0Var2.O();
                                        if (objO5 == zjVar2) {
                                            objO5 = b32.k(new qu1(ek3VarH3, 8), m22.u);
                                            nv0Var2.j0(objO5);
                                        }
                                        nv0Var2.a0(-1889500886);
                                        nv0Var2.p(false);
                                        nv0Var2.a0(-1888924534);
                                        nv0Var2.p(false);
                                        long j7 = z2 ? se3Var2.r : z3 ? se3Var2.s : zBooleanValue ? se3Var2.p : se3Var2.q;
                                        if (rs0Var3 != null) {
                                            nv0Var2.a0(-1888749663);
                                            nv0Var2.p(false);
                                            d00Var4 = d00Var2;
                                        } else {
                                            nv0Var2.a0(-1888749662);
                                            d00 d00VarN4 = gq.N(-1736293487, new fu(j7, rs0Var3, 1), nv0Var2);
                                            nv0Var2.p(false);
                                            d00Var4 = d00VarN4;
                                        }
                                        long j8 = z2 ? se3Var2.v : z3 ? se3Var2.w : zBooleanValue ? se3Var2.t : se3Var2.u;
                                        if (rs0Var4 != null) {
                                            nv0Var2.a0(-1888469888);
                                            nv0Var2.p(false);
                                            d00Var5 = d00Var2;
                                        } else {
                                            nv0Var2.a0(-1888469887);
                                            d00 d00VarN5 = gq.N(1334518521, new fu(j8, rs0Var4, 2), nv0Var2);
                                            nv0Var2.p(false);
                                            d00Var5 = d00VarN5;
                                        }
                                        long j9 = z2 ? se3Var2.H : z3 ? se3Var2.I : zBooleanValue ? se3Var2.F : se3Var2.G;
                                        if (rs0Var5 != null) {
                                            nv0Var2.a0(-1888176380);
                                            nv0Var2.p(false);
                                            d00VarN2 = d00Var2;
                                        } else {
                                            nv0Var2.a0(-1888176379);
                                            d00VarN2 = gq.N(837168720, new fq(j9, gh3Var3, rs0Var5, 1), nv0Var2);
                                            nv0Var2.p(false);
                                        }
                                        nv0Var2.a0(-1886778186);
                                        objO6 = nv0Var2.O();
                                        if (objO6 == zjVar2) {
                                            objO6 = b32.w(new h43(0L));
                                            nv0Var2.j0(objO6);
                                        }
                                        os1Var = (os1) objO6;
                                        d00 d00Var6 = d00VarN2;
                                        d00 d00Var7 = d00Var5;
                                        d00 d00VarN6 = gq.N(528115858, new xe3(os1Var, ef3Var, x12Var, d00Var), nv0Var2);
                                        d00 d00Var8 = d00VarN;
                                        bf3 bf3Var = new bf3(new id1(0, 4, e93.class, ek3VarH, "value", "getValue()Ljava/lang/Object;"));
                                        int i10 = i5;
                                        zF3 = ((i10 & 7168) != 2048) | nv0Var2.f(ek3VarH);
                                        objO7 = nv0Var2.O();
                                        i6 = 18;
                                        if (!zF3 || objO7 == zjVar2) {
                                            objO7 = new er1(ef3Var, ek3VarH, os1Var, i6);
                                            nv0Var2.j0(objO7);
                                        }
                                        d00 d00Var9 = d00Var2;
                                        g12.n(rs0Var, d00Var8, d00Var3, d00Var4, d00Var7, d00Var9, d00Var9, z, ef3Var, bf3Var, (ns0) objO7, d00VarN6, d00Var6, x12Var, nv0Var2, ((i10 << 18) & 1879048192) | ((i10 >> 3) & 112) | 6 | ((i8 << 21) & 234881024), (57344 & (i8 >> 3)) | 384);
                                        nv0Var2 = nv0Var2;
                                        nv0Var2.p(false);
                                    } else {
                                        if (iOrdinal5 == 1) {
                                            if (!z6) {
                                            }
                                            nv0Var2.p(false);
                                            Float fValueOf62 = Float.valueOf(f6);
                                            gk3VarD0.f();
                                            nv0Var2.a0(2126293195);
                                            nv0Var2.p(false);
                                            ek3 ek3VarH32 = w7.H(gk3VarD0, fValueOf5, fValueOf62, s83VarR2, bl3Var, nv0Var2, 196608);
                                            s83 s83VarR42 = uq.R(pq1Var, nv0Var2);
                                            f31 f31Var122 = (f31) d42Var.getValue();
                                            nv0Var2.a0(-12973394);
                                            iArr = af3.a;
                                            if (iArr[f31Var122.ordinal()] == 1) {
                                            }
                                            nv0Var2.p(false);
                                            iyVarF = wx.f(j4);
                                            zF = nv0Var2.f(iyVarF);
                                            objO = nv0Var2.O();
                                            zjVar = c20.a;
                                            if (zF) {
                                                iArr2 = iArr;
                                                bl3 bl3Var22 = new bl3(hd.m, new kd(2, iyVarF));
                                                nv0Var2.j0(bl3Var22);
                                                objO = bl3Var22;
                                                bl3 bl3Var32 = (bl3) objO;
                                                f31 f31Var132 = (f31) u10Var.h();
                                                nv0Var2.a0(-12973394);
                                                if (iArr2[f31Var132.ordinal()] != 1) {
                                                }
                                                nv0Var2.p(false);
                                                wx wxVar5 = new wx(j5);
                                                f31Var = (f31) d42Var.getValue();
                                                nv0Var2.a0(-12973394);
                                                if (iArr2[f31Var.ordinal()] != 1) {
                                                }
                                                nv0Var2.p(false);
                                                wx wxVar22 = new wx(jB2);
                                                gk3VarD0.f();
                                                nv0Var2.a0(1954111929);
                                                nv0Var2.p(false);
                                                ek3 ek3VarH42 = w7.H(gk3VarD0, wxVar5, wxVar22, s83VarR42, bl3Var32, nv0Var2, 196608);
                                                nv0Var2.a0(-464752477);
                                                nv0Var2.p(false);
                                                iyVarF2 = wx.f(j);
                                                zF2 = nv0Var2.f(iyVarF2);
                                                objO2 = nv0Var2.O();
                                                if (!zF2) {
                                                    bl3 bl3Var42 = new bl3(hd.m, new kd(2, iyVarF2));
                                                    nv0Var2.j0(bl3Var42);
                                                    objO2 = bl3Var42;
                                                    bl3 bl3Var52 = (bl3) objO2;
                                                    nv0Var2.a0(-464752477);
                                                    nv0Var2.p(false);
                                                    wx wxVar32 = new wx(j);
                                                    nv0Var2.a0(-464752477);
                                                    nv0Var2.p(false);
                                                    wx wxVar42 = new wx(j);
                                                    gk3VarD0.f();
                                                    nv0Var2.a0(1190923886);
                                                    nv0Var2.p(false);
                                                    ek3 ek3VarH52 = w7.H(gk3VarD0, wxVar32, wxVar42, s83VarR42, bl3Var52, nv0Var2, 196608);
                                                    objO3 = nv0Var2.O();
                                                    if (objO3 == zjVar) {
                                                    }
                                                    ze3 ze3Var2 = (ze3) objO3;
                                                    if (ss0Var != null) {
                                                    }
                                                    if (z2) {
                                                    }
                                                    objO4 = nv0Var2.O();
                                                    if (objO4 == zjVar2) {
                                                    }
                                                    e93 e93Var2 = (e93) objO4;
                                                    if (rs0Var2 == null) {
                                                        nv0Var2.a0(-1890217110);
                                                        nv0Var2.p(false);
                                                        d00VarN = d00Var2;
                                                        objO5 = nv0Var2.O();
                                                        if (objO5 == zjVar2) {
                                                        }
                                                        nv0Var2.a0(-1889500886);
                                                        nv0Var2.p(false);
                                                        nv0Var2.a0(-1888924534);
                                                        nv0Var2.p(false);
                                                        if (z2) {
                                                        }
                                                        if (rs0Var3 != null) {
                                                        }
                                                        if (z2) {
                                                        }
                                                        if (rs0Var4 != null) {
                                                        }
                                                        long j92 = z2 ? se3Var2.H : z3 ? se3Var2.I : zBooleanValue ? se3Var2.F : se3Var2.G;
                                                        if (rs0Var5 != null) {
                                                        }
                                                        nv0Var2.a0(-1886778186);
                                                        objO6 = nv0Var2.O();
                                                        if (objO6 == zjVar2) {
                                                        }
                                                        os1Var = (os1) objO6;
                                                        d00 d00Var62 = d00VarN2;
                                                        d00 d00Var72 = d00Var5;
                                                        d00 d00VarN62 = gq.N(528115858, new xe3(os1Var, ef3Var, x12Var, d00Var), nv0Var2);
                                                        d00 d00Var82 = d00VarN;
                                                        bf3 bf3Var2 = new bf3(new id1(0, 4, e93.class, ek3VarH, "value", "getValue()Ljava/lang/Object;"));
                                                        int i102 = i5;
                                                        zF3 = ((i102 & 7168) != 2048) | nv0Var2.f(ek3VarH);
                                                        objO7 = nv0Var2.O();
                                                        i6 = 18;
                                                        if (!zF3) {
                                                            objO7 = new er1(ef3Var, ek3VarH, os1Var, i6);
                                                            nv0Var2.j0(objO7);
                                                            d00 d00Var92 = d00Var2;
                                                            g12.n(rs0Var, d00Var82, d00Var3, d00Var4, d00Var72, d00Var92, d00Var92, z, ef3Var, bf3Var2, (ns0) objO7, d00VarN62, d00Var62, x12Var, nv0Var2, ((i102 << 18) & 1879048192) | ((i102 >> 3) & 112) | 6 | ((i8 << 21) & 234881024), (57344 & (i8 >> 3)) | 384);
                                                            nv0Var2 = nv0Var2;
                                                            nv0Var2.p(false);
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (iOrdinal5 != 2) {
                                            c.k();
                                            return;
                                        }
                                        f6 = 1.0f;
                                        nv0Var2.p(false);
                                        Float fValueOf622 = Float.valueOf(f6);
                                        gk3VarD0.f();
                                        nv0Var2.a0(2126293195);
                                        nv0Var2.p(false);
                                        ek3 ek3VarH322 = w7.H(gk3VarD0, fValueOf5, fValueOf622, s83VarR2, bl3Var, nv0Var2, 196608);
                                        s83 s83VarR422 = uq.R(pq1Var, nv0Var2);
                                        f31 f31Var1222 = (f31) d42Var.getValue();
                                        nv0Var2.a0(-12973394);
                                        iArr = af3.a;
                                        if (iArr[f31Var1222.ordinal()] == 1) {
                                        }
                                        nv0Var2.p(false);
                                        iyVarF = wx.f(j4);
                                        zF = nv0Var2.f(iyVarF);
                                        objO = nv0Var2.O();
                                        zjVar = c20.a;
                                        if (zF) {
                                        }
                                    }
                                } else {
                                    if (iOrdinal4 == 1) {
                                        if (z6) {
                                            f5 = 0.0f;
                                        }
                                        nv0Var2.p(false);
                                        Float fValueOf52 = Float.valueOf(f5);
                                        f31 f31Var112 = (f31) d42Var.getValue();
                                        nv0Var2.a0(-1258455321);
                                        iOrdinal5 = f31Var112.ordinal();
                                        if (iOrdinal5 == 0) {
                                        }
                                    } else if (iOrdinal4 != 2) {
                                        c.k();
                                        return;
                                    }
                                    f5 = 1.0f;
                                    nv0Var2.p(false);
                                    Float fValueOf522 = Float.valueOf(f5);
                                    f31 f31Var1122 = (f31) d42Var.getValue();
                                    nv0Var2.a0(-1258455321);
                                    iOrdinal5 = f31Var1122.ordinal();
                                    if (iOrdinal5 == 0) {
                                    }
                                }
                            } else {
                                if (iOrdinal3 == 1) {
                                    if (z6) {
                                    }
                                    nv0Var2.p(false);
                                    Float fValueOf42 = Float.valueOf(f4);
                                    ck3 ck3VarF2 = gk3VarD0.f();
                                    nv0Var2.a0(-984009111);
                                    if (ck3VarF2.b(f31Var4, f31Var3)) {
                                        nv0Var2.p(false);
                                        ek3 ek3VarH22 = w7.H(gk3VarD0, fValueOf3, fValueOf42, s83Var, bl3Var, nv0Var2, 196608);
                                        f31 f31Var102 = (f31) u10Var.h();
                                        nv0Var2.a0(-1258455321);
                                        iOrdinal4 = f31Var102.ordinal();
                                        if (iOrdinal4 == 0) {
                                        }
                                    }
                                } else if (iOrdinal3 != 2) {
                                    c.k();
                                    return;
                                }
                                f4 = 0.0f;
                                nv0Var2.p(false);
                                Float fValueOf422 = Float.valueOf(f4);
                                ck3 ck3VarF22 = gk3VarD0.f();
                                nv0Var2.a0(-984009111);
                                if (ck3VarF22.b(f31Var4, f31Var3)) {
                                }
                            }
                        } else if (iOrdinal2 != 2) {
                            c.k();
                            return;
                        }
                        f3 = 0.0f;
                        nv0Var2.p(false);
                        Float fValueOf32 = Float.valueOf(f3);
                        f31 f31Var92 = (f31) d42Var.getValue();
                        nv0Var2.a0(-1093194547);
                        iOrdinal3 = f31Var92.ordinal();
                        if (iOrdinal3 == 0) {
                        }
                    } else {
                        d42Var = d42Var2;
                    }
                    f3 = 1.0f;
                    nv0Var2.p(false);
                    Float fValueOf322 = Float.valueOf(f3);
                    f31 f31Var922 = (f31) d42Var.getValue();
                    nv0Var2.a0(-1093194547);
                    iOrdinal3 = f31Var922.ordinal();
                    if (iOrdinal3 == 0) {
                    }
                } else {
                    if (iOrdinal == 1) {
                        if (z6) {
                            f2 = 0.0f;
                        }
                        nv0Var2.p(false);
                        Float fValueOf22 = Float.valueOf(f2);
                        gk3VarD0.f();
                        nv0Var2.a0(-709912974);
                        nv0Var2.p(false);
                        ek3 ek3VarH6 = w7.H(gk3VarD0, fValueOf, fValueOf22, s83VarR, bl3Var, nv0Var2, 196608);
                        pq1 pq1Var2 = pq1.i;
                        s83 s83VarR22 = uq.R(pq1Var2, nv0Var2);
                        s83 s83VarR32 = uq.R(pq1.j, nv0Var2);
                        f31 f31Var82 = (f31) u10Var.h();
                        nv0Var2.a0(-1093194547);
                        iOrdinal2 = f31Var82.ordinal();
                        if (iOrdinal2 != 0) {
                        }
                        f3 = 1.0f;
                        nv0Var2.p(false);
                        Float fValueOf3222 = Float.valueOf(f3);
                        f31 f31Var9222 = (f31) d42Var.getValue();
                        nv0Var2.a0(-1093194547);
                        iOrdinal3 = f31Var9222.ordinal();
                        if (iOrdinal3 == 0) {
                        }
                    } else if (iOrdinal != 2) {
                        c.k();
                        return;
                    }
                    f2 = 1.0f;
                    nv0Var2.p(false);
                    Float fValueOf222 = Float.valueOf(f2);
                    gk3VarD0.f();
                    nv0Var2.a0(-709912974);
                    nv0Var2.p(false);
                    ek3 ek3VarH62 = w7.H(gk3VarD0, fValueOf, fValueOf222, s83VarR, bl3Var, nv0Var2, 196608);
                    pq1 pq1Var22 = pq1.i;
                    s83 s83VarR222 = uq.R(pq1Var22, nv0Var2);
                    s83 s83VarR322 = uq.R(pq1.j, nv0Var2);
                    f31 f31Var822 = (f31) u10Var.h();
                    nv0Var2.a0(-1093194547);
                    iOrdinal2 = f31Var822.ordinal();
                    if (iOrdinal2 != 0) {
                    }
                    f3 = 1.0f;
                    nv0Var2.p(false);
                    Float fValueOf32222 = Float.valueOf(f3);
                    f31 f31Var92222 = (f31) d42Var.getValue();
                    nv0Var2.a0(-1093194547);
                    iOrdinal3 = f31Var92222.ordinal();
                    if (iOrdinal3 == 0) {
                    }
                }
            } else {
                if (iOrdinal6 == 1) {
                    if (z6) {
                        f = 0.0f;
                    }
                    nv0Var2.p(false);
                    Float fValueOf7 = Float.valueOf(f);
                    f31 f31Var72 = (f31) d42Var2.getValue();
                    nv0Var2.a0(-1436405362);
                    iOrdinal = f31Var72.ordinal();
                    if (iOrdinal == 0) {
                    }
                } else if (iOrdinal6 != 2) {
                    c.k();
                    return;
                }
                f = 1.0f;
                nv0Var2.p(false);
                Float fValueOf72 = Float.valueOf(f);
                f31 f31Var722 = (f31) d42Var2.getValue();
                nv0Var2.a0(-1436405362);
                iOrdinal = f31Var722.ordinal();
                if (iOrdinal == 0) {
                }
            }
        } else {
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: ve3
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(i | 1);
                    int iY2 = jo3.y(i2);
                    oz2.a(charSequence, rs0Var, ef3Var, ss0Var, rs0Var2, rs0Var3, rs0Var4, rs0Var5, z, z2, z3, t41Var, x12Var, se3Var, d00Var, (nv0) obj, iY, iY2);
                    return dm3.a;
                }
            };
        }
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
            String strP = g12.P(R.string.m3c_snackbar_pane_title, nv0Var);
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
                r32Var = new r32(new wx(vp.c(4287137928L)), M(R.string.raksamp_status_disconnected, nv0Var2));
                nv0Var2.p(false);
            } else if (mg2Var instanceof jg2) {
                nv0Var2.a0(1948335332);
                r32Var = new r32(new wx(vp.c(4294945280L)), M(R.string.raksamp_status_connecting, nv0Var2));
                nv0Var2.p(false);
            } else if (mg2Var instanceof ig2) {
                nv0Var2.a0(1948339267);
                r32Var = new r32(new wx(vp.c(4278242406L)), M(R.string.raksamp_status_connected, nv0Var2));
                nv0Var2.p(false);
            } else {
                if (!(mg2Var instanceof lg2)) {
                    throw by1.d(nv0Var2, 1948329223, false);
                }
                nv0Var2.a0(1948343039);
                r32Var = new r32(new wx(vp.c(4294919236L)), M(R.string.raksamp_status_error, nv0Var2));
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
                strF = by1.f(nv0Var, 1948360803, R.string.raksamp_title, nv0Var, false);
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
        pb2 pb2Var = (pb2) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (pb2Var != null) {
            return pb2Var;
        }
        pb2 pb2Var2 = new pb2();
        view.setTag(R.id.pooling_container_listener_holder_tag, pb2Var2);
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
