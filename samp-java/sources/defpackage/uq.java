package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.view.View;
import android.widget.EdgeEffect;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class uq {
    public static final float a = 32.0f;

    public static final o60 A(rp0 rp0Var, int i) {
        if (!rp0Var.w) {
            rp0Var.w = true;
            try {
                gp0 gp0VarR1 = rp0Var.r1();
                fr frVar = new fr(i);
                ep0 ep0Var = (ep0) ((h7) vr.Y(rp0Var)).getFocusOwner();
                rp0 rp0VarF = ep0Var.f();
                gp0VarR1.j.h(frVar);
                rp0 rp0VarF2 = ep0Var.f();
                boolean z = frVar.b;
                o60 o60Var = o60.g;
                if (z) {
                    ip0 ip0Var = ip0.b;
                    return o60Var;
                }
                if (rp0VarF != rp0VarF2 && rp0VarF2 != null) {
                    return ip0.d == ip0.c ? o60Var : o60.h;
                }
            } finally {
                rp0Var.w = false;
            }
        }
        return o60.f;
    }

    public static final o60 B(rp0 rp0Var, int i) {
        aq1 aq1VarJ;
        ax1 ax1Var;
        int iOrdinal = rp0Var.u1().ordinal();
        o60 o60Var = o60.f;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                rp0 rp0VarZ = br.z(rp0Var);
                if (rp0VarZ != null) {
                    return z(rp0VarZ, i);
                }
                c.p("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    c.k();
                    return null;
                }
                if (!rp0Var.f.s) {
                    m21.c("visitAncestors called on an unattached node");
                }
                aq1 aq1Var = rp0Var.f.j;
                tb1 tb1VarX = vr.X(rp0Var);
                loop0: while (true) {
                    if (tb1VarX == null) {
                        aq1VarJ = null;
                        break;
                    }
                    if ((tb1VarX.L.f.i & 1024) != 0) {
                        while (aq1Var != null) {
                            if ((aq1Var.h & 1024) != 0) {
                                aq1VarJ = aq1Var;
                                qs1 qs1Var = null;
                                while (aq1VarJ != null) {
                                    if (aq1VarJ instanceof rp0) {
                                        break loop0;
                                    }
                                    if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                        int i2 = 0;
                                        for (aq1 aq1Var2 = ((ja0) aq1VarJ).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                                            if ((aq1Var2.h & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    aq1VarJ = aq1Var2;
                                                } else {
                                                    if (qs1Var == null) {
                                                        qs1Var = new qs1(new aq1[16]);
                                                    }
                                                    if (aq1VarJ != null) {
                                                        qs1Var.b(aq1VarJ);
                                                        aq1VarJ = null;
                                                    }
                                                    qs1Var.b(aq1Var2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    aq1VarJ = vr.j(qs1Var);
                                }
                            }
                            aq1Var = aq1Var.j;
                        }
                    }
                    tb1VarX = tb1VarX.u();
                    aq1Var = (tb1VarX == null || (ax1Var = tb1VarX.L) == null) ? null : ax1Var.e;
                }
                rp0 rp0Var2 = (rp0) aq1VarJ;
                if (rp0Var2 == null) {
                    return o60Var;
                }
                int iOrdinal2 = rp0Var2.u1().ordinal();
                if (iOrdinal2 == 0) {
                    return A(rp0Var2, i);
                }
                if (iOrdinal2 == 1) {
                    return B(rp0Var2, i);
                }
                if (iOrdinal2 == 2) {
                    return o60.g;
                }
                if (iOrdinal2 != 3) {
                    c.k();
                    return null;
                }
                o60 o60VarB = B(rp0Var2, i);
                o60 o60Var2 = o60VarB != o60Var ? o60VarB : null;
                return o60Var2 == null ? A(rp0Var2, i) : o60Var2;
            }
        }
        return o60Var;
    }

    public static final boolean C(rp0 rp0Var) {
        qs1 qs1Var;
        ax1 ax1Var;
        ep0 ep0Var;
        boolean z;
        int i;
        qs1 qs1Var2;
        int i2;
        int i3;
        ax1 ax1Var2;
        ep0 ep0Var2 = (ep0) ((h7) vr.Y(rp0Var)).getFocusOwner();
        rp0 rp0VarF = ep0Var2.f();
        mp0 mp0VarU1 = rp0Var.u1();
        if (rp0VarF == rp0Var) {
            rp0Var.q1(mp0VarU1, mp0VarU1);
            return true;
        }
        if ((rp0VarF == null || rp0VarF.t) && !rp0Var.t && !((ep0) ((h7) vr.Y(rp0Var)).getFocusOwner()).a.F()) {
            return false;
        }
        if (rp0VarF != null) {
            qs1Var = new qs1(new rp0[16]);
            if (!rp0VarF.f.s) {
                m21.c("visitAncestors called on an unattached node");
            }
            aq1 aq1Var = rp0VarF.f.j;
            tb1 tb1VarX = vr.X(rp0VarF);
            while (tb1VarX != null) {
                if ((tb1VarX.L.f.i & 1024) != 0) {
                    while (aq1Var != null) {
                        if ((aq1Var.h & 1024) != 0) {
                            aq1 aq1VarJ = aq1Var;
                            qs1 qs1Var3 = null;
                            while (aq1VarJ != null) {
                                if (aq1VarJ instanceof rp0) {
                                    qs1Var.b((rp0) aq1VarJ);
                                } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                    int i4 = 0;
                                    for (aq1 aq1Var2 = ((ja0) aq1VarJ).u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
                                        if ((aq1Var2.h & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                aq1VarJ = aq1Var2;
                                            } else {
                                                if (qs1Var3 == null) {
                                                    qs1Var3 = new qs1(new aq1[16]);
                                                }
                                                if (aq1VarJ != null) {
                                                    qs1Var3.b(aq1VarJ);
                                                    aq1VarJ = null;
                                                }
                                                qs1Var3.b(aq1Var2);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                aq1VarJ = vr.j(qs1Var3);
                            }
                        }
                        aq1Var = aq1Var.j;
                    }
                }
                tb1VarX = tb1VarX.u();
                aq1Var = (tb1VarX == null || (ax1Var2 = tb1VarX.L) == null) ? null : ax1Var2.e;
            }
        } else {
            qs1Var = null;
        }
        Object[] objArr = new rp0[16];
        Object[] objArr2 = new rp0[16];
        if (!rp0Var.f.s) {
            m21.c("visitAncestors called on an unattached node");
        }
        aq1 aq1Var3 = rp0Var.f.j;
        tb1 tb1VarX2 = vr.X(rp0Var);
        boolean z2 = true;
        int i5 = 0;
        int i6 = 0;
        while (tb1VarX2 != null) {
            if ((tb1VarX2.L.f.i & 1024) != 0) {
                while (aq1Var3 != null) {
                    if ((aq1Var3.h & 1024) != 0) {
                        aq1 aq1VarJ2 = aq1Var3;
                        qs1 qs1Var4 = null;
                        while (aq1VarJ2 != null) {
                            if (aq1VarJ2 instanceof rp0) {
                                rp0 rp0Var2 = (rp0) aq1VarJ2;
                                if (s51.n(qs1Var != null ? Boolean.valueOf(qs1Var.j(rp0Var2)) : null, Boolean.TRUE)) {
                                    int i7 = i5 + 1;
                                    if (objArr.length < i7) {
                                        int length = objArr.length;
                                        ep0Var = ep0Var2;
                                        Object[] objArr3 = new Object[Math.max(i7, length * 2)];
                                        i3 = i7;
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    } else {
                                        ep0Var = ep0Var2;
                                        i3 = i7;
                                    }
                                    objArr[i5] = rp0Var2;
                                    i5 = i3;
                                } else {
                                    ep0Var = ep0Var2;
                                    int i8 = i6 + 1;
                                    if (objArr2.length < i8) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i8, length2 * 2)];
                                        i2 = i8;
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    } else {
                                        i2 = i8;
                                    }
                                    objArr2[i6] = rp0Var2;
                                    i6 = i2;
                                }
                                if (rp0Var2 == rp0VarF) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                ep0Var = ep0Var2;
                                z = true;
                            }
                            if (z && (aq1VarJ2.h & 1024) != 0 && (aq1VarJ2 instanceof ja0)) {
                                int i9 = 0;
                                for (aq1 aq1Var4 = ((ja0) aq1VarJ2).u; aq1Var4 != null; aq1Var4 = aq1Var4.k) {
                                    if ((aq1Var4.h & 1024) != 0) {
                                        int i10 = i9 + 1;
                                        if (i10 == 1) {
                                            aq1VarJ2 = aq1Var4;
                                            i = i10;
                                        } else {
                                            if (qs1Var4 == null) {
                                                i = i10;
                                                qs1Var2 = new qs1(new aq1[16]);
                                            } else {
                                                i = i10;
                                                qs1Var2 = qs1Var4;
                                            }
                                            if (aq1VarJ2 != null) {
                                                qs1Var2.b(aq1VarJ2);
                                                aq1VarJ2 = null;
                                            }
                                            qs1Var2.b(aq1Var4);
                                            qs1Var4 = qs1Var2;
                                        }
                                        i9 = i;
                                    }
                                }
                                if (i9 == 1) {
                                    ep0Var2 = ep0Var;
                                } else {
                                    aq1VarJ2 = vr.j(qs1Var4);
                                    ep0Var2 = ep0Var;
                                }
                            } else {
                                aq1VarJ2 = vr.j(qs1Var4);
                                ep0Var2 = ep0Var;
                            }
                        }
                    }
                    aq1Var3 = aq1Var3.j;
                    ep0Var2 = ep0Var2;
                }
            }
            ep0 ep0Var3 = ep0Var2;
            tb1VarX2 = tb1VarX2.u();
            aq1Var3 = (tb1VarX2 == null || (ax1Var = tb1VarX2.L) == null) ? null : ax1Var.e;
            ep0Var2 = ep0Var3;
        }
        ep0 ep0Var4 = ep0Var2;
        if (z2 && rp0VarF != null && !F(rp0VarF, false)) {
            return false;
        }
        gq.M(rp0Var, new ja(15, rp0Var));
        int iOrdinal = rp0Var.u1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((ep0) ((h7) vr.Y(rp0Var)).getFocusOwner()).i(rp0Var);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    c.k();
                    return false;
                }
                ((ep0) ((h7) vr.Y(rp0Var)).getFocusOwner()).i(rp0Var);
            }
        }
        mp0 mp0Var = mp0.h;
        mp0 mp0Var2 = mp0.f;
        if (z2 && rp0VarF != null) {
            rp0VarF.q1(mp0Var2, mp0Var);
        }
        mp0 mp0Var3 = mp0.g;
        if (qs1Var != null) {
            int i11 = qs1Var.h - 1;
            Object[] objArr5 = qs1Var.f;
            if (i11 < objArr5.length) {
                while (i11 >= 0) {
                    rp0 rp0Var3 = (rp0) objArr5[i11];
                    if (ep0Var4.f() != rp0Var) {
                        return false;
                    }
                    rp0Var3.q1(mp0Var3, mp0Var);
                    i11--;
                }
            }
        }
        int i12 = i6 - 1;
        if (i12 < objArr2.length) {
            while (i12 >= 0) {
                rp0 rp0Var4 = (rp0) objArr2[i12];
                if (ep0Var4.f() != rp0Var) {
                    return false;
                }
                rp0Var4.q1(rp0Var4 == rp0VarF ? mp0Var2 : mp0Var, mp0Var3);
                i12--;
            }
        }
        if (ep0Var4.f() != rp0Var) {
            return false;
        }
        rp0Var.q1(mp0VarU1, mp0Var2);
        return ep0Var4.f() == rp0Var;
    }

    public static String D(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        kq kqVar = kq.i;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        encoded.getClass();
        kq kqVarK = zj.k(encoded);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(kqVarK.f, 0, kqVarK.b());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return "sha256/".concat(new kq(bArrDigest).a());
    }

    public static final long E(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final boolean F(rp0 rp0Var, boolean z) {
        int iOrdinal = rp0Var.u1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                rp0 rp0VarZ = br.z(rp0Var);
                if (!(rp0VarZ != null ? F(rp0VarZ, z) : true)) {
                    return false;
                }
                rp0Var.q1(mp0.g, mp0.h);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                c.k();
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.zj1 G(java.io.File r18, long r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq.G(java.io.File, long):zj1");
    }

    public static final long H(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final void I(q02 q02Var, int i, Object obj) {
        q02Var.o[(q02Var.p - q02Var.k[q02Var.l - 1].b) + i] = obj;
    }

    public static final void J(q02 q02Var, int i, Object obj, int i2, Object obj2) {
        int i3 = q02Var.p - q02Var.k[q02Var.l - 1].b;
        Object[] objArr = q02Var.o;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static String K(File file) throws NoSuchAlgorithmException, IOException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileInputStream.close();
                    byte[] bArrDigest = messageDigest.digest();
                    bArrDigest.getClass();
                    return uj.W(bArrDigest, "", new u0(22), 30);
                }
                messageDigest.update(bArr, 0, i);
            }
        } finally {
        }
    }

    public static final int L(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static final String M(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static void N(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            N((View) parent, fArr, fArr2, iArr);
            w7.z(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            w7.z(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            w7.z(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            w7.z(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        vm1.P(matrix, fArr2);
        w7.Y(fArr, fArr2);
    }

    public static final boolean O(Throwable th, cs0 cs0Var) throws IllegalAccessException, InvocationTargetException {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = g61.a;
        fb0 fb0Var = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = o62.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = ni0.f;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof fb0) {
                return false;
            }
        }
        try {
            t10 t10Var = (t10) cs0Var.a();
            if (t10Var != null) {
                boolean z2 = t10Var.b;
                List list = t10Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((v10) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                t10Var.getClass();
                fb0Var = new fb0(t10Var);
            }
        } catch (Throwable th2) {
            fb0Var = th2;
        }
        if (fb0Var != null) {
            j(th, fb0Var);
        }
        return z;
    }

    public static final xl3 P(p40 p40Var, o50 o50Var, Object obj) {
        xl3 xl3Var = null;
        if ((p40Var instanceof z50) && o50Var.m(or.h) != null) {
            z50 z50VarD = (z50) p40Var;
            while (true) {
                if ((z50VarD instanceof xb0) || (z50VarD = z50VarD.d()) == null) {
                    break;
                }
                if (z50VarD instanceof xl3) {
                    xl3Var = (xl3) z50VarD;
                    break;
                }
            }
            if (xl3Var != null) {
                xl3Var.v0(o50Var, obj);
            }
        }
        return xl3Var;
    }

    public static final void Q(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            p21.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        p21.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final s83 R(pq1 pq1Var, nv0 nv0Var) {
        oq1 oq1Var = (oq1) nv0Var.j(um1.a);
        int iOrdinal = pq1Var.ordinal();
        if (iOrdinal == 0) {
            oq1Var.getClass();
            s83 s83Var = oq1.b;
            s83Var.getClass();
            return s83Var;
        }
        if (iOrdinal == 1) {
            oq1Var.getClass();
            s83 s83Var2 = oq1.c;
            s83Var2.getClass();
            return s83Var2;
        }
        if (iOrdinal == 2) {
            oq1Var.getClass();
            s83 s83Var3 = oq1.d;
            s83Var3.getClass();
            return s83Var3;
        }
        if (iOrdinal == 3) {
            oq1Var.getClass();
            s83 s83Var4 = oq1.e;
            s83Var4.getClass();
            return s83Var4;
        }
        if (iOrdinal == 4) {
            oq1Var.getClass();
            s83 s83Var5 = oq1.f;
            s83Var5.getClass();
            return s83Var5;
        }
        if (iOrdinal != 5) {
            c.k();
            return null;
        }
        oq1Var.getClass();
        s83 s83Var6 = oq1.g;
        s83Var6.getClass();
        return s83Var6;
    }

    public static final void a(mb0 mb0Var, nv0 nv0Var, int i) {
        l73 l73Var;
        nv0Var.b0(294589392);
        if ((((nv0Var.h(mb0Var) ? 4 : 2) | i) & 3) == 2 && nv0Var.D()) {
            nv0Var.U();
        } else {
            eq2 eq2VarD = y02.D(nv0Var);
            os1 os1VarE = b32.e(mb0Var.b().e, nv0Var);
            List list = (List) os1VarE.getValue();
            boolean zBooleanValue = ((Boolean) nv0Var.j(r31.a)).booleanValue();
            boolean zF = nv0Var.f(list);
            Object objO = nv0Var.O();
            Object obj = c20.a;
            Object obj2 = objO;
            if (zF || objO == obj) {
                l73 l73Var2 = new l73();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    qt1 qt1Var = (qt1) obj3;
                    if (zBooleanValue || qt1Var.m.j.i.compareTo(ff1.i) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                l73Var2.addAll(arrayList);
                nv0Var.j0(l73Var2);
                obj2 = l73Var2;
            }
            l73 l73Var3 = (l73) obj2;
            e(l73Var3, (List) os1VarE.getValue(), nv0Var, 0);
            os1 os1VarE2 = b32.e(mb0Var.b().f, nv0Var);
            Object objO2 = nv0Var.O();
            if (objO2 == obj) {
                objO2 = new l73();
                nv0Var.j0(objO2);
            }
            l73 l73Var4 = (l73) objO2;
            nv0Var.a0(-367418626);
            ListIterator listIterator = l73Var3.listIterator();
            while (true) {
                jy0 jy0Var = (jy0) listIterator;
                if (!jy0Var.hasNext()) {
                    break;
                }
                qt1 qt1Var2 = (qt1) jy0Var.next();
                fu1 fu1Var = qt1Var2.g;
                fu1Var.getClass();
                lb0 lb0Var = (lb0) fu1Var;
                boolean zH = nv0Var.h(mb0Var) | nv0Var.h(qt1Var2);
                Object objO3 = nv0Var.O();
                if (zH || objO3 == obj) {
                    objO3 = new u1(15, mb0Var, qt1Var2);
                    nv0Var.j0(objO3);
                }
                f80.b((cs0) objO3, lb0Var.k, gq.N(1129586364, new jb0(qt1Var2, mb0Var, eq2VarD, l73Var4, lb0Var, 0), nv0Var), nv0Var, 384);
            }
            nv0Var.p(false);
            Set set = (Set) os1VarE2.getValue();
            boolean zF2 = nv0Var.f(os1VarE2) | nv0Var.h(mb0Var);
            Object objO4 = nv0Var.O();
            if (zF2 || objO4 == obj) {
                l73Var = l73Var4;
                Object rwVar = new rw(os1VarE2, mb0Var, l73Var, null, 2);
                nv0Var.j0(rwVar);
                objO4 = rwVar;
            } else {
                l73Var = l73Var4;
            }
            rn.m(set, l73Var, (rs0) objO4, nv0Var);
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new u(i, 10, mb0Var);
        }
    }

    public static final long b(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r36, java.lang.String r37, boolean r38, defpackage.ti r39, defpackage.cs0 r40, defpackage.ns0 r41, defpackage.nv0 r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq.c(java.lang.String, java.lang.String, boolean, ti, cs0, ns0, nv0, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0338 A[PHI: r1
      0x0338: PHI (r1v40 boolean) = (r1v32 boolean), (r1v41 boolean) binds: [B:239:0x0336, B:235:0x0330] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0385 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0475  */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r45v0, types: [nv0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(int r40, int r41, defpackage.w8 r42, defpackage.um r43, defpackage.d00 r44, defpackage.nv0 r45, defpackage.bq1 r46, defpackage.dw1 r47, defpackage.x12 r48, defpackage.m22 r49, defpackage.m22 r50, defpackage.i32 r51, defpackage.o63 r52, boolean r53) {
        /*
            Method dump skipped, instruction units count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq.d(int, int, w8, um, d00, nv0, bq1, dw1, x12, m22, m22, i32, o63, boolean):void");
    }

    public static final void e(List list, Collection collection, nv0 nv0Var, int i) {
        nv0Var.b0(1537894851);
        if ((((nv0Var.h(list) ? 4 : 2) | i | (nv0Var.h(collection) ? 32 : 16)) & 19) == 18 && nv0Var.D()) {
            nv0Var.U();
        } else {
            boolean zBooleanValue = ((Boolean) nv0Var.j(r31.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                qt1 qt1Var = (qt1) it.next();
                rf1 rf1Var = qt1Var.m.j;
                boolean zG = nv0Var.g(zBooleanValue) | nv0Var.h(list) | nv0Var.h(qt1Var);
                Object objO = nv0Var.O();
                if (zG || objO == c20.a) {
                    objO = new vv(qt1Var, list, zBooleanValue);
                    nv0Var.j0(objO);
                }
                rn.g(rf1Var, (ns0) objO, nv0Var);
            }
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i, 14, list, collection);
        }
    }

    public static float f(EdgeEffect edgeEffect, float f, float f2, ua0 ua0Var) {
        float f3 = tg0.a;
        double dH = ua0Var.h() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) tg0.a) * dH;
        float fExp = (float) (Math.exp((tg0.b / tg0.c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? lf.c(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iM = vm1.M(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iM);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM);
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5 A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:32:0x00a1, B:34:0x00a5, B:37:0x00ae, B:42:0x00df, B:27:0x0079), top: B:48:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(java.lang.String r9, defpackage.ie1 r10, defpackage.os1 r11, defpackage.os1 r12, defpackage.b42 r13, defpackage.os1 r14, defpackage.os1 r15, defpackage.p40 r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq.g(java.lang.String, ie1, os1, os1, b42, os1, os1, p40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.os1 r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, defpackage.os1 r14, defpackage.os1 r15, defpackage.b42 r16, defpackage.os1 r17, defpackage.a42 r18, defpackage.q40 r19) {
        /*
            r0 = r19
            boolean r1 = r0 instanceof defpackage.nk1
            if (r1 == 0) goto L15
            r1 = r0
            nk1 r1 = (defpackage.nk1) r1
            int r2 = r1.o
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.o = r2
            goto L1a
        L15:
            nk1 r1 = new nk1
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.n
            int r2 = r1.o
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L34
            a42 r2 = r1.m
            os1 r4 = r1.l
            b42 r5 = r1.k
            os1 r6 = r1.j
            os1 r1 = r1.i
            defpackage.y02.Q(r0)
            r9 = r2
            r7 = r4
            goto L6e
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r0)
            r0 = 0
            return r0
        L3b:
            defpackage.y02.Q(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.setValue(r0)
            j90 r0 = defpackage.ac0.a
            x80 r0 = defpackage.x80.h
            rw r4 = new rw
            r9 = 4
            r5 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r1.i = r14
            r1.j = r15
            r6 = r16
            r1.k = r6
            r7 = r17
            r1.l = r7
            r9 = r18
            r1.m = r9
            r1.o = r3
            java.lang.Object r0 = defpackage.cl3.G(r0, r4, r1)
            y50 r1 = defpackage.y50.f
            if (r0 != r1) goto L6b
            return r1
        L6b:
            r1 = r14
            r5 = r6
            r6 = r15
        L6e:
            zj1 r0 = (defpackage.zj1) r0
            r1.setValue(r8)
            java.util.List r1 = r0.a
            r6.setValue(r1)
            long r1 = r0.b
            r5.h(r1)
            boolean r0 = r0.c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.setValue(r0)
            int r0 = r9.g()
            int r0 = r0 + r3
            r9.h(r0)
            dm3 r0 = defpackage.dm3.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq.h(os1, java.lang.String, java.lang.String, java.lang.String, os1, os1, b42, os1, a42, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0081 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0084 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(java.util.List r7, defpackage.i70 r8, defpackage.q40 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.b70
            if (r0 == 0) goto L13
            r0 = r9
            b70 r0 = (defpackage.b70) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            b70 r0 = new b70
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.k
            int r1 = r0.l
            r2 = 0
            r3 = 2
            r4 = 1
            y50 r5 = defpackage.y50.f
            if (r1 == 0) goto L41
            if (r1 == r4) goto L39
            if (r1 != r3) goto L33
            java.util.Iterator r7 = r0.j
            java.io.Serializable r8 = r0.i
            qk2 r8 = (defpackage.qk2) r8
            defpackage.y02.Q(r9)     // Catch: java.lang.Throwable -> L31
            goto L64
        L31:
            r9 = move-exception
            goto L7d
        L33:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r7)
            return r2
        L39:
            java.io.Serializable r7 = r0.i
            java.util.List r7 = (java.util.List) r7
            defpackage.y02.Q(r9)
            goto L5b
        L41:
            defpackage.y02.Q(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            m9 r1 = new m9
            r6 = 3
            r1.<init>(r7, r9, r2, r6)
            r0.i = r9
            r0.l = r4
            java.lang.Object r7 = r8.a(r1, r0)
            if (r7 != r5) goto L5a
            goto L92
        L5a:
            r7 = r9
        L5b:
            qk2 r8 = new qk2
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L64:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L8a
            java.lang.Object r9 = r7.next()
            ns0 r9 = (defpackage.ns0) r9
            r0.i = r8     // Catch: java.lang.Throwable -> L31
            r0.j = r7     // Catch: java.lang.Throwable -> L31
            r0.l = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = r9.h(r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != r5) goto L64
            goto L92
        L7d:
            java.lang.Object r1 = r8.f
            if (r1 != 0) goto L84
            r8.f = r9
            goto L64
        L84:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            j(r1, r9)
            goto L64
        L8a:
            java.lang.Object r7 = r8.f
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 != 0) goto L93
            dm3 r5 = defpackage.dm3.a
        L92:
            return r5
        L93:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq.i(java.util.List, i70, q40):java.lang.Object");
    }

    public static void j(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = g61.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = o62.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final void k(int i) {
        if (i >= 1) {
            return;
        }
        c.g(by1.e(i, "Expected positive parallelism level, but got "));
    }

    public static final void l(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                j(th, th2);
            }
        }
    }

    public static final Object m(p40 p40Var, gn0 gn0Var, cs0 cs0Var, ss0 ss0Var, fn0[] fn0VarArr) {
        vy vyVar = new vy(null, gn0Var, cs0Var, ss0Var, fn0VarArr);
        in0 in0Var = new in0(p40Var, p40Var.i());
        Object objC = b32.C(in0Var, true, in0Var, vyVar);
        return objC == y50.f ? objC : dm3.a;
    }

    public static final int n(int i, int i2, float f, float f2, float f3) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        return vm1.M((f3 * (i - 1 <= 1 ? r0 : 1)) + (f2 * i3) + f);
    }

    public static fu1 o(iu1 iu1Var) {
        Iterator it = pv2.H(iu1Var, new fi1(22)).iterator();
        if (!it.hasNext()) {
            c.m("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (fu1) next;
    }

    public static final o50 p(o50 o50Var, o50 o50Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 14;
        byte b = 0;
        boolean zBooleanValue = ((Boolean) o50Var.p(new z00(i, b), bool)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) o50Var2.p(new z00(i, b), bool)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return o50Var.k(o50Var2);
        }
        z00 z00Var = new z00(15, b);
        li0 li0Var = li0.f;
        o50 o50Var3 = (o50) o50Var.p(z00Var, li0Var);
        Object objP = o50Var2;
        if (zBooleanValue2) {
            objP = o50Var2.p(new z00(16, b), li0Var);
        }
        return o50Var3.k((o50) objP);
    }

    public static final ArrayList q(k51 k51Var) {
        k51Var.getClass();
        tb1 tb1VarZ0 = ((al1) k51Var).Z0();
        boolean zX = x(tb1VarZ0);
        yr1 yr1Var = (yr1) tb1VarZ0.o();
        qs1 qs1Var = (qs1) yr1Var.g;
        ArrayList arrayList = new ArrayList(qs1Var.h);
        int i = qs1Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            tb1 tb1Var = (tb1) yr1Var.get(i2);
            arrayList.add(zX ? tb1Var.l() : tb1Var.m());
        }
        return arrayList;
    }

    public static final float r(Layout layout, int i, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = rg3.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : j11.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float s(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = rg3.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? j11.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final Class t(lu luVar) {
        luVar.getClass();
        Class clsA = luVar.a();
        clsA.getClass();
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class u(lu luVar) {
        luVar.getClass();
        Class clsA = luVar.a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static final Object v(xm1 xm1Var) {
        Object objE = xm1Var.E();
        fb1 fb1Var = objE instanceof fb1 ? (fb1) objE : null;
        if (fb1Var != null) {
            return fb1Var.t;
        }
        return null;
    }

    public static String w(Class cls) {
        LinkedHashMap linkedHashMap = zv1.b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            xv1 xv1Var = (xv1) cls.getAnnotation(xv1.class);
            strValue = xv1Var != null ? xv1Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                c.g("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, strValue);
        }
        strValue.getClass();
        return strValue;
    }

    public static final boolean x(tb1 tb1Var) {
        int iOrdinal = tb1Var.M.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            c.k();
                            return false;
                        }
                        tb1 tb1VarU = tb1Var.u();
                        if (tb1VarU != null) {
                            return x(tb1VarU);
                        }
                        c.p("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final o50 y(x50 x50Var, o50 o50Var) {
        o50 o50VarP = p(x50Var.h(), o50Var, true);
        j90 j90Var = ac0.a;
        return (o50VarP == j90Var || o50VarP.m(f5.L) != null) ? o50VarP : o50VarP.k(j90Var);
    }

    public static final o60 z(rp0 rp0Var, int i) {
        int iOrdinal = rp0Var.u1().ordinal();
        o60 o60Var = o60.f;
        if (iOrdinal != 0) {
            o60 o60Var2 = o60.g;
            if (iOrdinal == 1) {
                rp0 rp0VarZ = br.z(rp0Var);
                if (rp0VarZ == null) {
                    c.p("ActiveParent with no focused child");
                    return null;
                }
                o60 o60VarZ = z(rp0VarZ, i);
                o60 o60Var3 = o60VarZ != o60Var ? o60VarZ : null;
                if (o60Var3 != null) {
                    return o60Var3;
                }
                if (rp0Var.v) {
                    return o60Var;
                }
                rp0Var.v = true;
                try {
                    gp0 gp0VarR1 = rp0Var.r1();
                    fr frVar = new fr(i);
                    ep0 ep0Var = (ep0) ((h7) vr.Y(rp0Var)).getFocusOwner();
                    rp0 rp0VarF = ep0Var.f();
                    gp0VarR1.k.h(frVar);
                    rp0 rp0VarF2 = ep0Var.f();
                    if (!frVar.b) {
                        return (rp0VarF == rp0VarF2 || rp0VarF2 == null) ? o60Var : ip0.d == ip0.c ? o60Var2 : o60.h;
                    }
                    ip0 ip0Var = ip0.b;
                    return o60Var2;
                } finally {
                    rp0Var.v = false;
                }
            }
            if (iOrdinal == 2) {
                return o60Var2;
            }
            if (iOrdinal != 3) {
                c.k();
                return null;
            }
        }
        return o60Var;
    }
}
