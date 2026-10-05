package defpackage;

import java.io.File;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class up0 implements Comparator {
    public static final up0 b = new up0(0);
    public static final up0 c = new up0(2);
    public static final up0 d = new up0(3);
    public static final up0 e = new up0(4);
    public static final up0 f = new up0(5);
    public final /* synthetic */ int a;

    public /* synthetic */ up0(int i) {
        this.a = i;
    }

    public static float a(o23 o23Var) {
        if (o23Var.g.g() == 0.0f && (o23Var instanceof o23) && o23Var.q == null) {
            return -1.0f;
        }
        return o23Var.g.g();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                rp0 rp0Var = (rp0) obj;
                rp0 rp0Var2 = (rp0) obj2;
                if (br.H(rp0Var) && br.H(rp0Var2)) {
                    tb1 tb1VarX = vr.X(rp0Var);
                    tb1 tb1VarX2 = vr.X(rp0Var2);
                    if (!s51.n(tb1VarX, tb1VarX2)) {
                        Object[] objArr = new tb1[16];
                        int i = 0;
                        while (tb1VarX != null) {
                            int i2 = i + 1;
                            if (objArr.length < i2) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                            }
                            objArr[0] = tb1VarX;
                            i++;
                            tb1VarX = tb1VarX.u();
                        }
                        Object[] objArr3 = new tb1[16];
                        int i3 = 0;
                        while (tb1VarX2 != null) {
                            int i4 = i3 + 1;
                            if (objArr3.length < i4) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                            }
                            objArr3[0] = tb1VarX2;
                            i3++;
                            tb1VarX2 = tb1VarX2.u();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (s51.n(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return s51.r(((tb1) objArr[i5]).v(), ((tb1) objArr3[i5]).v());
                        }
                        c.q("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (br.H(rp0Var)) {
                        return -1;
                    }
                    if (br.H(rp0Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                return Float.compare(a((o23) obj), a((o23) obj2));
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                jk2 jk2VarH = ((vu2) obj).h();
                jk2 jk2VarH2 = ((vu2) obj2).h();
                int iCompare = Float.compare(jk2VarH.a, jk2VarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(jk2VarH.b, jk2VarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(jk2VarH.d, jk2VarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(jk2VarH.c, jk2VarH2.c);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                tb1 tb1Var = (tb1) obj;
                tb1 tb1Var2 = (tb1) obj2;
                int iR = s51.r(tb1Var2.v, tb1Var.v);
                return iR != 0 ? iR : s51.r(tb1Var.hashCode(), tb1Var2.hashCode());
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                jk2 jk2VarH3 = ((vu2) obj).h();
                jk2 jk2VarH4 = ((vu2) obj2).h();
                int iCompare4 = Float.compare(jk2VarH4.c, jk2VarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(jk2VarH3.b, jk2VarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(jk2VarH3.d, jk2VarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(jk2VarH4.a, jk2VarH3.a);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                r32 r32Var = (r32) obj;
                r32 r32Var2 = (r32) obj2;
                int iCompare7 = Float.compare(((jk2) r32Var.f).b, ((jk2) r32Var2.f).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((jk2) r32Var.f).d, ((jk2) r32Var2.f).d);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return Integer.valueOf(((ze) obj).b).compareTo(Integer.valueOf(((ze) obj2).b));
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.valueOf(((ze) obj).b).compareTo(Integer.valueOf(((ze) obj2).b));
            case 8:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int iMin2 = Math.min(str.length(), str2.length());
                int i6 = 4;
                while (true) {
                    if (i6 >= iMin2) {
                        int length3 = str.length();
                        int length4 = str2.length();
                        if (length3 == length4) {
                            return 0;
                        }
                        if (length3 >= length4) {
                            return 1;
                        }
                    } else {
                        char cCharAt = str.charAt(i6);
                        char cCharAt2 = str2.charAt(i6);
                        if (cCharAt == cCharAt2) {
                            i6++;
                        } else if (s51.r(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case vr.g /* 9 */:
                return String.CASE_INSENSITIVE_ORDER.compare(((x31) obj).a, ((x31) obj2).a);
            case vr.h /* 10 */:
                tb1 tb1Var3 = (tb1) obj;
                tb1 tb1Var4 = (tb1) obj2;
                int iR2 = s51.r(tb1Var3.v, tb1Var4.v);
                return iR2 != 0 ? iR2 : s51.r(tb1Var3.hashCode(), tb1Var4.hashCode());
            case 11:
                return Long.valueOf(((File) obj2).lastModified()).compareTo(Long.valueOf(((File) obj).lastModified()));
            case vr.i /* 12 */:
                return ur.t((la2) ((r32) obj2).g, (la2) ((r32) obj).g);
            case 13:
                return ur.t(((File) obj).getName(), ((File) obj2).getName());
            case 14:
                String str3 = ((y31) obj).a.c;
                Locale locale = Locale.ROOT;
                String lowerCase = str3.toLowerCase(locale);
                lowerCase.getClass();
                String lowerCase2 = ((y31) obj2).a.c.toLowerCase(locale);
                lowerCase2.getClass();
                return lowerCase.compareTo(lowerCase2);
            case jo3.g /* 15 */:
                String str4 = ((y31) obj).a.d;
                str4.getClass();
                ou2 ou2VarU = n32.u(str4, false);
                if (ou2VarU != null) {
                    String str5 = ((y31) obj2).a.d;
                    str5.getClass();
                    ou2 ou2VarU2 = n32.u(str5, false);
                    if (ou2VarU2 != null) {
                        return ou2VarU.compareTo(ou2VarU2);
                    }
                }
                c.q("Invalid semantic version");
                return 0;
            case 16:
                return Float.valueOf(((n72) obj).h).compareTo(Float.valueOf(((n72) obj2).h));
            case 17:
                return Float.valueOf(((gp3) obj).c).compareTo(Float.valueOf(((gp3) obj2).c));
            case 18:
                return Float.valueOf(((zx1) obj).c).compareTo(Float.valueOf(((zx1) obj2).c));
            case 19:
                return ur.t((Comparable) ((r32) obj).g, (Comparable) ((r32) obj2).g);
            default:
                return Long.valueOf(((kq2) obj).b).compareTo(Long.valueOf(((kq2) obj2).b));
        }
    }
}
