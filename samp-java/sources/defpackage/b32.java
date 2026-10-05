package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class b32 {
    public static w01 a;
    public static long b;
    public static Method c;

    public static final xo3 A(w01 w01Var, nv0 nv0Var) {
        ua0 ua0Var = (ua0) nv0Var.j(s20.h);
        boolean zE = nv0Var.e((((long) Float.floatToRawIntBits(ua0Var.h())) & 4294967295L) | (((long) Float.floatToRawIntBits(w01Var.j)) << 32));
        Object objO = nv0Var.O();
        if (zE || objO == c20.a) {
            bx0 bx0Var = new bx0();
            g(bx0Var, w01Var.f);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ua0Var.T(w01Var.b))) << 32) | (((long) Float.floatToRawIntBits(ua0Var.T(w01Var.c))) & 4294967295L);
            float fIntBitsToFloat = w01Var.d;
            float fIntBitsToFloat2 = w01Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            xo3 xo3Var = new xo3(bx0Var);
            String str = w01Var.a;
            long j = w01Var.g;
            xm xmVar = j != 16 ? new xm(w01Var.h, j) : null;
            boolean z = w01Var.i;
            xo3Var.e.setValue(new h43(jFloatToRawIntBits));
            xo3Var.f.setValue(Boolean.valueOf(z));
            ro3 ro3Var = xo3Var.g;
            ro3Var.g.setValue(xmVar);
            ro3Var.i.setValue(new h43(jFloatToRawIntBits2));
            ro3Var.c = str;
            nv0Var.j0(xo3Var);
            objO = xo3Var;
        }
        return (xo3) objO;
    }

    public static final p70 B(cs0 cs0Var) {
        return new p70(3, new m9(cs0Var, null));
    }

    public static final Object C(sr2 sr2Var, boolean z, sr2 sr2Var2, rs0 rs0Var) {
        Object jzVar;
        Object objZ;
        try {
            if (rs0Var instanceof ml) {
                cl3.i(2, rs0Var);
                jzVar = rs0Var.f(sr2Var2, sr2Var);
            } else {
                jzVar = vr.c0(rs0Var, sr2Var2, sr2Var);
            }
        } catch (vb0 e) {
            Throwable th = e.f;
            sr2Var.Y(new jz(th, false));
            throw th;
        } catch (Throwable th2) {
            jzVar = new jz(th2, false);
        }
        y50 y50Var = y50.f;
        if (jzVar == y50Var || (objZ = sr2Var.Z(jzVar)) == s51.n) {
            return y50Var;
        }
        sr2Var.s0();
        if (!(objZ instanceof jz)) {
            return s51.K(objZ);
        }
        if (!z) {
            Throwable th3 = ((jz) objZ).a;
            if ((th3 instanceof di3) && ((di3) th3).f == sr2Var) {
                if (jzVar instanceof jz) {
                    throw ((jz) jzVar).a;
                }
                return jzVar;
            }
        }
        throw ((jz) objZ).a;
    }

    public static final long D(String str, long j, long j2, long j3) {
        String property;
        int i = cc3.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lG0 = fa3.g0(property);
        if (lG0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lG0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int E(int i, int i2, String str) {
        return (int) D(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final long F(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final void a(String str, ns0 ns0Var, cs0 cs0Var, bq1 bq1Var, boolean z, nv0 nv0Var, int i) {
        bq1 bq1Var2;
        nv0 nv0Var2 = nv0Var;
        str.getClass();
        ns0Var.getClass();
        cs0Var.getClass();
        nv0Var2.b0(-694317977);
        int i2 = i | (nv0Var2.f(str) ? 4 : 2) | (nv0Var2.h(ns0Var) ? 32 : 16) | (nv0Var2.h(cs0Var) ? 256 : 128) | 3072 | (nv0Var2.g(z) ? 16384 : 8192);
        if (nv0Var2.R(i2 & 1, (i2 & 9363) != 9362)) {
            yp1 yp1Var = yp1.a;
            bq1 bq1VarK = f80.K(j43.c(yp1Var, 1.0f), 8.0f, 4.0f);
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
            jc1 jc1Var = new jc1(1.0f, true);
            o71 o71Var = new o71(0, 4, 119);
            boolean z2 = (i2 & 896) == 256;
            Object objO = nv0Var2.O();
            if (z2 || objO == c20.a) {
                objO = new rf(cs0Var, 5);
                nv0Var2.j0(objO);
            }
            g12.m(str, ns0Var, jc1Var, z, false, null, null, gv3.l, null, null, null, false, null, o71Var, new n71(null, (ns0) objO, 31), true, 1, 0, null, f5.i(6, nv0Var2), nv0Var, (i2 & 14) | 12582912 | (i2 & 112) | ((i2 >> 3) & 7168), 113442816, 3702640);
            nv0Var2 = nv0Var;
            oz2.g(nv0Var2, j43.o(yp1Var, 8.0f));
            gv3.f(cs0Var, null, z && !y93.q0(str), null, null, gv3.m, nv0Var2, ((i2 >> 6) & 14) | 1572864, 58);
            nv0Var2.p(true);
            bq1Var2 = yp1Var;
        } else {
            nv0Var2.U();
            bq1Var2 = bq1Var;
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new mi2(str, ns0Var, cs0Var, bq1Var2, z, i, 2);
        }
    }

    public static final jk2 b(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new jk2(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void c(bq1 bq1Var, d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(-1854833411);
        int i2 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        int i3 = 1;
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = p8.h;
                nv0Var.j0(objO);
            }
            cn1 cn1Var = (cn1) objO;
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
            y02.F(f5.E, nv0Var, cn1Var);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            nc2.p(6, d00Var, nv0Var, true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xh1(bq1Var, d00Var, i, i3);
        }
    }

    public static void d(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static final os1 e(g93 g93Var, nv0 nv0Var) {
        Object value = g93Var.getValue();
        Object obj = li0.f;
        boolean zH = nv0Var.h(obj) | nv0Var.h(g93Var);
        Object objO = nv0Var.O();
        p40 p40Var = null;
        Object obj2 = c20.a;
        if (zH || objO == obj2) {
            objO = new ri2(obj, g93Var, p40Var, 7);
            nv0Var.j0(objO);
        }
        rs0 rs0Var = (rs0) objO;
        Object objO2 = nv0Var.O();
        if (objO2 == obj2) {
            objO2 = w(value);
            nv0Var.j0(objO2);
        }
        os1 os1Var = (os1) objO2;
        boolean zH2 = nv0Var.h(rs0Var);
        Object objO3 = nv0Var.O();
        if (zH2 || objO3 == obj2) {
            objO3 = new j73(rs0Var, os1Var, p40Var, 1);
            nv0Var.j0(objO3);
        }
        rn.m(g93Var, obj, (rs0) objO3, nv0Var);
        return os1Var;
    }

    public static final void g(bx0 bx0Var, uo3 uo3Var) {
        List list = uo3Var.o;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            wo3 wo3Var = (wo3) list.get(i);
            if (wo3Var instanceof yo3) {
                k42 k42Var = new k42();
                yo3 yo3Var = (yo3) wo3Var;
                k42Var.d = yo3Var.g;
                k42Var.n = true;
                k42Var.c();
                k42Var.s.i(yo3Var.h);
                k42Var.c();
                k42Var.c();
                k42Var.b = yo3Var.i;
                k42Var.c();
                k42Var.c = yo3Var.j;
                k42Var.c();
                k42Var.g = yo3Var.k;
                k42Var.c();
                k42Var.e = yo3Var.l;
                k42Var.c();
                k42Var.f = yo3Var.m;
                k42Var.o = true;
                k42Var.c();
                k42Var.h = yo3Var.n;
                k42Var.o = true;
                k42Var.c();
                k42Var.i = yo3Var.o;
                k42Var.o = true;
                k42Var.c();
                k42Var.j = yo3Var.p;
                k42Var.o = true;
                k42Var.c();
                k42Var.k = yo3Var.q;
                k42Var.p = true;
                k42Var.c();
                k42Var.l = yo3Var.r;
                k42Var.p = true;
                k42Var.c();
                k42Var.m = yo3Var.s;
                k42Var.p = true;
                k42Var.c();
                bx0Var.e(i, k42Var);
            } else if (wo3Var instanceof uo3) {
                bx0 bx0Var2 = new bx0();
                uo3 uo3Var2 = (uo3) wo3Var;
                bx0Var2.k = uo3Var2.f;
                bx0Var2.c();
                bx0Var2.l = uo3Var2.g;
                bx0Var2.s = true;
                bx0Var2.c();
                bx0Var2.o = uo3Var2.j;
                bx0Var2.s = true;
                bx0Var2.c();
                bx0Var2.p = uo3Var2.k;
                bx0Var2.s = true;
                bx0Var2.c();
                bx0Var2.q = uo3Var2.l;
                bx0Var2.s = true;
                bx0Var2.c();
                bx0Var2.r = uo3Var2.m;
                bx0Var2.s = true;
                bx0Var2.c();
                bx0Var2.m = uo3Var2.h;
                bx0Var2.s = true;
                bx0Var2.c();
                bx0Var2.n = uo3Var2.i;
                bx0Var2.s = true;
                bx0Var2.c();
                bx0Var2.f = uo3Var2.n;
                bx0Var2.g = true;
                bx0Var2.c();
                g(bx0Var2, uo3Var2);
                bx0Var.e(i, bx0Var2);
            }
        }
    }

    public static final long h(i32 i32Var) {
        return vm1.N(i32Var.l() * i32Var.p()) + (((long) i32Var.k()) * ((long) i32Var.p()));
    }

    public static final qs1 i() {
        pi piVar = i73.b;
        qs1 qs1Var = (qs1) piVar.j();
        if (qs1Var != null) {
            return qs1Var;
        }
        qs1 qs1Var2 = new qs1(new mv0[0]);
        piVar.K(qs1Var2);
        return qs1Var2;
    }

    public static final cb0 j(cs0 cs0Var) {
        pi piVar = i73.a;
        return new cb0(cs0Var, null);
    }

    public static final cb0 k(cs0 cs0Var, h73 h73Var) {
        pi piVar = i73.a;
        return new cb0(cs0Var, h73Var);
    }

    public static final Object l(e70 e70Var, rs0 rs0Var, q40 q40Var) {
        return e70Var.a(new cc2(rs0Var, null, 1), q40Var);
    }

    public static final of1 m(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(2131230924);
            of1 of1Var = tag instanceof of1 ? (of1) tag : null;
            if (of1Var != null) {
                return of1Var;
            }
            Object objU = w22.u(view);
            view = objU instanceof View ? (View) objU : null;
        }
        return null;
    }

    public static final float n(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final w01 o() {
        w01 w01Var = a;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.PhoneAndroid", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(16.0f, 1.0f);
        tx0Var.h(8.0f, 1.0f);
        tx0Var.d(6.34f, 1.0f, 5.0f, 2.34f, 5.0f, 4.0f);
        tx0Var.o(16.0f);
        tx0Var.e(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        tx0Var.g(8.0f);
        tx0Var.e(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        tx0Var.h(19.0f, 4.0f);
        tx0Var.e(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        tx0Var.c();
        tx0Var.j(14.0f, 21.0f);
        tx0Var.g(-4.0f);
        tx0Var.o(-1.0f);
        tx0Var.g(4.0f);
        tx0Var.o(1.0f);
        tx0Var.c();
        tx0Var.j(17.25f, 18.0f);
        tx0Var.h(6.75f, 18.0f);
        tx0Var.h(6.75f, 4.0f);
        tx0Var.g(10.5f);
        tx0Var.o(14.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        a = w01VarB;
        return w01VarB;
    }

    public static final bp2 p(xm1 xm1Var) {
        Object objE = xm1Var.E();
        if (objE instanceof bp2) {
            return (bp2) objE;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x025e A[EDGE_INSN: B:203:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a], EDGE_INSN: B:204:0x025e->B:144:0x025e BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int q(defpackage.ng3 r19, android.text.Layout r20, defpackage.qk r21, int r22, android.graphics.RectF r23, defpackage.lt2 r24, defpackage.u r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b32.q(ng3, android.text.Layout, qk, int, android.graphics.RectF, lt2, u, boolean):int");
    }

    public static final sl2 r(pg3 pg3Var, int i) {
        og3 og3Var = pg3Var.a;
        br1 br1Var = pg3Var.b;
        if (og3Var.a.g.length() != 0) {
            int iD = br1Var.d(i);
            if ((i != 0 && iD == br1Var.d(i - 1)) || (i != og3Var.a.g.length() && iD == br1Var.d(i + 1))) {
                return pg3Var.a(i);
            }
        }
        return pg3Var.h(i);
    }

    public static final float s(bp2 bp2Var) {
        if (bp2Var != null) {
            return bp2Var.a;
        }
        return 0.0f;
    }

    public static boolean t() {
        if (Build.VERSION.SDK_INT >= 29) {
            return oj3.a();
        }
        try {
            if (c == null) {
                b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) c.invoke(null, Long.valueOf(b))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static ov2 u(rs0 rs0Var) {
        ov2 ov2Var = new ov2();
        ov2Var.h = vr.w(ov2Var, ov2Var, rs0Var);
        return ov2Var;
    }

    public static final long v(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : wx.b(wx.d(j) * f, j);
    }

    public static d42 w(Object obj) {
        return new d42(obj, m22.u);
    }

    public static h9 x(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zE0 = fa3.e0(str, "HTTP/1.", false);
        de2 de2Var = de2.HTTP_1_0;
        de2 de2Var2 = de2.HTTP_1_1;
        if (zE0) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                de2Var = de2Var2;
            }
        } else if (fa3.e0(str, "ICY ", false)) {
            i = 4;
        } else {
            if (!fa3.e0(str, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 12;
            de2Var = de2Var2;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        Integer numF0 = fa3.f0(str.substring(i, i2));
        if (numF0 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int iIntValue = numF0.intValue();
        if (str.length() <= i2) {
            strSubstring = "";
        } else {
            if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            strSubstring = str.substring(i + 4);
        }
        return new h9(de2Var, iIntValue, strSubstring);
    }

    public static bq1 y(bq1 bq1Var, na naVar) {
        return bq1Var.d(new cb2(naVar));
    }

    public static final os1 z(Object obj, nv0 nv0Var) {
        Object objO = nv0Var.O();
        if (objO == c20.a) {
            objO = w(obj);
            nv0Var.j0(objO);
        }
        os1 os1Var = (os1) objO;
        os1Var.setValue(obj);
        return os1Var;
    }

    public abstract void f(IOException iOException);
}
