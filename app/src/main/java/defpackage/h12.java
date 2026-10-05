package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h12 implements rs0 {
    public final /* synthetic */ int f;

    public /* synthetic */ h12(int i) {
        this.f = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0393  */
    @Override // defpackage.rs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2) {
        df dfVar;
        Object objA;
        switch (this.f) {
            case 0:
                return Integer.valueOf(((xm1) obj).u0(((Integer) obj2).intValue()));
            case 1:
                return Integer.valueOf(((xm1) obj).y(((Integer) obj2).intValue()));
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return Integer.valueOf(((xm1) obj).m0(((Integer) obj2).intValue()));
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return (Float) ((af2) obj2).a.d();
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj).intValue();
                re3 re3Var = (re3) obj2;
                re3Var.getClass();
                return Integer.valueOf(re3Var.a);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                eq2 eq2Var = (eq2) obj2;
                Map map = eq2Var.f;
                is1 is1Var = eq2Var.g;
                Object[] objArr = is1Var.b;
                Object[] objArr2 = is1Var.c;
                long[] jArr = is1Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map mapC = ((gq2) objArr2[i4]).c();
                                    if (mapC.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapC);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return obj2;
            case 8:
                af afVar = (af) obj2;
                return vr.m(afVar.g, er2.a(afVar.f, er2.a, (cq2) obj));
            case vr.g /* 9 */:
                return Integer.valueOf(((ne3) obj2).a);
            case vr.h /* 10 */:
                eg3 eg3Var = (eg3) obj2;
                return vr.m(Float.valueOf(eg3Var.a), Float.valueOf(eg3Var.b));
            case 11:
                cq2 cq2Var = (cq2) obj;
                fg3 fg3Var = (fg3) obj2;
                jh3 jh3Var = new jh3(fg3Var.a);
                dr2 dr2Var = er2.v;
                return vr.m(er2.a(jh3Var, dr2Var, cq2Var), er2.a(new jh3(fg3Var.b), dr2Var, cq2Var));
            case vr.i /* 12 */:
                return Integer.valueOf(((xq0) obj2).f);
            case 13:
                ng1 ng1Var = (ng1) obj2;
                return vr.m(ng1Var.a, er2.a(ng1Var.b, er2.i, (cq2) obj));
            case 14:
                return Float.valueOf(((nl) obj2).a);
            case jo3.g /* 15 */:
                cq2 cq2Var2 = (cq2) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(er2.a((ze) list.get(i5), er2.b, cq2Var2));
                }
                return arrayList;
            case 16:
                yg3 yg3Var = (yg3) obj2;
                return vr.m(Integer.valueOf((int) (yg3Var.a >> 32)), Integer.valueOf((int) (yg3Var.a & 4294967295L)));
            case 17:
                cq2 cq2Var3 = (cq2) obj;
                r13 r13Var = (r13) obj2;
                return vr.m(er2.a(new wx(r13Var.a), er2.p, cq2Var3), er2.a(new gy1(r13Var.b), er2.x, cq2Var3), Float.valueOf(r13Var.c));
            case 18:
                return Integer.valueOf(((ld3) obj2).a);
            case 19:
                return Integer.valueOf(((pe3) obj2).a);
            case 20:
                return Integer.valueOf(((l01) obj2).a);
            case 21:
                return Integer.valueOf(((vq0) obj2).a);
            case 22:
                return Integer.valueOf(((wq0) obj2).a);
            case 23:
                jh3 jh3Var2 = (jh3) obj2;
                return jh3Var2 != null ? jh3.a(jh3Var2.a, jh3.c) : false ? Boolean.FALSE : vr.m(Float.valueOf(jh3.c(jh3Var2.a)), er2.a(new kh3(jh3.b(jh3Var2.a)), er2.w, (cq2) obj));
            case 24:
                mg1 mg1Var = (mg1) obj2;
                return vr.m(mg1Var.a, er2.a(mg1Var.b, er2.i, (cq2) obj));
            case 25:
                long j2 = ((kh3) obj2).a;
                if (kh3.a(j2, 8589934592L)) {
                    return 0;
                }
                if (kh3.a(j2, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 26:
                gy1 gy1Var = (gy1) obj2;
                return gy1Var != null ? gy1.b(gy1Var.a, 9205357640488583168L) : false ? Boolean.FALSE : vr.m(Float.valueOf(Float.intBitsToFloat((int) (gy1Var.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (gy1Var.a & 4294967295L))));
            case 27:
                cq2 cq2Var4 = (cq2) obj;
                ze zeVar = (ze) obj2;
                Object obj4 = zeVar.a;
                if (obj4 instanceof x32) {
                    dfVar = df.f;
                } else if (obj4 instanceof h83) {
                    dfVar = df.g;
                } else if (obj4 instanceof rp3) {
                    dfVar = df.h;
                } else if (obj4 instanceof io3) {
                    dfVar = df.i;
                } else if (obj4 instanceof ng1) {
                    dfVar = df.j;
                } else if (obj4 instanceof mg1) {
                    dfVar = df.k;
                } else {
                    if (!(obj4 instanceof x93)) {
                        throw new UnsupportedOperationException();
                    }
                    dfVar = df.l;
                }
                switch (dfVar.ordinal()) {
                    case 0:
                        obj4.getClass();
                        objA = er2.a((x32) obj4, er2.g, cq2Var4);
                        break;
                    case 1:
                        obj4.getClass();
                        objA = er2.a((h83) obj4, er2.h, cq2Var4);
                        break;
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        obj4.getClass();
                        objA = er2.a((rp3) obj4, er2.c, cq2Var4);
                        break;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        obj4.getClass();
                        objA = er2.a((io3) obj4, er2.d, cq2Var4);
                        break;
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        obj4.getClass();
                        objA = er2.a((ng1) obj4, er2.e, cq2Var4);
                        break;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        obj4.getClass();
                        objA = er2.a((mg1) obj4, er2.f, cq2Var4);
                        break;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        obj4.getClass();
                        objA = ((x93) obj4).a;
                        break;
                    default:
                        c.k();
                        return null;
                }
                return vr.m(dfVar, objA, Integer.valueOf(zeVar.b), Integer.valueOf(zeVar.c), zeVar.d);
            case 28:
                cq2 cq2Var5 = (cq2) obj;
                List list2 = ((qj1) obj2).f;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    arrayList2.add(er2.a((pj1) list2.get(i6), er2.z, cq2Var5));
                }
                return arrayList2;
            default:
                return ((pj1) obj2).a.toLanguageTag();
        }
    }
}
