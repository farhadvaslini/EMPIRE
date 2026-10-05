package defpackage;

import android.content.ClipboardManager;
import android.content.Context;
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
import java.io.RandomAccessFile;
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
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public static final zj1 G(File file, long j) throws IOException {
        boolean z;
        boolean z2;
        boolean zExists = file.exists();
        ni0 ni0Var = ni0.f;
        long j2 = 0;
        if (!zExists) {
            return new zj1(0L, ni0Var, false);
        }
        long jI = y02.i(j, 0L, file.length());
        if (jI == 0) {
            return new zj1(0L, ni0Var, false);
        }
        long jMax = Math.max(0L, jI - 200000);
        int i = (int) (jI - jMax);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            randomAccessFile.seek(jMax);
            byte[] bArr = new byte[i];
            randomAccessFile.readFully(bArr);
            randomAccessFile.close();
            byte b = 10;
            if (jMax != 0) {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile.seek(jMax - 1);
                    boolean z3 = randomAccessFile.readByte() == 10;
                    randomAccessFile.close();
                    z = z3;
                } finally {
                }
            }
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < i) {
                long j3 = j2;
                int i5 = i4 + 1;
                if (bArr[i2] == b) {
                    if (z || i3 > 0) {
                        if (i4 > i3) {
                            int i6 = i4 - 1;
                            if (bArr[i6] == 13) {
                                i4 = i6;
                            }
                        }
                        z2 = z;
                        arrayList.add(new i80(((long) i3) + jMax, new String(bArr, i3, i4 - i3, ys.a)));
                    } else {
                        z2 = z;
                    }
                    i3 = i5;
                } else {
                    z2 = z;
                }
                i2++;
                z = z2;
                i4 = i5;
                j2 = j3;
                b = 10;
            }
            boolean z4 = z;
            long j4 = j2;
            if (i3 < i && (z4 || i3 > 0)) {
                arrayList.add(new i80(((long) i3) + jMax, new String(bArr, i3, i - i3, ys.a)));
            }
            List listJ0 = qx.J0(200, arrayList);
            if (listJ0.isEmpty()) {
                return new zj1(jMax, ni0Var, jMax > 0);
            }
            long j5 = ((i80) qx.q0(listJ0)).a;
            ArrayList arrayList2 = new ArrayList(rx.d0(listJ0, 10));
            Iterator it = listJ0.iterator();
            while (it.hasNext()) {
                arrayList2.add(((i80) it.next()).b);
            }
            return new zj1(j5, arrayList2, j5 > j4);
        } finally {
            try {
                throw th;
            } finally {
            }
        }
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
    */
    public static final void c(String str, String str2, boolean z, ti tiVar, cs0 cs0Var, ns0 ns0Var, nv0 nv0Var, int i, int i2) {
        String str3;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        ns0 ns0Var2;
        int i7;
        ti tiVar2;
        String str4;
        boolean z3;
        ns0 ns0Var3;
        xj2 xj2VarT;
        Object obj;
        Object obj2;
        os1 os1Var;
        boolean z4;
        Object objO;
        os1 os1Var2;
        boolean z5;
        Object objO2;
        os1 os1Var3;
        boolean z6;
        Object objO3;
        a42 a42Var;
        boolean z7;
        Object objO4;
        os1 os1Var4;
        Object objO5;
        Object objO6;
        ie1 ie1VarA;
        boolean zF;
        Object objO7;
        boolean z8;
        os1 os1Var5;
        String str5;
        os1 os1Var6;
        os1 os1Var7;
        b42 b42Var;
        os1 os1Var8;
        a42 a42Var2;
        os1 os1Var9;
        boolean zF2;
        Object objO8;
        os1 os1Var10;
        ie1 ie1Var;
        b42 b42Var2;
        a42 a42Var3;
        boolean zF3;
        Object objO9;
        a42 a42Var4;
        ie1 ie1Var2;
        boolean zF4;
        Object objO10;
        str.getClass();
        cs0Var.getClass();
        nv0Var.b0(-1803959497);
        int i8 = 2;
        int i9 = (nv0Var.f(str) ? 4 : 2) | i;
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 = i9 | 48;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i9 | (nv0Var.f(str3) ? 32 : 16);
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= nv0Var.g(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i5 = i3 | 3072;
            } else {
                i5 = i3 | (nv0Var.d(tiVar == null ? -1 : tiVar.ordinal()) ? 2048 : 1024);
            }
            int i12 = i5 | (!nv0Var.h(cs0Var) ? 16384 : 8192);
            i6 = i2 & 32;
            if (i6 == 0) {
                i7 = i12 | 196608;
                ns0Var2 = ns0Var;
            } else {
                ns0Var2 = ns0Var;
                i7 = i12 | (nv0Var.h(ns0Var2) ? 131072 : 65536);
            }
            if (nv0Var.R(i7 & 1, (74899 & i7) == 74898)) {
                nv0Var.U();
                tiVar2 = tiVar;
                str4 = str3;
                z3 = z2;
                ns0Var3 = ns0Var2;
            } else {
                String str6 = i10 != 0 ? null : str3;
                if (i11 != 0) {
                    z2 = false;
                }
                ti tiVar3 = i4 != 0 ? ti.h : tiVar;
                Object obj3 = c20.a;
                if (i6 != 0) {
                    Object objO11 = nv0Var.O();
                    if (objO11 == obj3) {
                        objO11 = new fi1(i8);
                        nv0Var.j0(objO11);
                    }
                    ns0Var2 = (ns0) objO11;
                }
                final Context context = (Context) nv0Var.j(x7.b);
                Object systemService = context.getSystemService("clipboard");
                systemService.getClass();
                ClipboardManager clipboardManager = (ClipboardManager) systemService;
                final String strM = oz2.M(R.string.launcher_log_file_missing, nv0Var);
                final String strM2 = oz2.M(R.string.launcher_log_read_error, nv0Var);
                int i13 = i7 & 112;
                boolean z9 = i13 == 32;
                Object objO12 = nv0Var.O();
                if (z9 || objO12 == obj3) {
                    objO12 = b32.w(ni0.f);
                    nv0Var.j0(objO12);
                }
                os1 os1Var11 = (os1) objO12;
                boolean z10 = i13 == 32;
                p40 p40Var = null;
                Object objO13 = nv0Var.O();
                if (z10 || objO13 == obj3) {
                    obj = obj3;
                    objO13 = new b42(0L);
                    nv0Var.j0(objO13);
                } else {
                    obj = obj3;
                }
                b42 b42Var3 = (b42) objO13;
                boolean z11 = i13 == 32;
                Object objO14 = nv0Var.O();
                if (z11) {
                    obj2 = obj;
                } else {
                    obj2 = obj;
                    if (objO14 == obj2) {
                    }
                    os1Var = (os1) objO14;
                    z4 = i13 != 32;
                    objO = nv0Var.O();
                    if (!z4 || objO == obj2) {
                        objO = b32.w(Boolean.FALSE);
                        nv0Var.j0(objO);
                    }
                    os1Var2 = (os1) objO;
                    z5 = i13 != 32;
                    objO2 = nv0Var.O();
                    if (!z5 || objO2 == obj2) {
                        objO2 = b32.w(Boolean.FALSE);
                        nv0Var.j0(objO2);
                    }
                    os1Var3 = (os1) objO2;
                    z6 = i13 != 32;
                    objO3 = nv0Var.O();
                    if (!z6 || objO3 == obj2) {
                        objO3 = new a42(-1);
                        nv0Var.j0(objO3);
                    }
                    a42Var = (a42) objO3;
                    z7 = i13 != 32;
                    objO4 = nv0Var.O();
                    if (!z7 || objO4 == obj2) {
                        objO4 = b32.w(null);
                        nv0Var.j0(objO4);
                    }
                    os1Var4 = (os1) objO4;
                    objO5 = nv0Var.O();
                    if (objO5 == obj2) {
                        objO5 = b32.w(tiVar3);
                        nv0Var.j0(objO5);
                    }
                    final os1 os1Var12 = (os1) objO5;
                    objO6 = nv0Var.O();
                    if (objO6 == obj2) {
                        objO6 = rn.A(nv0Var);
                        nv0Var.j0(objO6);
                    }
                    final x50 x50Var = (x50) objO6;
                    ie1VarA = ke1.a(nv0Var);
                    zF = nv0Var.f(os1Var3) | (i13 != 32) | nv0Var.f(strM) | nv0Var.f(strM2) | nv0Var.f(os1Var4) | nv0Var.f(os1Var11) | nv0Var.f(b42Var3) | nv0Var.f(os1Var) | nv0Var.f(a42Var);
                    objO7 = nv0Var.O();
                    if (!zF || objO7 == obj2) {
                        String str7 = str6;
                        z8 = z2;
                        objO7 = new ek1(os1Var3, str7, strM, strM2, os1Var4, os1Var11, b42Var3, os1Var, a42Var, null, 0);
                        os1Var5 = os1Var3;
                        str5 = str7;
                        os1Var6 = os1Var4;
                        os1Var7 = os1Var11;
                        b42Var = b42Var3;
                        os1Var8 = os1Var;
                        a42Var2 = a42Var;
                        nv0Var.j0(objO7);
                    } else {
                        a42Var2 = a42Var;
                        z8 = z2;
                        b42Var = b42Var3;
                        str5 = str6;
                        os1Var6 = os1Var4;
                        os1Var8 = os1Var;
                        os1Var7 = os1Var11;
                        os1Var5 = os1Var3;
                    }
                    rn.n(str5, strM, strM2, (rs0) objO7, nv0Var);
                    Boolean bool = (Boolean) os1Var8.getValue();
                    bool.getClass();
                    Boolean bool2 = (Boolean) os1Var5.getValue();
                    bool2.getClass();
                    os1Var9 = os1Var8;
                    zF2 = nv0Var.f(ie1VarA) | nv0Var.f(os1Var8) | nv0Var.f(os1Var5) | (i13 == 32) | nv0Var.f(os1Var2) | nv0Var.f(b42Var) | nv0Var.f(os1Var7) | nv0Var.f(os1Var6);
                    objO8 = nv0Var.O();
                    if (!zF2 || objO8 == obj2) {
                        b42 b42Var4 = b42Var;
                        os1Var10 = os1Var9;
                        objO8 = new ik1(ie1VarA, os1Var10, os1Var5, str5, os1Var2, b42Var4, os1Var7, os1Var6, null);
                        ie1Var = ie1VarA;
                        b42Var2 = b42Var4;
                        nv0Var.j0(objO8);
                    } else {
                        b42Var2 = b42Var;
                        ie1Var = ie1VarA;
                        os1Var10 = os1Var9;
                    }
                    rn.n(str5, bool, bool2, (rs0) objO8, nv0Var);
                    Integer numValueOf = Integer.valueOf(a42Var2.g());
                    a42Var3 = a42Var2;
                    zF3 = nv0Var.f(a42Var3) | nv0Var.f(os1Var7) | nv0Var.f(ie1Var) | nv0Var.f(os1Var5);
                    objO9 = nv0Var.O();
                    if (!zF3 || objO9 == obj2) {
                        ie1 ie1Var3 = ie1Var;
                        a42Var4 = a42Var3;
                        objO9 = new n9(ie1Var3, a42Var4, os1Var7, os1Var5, null, 8);
                        ie1Var2 = ie1Var3;
                        nv0Var.j0(objO9);
                    } else {
                        ie1Var2 = ie1Var;
                        a42Var4 = a42Var3;
                    }
                    rn.l((rs0) objO9, nv0Var, numValueOf);
                    uc2 uc2Var = (uc2) os1Var6.getValue();
                    zF4 = nv0Var.f(os1Var6) | nv0Var.f(ie1Var2);
                    objO10 = nv0Var.O();
                    if (!zF4 || objO10 == obj2) {
                        objO10 = new hd1(ie1Var2, os1Var6, p40Var, 5);
                        nv0Var.j0(objO10);
                    }
                    rn.l((rs0) objO10, nv0Var, uc2Var);
                    final b42 b42Var5 = b42Var2;
                    final os1 os1Var13 = os1Var7;
                    final os1 os1Var14 = os1Var6;
                    final String str8 = str5;
                    final ns0 ns0Var4 = ns0Var2;
                    final os1 os1Var15 = os1Var5;
                    final os1 os1Var16 = os1Var10;
                    final boolean z12 = z8;
                    final ie1 ie1Var4 = ie1Var2;
                    final a42 a42Var5 = a42Var4;
                    w22.c(null, gq.N(1939343347, new r81(str, cs0Var, clipboardManager, os1Var7, context), nv0Var), null, null, null, 0, 0L, 0L, null, gq.N(269791560, new ss0() { // from class: bk1
                        @Override // defpackage.ss0
                        public final Object e(Object obj4, Object obj5, Object obj6) {
                            z00 z00Var;
                            z00 z00Var2;
                            yp1 yp1Var;
                            float f;
                            final a42 a42Var6;
                            final os1 os1Var17;
                            final String str9;
                            final String str10;
                            final String str11;
                            final os1 os1Var18;
                            final os1 os1Var19;
                            final b42 b42Var6;
                            final os1 os1Var20;
                            os1 os1Var21;
                            x12 x12Var = (x12) obj4;
                            nv0 nv0Var2 = (nv0) obj5;
                            int iIntValue = ((Integer) obj6).intValue();
                            x12Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= nv0Var2.f(x12Var) ? 4 : 2;
                            }
                            if (nv0Var2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                bq1 bq1VarL = f80.L(f80.I(j43.c, x12Var), 16.0f, 0.0f, 2);
                                qy qyVarA = oy.a(n92.d, f5.s, nv0Var2, 0);
                                int iHashCode = Long.hashCode(nv0Var2.T);
                                n52 n52VarL = nv0Var2.l();
                                bq1 bq1VarM = lr.M(nv0Var2, bq1VarL);
                                w10.c.getClass();
                                nv0Var2.d0();
                                boolean z13 = nv0Var2.S;
                                x91 x91Var = tb1.Y;
                                if (z13) {
                                    nv0Var2.k(x91Var);
                                } else {
                                    nv0Var2.m0();
                                }
                                z00 z00Var3 = f5.E;
                                y02.F(z00Var3, nv0Var2, qyVarA);
                                z00 z00Var4 = f5.D;
                                y02.F(z00Var4, nv0Var2, n52VarL);
                                Integer numValueOf2 = Integer.valueOf(iHashCode);
                                z00 z00Var5 = f5.F;
                                y02.F(z00Var5, nv0Var2, numValueOf2);
                                y02.C(nv0Var2);
                                z00 z00Var6 = f5.C;
                                y02.F(z00Var6, nv0Var2, bq1VarM);
                                boolean z14 = z12;
                                yp1 yp1Var2 = yp1.a;
                                if (z14) {
                                    nv0Var2.a0(1983181371);
                                    z00Var = z00Var6;
                                    z00Var2 = z00Var5;
                                    yp1Var = yp1Var2;
                                    f = 8.0f;
                                    gv3.h(j43.c(yp1Var2, 1.0f), 0L, null, false, gq.N(-912456310, new w91(5, os1Var12, ns0Var4), nv0Var2), nv0Var2, 24582, 14);
                                    oz2.g(nv0Var2, j43.e(yp1Var, 8.0f));
                                    nv0Var2.p(false);
                                } else {
                                    z00Var = z00Var6;
                                    z00Var2 = z00Var5;
                                    yp1Var = yp1Var2;
                                    f = 8.0f;
                                    nv0Var2.a0(1985373412);
                                    nv0Var2.p(false);
                                }
                                bq1 bq1VarC = j43.c(yp1Var, 1.0f);
                                dp2 dp2VarA = cp2.a(new jj(f, true, new c(1)), f5.p, nv0Var2, 6);
                                int iHashCode2 = Long.hashCode(nv0Var2.T);
                                n52 n52VarL2 = nv0Var2.l();
                                bq1 bq1VarM2 = lr.M(nv0Var2, bq1VarC);
                                nv0Var2.d0();
                                if (nv0Var2.S) {
                                    nv0Var2.k(x91Var);
                                } else {
                                    nv0Var2.m0();
                                }
                                y02.F(z00Var3, nv0Var2, dp2VarA);
                                y02.F(z00Var4, nv0Var2, n52VarL2);
                                nc2.r(iHashCode2, nv0Var2, z00Var2, nv0Var2);
                                y02.F(z00Var, nv0Var2, bq1VarM2);
                                final x50 x50Var2 = x50Var;
                                boolean zH = nv0Var2.h(x50Var2);
                                os1 os1Var22 = os1Var15;
                                boolean zF5 = zH | nv0Var2.f(os1Var22);
                                String str12 = str8;
                                boolean zF6 = zF5 | nv0Var2.f(str12);
                                String str13 = strM;
                                boolean zF7 = zF6 | nv0Var2.f(str13);
                                String str14 = strM2;
                                boolean zF8 = zF7 | nv0Var2.f(str14);
                                os1 os1Var23 = os1Var14;
                                boolean zF9 = zF8 | nv0Var2.f(os1Var23);
                                os1 os1Var24 = os1Var13;
                                boolean zF10 = zF9 | nv0Var2.f(os1Var24);
                                b42 b42Var7 = b42Var5;
                                boolean zF11 = zF10 | nv0Var2.f(b42Var7);
                                os1 os1Var25 = os1Var16;
                                boolean zF12 = zF11 | nv0Var2.f(os1Var25);
                                a42 a42Var7 = a42Var5;
                                boolean zF13 = zF12 | nv0Var2.f(a42Var7);
                                Object objO15 = nv0Var2.O();
                                zj zjVar = c20.a;
                                if (zF13 || objO15 == zjVar) {
                                    a42Var6 = a42Var7;
                                    os1Var17 = os1Var22;
                                    str9 = str12;
                                    str10 = str13;
                                    str11 = str14;
                                    os1Var18 = os1Var23;
                                    os1Var19 = os1Var24;
                                    b42Var6 = b42Var7;
                                    os1Var20 = os1Var25;
                                    cs0 cs0Var2 = new cs0() { // from class: ck1
                                        @Override // defpackage.cs0
                                        public final Object a() {
                                            cl3.t(x50Var2, null, new ek1(os1Var17, str9, str10, str11, os1Var18, os1Var19, b42Var6, os1Var20, a42Var6, null, 1), 3);
                                            return dm3.a;
                                        }
                                    };
                                    nv0Var2.j0(cs0Var2);
                                    objO15 = cs0Var2;
                                } else {
                                    os1Var17 = os1Var22;
                                    str9 = str12;
                                    str10 = str13;
                                    str11 = str14;
                                    os1Var18 = os1Var23;
                                    os1Var19 = os1Var24;
                                    b42Var6 = b42Var7;
                                    os1Var20 = os1Var25;
                                    a42Var6 = a42Var7;
                                }
                                yp1 yp1Var3 = yp1Var;
                                final os1 os1Var26 = os1Var17;
                                final String str15 = str9;
                                final String str16 = str11;
                                final os1 os1Var27 = os1Var18;
                                final os1 os1Var28 = os1Var19;
                                final b42 b42Var8 = b42Var6;
                                final os1 os1Var29 = os1Var20;
                                final a42 a42Var8 = a42Var6;
                                final String str17 = str10;
                                gq.i((cs0) objO15, new jc1(1.0f, true), false, null, null, null, null, vm1.A, nv0Var2, 805306368, 508);
                                final String strM3 = oz2.M(R.string.launcher_log_cleared, nv0Var2);
                                boolean zH2 = nv0Var2.h(x50Var2) | nv0Var2.f(str15) | nv0Var2.f(os1Var26) | nv0Var2.f(str17) | nv0Var2.f(str16) | nv0Var2.f(os1Var27) | nv0Var2.f(os1Var28) | nv0Var2.f(b42Var8) | nv0Var2.f(os1Var29) | nv0Var2.f(a42Var8);
                                final Context context2 = context;
                                boolean zH3 = zH2 | nv0Var2.h(context2) | nv0Var2.f(strM3);
                                Object objO16 = nv0Var2.O();
                                if (zH3 || objO16 == zjVar) {
                                    cs0 cs0Var3 = new cs0() { // from class: dk1
                                        @Override // defpackage.cs0
                                        public final Object a() {
                                            cl3.t(x50Var2, null, new jk1(context2, strM3, str15, os1Var26, str17, str16, os1Var27, os1Var28, b42Var8, os1Var29, a42Var8, null), 3);
                                            return dm3.a;
                                        }
                                    };
                                    os1Var21 = os1Var28;
                                    nv0Var2.j0(cs0Var3);
                                    objO16 = cs0Var3;
                                } else {
                                    os1Var21 = os1Var28;
                                }
                                cs0 cs0Var4 = (cs0) objO16;
                                jc1 jc1Var = new jc1(1.0f, true);
                                b22 b22Var = xp.a;
                                r93 r93Var = hy.a;
                                long j = ((fy) nv0Var2.j(r93Var)).w;
                                long j2 = wx.g;
                                gq.i(cs0Var4, jc1Var, false, null, xp.c((fy) nv0Var2.j(r93Var)).a(j2, j, j2, j2), null, null, vm1.B, nv0Var2, 805306368, 492);
                                nv0Var2.p(true);
                                oz2.g(nv0Var2, j43.e(yp1Var3, 8.0f));
                                gv3.h(j43.c(yp1Var3, 1.0f).d(new jc1(1.0f, true)), ((fy) nv0Var2.j(r93Var)).J, null, false, gq.N(1330556463, new w91(6, ie1Var4, os1Var21), nv0Var2), nv0Var2, 24576, 12);
                                nv0Var2.p(true);
                            } else {
                                nv0Var2.U();
                            }
                            return dm3.a;
                        }
                    }, nv0Var), nv0Var, 805306416, 509);
                    ns0Var3 = ns0Var4;
                    str4 = str8;
                    z3 = z12;
                    tiVar2 = tiVar3;
                }
                objO14 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO14);
                os1Var = (os1) objO14;
                if (i13 != 32) {
                }
                objO = nv0Var.O();
                if (!z4) {
                    objO = b32.w(Boolean.FALSE);
                    nv0Var.j0(objO);
                    os1Var2 = (os1) objO;
                    if (i13 != 32) {
                    }
                    objO2 = nv0Var.O();
                    if (!z5) {
                        objO2 = b32.w(Boolean.FALSE);
                        nv0Var.j0(objO2);
                        os1Var3 = (os1) objO2;
                        if (i13 != 32) {
                        }
                        objO3 = nv0Var.O();
                        if (!z6) {
                            objO3 = new a42(-1);
                            nv0Var.j0(objO3);
                            a42Var = (a42) objO3;
                            if (i13 != 32) {
                            }
                            objO4 = nv0Var.O();
                            if (!z7) {
                                objO4 = b32.w(null);
                                nv0Var.j0(objO4);
                                os1Var4 = (os1) objO4;
                                objO5 = nv0Var.O();
                                if (objO5 == obj2) {
                                }
                                final os1 os1Var122 = (os1) objO5;
                                objO6 = nv0Var.O();
                                if (objO6 == obj2) {
                                }
                                final x50 x50Var2 = (x50) objO6;
                                ie1VarA = ke1.a(nv0Var);
                                zF = nv0Var.f(os1Var3) | (i13 != 32) | nv0Var.f(strM) | nv0Var.f(strM2) | nv0Var.f(os1Var4) | nv0Var.f(os1Var11) | nv0Var.f(b42Var3) | nv0Var.f(os1Var) | nv0Var.f(a42Var);
                                objO7 = nv0Var.O();
                                if (zF) {
                                    String str72 = str6;
                                    z8 = z2;
                                    objO7 = new ek1(os1Var3, str72, strM, strM2, os1Var4, os1Var11, b42Var3, os1Var, a42Var, null, 0);
                                    os1Var5 = os1Var3;
                                    str5 = str72;
                                    os1Var6 = os1Var4;
                                    os1Var7 = os1Var11;
                                    b42Var = b42Var3;
                                    os1Var8 = os1Var;
                                    a42Var2 = a42Var;
                                    nv0Var.j0(objO7);
                                    rn.n(str5, strM, strM2, (rs0) objO7, nv0Var);
                                    Boolean bool3 = (Boolean) os1Var8.getValue();
                                    bool3.getClass();
                                    Boolean bool22 = (Boolean) os1Var5.getValue();
                                    bool22.getClass();
                                    os1Var9 = os1Var8;
                                    zF2 = nv0Var.f(ie1VarA) | nv0Var.f(os1Var8) | nv0Var.f(os1Var5) | (i13 == 32) | nv0Var.f(os1Var2) | nv0Var.f(b42Var) | nv0Var.f(os1Var7) | nv0Var.f(os1Var6);
                                    objO8 = nv0Var.O();
                                    if (zF2) {
                                        b42 b42Var42 = b42Var;
                                        os1Var10 = os1Var9;
                                        objO8 = new ik1(ie1VarA, os1Var10, os1Var5, str5, os1Var2, b42Var42, os1Var7, os1Var6, null);
                                        ie1Var = ie1VarA;
                                        b42Var2 = b42Var42;
                                        nv0Var.j0(objO8);
                                        rn.n(str5, bool3, bool22, (rs0) objO8, nv0Var);
                                        Integer numValueOf2 = Integer.valueOf(a42Var2.g());
                                        a42Var3 = a42Var2;
                                        zF3 = nv0Var.f(a42Var3) | nv0Var.f(os1Var7) | nv0Var.f(ie1Var) | nv0Var.f(os1Var5);
                                        objO9 = nv0Var.O();
                                        if (zF3) {
                                            ie1 ie1Var32 = ie1Var;
                                            a42Var4 = a42Var3;
                                            objO9 = new n9(ie1Var32, a42Var4, os1Var7, os1Var5, null, 8);
                                            ie1Var2 = ie1Var32;
                                            nv0Var.j0(objO9);
                                            rn.l((rs0) objO9, nv0Var, numValueOf2);
                                            uc2 uc2Var2 = (uc2) os1Var6.getValue();
                                            zF4 = nv0Var.f(os1Var6) | nv0Var.f(ie1Var2);
                                            objO10 = nv0Var.O();
                                            if (!zF4) {
                                                objO10 = new hd1(ie1Var2, os1Var6, p40Var, 5);
                                                nv0Var.j0(objO10);
                                                rn.l((rs0) objO10, nv0Var, uc2Var2);
                                                final b42 b42Var52 = b42Var2;
                                                final os1 os1Var132 = os1Var7;
                                                final os1 os1Var142 = os1Var6;
                                                final String str82 = str5;
                                                final ns0 ns0Var42 = ns0Var2;
                                                final os1 os1Var152 = os1Var5;
                                                final os1 os1Var162 = os1Var10;
                                                final boolean z122 = z8;
                                                final ie1 ie1Var42 = ie1Var2;
                                                final a42 a42Var52 = a42Var4;
                                                w22.c(null, gq.N(1939343347, new r81(str, cs0Var, clipboardManager, os1Var7, context), nv0Var), null, null, null, 0, 0L, 0L, null, gq.N(269791560, new ss0() { // from class: bk1
                                                    @Override // defpackage.ss0
                                                    public final Object e(Object obj4, Object obj5, Object obj6) {
                                                        z00 z00Var;
                                                        z00 z00Var2;
                                                        yp1 yp1Var;
                                                        float f;
                                                        final a42 a42Var6;
                                                        final os1 os1Var17;
                                                        final String str9;
                                                        final String str10;
                                                        final String str11;
                                                        final os1 os1Var18;
                                                        final os1 os1Var19;
                                                        final b42 b42Var6;
                                                        final os1 os1Var20;
                                                        os1 os1Var21;
                                                        x12 x12Var = (x12) obj4;
                                                        nv0 nv0Var2 = (nv0) obj5;
                                                        int iIntValue = ((Integer) obj6).intValue();
                                                        x12Var.getClass();
                                                        if ((iIntValue & 6) == 0) {
                                                            iIntValue |= nv0Var2.f(x12Var) ? 4 : 2;
                                                        }
                                                        if (nv0Var2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                                                            bq1 bq1VarL = f80.L(f80.I(j43.c, x12Var), 16.0f, 0.0f, 2);
                                                            qy qyVarA = oy.a(n92.d, f5.s, nv0Var2, 0);
                                                            int iHashCode = Long.hashCode(nv0Var2.T);
                                                            n52 n52VarL = nv0Var2.l();
                                                            bq1 bq1VarM = lr.M(nv0Var2, bq1VarL);
                                                            w10.c.getClass();
                                                            nv0Var2.d0();
                                                            boolean z13 = nv0Var2.S;
                                                            x91 x91Var = tb1.Y;
                                                            if (z13) {
                                                                nv0Var2.k(x91Var);
                                                            } else {
                                                                nv0Var2.m0();
                                                            }
                                                            z00 z00Var3 = f5.E;
                                                            y02.F(z00Var3, nv0Var2, qyVarA);
                                                            z00 z00Var4 = f5.D;
                                                            y02.F(z00Var4, nv0Var2, n52VarL);
                                                            Integer numValueOf22 = Integer.valueOf(iHashCode);
                                                            z00 z00Var5 = f5.F;
                                                            y02.F(z00Var5, nv0Var2, numValueOf22);
                                                            y02.C(nv0Var2);
                                                            z00 z00Var6 = f5.C;
                                                            y02.F(z00Var6, nv0Var2, bq1VarM);
                                                            boolean z14 = z122;
                                                            yp1 yp1Var2 = yp1.a;
                                                            if (z14) {
                                                                nv0Var2.a0(1983181371);
                                                                z00Var = z00Var6;
                                                                z00Var2 = z00Var5;
                                                                yp1Var = yp1Var2;
                                                                f = 8.0f;
                                                                gv3.h(j43.c(yp1Var2, 1.0f), 0L, null, false, gq.N(-912456310, new w91(5, os1Var122, ns0Var42), nv0Var2), nv0Var2, 24582, 14);
                                                                oz2.g(nv0Var2, j43.e(yp1Var, 8.0f));
                                                                nv0Var2.p(false);
                                                            } else {
                                                                z00Var = z00Var6;
                                                                z00Var2 = z00Var5;
                                                                yp1Var = yp1Var2;
                                                                f = 8.0f;
                                                                nv0Var2.a0(1985373412);
                                                                nv0Var2.p(false);
                                                            }
                                                            bq1 bq1VarC = j43.c(yp1Var, 1.0f);
                                                            dp2 dp2VarA = cp2.a(new jj(f, true, new c(1)), f5.p, nv0Var2, 6);
                                                            int iHashCode2 = Long.hashCode(nv0Var2.T);
                                                            n52 n52VarL2 = nv0Var2.l();
                                                            bq1 bq1VarM2 = lr.M(nv0Var2, bq1VarC);
                                                            nv0Var2.d0();
                                                            if (nv0Var2.S) {
                                                                nv0Var2.k(x91Var);
                                                            } else {
                                                                nv0Var2.m0();
                                                            }
                                                            y02.F(z00Var3, nv0Var2, dp2VarA);
                                                            y02.F(z00Var4, nv0Var2, n52VarL2);
                                                            nc2.r(iHashCode2, nv0Var2, z00Var2, nv0Var2);
                                                            y02.F(z00Var, nv0Var2, bq1VarM2);
                                                            final x50 x50Var22 = x50Var2;
                                                            boolean zH = nv0Var2.h(x50Var22);
                                                            os1 os1Var22 = os1Var152;
                                                            boolean zF5 = zH | nv0Var2.f(os1Var22);
                                                            String str12 = str82;
                                                            boolean zF6 = zF5 | nv0Var2.f(str12);
                                                            String str13 = strM;
                                                            boolean zF7 = zF6 | nv0Var2.f(str13);
                                                            String str14 = strM2;
                                                            boolean zF8 = zF7 | nv0Var2.f(str14);
                                                            os1 os1Var23 = os1Var142;
                                                            boolean zF9 = zF8 | nv0Var2.f(os1Var23);
                                                            os1 os1Var24 = os1Var132;
                                                            boolean zF10 = zF9 | nv0Var2.f(os1Var24);
                                                            b42 b42Var7 = b42Var52;
                                                            boolean zF11 = zF10 | nv0Var2.f(b42Var7);
                                                            os1 os1Var25 = os1Var162;
                                                            boolean zF12 = zF11 | nv0Var2.f(os1Var25);
                                                            a42 a42Var7 = a42Var52;
                                                            boolean zF13 = zF12 | nv0Var2.f(a42Var7);
                                                            Object objO15 = nv0Var2.O();
                                                            zj zjVar = c20.a;
                                                            if (zF13 || objO15 == zjVar) {
                                                                a42Var6 = a42Var7;
                                                                os1Var17 = os1Var22;
                                                                str9 = str12;
                                                                str10 = str13;
                                                                str11 = str14;
                                                                os1Var18 = os1Var23;
                                                                os1Var19 = os1Var24;
                                                                b42Var6 = b42Var7;
                                                                os1Var20 = os1Var25;
                                                                cs0 cs0Var2 = new cs0() { // from class: ck1
                                                                    @Override // defpackage.cs0
                                                                    public final Object a() {
                                                                        cl3.t(x50Var22, null, new ek1(os1Var17, str9, str10, str11, os1Var18, os1Var19, b42Var6, os1Var20, a42Var6, null, 1), 3);
                                                                        return dm3.a;
                                                                    }
                                                                };
                                                                nv0Var2.j0(cs0Var2);
                                                                objO15 = cs0Var2;
                                                            } else {
                                                                os1Var17 = os1Var22;
                                                                str9 = str12;
                                                                str10 = str13;
                                                                str11 = str14;
                                                                os1Var18 = os1Var23;
                                                                os1Var19 = os1Var24;
                                                                b42Var6 = b42Var7;
                                                                os1Var20 = os1Var25;
                                                                a42Var6 = a42Var7;
                                                            }
                                                            yp1 yp1Var3 = yp1Var;
                                                            final os1 os1Var26 = os1Var17;
                                                            final String str15 = str9;
                                                            final String str16 = str11;
                                                            final os1 os1Var27 = os1Var18;
                                                            final os1 os1Var28 = os1Var19;
                                                            final b42 b42Var8 = b42Var6;
                                                            final os1 os1Var29 = os1Var20;
                                                            final a42 a42Var8 = a42Var6;
                                                            final String str17 = str10;
                                                            gq.i((cs0) objO15, new jc1(1.0f, true), false, null, null, null, null, vm1.A, nv0Var2, 805306368, 508);
                                                            final String strM3 = oz2.M(R.string.launcher_log_cleared, nv0Var2);
                                                            boolean zH2 = nv0Var2.h(x50Var22) | nv0Var2.f(str15) | nv0Var2.f(os1Var26) | nv0Var2.f(str17) | nv0Var2.f(str16) | nv0Var2.f(os1Var27) | nv0Var2.f(os1Var28) | nv0Var2.f(b42Var8) | nv0Var2.f(os1Var29) | nv0Var2.f(a42Var8);
                                                            final Context context2 = context;
                                                            boolean zH3 = zH2 | nv0Var2.h(context2) | nv0Var2.f(strM3);
                                                            Object objO16 = nv0Var2.O();
                                                            if (zH3 || objO16 == zjVar) {
                                                                cs0 cs0Var3 = new cs0() { // from class: dk1
                                                                    @Override // defpackage.cs0
                                                                    public final Object a() {
                                                                        cl3.t(x50Var22, null, new jk1(context2, strM3, str15, os1Var26, str17, str16, os1Var27, os1Var28, b42Var8, os1Var29, a42Var8, null), 3);
                                                                        return dm3.a;
                                                                    }
                                                                };
                                                                os1Var21 = os1Var28;
                                                                nv0Var2.j0(cs0Var3);
                                                                objO16 = cs0Var3;
                                                            } else {
                                                                os1Var21 = os1Var28;
                                                            }
                                                            cs0 cs0Var4 = (cs0) objO16;
                                                            jc1 jc1Var = new jc1(1.0f, true);
                                                            b22 b22Var = xp.a;
                                                            r93 r93Var = hy.a;
                                                            long j = ((fy) nv0Var2.j(r93Var)).w;
                                                            long j2 = wx.g;
                                                            gq.i(cs0Var4, jc1Var, false, null, xp.c((fy) nv0Var2.j(r93Var)).a(j2, j, j2, j2), null, null, vm1.B, nv0Var2, 805306368, 492);
                                                            nv0Var2.p(true);
                                                            oz2.g(nv0Var2, j43.e(yp1Var3, 8.0f));
                                                            gv3.h(j43.c(yp1Var3, 1.0f).d(new jc1(1.0f, true)), ((fy) nv0Var2.j(r93Var)).J, null, false, gq.N(1330556463, new w91(6, ie1Var42, os1Var21), nv0Var2), nv0Var2, 24576, 12);
                                                            nv0Var2.p(true);
                                                        } else {
                                                            nv0Var2.U();
                                                        }
                                                        return dm3.a;
                                                    }
                                                }, nv0Var), nv0Var, 805306416, 509);
                                                ns0Var3 = ns0Var42;
                                                str4 = str82;
                                                z3 = z122;
                                                tiVar2 = tiVar3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT == null) {
                xj2VarT.d = new n01(str, str4, z3, tiVar2, cs0Var, ns0Var3, i, i2);
                return;
            }
            return;
        }
        i3 |= 384;
        z2 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        int i122 = i5 | (!nv0Var.h(cs0Var) ? 16384 : 8192);
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        if (nv0Var.R(i7 & 1, (74899 & i7) == 74898)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT == null) {
        }
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
    */
    public static final void d(int i, int i2, w8 w8Var, um umVar, d00 d00Var, nv0 nv0Var, bq1 bq1Var, dw1 dw1Var, x12 x12Var, m22 m22Var, m22 m22Var2, i32 i32Var, o63 o63Var, boolean z) {
        int i3;
        int i4;
        bq1 bq1Var2;
        i32 i32Var2;
        boolean z2;
        boolean z3;
        boolean zF;
        Object x22Var;
        int i5;
        int i6;
        ?? r13;
        i32 i32Var3;
        x50 x50Var;
        y61 y61Var;
        int i7;
        Object obj;
        int i8;
        Object obj2;
        zo zoVar;
        bb1 bb1Var;
        int i9;
        Object obj3;
        bq1 bq1VarS;
        dw1 dw1Var2 = dw1Var;
        tm tmVar = f5.t;
        nv0Var.b0(-572816025);
        if ((i & 6) == 0) {
            i3 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= nv0Var.f(i32Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= nv0Var.f(x12Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= nv0Var.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= nv0Var.d(1) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= nv0Var.f(o63Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= nv0Var.g(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= nv0Var.f(w8Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= nv0Var.d(0) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= nv0Var.c(0.0f) ? 536870912 : 268435456;
        }
        int i10 = i3;
        if ((i2 & 6) == 0) {
            i4 = (nv0Var.f(m22Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= nv0Var.h(dw1Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= nv0Var.h(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= nv0Var.f(tmVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= nv0Var.f(umVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= nv0Var.f(m22Var2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= nv0Var.h(d00Var) ? 1048576 : 524288;
        }
        if (nv0Var.R(i10 & 1, ((i10 & 306783379) == 306783378 && (599187 & i4) == 599186) ? false : true)) {
            int i11 = i10 & 112;
            boolean z4 = i11 == 32;
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            Object obj4 = objO;
            if (z4 || objO == zjVar) {
                fd1 fd1Var = new fd1(i32Var, 0);
                nv0Var.j0(fd1Var);
                obj4 = fd1Var;
            }
            cs0 cs0Var = (cs0) obj4;
            int i12 = i10 >> 3;
            int i13 = i12 & 14;
            int i14 = i4 >> 15;
            int i15 = i13 | (i14 & 112) | (i4 & 896);
            int i16 = i4;
            os1 os1VarZ = b32.z(d00Var, nv0Var);
            os1 os1VarZ2 = b32.z(null, nv0Var);
            boolean zF2 = ((((i15 & 14) ^ 6) > 4 && nv0Var.f(i32Var)) || (i15 & 6) == 4) | nv0Var.f(os1VarZ) | nv0Var.f(os1VarZ2) | nv0Var.f(cs0Var);
            Object objO2 = nv0Var.O();
            if (zF2 || objO2 == zjVar) {
                m22 m22Var3 = m22.k;
                objO2 = new id1(0, 0, e93.class, b32.k(new u1(29, b32.k(new ok(os1VarZ, os1VarZ2, cs0Var, 8), m22Var3), i32Var), m22Var3), "value", "getValue()Ljava/lang/Object;");
                nv0Var.j0(objO2);
            }
            y61 y61Var2 = (y61) objO2;
            Object objO3 = nv0Var.O();
            Object obj5 = objO3;
            if (objO3 == zjVar) {
                x50 x50VarA = rn.A(nv0Var);
                nv0Var.j0(x50VarA);
                obj5 = x50VarA;
            }
            x50 x50Var2 = (x50) obj5;
            boolean z5 = i11 == 32;
            Object objO4 = nv0Var.O();
            Object obj6 = objO4;
            if (z5 || objO4 == zjVar) {
                fd1 fd1Var2 = new fd1(i32Var, 1);
                nv0Var.j0(fd1Var2);
                obj6 = fd1Var2;
            }
            cs0 cs0Var2 = (cs0) obj6;
            int i17 = i10 >> 9;
            int i18 = (i10 & 65520) | (i17 & 458752) | (i17 & 3670016) | ((i16 << 21) & 29360128);
            int i19 = i16 << 15;
            int i20 = i18 | (i19 & 234881024) | (i19 & 1879048192);
            boolean z6 = ((((i20 & 896) ^ 384) > 256 && nv0Var.f(x12Var)) || (i20 & 384) == 256) | ((((i20 & 112) ^ 48) > 32 && nv0Var.f(i32Var)) || (i20 & 48) == 32) | ((((i20 & 7168) ^ 3072) > 2048 && nv0Var.g(false)) || (i20 & 3072) == 2048);
            if (((57344 & i20) ^ 24576) <= 16384 || !nv0Var.d(1)) {
                boolean z7 = (i20 & 24576) == 16384;
                boolean zF3 = ((((i20 & 234881024) ^ 100663296) > 67108864 && nv0Var.f(tmVar)) || (i20 & 100663296) == 67108864) | z6 | z7 | ((((i20 & 1879048192) ^ 805306368) > 536870912 && nv0Var.f(umVar)) || (i20 & 805306368) == 536870912) | ((((i20 & 3670016) ^ 1572864) > 1048576 && nv0Var.c(0.0f)) || (i20 & 1572864) == 1048576) | ((((i20 & 29360128) ^ 12582912) > 8388608 && nv0Var.f(m22Var)) || (i20 & 12582912) == 8388608) | ((((i14 & 14) ^ 6) > 4 && nv0Var.f(m22Var2)) || (i14 & 6) == 4) | nv0Var.f(cs0Var2);
                if (((i20 & 458752) ^ 196608) > 131072) {
                    z2 = false;
                    if (nv0Var.d(0)) {
                        z3 = true;
                        zF = zF3 | z3 | nv0Var.f(x50Var2);
                        Object objO5 = nv0Var.O();
                        if (!zF || objO5 == zjVar) {
                            i5 = i11;
                            i6 = 4;
                            r13 = z2;
                            i32Var3 = i32Var;
                            x22Var = new x22(i32Var3, x12Var, m22Var, y61Var2, cs0Var2, umVar, m22Var2, x50Var2);
                            x50Var = x50Var2;
                            y61Var = y61Var2;
                            nv0Var.j0(x22Var);
                        } else {
                            r13 = z2;
                            x50Var = x50Var2;
                            x22Var = objO5;
                            i6 = 4;
                            i32Var3 = i32Var;
                            y61Var = y61Var2;
                            i5 = i11;
                        }
                        cd1 cd1Var = (cd1) x22Var;
                        i7 = (nv0Var.g(r13) ? 1 : 0) | ((((i13 ^ 6) > i6 || !nv0Var.f(i32Var3)) && (i12 & 6) != i6) ? r13 : 1);
                        Object objO6 = nv0Var.O();
                        obj = objO6;
                        if (i7 != 0 || objO6 == zjVar) {
                            rd1 rd1Var = new rd1(i32Var3, r13);
                            nv0Var.j0(rd1Var);
                            obj = rd1Var;
                        }
                        pd1 pd1Var = (pd1) obj;
                        i8 = ((i10 & 458752) != 131072 ? 1 : r13) | (i5 != 32 ? 1 : r13);
                        Object objO7 = nv0Var.O();
                        obj2 = objO7;
                        if (i8 == 0 || objO7 == zjVar) {
                            m32 m32Var = new m32(o63Var, i32Var3);
                            nv0Var.j0(m32Var);
                            obj2 = m32Var;
                        }
                        m32 m32Var2 = (m32) obj2;
                        zoVar = (zo) nv0Var.j(bp.a);
                        bb1Var = (bb1) nv0Var.j(s20.n);
                        i9 = (i5 != 32 ? 1 : r13) | (nv0Var.f(zoVar) ? 1 : 0) | (nv0Var.d(bb1Var.ordinal()) ? 1 : 0);
                        Object objO8 = nv0Var.O();
                        obj3 = objO8;
                        if (i9 == 0 || objO8 == zjVar) {
                            o22 o22Var = new o22(i32Var3, zoVar, bb1Var);
                            nv0Var.j0(o22Var);
                            obj3 = o22Var;
                        }
                        o22 o22Var2 = (o22) obj3;
                        yp1 yp1Var = yp1.a;
                        t02 t02Var = t02.g;
                        if (z) {
                            nv0Var.a0(-853304645);
                            nv0Var.p(r13);
                            bq1VarS = yp1Var;
                        } else {
                            nv0Var.a0(-853734429);
                            int i21 = i13 | ((i10 >> 21) & 112);
                            int i22 = (((((i21 & 14) ^ 6) <= i6 || !nv0Var.f(i32Var3)) && (i21 & 6) != i6) ? r13 : 1) | (((((i21 & 112) ^ 48) <= 32 || !nv0Var.d(r13)) && (i21 & 48) != 32) ? r13 : 1);
                            Object objO9 = nv0Var.O();
                            Object obj7 = objO9;
                            if (i22 != 0 || objO9 == zjVar) {
                                n22 n22Var = new n22(i32Var3);
                                nv0Var.j0(n22Var);
                                obj7 = n22Var;
                            }
                            bq1VarS = n92.s((n22) obj7, i32Var3.u, t02Var);
                            nv0Var.p(r13);
                        }
                        bq1Var2 = bq1Var;
                        bq1 bq1VarV = w7.V(bq1Var2.d(i32Var3.x).d(i32Var3.v), y61Var, pd1Var, t02Var, z);
                        i32Var2 = i32Var3;
                        bq1 bq1VarD = cl3.B((!z ? bq1VarV.d(su2.a(yp1Var, r13, new vv((boolean) r13, i32Var3, x50Var, 2))) : bq1VarV.d(yp1Var)).d(bq1VarS), i32Var3, t02Var, w8Var, z, m32Var2, i32Var3.p, o22Var2).d(ob3.a(yp1Var, i32Var2, new v8(4, i32Var2)));
                        dw1Var2 = dw1Var;
                        pq.d(y61Var, r51.v(bq1VarD, dw1Var2, null), i32Var2.s, cd1Var, nv0Var, 0);
                    }
                } else {
                    z2 = false;
                }
                if ((i20 & 196608) != 131072) {
                    z3 = z2;
                }
                zF = zF3 | z3 | nv0Var.f(x50Var2);
                Object objO52 = nv0Var.O();
                if (zF) {
                    i5 = i11;
                    i6 = 4;
                    r13 = z2;
                    i32Var3 = i32Var;
                    x22Var = new x22(i32Var3, x12Var, m22Var, y61Var2, cs0Var2, umVar, m22Var2, x50Var2);
                    x50Var = x50Var2;
                    y61Var = y61Var2;
                    nv0Var.j0(x22Var);
                    cd1 cd1Var2 = (cd1) x22Var;
                    if ((i13 ^ 6) > i6) {
                        i7 = (nv0Var.g(r13) ? 1 : 0) | ((((i13 ^ 6) > i6 || !nv0Var.f(i32Var3)) && (i12 & 6) != i6) ? r13 : 1);
                        Object objO62 = nv0Var.O();
                        obj = objO62;
                        if (i7 != 0) {
                            rd1 rd1Var2 = new rd1(i32Var3, r13);
                            nv0Var.j0(rd1Var2);
                            obj = rd1Var2;
                            pd1 pd1Var2 = (pd1) obj;
                            if (i5 != 32) {
                            }
                            i8 = ((i10 & 458752) != 131072 ? 1 : r13) | (i5 != 32 ? 1 : r13);
                            Object objO72 = nv0Var.O();
                            obj2 = objO72;
                            if (i8 == 0) {
                                m32 m32Var3 = new m32(o63Var, i32Var3);
                                nv0Var.j0(m32Var3);
                                obj2 = m32Var3;
                                m32 m32Var22 = (m32) obj2;
                                zoVar = (zo) nv0Var.j(bp.a);
                                bb1Var = (bb1) nv0Var.j(s20.n);
                                i9 = (i5 != 32 ? 1 : r13) | (nv0Var.f(zoVar) ? 1 : 0) | (nv0Var.d(bb1Var.ordinal()) ? 1 : 0);
                                Object objO82 = nv0Var.O();
                                obj3 = objO82;
                                if (i9 == 0) {
                                    o22 o22Var3 = new o22(i32Var3, zoVar, bb1Var);
                                    nv0Var.j0(o22Var3);
                                    obj3 = o22Var3;
                                    o22 o22Var22 = (o22) obj3;
                                    yp1 yp1Var2 = yp1.a;
                                    t02 t02Var2 = t02.g;
                                    if (z) {
                                    }
                                    bq1Var2 = bq1Var;
                                    bq1 bq1VarV2 = w7.V(bq1Var2.d(i32Var3.x).d(i32Var3.v), y61Var, pd1Var2, t02Var2, z);
                                    i32Var2 = i32Var3;
                                    bq1 bq1VarD2 = cl3.B((!z ? bq1VarV2.d(su2.a(yp1Var2, r13, new vv((boolean) r13, i32Var3, x50Var, 2))) : bq1VarV2.d(yp1Var2)).d(bq1VarS), i32Var3, t02Var2, w8Var, z, m32Var22, i32Var3.p, o22Var22).d(ob3.a(yp1Var2, i32Var2, new v8(4, i32Var2)));
                                    dw1Var2 = dw1Var;
                                    pq.d(y61Var, r51.v(bq1VarD2, dw1Var2, null), i32Var2.s, cd1Var2, nv0Var, 0);
                                }
                            }
                        }
                    } else {
                        i7 = (nv0Var.g(r13) ? 1 : 0) | ((((i13 ^ 6) > i6 || !nv0Var.f(i32Var3)) && (i12 & 6) != i6) ? r13 : 1);
                        Object objO622 = nv0Var.O();
                        obj = objO622;
                        if (i7 != 0) {
                        }
                    }
                }
            }
        } else {
            bq1Var2 = bq1Var;
            i32Var2 = i32Var;
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new gd1(bq1Var2, i32Var2, x12Var, o63Var, z, w8Var, m22Var, dw1Var2, umVar, m22Var2, d00Var, i, i2);
        }
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
    */
    public static final Object g(String str, ie1 ie1Var, os1 os1Var, os1 os1Var2, b42 b42Var, os1 os1Var3, os1 os1Var4, p40 p40Var) throws Throwable {
        lk1 lk1Var;
        Throwable th;
        int i;
        b42 b42Var2;
        os1 os1Var5;
        os1 os1Var6;
        int i2;
        zj1 zj1Var;
        if (p40Var instanceof lk1) {
            lk1Var = (lk1) p40Var;
            int i3 = lk1Var.q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lk1Var.q = i3 - Integer.MIN_VALUE;
            } else {
                lk1Var = new lk1(p40Var);
            }
        }
        Object obj = lk1Var.p;
        int i4 = lk1Var.q;
        dm3 dm3Var = dm3.a;
        if (i4 != 0) {
            if (i4 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = lk1Var.o;
            i2 = lk1Var.n;
            os1 os1Var7 = lk1Var.m;
            os1 os1Var8 = lk1Var.l;
            b42Var2 = lk1Var.k;
            os1 os1Var9 = lk1Var.j;
            os1 os1Var10 = lk1Var.i;
            try {
                y02.Q(obj);
                os1Var6 = os1Var7;
                os1Var5 = os1Var8;
                os1Var = os1Var10;
                os1Var2 = os1Var9;
                zj1Var = (zj1) obj;
                if (zj1Var != null) {
                    List list = zj1Var.a;
                    if (!list.isEmpty()) {
                        os1Var5.setValue(qx.D0(list, (List) os1Var5.getValue()));
                        b42Var2.h(zj1Var.b);
                        os1Var.setValue(Boolean.valueOf(zj1Var.c));
                        os1Var6.setValue(new uc2(list.size() + i2, i));
                        os1Var2.setValue(Boolean.FALSE);
                        return dm3Var;
                    }
                }
                Boolean bool = Boolean.FALSE;
                os1Var.setValue(bool);
                os1Var2.setValue(bool);
                return dm3Var;
            } catch (Throwable th2) {
                th = th2;
                os1Var2 = os1Var9;
                os1Var2.setValue(Boolean.FALSE);
                throw th;
            }
        }
        y02.Q(obj);
        if (str == null || !((Boolean) os1Var.getValue()).booleanValue() || ((Boolean) os1Var2.getValue()).booleanValue()) {
            return dm3Var;
        }
        int iG = ie1Var.g();
        int iH = ie1Var.h();
        long jG = b42Var.g();
        os1Var2.setValue(Boolean.TRUE);
        try {
            j90 j90Var = ac0.a;
            x80 x80Var = x80.h;
            mk1 mk1Var = new mk1(str, jG, null);
            lk1Var.i = os1Var;
            lk1Var.j = os1Var2;
            lk1Var.k = b42Var;
            lk1Var.l = os1Var3;
            lk1Var.m = os1Var4;
            lk1Var.n = iG;
            lk1Var.o = iH;
            lk1Var.q = 1;
            Object objG = cl3.G(x80Var, mk1Var, lk1Var);
            y50 y50Var = y50.f;
            if (objG == y50Var) {
                return y50Var;
            }
            i = iH;
            b42Var2 = b42Var;
            os1Var5 = os1Var3;
            os1Var6 = os1Var4;
            i2 = iG;
            obj = objG;
            zj1Var = (zj1) obj;
            if (zj1Var != null) {
            }
            Boolean bool2 = Boolean.FALSE;
            os1Var.setValue(bool2);
            os1Var2.setValue(bool2);
            return dm3Var;
        } catch (Throwable th3) {
            th = th3;
            os1Var2.setValue(Boolean.FALSE);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(os1 os1Var, String str, String str2, String str3, os1 os1Var2, os1 os1Var3, b42 b42Var, os1 os1Var4, a42 a42Var, q40 q40Var) {
        nk1 nk1Var;
        os1 os1Var5;
        a42 a42Var2;
        os1 os1Var6;
        b42 b42Var2;
        os1 os1Var7;
        if (q40Var instanceof nk1) {
            nk1Var = (nk1) q40Var;
            int i = nk1Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                nk1Var.o = i - Integer.MIN_VALUE;
            } else {
                nk1Var = new nk1(q40Var);
            }
        }
        Object objG = nk1Var.n;
        int i2 = nk1Var.o;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(objG);
            os1Var.setValue(Boolean.FALSE);
            j90 j90Var = ac0.a;
            x80 x80Var = x80.h;
            rw rwVar = new rw(str, str2, str3, p40Var, 4);
            nk1Var.i = os1Var2;
            nk1Var.j = os1Var3;
            nk1Var.k = b42Var;
            os1Var5 = os1Var4;
            nk1Var.l = os1Var5;
            a42Var2 = a42Var;
            nk1Var.m = a42Var2;
            nk1Var.o = 1;
            objG = cl3.G(x80Var, rwVar, nk1Var);
            y50 y50Var = y50.f;
            if (objG == y50Var) {
                return y50Var;
            }
            os1Var6 = os1Var2;
            b42Var2 = b42Var;
            os1Var7 = os1Var3;
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a42 a42Var3 = nk1Var.m;
            os1 os1Var8 = nk1Var.l;
            b42Var2 = nk1Var.k;
            os1Var7 = nk1Var.j;
            os1Var6 = nk1Var.i;
            y02.Q(objG);
            a42Var2 = a42Var3;
            os1Var5 = os1Var8;
        }
        zj1 zj1Var = (zj1) objG;
        os1Var6.setValue(null);
        os1Var7.setValue(zj1Var.a);
        b42Var2.h(zj1Var.b);
        os1Var5.setValue(Boolean.valueOf(zj1Var.c));
        a42Var2.h(a42Var2.g() + 1);
        return dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0081 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0084 -> B:25:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(List list, i70 i70Var, q40 q40Var) throws Throwable {
        b70 b70Var;
        List list2;
        qk2 qk2Var;
        Iterator it;
        Throwable th;
        if (q40Var instanceof b70) {
            b70Var = (b70) q40Var;
            int i = b70Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                b70Var.l = i - Integer.MIN_VALUE;
            } else {
                b70Var = new b70(q40Var);
            }
        }
        Object obj = b70Var.k;
        int i2 = b70Var.l;
        p40 p40Var = null;
        Object obj2 = y50.f;
        if (i2 == 0) {
            y02.Q(obj);
            ArrayList arrayList = new ArrayList();
            m9 m9Var = new m9(list, arrayList, p40Var, 3);
            b70Var.i = arrayList;
            b70Var.l = 1;
            if (i70Var.a(m9Var, b70Var) == obj2) {
                return obj2;
            }
            list2 = arrayList;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = b70Var.j;
                qk2Var = (qk2) b70Var.i;
                try {
                    y02.Q(obj);
                } catch (Throwable th2) {
                    Object obj3 = qk2Var.f;
                    if (obj3 == null) {
                        qk2Var.f = th2;
                    } else {
                        j((Throwable) obj3, th2);
                    }
                }
                while (it.hasNext()) {
                    ns0 ns0Var = (ns0) it.next();
                    b70Var.i = qk2Var;
                    b70Var.j = it;
                    b70Var.l = 2;
                    if (ns0Var.h(b70Var) == obj2) {
                        return obj2;
                    }
                }
                th = (Throwable) qk2Var.f;
                if (th != null) {
                    return dm3.a;
                }
                throw th;
            }
            list2 = (List) b70Var.i;
            y02.Q(obj);
        }
        qk2Var = new qk2();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) qk2Var.f;
        if (th != null) {
        }
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
