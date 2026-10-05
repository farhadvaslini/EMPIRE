package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh2 implements ns0 {
    public final /* synthetic */ int f;

    public /* synthetic */ rh2(int i) {
        this.f = i;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        ze zeVar;
        h83 h83Var = null;
        mg1Var = null;
        mg1 mg1Var = null;
        ng1Var = null;
        ng1 ng1Var = null;
        io3Var = null;
        io3 io3Var = null;
        rp3Var = null;
        rp3 rp3Var = null;
        h83Var = null;
        h83 h83Var2 = null;
        x32Var = null;
        x32 x32Var = null;
        ug3Var = null;
        ug3 ug3Var = null;
        ug3Var = null;
        ug3 ug3Var2 = null;
        h83Var = null;
        int i = 0;
        switch (this.f) {
            case 0:
                zx1 zx1Var = (zx1) obj;
                zx1Var.getClass();
                return by1.e(zx1Var.a, "object-");
            case 1:
                ((String) obj).getClass();
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new eq2((Map) obj);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return obj;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                ns0 ns0Var = (ns0) er2.h.h;
                Boolean bool = Boolean.FALSE;
                h83 h83Var3 = (s51.n(obj2, bool) || obj2 == null) ? null : (h83) ns0Var.h(obj2);
                Object obj3 = list.get(1);
                h83 h83Var4 = (s51.n(obj3, bool) || obj3 == null) ? null : (h83) ns0Var.h(obj3);
                Object obj4 = list.get(2);
                h83 h83Var5 = (s51.n(obj4, bool) || obj4 == null) ? null : (h83) ns0Var.h(obj4);
                Object obj5 = list.get(3);
                if (!s51.n(obj5, bool) && obj5 != null) {
                    h83Var = (h83) ns0Var.h(obj5);
                }
                return new ug3(h83Var3, h83Var4, h83Var5, h83Var);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                obj.getClass();
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (s51.n(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((ns0) er2.a.h).h(obj6);
                Object obj7 = list2.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new af(list3, str);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                obj.getClass();
                return new ne3(((Integer) obj).intValue());
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                obj.getClass();
                List list4 = (List) obj;
                return new eg3(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
            case 8:
                obj.getClass();
                List list5 = (List) obj;
                Object obj8 = list5.get(0);
                kh3[] kh3VarArr = jh3.b;
                ns0 ns0Var2 = er2.v.g;
                Boolean bool2 = Boolean.FALSE;
                s51.n(obj8, bool2);
                jh3 jh3Var = obj8 != null ? (jh3) ns0Var2.h(obj8) : null;
                jh3Var.getClass();
                long j = jh3Var.a;
                Object obj9 = list5.get(1);
                s51.n(obj9, bool2);
                jh3 jh3Var2 = obj9 != null ? (jh3) ns0Var2.h(obj9) : null;
                jh3Var2.getClass();
                return new fg3(j, jh3Var2.a);
            case vr.g /* 9 */:
                obj.getClass();
                return new xq0(((Integer) obj).intValue());
            case vr.h /* 10 */:
                obj.getClass();
                return new nl(((Float) obj).floatValue());
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list6.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new yg3(d32.f(iIntValue, num2.intValue()));
            case vr.i /* 12 */:
                obj.getClass();
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                int i2 = wx.h;
                Boolean bool3 = Boolean.FALSE;
                s51.n(obj12, bool3);
                wx wxVar = obj12 != null ? s51.n(obj12, Boolean.FALSE) ? new wx(wx.g) : new wx(vp.b(((Integer) obj12).intValue())) : null;
                wxVar.getClass();
                long j2 = wxVar.a;
                Object obj13 = list7.get(1);
                dr2 dr2Var = er2.x;
                s51.n(obj13, bool3);
                gy1 gy1Var = obj13 != null ? (gy1) dr2Var.g.h(obj13) : null;
                gy1Var.getClass();
                long j3 = gy1Var.a;
                Object obj14 = list7.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new r13(j2, j3, f.floatValue());
            case 13:
                obj.getClass();
                return new ld3(((Integer) obj).intValue());
            case 14:
                obj.getClass();
                List list8 = (List) obj;
                Object obj15 = list8.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list8.get(1);
                ar2 ar2Var = er2.i;
                if (!s51.n(obj16, Boolean.FALSE) && obj16 != null) {
                    ug3Var2 = (ug3) ((ns0) ar2Var.h).h(obj16);
                }
                return new ng1(str2, ug3Var2);
            case jo3.g /* 15 */:
                obj.getClass();
                return new pe3(((Integer) obj).intValue());
            case 16:
                obj.getClass();
                return new l01(((Integer) obj).intValue());
            case 17:
                obj.getClass();
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i < size) {
                    Object obj17 = list9.get(i);
                    ze zeVar2 = (s51.n(obj17, Boolean.FALSE) || obj17 == null) ? null : (ze) ((ns0) er2.b.h).h(obj17);
                    zeVar2.getClass();
                    arrayList.add(zeVar2);
                    i++;
                }
                return arrayList;
            case 18:
                obj.getClass();
                return new vq0(((Integer) obj).intValue());
            case 19:
                obj.getClass();
                return new wq0(((Integer) obj).intValue());
            case 20:
                Boolean bool4 = Boolean.FALSE;
                if (s51.n(obj, bool4)) {
                    return new jh3(jh3.c);
                }
                obj.getClass();
                List list10 = (List) obj;
                Object obj18 = list10.get(0);
                Float f2 = obj18 != null ? (Float) obj18 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj19 = list10.get(1);
                dr2 dr2Var2 = er2.w;
                s51.n(obj19, bool4);
                kh3 kh3Var = obj19 != null ? (kh3) dr2Var2.g.h(obj19) : null;
                kh3Var.getClass();
                return new jh3(oz2.D(fFloatValue, kh3Var.a));
            case 21:
                return s51.n(obj, 0) ? new kh3(8589934592L) : s51.n(obj, 1) ? new kh3(4294967296L) : new kh3(0L);
            case 22:
                if (s51.n(obj, Boolean.FALSE)) {
                    return new gy1(9205357640488583168L);
                }
                obj.getClass();
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f3 = obj20 != null ? (Float) obj20 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj21 = list11.get(1);
                Float f4 = obj21 != null ? (Float) obj21 : null;
                f4.getClass();
                return new gy1((((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue2)) << 32));
            case 23:
                obj.getClass();
                List list12 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list12.size());
                int size2 = list12.size();
                while (i < size2) {
                    Object obj22 = list12.get(i);
                    pj1 pj1Var = (s51.n(obj22, Boolean.FALSE) || obj22 == null) ? null : (pj1) ((ns0) er2.z.h).h(obj22);
                    pj1Var.getClass();
                    arrayList2.add(pj1Var);
                    i++;
                }
                return new qj1(arrayList2);
            case 24:
                obj.getClass();
                String str3 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (s51.n(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new pj1(localeForLanguageTag);
            case 25:
                obj.getClass();
                List list13 = (List) obj;
                Object obj23 = list13.get(0);
                String str4 = obj23 != null ? (String) obj23 : null;
                str4.getClass();
                Object obj24 = list13.get(1);
                ar2 ar2Var2 = er2.i;
                if (!s51.n(obj24, Boolean.FALSE) && obj24 != null) {
                    ug3Var = (ug3) ((ns0) ar2Var2.h).h(obj24);
                }
                return new mg1(str4, ug3Var);
            case 26:
                obj.getClass();
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                float f5 = bg1.b;
                dr2 dr2Var3 = er2.B;
                Boolean bool5 = Boolean.FALSE;
                s51.n(obj25, bool5);
                bg1 bg1Var = obj25 != null ? (bg1) dr2Var3.g.h(obj25) : null;
                bg1Var.getClass();
                float f6 = bg1Var.a;
                Object obj26 = list14.get(1);
                dr2 dr2Var4 = er2.C;
                s51.n(obj26, bool5);
                dg1 dg1Var = obj26 != null ? (dg1) dr2Var4.g.h(obj26) : null;
                dg1Var.getClass();
                int i3 = dg1Var.a;
                Object obj27 = list14.get(2);
                dr2 dr2Var5 = er2.D;
                s51.n(obj27, bool5);
                cg1 cg1Var = obj27 != null ? (cg1) dr2Var5.g.h(obj27) : null;
                cg1Var.getClass();
                return new eg1(i3, f6, cg1Var.a);
            case 27:
                obj.getClass();
                float fFloatValue3 = ((Float) obj).floatValue();
                bg1.a(fFloatValue3);
                return new bg1(fFloatValue3);
            case 28:
                obj.getClass();
                return new dg1(((Integer) obj).intValue());
            default:
                obj.getClass();
                List list15 = (List) obj;
                Object obj28 = list15.get(0);
                df dfVar = obj28 != null ? (df) obj28 : null;
                dfVar.getClass();
                Object obj29 = list15.get(2);
                Integer num3 = obj29 != null ? (Integer) obj29 : null;
                num3.getClass();
                int iIntValue2 = num3.intValue();
                Object obj30 = list15.get(3);
                Integer num4 = obj30 != null ? (Integer) obj30 : null;
                num4.getClass();
                int iIntValue3 = num4.intValue();
                Object obj31 = list15.get(4);
                String str5 = obj31 != null ? (String) obj31 : null;
                str5.getClass();
                switch (dfVar.ordinal()) {
                    case 0:
                        Object obj32 = list15.get(1);
                        ar2 ar2Var3 = er2.g;
                        if (!s51.n(obj32, Boolean.FALSE) && obj32 != null) {
                            x32Var = (x32) ((ns0) ar2Var3.h).h(obj32);
                        }
                        x32Var.getClass();
                        zeVar = new ze(x32Var, iIntValue2, iIntValue3, str5);
                        break;
                    case 1:
                        Object obj33 = list15.get(1);
                        ar2 ar2Var4 = er2.h;
                        if (!s51.n(obj33, Boolean.FALSE) && obj33 != null) {
                            h83Var2 = (h83) ((ns0) ar2Var4.h).h(obj33);
                        }
                        h83Var2.getClass();
                        zeVar = new ze(h83Var2, iIntValue2, iIntValue3, str5);
                        break;
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        Object obj34 = list15.get(1);
                        ar2 ar2Var5 = er2.c;
                        if (!s51.n(obj34, Boolean.FALSE) && obj34 != null) {
                            rp3Var = (rp3) ((ns0) ar2Var5.h).h(obj34);
                        }
                        rp3Var.getClass();
                        zeVar = new ze(rp3Var, iIntValue2, iIntValue3, str5);
                        break;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        Object obj35 = list15.get(1);
                        ar2 ar2Var6 = er2.d;
                        if (!s51.n(obj35, Boolean.FALSE) && obj35 != null) {
                            io3Var = (io3) ((ns0) ar2Var6.h).h(obj35);
                        }
                        io3Var.getClass();
                        zeVar = new ze(io3Var, iIntValue2, iIntValue3, str5);
                        break;
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        Object obj36 = list15.get(1);
                        ar2 ar2Var7 = er2.e;
                        if (!s51.n(obj36, Boolean.FALSE) && obj36 != null) {
                            ng1Var = (ng1) ((ns0) ar2Var7.h).h(obj36);
                        }
                        ng1Var.getClass();
                        zeVar = new ze(ng1Var, iIntValue2, iIntValue3, str5);
                        break;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        Object obj37 = list15.get(1);
                        ar2 ar2Var8 = er2.f;
                        if (!s51.n(obj37, Boolean.FALSE) && obj37 != null) {
                            mg1Var = (mg1) ((ns0) ar2Var8.h).h(obj37);
                        }
                        mg1Var.getClass();
                        zeVar = new ze(mg1Var, iIntValue2, iIntValue3, str5);
                        break;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        Object obj38 = list15.get(1);
                        String str6 = obj38 != null ? (String) obj38 : null;
                        str6.getClass();
                        zeVar = new ze(new x93(str6), iIntValue2, iIntValue3, str5);
                        break;
                    default:
                        c.k();
                        return null;
                }
                return zeVar;
        }
    }
}
