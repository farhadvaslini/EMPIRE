package defpackage;

import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class br implements lt2 {
    public static w01 f;
    public static w01 g;
    public static w01 h;
    public static w01 i;
    public static w01 j;

    public static final w01 A() {
        w01 w01Var = f;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = vo3.a;
        w73 w73Var = new w73(wx.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new q42(10.0f, 6.0f));
        arrayList.add(new p42(8.59f, 7.41f));
        arrayList.add(new p42(13.17f, 12.0f));
        arrayList.add(new x42(-4.58f, 4.59f));
        arrayList.add(new p42(10.0f, 18.0f));
        arrayList.add(new x42(6.0f, -6.0f));
        arrayList.add(m42.c);
        v01.a(v01Var, arrayList, w73Var);
        w01 w01VarB = v01Var.b();
        f = w01VarB;
        return w01VarB;
    }

    public static final a20 B(View view) {
        Object tag = view.getTag(2131230784);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (a20) weakReference.get();
        }
        return null;
    }

    public static final String[] C(g40 g40Var) {
        g40Var.getClass();
        return (String[]) ((e8) g40Var).b.toArray(new String[0]);
    }

    public static final w01 D() {
        w01 w01Var = i;
        if (w01Var != null) {
            return w01Var;
        }
        v01 v01Var = new v01("Filled.Keyboard", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = vo3.a;
        w73 w73Var = new w73(wx.b);
        tx0 tx0Var = new tx0(1);
        tx0Var.j(20.0f, 5.0f);
        tx0Var.h(4.0f, 5.0f);
        tx0Var.e(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        tx0Var.h(2.0f, 17.0f);
        tx0Var.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        tx0Var.g(16.0f);
        tx0Var.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        tx0Var.h(22.0f, 7.0f);
        tx0Var.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        tx0Var.c();
        tx0Var.j(11.0f, 8.0f);
        tx0Var.g(2.0f);
        tx0Var.o(2.0f);
        tx0Var.g(-2.0f);
        tx0Var.h(11.0f, 8.0f);
        tx0Var.c();
        tx0Var.j(11.0f, 11.0f);
        tx0Var.g(2.0f);
        tx0Var.o(2.0f);
        tx0Var.g(-2.0f);
        tx0Var.o(-2.0f);
        tx0Var.c();
        tx0Var.j(8.0f, 8.0f);
        tx0Var.g(2.0f);
        tx0Var.o(2.0f);
        tx0Var.h(8.0f, 10.0f);
        tx0Var.h(8.0f, 8.0f);
        tx0Var.c();
        tx0Var.j(8.0f, 11.0f);
        tx0Var.g(2.0f);
        tx0Var.o(2.0f);
        tx0Var.h(8.0f, 13.0f);
        tx0Var.o(-2.0f);
        tx0Var.c();
        tx0Var.j(7.0f, 13.0f);
        tx0Var.h(5.0f, 13.0f);
        tx0Var.o(-2.0f);
        tx0Var.g(2.0f);
        tx0Var.o(2.0f);
        tx0Var.c();
        tx0Var.j(7.0f, 10.0f);
        tx0Var.h(5.0f, 10.0f);
        tx0Var.h(5.0f, 8.0f);
        tx0Var.g(2.0f);
        tx0Var.o(2.0f);
        tx0Var.c();
        tx0Var.j(16.0f, 17.0f);
        tx0Var.h(8.0f, 17.0f);
        tx0Var.o(-2.0f);
        tx0Var.g(8.0f);
        tx0Var.o(2.0f);
        tx0Var.c();
        tx0Var.j(16.0f, 13.0f);
        tx0Var.g(-2.0f);
        tx0Var.o(-2.0f);
        tx0Var.g(2.0f);
        tx0Var.o(2.0f);
        tx0Var.c();
        tx0Var.j(16.0f, 10.0f);
        tx0Var.g(-2.0f);
        tx0Var.h(14.0f, 8.0f);
        tx0Var.g(2.0f);
        tx0Var.o(2.0f);
        tx0Var.c();
        tx0Var.j(19.0f, 13.0f);
        tx0Var.g(-2.0f);
        tx0Var.o(-2.0f);
        tx0Var.g(2.0f);
        tx0Var.o(2.0f);
        tx0Var.c();
        tx0Var.j(19.0f, 10.0f);
        tx0Var.g(-2.0f);
        tx0Var.h(17.0f, 8.0f);
        tx0Var.g(2.0f);
        tx0Var.o(2.0f);
        tx0Var.c();
        v01.a(v01Var, tx0Var.a, w73Var);
        w01 w01VarB = v01Var.b();
        i = w01VarB;
        return w01VarB;
    }

    public static final void E(o50 o50Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Throwable runtimeException;
        Iterator it = s50.a.iterator();
        while (it.hasNext()) {
            try {
                ((r50) it.next()).n(o50Var, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    uq.j(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                try {
                    threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
                } catch (Throwable unused) {
                }
            }
        }
        try {
            uq.j(th, new gb0(o50Var));
        } catch (Throwable unused2) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
        } catch (Throwable unused3) {
        }
    }

    public static final long F(long j2) {
        if (j2 < 0) {
            zj zjVar = ig0.f;
            return ig0.h;
        }
        zj zjVar2 = ig0.f;
        return ig0.g;
    }

    public static final void G(nv0 nv0Var, rs0 rs0Var) {
        rs0Var.getClass();
        cl3.i(2, rs0Var);
        rs0Var.f(nv0Var, 1);
    }

    public static final boolean H(rp0 rp0Var) {
        tb1 tb1Var;
        ex1 ex1Var;
        tb1 tb1Var2;
        ex1 ex1Var2 = rp0Var.m;
        return (ex1Var2 == null || (tb1Var = ex1Var2.z) == null || !tb1Var.I() || (ex1Var = rp0Var.m) == null || (tb1Var2 = ex1Var.z) == null || !tb1Var2.H()) ? false : true;
    }

    public static final wy K(gl glVar, gl glVar2, nv0 nv0Var, int i2) {
        glVar.getClass();
        glVar2.getClass();
        boolean z = ((((i2 & 14) ^ 6) > 4 && nv0Var.f(glVar)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && nv0Var.f(glVar2)) || (i2 & 48) == 32);
        Object objO = nv0Var.O();
        if (z || objO == c20.a) {
            objO = new wy(glVar, glVar2);
            nv0Var.j0(objO);
        }
        return (wy) objO;
    }

    public static final m41 L(jk2 jk2Var) {
        return new m41(Math.round(jk2Var.a), Math.round(jk2Var.b), Math.round(jk2Var.c), Math.round(jk2Var.d));
    }

    public static final long M(long j2, long j3) {
        long j4 = j2 - j3;
        long j5 = (j4 ^ j2) & (~(j4 ^ j3));
        lg0 lg0Var = lg0.NANOSECONDS;
        if (j5 >= 0) {
            return vp.U(j4, lg0Var);
        }
        lg0 lg0Var2 = lg0.MILLISECONDS;
        if (lg0Var.compareTo(lg0Var2) < 0) {
            long j6 = (j2 / 1000000) - (j3 / 1000000);
            long j7 = (j2 % 1000000) - (j3 % 1000000);
            zj zjVar = ig0.f;
            return ig0.b(vp.U(j6, lg0Var2), vp.U(j7, lg0Var));
        }
        long jF = F(j4);
        zj zjVar2 = ig0.f;
        long j8 = ((-(jF >> 1)) << 1) + ((long) (((int) jF) & 1));
        int i2 = kg0.a;
        return j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(defpackage.o50 r5, java.lang.Object r6, java.lang.Object r7, defpackage.rs0 r8, defpackage.p40 r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof defpackage.ms
            if (r0 == 0) goto L13
            r0 = r9
            ms r0 = (defpackage.ms) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            ms r0 = new ms
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.l
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L31
            java.lang.Object r5 = r0.k
            o50 r6 = r0.j
            defpackage.y02.Q(r9)     // Catch: java.lang.Throwable -> L2b
            r7 = r5
            r5 = r6
            goto L64
        L2b:
            r7 = move-exception
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L68
        L31:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r5)
            r5 = 0
            return r5
        L38:
            defpackage.y02.Q(r9)
            java.lang.Object r7 = defpackage.cl3.F(r5, r7)
            r0.i = r6     // Catch: java.lang.Throwable -> L54
            r0.j = r5     // Catch: java.lang.Throwable -> L54
            r0.k = r7     // Catch: java.lang.Throwable -> L54
            r0.m = r2     // Catch: java.lang.Throwable -> L54
            t83 r9 = new t83     // Catch: java.lang.Throwable -> L54
            r9.<init>(r0, r5)     // Catch: java.lang.Throwable -> L54
            if (r8 != 0) goto L56
            java.lang.Object r6 = defpackage.vr.c0(r8, r6, r9)     // Catch: java.lang.Throwable -> L54
        L52:
            r9 = r6
            goto L5f
        L54:
            r6 = move-exception
            goto L68
        L56:
            r0 = 2
            defpackage.cl3.i(r0, r8)     // Catch: java.lang.Throwable -> L54
            java.lang.Object r6 = r8.f(r6, r9)     // Catch: java.lang.Throwable -> L54
            goto L52
        L5f:
            y50 r6 = defpackage.y50.f
            if (r9 != r6) goto L64
            return r6
        L64:
            defpackage.cl3.A(r5, r7)
            return r9
        L68:
            defpackage.cl3.A(r5, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br.N(o50, java.lang.Object, java.lang.Object, rs0, p40):java.lang.Object");
    }

    public static final Exception O(String str, FileNotFoundException fileNotFoundException) throws IllegalAccessException, InvocationTargetException {
        int i2;
        boolean zEquals = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i2 = parcelObtain.readInt();
            } catch (Throwable unused) {
                Log.d("DirectBootExceptionUtil", "Error when reading current user id. Selected default user id `0`.");
                i2 = 0;
            }
            Object objInvoke = method.invoke(null, "sys.user." + i2 + ".ce_available", "false");
            objInvoke.getClass();
            zEquals = ((String) objInvoke).equals("true");
        } catch (Throwable th) {
            uq.j(fileNotFoundException, th);
        }
        if (zEquals || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new rb0(fileNotFoundException);
        } finally {
            file.delete();
        }
    }

    public static final e8 a(String str) {
        Set setSingleton = Collections.singleton(str);
        setSingleton.getClass();
        return new e8(setSingleton);
    }

    public static final m41 d(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new m41(i2, i3, ((int) (j3 >> 32)) + i2, ((int) (j3 & 4294967295L)) + i3);
    }

    public static final void e(Object obj, int i2, kd1 kd1Var, d00 d00Var, nv0 nv0Var, int i3) {
        int i4;
        nv0Var.b0(872548579);
        if ((i3 & 6) == 0) {
            i4 = (nv0Var.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= nv0Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= nv0Var.h(kd1Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= nv0Var.h(d00Var) ? 2048 : 1024;
        }
        if (nv0Var.R(i4 & 1, (i4 & 1171) != 1170)) {
            boolean zF = nv0Var.f(obj) | nv0Var.f(kd1Var);
            Object objO = nv0Var.O();
            Object obj2 = c20.a;
            if (zF || objO == obj2) {
                objO = new jd1(obj, kd1Var);
                nv0Var.j0(objO);
            }
            jd1 jd1Var = (jd1) objO;
            jd1Var.c = i2;
            d42 d42Var = jd1Var.g;
            ee2 ee2Var = g62.a;
            jd1 jd1Var2 = (jd1) nv0Var.j(ee2Var);
            t63 t63VarL = jo3.l();
            ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
            t63 t63VarS = jo3.s(t63VarL);
            try {
                if (jd1Var2 != ((jd1) d42Var.getValue())) {
                    d42Var.setValue(jd1Var2);
                    if (jd1Var.d > 0) {
                        jd1 jd1Var3 = jd1Var.e;
                        if (jd1Var3 != null) {
                            jd1Var3.b();
                        }
                        if (jd1Var2 != null) {
                            jd1Var2.a();
                        } else {
                            jd1Var2 = null;
                        }
                        jd1Var.e = jd1Var2;
                    }
                }
                jo3.v(t63VarL, t63VarS, ns0VarE);
                boolean zF2 = nv0Var.f(jd1Var);
                Object objO2 = nv0Var.O();
                if (zF2 || objO2 == obj2) {
                    objO2 = new xc1(1, jd1Var);
                    nv0Var.j0(objO2);
                }
                rn.g(jd1Var, (ns0) objO2, nv0Var);
                vr.c(ee2Var.a(jd1Var), d00Var, nv0Var, ((i4 >> 6) & 112) | 8);
            } catch (Throwable th) {
                jo3.v(t63VarL, t63VarS, ns0VarE);
                throw th;
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ko(obj, i2, kd1Var, d00Var, i3);
        }
    }

    public static final void f(cs0 cs0Var, bq1 bq1Var, gl glVar, long j2, d00 d00Var, nv0 nv0Var, int i2) {
        cs0 cs0Var2;
        int i3;
        bq1 bq1Var2;
        d00 d00Var2;
        long j3;
        xj2 xj2VarT;
        qh1 qh1Var;
        long j4;
        cs0Var.getClass();
        nv0Var.b0(1438826575);
        if ((i2 & 6) == 0) {
            cs0Var2 = cs0Var;
            i3 = (nv0Var.h(cs0Var2) ? 4 : 2) | i2;
        } else {
            cs0Var2 = cs0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? nv0Var.f(glVar) : nv0Var.h(glVar) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= nv0Var.h(d00Var) ? 16384 : 8192;
        }
        int i5 = i4;
        byte b = 0;
        if (nv0Var.R(i5 & 1, (i5 & 9363) != 9362)) {
            nv0Var.W();
            if ((i2 & 1) == 0 || nv0Var.A()) {
                j4 = wx.g;
            } else {
                nv0Var.U();
                j4 = j2;
            }
            nv0Var.q();
            if (glVar == null) {
                nv0Var.a0(309130553);
                gv3.f(cs0Var2, j43.k(bq1Var, 56.0f), false, null, null, d00Var, nv0Var, (i5 & 14) | (3670016 & (i5 << 6)), 60);
                nv0Var.p(false);
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    qh1Var = new qh1(cs0Var, bq1Var, glVar, j4, d00Var, i2, 0);
                    xj2VarT.d = qh1Var;
                }
                return;
            }
            long j5 = j4;
            bq1Var2 = bq1Var;
            d00Var2 = d00Var;
            nv0Var.a0(309309299);
            nv0Var.p(false);
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = rn.A(nv0Var);
                nv0Var.j0(objO);
            }
            x50 x50Var = (x50) objO;
            boolean zF = nv0Var.f(x50Var);
            Object objO2 = nv0Var.O();
            if (zF || objO2 == obj) {
                objO2 = new a51(x50Var, new z00(20, b));
                nv0Var.j0(objO2);
            }
            a51 a51Var = (a51) objO2;
            bq1 bq1VarK = j43.k(bq1Var2, 56.0f);
            Object objO3 = nv0Var.O();
            if (objO3 == obj) {
                objO3 = new x91(11);
                nv0Var.j0(objO3);
            }
            cs0 cs0Var3 = (cs0) objO3;
            Object objO4 = nv0Var.O();
            if (objO4 == obj) {
                objO4 = new n20(29);
                nv0Var.j0(objO4);
            }
            ns0 ns0Var = (ns0) objO4;
            boolean zH = nv0Var.h(a51Var);
            Object objO5 = nv0Var.O();
            if (zH || objO5 == obj) {
                objO5 = new x41(a51Var, 3);
                nv0Var.j0(objO5);
            }
            ns0 ns0Var2 = (ns0) objO5;
            boolean z = (i5 & 7168) == 2048;
            Object objO6 = nv0Var.O();
            if (z || objO6 == obj) {
                objO6 = new i8(5, j5);
                nv0Var.j0(objO6);
            }
            bq1 bq1VarD = rn.x(cl3.m(bq1VarK, glVar, cs0Var3, ns0Var, null, null, null, ns0Var2, (ns0) objO6, 3000), null, null, false, new no2(0), cs0Var, 12).d(a51Var.g).d(a51Var.h);
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
            nc2.p((i5 >> 12) & 14, d00Var2, nv0Var, true);
            j3 = j5;
        } else {
            bq1Var2 = bq1Var;
            d00Var2 = d00Var;
            nv0Var.U();
            j3 = j2;
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            qh1Var = new qh1(cs0Var, bq1Var2, glVar, j3, d00Var2, i2, 1);
            xj2VarT.d = qh1Var;
        }
    }

    public static final void i(final float f2, final ns0 ns0Var, final ex exVar, final bq1 bq1Var, final int i2, gl glVar, nv0 nv0Var, final int i3) {
        ns0 ns0Var2;
        bq1 bq1Var2;
        final gl glVar2;
        xj2 xj2VarT;
        rs0 rs0Var;
        int i4;
        gl glVarE;
        ns0Var.getClass();
        nv0Var.b0(650360686);
        int i5 = i3 | (nv0Var.c(f2) ? 4 : 2) | (nv0Var.h(ns0Var) ? 32 : 16) | (nv0Var.f(exVar) ? 256 : 128) | (nv0Var.f(bq1Var) ? 2048 : 1024) | 65536;
        if (nv0Var.R(i5 & 1, (74899 & i5) != 74898)) {
            nv0Var.W();
            if ((i3 & 1) == 0 || nv0Var.A()) {
                i4 = i5 & (-458753);
                glVarE = yh1.e(nv0Var);
            } else {
                nv0Var.U();
                i4 = i5 & (-458753);
                glVarE = glVar;
            }
            nv0Var.q();
            if (glVarE == null) {
                nv0Var.a0(297994165);
                g53.a(f2, ns0Var, bq1Var, false, exVar, i2, null, null, null, nv0Var, ((i4 << 6) & 57344) | (i4 & 126) | ((i4 >> 3) & 896) | 196608, 456);
                nv0Var.p(false);
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    final int i6 = 0;
                    final gl glVar3 = glVarE;
                    rs0Var = new rs0(f2, ns0Var, exVar, bq1Var, i2, glVar3, i3, i6) { // from class: lh1
                        public final /* synthetic */ int f;
                        public final /* synthetic */ float g;
                        public final /* synthetic */ ns0 h;
                        public final /* synthetic */ ex i;
                        public final /* synthetic */ bq1 j;
                        public final /* synthetic */ int k;
                        public final /* synthetic */ gl l;

                        {
                            this.f = i6;
                        }

                        @Override // defpackage.rs0
                        public final Object f(Object obj, Object obj2) {
                            int i7 = this.f;
                            dm3 dm3Var = dm3.a;
                            switch (i7) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iY = jo3.y(24577);
                                    br.i(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iY2 = jo3.y(24577);
                                    br.i(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY2);
                                    break;
                            }
                            return dm3Var;
                        }
                    };
                    xj2VarT.d = rs0Var;
                }
                return;
            }
            bq1Var2 = bq1Var;
            final gl glVar4 = glVarE;
            ns0Var2 = ns0Var;
            nv0Var.a0(298208468);
            nv0Var.p(false);
            boolean zJ = pq.J(nv0Var);
            final long jC = vp.c(!zJ ? 4278225151L : 4278227455L);
            final long jB = !zJ ? wx.b(0.2f, vp.c(4286085240L)) : wx.b(0.36f, vp.c(4286085248L));
            final os1 os1VarZ = b32.z(Float.valueOf(f2), nv0Var);
            final os1 os1VarZ2 = b32.z(ns0Var2, nv0Var);
            final ta1 ta1VarH = rn.H(null, nv0Var, 3);
            glVar2 = glVar4;
            s51.c(j43.c(bq1Var2, 1.0f), f5.j, gq.N(-1627827752, new ss0() { // from class: ph1
                @Override // defpackage.ss0
                public final Object e(Object obj, Object obj2, Object obj3) {
                    os1 os1Var;
                    lo loVar = (lo) obj;
                    nv0 nv0Var2 = (nv0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    loVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= nv0Var2.f(loVar) ? 4 : 2;
                    }
                    byte b = 0;
                    if (nv0Var2.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        final int i7 = m30.i(loVar.b);
                        final boolean z = nv0Var2.j(s20.n) == bb1.f;
                        Object objO = nv0Var2.O();
                        zj zjVar = c20.a;
                        if (objO == zjVar) {
                            objO = rn.A(nv0Var2);
                            nv0Var2.j0(objO);
                        }
                        x50 x50Var = (x50) objO;
                        Object objO2 = nv0Var2.O();
                        if (objO2 == zjVar) {
                            objO2 = b32.w(Boolean.FALSE);
                            nv0Var2.j0(objO2);
                        }
                        final os1 os1Var2 = (os1) objO2;
                        boolean zF = nv0Var2.f(x50Var);
                        Object objO3 = nv0Var2.O();
                        final ex exVar2 = exVar;
                        final os1 os1Var3 = os1VarZ2;
                        if (zF || objO3 == zjVar) {
                            os1Var = os1Var3;
                            z60 z60Var = new z60(x50Var, f2, exVar2, (exVar2.g - exVar2.f) / 1000.0f, 1.5f, new z00(26, b), new mh1(os1Var3, os1Var2, 0), new ss0() { // from class: nh1
                                @Override // defpackage.ss0
                                public final Object e(Object obj4, Object obj5, Object obj6) {
                                    z60 z60Var2 = (z60) obj4;
                                    gy1 gy1Var = (gy1) obj6;
                                    z60Var2.getClass();
                                    os1 os1Var4 = os1Var2;
                                    if (!((Boolean) os1Var4.getValue()).booleanValue()) {
                                        os1Var4.setValue(Boolean.valueOf(!(Float.intBitsToFloat((int) (gy1Var.a >> 32)) == 0.0f)));
                                    }
                                    ex exVar3 = exVar2;
                                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (gy1Var.a >> 32)) / (i7 >= 1 ? r1 : 1)) * (exVar3.g - exVar3.f);
                                    ((ns0) os1Var3.getValue()).h(y02.j(Float.valueOf(z ? z60Var2.d() + fIntBitsToFloat : z60Var2.d() - fIntBitsToFloat), exVar3));
                                    return dm3.a;
                                }
                            });
                            nv0Var2.j0(z60Var);
                            objO3 = z60Var;
                        } else {
                            os1Var = os1Var3;
                        }
                        final z60 z60Var2 = (z60) objO3;
                        os1 os1Var4 = os1VarZ;
                        boolean zF2 = nv0Var2.f(os1Var4) | nv0Var2.h(z60Var2);
                        Object objO4 = nv0Var2.O();
                        if (zF2 || objO4 == zjVar) {
                            objO4 = new hd1(os1Var4, z60Var2, null, 3);
                            nv0Var2.j0(objO4);
                        }
                        rn.l((rs0) objO4, nv0Var2, z60Var2);
                        yp1 yp1Var = yp1.a;
                        ta1 ta1Var = ta1VarH;
                        bq1 bq1VarH = f80.H(yp1Var, ta1Var);
                        cn1 cn1VarD = eo.d(f5.g, false);
                        int iHashCode = Long.hashCode(nv0Var2.T);
                        n52 n52VarL = nv0Var2.l();
                        bq1 bq1VarM = lr.M(nv0Var2, bq1VarH);
                        w10.c.getClass();
                        nv0Var2.d0();
                        if (nv0Var2.S) {
                            nv0Var2.k(tb1.Y);
                        } else {
                            nv0Var2.m0();
                        }
                        y02.F(f5.E, nv0Var2, cn1VarD);
                        y02.F(f5.D, nv0Var2, n52VarL);
                        y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode));
                        y02.C(nv0Var2);
                        y02.F(f5.C, nv0Var2, bq1VarM);
                        bq1 bq1VarT = gq.t(yp1Var, new wr());
                        wy0 wy0Var = cl3.q0;
                        bq1 bq1VarV = gv3.v(bq1VarT, jB, wy0Var);
                        boolean zF3 = nv0Var2.f(exVar2) | nv0Var2.d(i7) | nv0Var2.g(z) | nv0Var2.h(z60Var2) | nv0Var2.f(os1Var);
                        Object objO5 = nv0Var2.O();
                        if (zF3 || objO5 == zjVar) {
                            th1 th1Var = new th1(exVar2, i7, z, z60Var2, os1Var);
                            nv0Var2.j0(th1Var);
                            objO5 = th1Var;
                        }
                        eo.a(j43.c(j43.e(ob3.a(bq1VarV, x50Var, (PointerInputEventHandler) objO5), 6.0f), 1.0f), nv0Var2, 0);
                        bq1 bq1VarE = j43.e(gv3.v(gq.t(yp1Var, new wr()), jC, wy0Var), 6.0f);
                        boolean zH = nv0Var2.h(z60Var2);
                        Object objO6 = nv0Var2.O();
                        if (zH || objO6 == zjVar) {
                            objO6 = new ir(6, z60Var2);
                            nv0Var2.j0(objO6);
                        }
                        eo.a(vm1.C(bq1VarE, (ss0) objO6), nv0Var2, 0);
                        nv0Var2.p(true);
                        boolean zD = nv0Var2.d(i7) | nv0Var2.h(z60Var2) | nv0Var2.g(z);
                        Object objO7 = nv0Var2.O();
                        if (zD || objO7 == zjVar) {
                            objO7 = new ns0() { // from class: oh1
                                @Override // defpackage.ns0
                                public final Object h(Object obj4) {
                                    uw0 uw0Var = (uw0) obj4;
                                    uw0Var.getClass();
                                    float f3 = (-Float.intBitsToFloat((int) (uw0Var.a() >> 32))) / 2.0f;
                                    float f4 = i7;
                                    float fC = (z60Var2.c() * f4) + f3;
                                    float f5 = (-Float.intBitsToFloat((int) (uw0Var.a() >> 32))) / 4.0f;
                                    float fIntBitsToFloat = f4 - ((Float.intBitsToFloat((int) (uw0Var.a() >> 32)) * 3.0f) / 4.0f);
                                    if (fC < f5) {
                                        fC = f5;
                                    }
                                    if (fC <= fIntBitsToFloat) {
                                        fIntBitsToFloat = fC;
                                    }
                                    uw0Var.p(fIntBitsToFloat * (z ? 1.0f : -1.0f));
                                    return dm3.a;
                                }
                            };
                            nv0Var2.j0(objO7);
                        }
                        bq1 bq1VarD = vm1.z(yp1Var, (ns0) objO7).d(z60Var2.o);
                        boolean zH2 = nv0Var2.h(z60Var2);
                        Object objO8 = nv0Var2.O();
                        if (zH2 || objO8 == zjVar) {
                            objO8 = new kh1(z60Var2, 1);
                            nv0Var2.j0(objO8);
                        }
                        wy wyVarK = br.K(glVar4, rn.G(ta1Var, (rs0) objO8, nv0Var2), nv0Var2, 0);
                        Object objO9 = nv0Var2.O();
                        int i8 = 9;
                        if (objO9 == zjVar) {
                            objO9 = new x91(9);
                            nv0Var2.j0(objO9);
                        }
                        cs0 cs0Var = (cs0) objO9;
                        boolean zH3 = nv0Var2.h(z60Var2);
                        Object objO10 = nv0Var2.O();
                        if (zH3 || objO10 == zjVar) {
                            objO10 = new t60(z60Var2, 11);
                            nv0Var2.j0(objO10);
                        }
                        ns0 ns0Var3 = (ns0) objO10;
                        boolean zH4 = nv0Var2.h(z60Var2);
                        Object objO11 = nv0Var2.O();
                        if (zH4 || objO11 == zjVar) {
                            objO11 = new u60(z60Var2, 8);
                            nv0Var2.j0(objO11);
                        }
                        cs0 cs0Var2 = (cs0) objO11;
                        Object objO12 = nv0Var2.O();
                        int i9 = 10;
                        if (objO12 == zjVar) {
                            objO12 = new x91(10);
                            nv0Var2.j0(objO12);
                        }
                        cs0 cs0Var3 = (cs0) objO12;
                        boolean zH5 = nv0Var2.h(z60Var2);
                        Object objO13 = nv0Var2.O();
                        if (zH5 || objO13 == zjVar) {
                            objO13 = new u60(z60Var2, 7);
                            nv0Var2.j0(objO13);
                        }
                        cs0 cs0Var4 = (cs0) objO13;
                        boolean zH6 = nv0Var2.h(z60Var2);
                        Object objO14 = nv0Var2.O();
                        if (zH6 || objO14 == zjVar) {
                            objO14 = new t60(z60Var2, i8);
                            nv0Var2.j0(objO14);
                        }
                        ns0 ns0Var4 = (ns0) objO14;
                        boolean zH7 = nv0Var2.h(z60Var2);
                        Object objO15 = nv0Var2.O();
                        if (zH7 || objO15 == zjVar) {
                            objO15 = new t60(z60Var2, i9);
                            nv0Var2.j0(objO15);
                        }
                        eo.a(j43.l(cl3.m(bq1VarD, wyVarK, cs0Var, ns0Var3, cs0Var2, cs0Var3, cs0Var4, ns0Var4, (ns0) objO15, 2944), 40.0f, 24.0f), nv0Var2, 0);
                    } else {
                        nv0Var2.U();
                    }
                    return dm3.a;
                }
            }, nv0Var), nv0Var, 3120, 4);
        } else {
            ns0Var2 = ns0Var;
            bq1Var2 = bq1Var;
            nv0Var.U();
            glVar2 = glVar;
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final int i7 = 1;
            final ns0 ns0Var3 = ns0Var2;
            final bq1 bq1Var3 = bq1Var2;
            rs0Var = new rs0(f2, ns0Var3, exVar, bq1Var3, i2, glVar2, i3, i7) { // from class: lh1
                public final /* synthetic */ int f;
                public final /* synthetic */ float g;
                public final /* synthetic */ ns0 h;
                public final /* synthetic */ ex i;
                public final /* synthetic */ bq1 j;
                public final /* synthetic */ int k;
                public final /* synthetic */ gl l;

                {
                    this.f = i7;
                }

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    int i72 = this.f;
                    dm3 dm3Var = dm3.a;
                    switch (i72) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iY = jo3.y(24577);
                            br.i(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iY2 = jo3.y(24577);
                            br.i(this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY2);
                            break;
                    }
                    return dm3Var;
                }
            };
            xj2VarT.d = rs0Var;
        }
    }

    public static final void j(final boolean z, final ns0 ns0Var, bq1 bq1Var, gl glVar, nv0 nv0Var, final int i2) {
        final bq1 bq1Var2;
        final gl glVar2;
        xj2 xj2VarT;
        rs0 rs0Var;
        gl glVarE;
        int i3;
        bq1 bq1Var3;
        Object obj;
        final z32 z32Var;
        gl glVar3;
        ns0 ns0Var2;
        Object obj2;
        ns0Var.getClass();
        nv0Var.b0(-1626792065);
        int i4 = i2 | (nv0Var.g(z) ? 4 : 2) | (nv0Var.h(ns0Var) ? 32 : 16) | 1408;
        if (nv0Var.R(i4 & 1, (i4 & 1171) != 1170)) {
            nv0Var.W();
            int i5 = i2 & 1;
            yp1 yp1Var = yp1.a;
            if (i5 == 0 || nv0Var.A()) {
                glVarE = yh1.e(nv0Var);
                i3 = i4 & (-7169);
                bq1Var3 = yp1Var;
            } else {
                nv0Var.U();
                glVarE = glVar;
                i3 = i4 & (-7169);
                bq1Var3 = bq1Var;
            }
            nv0Var.q();
            if (glVarE == null) {
                nv0Var.a0(648767196);
                final bq1 bq1Var4 = bq1Var3;
                wb3.a(z, ns0Var, bq1Var4, false, null, nv0Var, i3 & 1022, 120);
                nv0Var.p(false);
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    final int i6 = 1;
                    final gl glVar4 = glVarE;
                    rs0Var = new rs0(z, ns0Var, bq1Var4, glVar4, i2, i6) { // from class: gh1
                        public final /* synthetic */ int f;
                        public final /* synthetic */ boolean g;
                        public final /* synthetic */ ns0 h;
                        public final /* synthetic */ bq1 i;
                        public final /* synthetic */ gl j;

                        {
                            this.f = i6;
                        }

                        @Override // defpackage.rs0
                        public final Object f(Object obj3, Object obj4) {
                            int i7 = this.f;
                            dm3 dm3Var = dm3.a;
                            switch (i7) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    int iY = jo3.y(1);
                                    br.j(this.g, this.h, this.i, this.j, (nv0) obj3, iY);
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    int iY2 = jo3.y(1);
                                    br.j(this.g, this.h, this.i, this.j, (nv0) obj3, iY2);
                                    break;
                            }
                            return dm3Var;
                        }
                    };
                    xj2VarT.d = rs0Var;
                }
                return;
            }
            gl glVar5 = glVarE;
            nv0Var.a0(648927683);
            nv0Var.p(false);
            boolean zJ = pq.J(nv0Var);
            final long jC = vp.c(!zJ ? 4281648985L : 4281389400L);
            final long jB = !zJ ? wx.b(0.2f, vp.c(4286085240L)) : wx.b(0.36f, vp.c(4286085248L));
            ua0 ua0Var = (ua0) nv0Var.j(s20.h);
            final boolean z2 = nv0Var.j(s20.n) == bb1.f;
            final float fT = ua0Var.T(20.0f);
            Object objO = nv0Var.O();
            Object obj3 = c20.a;
            if (objO == obj3) {
                objO = rn.A(nv0Var);
                nv0Var.j0(objO);
            }
            x50 x50Var = (x50) objO;
            Object objZ = b32.z(Boolean.valueOf(z), nv0Var);
            os1 os1VarZ = b32.z(ns0Var, nv0Var);
            Object objO2 = nv0Var.O();
            if (objO2 == obj3) {
                objO2 = b32.w(Boolean.FALSE);
                nv0Var.j0(objO2);
            }
            final os1 os1Var = (os1) objO2;
            Object objO3 = nv0Var.O();
            if (objO3 == obj3) {
                Object z32Var2 = new z32(z ? 1.0f : 0.0f);
                nv0Var.j0(z32Var2);
                objO3 = z32Var2;
            }
            z32 z32Var3 = (z32) objO3;
            boolean zF = nv0Var.f(x50Var);
            Object objO4 = nv0Var.O();
            if (zF || objO4 == obj3) {
                obj = objZ;
                z32Var = z32Var3;
                objO4 = new z60(x50Var, z32Var3.g(), new ex(0.0f, 1.0f), 0.001f, 1.5f, new z00(25, (byte) 0), new bd(os1VarZ, objZ, os1Var, z32Var3, 5), new ss0() { // from class: hh1
                    /* JADX WARN: Removed duplicated region for block: B:18:0x0055 A[PHI: r1
                      0x0055: PHI (r1v3 float) = (r1v1 float), (r1v4 float) binds: [B:24:0x0064, B:16:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // defpackage.ss0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object e(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
                        /*
                            r4 = this;
                            z60 r5 = (defpackage.z60) r5
                            p41 r6 = (defpackage.p41) r6
                            gy1 r7 = (defpackage.gy1) r7
                            r5.getClass()
                            os1 r5 = r3
                            java.lang.Object r6 = r5.getValue()
                            java.lang.Boolean r6 = (java.lang.Boolean) r6
                            boolean r6 = r6.booleanValue()
                            r0 = 32
                            r1 = 0
                            if (r6 != 0) goto L32
                            long r2 = r7.a
                            long r2 = r2 >> r0
                            int r6 = (int) r2
                            float r6 = java.lang.Float.intBitsToFloat(r6)
                            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                            r2 = 1
                            if (r6 != 0) goto L29
                            r6 = r2
                            goto L2a
                        L29:
                            r6 = 0
                        L2a:
                            r6 = r6 ^ r2
                            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
                            r5.setValue(r6)
                        L32:
                            long r5 = r7.a
                            long r5 = r5 >> r0
                            int r5 = (int) r5
                            float r5 = java.lang.Float.intBitsToFloat(r5)
                            float r6 = r1
                            float r5 = r5 / r6
                            boolean r6 = r2
                            z32 r4 = r4
                            r7 = 1065353216(0x3f800000, float:1.0)
                            if (r6 == 0) goto L57
                            float r6 = r4.g()
                            float r6 = r6 + r5
                            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                            if (r5 >= 0) goto L4f
                            goto L50
                        L4f:
                            r1 = r6
                        L50:
                            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                            if (r5 <= 0) goto L55
                            goto L66
                        L55:
                            r7 = r1
                            goto L66
                        L57:
                            float r6 = r4.g()
                            float r6 = r6 - r5
                            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                            if (r5 >= 0) goto L61
                            goto L62
                        L61:
                            r1 = r6
                        L62:
                            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
                            if (r5 <= 0) goto L55
                        L66:
                            r4.h(r7)
                            dm3 r4 = defpackage.dm3.a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh1.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
                nv0Var.j0(objO4);
            } else {
                obj = objZ;
                z32Var = z32Var3;
            }
            final z60 z60Var = (z60) objO4;
            boolean zH = nv0Var.h(z60Var);
            Object objO5 = nv0Var.O();
            p40 p40Var = null;
            if (zH || objO5 == obj3) {
                glVar3 = glVar5;
                objO5 = new hd1(z32Var, z60Var, p40Var, 4);
                nv0Var.j0(objO5);
            } else {
                glVar3 = glVar5;
            }
            rn.l((rs0) objO5, nv0Var, z60Var);
            boolean zF2 = nv0Var.f(obj) | nv0Var.h(z60Var);
            Object objO6 = nv0Var.O();
            if (zF2 || objO6 == obj3) {
                objO6 = new l(obj, z60Var, z32Var, p40Var, 24);
                ns0Var2 = null;
                nv0Var.j0(objO6);
            } else {
                ns0Var2 = null;
            }
            rn.l((rs0) objO6, nv0Var, z60Var);
            ta1 ta1VarH = rn.H(ns0Var2, nv0Var, 3);
            cn1 cn1VarD = eo.d(f5.j, false);
            final boolean z3 = z2;
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1Var3);
            w10.c.getClass();
            nv0Var.d0();
            bq1 bq1Var5 = bq1Var3;
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
            bq1 bq1VarT = gq.t(f80.H(yp1Var, ta1VarH), new wr());
            boolean zE = nv0Var.e(jB) | nv0Var.e(jC) | nv0Var.h(z60Var);
            Object objO7 = nv0Var.O();
            if (zE || objO7 == obj3) {
                obj2 = obj3;
                Object obj4 = new ns0() { // from class: ih1
                    @Override // defpackage.ns0
                    public final Object h(Object obj5) {
                        qf0 qf0Var = (qf0) obj5;
                        qf0Var.getClass();
                        qf0.h0(qf0Var, vp.N(jB, jC, z60Var.e()), 0L, 0L, 0.0f, null, 0, 126);
                        return dm3.a;
                    }
                };
                nv0Var.j0(obj4);
                objO7 = obj4;
            } else {
                obj2 = obj3;
            }
            eo.a(j43.l(w7.K(bq1VarT, (ns0) objO7), 64.0f, 28.0f), nv0Var, 0);
            boolean zH2 = nv0Var.h(z60Var) | nv0Var.g(z3) | nv0Var.c(fT);
            Object objO8 = nv0Var.O();
            if (zH2 || objO8 == obj2) {
                objO8 = new ns0() { // from class: jh1
                    @Override // defpackage.ns0
                    public final Object h(Object obj5) {
                        uw0 uw0Var = (uw0) obj5;
                        uw0Var.getClass();
                        float fE = z60Var.e();
                        float fH = uw0Var.h() * 2.0f;
                        boolean z4 = z3;
                        float f2 = fT;
                        uw0Var.p(z4 ? lq.N(fH, f2 + fH, fE) : lq.N(-fH, -(fH + f2), fE));
                        return dm3.a;
                    }
                };
                nv0Var.j0(objO8);
            }
            bq1 bq1VarZ = vm1.z(yp1Var, (ns0) objO8);
            Object objO9 = nv0Var.O();
            if (objO9 == obj2) {
                objO9 = new n20(28);
                nv0Var.j0(objO9);
            }
            int i7 = 0;
            bq1 bq1VarD = su2.a(bq1VarZ, false, (ns0) objO9).d(z60Var.o);
            boolean zH3 = nv0Var.h(z60Var);
            Object objO10 = nv0Var.O();
            if (zH3 || objO10 == obj2) {
                objO10 = new kh1(z60Var, i7);
                nv0Var.j0(objO10);
            }
            fl flVarG = rn.G(ta1VarH, (rs0) objO10, nv0Var);
            gl glVar6 = glVar3;
            wy wyVarK = K(glVar6, flVarG, nv0Var, 0);
            Object objO11 = nv0Var.O();
            int i8 = 8;
            if (objO11 == obj2) {
                objO11 = new x91(i8);
                nv0Var.j0(objO11);
            }
            cs0 cs0Var = (cs0) objO11;
            boolean zH4 = nv0Var.h(z60Var);
            Object objO12 = nv0Var.O();
            if (zH4 || objO12 == obj2) {
                objO12 = new t60(z60Var, i8);
                nv0Var.j0(objO12);
            }
            ns0 ns0Var3 = (ns0) objO12;
            boolean zH5 = nv0Var.h(z60Var);
            Object objO13 = nv0Var.O();
            if (zH5 || objO13 == obj2) {
                objO13 = new u60(z60Var, 9);
                nv0Var.j0(objO13);
            }
            cs0 cs0Var2 = (cs0) objO13;
            Object objO14 = nv0Var.O();
            int i9 = 12;
            if (objO14 == obj2) {
                objO14 = new x91(i9);
                nv0Var.j0(objO14);
            }
            cs0 cs0Var3 = (cs0) objO14;
            boolean zH6 = nv0Var.h(z60Var);
            Object objO15 = nv0Var.O();
            if (zH6 || objO15 == obj2) {
                objO15 = new u60(z60Var, 10);
                nv0Var.j0(objO15);
            }
            cs0 cs0Var4 = (cs0) objO15;
            boolean zH7 = nv0Var.h(z60Var);
            Object objO16 = nv0Var.O();
            if (zH7 || objO16 == obj2) {
                objO16 = new t60(z60Var, i9);
                nv0Var.j0(objO16);
            }
            ns0 ns0Var4 = (ns0) objO16;
            boolean zH8 = nv0Var.h(z60Var);
            Object objO17 = nv0Var.O();
            if (zH8 || objO17 == obj2) {
                objO17 = new t60(z60Var, 13);
                nv0Var.j0(objO17);
            }
            eo.a(j43.l(cl3.m(bq1VarD, wyVarK, cs0Var, ns0Var3, cs0Var2, cs0Var3, cs0Var4, ns0Var4, (ns0) objO17, 2944), 40.0f, 24.0f), nv0Var, 0);
            nv0Var.p(true);
            glVar2 = glVar6;
            bq1Var2 = bq1Var5;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            glVar2 = glVar;
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final int i10 = 0;
            rs0Var = new rs0(z, ns0Var, bq1Var2, glVar2, i2, i10) { // from class: gh1
                public final /* synthetic */ int f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ ns0 h;
                public final /* synthetic */ bq1 i;
                public final /* synthetic */ gl j;

                {
                    this.f = i10;
                }

                @Override // defpackage.rs0
                public final Object f(Object obj32, Object obj42) {
                    int i72 = this.f;
                    dm3 dm3Var = dm3.a;
                    switch (i72) {
                        case 0:
                            ((Integer) obj42).getClass();
                            int iY = jo3.y(1);
                            br.j(this.g, this.h, this.i, this.j, (nv0) obj32, iY);
                            break;
                        default:
                            ((Integer) obj42).getClass();
                            int iY2 = jo3.y(1);
                            br.j(this.g, this.h, this.i, this.j, (nv0) obj32, iY2);
                            break;
                    }
                    return dm3Var;
                }
            };
            xj2VarT.d = rs0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(defpackage.d00 r30, defpackage.bq1 r31, defpackage.d00 r32, defpackage.ss0 r33, defpackage.nv0 r34, int r35, int r36) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br.k(d00, bq1, d00, ss0, nv0, int, int):void");
    }

    public static final boolean l(rd0 rd0Var, long j2) {
        if (!rd0Var.f.s) {
            return false;
        }
        s21 s21Var = vr.X(rd0Var).L.c;
        if (!s21Var.i0.s) {
            return false;
        }
        long jK0 = s21Var.k0(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jK0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jK0 & 4294967295L));
        long j3 = rd0Var.v;
        float f2 = ((int) (j3 >> 32)) + fIntBitsToFloat;
        float f3 = ((int) (j3 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f2) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f3;
    }

    public static final float[] m(vb1 vb1Var, c23 c23Var) {
        float fB = h43.b(vb1Var.f.a()) / 2.0f;
        float[] fArr = new float[4];
        for (int i2 = 0; i2 < 4; i2++) {
            fArr[i2] = fB;
        }
        return fArr;
    }

    public static final boolean n(float f2) {
        return Float.isNaN(f2) || Math.abs(f2) < 0.5f;
    }

    public static final os1 o(g93 g93Var, nv0 nv0Var) {
        of1 of1Var = (of1) nv0Var.j(ij1.a);
        Object value = g93Var.getValue();
        Object lifecycle = of1Var.getLifecycle();
        ff1 ff1Var = ff1.i;
        Object obj = li0.f;
        Object[] objArr = {g93Var, lifecycle, ff1Var, obj};
        boolean zH = nv0Var.h(lifecycle) | nv0Var.d(ff1Var.ordinal()) | nv0Var.h(obj) | nv0Var.h(g93Var);
        Object objO = nv0Var.O();
        Object obj2 = c20.a;
        if (zH || objO == obj2) {
            Object m9Var = new m9(lifecycle, ff1Var, obj, g93Var, (p40) null, 4);
            nv0Var.j0(m9Var);
            objO = m9Var;
        }
        rs0 rs0Var = (rs0) objO;
        Object objO2 = nv0Var.O();
        if (objO2 == obj2) {
            objO2 = b32.w(value);
            nv0Var.j0(objO2);
        }
        os1 os1Var = (os1) objO2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zH2 = nv0Var.h(rs0Var);
        Object objO3 = nv0Var.O();
        if (zH2 || objO3 == obj2) {
            objO3 = new j73(rs0Var, os1Var, null, 2);
            nv0Var.j0(objO3);
        }
        rs0 rs0Var2 = (rs0) objO3;
        o50 o50Var = nv0Var.R;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length);
        boolean zD = nv0Var.d(objArrCopyOf2.length);
        for (Object obj3 : objArrCopyOf2) {
            zD |= nv0Var.f(obj3);
        }
        Object objO4 = nv0Var.O();
        if (!zD && objO4 != obj2) {
            return os1Var;
        }
        nv0Var.j0(new w71(o50Var, rs0Var2));
        return os1Var;
    }

    public static void p(ju1 ju1Var, String str, List list, d00 d00Var, int i2) {
        if ((i2 & 2) != 0) {
            list = ni0.f;
        }
        zv1 zv1Var = ju1Var.f;
        zv1Var.getClass();
        i10 i10Var = new i10((h10) zv1Var.b(uq.w(h10.class)), str, d00Var);
        for (et1 et1Var : list) {
            i10Var.c.put(et1Var.a, et1Var.b);
        }
        ju1Var.h.add(i10Var.a());
    }

    public static vq3 q(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (vq3) objNewInstance;
            } catch (IllegalAccessException e) {
                qn1.l("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                qn1.l("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            qn1.l("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static final long r(float f2, int i2, long j2, boolean z) {
        int i3 = ((z || i2 == 2 || i2 == 4 || i2 == 5) && m30.e(j2)) ? m30.i(j2) : Integer.MAX_VALUE;
        if (m30.k(j2) != i3) {
            i3 = y02.h(w22.j(f2), m30.k(j2), i3);
        }
        return lq.y(0, i3, 0, m30.h(j2));
    }

    public static final rp0 s(rp0 rp0Var) {
        rp0 rp0VarF = ((ep0) ((h7) vr.Y(rp0Var)).getFocusOwner()).f();
        if (rp0VarF == null || !rp0VarF.s) {
            return null;
        }
        return rp0VarF;
    }

    public static final int t(View view, int i2) {
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i2);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i4 = i3;
            }
            i3++;
            Object objU = w22.u(view);
            view = objU instanceof View ? (View) objU : null;
        }
        return i4;
    }

    public static final View u(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(t(view, 2131230924), t(view, 2131230927));
        View view2 = view;
        int i2 = 0;
        View view3 = view2;
        while (view != null) {
            if (i2 == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (B(view) == null) {
                i2++;
                Object objU = w22.u(view);
                View view4 = view2;
                view2 = view;
                view = objU instanceof View ? (View) objU : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final jk2 v(rp0 rp0Var) {
        ex1 ex1Var;
        if (rp0Var.s && (ex1Var = rp0Var.m) != null) {
            ab1 ab1VarY = vr.y(ex1Var);
            if (!ab1VarY.t0()) {
                ab1VarY = null;
            }
            if (ab1VarY != null) {
                return rp0Var.s1(ab1VarY);
            }
        }
        return jk2.e;
    }

    public static cr w(int i2) {
        as0 as0Var = as0.k;
        float fV = cl3.v((i2 >> 16) & 255);
        float fV2 = cl3.v((i2 >> 8) & 255);
        float fV3 = cl3.v(i2 & 255);
        double[][] dArr = cl3.r;
        double d = fV;
        double[] dArr2 = dArr[0];
        double d2 = fV2;
        double d3 = fV3;
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d4, (float) d5, (float) ((d3 * dArr4[2]) + (d2 * dArr4[1]) + (d * dArr4[0]))};
        float[][] fArr2 = cl3.o;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr3[0] * f2;
        float f4 = fArr[1];
        float f5 = (fArr3[1] * f4) + f3;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5;
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f2);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f2 * fArr5[0]);
        float[] fArr6 = as0Var.g;
        float f10 = as0Var.e;
        float f11 = as0Var.b;
        float f12 = fArr6[0] * f7;
        float f13 = fArr6[1] * f8;
        float f14 = fArr6[2] * f9;
        float f15 = as0Var.h;
        float fPow = (float) Math.pow((Math.abs(f12) * f15) / 100.0f, 0.41999998688697815d);
        float fPow2 = (float) Math.pow((Math.abs(f13) * f15) / 100.0f, 0.41999998688697815d);
        float fPow3 = (float) Math.pow((Math.abs(f14) * f15) / 100.0f, 0.41999998688697815d);
        float fSignum = ((Math.signum(f12) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f13) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f14) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        float f16 = ((((-12.0f) * fSignum2) + (fSignum * 11.0f)) + fSignum3) / 11.0f;
        float f17 = ((fSignum + fSignum2) - (fSignum3 * 2.0f)) / 9.0f;
        float f18 = fSignum2 * 20.0f;
        float f19 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f18)) / 20.0f;
        float f20 = (((fSignum * 40.0f) + f18) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f21 = fAtan2;
        float f22 = (f21 * 3.1415927f) / 180.0f;
        float fPow4 = ((float) Math.pow((f20 * as0Var.c) / f11, as0Var.j * f10)) * 100.0f;
        float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f21) < 20.14d ? 360.0f + f21 : f21) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * as0Var.f) * as0Var.d) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, as0Var.a)), 0.7300000190734863d)) * ((float) Math.sqrt(fPow4 / 100.0f));
        float f23 = as0Var.i * fPow5;
        Math.sqrt((r2 * f10) / (f11 + 4.0f));
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f22;
        return new cr(f21, fPow5, fPow4, f24, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    public static cr x(float f2, float f3, float f4) {
        float f5 = as0.k.i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(((double) f2) / 100.0d))) * r0.e) / (r0.b + 4.0f));
        float f6 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((((double) f5) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f4) / 180.0f;
        return new cr(f4, f3, f2, f6, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    public static jn1 y(String str) {
        str.getClass();
        sm1 sm1VarA = jn1.c.a(0, str);
        if (sm1VarA == null) {
            qn1.i("No subtype found for: \"", str, 34);
            return null;
        }
        String str2 = (String) ((qm1) sm1VarA.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = ((String) ((qm1) sm1VarA.a()).get(2)).toLowerCase(locale);
        lowerCase2.getClass();
        ArrayList arrayList = new ArrayList();
        int i2 = sm1VarA.b().g;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= str.length()) {
                return new jn1(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            sm1 sm1VarA2 = jn1.d.a(i3, str);
            if (sm1VarA2 == null) {
                c.j("Parameter is not formatted correctly: \"", str.substring(i3), "\" for: \"", str, 34);
                return null;
            }
            rm1 rm1Var = sm1VarA2.c;
            pm1 pm1VarB = rm1Var.b(1);
            String str3 = pm1VarB != null ? pm1VarB.a : null;
            if (str3 == null) {
                i2 = sm1VarA2.b().g;
            } else {
                pm1 pm1VarB2 = rm1Var.b(2);
                String strSubstring = pm1VarB2 != null ? pm1VarB2.a : null;
                if (strSubstring == null) {
                    pm1 pm1VarB3 = rm1Var.b(3);
                    pm1VarB3.getClass();
                    strSubstring = pm1VarB3.a;
                } else if (y93.B0(strSubstring, '\'') && y93.k0(strSubstring, '\'') && strSubstring.length() > 2) {
                    strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                }
                arrayList.add(str3);
                arrayList.add(strSubstring);
                i2 = sm1VarA2.b().g;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.rp0 z(defpackage.rp0 r8) {
        /*
            aq1 r0 = r8.f
            boolean r0 = r0.s
            r1 = 0
            if (r0 != 0) goto L9
            goto Laa
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.m21.c(r0)
        L10:
            qs1 r0 = new qs1
            r2 = 16
            aq1[] r3 = new defpackage.aq1[r2]
            r0.<init>(r3)
            aq1 r8 = r8.f
            aq1 r3 = r8.k
            if (r3 != 0) goto L23
            defpackage.vr.h(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.h
            if (r8 == 0) goto Laa
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.k(r8)
            aq1 r8 = (defpackage.aq1) r8
            int r3 = r8.i
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            defpackage.vr.h(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.h
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La7
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof defpackage.rp0
            r5 = 1
            if (r4 == 0) goto L6c
            rp0 r8 = (defpackage.rp0) r8
            aq1 r4 = r8.f
            boolean r4 = r4.s
            if (r4 == 0) goto La2
            mp0 r4 = r8.u1()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6b
            if (r4 == r5) goto L6b
            r5 = 2
            if (r4 == r5) goto L6b
            r8 = 3
            if (r4 != r8) goto L67
            goto La2
        L67:
            defpackage.c.k()
            return r1
        L6b:
            return r8
        L6c:
            int r4 = r8.h
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La2
            boolean r4 = r8 instanceof defpackage.ja0
            if (r4 == 0) goto La2
            r4 = r8
            ja0 r4 = (defpackage.ja0) r4
            aq1 r4 = r4.u
            r6 = 0
        L7c:
            if (r4 == 0) goto L9f
            int r7 = r4.h
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9c
            int r6 = r6 + 1
            if (r6 != r5) goto L8a
            r8 = r4
            goto L9c
        L8a:
            if (r3 != 0) goto L93
            qs1 r3 = new qs1
            aq1[] r7 = new defpackage.aq1[r2]
            r3.<init>(r7)
        L93:
            if (r8 == 0) goto L99
            r3.b(r8)
            r8 = r1
        L99:
            r3.b(r4)
        L9c:
            aq1 r4 = r4.k
            goto L7c
        L9f:
            if (r6 != r5) goto La2
            goto L45
        La2:
            aq1 r8 = defpackage.vr.j(r3)
            goto L45
        La7:
            aq1 r8 = r8.k
            goto L3c
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br.z(rp0):rp0");
    }

    public abstract int I(int i2);

    public abstract int J(int i2);

    @Override // defpackage.lt2
    public int b(int i2) {
        return J(i2);
    }

    @Override // defpackage.lt2
    public int c(int i2) {
        return I(i2);
    }

    @Override // defpackage.lt2
    public int g(int i2) {
        int I = I(i2);
        if (I == -1 || I(I) == -1) {
            return -1;
        }
        return I;
    }

    @Override // defpackage.lt2
    public int h(int i2) {
        int iJ = J(i2);
        if (iJ == -1 || J(iJ) == -1) {
            return -1;
        }
        return iJ;
    }
}
