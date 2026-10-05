package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class y93 extends fa3 {
    public static List A0(CharSequence charSequence, String[] strArr) {
        charSequence.getClass();
        int i = 1;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() > 0) {
                return y0(charSequence, str, 0);
            }
        }
        x0(0);
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        rv2 rv2Var = new rv2(new sa0(charSequence, 0, new hb1(i, listAsList)));
        ArrayList arrayList = new ArrayList(rx.d0(rv2Var, 10));
        Iterator it = rv2Var.iterator();
        while (true) {
            ra0 ra0Var = (ra0) it;
            if (!ra0Var.hasNext()) {
                return arrayList;
            }
            l41 l41Var = (l41) ra0Var.next();
            l41Var.getClass();
            arrayList.add(charSequence.subSequence(l41Var.f, l41Var.g + 1).toString());
        }
    }

    public static boolean B0(String str, char c) {
        str.getClass();
        return str.length() > 0 && ur.C(str.charAt(0), c, false);
    }

    public static String C0(String str, String str2) {
        int iO0 = o0(str, str2, 0, false, 6);
        return iO0 == -1 ? str : str.substring(str2.length() + iO0, str.length());
    }

    public static String D0(String str, char c, String str2) {
        str.getClass();
        int iR0 = r0(str, c, 0, 6);
        return iR0 == -1 ? str2 : str.substring(iR0 + 1, str.length());
    }

    public static CharSequence E0(CharSequence charSequence, int i) {
        charSequence.getClass();
        if (i < 0) {
            c.g(by1.h("Requested character count ", " is less than zero.", i));
            return null;
        }
        int length = charSequence.length();
        if (i > length) {
            i = length;
        }
        return charSequence.subSequence(0, i);
    }

    public static String F0(int i, String str) {
        str.getClass();
        if (i < 0) {
            c.g(by1.h("Requested character count ", " is less than zero.", i));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence G0(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zI = ur.I(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zI) {
                    break;
                }
                length--;
            } else if (zI) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String H0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!uj.F(cArr, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    public static String I0(String str, char... cArr) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!uj.F(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    public static boolean h0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (charSequence2 instanceof String) {
            if (o0(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (m0(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean i0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return n0(charSequence, c, 0, 2) >= 0;
    }

    public static boolean j0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? fa3.Y((String) charSequence, str, false) : u0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean k0(String str, char c) {
        return str.length() > 0 && ur.C(str.charAt(str.length() - 1), c, false);
    }

    public static final int l0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        return (z || !(charSequence instanceof String)) ? m0(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int m0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        j41 j41Var;
        if (z2) {
            charSequence.getClass();
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            j41Var = new j41(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length2 = charSequence.length();
            if (i2 > length2) {
                i2 = length2;
            }
            j41Var = new l41(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = j41Var.h;
        int i4 = j41Var.g;
        int i5 = j41Var.f;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (!u0(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (!fa3.a0(0, i6, str.length(), str, (String) charSequence, z6)) {
                    if (i6 == i4) {
                        break;
                    }
                    i6 += i3;
                    z = z6;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static int n0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? p0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int o0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return l0(charSequence, str, i, z);
    }

    public static final int p0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(uj.Y(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (ur.C(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean q0(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!ur.I(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int r0(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            str.getClass();
            i = str.length() - 1;
        }
        str.getClass();
        return str.lastIndexOf(c, i);
    }

    public static List s0(String str) {
        str.getClass();
        kg1 kg1Var = new kg1(str);
        if (!kg1Var.hasNext()) {
            return ni0.f;
        }
        Object next = kg1Var.next();
        if (!kg1Var.hasNext()) {
            return vr.K(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (kg1Var.hasNext()) {
            arrayList.add(kg1Var.next());
        }
        return arrayList;
    }

    public static String t0(int i, String str) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i < 0) {
            c.p(by1.h("Desired length ", " is less than zero.", i));
            return null;
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean u0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ur.C(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String v0(String str, String str2) {
        str.getClass();
        return fa3.e0(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static String w0(String str, String str2) {
        return j0(str, str2) ? str.substring(0, str.length() - str2.length()) : str;
    }

    public static final void x0(int i) {
        if (i >= 0) {
            return;
        }
        c.g(by1.e(i, "Limit must be non-negative, but was "));
    }

    public static final List y0(CharSequence charSequence, String str, int i) {
        x0(i);
        int iL0 = l0(charSequence, str, 0, false);
        if (iL0 == -1 || i == 1) {
            return vr.K(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iL0).toString());
            length = str.length() + iL0;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iL0 = l0(charSequence, str, length, false);
        } while (iL0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List z0(CharSequence charSequence, char[] cArr, int i) {
        int i2 = (i & 4) != 0 ? 0 : 2;
        charSequence.getClass();
        if (cArr.length == 1) {
            return y0(charSequence, String.valueOf(cArr[0]), i2);
        }
        x0(i2);
        rv2 rv2Var = new rv2(new sa0(charSequence, i2, new pt2(10, cArr)));
        ArrayList arrayList = new ArrayList(rx.d0(rv2Var, 10));
        Iterator it = rv2Var.iterator();
        while (true) {
            ra0 ra0Var = (ra0) it;
            if (!ra0Var.hasNext()) {
                return arrayList;
            }
            l41 l41Var = (l41) ra0Var.next();
            l41Var.getClass();
            arrayList.add(charSequence.subSequence(l41Var.f, l41Var.g + 1).toString());
        }
    }
}
