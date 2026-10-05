package defpackage;

import android.content.res.Resources;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class db3 implements ns0 {
    public final /* synthetic */ int f;

    public /* synthetic */ db3(int i) {
        this.f = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02cf  */
    @Override // defpackage.ns0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj) {
        int iOffsetByCodePoints;
        ug3 ug3VarA;
        h83 h83Var;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                a71[] a71VarArr = bv2.a;
                cv2 cv2Var = zu2.m;
                a71 a71Var = bv2.a[5];
                Boolean bool = Boolean.TRUE;
                cv2Var.getClass();
                ((dv2) obj).a(cv2Var, bool);
                return dm3Var;
            case 1:
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((Float) obj).getClass();
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj).intValue();
                return ue3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                gf3 gf3Var = (gf3) obj;
                String str = gf3Var.g.g;
                long j = gf3Var.f;
                int i2 = yg3.c;
                int i3 = (int) (j & 4294967295L);
                if (i3 > 0) {
                    nh0 nh0VarP = n32.p();
                    if (nh0VarP == null) {
                        iOffsetByCodePoints = i3 <= 0 ? -1 : Character.offsetByCodePoints(str, i3, -1);
                    } else {
                        int iB = nh0VarP.b(str, i3 - 1);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i3 > 0) {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i3, -1);
                        }
                    }
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new pa0(((int) (gf3Var.f & 4294967295L)) - iOffsetByCodePoints, 0);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                gf3 gf3Var2 = (gf3) obj;
                String str2 = gf3Var2.g.g;
                long j2 = gf3Var2.f;
                int i4 = yg3.c;
                int iL = n32.l((int) (j2 & 4294967295L), str2);
                if (iL != -1) {
                    return new pa0(0, iL - ((int) (gf3Var2.f & 4294967295L)));
                }
                return null;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                gf3 gf3Var3 = (gf3) obj;
                Integer numE = gf3Var3.e();
                if (numE == null) {
                    return null;
                }
                int iIntValue = numE.intValue();
                long j3 = gf3Var3.f;
                int i5 = yg3.c;
                return new pa0(((int) (j3 & 4294967295L)) - iIntValue, 0);
            case 8:
                gf3 gf3Var4 = (gf3) obj;
                Integer numD = gf3Var4.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue2 = numD.intValue();
                long j4 = gf3Var4.f;
                int i6 = yg3.c;
                return new pa0(0, iIntValue2 - ((int) (j4 & 4294967295L)));
            case vr.g /* 9 */:
                gf3 gf3Var5 = (gf3) obj;
                Integer numC = gf3Var5.c();
                if (numC == null) {
                    return null;
                }
                int iIntValue3 = numC.intValue();
                long j5 = gf3Var5.f;
                int i7 = yg3.c;
                return new pa0(((int) (j5 & 4294967295L)) - iIntValue3, 0);
            case vr.h /* 10 */:
                gf3 gf3Var6 = (gf3) obj;
                Integer numB = gf3Var6.b();
                if (numB == null) {
                    return null;
                }
                int iIntValue4 = numB.intValue();
                long j6 = gf3Var6.f;
                int i8 = yg3.c;
                return new pa0(0, iIntValue4 - ((int) (j6 & 4294967295L)));
            case 11:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                t02 t02Var = ((Boolean) obj2).booleanValue() ? t02.f : t02.g;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new lf3(t02Var, ((Float) obj3).floatValue());
            case vr.i /* 12 */:
                t20 t20Var = mg3.a;
                return dm3Var;
            case 13:
                ze zeVar = (ze) obj;
                Object obj4 = zeVar.a;
                if (!(obj4 instanceof og1) || (ug3VarA = ((og1) obj4).a()) == null || (ug3VarA.a == null && ug3VarA.b == null && ug3VarA.c == null && ug3VarA.d == null)) {
                    return vr.m(zeVar);
                }
                Object obj5 = zeVar.a;
                obj5.getClass();
                ug3 ug3VarA2 = ((og1) obj5).a();
                if (ug3VarA2 == null || (h83Var = ug3VarA2.a) == null) {
                    h83Var = new h83(0L, 0L, (xq0) null, (vq0) null, (wq0) null, (zb3) null, (String) null, 0L, (nl) null, (eg3) null, (qj1) null, 0L, (ne3) null, (r13) null, 65535);
                }
                return vr.m(zeVar, new ze(zeVar.b, zeVar.c, h83Var));
            case 14:
                ((dv2) obj).a(zu2.B, dm3Var);
                return dm3Var;
            case jo3.g /* 15 */:
                it2 it2Var = (it2) obj;
                long j7 = it2Var.f;
                p73 p73Var = it2Var.h;
                if (p73Var != null) {
                    p73Var.d(it2Var, w7.i0, it2Var.g);
                }
                long j8 = it2Var.f;
                if (j7 != j8) {
                    bt2 bt2Var = it2Var.o;
                    if (bt2Var != null) {
                        if (bt2Var.a > j8) {
                            it2Var.u();
                        } else {
                            bt2Var.g = j8;
                            if (bt2Var.b == null) {
                                bt2Var.h = vm1.N((1.0d - ((double) bt2Var.e.a(0))) * it2Var.f);
                            }
                        }
                    } else if (j8 != 0) {
                        it2Var.x();
                    }
                }
                return dm3Var;
            case 16:
                return new qe(((Float) obj).floatValue());
            case 17:
                return new qe(((Integer) obj).intValue());
            case 18:
                return Integer.valueOf((int) ((qe) obj).a);
            case 19:
                return new qe(((jd0) obj).f);
            case 20:
                return new jd0(((qe) obj).a);
            case 21:
                ld0 ld0Var = (ld0) obj;
                return new re(Float.intBitsToFloat((int) (ld0Var.a >> 32)), Float.intBitsToFloat((int) (ld0Var.a & 4294967295L)));
            case 22:
                re reVar = (re) obj;
                return new ld0((((long) Float.floatToRawIntBits(reVar.a)) << 32) | (((long) Float.floatToRawIntBits(reVar.b)) & 4294967295L));
            case 23:
                h43 h43Var = (h43) obj;
                return new re(Float.intBitsToFloat((int) (h43Var.a >> 32)), Float.intBitsToFloat((int) (h43Var.a & 4294967295L)));
            case 24:
                re reVar2 = (re) obj;
                return new h43((((long) Float.floatToRawIntBits(reVar2.a)) << 32) | (((long) Float.floatToRawIntBits(reVar2.b)) & 4294967295L));
            case 25:
                gy1 gy1Var = (gy1) obj;
                return new re(Float.intBitsToFloat((int) (gy1Var.a >> 32)), Float.intBitsToFloat((int) (gy1Var.a & 4294967295L)));
            case 26:
                re reVar3 = (re) obj;
                return new gy1((((long) Float.floatToRawIntBits(reVar3.a)) << 32) | (((long) Float.floatToRawIntBits(reVar3.b)) & 4294967295L));
            case 27:
                long j9 = ((i41) obj).a;
                return new re((int) (j9 >> 32), (int) (j9 & 4294967295L));
            case 28:
                re reVar4 = (re) obj;
                return new i41((((long) Math.round(reVar4.a)) << 32) | (((long) Math.round(reVar4.b)) & 4294967295L));
            default:
                long j10 = ((p41) obj).a;
                return new re((int) (j10 >> 32), (int) (j10 & 4294967295L));
        }
    }
}
