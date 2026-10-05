package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cr2 implements ns0 {
    public final /* synthetic */ int f;

    public /* synthetic */ cr2(int i) {
        this.f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object[] objArr = 0;
        final int i2 = 1;
        ci0Var = null;
        ci0 ci0Var = null;
        r13Var = null;
        r13 r13Var = null;
        wg3Var = null;
        wg3 wg3Var = null;
        switch (i) {
            case 0:
                obj.getClass();
                return new cg1(((Integer) obj).intValue());
            case 1:
                String str = obj != null ? (String) obj : null;
                str.getClass();
                return new rp3(str);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                String str2 = obj != null ? (String) obj : null;
                str2.getClass();
                return new io3(str2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                dr2 dr2Var = er2.q;
                Boolean bool = Boolean.FALSE;
                s51.n(obj2, bool);
                ld3 ld3Var = obj2 != null ? (ld3) dr2Var.g.h(obj2) : null;
                ld3Var.getClass();
                int i3 = ld3Var.a;
                Object obj3 = list.get(1);
                dr2 dr2Var2 = er2.r;
                s51.n(obj3, bool);
                pe3 pe3Var = obj3 != null ? (pe3) dr2Var2.g.h(obj3) : null;
                pe3Var.getClass();
                int i4 = pe3Var.a;
                Object obj4 = list.get(2);
                kh3[] kh3VarArr = jh3.b;
                dr2 dr2Var3 = er2.v;
                s51.n(obj4, bool);
                jh3 jh3Var = obj4 != null ? (jh3) dr2Var3.g.h(obj4) : null;
                jh3Var.getClass();
                long j = jh3Var.a;
                Object obj5 = list.get(3);
                fg3 fg3Var = fg3.c;
                fg3 fg3Var2 = (s51.n(obj5, bool) || obj5 == null) ? null : (fg3) ((ns0) er2.l.h).h(obj5);
                Object obj6 = list.get(4);
                w62 w62Var = (s51.n(obj6, bool) || obj6 == null) ? null : (w62) ((ns0) s51.D.h).h(obj6);
                Object obj7 = list.get(5);
                eg1 eg1Var = eg1.d;
                eg1 eg1Var2 = (s51.n(obj7, bool) || obj7 == null) ? null : (eg1) ((ns0) er2.A.h).h(obj7);
                Object obj8 = list.get(6);
                zf1 zf1Var = (s51.n(obj8, bool) || obj8 == null) ? null : (zf1) ((ns0) s51.F.h).h(obj8);
                zf1Var.getClass();
                int i5 = zf1Var.a;
                Object obj9 = list.get(7);
                dr2 dr2Var4 = er2.s;
                s51.n(obj9, bool);
                l01 l01Var = obj9 != null ? (l01) dr2Var4.g.h(obj9) : null;
                l01Var.getClass();
                int i6 = l01Var.a;
                Object obj10 = list.get(8);
                ar2 ar2Var = s51.G;
                if (!s51.n(obj10, bool) && obj10 != null) {
                    wg3Var = (wg3) ((ns0) ar2Var.h).h(obj10);
                }
                return new x32(i3, i4, j, fg3Var2, w62Var, eg1Var2, i5, i6, wg3Var);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                obj.getClass();
                List list2 = (List) obj;
                Object obj11 = list2.get(0);
                int i7 = wx.h;
                Boolean bool2 = Boolean.FALSE;
                s51.n(obj11, bool2);
                wx wxVar = obj11 != null ? obj11.equals(bool2) ? new wx(wx.g) : new wx(vp.b(((Integer) obj11).intValue())) : null;
                wxVar.getClass();
                long j2 = wxVar.a;
                Object obj12 = list2.get(1);
                kh3[] kh3VarArr2 = jh3.b;
                ns0 ns0Var = er2.v.g;
                s51.n(obj12, bool2);
                jh3 jh3Var2 = obj12 != null ? (jh3) ns0Var.h(obj12) : null;
                jh3Var2.getClass();
                long j3 = jh3Var2.a;
                Object obj13 = list2.get(2);
                xq0 xq0Var = xq0.g;
                xq0 xq0Var2 = (s51.n(obj13, bool2) || obj13 == null) ? null : (xq0) ((ns0) er2.m.h).h(obj13);
                Object obj14 = list2.get(3);
                vq0 vq0Var = (s51.n(obj14, bool2) || obj14 == null) ? null : (vq0) ((ns0) er2.t.h).h(obj14);
                Object obj15 = list2.get(4);
                wq0 wq0Var = (s51.n(obj15, bool2) || obj15 == null) ? null : (wq0) ((ns0) er2.u.h).h(obj15);
                Object obj16 = list2.get(6);
                String str3 = obj16 != null ? (String) obj16 : null;
                Object obj17 = list2.get(7);
                s51.n(obj17, bool2);
                jh3 jh3Var3 = obj17 != null ? (jh3) ns0Var.h(obj17) : null;
                jh3Var3.getClass();
                long j4 = jh3Var3.a;
                Object obj18 = list2.get(8);
                nl nlVar = (s51.n(obj18, bool2) || obj18 == null) ? null : (nl) ((ns0) er2.n.h).h(obj18);
                Object obj19 = list2.get(9);
                eg3 eg3Var = (s51.n(obj19, bool2) || obj19 == null) ? null : (eg3) ((ns0) er2.k.h).h(obj19);
                Object obj20 = list2.get(10);
                qj1 qj1Var = qj1.h;
                qj1 qj1Var2 = (s51.n(obj20, bool2) || obj20 == null) ? null : (qj1) ((ns0) er2.y.h).h(obj20);
                Object obj21 = list2.get(11);
                s51.n(obj21, bool2);
                wx wxVar2 = obj21 != null ? obj21.equals(bool2) ? new wx(wx.g) : new wx(vp.b(((Integer) obj21).intValue())) : null;
                wxVar2.getClass();
                long j5 = wxVar2.a;
                Object obj22 = list2.get(12);
                ne3 ne3Var = (s51.n(obj22, bool2) || obj22 == null) ? null : (ne3) ((ns0) er2.j.h).h(obj22);
                Object obj23 = list2.get(13);
                r13 r13Var2 = r13.d;
                ar2 ar2Var2 = er2.o;
                if (!s51.n(obj23, bool2) && obj23 != null) {
                    r13Var = (r13) ((ns0) ar2Var2.h).h(obj23);
                }
                return new h83(j2, j3, xq0Var2, vq0Var, wq0Var, (zb3) null, str3, j4, nlVar, eg3Var, qj1Var2, j5, ne3Var, r13Var, 49184);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                obj.getClass();
                List list3 = (List) obj;
                Object obj24 = list3.get(0);
                Boolean bool3 = obj24 != null ? (Boolean) obj24 : null;
                bool3.getClass();
                boolean zBooleanValue = bool3.booleanValue();
                Object obj25 = list3.get(1);
                ar2 ar2Var3 = s51.E;
                if (!s51.n(obj25, Boolean.FALSE) && obj25 != null) {
                    ci0Var = (ci0) ((ns0) ar2Var3.h).h(obj25);
                }
                ci0Var.getClass();
                return new w62(ci0Var.a, zBooleanValue);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                obj.getClass();
                return new ci0(((Integer) obj).intValue());
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                obj.getClass();
                return new zf1(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                List list4 = (List) obj;
                Object obj26 = list4.get(0);
                vg3 vg3Var = (s51.n(obj26, Boolean.FALSE) || obj26 == null) ? null : (vg3) ((ns0) s51.H.h).h(obj26);
                vg3Var.getClass();
                int i8 = vg3Var.a;
                Object obj27 = list4.get(1);
                Boolean bool4 = obj27 != null ? (Boolean) obj27 : null;
                bool4.getClass();
                return new wg3(i8, bool4.booleanValue());
            case vr.g /* 9 */:
                obj.getClass();
                return new vg3(((Integer) obj).intValue());
            case vr.h /* 10 */:
                return Integer.valueOf(((vr2) obj).b);
            case 11:
                return Integer.valueOf(((vr2) obj).c.b());
            case vr.i /* 12 */:
                return new es2(((Integer) obj).intValue());
            case 13:
                bv2.i((dv2) obj, 3);
                return dm3Var;
            case 14:
                a71[] a71VarArr = bv2.a;
                ((dv2) obj).a(zu2.e, dm3Var);
                return dm3Var;
            case jo3.g /* 15 */:
                gy1 gy1Var = (gy1) obj;
                long j6 = gy1Var.a;
                return (9223372034707292159L & j6) != 9205357640488583168L ? new re(Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (gy1Var.a & 4294967295L))) : mu2.a;
            case 16:
                re reVar = (re) obj;
                return new gy1((((long) Float.floatToRawIntBits(reVar.a)) << 32) | (((long) Float.floatToRawIntBits(reVar.b)) & 4294967295L));
            case 17:
                return Boolean.valueOf(obj == null);
            case 18:
                return String.format(Locale.ROOT, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
            case 19:
                return String.format(Locale.ROOT, "%02X", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
            case 20:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey();
            case 21:
                up2 up2Var = (up2) obj;
                up2Var.getClass();
                return up2Var.a;
            case 22:
                qj2 qj2Var = (qj2) obj;
                qj2Var.getClass();
                String lowerCase = qj2Var.a.c.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return lowerCase;
            case 23:
                yv2 yv2Var = (yv2) obj;
                yv2Var.getClass();
                return yv2Var.a.e;
            case 24:
                ((String) obj).getClass();
                return dm3Var;
            case 25:
                ((td) obj).getClass();
                return w7.c0(dj0.k(new cr2(26)).a(dj0.f(null, 3)), dj0.l(new cr2(27)).a(dj0.g(null, 3)));
            case 26:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 27:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 28:
                final td tdVar = (td) obj;
                tdVar.getClass();
                final Object[] objArr2 = objArr == true ? 1 : 0;
                return w7.c0(dj0.k(new ns0() { // from class: h03
                    @Override // defpackage.ns0
                    public final Object h(Object obj28) {
                        int i9 = objArr2;
                        td tdVar2 = tdVar;
                        int iIntValue = ((Integer) obj28).intValue();
                        switch (i9) {
                            case 0:
                                return Integer.valueOf(tdVar2.c() == null ? (-iIntValue) / 5 : iIntValue / 5);
                            default:
                                return Integer.valueOf(tdVar2.c() == null ? iIntValue / 5 : (-iIntValue) / 5);
                        }
                    }
                }).a(dj0.f(null, 3)), dj0.l(new ns0() { // from class: h03
                    @Override // defpackage.ns0
                    public final Object h(Object obj28) {
                        int i9 = i2;
                        td tdVar2 = tdVar;
                        int iIntValue = ((Integer) obj28).intValue();
                        switch (i9) {
                            case 0:
                                return Integer.valueOf(tdVar2.c() == null ? (-iIntValue) / 5 : iIntValue / 5);
                            default:
                                return Integer.valueOf(tdVar2.c() == null ? iIntValue / 5 : (-iIntValue) / 5);
                        }
                    }
                }).a(dj0.g(null, 3)));
            default:
                cr2 cr2Var = a73.a;
                return dm3Var;
        }
    }
}
