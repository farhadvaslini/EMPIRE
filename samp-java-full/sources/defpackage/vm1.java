package defpackage;

import android.R;
import android.graphics.Matrix;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class vm1 {
    public static final d00 C;
    public static final d00 I;
    public static final d00 L;
    public static final d00 M;
    public static final d00 P;
    public static wn2 Y = null;
    public static final pi Z;
    public static pi a0 = null;
    public static final ai0 b0;
    public static final ai0 c0;
    public static final gj e;
    public static final gj f;
    public static final d00 i;
    public static final d00 j;
    public static final float j0 = 32.0f;
    public static final d00 k;
    public static final d00 l;
    public static final d00 m;
    public static final d00 q;
    public static final d00 r;
    public static final d00 s;
    public static final d00 t;
    public static final d00 x;
    public static final d00 z;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final b23 g = b23.i;
    public static final float h = 1.0f;
    public static final d00 n = new d00(1608193614, new z1(4), false);
    public static final d00 o = new d00(1533481879, new z1(5), false);
    public static final d00 p = new d00(474244306, new z1(6), false);
    public static final d00 u = new d00(-1976187402, new z1(8), false);
    public static final d00 v = new d00(391796877, new z1(9), false);
    public static final d00 w = new d00(-1401938300, new z1(10), false);
    public static final d00 y = new d00(-755173965, new k00(2), false);
    public static final d00 A = new d00(-1979961068, new z1(27), false);
    public static final d00 B = new d00(-50458165, new z1(28), false);
    public static final d00 D = new d00(1416784806, new k00(19), false);
    public static final d00 E = new d00(-1416808625, new k00(20), false);
    public static final d00 F = new d00(1333034006, new k00(21), false);
    public static final d00 G = new d00(708186687, new k00(22), false);
    public static final d00 H = new d00(-1874465290, new k00(23), false);
    public static final d00 J = new d00(394127842, new k00(25), false);
    public static final d00 K = new d00(1855501707, new k00(26), false);
    public static final d00 N = new d00(-1677481974, new x00(16), false);
    public static final d00 O = new d00(1918755379, new x00(17), false);
    public static final Class[] Q = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final gy R = gy.q;
    public static final gy S = gy.m;
    public static final float T = 0.1f;
    public static final gy U = gy.n;
    public static final float V = 0.38f;
    public static final float W = 1.0f;
    public static final gy X = gy.j;
    public static final StackTraceElement[] d0 = new StackTraceElement[0];
    public static final byte[] e0 = {112, 114, 111, 0};
    public static final byte[] f0 = {112, 114, 109, 0};
    public static final gy g0 = gy.r;
    public static final long[] h0 = new long[0];
    public static final nd0 i0 = new nd0();

    static {
        int i2 = 14;
        byte b2 = 0;
        e = new gj(b2);
        int i3 = 1;
        f = new gj(i3);
        int i4 = 3;
        i = new d00(-1731669163, new z1(i4), false);
        int i5 = 12;
        j = new d00(-1447683625, new z1(i5), false);
        int i6 = 15;
        k = new d00(72308380, new wc(i6), false);
        int i7 = 13;
        l = new d00(-1730608993, new z1(i7), false);
        int i8 = 11;
        m = new d00(-1499150870, new wc(i8), false);
        q = new d00(-1088965012, new wc(i5), false);
        r = new d00(-1734414779, new wc(i7), false);
        s = new d00(1865173575, new wc(i2), false);
        int i9 = 7;
        t = new d00(408929959, new z1(i9), false);
        x = new d00(-632646968, new z1(i8), false);
        z = new d00(103369568, new k00(i4), false);
        int i10 = 24;
        C = new d00(-576947991, new p00(i10), false);
        I = new d00(381038519, new k00(i10), false);
        L = new d00(-586361051, new x00(i2), false);
        M = new d00(-2050938098, new x00(i6), false);
        P = new d00(-873838924, new z00(i9, b2), false);
        Object obj = null;
        Z = new pi(obj, obj, obj, i8);
        b0 = new ai0(i3, "NULL");
        c0 = new ai0(i3, "UNINITIALIZED");
    }

    public static bq1 A(bq1 bq1Var, float f2, float f3, float f4, float f5, float f6, long j2, z13 z13Var, boolean z2, long j3, long j4, int i2) {
        return bq1Var.d(new rw0((i2 & 1) != 0 ? 1.0f : f2, (i2 & 2) != 0 ? 1.0f : f3, (i2 & 4) != 0 ? 1.0f : f4, 0.0f, 0.0f, (i2 & 32) != 0 ? 0.0f : f5, 0.0f, 0.0f, (i2 & 256) != 0 ? 0.0f : f6, 8.0f, (i2 & 1024) != 0 ? wj3.b : j2, (i2 & 2048) != 0 ? cl3.q0 : z13Var, (i2 & 4096) != 0 ? false : z2, null, (i2 & 16384) != 0 ? vw0.a : j3, (i2 & 32768) != 0 ? vw0.a : j4, 0, 3, null, wa1.a));
    }

    public static bq1 B(bq1 bq1Var, float f2, float f3, float f4, float f5, z13 z13Var, int i2) {
        float f6 = (i2 & 1) != 0 ? 1.0f : f2;
        float f7 = (i2 & 2) != 0 ? 1.0f : f3;
        float f8 = (i2 & 4) != 0 ? 1.0f : f4;
        float f9 = (i2 & 32) != 0 ? 0.0f : f5;
        long j2 = wj3.b;
        z13 z13Var2 = (i2 & 2048) != 0 ? cl3.q0 : z13Var;
        long j3 = vw0.a;
        return A(bq1Var, f6, f7, f8, f9, 0.0f, j2, z13Var2, false, j3, j3, 524288);
    }

    public static final bq1 C(bq1 bq1Var, ss0 ss0Var) {
        return bq1Var.d(new cb1(ss0Var));
    }

    public static final bq1 D(bq1 bq1Var, ns0 ns0Var) {
        return bq1Var.d(new o30(ns0Var));
    }

    public static final bq1 E(bq1 bq1Var, ns0 ns0Var) {
        return bq1Var.d(new h71(ns0Var, null));
    }

    public static final bq1 F(bq1 bq1Var, ns0 ns0Var) {
        return bq1Var.d(new h71(null, ns0Var));
    }

    public static int[] G(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int iV = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iV += (int) lq.V(byteArrayInputStream, 2);
            iArr[i3] = iV;
        }
        return iArr;
    }

    public static eb0[] H(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, eb0[] eb0VarArr) throws IOException {
        byte[] bArr3 = n92.V;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, n92.W)) {
                c.q("Unsupported meta version");
                return null;
            }
            int iV = (int) lq.V(fileInputStream, 2);
            byte[] bArrU = lq.U(fileInputStream, (int) lq.V(fileInputStream, 4), (int) lq.V(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                c.q("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrU);
            try {
                eb0[] eb0VarArrJ = J(byteArrayInputStream, bArr2, iV, eb0VarArr);
                byteArrayInputStream.close();
                return eb0VarArrJ;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(n92.Q, bArr2)) {
            c.q("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            c.q("Unsupported meta version");
            return null;
        }
        int iV2 = (int) lq.V(fileInputStream, 1);
        byte[] bArrU2 = lq.U(fileInputStream, (int) lq.V(fileInputStream, 4), (int) lq.V(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            c.q("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrU2);
        try {
            eb0[] eb0VarArrI = I(byteArrayInputStream2, iV2, eb0VarArr);
            byteArrayInputStream2.close();
            return eb0VarArrI;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static eb0[] I(ByteArrayInputStream byteArrayInputStream, int i2, eb0[] eb0VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new eb0[0];
        }
        if (i2 != eb0VarArr.length) {
            c.q("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iV = (int) lq.V(byteArrayInputStream, 2);
            iArr[i3] = (int) lq.V(byteArrayInputStream, 2);
            strArr[i3] = new String(lq.S(byteArrayInputStream, iV), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            eb0 eb0Var = eb0VarArr[i4];
            if (!eb0Var.b.equals(strArr[i4])) {
                c.q("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            eb0Var.e = i5;
            eb0Var.h = G(byteArrayInputStream, i5);
        }
        return eb0VarArr;
    }

    public static eb0[] J(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, eb0[] eb0VarArr) throws IOException {
        eb0 eb0Var;
        if (byteArrayInputStream.available() == 0) {
            return new eb0[0];
        }
        if (i2 != eb0VarArr.length) {
            c.q("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            lq.V(byteArrayInputStream, 2);
            String str = new String(lq.S(byteArrayInputStream, (int) lq.V(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jV = lq.V(byteArrayInputStream, 4);
            int iV = (int) lq.V(byteArrayInputStream, 2);
            if (eb0VarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i4 = 0; i4 < eb0VarArr.length; i4++) {
                    if (eb0VarArr[i4].b.equals(strSubstring)) {
                        eb0Var = eb0VarArr[i4];
                        break;
                    }
                }
                eb0Var = null;
            } else {
                eb0Var = null;
            }
            if (eb0Var == null) {
                c.q("Missing profile key: ".concat(str));
                return null;
            }
            eb0Var.d = jV;
            int[] iArrG = G(byteArrayInputStream, iV);
            if (Arrays.equals(bArr, n92.U)) {
                eb0Var.e = iV;
                eb0Var.h = iArrG;
            }
        }
        return eb0VarArr;
    }

    public static eb0[] K(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, n92.R)) {
            c.q("Unsupported version");
            return null;
        }
        int iV = (int) lq.V(fileInputStream, 1);
        byte[] bArrU = lq.U(fileInputStream, (int) lq.V(fileInputStream, 4), (int) lq.V(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            c.q("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrU);
        try {
            eb0[] eb0VarArrL = L(byteArrayInputStream, str, iV);
            byteArrayInputStream.close();
            return eb0VarArrL;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static eb0[] L(ByteArrayInputStream byteArrayInputStream, String str, int i2) throws IOException {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new eb0[0];
        }
        eb0[] eb0VarArr = new eb0[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int iV = (int) lq.V(byteArrayInputStream, 2);
            int iV2 = (int) lq.V(byteArrayInputStream, 2);
            eb0VarArr[i4] = new eb0(str, new String(lq.S(byteArrayInputStream, iV), StandardCharsets.UTF_8), lq.V(byteArrayInputStream, 4), iV2, (int) lq.V(byteArrayInputStream, 4), (int) lq.V(byteArrayInputStream, 4), new int[iV2], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            eb0 eb0Var = eb0VarArr[i5];
            int iAvailable = byteArrayInputStream.available();
            int i6 = eb0Var.f;
            int i7 = eb0Var.g;
            TreeMap treeMap = eb0Var.i;
            int i8 = iAvailable - i6;
            int iV3 = i3;
            while (byteArrayInputStream.available() > i8) {
                iV3 += (int) lq.V(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iV3), 1);
                int iV4 = (int) lq.V(byteArrayInputStream, 2);
                while (iV4 > 0) {
                    lq.V(byteArrayInputStream, 2);
                    int iV5 = (int) lq.V(byteArrayInputStream, 1);
                    if (iV5 != 6 && iV5 != 7) {
                        while (iV5 > 0) {
                            lq.V(byteArrayInputStream, 1);
                            int i9 = i3;
                            int i10 = i5;
                            for (int iV6 = (int) lq.V(byteArrayInputStream, 1); iV6 > 0; iV6--) {
                                lq.V(byteArrayInputStream, 2);
                            }
                            iV5--;
                            i3 = i9;
                            i5 = i10;
                        }
                    }
                    iV4--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i11 = i3;
            int i12 = i5;
            if (byteArrayInputStream.available() != i8) {
                c.q("Read too much data during profile line parse");
                return null;
            }
            eb0Var.h = G(byteArrayInputStream, eb0Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(lq.S(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i7; i13++) {
                int i14 = bitSetValueOf.get(i13) ? 2 : i11;
                if (bitSetValueOf.get(i13 + i7)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | numValueOf.intValue()));
                }
            }
            i5 = i12 + 1;
            i3 = i11;
        }
        return eb0VarArr;
    }

    public static int M(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        c.p("Cannot round NaN value.");
        return 0;
    }

    public static long N(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        c.p("Cannot round NaN value.");
        return 0L;
    }

    public static final void O(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void P(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final bq1 Q(boolean z2, boolean z3, cs0 cs0Var) {
        bq1 ka3Var = yp1.a;
        if (!z2 || !ja3.a) {
            return ka3Var;
        }
        if (z3) {
            ka3Var = new ka3(i0);
        }
        return ka3Var.d(new ha3(cs0Var));
    }

    public static final ti0 R(gk3 gk3Var, ns0 ns0Var, Object obj, nv0 nv0Var) {
        nv0Var.Y(-422486566, gk3Var);
        boolean zG = gk3Var.g();
        u10 u10Var = gk3Var.a;
        ti0 ti0Var = ti0.h;
        ti0 ti0Var2 = ti0.g;
        ti0 ti0Var3 = ti0.f;
        if (zG) {
            nv0Var.a0(-212166497);
            nv0Var.p(false);
            if (((Boolean) ns0Var.h(obj)).booleanValue()) {
                ti0Var = ti0Var2;
            } else if (!((Boolean) ns0Var.h(u10Var.h())).booleanValue()) {
                ti0Var = ti0Var3;
            }
        } else {
            nv0Var.a0(-211886815);
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = b32.w(Boolean.FALSE);
                nv0Var.j0(objO);
            }
            os1 os1Var = (os1) objO;
            Object value = gk3Var.e.getValue();
            if (((Boolean) ns0Var.h(u10Var.h())).booleanValue() || (value != null && ((Boolean) ns0Var.h(value)).booleanValue())) {
                os1Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) ns0Var.h(obj)).booleanValue()) {
                ti0Var = ti0Var2;
            } else if ((value != null && ((Boolean) ns0Var.h(value)).booleanValue()) || !((Boolean) os1Var.getValue()).booleanValue()) {
                ti0Var = ti0Var3;
            }
            nv0Var.p(false);
        }
        nv0Var.p(false);
        return ti0Var;
    }

    public static final bq1 S(bq1 bq1Var, ar2 ar2Var, r70 r70Var, nf3 nf3Var, b50 b50Var) {
        return bq1Var.d(new le3(ar2Var, r70Var, nf3Var, b50Var));
    }

    /* JADX WARN: Finally extract failed */
    public static boolean T(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, eb0[] eb0VarArr) throws IOException {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = n92.U;
        byte[] bArr3 = n92.T;
        byte[] bArr4 = n92.Q;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = n92.R;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrU = u(eb0VarArr, bArr5);
                lq.d0(byteArrayOutputStream, eb0VarArr.length, 1);
                lq.d0(byteArrayOutputStream, bArrU.length, 4);
                byte[] bArrO = lq.o(bArrU);
                lq.d0(byteArrayOutputStream, bArrO.length, 4);
                byteArrayOutputStream.write(bArrO);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                lq.d0(byteArrayOutputStream, eb0VarArr.length, 1);
                for (eb0 eb0Var : eb0VarArr) {
                    int size = eb0Var.i.size() * 4;
                    String strW = w(eb0Var.a, eb0Var.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    lq.e0(byteArrayOutputStream, strW.getBytes(charset).length);
                    lq.e0(byteArrayOutputStream, eb0Var.h.length);
                    lq.d0(byteArrayOutputStream, size, 4);
                    lq.d0(byteArrayOutputStream, eb0Var.c, 4);
                    byteArrayOutputStream.write(strW.getBytes(charset));
                    Iterator it = eb0Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        lq.e0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        lq.e0(byteArrayOutputStream, 0);
                    }
                    for (int i4 : eb0Var.h) {
                        lq.e0(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = n92.S;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrU2 = u(eb0VarArr, bArr6);
                lq.d0(byteArrayOutputStream, eb0VarArr.length, 1);
                lq.d0(byteArrayOutputStream, bArrU2.length, 4);
                byte[] bArrO2 = lq.o(bArrU2);
                lq.d0(byteArrayOutputStream, bArrO2.length, 4);
                byteArrayOutputStream.write(bArrO2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            lq.e0(byteArrayOutputStream, eb0VarArr.length);
            for (eb0 eb0Var2 : eb0VarArr) {
                String str = eb0Var2.a;
                TreeMap treeMap = eb0Var2.i;
                String strW2 = w(str, eb0Var2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                lq.e0(byteArrayOutputStream, strW2.getBytes(charset2).length);
                lq.e0(byteArrayOutputStream, treeMap.size());
                lq.e0(byteArrayOutputStream, eb0Var2.h.length);
                lq.d0(byteArrayOutputStream, eb0Var2.c, 4);
                byteArrayOutputStream.write(strW2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    lq.e0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : eb0Var2.h) {
                    lq.e0(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            lq.e0(byteArrayOutputStream2, eb0VarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (eb0 eb0Var3 : eb0VarArr) {
                lq.d0(byteArrayOutputStream2, eb0Var3.c, 4);
                lq.d0(byteArrayOutputStream2, eb0Var3.d, 4);
                lq.d0(byteArrayOutputStream2, eb0Var3.g, 4);
                String strW3 = w(eb0Var3.a, eb0Var3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strW3.getBytes(charset3).length;
                lq.e0(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(strW3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            xu3 xu3Var = new xu3(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(xu3Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < eb0VarArr.length) {
                try {
                    eb0 eb0Var4 = eb0VarArr[i8];
                    lq.e0(byteArrayOutputStream3, i8);
                    lq.e0(byteArrayOutputStream3, eb0Var4.e);
                    i9 = i9 + 4 + (eb0Var4.e * i6);
                    int[] iArr = eb0Var4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        lq.e0(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            xu3 xu3Var2 = new xu3(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(xu3Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < eb0VarArr.length; i14++) {
                try {
                    eb0 eb0Var5 = eb0VarArr[i14];
                    Iterator it3 = eb0Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        X(byteArrayOutputStream4, iIntValue, eb0Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            Y(byteArrayOutputStream4, eb0Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            lq.e0(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i13 + 6;
                            lq.d0(byteArrayOutputStream3, length4, 4);
                            lq.e0(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i15 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            xu3 xu3Var3 = new xu3(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(xu3Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            lq.d0(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                xu3 xu3Var4 = (xu3) arrayList.get(i16);
                int i17 = xu3Var4.a;
                byte[] bArr7 = xu3Var4.b;
                if (i17 != 1) {
                    i2 = i12;
                    if (i17 == i2) {
                        j2 = 1;
                    } else if (i17 == 3) {
                        j2 = 2;
                    } else if (i17 == 4) {
                        j2 = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                lq.d0(byteArrayOutputStream, j2, 4);
                lq.d0(byteArrayOutputStream, size2, 4);
                if (xu3Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrO3 = lq.o(bArr7);
                    arrayList2.add(bArrO3);
                    lq.d0(byteArrayOutputStream, bArrO3.length, 4);
                    lq.d0(byteArrayOutputStream, length5, 4);
                    length = bArrO3.length;
                } else {
                    arrayList2.add(bArr7);
                    lq.d0(byteArrayOutputStream, bArr7.length, 4);
                    lq.d0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i16++;
                i12 = i2;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static final bq1 U(bq1 bq1Var, js3 js3Var) {
        return bq1Var.d(new m31(js3Var));
    }

    public static void V(ByteArrayOutputStream byteArrayOutputStream, eb0 eb0Var) throws IOException {
        Y(byteArrayOutputStream, eb0Var);
        int i2 = eb0Var.g;
        int[] iArr = eb0Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            lq.e0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : eb0Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i6 = iIntValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i7 = iIntValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void W(ByteArrayOutputStream byteArrayOutputStream, eb0 eb0Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        lq.e0(byteArrayOutputStream, str.getBytes(charset).length);
        lq.e0(byteArrayOutputStream, eb0Var.e);
        lq.d0(byteArrayOutputStream, eb0Var.f, 4);
        lq.d0(byteArrayOutputStream, eb0Var.c, 4);
        lq.d0(byteArrayOutputStream, eb0Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, int i2, eb0 eb0Var) throws IOException {
        int i3 = eb0Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : eb0Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & iIntValue2) == i5) {
                        int i6 = (i4 * i3) + iIntValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Y(ByteArrayOutputStream byteArrayOutputStream, eb0 eb0Var) throws IOException {
        int i2 = 0;
        for (Map.Entry entry : eb0Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                lq.e0(byteArrayOutputStream, iIntValue - i2);
                lq.e0(byteArrayOutputStream, 0);
                i2 = iIntValue;
            }
        }
    }

    public static final void a(gk3 gk3Var, ns0 ns0Var, bq1 bq1Var, ij0 ij0Var, ek0 ek0Var, rs0 rs0Var, d00 d00Var, nv0 nv0Var, int i2) {
        int i3;
        d42 d42Var;
        u10 u10Var;
        boolean z2;
        ti0 ti0VarR;
        nv0Var.b0(-1310802509);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.f(gk3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= nv0Var.f(ij0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= nv0Var.f(ek0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= nv0Var.h(rs0Var) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i4 |= nv0Var.h(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= nv0Var.h(d00Var) ? 67108864 : 33554432;
        }
        int i5 = i4;
        int i6 = 0;
        if (nv0Var.R(i5 & 1, (i5 & 38347923) != 38347922)) {
            d42 d42Var2 = gk3Var.e;
            d42 d42Var3 = gk3Var.d;
            u10 u10Var2 = gk3Var.a;
            Object value = d42Var2.getValue();
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = b32.w(Boolean.FALSE);
                nv0Var.j0(objO);
            }
            os1 os1Var = (os1) objO;
            Object objO2 = nv0Var.O();
            if (objO2 == obj) {
                objO2 = new be(i6, os1Var);
                nv0Var.j0(objO2);
            }
            int i7 = i5 & 14;
            int i8 = i7 | 48;
            dj0.a(gk3Var, (cs0) objO2, nv0Var, i8);
            if (value != null && ((Boolean) ns0Var.h(value)).booleanValue()) {
                os1Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) ns0Var.h(d42Var3.getValue())).booleanValue() || ((Boolean) ns0Var.h(u10Var2.h())).booleanValue() || ((value != null && ((Boolean) ns0Var.h(value)).booleanValue()) || ((((Boolean) os1Var.getValue()).booleanValue() && !s51.n(u10Var2.h(), d42Var3.getValue())) || gk3Var.g() || gk3Var.d()))) {
                nv0Var.a0(-273709037);
                int i9 = i8 & 14;
                boolean z3 = ((i9 ^ 6) > 4 && nv0Var.f(gk3Var)) || (i8 & 6) == 4;
                Object objO3 = nv0Var.O();
                if (z3 || objO3 == obj) {
                    objO3 = u10Var2.h();
                    nv0Var.j0(objO3);
                }
                if (gk3Var.g()) {
                    objO3 = u10Var2.h();
                }
                nv0Var.a0(2016262395);
                ti0 ti0VarR2 = R(gk3Var, ns0Var, objO3, nv0Var);
                nv0Var.p(false);
                Object value2 = d42Var3.getValue();
                nv0Var.a0(2016262395);
                ti0 ti0VarR3 = R(gk3Var, ns0Var, value2, nv0Var);
                nv0Var.p(false);
                gk3 gk3VarF = w7.F(gk3Var, ti0VarR2, ti0VarR3, "EnterExitTransition", nv0Var, i9 | 3072);
                if (gk3Var.g()) {
                    nv0Var.a0(782538635);
                    nv0Var.p(false);
                } else {
                    nv0Var.a0(782386797);
                    Object value3 = gk3Var.e.getValue();
                    if (value3 == null) {
                        nv0Var.a0(782437481);
                        nv0Var.p(false);
                        ti0VarR = null;
                    } else {
                        nv0Var.a0(782437482);
                        nv0Var.a0(2016262395);
                        ti0VarR = R(gk3Var, ns0Var, value3, nv0Var);
                        nv0Var.p(false);
                        nv0Var.p(false);
                    }
                    gk3VarF.q(ti0VarR);
                    nv0Var.p(false);
                }
                ij0 ij0VarM = dj0.m(gk3VarF, ij0Var, nv0Var, (i5 >> 6) & 112);
                d42 d42Var4 = gk3VarF.d;
                u10 u10Var3 = gk3VarF.a;
                ek0 ek0VarN = dj0.n(gk3VarF, ek0Var, nv0Var, (i5 >> 9) & 112);
                Object objZ = b32.z(rs0Var, nv0Var);
                Object objF = rs0Var.f(u10Var3.h(), d42Var4.getValue());
                boolean zF = nv0Var.f(gk3VarF) | nv0Var.f(objZ);
                Object objO4 = nv0Var.O();
                if (zF || objO4 == obj) {
                    d42Var = d42Var4;
                    objO4 = new l(gk3VarF, objZ, null, 5);
                    nv0Var.j0(objO4);
                } else {
                    d42Var = d42Var4;
                }
                rs0 rs0Var2 = (rs0) objO4;
                Object objO5 = nv0Var.O();
                if (objO5 == obj) {
                    objO5 = b32.w(objF);
                    nv0Var.j0(objO5);
                }
                os1 os1Var2 = (os1) objO5;
                boolean zH = nv0Var.h(rs0Var2);
                Object objO6 = nv0Var.O();
                if (zH || objO6 == obj) {
                    u10Var = u10Var3;
                    objO6 = new j73(rs0Var2, os1Var2, null, 0);
                    nv0Var.j0(objO6);
                } else {
                    u10Var = u10Var3;
                }
                rn.l((rs0) objO6, nv0Var, dm3.a);
                Object objH = u10Var.h();
                ti0 ti0Var = ti0.h;
                if (objH == ti0Var && d42Var.getValue() == ti0Var && ((Boolean) os1Var2.getValue()).booleanValue()) {
                    nv0Var.a0(-270520625);
                    z2 = false;
                    nv0Var.p(false);
                } else {
                    z2 = false;
                    nv0Var.a0(-272022668);
                    boolean z4 = i7 == 4;
                    Object objO7 = nv0Var.O();
                    if (z4 || objO7 == obj) {
                        objO7 = new ie(gk3VarF);
                        nv0Var.j0(objO7);
                    }
                    ie ieVar = (ie) objO7;
                    ieVar.c.getClass();
                    bq1 bq1VarB = dj0.b(gk3VarF, ij0VarM, ek0VarN, null, ieVar.c, "Built-in", nv0Var, 1575936, 8);
                    nv0Var.a0(-1255657861);
                    nv0Var.p(false);
                    bq1 bq1VarD = bq1Var.d(bq1VarB.d(yp1.a));
                    Object objO8 = nv0Var.O();
                    if (objO8 == obj) {
                        objO8 = new ae(ieVar);
                        nv0Var.j0(objO8);
                    }
                    ae aeVar = (ae) objO8;
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, bq1VarD);
                    w10.c.getClass();
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(tb1.Y);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(f5.E, nv0Var, aeVar);
                    y02.F(f5.D, nv0Var, n52VarL);
                    y02.v(nv0Var, Integer.valueOf(iHashCode));
                    y02.C(nv0Var);
                    y02.F(f5.C, nv0Var, bq1VarM);
                    d00Var.e(ieVar, nv0Var, Integer.valueOf((i5 >> 21) & 112));
                    nv0Var.p(true);
                    nv0Var.p(false);
                }
                nv0Var.p(z2);
            } else {
                nv0Var.a0(-270514673);
                nv0Var.p(false);
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new jd(gk3Var, ns0Var, bq1Var, ij0Var, ek0Var, rs0Var, d00Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ry ryVar, boolean z2, bq1 bq1Var, ij0 ij0Var, ek0 ek0Var, String str, d00 d00Var, nv0 nv0Var, int i2, int i3) {
        int i4;
        ij0 ij0Var2;
        ek0 ek0Var2;
        String str2;
        d00 d00Var2;
        bq1 bq1Var2;
        String str3;
        xj2 xj2VarT;
        nv0Var.b0(1799879339);
        if ((i2 & 48) == 0) {
            i4 = (nv0Var.g(z2) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            ij0Var2 = ij0Var;
            i4 |= nv0Var.f(ij0Var2) ? 2048 : 1024;
        } else {
            ij0Var2 = ij0Var;
        }
        if ((i2 & 24576) == 0) {
            ek0Var2 = ek0Var;
            i4 |= nv0Var.f(ek0Var2) ? 16384 : 8192;
        } else {
            ek0Var2 = ek0Var;
        }
        int i6 = i3 & 16;
        if (i6 == 0) {
            if ((196608 & i2) == 0) {
                str2 = str;
                i4 |= nv0Var.f(str2) ? 131072 : 65536;
            }
            if ((1572864 & i2) != 0) {
                d00Var2 = d00Var;
                i4 |= nv0Var.h(d00Var2) ? 1048576 : 524288;
            } else {
                d00Var2 = d00Var;
            }
            if (nv0Var.R(i4 & 1, (599185 & i4) == 599184)) {
                nv0Var.U();
                bq1Var2 = bq1Var;
                str3 = str2;
            } else {
                bq1 bq1Var3 = i5 != 0 ? yp1.a : bq1Var;
                String str4 = i6 != 0 ? "AnimatedVisibility" : str2;
                gk3 gk3VarD0 = w7.d0(Boolean.valueOf(z2), str4, nv0Var, ((i4 >> 3) & 14) | ((i4 >> 12) & 112), 0);
                Object objO = nv0Var.O();
                if (objO == c20.a) {
                    objO = hd.l;
                    nv0Var.j0(objO);
                }
                e(gk3VarD0, (ns0) objO, bq1Var3, ij0Var2, ek0Var2, d00Var2, nv0Var, (i4 & 896) | 48 | (i4 & 7168) | (57344 & i4) | (i4 & 3670016));
                bq1Var2 = bq1Var3;
                str3 = str4;
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT == null) {
                xj2VarT.d = new ee(ryVar, z2, bq1Var2, ij0Var, ek0Var, str3, d00Var, i2, i3);
                return;
            }
            return;
        }
        i4 |= 196608;
        str2 = str;
        if ((1572864 & i2) != 0) {
        }
        if (nv0Var.R(i4 & 1, (599185 & i4) == 599184)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT == null) {
        }
    }

    public static final void c(boolean z2, bq1 bq1Var, ij0 ij0Var, ek0 ek0Var, String str, d00 d00Var, nv0 nv0Var, int i2, int i3) {
        int i4;
        bq1 bq1Var2;
        String str2;
        nv0Var.b0(-1448730565);
        if ((i2 & 6) == 0) {
            i4 = (nv0Var.g(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= nv0Var.f(ij0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= nv0Var.f(ek0Var) ? 2048 : 1024;
        }
        int i6 = i4 | 24576;
        if ((196608 & i2) == 0) {
            i6 |= nv0Var.h(d00Var) ? 131072 : 65536;
        }
        if (nv0Var.R(i6 & 1, (74899 & i6) != 74898)) {
            if (i5 != 0) {
                bq1Var = yp1.a;
            }
            bq1Var2 = bq1Var;
            gk3 gk3VarD0 = w7.d0(Boolean.valueOf(z2), "AnimatedVisibility", nv0Var, (i6 & 14) | ((i6 >> 9) & 112), 0);
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = hd.j;
                nv0Var.j0(objO);
            }
            int i7 = i6 << 3;
            e(gk3VarD0, (ns0) objO, bq1Var2, ij0Var, ek0Var, d00Var, nv0Var, (i7 & 896) | 48 | (i7 & 7168) | (57344 & i7) | (i7 & 3670016));
            str2 = "AnimatedVisibility";
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            str2 = str;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ce(z2, bq1Var2, ij0Var, ek0Var, str2, d00Var, i2, i3);
        }
    }

    public static final void d(boolean z2, bq1 bq1Var, ij0 ij0Var, ek0 ek0Var, String str, nv0 nv0Var, int i2) {
        bq1 bq1Var2;
        ij0 ij0Var2;
        ek0 ek0Var2;
        String str2;
        d00 d00Var = gv3.o;
        nv0Var.b0(234057107);
        int i3 = i2 | (nv0Var.g(z2) ? 32 : 16) | 224640;
        if (nv0Var.R(i3 & 1, (599185 & i3) != 599184)) {
            ij0 ij0VarA = dj0.f(null, 3).a(dj0.c(null, null, 15));
            ek0 ek0VarA = dj0.g(null, 3).a(dj0.h(null, null, 15));
            gk3 gk3VarD0 = w7.d0(Boolean.valueOf(z2), "AnimatedVisibility", nv0Var, ((i3 >> 3) & 14) | 48, 0);
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = hd.k;
                nv0Var.j0(objO);
            }
            ns0 ns0Var = (ns0) objO;
            bq1Var2 = yp1.a;
            e(gk3VarD0, ns0Var, bq1Var2, ij0VarA, ek0VarA, d00Var, nv0Var, 1600944);
            ek0Var2 = ek0VarA;
            str2 = "AnimatedVisibility";
            ij0Var2 = ij0VarA;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            ij0Var2 = ij0Var;
            ek0Var2 = ek0Var;
            str2 = str;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new de(z2, bq1Var2, ij0Var2, ek0Var2, str2, i2);
        }
    }

    public static final void e(gk3 gk3Var, ns0 ns0Var, bq1 bq1Var, ij0 ij0Var, ek0 ek0Var, d00 d00Var, nv0 nv0Var, int i2) {
        int i3;
        ij0 ij0Var2;
        ek0 ek0Var2;
        d00 d00Var2;
        nv0Var.b0(-497872534);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.f(gk3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.h(ns0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            ij0Var2 = ij0Var;
            i3 |= nv0Var.f(ij0Var2) ? 2048 : 1024;
        } else {
            ij0Var2 = ij0Var;
        }
        if ((i2 & 24576) == 0) {
            ek0Var2 = ek0Var;
            i3 |= nv0Var.f(ek0Var2) ? 16384 : 8192;
        } else {
            ek0Var2 = ek0Var;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            d00Var2 = d00Var;
            i4 |= nv0Var.h(d00Var2) ? 1048576 : 524288;
        } else {
            d00Var2 = d00Var;
        }
        if (nv0Var.R(i4 & 1, (599187 & i4) != 599186)) {
            int i5 = i4 & 112;
            int i6 = i4 & 14;
            boolean z2 = (i5 == 32) | (i6 == 4);
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (z2 || objO == zjVar) {
                objO = new ge(ns0Var, gk3Var);
                nv0Var.j0(objO);
            }
            bq1 bq1VarC = C(bq1Var, (ss0) objO);
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar) {
                objO2 = pd.i;
                nv0Var.j0(objO2);
            }
            int i7 = 196608 | i6 | i5 | (i4 & 7168) | (57344 & i4);
            int i8 = i4 << 6;
            a(gk3Var, ns0Var, bq1VarC, ij0Var2, ek0Var2, (rs0) objO2, d00Var2, nv0Var, i7 | (29360128 & i8) | (i8 & 234881024));
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new id(gk3Var, ns0Var, bq1Var, ij0Var, ek0Var, d00Var, i2);
        }
    }

    public static final void f(ub2 ub2Var, d00 d00Var, jj3 jj3Var, d00 d00Var2, nv0 nv0Var, int i2) {
        ub2 ub2Var2;
        int i3;
        os1 os1Var;
        nv0Var.b0(-1221877520);
        if ((i2 & 6) == 0) {
            ub2Var2 = ub2Var;
            i3 = (nv0Var.f(ub2Var2) ? 4 : 2) | i2;
        } else {
            ub2Var2 = ub2Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.h(d00Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? nv0Var.f(jj3Var) : nv0Var.h(jj3Var) ? 256 : 128;
        }
        int i4 = i2 & 3072;
        yp1 yp1Var = yp1.a;
        if (i4 == 0) {
            i3 |= nv0Var.f(yp1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= nv0Var.h(null) ? 16384 : 8192;
        }
        boolean z2 = false;
        if ((i2 & 196608) == 0) {
            i3 |= nv0Var.g(false) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= nv0Var.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= nv0Var.g(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= nv0Var.h(d00Var2) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (nv0Var.R(i5 & 1, (38347923 & i5) != 38347922)) {
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = rn.A(nv0Var);
                nv0Var.j0(objO);
            }
            x50 x50Var = (x50) objO;
            Object objO2 = nv0Var.O();
            if (objO2 == obj) {
                objO2 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO2);
            }
            os1 os1Var2 = (os1) objO2;
            cn1 cn1VarD = eo.d(f5.g, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, yp1Var);
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
            if (jj3Var.b()) {
                nv0Var.a0(-1891243071);
                os1Var = os1Var2;
                o(ub2Var2, jj3Var, x50Var, false, os1Var, d00Var, nv0Var, (i5 & 14) | 196608 | ((i5 >> 3) & 112) | ((i5 >> 6) & 896) | ((i5 << 15) & 3670016));
                nv0Var.p(false);
            } else {
                os1Var = os1Var2;
                nv0Var.a0(-1890863476);
                nv0Var.p(false);
            }
            p(jj3Var, os1Var, d00Var2, nv0Var, ((i5 >> 18) & 14) | 384 | ((i5 >> 3) & 112) | ((i5 >> 12) & 7168) | (57344 & (i5 << 3)) | ((i5 >> 9) & 458752));
            nv0Var.p(true);
            if ((i5 & 896) == 256 || ((i5 & 512) != 0 && nv0Var.h(jj3Var))) {
                z2 = true;
            }
            Object objO3 = nv0Var.O();
            if (z2 || objO3 == obj) {
                objO3 = new s(11, jj3Var);
                nv0Var.j0(objO3);
            }
            rn.g(jj3Var, (ns0) objO3, nv0Var);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new v4(ub2Var, d00Var, jj3Var, d00Var2, i2);
        }
    }

    public static final void g(final boolean z2, final boolean z3, final cs0 cs0Var, final cs0 cs0Var2, final cs0 cs0Var3, final cs0 cs0Var4, final ns0 ns0Var, final List list, final lf2 lf2Var, final String str, final ns0 ns0Var2, final cs0 cs0Var5, final String str2, final ns0 ns0Var3, final cs0 cs0Var6, final boolean z4, final boolean z5, final cs0 cs0Var7, nv0 nv0Var, final int i2) {
        nv0Var.b0(2104841430);
        int i3 = i2 | (nv0Var.g(z2) ? 4 : 2) | (nv0Var.g(z3) ? 32 : 16) | (nv0Var.h(ns0Var) ? 1048576 : 524288) | (nv0Var.f(list) ? 8388608 : 4194304) | (nv0Var.h(lf2Var) ? 67108864 : 33554432) | (nv0Var.f(str) ? 536870912 : 268435456);
        if (nv0Var.R(i3 & 1, ((i3 & 306783379) == 306783378 && (((((((('0' | (nv0Var.h(ns0Var2) ? (char) 4 : (char) 2)) | (nv0Var.f(str2) ? 256 : 128)) | (nv0Var.h(ns0Var3) ? 2048 : 1024)) | (nv0Var.h(cs0Var6) ? 16384 : 8192)) | (nv0Var.g(z4) ? 131072 : 65536)) | (nv0Var.g(z5) ? 1048576 : 524288)) | (nv0Var.h(cs0Var7) ? (char) 0 : (char) 0)) & 4793491) == 4793490) ? false : true)) {
            qy qyVarA = oy.a(n92.d, f5.s, nv0Var, 0);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            yp1 yp1Var = yp1.a;
            bq1 bq1VarM = lr.M(nv0Var, yp1Var);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, qyVarA);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            gq.f(f80.K(j43.c(yp1Var, 1.0f), 8.0f, 4.0f), new jj(8.0f, true, new c(2)), new jj(4.0f, true, new c(1)), null, 3, 0, gq.N(870512113, new u81(cs0Var2, cs0Var, z5, oz2.N(top.th1nk.samp.R.string.raksamp_bottom_afk, new Object[]{oz2.M(z5 ? top.th1nk.samp.R.string.raksamp_afk_on : top.th1nk.samp.R.string.raksamp_afk_off, nv0Var)}, nv0Var), cs0Var7, 3), nv0Var), nv0Var, 1597878, 40);
            hb3.a(null, null, 0L, 0L, 0.0f, 8.0f, null, gq.N(-858428761, new fw(str2, ns0Var3, cs0Var6, z4), nv0Var), nv0Var, 12779520, 95);
            nv0Var.p(true);
            if (z2) {
                nv0Var.a0(-1189299959);
                rn.a(cs0Var3, n92.n, null, gq.N(326160999, new k91(cs0Var3, 4), nv0Var), null, n92.p, gq.N(726921732, new u(25, ns0Var), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, 1772598, 16276);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-1188805044);
                nv0Var.p(false);
            }
            if (z3) {
                nv0Var.a0(-1188752871);
                rn.a(cs0Var4, n92.q, null, gq.N(1848114718, new k91(cs0Var4, 5), nv0Var), null, n92.s, gq.N(432122491, new r81(list, lf2Var, str, ns0Var2, cs0Var5, 7), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, 1772598, 16276);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-1188058068);
                nv0Var.p(false);
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(z2, z3, cs0Var, cs0Var2, cs0Var3, cs0Var4, ns0Var, list, lf2Var, str, ns0Var2, cs0Var5, str2, ns0Var3, cs0Var6, z4, z5, cs0Var7, i2) { // from class: hi2
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ cs0 h;
                public final /* synthetic */ cs0 i;
                public final /* synthetic */ cs0 j;
                public final /* synthetic */ cs0 k;
                public final /* synthetic */ ns0 l;
                public final /* synthetic */ List m;
                public final /* synthetic */ lf2 n;
                public final /* synthetic */ String o;
                public final /* synthetic */ ns0 p;
                public final /* synthetic */ cs0 q;
                public final /* synthetic */ String r;
                public final /* synthetic */ ns0 s;
                public final /* synthetic */ cs0 t;
                public final /* synthetic */ boolean u;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ cs0 w;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(224641);
                    vm1.g(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void h(int i2, cs0 cs0Var, cs0 cs0Var2, ns0 ns0Var, nv0 nv0Var, String str) {
        nv0Var.b0(162102829);
        int i3 = i2 | (nv0Var.f(str) ? 4 : 2) | (nv0Var.h(ns0Var) ? 256 : 128) | (nv0Var.h(cs0Var2) ? 2048 : 1024);
        int i4 = 0;
        if (nv0Var.R(i3 & 1, (i3 & 1171) != 1170)) {
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = b32.w(str);
                nv0Var.j0(objO);
            }
            os1 os1Var = (os1) objO;
            rn.a(cs0Var, gq.N(1515909749, new zh2(ns0Var, os1Var, i4), nv0Var), null, gq.N(-271960073, new ai2(cs0Var2, cs0Var, i4), nv0Var), null, n92.y, gq.N(1341202490, new l8(os1Var, 12), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, 1772598, 16276);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ul(str, cs0Var, ns0Var, cs0Var2, i2, 10);
        }
    }

    public static final void i(final w01 w01Var, final String str, final cs0 cs0Var, bq1 bq1Var, boolean z2, nv0 nv0Var, final int i2, final int i3) {
        boolean z3;
        int i4;
        final bq1 bq1Var2;
        long j2;
        nv0Var.b0(-1423757465);
        int i5 = i2 | (nv0Var.f(w01Var) ? 4 : 2) | (nv0Var.f(str) ? 32 : 16) | (nv0Var.h(cs0Var) ? 256 : 128);
        int i6 = i5 | 3072;
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 = i5 | 27648;
            z3 = z2;
        } else {
            z3 = z2;
            i4 = i6 | (nv0Var.g(z3) ? 16384 : 8192);
        }
        byte b2 = 0;
        if (nv0Var.R(i4 & 1, (i4 & 9363) != 9362)) {
            if (i7 != 0) {
                z3 = false;
            }
            yp1 yp1Var = yp1.a;
            bq1 bq1VarG = j43.g(yp1Var, 48.0f, 0.0f, 2);
            if (z3) {
                nv0Var.a0(1939124815);
                j2 = ((fy) nv0Var.j(hy.a)).h;
                nv0Var.p(false);
            } else {
                nv0Var.a0(1939206221);
                nv0Var.p(false);
                j2 = wx.f;
            }
            long j3 = wx.g;
            st stVarX = x((fy) nv0Var.j(hy.a));
            if (j2 == 16) {
                j2 = stVarX.a;
            }
            long j4 = j2;
            long j5 = j3 != 16 ? j3 : stVarX.b;
            long j6 = j3 != 16 ? j3 : stVarX.c;
            long j7 = j3 != 16 ? j3 : stVarX.d;
            long j8 = j3 != 16 ? j3 : stVarX.e;
            long j9 = j3 != 16 ? j3 : stVarX.f;
            long j10 = j3 != 16 ? j3 : stVarX.g;
            if (j3 == 16) {
                j3 = stVarX.h;
            }
            gu.b(cs0Var, gq.N(-1920394972, new z71(str, 10, b2), nv0Var), bq1VarG, false, gq.N(921105857, new u(26, w01Var), nv0Var), null, new st(j4, j5, j6, j7, j8, j9, j10, j3), null, null, nv0Var, ((i4 >> 6) & 14) | 24624, 1896);
            bq1Var2 = yp1Var;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
        }
        final boolean z4 = z3;
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(str, cs0Var, bq1Var2, z4, i2, i3) { // from class: ii2
                public final /* synthetic */ String g;
                public final /* synthetic */ cs0 h;
                public final /* synthetic */ bq1 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ int k;

                {
                    this.k = i3;
                }

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1);
                    vm1.i(this.f, this.g, this.h, this.i, this.j, (nv0) obj, iY, this.k);
                    return dm3.a;
                }
            };
        }
    }

    public static final void j(cs0 cs0Var, bq1 bq1Var, nv0 nv0Var, int i2) {
        int i3;
        nv0Var.b0(512328650);
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.h(cs0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        int i4 = 1;
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            bq1 bq1VarD = bq1Var.d(j43.c);
            cn1 cn1VarD = eo.d(f5.k, false);
            int iHashCode = Long.hashCode(nv0Var.T);
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
            y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            lq.g(f80.J(j43.q(yp1.a, 0.0f, 400.0f, 1), 24.0f), uo2.a(24.0f), gq.q(((fy) nv0Var.j(hy.a)).p, nv0Var), null, null, gq.N(-1039717182, new vw(cs0Var, i4), nv0Var), nv0Var, 196614, 24);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xc(i2, 9, cs0Var, bq1Var);
        }
    }

    public static final void k(si2 si2Var, ns0 ns0Var, nv0 nv0Var, int i2) {
        nv0Var.b0(-497001539);
        int i3 = (nv0Var.d(si2Var.ordinal()) ? 4 : 2) | i2 | (nv0Var.h(ns0Var) ? 32 : 16);
        int i4 = 0;
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            iv1.a(null, 0L, 0L, null, gq.N(-1052426634, new bi2(i4, ns0Var, si2Var), nv0Var), nv0Var, 196608);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ci2(si2Var, ns0Var, i2, i4);
        }
    }

    public static final void l(si2 si2Var, ns0 ns0Var, nv0 nv0Var, int i2) {
        nv0Var.b0(88352834);
        int i3 = (nv0Var.d(si2Var.ordinal()) ? 4 : 2) | i2 | (nv0Var.h(ns0Var) ? 32 : 16);
        int i4 = 1;
        if (nv0Var.R(i3 & 1, (i3 & 19) != 18)) {
            wv1.a(null, 0L, 0L, null, gq.N(1020866986, new bi2(i4, ns0Var, si2Var), nv0Var), nv0Var, 196608, 31);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ci2(si2Var, ns0Var, i2, i4);
        }
    }

    public static final void m(final String str, final cs0 cs0Var, bq1 bq1Var, nv0 nv0Var, final int i2) {
        final bq1 bq1Var2;
        xj2 xj2VarT;
        rs0 rs0Var;
        Object lVar;
        i90 i90Var;
        Object obj;
        os1 os1Var;
        final os1 os1Var2;
        Object oi2Var;
        i90 i90Var2;
        Boolean bool;
        mj0 mj0Var;
        boolean z2;
        vi2 vi2Var;
        cs0Var.getClass();
        nv0Var.b0(1415890833);
        int i3 = i2 | (nv0Var.f(str) ? 4 : 2) | (nv0Var.h(cs0Var) ? 32 : 16) | 384;
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            final vg2 vg2Var = (vg2) ((Map) br.o(dh2.c, nv0Var).getValue()).get(str);
            final yp1 yp1Var = yp1.a;
            if (vg2Var == null) {
                nv0Var.a0(-69750501);
                j(cs0Var, yp1Var, nv0Var, (i3 >> 3) & 126);
                nv0Var.p(false);
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    final int i4 = 0;
                    rs0Var = new rs0(str, cs0Var, yp1Var, i2, i4) { // from class: ji2
                        public final /* synthetic */ int f;
                        public final /* synthetic */ String g;
                        public final /* synthetic */ cs0 h;
                        public final /* synthetic */ bq1 i;

                        {
                            this.f = i4;
                        }

                        @Override // defpackage.rs0
                        public final Object f(Object obj2, Object obj3) {
                            int i5 = this.f;
                            dm3 dm3Var = dm3.a;
                            bq1 bq1Var3 = this.i;
                            cs0 cs0Var2 = this.h;
                            String str2 = this.g;
                            nv0 nv0Var2 = (nv0) obj2;
                            ((Integer) obj3).getClass();
                            switch (i5) {
                                case 0:
                                    vm1.m(str2, cs0Var2, bq1Var3, nv0Var2, jo3.y(1));
                                    break;
                                default:
                                    vm1.m(str2, cs0Var2, bq1Var3, nv0Var2, jo3.y(1));
                                    break;
                            }
                            return dm3Var;
                        }
                    };
                    xj2VarT.d = rs0Var;
                }
                return;
            }
            nv0Var.a0(-69667855);
            nv0Var.p(false);
            vi2 vi2Var2 = vg2Var.g;
            os1 os1VarO = br.o(vi2Var2.f, nv0Var);
            final os1 os1VarO2 = br.o(vi2Var2.l, nv0Var);
            final os1 os1VarO3 = br.o(vi2Var2.n, nv0Var);
            os1 os1VarO4 = br.o(vi2Var2.A, nv0Var);
            final os1 os1VarO5 = br.o(vi2Var2.G, nv0Var);
            final os1 os1VarO6 = br.o(vi2Var2.I, nv0Var);
            final String str2 = vg2Var.b + ":" + vg2Var.c;
            mj0 mj0Var2 = si2.k;
            boolean zH = nv0Var.h(mj0Var2);
            Object objO = nv0Var.O();
            Object obj2 = c20.a;
            if (zH || objO == obj2) {
                objO = new b81(mj0Var2, i);
                nv0Var.j0(objO);
            }
            i90 i90VarB = k32.b((cs0) objO, nv0Var, 0);
            Object objO2 = nv0Var.O();
            if (objO2 == obj2) {
                objO2 = rn.A(nv0Var);
                nv0Var.j0(objO2);
            }
            final x50 x50Var = (x50) objO2;
            Object objO3 = nv0Var.O();
            if (objO3 == obj2) {
                objO3 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO3);
            }
            final os1 os1Var3 = (os1) objO3;
            Object objO4 = nv0Var.O();
            if (objO4 == obj2) {
                objO4 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO4);
            }
            final os1 os1Var4 = (os1) objO4;
            Object objO5 = nv0Var.O();
            if (objO5 == obj2) {
                objO5 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO5);
            }
            final os1 os1Var5 = (os1) objO5;
            i = (i3 & 14) != 4 ? 0 : 1;
            Object objO6 = nv0Var.O();
            if (i != 0 || objO6 == obj2) {
                objO6 = b32.w(vg2Var.f);
                nv0Var.j0(objO6);
            }
            final os1 os1Var6 = (os1) objO6;
            boolean z3 = ((mg2) os1VarO.getValue()) instanceof ig2;
            boolean zF = nv0Var.f(os1VarO) | nv0Var.h(vi2Var2) | nv0Var.h(vg2Var);
            Object objO7 = nv0Var.O();
            if (zF || objO7 == obj2) {
                i90Var = i90VarB;
                obj = obj2;
                lVar = new l(vi2Var2, vg2Var, os1VarO, null, 29);
                os1Var = os1VarO4;
                os1Var2 = os1VarO;
                nv0Var.j0(lVar);
            } else {
                os1Var = os1VarO4;
                lVar = objO7;
                os1Var2 = os1VarO;
                obj = obj2;
                i90Var = i90VarB;
            }
            rn.l((rs0) lVar, nv0Var, str);
            Integer numValueOf = Integer.valueOf(i90Var.k());
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zH2 = nv0Var.h(mj0Var2) | nv0Var.f(i90Var) | nv0Var.g(z3) | nv0Var.h(vi2Var2);
            Object objO8 = nv0Var.O();
            if (zH2 || objO8 == obj) {
                i90Var2 = i90Var;
                bool = boolValueOf;
                mj0Var = mj0Var2;
                z2 = z3;
                oi2Var = new oi2(mj0Var, i90Var2, z2, vi2Var2, null, 0);
                vi2Var = vi2Var2;
                nv0Var.j0(oi2Var);
            } else {
                mj0Var = mj0Var2;
                z2 = z3;
                vi2Var = vi2Var2;
                bool = boolValueOf;
                oi2Var = objO8;
                i90Var2 = i90Var;
            }
            rn.m(numValueOf, bool, (rs0) oi2Var, nv0Var);
            Integer numValueOf2 = Integer.valueOf(i90Var2.k());
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zH3 = nv0Var.h(mj0Var) | nv0Var.f(i90Var2) | nv0Var.g(z2) | nv0Var.h(vi2Var);
            Object objO9 = nv0Var.O();
            if (zH3 || objO9 == obj) {
                objO9 = new oi2(mj0Var, i90Var2, z2, vi2Var, null, 1);
                nv0Var.j0(objO9);
            }
            rn.m(numValueOf2, boolValueOf2, (rs0) objO9, nv0Var);
            boolean zH4 = nv0Var.h(vi2Var);
            Object objO10 = nv0Var.O();
            if (zH4 || objO10 == obj) {
                objO10 = new xc1(18, vi2Var);
                nv0Var.j0(objO10);
            }
            rn.g(dm3.a, (ns0) objO10, nv0Var);
            final vi2 vi2Var3 = vi2Var;
            final os1 os1Var7 = os1Var;
            final mj0 mj0Var3 = mj0Var;
            final i90 i90Var3 = i90Var2;
            final boolean z4 = z2;
            s51.c(j43.c, null, gq.N(-430957445, new ss0() { // from class: li2
                @Override // defpackage.ss0
                public final Object e(Object obj3, Object obj4, Object obj5) {
                    lo loVar = (lo) obj3;
                    nv0 nv0Var2 = (nv0) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    loVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= nv0Var2.f(loVar) ? 4 : 2;
                    }
                    if (nv0Var2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fB = loVar.b();
                        ua0 ua0Var = loVar.a;
                        long j2 = loVar.b;
                        boolean z5 = jd0.a(loVar.b(), 840.0f) >= 0 || ((jd0.a(fB, m30.d(j2) ? ua0Var.X0(m30.h(j2)) : Float.POSITIVE_INFINITY) > 0) && jd0.a(loVar.b(), 600.0f) >= 0);
                        final boolean z6 = jd0.a(loVar.b(), 600.0f) >= 0 && !z5;
                        cs0 cs0Var2 = cs0Var;
                        final x50 x50Var2 = x50Var;
                        final vi2 vi2Var4 = vi2Var3;
                        final vg2 vg2Var2 = vg2Var;
                        final os1 os1Var8 = os1Var6;
                        final os1 os1Var9 = os1Var2;
                        final os1 os1Var10 = os1Var5;
                        d00 d00VarN = gq.N(1622063927, new p81(cs0Var2, x50Var2, vi2Var4, vg2Var2, os1Var8, os1Var9, os1Var10), nv0Var2);
                        final lj0 lj0Var = mj0Var3;
                        final i90 i90Var4 = i90Var3;
                        d00 d00VarN2 = gq.N(-418611178, new fw(z5, lj0Var, i90Var4, x50Var2), nv0Var2);
                        final String str3 = str;
                        final e93 e93Var = os1VarO2;
                        final String str4 = str2;
                        final boolean z7 = z4;
                        final os1 os1Var11 = os1Var3;
                        final os1 os1Var12 = os1Var4;
                        final e93 e93Var2 = os1VarO6;
                        final e93 e93Var3 = os1Var7;
                        final e93 e93Var4 = os1VarO5;
                        final e93 e93Var5 = os1VarO3;
                        final boolean z8 = z5;
                        w22.c(null, d00VarN, d00VarN2, null, null, 0, 0L, 0L, null, gq.N(-1697262580, new ss0() { // from class: ki2
                            @Override // defpackage.ss0
                            public final Object e(Object obj6, Object obj7, Object obj8) {
                                x50 x50Var3;
                                boolean z9;
                                vi2 vi2Var5;
                                os1 os1Var13;
                                String str5;
                                os1 os1Var14;
                                vg2 vg2Var3;
                                boolean z10;
                                Object obj9;
                                z00 z00Var = f5.C;
                                z00 z00Var2 = f5.F;
                                z00 z00Var3 = f5.D;
                                z00 z00Var4 = f5.E;
                                x12 x12Var = (x12) obj6;
                                nv0 nv0Var3 = (nv0) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                vm vmVar = f5.g;
                                tm tmVar = f5.s;
                                hj hjVar = n92.d;
                                x12Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= nv0Var3.f(x12Var) ? 4 : 2;
                                }
                                if (nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    boolean z11 = z6;
                                    vi2 vi2Var6 = vi2Var4;
                                    i90 i90Var5 = i90Var4;
                                    lj0 lj0Var2 = lj0Var;
                                    d00 d00VarN3 = gq.N(-1001259827, new mi2(z11, vi2Var6, i90Var5, lj0Var2, e93Var), nv0Var3);
                                    d00 d00VarN4 = gq.N(1373577852, new ni2(vi2Var6, str4, z7, os1Var11, os1Var12, e93Var2, e93Var3, e93Var4), nv0Var3);
                                    boolean z12 = z8;
                                    x50 x50Var4 = x50Var2;
                                    x91 x91Var = tb1.Y;
                                    zj zjVar = c20.a;
                                    if (z12) {
                                        nv0Var3.a0(1505202928);
                                        bq1 bq1VarI = f80.I(j43.c, x12Var);
                                        dp2 dp2VarA = cp2.a(n92.b, f5.p, nv0Var3, 0);
                                        int iHashCode = Long.hashCode(nv0Var3.T);
                                        n52 n52VarL = nv0Var3.l();
                                        bq1 bq1VarM = lr.M(nv0Var3, bq1VarI);
                                        w10.c.getClass();
                                        nv0Var3.d0();
                                        if (nv0Var3.S) {
                                            nv0Var3.k(x91Var);
                                        } else {
                                            nv0Var3.m0();
                                        }
                                        y02.F(z00Var4, nv0Var3, dp2VarA);
                                        y02.F(z00Var3, nv0Var3, n52VarL);
                                        nc2.r(iHashCode, nv0Var3, z00Var2, nv0Var3);
                                        y02.F(z00Var, nv0Var3, bq1VarM);
                                        mj0 mj0Var4 = (mj0) lj0Var2;
                                        si2 si2Var = (si2) mj0Var4.get(i90Var5.k());
                                        boolean zH5 = nv0Var3.h(x50Var4) | nv0Var3.f(i90Var5) | nv0Var3.h(mj0Var4);
                                        Object objO11 = nv0Var3.O();
                                        if (zH5 || objO11 == zjVar) {
                                            z10 = true;
                                            yh2 yh2Var = new yh2(x50Var4, i90Var5, mj0Var4, true ? 1 : 0);
                                            nv0Var3.j0(yh2Var);
                                            obj9 = yh2Var;
                                        } else {
                                            z10 = true;
                                            obj9 = objO11;
                                        }
                                        vm1.l(si2Var, (ns0) obj9, nv0Var3, 0);
                                        bq1 bq1VarD = new jc1(1.0f, z10).d(j43.b);
                                        qy qyVarA = oy.a(hjVar, tmVar, nv0Var3, 0);
                                        int iHashCode2 = Long.hashCode(nv0Var3.T);
                                        n52 n52VarL2 = nv0Var3.l();
                                        bq1 bq1VarM2 = lr.M(nv0Var3, bq1VarD);
                                        nv0Var3.d0();
                                        if (nv0Var3.S) {
                                            nv0Var3.k(x91Var);
                                        } else {
                                            nv0Var3.m0();
                                        }
                                        y02.F(z00Var4, nv0Var3, qyVarA);
                                        y02.F(z00Var3, nv0Var3, n52VarL2);
                                        nc2.r(iHashCode2, nv0Var3, z00Var2, nv0Var3);
                                        y02.F(z00Var, nv0Var3, bq1VarM2);
                                        jc1 jc1Var = new jc1(1.0f, true);
                                        cn1 cn1VarD = eo.d(vmVar, false);
                                        int iHashCode3 = Long.hashCode(nv0Var3.T);
                                        n52 n52VarL3 = nv0Var3.l();
                                        bq1 bq1VarM3 = lr.M(nv0Var3, jc1Var);
                                        nv0Var3.d0();
                                        if (nv0Var3.S) {
                                            nv0Var3.k(x91Var);
                                        } else {
                                            nv0Var3.m0();
                                        }
                                        y02.F(z00Var4, nv0Var3, cn1VarD);
                                        y02.F(z00Var3, nv0Var3, n52VarL3);
                                        nc2.r(iHashCode3, nv0Var3, z00Var2, nv0Var3);
                                        y02.F(z00Var, nv0Var3, bq1VarM3);
                                        d00VarN3.f(nv0Var3, 6);
                                        nv0Var3.p(true);
                                        d00VarN4.f(nv0Var3, 6);
                                        nv0Var3.p(true);
                                        nv0Var3.p(true);
                                        z9 = false;
                                        nv0Var3.p(false);
                                        x50Var3 = x50Var4;
                                    } else {
                                        nv0Var3.a0(1505900676);
                                        bq1 bq1VarJ = n92.J(f80.I(j43.c, x12Var), n92.p0);
                                        qy qyVarA2 = oy.a(hjVar, tmVar, nv0Var3, 0);
                                        int iHashCode4 = Long.hashCode(nv0Var3.T);
                                        n52 n52VarL4 = nv0Var3.l();
                                        bq1 bq1VarM4 = lr.M(nv0Var3, bq1VarJ);
                                        w10.c.getClass();
                                        nv0Var3.d0();
                                        x50Var3 = x50Var4;
                                        if (nv0Var3.S) {
                                            nv0Var3.k(x91Var);
                                        } else {
                                            nv0Var3.m0();
                                        }
                                        y02.F(z00Var4, nv0Var3, qyVarA2);
                                        y02.F(z00Var3, nv0Var3, n52VarL4);
                                        nc2.r(iHashCode4, nv0Var3, z00Var2, nv0Var3);
                                        y02.F(z00Var, nv0Var3, bq1VarM4);
                                        jc1 jc1Var2 = new jc1(1.0f, true);
                                        cn1 cn1VarD2 = eo.d(vmVar, false);
                                        int iHashCode5 = Long.hashCode(nv0Var3.T);
                                        n52 n52VarL5 = nv0Var3.l();
                                        bq1 bq1VarM5 = lr.M(nv0Var3, jc1Var2);
                                        nv0Var3.d0();
                                        if (nv0Var3.S) {
                                            nv0Var3.k(x91Var);
                                        } else {
                                            nv0Var3.m0();
                                        }
                                        y02.F(z00Var4, nv0Var3, cn1VarD2);
                                        y02.F(z00Var3, nv0Var3, n52VarL5);
                                        nc2.r(iHashCode5, nv0Var3, z00Var2, nv0Var3);
                                        y02.F(z00Var, nv0Var3, bq1VarM5);
                                        d00VarN3.f(nv0Var3, 6);
                                        nv0Var3.p(true);
                                        d00VarN4.f(nv0Var3, 6);
                                        nv0Var3.p(true);
                                        z9 = false;
                                        nv0Var3.p(false);
                                    }
                                    hb0 hb0Var = (hb0) e93Var5.getValue();
                                    if (hb0Var == null) {
                                        nv0Var3.a0(1506230670);
                                        nv0Var3.p(z9);
                                        vi2Var5 = vi2Var6;
                                    } else {
                                        nv0Var3.a0(1506230671);
                                        vi2Var5 = vi2Var6;
                                        boolean zH6 = nv0Var3.h(vi2Var5);
                                        Object objO12 = nv0Var3.O();
                                        Object obj10 = objO12;
                                        if (zH6 || objO12 == zjVar) {
                                            ba baVar = new ba(3, vi2Var5);
                                            nv0Var3.j0(baVar);
                                            obj10 = baVar;
                                        }
                                        ts0 ts0Var = (ts0) obj10;
                                        boolean zH7 = nv0Var3.h(vi2Var5);
                                        Object objO13 = nv0Var3.O();
                                        if (zH7 || objO13 == zjVar) {
                                            objO13 = new c91(0, vi2Var5, vi2.class, "deferActiveDialog", "deferActiveDialog()V", 0, 0, 25);
                                            nv0Var3.j0(objO13);
                                        }
                                        cs0 cs0Var3 = (cs0) ((ct0) objO13);
                                        boolean zH8 = nv0Var3.h(vi2Var5);
                                        Object objO14 = nv0Var3.O();
                                        if (zH8 || objO14 == zjVar) {
                                            objO14 = new c91(0, vi2Var5, vi2.class, "dismissActiveDialog", "dismissActiveDialog()V", 0, 0, 26);
                                            nv0Var3.j0(objO14);
                                        }
                                        n32.a(hb0Var, ts0Var, cs0Var3, (cs0) ((ct0) objO14), nv0Var3, 0);
                                        nv0Var3.p(false);
                                    }
                                    os1 os1Var15 = os1Var10;
                                    if (((Boolean) os1Var15.getValue()).booleanValue()) {
                                        nv0Var3.a0(1506648179);
                                        String str6 = (String) os1Var8.getValue();
                                        Object objO15 = nv0Var3.O();
                                        Object obj11 = objO15;
                                        if (objO15 == zjVar) {
                                            mh2 mh2Var = new mh2(os1Var15, 14);
                                            nv0Var3.j0(mh2Var);
                                            obj11 = mh2Var;
                                        }
                                        cs0 cs0Var4 = (cs0) obj11;
                                        String str7 = str3;
                                        boolean zF2 = nv0Var3.f(str7);
                                        os1 os1Var16 = os1Var9;
                                        x50 x50Var5 = x50Var3;
                                        boolean zF3 = zF2 | nv0Var3.f(os1Var16) | nv0Var3.h(x50Var5) | nv0Var3.h(vi2Var5);
                                        vg2 vg2Var4 = vg2Var2;
                                        boolean zH9 = zF3 | nv0Var3.h(vg2Var4);
                                        Object objO16 = nv0Var3.O();
                                        if (zH9 || objO16 == zjVar) {
                                            os1Var13 = os1Var15;
                                            objO16 = new go(str7, x50Var5, os1Var13, os1Var16, vi2Var5, vg2Var4, 2);
                                            str5 = str7;
                                            os1Var14 = os1Var16;
                                            vg2Var3 = vg2Var4;
                                            nv0Var3.j0(objO16);
                                        } else {
                                            vg2Var3 = vg2Var4;
                                            str5 = str7;
                                            os1Var13 = os1Var15;
                                            os1Var14 = os1Var16;
                                        }
                                        ns0 ns0Var = (ns0) objO16;
                                        boolean zF4 = nv0Var3.f(str5) | nv0Var3.f(os1Var14) | nv0Var3.h(x50Var5) | nv0Var3.h(vi2Var5) | nv0Var3.h(vg2Var3);
                                        Object objO17 = nv0Var3.O();
                                        if (zF4 || objO17 == zjVar) {
                                            objO17 = new xh2(str5, x50Var5, os1Var13, os1Var14, vi2Var5, vg2Var3);
                                            nv0Var3.j0(objO17);
                                        }
                                        vm1.h(48, cs0Var4, (cs0) objO17, ns0Var, nv0Var3, str6);
                                        nv0Var3.p(false);
                                    } else {
                                        nv0Var3.a0(1506897078);
                                        nv0Var3.p(false);
                                    }
                                } else {
                                    nv0Var3.U();
                                }
                                return dm3.a;
                            }
                        }, nv0Var2), nv0Var2, 805306800, 505);
                    } else {
                        nv0Var2.U();
                    }
                    return dm3.a;
                }
            }, nv0Var), nv0Var, 3072, 6);
            bq1Var2 = yp1Var;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final int i5 = 1;
            rs0Var = new rs0(str, cs0Var, bq1Var2, i2, i5) { // from class: ji2
                public final /* synthetic */ int f;
                public final /* synthetic */ String g;
                public final /* synthetic */ cs0 h;
                public final /* synthetic */ bq1 i;

                {
                    this.f = i5;
                }

                @Override // defpackage.rs0
                public final Object f(Object obj22, Object obj3) {
                    int i52 = this.f;
                    dm3 dm3Var = dm3.a;
                    bq1 bq1Var3 = this.i;
                    cs0 cs0Var2 = this.h;
                    String str22 = this.g;
                    nv0 nv0Var2 = (nv0) obj22;
                    ((Integer) obj3).getClass();
                    switch (i52) {
                        case 0:
                            vm1.m(str22, cs0Var2, bq1Var3, nv0Var2, jo3.y(1));
                            break;
                        default:
                            vm1.m(str22, cs0Var2, bq1Var3, nv0Var2, jo3.y(1));
                            break;
                    }
                    return dm3Var;
                }
            };
            xj2VarT.d = rs0Var;
        }
    }

    public static final void n(String str, x50 x50Var, os1 os1Var, os1 os1Var2, vi2 vi2Var, vg2 vg2Var, String str2) {
        Object value;
        Map mapSingletonMap;
        dh2 dh2Var = dh2.a;
        str2.getClass();
        i93 i93Var = dh2.b;
        vg2 vg2Var2 = (vg2) ((Map) i93Var.getValue()).get(str);
        p40 p40Var = null;
        if (vg2Var2 != null) {
            do {
                value = i93Var.getValue();
                Map map = (Map) value;
                vg2 vg2VarA = vg2.a(vg2Var2, null, str2, 95);
                map.getClass();
                if (map.isEmpty()) {
                    mapSingletonMap = Collections.singletonMap(str, vg2VarA);
                    mapSingletonMap.getClass();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(str, vg2VarA);
                    mapSingletonMap = linkedHashMap;
                }
            } while (!i93Var.h(value, mapSingletonMap));
            cl3.t(dh2.h, null, new hd1(vg2Var2, str2, p40Var, 12), 3);
        }
        os1Var.setValue(Boolean.FALSE);
        if ((((mg2) os1Var2.getValue()) instanceof ig2) || (((mg2) os1Var2.getValue()) instanceof jg2)) {
            cl3.t(x50Var, null, new ri2(vi2Var, vg2Var, str2, p40Var, 0), 3);
        }
    }

    public static final void o(ub2 ub2Var, jj3 jj3Var, x50 x50Var, boolean z2, os1 os1Var, d00 d00Var, nv0 nv0Var, int i2) {
        ub2 ub2Var2;
        int i3;
        nv0Var.b0(-1413720282);
        if ((i2 & 6) == 0) {
            ub2Var2 = ub2Var;
            i3 = (nv0Var.f(ub2Var2) ? 4 : 2) | i2;
        } else {
            ub2Var2 = ub2Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? nv0Var.f(jj3Var) : nv0Var.h(jj3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= nv0Var.h(x50Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= nv0Var.g(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= nv0Var.f(os1Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= nv0Var.h(d00Var) ? 1048576 : 524288;
        }
        int i4 = 1;
        if (nv0Var.R(i3 & 1, (599187 & i3) != 599186)) {
            String strM = oz2.M(top.th1nk.samp.R.string.tooltip_description, nv0Var);
            boolean zH = ((i3 & 112) == 32 || ((i3 & 64) != 0 && nv0Var.h(jj3Var))) | ((i3 & 896) == 256) | nv0Var.h(x50Var) | ((458752 & i3) == 131072);
            Object objO = nv0Var.O();
            if (zH || objO == c20.a) {
                objO = new ok(jj3Var, x50Var, os1Var, i4);
                nv0Var.j0(objO);
            }
            int i5 = (i3 & 14) | 3072;
            xa.a(ub2Var2, (cs0) objO, new vb2(z2), gq.N(-1287705660, new z4(i4, strM, d00Var), nv0Var), nv0Var, i5, 0);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gm(ub2Var, jj3Var, x50Var, z2, os1Var, d00Var, i2);
        }
    }

    public static final void p(jj3 jj3Var, os1 os1Var, d00 d00Var, nv0 nv0Var, int i2) {
        int i3;
        nv0Var.b0(1873232064);
        int i4 = 1;
        if ((i2 & 6) == 0) {
            i3 = (nv0Var.g(true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? nv0Var.f(jj3Var) : nv0Var.h(jj3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= nv0Var.f(os1Var) ? 256 : 128;
        }
        int i5 = 0;
        if ((i2 & 3072) == 0) {
            i3 |= nv0Var.g(false) ? 2048 : 1024;
        }
        int i6 = i2 & 24576;
        yp1 yp1Var = yp1.a;
        if (i6 == 0) {
            i3 |= nv0Var.f(yp1Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= nv0Var.h(d00Var) ? 131072 : 65536;
        }
        if (nv0Var.R(i3 & 1, (74899 & i3) != 74898)) {
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = rn.A(nv0Var);
                nv0Var.j0(objO);
            }
            x50 x50Var = (x50) objO;
            int i7 = 3;
            bq1 bq1VarF = F(rn.E(ob3.a(ob3.a(yp1Var, jj3Var, new nm(jj3Var, i5)), jj3Var, new nm(jj3Var, i4)).d(new h42(new v1(oz2.M(top.th1nk.samp.R.string.tooltip_label, nv0Var), x50Var, jj3Var, i7))), new i(7, x50Var, jj3Var)), new la(i7, jj3Var, os1Var));
            cn1 cn1VarD = eo.d(f5.g, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarF);
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
            nc2.p((i3 >> 15) & 14, d00Var, nv0Var, true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(jj3Var, os1Var, d00Var, i2);
        }
    }

    public static final Object q(ia0 ia0Var, cs0 cs0Var, q40 q40Var) {
        Object obj;
        ex1 ex1VarW;
        Object objU0;
        ax1 ax1Var;
        if (((aq1) ia0Var).f.s) {
            aq1 aq1Var = (aq1) ia0Var;
            if (!aq1Var.f.s) {
                m21.c("visitAncestors called on an unattached node");
            }
            aq1 aq1Var2 = aq1Var.f.j;
            tb1 tb1VarX = vr.X(ia0Var);
            loop0: while (true) {
                obj = null;
                if (tb1VarX == null) {
                    break;
                }
                if ((tb1VarX.L.f.i & 524288) != 0) {
                    while (aq1Var2 != null) {
                        if ((aq1Var2.h & 524288) != 0) {
                            aq1 aq1VarJ = aq1Var2;
                            qs1 qs1Var = null;
                            while (aq1VarJ != null) {
                                if (aq1VarJ instanceof no) {
                                    obj = aq1VarJ;
                                    break loop0;
                                }
                                if ((aq1VarJ.h & 524288) != 0 && (aq1VarJ instanceof ja0)) {
                                    int i2 = 0;
                                    for (aq1 aq1Var3 = ((ja0) aq1VarJ).u; aq1Var3 != null; aq1Var3 = aq1Var3.k) {
                                        if ((aq1Var3.h & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                aq1VarJ = aq1Var3;
                                            } else {
                                                if (qs1Var == null) {
                                                    qs1Var = new qs1(new aq1[16]);
                                                }
                                                if (aq1VarJ != null) {
                                                    qs1Var.b(aq1VarJ);
                                                    aq1VarJ = null;
                                                }
                                                qs1Var.b(aq1Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                aq1VarJ = vr.j(qs1Var);
                            }
                        }
                        aq1Var2 = aq1Var2.j;
                    }
                }
                tb1VarX = tb1VarX.u();
                aq1Var2 = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
            }
            no noVar = (no) obj;
            if (noVar != null && (objU0 = noVar.U0((ex1VarW = vr.W(ia0Var)), new u1(10, cs0Var, ex1VarW), q40Var)) == y50.f) {
                return objU0;
            }
        }
        return dm3.a;
    }

    public static final boolean r(Object obj) {
        if (obj instanceof f73) {
            f73 f73Var = (f73) obj;
            if (f73Var.d() == f5.f0 || f73Var.d() == m22.u || f73Var.d() == m22.k) {
                Object value = f73Var.getValue();
                if (value == null) {
                    return true;
                }
                return r(value);
            }
        } else if (!(obj instanceof zs0) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (Q[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final bq1 s(bq1 bq1Var, om0 om0Var) {
        return bq1Var.d(new bm3(om0Var));
    }

    public static final bq1 t(bq1 bq1Var, x12 x12Var) {
        return bq1Var.d(new y12(x12Var));
    }

    public static byte[] u(eb0[] eb0VarArr, byte[] bArr) throws IOException {
        int i2 = 0;
        int length = 0;
        for (eb0 eb0Var : eb0VarArr) {
            length += ((((eb0Var.g * 2) + 7) & (-8)) / 8) + (eb0Var.e * 2) + w(eb0Var.a, eb0Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + eb0Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, n92.S)) {
            int length2 = eb0VarArr.length;
            while (i2 < length2) {
                eb0 eb0Var2 = eb0VarArr[i2];
                W(byteArrayOutputStream, eb0Var2, w(eb0Var2.a, eb0Var2.b, bArr));
                V(byteArrayOutputStream, eb0Var2);
                i2++;
            }
        } else {
            for (eb0 eb0Var3 : eb0VarArr) {
                W(byteArrayOutputStream, eb0Var3, w(eb0Var3.a, eb0Var3.b, bArr));
            }
            int length3 = eb0VarArr.length;
            while (i2 < length3) {
                V(byteArrayOutputStream, eb0VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static View v(View view, int i2) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = h7.T0;
            if (declaredMethod == null) {
                declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                h7.T0 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (s51.n(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View viewV = v(viewGroup.getChildAt(i3), i2);
                    if (viewV != null) {
                        return viewV;
                    }
                }
            }
        }
        return null;
    }

    public static String w(String str, String str2, byte[] bArr) {
        byte[] bArr2 = n92.T;
        byte[] bArr3 = n92.U;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return nc2.j(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static st x(fy fyVar) {
        st stVar = fyVar.b0;
        if (stVar != null) {
            return stVar;
        }
        long j2 = wx.f;
        long jD = hy.d(fyVar, cl3.j);
        gy gyVar = cl3.n;
        long jD2 = hy.d(fyVar, gyVar);
        long jD3 = hy.d(fyVar, gyVar);
        long jB = wx.b(cl3.d, hy.d(fyVar, cl3.c));
        gy gyVar2 = cl3.l;
        long jD4 = hy.d(fyVar, gyVar2);
        float f2 = cl3.m;
        st stVar2 = new st(j2, jD, jD2, jD3, j2, jB, wx.b(f2, jD4), wx.b(f2, hy.d(fyVar, gyVar2)));
        fyVar.b0 = stVar2;
        return stVar2;
    }

    public static boolean y() {
        try {
            if (h7.N0 == null) {
                h7.N0 = Class.forName("android.os.SystemProperties");
            }
            if (h7.O0 == null) {
                Class cls = h7.N0;
                h7.O0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = h7.O0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return s51.n(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final bq1 z(bq1 bq1Var, ns0 ns0Var) {
        return bq1Var.d(new ym(ns0Var));
    }
}
