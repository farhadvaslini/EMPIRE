package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class m22 implements h73, n50, zt3, oo1, yp0, ea0, m2, ij, kj {
    public static final qn1 B;
    public static final m22 C;
    public final /* synthetic */ int f;
    public static final m22 g = new m22(0);
    public static final m22 h = new m22(1);
    public static final /* synthetic */ m22 i = new m22(3);
    public static final m22 j = new m22(5);
    public static final m22 k = new m22(6);
    public static final m22 l = new m22(7);
    public static final m22 m = new m22(8);
    public static final m22 n = new m22(9);
    public static final qn1 o = new qn1(12);
    public static final qn1 p = new qn1(13);
    public static final qn1 q = new qn1(14);
    public static final qn1 r = new qn1(15);
    public static final /* synthetic */ m22 s = new m22(11);
    public static final m22 t = new m22(12);
    public static final m22 u = new m22(13);
    public static final m22 v = new m22(14);
    public static final m22 w = new m22(15);
    public static final qn1 x = new qn1(17);
    public static final qn1 y = new qn1(18);
    public static final m22 z = new m22(17);
    public static final m22 A = new m22(18);
    public static final au3 D = new au3();

    static {
        int i2 = 20;
        B = new qn1(i2);
        C = new m22(i2);
    }

    public /* synthetic */ m22(int i2) {
        this.f = i2;
    }

    public static final void k(yj yjVar) {
        s4 s4Var = yj.h;
        if (yj.i == null) {
            yj.i = new yj();
            xj xjVar = new xj("Okio Watchdog");
            xjVar.setDaemon(true);
            xjVar.start();
        }
        long jNanoTime = System.nanoTime();
        long j2 = yjVar.c;
        boolean z2 = yjVar.a;
        if (j2 != 0 && z2) {
            yjVar.g = Math.min(j2, yjVar.c() - jNanoTime) + jNanoTime;
        } else if (j2 != 0) {
            yjVar.g = jNanoTime + j2;
        } else {
            if (!z2) {
                throw new AssertionError();
            }
            yjVar.g = yjVar.c();
        }
        s4 s4Var2 = yj.h;
        int i2 = s4Var2.a + 1;
        s4Var2.a = i2;
        yj[] yjVarArr = (yj[]) s4Var2.b;
        if (i2 == yjVarArr.length) {
            yj[] yjVarArr2 = new yj[i2 * 2];
            uj.L(yjVarArr, yjVarArr2, 0, 0, 14);
            s4Var2.b = yjVarArr2;
        }
        s4Var2.e(i2, yjVar);
        if (yjVar.f == 1) {
            yj.k.signal();
        }
    }

    public static yj l() throws InterruptedException {
        s4 s4Var = yj.h;
        yj yjVar = ((yj[]) s4Var.b)[1];
        if (yjVar == null) {
            long jNanoTime = System.nanoTime();
            yj.k.await(yj.l, TimeUnit.MILLISECONDS);
            if (((yj[]) s4Var.b)[1] != null || System.nanoTime() - jNanoTime < yj.m) {
                return null;
            }
            return yj.i;
        }
        long jNanoTime2 = yjVar.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            yj.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        s4Var.g(yjVar);
        yjVar.e = 2;
        return yjVar;
    }

    public static boolean m(Collection collection, Set set, Set set2) {
        Map map = xv0.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            ((o92) entry.getValue()).getClass();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        Set setKeySet = linkedHashMap.keySet();
        setKeySet.getClass();
        Set setR0 = qx.R0(collection);
        if (!setR0.containsAll(set2)) {
            return false;
        }
        LinkedHashSet linkedHashSetU0 = qx.u0(set, setR0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : linkedHashSetU0) {
            if (!setKeySet.contains((String) obj)) {
                linkedHashSet.add(obj);
            }
        }
        return set2.containsAll(linkedHashSet);
    }

    public static m92 n(Collection collection, Set set) {
        Set setR0;
        Set setR02 = qx.R0(collection);
        Set set2 = setR02;
        LinkedHashSet linkedHashSetU0 = qx.u0(set, set2);
        if (linkedHashSetU0.isEmpty()) {
            setR0 = qx.R0(set2);
        } else if (linkedHashSetU0 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set2) {
                if (!linkedHashSetU0.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            setR0 = linkedHashSet;
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(setR02);
            linkedHashSet2.removeAll(linkedHashSetU0);
            setR0 = linkedHashSet2;
        }
        return new m92(setR02, linkedHashSetU0, setR0);
    }

    public static es1 o(FileInputStream fileInputStream) throws c60 {
        byte[] bArr;
        try {
            jc2 jc2VarO = jc2.o(fileInputStream);
            es1 es1Var = new es1(false);
            fc2[] fc2VarArr = (fc2[]) Arrays.copyOf(new fc2[0], 0);
            es1Var.b();
            if (fc2VarArr.length > 0) {
                fc2 fc2Var = fc2VarArr[0];
                throw null;
            }
            Map mapM = jc2VarO.m();
            mapM.getClass();
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                oc2 oc2Var = (oc2) entry.getValue();
                str.getClass();
                oc2Var.getClass();
                int iC = oc2Var.C();
                switch (iC == 0 ? -1 : gc2.a[nc2.z(iC)]) {
                    case -1:
                        throw new c60("Value case is null.", null);
                    case 0:
                    default:
                        c.k();
                        return null;
                    case 1:
                        es1Var.e(new ec2(str), Boolean.valueOf(oc2Var.t()));
                        break;
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        es1Var.e(new ec2(str), Float.valueOf(oc2Var.x()));
                        break;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        es1Var.e(new ec2(str), Double.valueOf(oc2Var.w()));
                        break;
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        es1Var.e(new ec2(str), Integer.valueOf(oc2Var.y()));
                        break;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        es1Var.e(new ec2(str), Long.valueOf(oc2Var.z()));
                        break;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        es1Var.e(new ec2(str), oc2Var.A());
                        break;
                    case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                        ec2 ec2Var = new ec2(str);
                        b51 b51VarN = oc2Var.B().n();
                        b51VarN.getClass();
                        es1Var.e(ec2Var, qx.R0(b51VarN));
                        break;
                    case 8:
                        ec2 ec2Var2 = new ec2(str);
                        jq jqVarU = oc2Var.u();
                        int size = jqVarU.size();
                        if (size == 0) {
                            bArr = c51.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            jqVarU.e(bArr2, size);
                            bArr = bArr2;
                        }
                        es1Var.e(ec2Var2, bArr);
                        break;
                    case vr.g /* 9 */:
                        throw new c60("Value not set.", null);
                }
            }
            return new es1(new LinkedHashMap(es1Var.a()), true);
        } catch (z51 e) {
            throw new c60("Unable to parse preferences proto.", e);
        }
    }

    public static void q(Object obj, vl3 vl3Var) {
        wv0 wv0VarA;
        Map mapA = ((es1) obj).a();
        hc2 hc2VarN = jc2.n();
        for (Map.Entry entry : mapA.entrySet()) {
            ec2 ec2Var = (ec2) entry.getKey();
            Object value = entry.getValue();
            String str = ec2Var.a;
            if (value instanceof Boolean) {
                mc2 mc2VarD = oc2.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                mc2VarD.c();
                oc2.q((oc2) mc2VarD.g, zBooleanValue);
                wv0VarA = mc2VarD.a();
            } else if (value instanceof Float) {
                mc2 mc2VarD2 = oc2.D();
                float fFloatValue = ((Number) value).floatValue();
                mc2VarD2.c();
                oc2.r((oc2) mc2VarD2.g, fFloatValue);
                wv0VarA = mc2VarD2.a();
            } else if (value instanceof Double) {
                mc2 mc2VarD3 = oc2.D();
                double dDoubleValue = ((Number) value).doubleValue();
                mc2VarD3.c();
                oc2.o((oc2) mc2VarD3.g, dDoubleValue);
                wv0VarA = mc2VarD3.a();
            } else if (value instanceof Integer) {
                mc2 mc2VarD4 = oc2.D();
                int iIntValue = ((Number) value).intValue();
                mc2VarD4.c();
                oc2.s((oc2) mc2VarD4.g, iIntValue);
                wv0VarA = mc2VarD4.a();
            } else if (value instanceof Long) {
                mc2 mc2VarD5 = oc2.D();
                long jLongValue = ((Number) value).longValue();
                mc2VarD5.c();
                oc2.l((oc2) mc2VarD5.g, jLongValue);
                wv0VarA = mc2VarD5.a();
            } else if (value instanceof String) {
                mc2 mc2VarD6 = oc2.D();
                mc2VarD6.c();
                oc2.m((oc2) mc2VarD6.g, (String) value);
                wv0VarA = mc2VarD6.a();
            } else if (value instanceof Set) {
                mc2 mc2VarD7 = oc2.D();
                kc2 kc2VarO = lc2.o();
                kc2VarO.c();
                lc2.l((lc2) kc2VarO.g, (Set) value);
                mc2VarD7.c();
                oc2.n((oc2) mc2VarD7.g, (lc2) kc2VarO.a());
                wv0VarA = mc2VarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    c.q("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return;
                }
                mc2 mc2VarD8 = oc2.D();
                byte[] bArr = (byte[]) value;
                jq jqVarC = jq.c(bArr, 0, bArr.length);
                mc2VarD8.c();
                oc2.p((oc2) mc2VarD8.g, jqVarC);
                wv0VarA = mc2VarD8.a();
            }
            hc2VarN.getClass();
            hc2VarN.c();
            jc2.l((jc2) hc2VarN.g).put(str, (oc2) wv0VarA);
        }
        jc2 jc2Var = (jc2) hc2VarN.a();
        int iA = jc2Var.a(null);
        Logger logger = nx.f;
        if (iA > 4096) {
            iA = 4096;
        }
        nx nxVar = new nx(vl3Var, iA);
        jc2Var.b(nxVar);
        if (nxVar.d > 0) {
            nxVar.k();
        }
    }

    @Override // defpackage.ij, defpackage.kj
    public float a() {
        switch (this.f) {
        }
        return 0.0f;
    }

    @Override // defpackage.ea0
    public boolean c(SSLSocket sSLSocket) {
        return fa3.e0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.h73
    public boolean d(Object obj, Object obj2) {
        switch (this.f) {
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return obj == obj2;
            default:
                return s51.n(obj, obj2);
        }
    }

    @Override // defpackage.ea0
    public r73 e(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new ob(superclass);
    }

    @Override // defpackage.ij
    public void f(ua0 ua0Var, int i2, int[] iArr, bb1 bb1Var, int[] iArr2) {
        int i3 = this.f;
        bb1 bb1Var2 = bb1.f;
        switch (i3) {
            case 27:
                if (bb1Var != bb1Var2) {
                    n92.v(i2, iArr, iArr2, true);
                } else {
                    n92.v(i2, iArr, iArr2, false);
                }
                break;
            default:
                if (bb1Var != bb1Var2) {
                    n92.w(i2, iArr, iArr2, true);
                } else {
                    n92.w(i2, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // defpackage.kj
    public void g(ua0 ua0Var, int i2, int[] iArr, int[] iArr2) {
        switch (this.f) {
            case 27:
                n92.v(i2, iArr, iArr2, false);
                break;
            default:
                n92.w(i2, iArr, iArr2, false);
                break;
        }
    }

    @Override // defpackage.zt3
    public vt3 h(Context context, va0 va0Var) {
        va0Var.getClass();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            Activity activity = (Activity) baseContext;
            yn.a.getClass();
            int i2 = Build.VERSION.SDK_INT;
            return new vt3(new tn((i2 >= 30 ? zn.f : i2 >= 29 ? f5.y : i2 >= 28 ? f5.x : f5.w).c(activity)), va0Var.e(activity));
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            c.p("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new vt3(new Rect(0, 0, point.x, point.y), va0Var.e(context));
    }

    public void i(Drawable drawable, nv0 nv0Var, int i2) {
        nv0Var.b0(257732500);
        int i3 = (nv0Var.h(drawable) ? 4 : 2) | i2;
        int i4 = 1;
        if (nv0Var.R(i3 & 1, (i3 & 3) != 2)) {
            bq1 bq1VarK = j43.k(yp1.a, l40.e);
            boolean zH = nv0Var.h(drawable);
            Object objO = nv0Var.O();
            if (zH || objO == c20.a) {
                objO = new i13(drawable, i4);
                nv0Var.j0(objO);
            }
            eo.a(w7.K(bq1VarK, (ns0) objO), nv0Var, 0);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new nh2(i2, 11, this, drawable);
        }
    }

    public void j(float f, float f2, int i2, long j2, nv0 nv0Var, bq1 bq1Var, z13 z13Var) {
        bq1 bq1Var2;
        float f3;
        long j3;
        z13 z13Var2;
        float f4;
        long jE;
        z13 z13Var3;
        nv0Var.b0(-1895596205);
        int i3 = i2 | (nv0Var.f(bq1Var) ? 4 : 2) | 25984;
        if (nv0Var.R(i3 & 1, (i3 & 9363) != 9362)) {
            nv0Var.W();
            if ((i2 & 1) == 0 || nv0Var.A()) {
                f4 = cd2.b;
                jE = hy.e(cd2.a, nv0Var);
                z13Var3 = cd2.c;
            } else {
                nv0Var.U();
                f4 = f2;
                jE = j2;
                z13Var3 = z13Var;
            }
            nv0Var.q();
            bq1Var2 = bq1Var;
            oz2.g(nv0Var, gv3.v(j43.h(bq1Var2, f4).d(new i43(f, 0.0f, f, 0.0f, false, 10)), jE, z13Var3));
            f3 = f4;
            j3 = jE;
            z13Var2 = z13Var3;
        } else {
            bq1Var2 = bq1Var;
            nv0Var.U();
            f3 = f2;
            j3 = j2;
            z13Var2 = z13Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new mn(this, bq1Var2, f, f3, j3, z13Var2, i2);
        }
    }

    @Override // defpackage.oo1
    public boolean p(nn1 nn1Var) {
        return false;
    }

    public String toString() {
        switch (this.f) {
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return "ReferentialEqualityPolicy";
            case vr.i /* 12 */:
                return "Start";
            case 13:
                return "StructuralEqualityPolicy";
            case 27:
                return "Arrangement#Center";
            case 28:
                return "Arrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.oo1
    public void b(nn1 nn1Var, boolean z2) {
    }
}
