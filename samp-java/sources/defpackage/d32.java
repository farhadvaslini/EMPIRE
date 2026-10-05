package defpackage;

import android.view.View;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class d32 {
    public static w01 a;
    public static w01 b;

    public static final jk2 A(ab1 ab1Var) {
        jk2 jk2VarQ = vr.q(ab1Var, true);
        long jB = ab1Var.B(jk2VarQ.d());
        float f = jk2VarQ.c;
        float f2 = jk2VarQ.d;
        long jB2 = ab1Var.B((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new jk2(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & 4294967295L)), Float.intBitsToFloat((int) (jB2 >> 32)), Float.intBitsToFloat((int) (jB2 & 4294967295L)));
    }

    public static final void a(int i, bq1 bq1Var, long j, long j2, ss0 ss0Var, rs0 rs0Var, d00 d00Var, nv0 nv0Var, int i2) {
        bq1 bq1Var2;
        long j3;
        long j4;
        ss0 ss0Var2;
        rs0 rs0Var2;
        nv0Var.b0(-1012974221);
        int i3 = i2 | (nv0Var.d(i) ? 4 : 2) | 222384;
        if (nv0Var.R(i3 & 1, (599187 & i3) != 599186)) {
            nv0Var.W();
            if ((i2 & 1) == 0 || nv0Var.A()) {
                long jE = hy.e(cd2.d, nv0Var);
                long jE2 = hy.e(cd2.f, nv0Var);
                d00 d00VarN = gq.N(1338273762, new oc3(i), nv0Var);
                rs0Var2 = b10.a;
                j4 = jE2;
                j3 = jE;
                bq1Var2 = yp1.a;
                ss0Var2 = d00VarN;
            } else {
                nv0Var.U();
                bq1Var2 = bq1Var;
                j3 = j;
                j4 = j2;
                ss0Var2 = ss0Var;
                rs0Var2 = rs0Var;
            }
            nv0Var.q();
            e(bq1Var2, j3, j4, ss0Var2, rs0Var2, d00Var, nv0Var, 224262);
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            j3 = j;
            j4 = j2;
            ss0Var2 = ss0Var;
            rs0Var2 = rs0Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new nc3(i, bq1Var2, j3, j4, ss0Var2, rs0Var2, d00Var, i2);
        }
    }

    public static final void b(bq1 bq1Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        bq1 bq1Var2;
        d00 d00Var2;
        nv0Var.b0(790527681);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(d00Var) ? 32 : 16;
        }
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (objO == zjVar) {
                d42 d42Var = new d42(null, f5.f0);
                nv0Var.j0(d42Var);
                objO = d42Var;
            }
            os1 os1Var = (os1) objO;
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar) {
                objO2 = new yb(os1Var, 22);
                nv0Var.j0(objO2);
            }
            cs0 cs0Var = (cs0) objO2;
            vb2 vb2Var = x90.a;
            tl tlVarL = r51.l(cl3.u, nv0Var, 6);
            bq1Var2 = bq1Var;
            d00Var2 = d00Var;
            vr.d(new he2[]{he3.b.a(rn.F(cs0Var, nv0Var, 2)), he3.a.a(tlVarL)}, gq.N(1070596993, new r81(bq1Var2, os1Var, d00Var2, tlVarL, cs0Var), nv0Var), nv0Var, 56);
        } else {
            bq1Var2 = bq1Var;
            d00Var2 = d00Var;
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xb(bq1Var2, d00Var2, i, i3);
        }
    }

    public static final void c(bq1 bq1Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(155925518);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(d00Var) ? 32 : 16;
        }
        int i3 = 3;
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            boolean z = nv0Var.j(he3.a) != null;
            boolean z2 = nv0Var.j(he3.b) != null;
            if (z && z2) {
                nv0Var.a0(-1977187922);
                cn1 cn1VarD = eo.d(f5.g, true);
                int iHashCode = Long.hashCode(nv0Var.T);
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
                y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                y02.C(nv0Var);
                y02.F(f5.C, nv0Var, bq1VarM);
                d00Var.f(nv0Var, Integer.valueOf((i2 >> 3) & 14));
                nv0Var.p(true);
                nv0Var.p(false);
            } else if (z) {
                nv0Var.a0(-1976997706);
                rn.q(bq1Var, d00Var, nv0Var, i2 & 126);
                nv0Var.p(false);
            } else if (z2) {
                nv0Var.a0(-1976846922);
                x90.d(bq1Var, d00Var, nv0Var, i2 & 126);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-1976716505);
                b(bq1Var, d00Var, nv0Var, i2 & 126);
                nv0Var.p(false);
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xb(bq1Var, d00Var, i, i3);
        }
    }

    public static final void d(List list, ns0 ns0Var, ns0 ns0Var2, bq1 bq1Var, nv0 nv0Var, int i) {
        bq1 bq1Var2;
        xj2 xj2VarT;
        ng2 ng2Var;
        list.getClass();
        ns0Var.getClass();
        ns0Var2.getClass();
        nv0Var.b0(622482205);
        int i2 = i | (nv0Var.f(list) ? 4 : 2) | (nv0Var.h(ns0Var) ? 32 : 16) | (nv0Var.h(ns0Var2) ? 256 : 128) | (nv0Var.f(bq1Var) ? 2048 : 1024);
        if (!nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            bq1Var2 = bq1Var;
            nv0Var.U();
        } else {
            if (list.isEmpty()) {
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    ng2Var = new ng2(list, ns0Var, ns0Var2, bq1Var, i, 0);
                    xj2VarT.d = ng2Var;
                }
                return;
            }
            bq1Var2 = bq1Var;
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
                nv0Var.j0(objO);
            }
            hb3.a(j43.o(f80.J(bq1Var2, 8.0f), 280.0f), uo2.a(12.0f), ((fy) nv0Var.j(hy.a)).p, 0L, 4.0f, 0.0f, null, gq.N(-479669598, new ul(list, ns0Var, ns0Var2, (SimpleDateFormat) objO, 8), nv0Var), nv0Var, 12607488, 104);
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            ng2Var = new ng2(list, ns0Var, ns0Var2, bq1Var2, i, 1);
            xj2VarT.d = ng2Var;
        }
    }

    public static final void e(bq1 bq1Var, long j, long j2, ss0 ss0Var, rs0 rs0Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(1955286154);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.e(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.h(ss0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.h(rs0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.h(d00Var) ? 131072 : 65536;
        }
        if (nv0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 << 3;
            hb3.a(su2.a(bq1Var, false, new cr2(14)), null, j, j2, 0.0f, 0.0f, null, gq.N(830280655, new do1(d00Var, rs0Var, ss0Var), nv0Var), nv0Var, (i3 & 896) | 12582912 | (i3 & 7168), 114);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new nc3(bq1Var, j, j2, ss0Var, rs0Var, d00Var, i);
        }
    }

    public static final long f(int i, int i2) {
        if (i < 0 || i2 < 0) {
            n21.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = yg3.c;
        return j;
    }

    public static final long g(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = wj3.c;
        return jFloatToRawIntBits;
    }

    public static final long h(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long i(int i, long j) {
        int i2 = yg3.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : f(i4, i);
    }

    public static final void j(tx0 tx0Var, String str, String str2) {
        str2.getClass();
        ArrayList arrayList = tx0Var.a;
        arrayList.add(str);
        arrayList.add(y93.G0(str2).toString());
    }

    public static final float k(i32 i32Var) {
        return i32Var.m().e == t02.g ? Float.intBitsToFloat((int) (i32Var.q() >> 32)) : Float.intBitsToFloat((int) (i32Var.q() & 4294967295L));
    }

    public static final boolean l(long j, long j2) {
        return j == j2;
    }

    public static final int m(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int n(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final wq2 o(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(2131230927);
            wq2 wq2Var = tag instanceof wq2 ? (wq2) tag : null;
            if (wq2Var != null) {
                return wq2Var;
            }
            Object objU = w22.u(view);
            view = objU instanceof View ? (View) objU : null;
        }
        return null;
    }

    public static final long p(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final w01 q() {
        w01 w01Var = a;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(17.65f, 6.35f);
        tx0Var.d(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        tx0Var.e(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        tx0Var.l(3.57f, 8.0f, 7.99f, 8.0f);
        tx0Var.e(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        tx0Var.g(-2.08f);
        tx0Var.e(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        tx0Var.e(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        tx0Var.l(2.69f, -6.0f, 6.0f, -6.0f);
        tx0Var.e(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        tx0Var.h(13.0f, 11.0f);
        tx0Var.g(7.0f);
        tx0Var.n(4.0f);
        tx0Var.i(-2.35f, 2.35f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        a = w01VarB;
        return w01VarB;
    }

    public static final void r(String str) {
        str.getClass();
        if (str.length() <= 0) {
            c.p("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ('!' > cCharAt || cCharAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                ur.r(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void s(String str, String str2) {
        str.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                ur.r(16);
                String string = Integer.toString(cCharAt, 16);
                string.getClass();
                if (string.length() < 2) {
                    string = "0".concat(string);
                }
                sb.append(string);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                sb.append(jv3.i(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final boolean t(i32 i32Var, float f) {
        i32Var.m().getClass();
        return !(((i32Var.r() ? -f : k(i32Var)) > 0.0f ? 1 : ((i32Var.r() ? -f : k(i32Var)) == 0.0f ? 0 : -1)) > 0);
    }

    public static final dn1 u(ap2 ap2Var, int i, int i2, int i3, int i4, int i5, en1 en1Var, List list, i62[] i62VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        long j;
        int i10;
        int i11;
        int i12;
        List list2 = list;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int iMax = 0;
        int i15 = 0;
        int i16 = 0;
        int iMin = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            xm1 xm1Var = (xm1) list2.get(i14);
            float fS = b32.s(b32.p(xm1Var));
            if (fS > 0.0f) {
                f2 += fS;
                i15++;
                j = j2;
                i10 = i14;
            } else {
                int i17 = i3 - i16;
                i62 i62VarT = i62VarArr[i14];
                j = j2;
                if (i62VarT == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i15;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i15;
                        i12 = i17 < 0 ? 0 : i17;
                    }
                    i62VarT = xm1Var.t(ap2Var.g(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i15;
                }
                i62 i62Var = i62VarT;
                int i18 = ap2Var.i(i62Var);
                int iH = ap2Var.h(i62Var);
                iArr2[i10 - i6] = i18;
                int i19 = i17 - i18;
                if (i19 < 0) {
                    i19 = 0;
                }
                iMin = Math.min(i5, i19);
                i16 += i18 + iMin;
                iMax = Math.max(iMax, iH);
                i62VarArr[i10] = i62Var;
                i15 = i11;
            }
            i14 = i10 + 1;
            j2 = j;
        }
        long j3 = j2;
        int i20 = i15;
        if (i20 == 0) {
            i16 -= iMin;
            i9 = 0;
        } else {
            long j4 = ((long) (i20 - 1)) * j3;
            long jRound = ((long) ((i3 != Integer.MAX_VALUE ? i3 : i) - i16)) - j4;
            if (jRound < 0) {
                jRound = 0;
            }
            float f3 = jRound / f2;
            for (int i21 = i6; i21 < i7; i21++) {
                jRound -= (long) Math.round(b32.s(b32.p((xm1) list2.get(i21))) * f3);
            }
            int i22 = i6;
            int i23 = iMax;
            int i24 = 0;
            while (i22 < i7) {
                if (i62VarArr[i22] == null) {
                    xm1 xm1Var2 = (xm1) list2.get(i22);
                    f = f3;
                    bp2 bp2VarP = b32.p(xm1Var2);
                    float fS2 = b32.s(bp2VarP);
                    if (fS2 <= 0.0f) {
                        k21.b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j5 = jRound - ((long) iSignum);
                    int iMax2 = Math.max(0, Math.round(fS2 * f) + iSignum);
                    i62 i62VarT2 = xm1Var2.t(ap2Var.g((!(bp2VarP != null ? bp2VarP.b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i4, true));
                    int i25 = ap2Var.i(i62VarT2);
                    int iH2 = ap2Var.h(i62VarT2);
                    iArr2[i22 - i6] = i25;
                    i24 += i25;
                    int iMax3 = Math.max(i23, iH2);
                    i62VarArr[i22] = i62VarT2;
                    i23 = iMax3;
                    jRound = j5;
                } else {
                    f = f3;
                }
                i22++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (((long) i24) + j4);
            int i26 = i3 - i16;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i26) {
                i9 = i26;
            }
            iMax = i23;
        }
        int i27 = i9 + i16;
        if (i27 < 0) {
            i27 = 0;
        }
        int iMax4 = Math.max(i27, i);
        int iMax5 = Math.max(iMax, Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        ap2Var.f(iMax4, iArr2, iArr3, en1Var);
        return ap2Var.j(i62VarArr, en1Var, iArr3, iMax4, iMax5, iArr, i8, i6, i7);
    }

    public static final z32 v(float f) {
        return new z32(f);
    }

    public static void w(bg3 bg3Var, db0 db0Var, pg3 pg3Var, ab1 ab1Var, jg3 jg3Var, boolean z, iy1 iy1Var) {
        if (z) {
            int iR = iy1Var.r(yg3.e(bg3Var.b));
            String str = ue3.a;
            jk2 jk2VarB = iR < pg3Var.a.a.g.length() ? pg3Var.b(iR) : iR != 0 ? pg3Var.b(iR - 1) : new jk2(0.0f, 0.0f, 1.0f, (int) (ue3.a((gh3) db0Var.c, (ua0) db0Var.d, (zp0) db0Var.e) & 4294967295L));
            float f = jk2VarB.b;
            float f2 = jk2VarB.a;
            long jK0 = ab1Var.k0((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            jk2 jk2VarB2 = b32.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jK0 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jK0 >> 32)))) << 32), (((long) Float.floatToRawIntBits(jk2VarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(jk2VarB.d - f)) & 4294967295L));
            if (s51.n((jg3) jg3Var.a.b.get(), jg3Var)) {
                jg3Var.b.h(jk2VarB2);
            }
        }
    }

    public static xv2 x(String str, String str2) {
        String string;
        int iIntValue;
        str.getClass();
        str2.getClass();
        String string2 = y93.G0(str).toString();
        if (string2.length() == 0) {
            return tv2.a;
        }
        int iR0 = y93.r0(string2, ':', 0, 6);
        if (iR0 <= 0 || y93.n0(string2, ':', 0, 6) != iR0) {
            string = null;
        } else {
            String string3 = y93.G0(string2.substring(0, iR0)).toString();
            string = y93.G0(string2.substring(iR0 + 1)).toString();
            string2 = string3;
        }
        if (!y93.q0(string2) && string2.length() <= 253) {
            for (int i = 0; i < string2.length(); i++) {
                char cCharAt = string2.charAt(i);
                if (!ur.I(cCharAt) && cCharAt != '/' && cCharAt != '\\') {
                }
            }
            String string4 = y93.G0(str2).toString();
            if (string4.length() == 0) {
                if (string == null) {
                    string = "";
                }
                string4 = string;
            }
            if (string4.length() != 0) {
                Integer numF0 = fa3.f0(string4);
                iIntValue = numF0 != null ? numF0.intValue() : 7777;
                return vv2.a;
            }
            if (1 <= iIntValue && iIntValue < 65536) {
                return new wv2(new sv2(iIntValue, string2));
            }
            return vv2.a;
        }
        return uv2.a;
    }

    public static final ln2 y(ln2 ln2Var) {
        ln2Var.getClass();
        kn2 kn2VarC = ln2Var.c();
        nn2 nn2Var = ln2Var.l;
        kn2VarC.g = new km3(nn2Var.c(), nn2Var.b());
        return kn2VarC.a();
    }

    public static String z(long j) {
        return "PointerId(value=" + j + ")";
    }
}
