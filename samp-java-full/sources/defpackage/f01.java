package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class f01 {
    static {
        kq kqVar = kq.i;
        zj.e("\"\\");
        zj.e("\t ,=");
    }

    public static final boolean a(ln2 ln2Var) {
        if (s51.n(ln2Var.f.b, "HEAD")) {
            return false;
        }
        int i = ln2Var.i;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && lv3.e(ln2Var) == -1 && !"chunked".equalsIgnoreCase(ln2.b(ln2Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f5 f5Var, i01 i01Var, ux0 ux0Var) {
        List listUnmodifiableList;
        List listUnmodifiableList2;
        s40 s40Var;
        i01 i01Var2;
        s40 s40Var2;
        String strSubstring;
        f5Var.getClass();
        i01Var.getClass();
        ux0Var.getClass();
        if (f5Var == f5.M) {
            return;
        }
        Pattern pattern = s40.k;
        int size = ux0Var.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if ("Set-Cookie".equalsIgnoreCase(ux0Var.b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(ux0Var.e(i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = null;
        }
        List list = ni0.f;
        List list2 = listUnmodifiableList == null ? list : listUnmodifiableList;
        int size2 = list2.size();
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) list2.get(i2);
            str.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = jv3.a;
            char c = ';';
            int iC = jv3.c(str, ';', 0, str.length());
            char c2 = '=';
            int iC2 = jv3.c(str, '=', 0, iC);
            if (iC2 == iC) {
                s40Var = null;
            } else {
                int iF = jv3.f(0, iC2, str);
                String strSubstring2 = str.substring(iF, jv3.g(iF, iC2, str));
                if (strSubstring2.length() != 0 && jv3.e(strSubstring2) == -1) {
                    int iF2 = jv3.f(iC2 + 1, iC, str);
                    String strSubstring3 = str.substring(iF2, jv3.g(iF2, iC, str));
                    if (jv3.e(strSubstring3) == -1) {
                        int i3 = iC + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long jO = 253402300799999L;
                        String str2 = null;
                        String strSubstring4 = null;
                        long j2 = -1;
                        boolean z4 = true;
                        String str3 = null;
                        while (true) {
                            if (i3 < length) {
                                int iC3 = jv3.c(str, c, i3, length);
                                int iC4 = jv3.c(str, c2, i3, iC3);
                                int iF3 = jv3.f(i3, iC4, str);
                                String strSubstring5 = str.substring(iF3, jv3.g(iF3, iC4, str));
                                if (iC4 < iC3) {
                                    int iF4 = jv3.f(iC4 + 1, iC3, str);
                                    strSubstring = str.substring(iF4, jv3.g(iF4, iC3, str));
                                } else {
                                    strSubstring = "";
                                }
                                if (strSubstring5.equalsIgnoreCase("expires")) {
                                    try {
                                        jO = vp.O(strSubstring.length(), strSubstring);
                                        z3 = true;
                                    } catch (NumberFormatException | IllegalArgumentException unused) {
                                    }
                                } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                    try {
                                        long j3 = Long.parseLong(strSubstring);
                                        j2 = j3 <= 0 ? Long.MIN_VALUE : j3;
                                    } catch (NumberFormatException e) {
                                        Pattern patternCompile = Pattern.compile("-?\\d+");
                                        patternCompile.getClass();
                                        if (!patternCompile.matcher(strSubstring).matches()) {
                                            throw e;
                                        }
                                        j2 = fa3.e0(strSubstring, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    }
                                    z3 = true;
                                } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                    if (fa3.Y(strSubstring, ".", false)) {
                                        throw new IllegalArgumentException("Failed requirement.");
                                    }
                                    String strB = hv3.b(y93.v0(strSubstring, "."));
                                    if (strB == null) {
                                        throw new IllegalArgumentException();
                                    }
                                    str2 = strB;
                                    z4 = false;
                                } else if (strSubstring5.equalsIgnoreCase("path")) {
                                    strSubstring4 = strSubstring;
                                } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                    z = true;
                                } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                    z2 = true;
                                } else if (strSubstring5.equalsIgnoreCase("samesite")) {
                                    str3 = strSubstring;
                                }
                                i3 = iC3 + 1;
                                c = ';';
                                c2 = '=';
                            } else {
                                if (j2 == Long.MIN_VALUE) {
                                    i01Var2 = i01Var;
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j4 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    if (j4 < jCurrentTimeMillis || j4 > 253402300799999L) {
                                        i01Var2 = i01Var;
                                    } else {
                                        i01Var2 = i01Var;
                                        j = j4;
                                    }
                                } else {
                                    i01Var2 = i01Var;
                                    j = jO;
                                }
                                String str4 = i01Var2.d;
                                if (str2 == null) {
                                    str2 = str4;
                                } else if (!s51.n(str4, str2) && (!fa3.Y(str4, str2, false) || str4.charAt((str4.length() - str2.length()) - 1) != '.' || hv3.a.c(str4))) {
                                    s40Var2 = null;
                                    s40Var = s40Var2;
                                }
                                if (str4.length() == str2.length() || ie2.d.a(str2) != null) {
                                    if (strSubstring4 == null || !fa3.e0(strSubstring4, "/", false)) {
                                        String strB2 = i01Var2.b();
                                        int iR0 = y93.r0(strB2, '/', 0, 6);
                                        strSubstring4 = iR0 != 0 ? strB2.substring(0, iR0) : "/";
                                    }
                                    s40Var2 = new s40(strSubstring2, strSubstring3, j, str2, strSubstring4, z, z2, z3, z4, str3);
                                }
                                s40Var = s40Var2;
                            }
                        }
                    }
                }
            }
            if (s40Var != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(s40Var);
            }
        }
        if (arrayList2 != null) {
            listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
            listUnmodifiableList2.getClass();
        } else {
            listUnmodifiableList2 = null;
        }
        if (listUnmodifiableList2 != null) {
            list = listUnmodifiableList2;
        }
        list.isEmpty();
    }
}
