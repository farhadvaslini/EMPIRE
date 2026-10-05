package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class xc1 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xc1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v40 */
    @Override // defpackage.ns0
    public final Object h(Object obj) {
        ee1 ee1Var;
        Bundle bundle;
        ?? r16;
        InputStream inputStreamA;
        byte[] bArr;
        long j;
        ye1 ye1Var;
        int i = 12;
        Object obj2 = null;
        switch (this.f) {
            case 0:
                return new c4(9, (yc1) this.g);
            case 1:
                return new c4(11, (jd1) this.g);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                Object obj3 = this.g;
                ((Integer) obj).getClass();
                return obj3;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ie1 ie1Var = (ie1) this.g;
                float f = -((Float) obj).floatValue();
                if ((f >= 0.0f || ie1Var.c()) && (f <= 0.0f || ie1Var.a())) {
                    if (Math.abs(ie1Var.h) > 0.5f) {
                        p21.c("entered drag with non-zero pending scroll");
                    }
                    ie1Var.d = true;
                    float f2 = ie1Var.h + f;
                    ie1Var.h = f2;
                    if (Math.abs(f2) > 0.5f) {
                        float f3 = ie1Var.h;
                        int iRound = Math.round(f3);
                        ee1 ee1VarH = ((ee1) ie1Var.f.getValue()).h(iRound, !ie1Var.b);
                        if (ee1VarH != null && (ee1Var = ie1Var.c) != null) {
                            ee1 ee1VarH2 = ee1Var.h(iRound, true);
                            if (ee1VarH2 != null) {
                                ie1Var.c = ee1VarH2;
                            } else {
                                ee1VarH = null;
                            }
                        }
                        if (ee1VarH != null) {
                            ie1Var.f(ee1VarH, ie1Var.b, true);
                            ie1Var.v.setValue(dm3.a);
                            ie1Var.j(f3 - ie1Var.h, ee1VarH);
                        } else {
                            tb1 tb1Var = ie1Var.k;
                            if (tb1Var != null) {
                                tb1Var.k();
                            }
                            ie1Var.j(f3 - ie1Var.h, ie1Var.i());
                        }
                    }
                    if (Math.abs(ie1Var.h) > 0.5f) {
                        f -= ie1Var.h;
                        ie1Var.h = 0.0f;
                    }
                    f = f;
                }
                return Float.valueOf(-f);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                gq2 gq2Var = (gq2) this.g;
                return Boolean.valueOf(gq2Var != null ? gq2Var.b(obj) : true);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                fy fyVar = (fy) this.g;
                qf0 qf0Var = (qf0) obj;
                qf0Var.getClass();
                float fB = h43.b(qf0Var.a()) * 0.42f;
                qf0.a0(qf0Var, wx.b(0.19f, fyVar.a), fB, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (qf0Var.a() & 4294967295L)) * 0.14f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (qf0Var.a() >> 32)) * 0.18f)) << 32), null, 120);
                qf0.a0(qf0Var, wx.b(0.16f, fyVar.j), 1.15f * fB, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (qf0Var.a() & 4294967295L)) * 0.78f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (qf0Var.a() >> 32)) * 0.86f)) << 32), null, 120);
                qf0.a0(qf0Var, wx.b(0.1f, fyVar.f), fB * 0.7f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (qf0Var.a() >> 32)) * 0.55f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (qf0Var.a() & 4294967295L)) * 0.48f)) & 4294967295L), null, 120);
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((rm1) this.g).b(((Integer) obj).intValue());
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                uw0 uw0Var = (uw0) obj;
                float fFloatValue = ((Number) ((ed) this.g).d()).floatValue();
                float fD = vp1.d(uw0Var, fFloatValue);
                float fE = vp1.e(uw0Var, fFloatValue);
                uw0Var.s(fE != 0.0f ? fD / fE : 1.0f);
                uw0Var.q0(vp1.a);
                return dm3.a;
            case 8:
                jp1 jp1Var = (jp1) this.g;
                jp1Var.show();
                return new c4(i, jp1Var);
            case vr.g /* 9 */:
                ((dt1) this.g).i(null);
                return dm3.a;
            case vr.h /* 10 */:
                Bundle bundle2 = (Bundle) obj;
                nu1 nu1VarV = lr.v((Context) this.g);
                if (bundle2 != null) {
                    bundle2.setClassLoader(nu1VarV.a.getClassLoader());
                }
                wt1 wt1Var = nu1VarV.b;
                LinkedHashMap linkedHashMap = wt1Var.m;
                if (bundle2 == null) {
                    r16 = 0;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            jo3.q("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    wt1Var.d = bundle;
                    wt1Var.e = bundle2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) g12.N("android-support-nav:controller:backStack", bundle2).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            jo3.q("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            jo3.q("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            int i4 = i3 + 1;
                            Object obj4 = obj2;
                            wt1Var.l.put(Integer.valueOf(intArray[i2]), !s51.n(stringArrayList.get(i3), "") ? stringArrayList.get(i3) : obj4);
                            i2++;
                            i3 = i4;
                            obj2 = obj4;
                        }
                    }
                    r16 = obj2;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            jo3.q("android-support-nav:controller:backStackStates");
                            throw r16;
                        }
                        int size = stringArrayList2.size();
                        int i5 = 0;
                        while (i5 < size) {
                            String str = stringArrayList2.get(i5);
                            i5++;
                            String str2 = str;
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str2)) {
                                ArrayList arrayListN = g12.N("android-support-nav:controller:backStackStates:" + str2, bundle2);
                                mj mjVar = new mj(arrayListN.size());
                                int size2 = arrayListN.size();
                                int i6 = 0;
                                while (i6 < size2) {
                                    Object obj5 = arrayListN.get(i6);
                                    i6++;
                                    mjVar.addLast(new tt1((Bundle) obj5));
                                }
                                linkedHashMap.put(str2, mjVar);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    ?? ValueOf = (z || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : r16;
                    nu1VarV.e = ValueOf != 0 ? ValueOf.booleanValue() : false;
                }
                return nu1VarV;
            case 11:
                yv1 yv1Var = (yv1) this.g;
                qt1 qt1Var = (qt1) obj;
                qt1Var.getClass();
                st1 st1Var = qt1Var.m;
                fu1 fu1Var = qt1Var.g;
                if (fu1Var == null) {
                    fu1Var = null;
                }
                if (fu1Var == null) {
                    return null;
                }
                st1Var.a();
                fu1 fu1VarC = yv1Var.c(fu1Var);
                if (fu1VarC == null) {
                    return null;
                }
                return fu1VarC.equals(fu1Var) ? qt1Var : yv1Var.b().b(fu1VarC, fu1VarC.a(st1Var.a()));
            case vr.i /* 12 */:
                ((as1) this.g).b((zp1) obj);
                return Boolean.TRUE;
            case 13:
                m32 m32Var = (m32) this.g;
                float fFloatValue2 = ((Float) obj).floatValue();
                i32 i32Var = m32Var.b;
                i32Var.q.h(i32Var.j(i32Var.k() + vm1.M(i32Var.p() != 0 ? fFloatValue2 / i32Var.p() : 0.0f)));
                return dm3.a;
            case 14:
                File file = (File) this.g;
                ln2 ln2Var = (ln2) obj;
                ln2Var.getClass();
                nn2 nn2Var = ln2Var.l;
                if (nn2Var.b() > 33554432) {
                    c.q("Plugin package is too large");
                    return null;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    inputStreamA = nn2Var.f().A();
                    try {
                        bArr = new byte[8192];
                        j = 0;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        uq.l(fileOutputStream, th);
                        throw th2;
                    }
                }
                while (true) {
                    int i7 = inputStreamA.read(bArr);
                    if (i7 == -1) {
                        inputStreamA.close();
                        fileOutputStream.close();
                        return file;
                    }
                    j += (long) i7;
                    if (j > 33554432) {
                        throw new IllegalStateException("Plugin package is too large");
                    }
                    fileOutputStream.write(bArr, 0, i7);
                    throw th;
                }
                break;
            case jo3.g /* 15 */:
                y92 y92Var = (y92) this.g;
                File file2 = (File) obj;
                File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                ArrayList arrayList = new ArrayList();
                for (File file3 : fileArrListFiles) {
                    if (file3.isDirectory()) {
                        String name = file3.getName();
                        name.getClass();
                        if (!y93.B0(name, '.')) {
                            arrayList.add(file3);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size3 = arrayList.size();
                int i8 = 0;
                while (i8 < size3) {
                    Object obj6 = arrayList.get(i8);
                    i8++;
                    y31 y31VarJ = y92Var.j((File) obj6);
                    if (y31VarJ != null) {
                        arrayList2.add(y31VarJ);
                    }
                }
                SharedPreferences sharedPreferences = y92Var.d;
                String name2 = file2.getName();
                name2.getClass();
                String string = sharedPreferences.getString(y92.r(name2), null);
                int size4 = arrayList2.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size4) {
                        Object obj7 = arrayList2.get(i9);
                        i9++;
                        if (s51.n(((y31) obj7).a.d, string)) {
                            obj2 = obj7;
                        }
                    }
                }
                y31 y31Var = (y31) obj2;
                return y31Var == null ? (y31) qx.B0(arrayList2, new w92(i, new up0(15))) : y31Var;
            case 16:
                ((mc) ((mb2) this.g).f()).h((MotionEvent) obj);
                return dm3.a;
            case 17:
                ym0 ym0Var = (ym0) this.g;
                dv2 dv2Var = (dv2) obj;
                if (ym0Var.a() > 0.0f) {
                    bv2.h(dv2Var, new qd2(ym0Var.a(), new ex(0.0f, 1.0f), 0));
                }
                return dm3.a;
            case 18:
                vi2 vi2Var = (vi2) this.g;
                ((jc0) obj).getClass();
                return new c4(14, vi2Var);
            case 19:
                List list = (List) this.g;
                ae1 ae1Var = (ae1) obj;
                ae1Var.getClass();
                int i10 = 3;
                ae1.W(ae1Var, null, cl3.S, 3);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj8 : list) {
                    re3 re3Var = (re3) obj8;
                    if (re3Var.c <= 3 || re3Var.h) {
                        arrayList3.add(obj8);
                    }
                }
                ae1Var.X(arrayList3.size(), new la(22, new h12(4), arrayList3), new wa(i10, arrayList3), new d00(2039820996, new kk1(i10, arrayList3), true));
                ae1.W(ae1Var, null, cl3.T, 3);
                return dm3.a;
            case 20:
                ((l20) this.g).y(obj);
                return dm3.a;
            case 21:
                ek2 ek2Var = (ek2) this.g;
                Throwable th3 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th3);
                synchronized (ek2Var.c) {
                    try {
                        j61 j61Var = ek2Var.d;
                        if (j61Var != null) {
                            i93 i93Var = ek2Var.u;
                            bk2 bk2Var = bk2.g;
                            i93Var.getClass();
                            i93Var.j(null, bk2Var);
                            j61Var.c(cancellationException);
                            ek2Var.r = null;
                            j61Var.r(new er1(i, ek2Var, th3));
                        } else {
                            ek2Var.e = cancellationException;
                            i93 i93Var2 = ek2Var.u;
                            bk2 bk2Var2 = bk2.f;
                            i93Var2.getClass();
                            i93Var2.j(null, bk2Var2);
                        }
                    } finally {
                    }
                }
                return dm3.a;
            case 22:
                ((hk2) this.g).a((eh0) obj);
                return dm3.a;
            case 23:
                gq2 gq2Var2 = ((eq2) this.g).h;
                return Boolean.valueOf(gq2Var2 != null ? gq2Var2.b(obj) : true);
            case 24:
                es2 es2Var = (es2) this.g;
                float fFloatValue3 = ((Float) obj).floatValue();
                a42 a42Var = es2Var.a;
                float fG = a42Var.g() + fFloatValue3 + es2Var.g;
                float fG2 = y02.g(fG, 0.0f, es2Var.f.g());
                i = fG == fG2 ? 1 : 0;
                float fG3 = fG2 - a42Var.g();
                int iRound2 = Math.round(fG3);
                a42Var.h(a42Var.g() + iRound2);
                es2Var.g = fG3 - iRound2;
                if (i == 0) {
                    fFloatValue3 = fG3;
                }
                return Float.valueOf(fFloatValue3);
            case 25:
                ws2 ws2Var = (ws2) this.g;
                return new gy1(ws2Var.d(ws2Var.k, ((gy1) obj).a, ws2Var.j));
            case 26:
                g51 g51Var = (g51) this.g;
                gb2 gb2Var = (gb2) obj;
                long j2 = gb2Var.c;
                sf3 sf3Var = (sf3) g51Var.d;
                if (sf3Var.k() && sf3Var.n().a.g.length() != 0 && (ye1Var = sf3Var.d) != null && ye1Var.d() != null) {
                    g51Var.d(sf3Var.n(), j2, false, m22.o);
                    i = 1;
                }
                if (i != 0) {
                    gb2Var.a();
                }
                return dm3.a;
            case 27:
                bv2.i((dv2) obj, ((no2) this.g).a);
                return dm3.a;
            case 28:
                ((List) obj).add((Float) ((vd1) this.g).a());
                return true;
            default:
                v3 v3Var = (v3) this.g;
                obj.getClass();
                return v3Var.a();
        }
    }

    public /* synthetic */ xc1(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
    }
}
