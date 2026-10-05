package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zb implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ os1 g;

    public /* synthetic */ zb(os1 os1Var, int i) {
        this.f = i;
        this.g = os1Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        int i2 = 0;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.g;
        switch (i) {
            case 0:
                os1Var.setValue((ab1) obj);
                break;
            case 1:
                os1Var.setValue((ab1) obj);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                qd3 qd3Var = (qd3) obj;
                os1Var.setValue(qd3Var.c ? qd3Var.b : qd3Var.a);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                List list = (List) obj;
                if (os1Var != null) {
                    os1Var.setValue(list);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                x31 x31Var = (x31) obj;
                x31Var.getClass();
                os1Var.setValue(x31Var);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                String str = (String) obj;
                str.getClass();
                os1Var.setValue(str);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Boolean) obj).getClass();
                os1Var.setValue(Boolean.valueOf(!((Boolean) os1Var.getValue()).booleanValue()));
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                String str2 = (String) obj;
                str2.getClass();
                os1Var.setValue(str2);
                break;
            case 8:
                String str3 = (String) obj;
                str3.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str3.length();
                while (i2 < length) {
                    char cCharAt = str3.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                    i2++;
                }
                os1Var.setValue(sb.toString());
                break;
            case vr.g /* 9 */:
                String str4 = (String) obj;
                str4.getClass();
                os1Var.setValue(str4);
                break;
            case vr.h /* 10 */:
                String str5 = (String) obj;
                str5.getClass();
                os1Var.setValue(str5);
                break;
            case 11:
                ae1 ae1Var = (ae1) obj;
                ae1Var.getClass();
                List list2 = (List) os1Var.getValue();
                ae1Var.X(list2.size(), null, new jw(3, list2), new d00(802480018, new kk1(i2, list2), true));
                break;
            case vr.i /* 12 */:
                ((Boolean) obj).getClass();
                os1Var.setValue(Boolean.valueOf(!((Boolean) os1Var.getValue()).booleanValue()));
                break;
            case 13:
                os1Var.setValue((ab1) obj);
                break;
            case 14:
                z31 z31Var = (z31) obj;
                z31Var.getClass();
                os1Var.setValue(z31Var);
                break;
            case jo3.g /* 15 */:
                y31 y31Var = (y31) obj;
                y31Var.getClass();
                os1Var.setValue(y31Var);
                break;
            case 16:
                String str6 = (String) obj;
                str6.getClass();
                os1Var.setValue(str6);
                break;
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                os1Var.setValue(bool);
                break;
            case 18:
                String str7 = (String) obj;
                str7.getClass();
                os1Var.setValue(str7);
                break;
            case 19:
                String str8 = (String) obj;
                str8.getClass();
                os1Var.setValue(str8);
                break;
            case 20:
                String str9 = (String) obj;
                str9.getClass();
                os1Var.setValue(str9);
                break;
            case 21:
                ((Boolean) obj).getClass();
                os1Var.setValue(Boolean.valueOf(!((Boolean) os1Var.getValue()).booleanValue()));
                break;
            case 22:
                Float f = (Float) obj;
                f.getClass();
                break;
            case 23:
                os1Var.setValue((jz2) jz2.i.get(((Integer) obj).intValue()));
                break;
            case 24:
                String str10 = (String) obj;
                str10.getClass();
                os1Var.setValue(str10);
                break;
            case 25:
                String str11 = (String) obj;
                str11.getClass();
                os1Var.setValue(str11);
                break;
            case 26:
                String str12 = (String) obj;
                str12.getClass();
                os1Var.setValue(n32.F(str12));
                break;
            case 27:
                String str13 = (String) obj;
                str13.getClass();
                os1Var.setValue(str13);
                break;
            case 28:
                ((ns0) os1Var.getValue()).h((gy1) obj);
                break;
            default:
                os1Var.setValue((ab1) obj);
                break;
        }
        return dm3Var;
    }
}
