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
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
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
    */
    public static final Object N(o50 o50Var, Object obj, Object obj2, rs0 rs0Var, p40 p40Var) throws Throwable {
        ms msVar;
        Object objF;
        Object objF2;
        if (p40Var instanceof ms) {
            msVar = (ms) p40Var;
            int i2 = msVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                msVar.m = i2 - Integer.MIN_VALUE;
            } else {
                msVar = new ms(p40Var);
            }
        }
        Object obj3 = msVar.l;
        int i3 = msVar.m;
        if (i3 != 0) {
            if (i3 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj4 = msVar.k;
            o50 o50Var2 = msVar.j;
            try {
                y02.Q(obj3);
                objF = obj4;
                o50Var = o50Var2;
                cl3.A(o50Var, objF);
                return obj3;
            } catch (Throwable th) {
                objF = obj4;
                o50Var = o50Var2;
                th = th;
                cl3.A(o50Var, objF);
                throw th;
            }
        }
        y02.Q(obj3);
        objF = cl3.F(o50Var, obj2);
        try {
            msVar.i = obj;
            msVar.j = o50Var;
            msVar.k = objF;
            msVar.m = 1;
            t83 t83Var = new t83(msVar, o50Var);
            if (rs0Var == null) {
                objF2 = vr.c0(rs0Var, obj, t83Var);
            } else {
                cl3.i(2, rs0Var);
                objF2 = rs0Var.f(obj, t83Var);
            }
            obj3 = objF2;
            Object obj5 = y50.f;
            if (obj3 == obj5) {
                return obj5;
            }
            cl3.A(o50Var, objF);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            cl3.A(o50Var, objF);
            throw th;
        }
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
                    */
                    public final Object e(Object obj4, Object obj5, Object obj6) {
                        float f2;
                        gy1 gy1Var = (gy1) obj6;
                        ((z60) obj4).getClass();
                        os1 os1Var2 = os1Var;
                        if (!((Boolean) os1Var2.getValue()).booleanValue()) {
                            os1Var2.setValue(Boolean.valueOf(!(Float.intBitsToFloat((int) (gy1Var.a >> 32)) == 0.0f)));
                        }
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (gy1Var.a >> 32)) / fT;
                        boolean z3 = z2;
                        z32 z32Var4 = z32Var;
                        float f3 = 1.0f;
                        if (z3) {
                            float fG = z32Var4.g() + fIntBitsToFloat;
                            f2 = fG >= 0.0f ? fG : 0.0f;
                            if (f2 <= 1.0f) {
                                f3 = f2;
                            }
                        } else {
                            float fG2 = z32Var4.g() - fIntBitsToFloat;
                            f2 = fG2 >= 0.0f ? fG2 : 0.0f;
                            if (f2 <= 1.0f) {
                            }
                        }
                        z32Var4.h(f3);
                        return dm3.a;
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
    */
    public static final void k(d00 d00Var, bq1 bq1Var, d00 d00Var2, ss0 ss0Var, nv0 nv0Var, int i2, int i3) {
        ss0 ss0Var2;
        int i4;
        ss0 ss0Var3;
        bq1 bq1Var2;
        xj2 xj2VarT;
        long j2;
        long j3;
        nv0 nv0Var2 = nv0Var;
        nv0Var2.b0(-1168952857);
        int i5 = i2 | 48;
        int i6 = i3 & 8;
        if (i6 == 0) {
            if ((i2 & 3072) == 0) {
                ss0Var2 = ss0Var;
                i5 |= nv0Var2.h(ss0Var2) ? 2048 : 1024;
            }
            i4 = i5;
            if (nv0Var2.R(i4 & 1, (i4 & 1171) == 1170)) {
                nv0Var2.U();
                ss0Var3 = ss0Var2;
                bq1Var2 = bq1Var;
            } else {
                ss0 ss0Var4 = i6 != 0 ? r51.e : ss0Var2;
                yp1 yp1Var = yp1.a;
                bq1 bq1VarC = j43.c(yp1Var, 1.0f);
                to2 to2Var = uo2.a;
                to2 to2Var2 = new to2(new kd0(0.0f), new kd0(0.0f), new kd0(28.0f), new kd0(28.0f));
                r93 r93Var = hy.a;
                bq1 bq1VarD = yh1.d(bq1VarC, to2Var2, false, wx.b(0.32f, ((fy) nv0Var2.j(r93Var)).p), nv0Var2, 2);
                cn1 cn1VarD = eo.d(f5.g, false);
                int iHashCode = Long.hashCode(nv0Var2.T);
                n52 n52VarL = nv0Var2.l();
                bq1 bq1VarM = lr.M(nv0Var2, bq1VarD);
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
                long j4 = wx.f;
                long j5 = wx.g;
                fy fyVar = (fy) nv0Var2.j(r93Var);
                kj3 kj3Var = fyVar.d0;
                if (kj3Var == null) {
                    kj3 kj3Var2 = new kj3(hy.d(fyVar, f80.b), hy.d(fyVar, f80.d), hy.d(fyVar, f80.c), hy.d(fyVar, f80.f), hy.d(fyVar, f80.g), hy.d(fyVar, f80.e));
                    fyVar.d0 = kj3Var2;
                    kj3Var = kj3Var2;
                }
                if (j4 != 16) {
                    j3 = j4;
                    j2 = 16;
                } else {
                    j2 = 16;
                    j3 = kj3Var.a;
                }
                if (j4 == 16) {
                    j4 = kj3Var.b;
                }
                long j6 = j4;
                long j7 = j5 != j2 ? j5 : kj3Var.c;
                long j8 = j5 != j2 ? j5 : kj3Var.d;
                long j9 = j5 != j2 ? j5 : kj3Var.e;
                if (j5 == j2) {
                    j5 = kj3Var.f;
                }
                ss0 ss0Var5 = ss0Var4;
                tf.b(d00Var, null, d00Var2, ss0Var5, 0.0f, null, new kj3(j3, j6, j7, j8, j9, j5), nv0Var, i4 & 8078);
                nv0Var2 = nv0Var;
                nv0Var2.p(true);
                ss0Var3 = ss0Var5;
                bq1Var2 = yp1Var;
            }
            xj2VarT = nv0Var2.t();
            if (xj2VarT == null) {
                xj2VarT.d = new ra(d00Var, bq1Var2, d00Var2, ss0Var3, i2, i3);
                return;
            }
            return;
        }
        i5 = i2 | 3120;
        ss0Var2 = ss0Var;
        i4 = i5;
        if (nv0Var2.R(i4 & 1, (i4 & 1171) == 1170)) {
        }
        xj2VarT = nv0Var2.t();
        if (xj2VarT == null) {
        }
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
        int iMin = Math.min(t(view, R.id.view_tree_lifecycle_owner), t(view, R.id.view_tree_saved_state_registry_owner));
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
    */
    public static final rp0 z(rp0 rp0Var) {
        boolean z = rp0Var.f.s;
        if (z) {
            if (!z) {
                m21.c("visitChildren called on an unattached node");
            }
            qs1 qs1Var = new qs1(new aq1[16]);
            aq1 aq1Var = rp0Var.f;
            aq1 aq1Var2 = aq1Var.k;
            if (aq1Var2 == null) {
                vr.h(qs1Var, aq1Var);
            } else {
                qs1Var.b(aq1Var2);
            }
            loop0: while (true) {
                int i2 = qs1Var.h;
                if (i2 == 0) {
                    break;
                }
                aq1 aq1VarJ = (aq1) qs1Var.k(i2 - 1);
                if ((aq1VarJ.i & 1024) == 0) {
                    vr.h(qs1Var, aq1VarJ);
                } else {
                    while (true) {
                        if (aq1VarJ == null) {
                            break;
                        }
                        if ((aq1VarJ.h & 1024) != 0) {
                            qs1 qs1Var2 = null;
                            while (aq1VarJ != null) {
                                if (aq1VarJ instanceof rp0) {
                                    rp0 rp0Var2 = (rp0) aq1VarJ;
                                    if (rp0Var2.f.s) {
                                        int iOrdinal = rp0Var2.u1().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            break loop0;
                                        }
                                        if (iOrdinal != 3) {
                                            c.k();
                                            return null;
                                        }
                                    }
                                } else if ((aq1VarJ.h & 1024) != 0 && (aq1VarJ instanceof ja0)) {
                                    int i3 = 0;
                                    for (aq1 aq1Var3 = ((ja0) aq1VarJ).u; aq1Var3 != null; aq1Var3 = aq1Var3.k) {
                                        if ((aq1Var3.h & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                aq1VarJ = aq1Var3;
                                            } else {
                                                if (qs1Var2 == null) {
                                                    qs1Var2 = new qs1(new aq1[16]);
                                                }
                                                if (aq1VarJ != null) {
                                                    qs1Var2.b(aq1VarJ);
                                                    aq1VarJ = null;
                                                }
                                                qs1Var2.b(aq1Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                aq1VarJ = vr.j(qs1Var2);
                            }
                        } else {
                            aq1VarJ = aq1VarJ.k;
                        }
                    }
                }
            }
        }
        return null;
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
