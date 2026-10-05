package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class im implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    public /* synthetic */ im(int i, String str) {
        this.f = i;
        this.g = str;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        boolean zN;
        List listK;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        String str = this.g;
        switch (i) {
            case 0:
                dv2 dv2Var = (dv2) obj;
                a71[] a71VarArr = bv2.a;
                cv2 cv2Var = zu2.k;
                a71 a71Var = bv2.a[3];
                dj1 dj1Var = new dj1(1);
                cv2Var.getClass();
                dv2Var.a(cv2Var, dj1Var);
                bv2.g(dv2Var, str);
                return dm3Var;
            case 1:
                bv2.d((dv2) obj, str);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                mw mwVar = (mw) obj;
                mwVar.getClass();
                zN = s51.n(mwVar.a, str);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                bv2.g((dv2) obj, str);
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                dv2 dv2Var2 = (dv2) obj;
                bv2.d(dv2Var2, str);
                bv2.i(dv2Var2, 5);
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                String str2 = (String) obj;
                str2.getClass();
                zN = str2.equals(str);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                dv2 dv2Var3 = (dv2) obj;
                bv2.g(dv2Var3, str);
                cv2 cv2Var2 = zu2.u;
                a71 a71Var2 = bv2.a[11];
                Float fValueOf = Float.valueOf(0.0f);
                cv2Var2.getClass();
                dv2Var3.a(cv2Var2, fValueOf);
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                bv2.d((dv2) obj, str);
                return dm3Var;
            case 8:
                zN = s51.n(((kq2) obj).e, str);
                break;
            case vr.g /* 9 */:
                zN = s51.n((String) obj, str);
                break;
            case vr.h /* 10 */:
                a71[] a71VarArr2 = bv2.a;
                ((dv2) obj).a(zu2.O, str);
                return dm3Var;
            default:
                String str3 = (String) obj;
                str3.getClass();
                String string = y93.G0(str3).toString();
                Pattern patternCompile = Pattern.compile("\\s+");
                patternCompile.getClass();
                string.getClass();
                y93.x0(0);
                Matcher matcher = patternCompile.matcher(string);
                if (matcher.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iEnd = 0;
                    do {
                        arrayList.add(string.subSequence(iEnd, matcher.start()).toString());
                        iEnd = matcher.end();
                    } while (matcher.find());
                    arrayList.add(string.subSequence(iEnd, string.length()).toString());
                    listK = arrayList;
                } else {
                    listK = vr.K(string.toString());
                }
                if (listK.size() < 2 || !s51.n(listK.get(1), str)) {
                    return null;
                }
                return (String) listK.get(0);
        }
        return Boolean.valueOf(zN);
    }
}
