package defpackage;

import android.graphics.RectF;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u(int i, int i2, Object obj) {
        this.f = i2;
        this.g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // defpackage.rs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2) {
        boolean zG;
        int i;
        char c;
        char c2;
        char c3 = 7;
        hr hrVarY = null;
        j61 j61Var = null;
        switch (this.f) {
            case 0:
                w wVar = (w) this.g;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wVar.a(0, nv0Var);
                } else {
                    nv0Var.U();
                }
                return dm3.a;
            case 1:
                ps2 ps2Var = (ps2) this.g;
                cl3.t(ps2Var.d1(), null, new s0(ps2Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
                return Boolean.TRUE;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                qn1 qn1Var = (qn1) this.g;
                jk2 jk2VarH = w22.H((RectF) obj);
                jk2 jk2VarH2 = w22.H((RectF) obj2);
                switch (qn1Var.f) {
                    case 17:
                        zG = jk2VarH.g(jk2VarH2);
                        break;
                    default:
                        zG = jk2VarH2.a(jk2VarH.b());
                        break;
                }
                return Boolean.valueOf(zG);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                x31 x31Var = (x31) this.g;
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mg3.b(oz2.N(R.string.launcher_cleo_delete_message, new Object[]{x31Var.a}, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                } else {
                    nv0Var2.U();
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                kv kvVar = (kv) this.g;
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mg3.b(oz2.M(kvVar.f, nv0Var3), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var3, 0, 0, 262142);
                } else {
                    nv0Var3.U();
                }
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                ((x10) this.g).a(jo3.y(1), (nv0) obj);
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nv0 nv0Var4 = (nv0) this.g;
                bq1 bq1Var = (bq1) obj;
                bq1 bq1VarL = (zp1) obj2;
                if (bq1VarL instanceof b20) {
                    ss0 ss0Var = ((b20) bq1VarL).e;
                    cl3.i(3, ss0Var);
                    bq1VarL = lr.L(nv0Var4, (bq1) ss0Var.e(yp1.a, nv0Var4, 0));
                }
                return bq1Var.d(bq1VarL);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                zk2 zk2Var = (zk2) this.g;
                ((Integer) obj).getClass();
                if (obj2 instanceof j10) {
                    j10 j10Var = (j10) obj2;
                    js1 js1Var = zk2Var.h;
                    if (js1Var == null) {
                        js1 js1Var2 = or2.a;
                        js1Var = new js1();
                        zk2Var.h = js1Var;
                    }
                    js1Var.k(j10Var);
                    zk2Var.f.b(j10Var);
                }
                if (obj2 instanceof rv0) {
                    zk2Var.e((rv0) obj2);
                }
                if (obj2 instanceof xj2) {
                    ((xj2) obj2).c();
                }
                return dm3.a;
            case 8:
                ((Integer) obj2).getClass();
                gq.n((sf3) this.g, (nv0) obj, jo3.y(1));
                return dm3.a;
            case vr.g /* 9 */:
                ee3 ee3Var = (ee3) this.g;
                nv0 nv0Var5 = (nv0) obj;
                ((Integer) obj2).getClass();
                nv0Var5.a0(666084174);
                String str = ee3Var.b;
                nv0Var5.p(false);
                return str;
            case vr.h /* 10 */:
                ((Integer) obj2).getClass();
                uq.a((mb0) this.g, (nv0) obj, jo3.y(1));
                return dm3.a;
            case 11:
                ((Integer) obj2).getClass();
                ((kb0) this.g).a(jo3.y(1), (nv0) obj);
                return dm3.a;
            case vr.i /* 12 */:
                nk2 nk2Var = (nk2) this.g;
                float fFloatValue = ((Float) obj2).floatValue();
                ((gb2) obj).a();
                nk2Var.f = fFloatValue;
                return dm3.a;
            case 13:
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (nv0Var6.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    throw null;
                }
                nv0Var6.U();
                return dm3.a;
            case 14:
                yv2 yv2Var = (yv2) this.g;
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (nv0Var7.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    mg3.b(yv2Var.a.a.c, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var7, 0, 0, 262142);
                } else {
                    nv0Var7.U();
                }
                return dm3.a;
            case jo3.g /* 15 */:
                ((Integer) obj2).getClass();
                ((f21) this.g).a(jo3.y(1), (nv0) obj);
                return dm3.a;
            case 16:
                a51 a51Var = (a51) this.g;
                gb2 gb2Var = (gb2) obj;
                gb2Var.getClass();
                cl3.t(a51Var.a, null, new j(a51Var, gb2Var, hrVarY, 25), 3);
                return dm3.a;
            case 17:
                vg2 vg2Var = (vg2) this.g;
                nv0 nv0Var8 = (nv0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (nv0Var8.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    mg3.b(oz2.N(R.string.launcher_raksamp_delete_confirm, new Object[]{vg2Var.b, String.valueOf(vg2Var.c)}, nv0Var8), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var8, 0, 0, 262142);
                } else {
                    nv0Var8.U();
                }
                return dm3.a;
            case 18:
                ti tiVar = (ti) this.g;
                nv0 nv0Var9 = (nv0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (nv0Var9.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mg3.b(tiVar.name(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var9, 0, 0, 262142);
                } else {
                    nv0Var9.U();
                }
                return dm3.a;
            case 19:
                ((qe3) this.g).e(((gy1) obj2).a);
                return dm3.a;
            case 20:
                ((Integer) obj2).getClass();
                ((gp1) this.g).a(jo3.y(1), (nv0) obj);
                return dm3.a;
            case 21:
                t33 t33Var = t33.h;
                t33 t33Var2 = t33.g;
                s33 s33Var = (s33) this.g;
                p41 p41Var = (p41) obj;
                float fH = m30.h(((m30) obj2).a);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                t33 t33Var3 = t33.f;
                linkedHashMap.put(t33Var3, Float.valueOf(fH));
                float f = fH / 2.0f;
                if (((int) (p41Var.a & 4294967295L)) > f) {
                    linkedHashMap.put(t33Var, Float.valueOf(f));
                }
                int i2 = (int) (p41Var.a & 4294967295L);
                if (i2 != 0) {
                    linkedHashMap.put(t33Var2, Float.valueOf(Math.max(0.0f, fH - i2)));
                }
                fm1 fm1Var = new fm1(linkedHashMap);
                int iOrdinal = ((t33) s33Var.c.h.getValue()).ordinal();
                if (iOrdinal == 0) {
                    t33Var2 = t33Var3;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        c.k();
                        return null;
                    }
                    if (!linkedHashMap.containsKey(t33Var)) {
                        t33Var = linkedHashMap.containsKey(t33Var2) ? t33Var2 : t33Var3;
                    }
                    t33Var2 = t33Var;
                } else if (!linkedHashMap.containsKey(t33Var2)) {
                }
                return new r32(fm1Var, t33Var2);
            case 22:
                ir1 ir1Var = (ir1) this.g;
                Set set = (Set) obj;
                qk2 qk2Var = new qk2();
                synchronized (ir1Var.a) {
                    is1 is1Var = ir1Var.b;
                    v1 v1Var = new v1(set, ir1Var, qk2Var, 18);
                    cl3.i(1, v1Var);
                    Object[] objArr = is1Var.b;
                    long[] jArr = is1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        v1Var.h(objArr[(i3 << 3) + i5]);
                                    }
                                    j >>= 8;
                                }
                                if (i4 == 8) {
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                    List list = (List) qk2Var.f;
                    if (list != null) {
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((lv2) list.get(i6)).l(dm3.a);
                        }
                    }
                }
                return dm3.a;
            case 23:
                z31 z31Var = (z31) this.g;
                nv0 nv0Var10 = (nv0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (nv0Var10.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    int iOrdinal2 = z31Var.ordinal();
                    if (iOrdinal2 == 0) {
                        i = R.string.plugins_filter_all;
                    } else if (iOrdinal2 == 1) {
                        i = R.string.plugins_filter_enabled;
                    } else if (iOrdinal2 == 2) {
                        i = R.string.plugins_filter_disabled;
                    } else {
                        if (iOrdinal2 != 3) {
                            c.k();
                            return null;
                        }
                        i = R.string.plugins_filter_updates;
                    }
                    mg3.b(oz2.M(i, nv0Var10), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var10, 0, 0, 262142);
                } else {
                    nv0Var10.U();
                }
                return dm3.a;
            case 24:
                ((Integer) obj2).getClass();
                ((rb2) this.g).a(jo3.y(1), (nv0) obj);
                return dm3.a;
            case 25:
                ns0 ns0Var = (ns0) this.g;
                nv0 nv0Var11 = (nv0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (nv0Var11.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    kh2.a(0, ns0Var, nv0Var11, null);
                } else {
                    nv0Var11.U();
                }
                return dm3.a;
            case 26:
                w01 w01Var = (w01) this.g;
                nv0 nv0Var12 = (nv0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (nv0Var12.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    s01.a(w01Var, null, j43.k(yp1.a, 18.0f), 0L, nv0Var12, 432, 8);
                } else {
                    nv0Var12.U();
                }
                return dm3.a;
            case 27:
                ek2 ek2Var = (ek2) this.g;
                Set set2 = (Set) obj;
                synchronized (ek2Var.c) {
                    try {
                        if (((bk2) ek2Var.u.getValue()).compareTo(bk2.j) >= 0) {
                            js1 js1Var3 = ek2Var.h;
                            if (set2 instanceof pr2) {
                                js1 js1Var4 = ((pr2) set2).f;
                                Object[] objArr2 = js1Var4.b;
                                long[] jArr2 = js1Var4.a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j2 = jArr2[i7];
                                        if ((((~j2) << c3) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                            int i9 = 0;
                                            while (i9 < i8) {
                                                if ((j2 & 255) < 128) {
                                                    Object obj3 = objArr2[(i7 << 3) + i9];
                                                    c2 = c3;
                                                    if (!(obj3 instanceof o93) || ((o93) obj3).e(1)) {
                                                        js1Var3.a(obj3);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j2 >>= 8;
                                                i9++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i8 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i7 != length2) {
                                            i7++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set2) {
                                    if (!(obj4 instanceof o93) || ((o93) obj4).e(1)) {
                                        js1Var3.a(obj4);
                                    }
                                }
                            }
                            hrVarY = ek2Var.y();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (hrVarY != null) {
                    ((jr) hrVarY).t(dm3.a);
                }
                return dm3.a;
            case 28:
                bm2 bm2Var = (bm2) this.g;
                nv0 nv0Var13 = (nv0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (nv0Var13.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    mg3.b(bm2Var.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var13, 0, 0, 262142);
                } else {
                    nv0Var13.U();
                }
                return dm3.a;
            default:
                kp2 kp2Var = (kp2) this.g;
                int iIntValue12 = ((Integer) obj).intValue();
                m50 m50Var = (m50) obj2;
                n50 key = m50Var.getKey();
                m50 m50VarM = kp2Var.j.m(key);
                if (key != f5.b0) {
                    iIntValue12 = m50Var != m50VarM ? Integer.MIN_VALUE : iIntValue12 + 1;
                } else {
                    j61 j61Var2 = (j61) m50VarM;
                    j61 parent = (j61) m50Var;
                    while (parent != null) {
                        if (parent != j61Var2 && (parent instanceof sr2)) {
                            mt mtVarR = ((sr2) parent).R();
                            parent = mtVarR != null ? mtVarR.getParent() : null;
                        } else {
                            j61Var = parent;
                            if (j61Var == j61Var2) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + j61Var + ", expected child of " + j61Var2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (j61Var2 != null) {
                            }
                        }
                    }
                    if (j61Var == j61Var2) {
                    }
                }
                return Integer.valueOf(iIntValue12);
        }
    }

    public /* synthetic */ u(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
