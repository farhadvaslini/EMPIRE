package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class g01 {
    public String a;
    public String d;
    public ArrayList g;
    public String h;
    public String b = "";
    public String c = "";
    public int e = -1;
    public final ArrayList f = vr.N("");

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iN0 = y93.n0(str, '&', i, 4);
            if (iN0 == -1) {
                iN0 = str.length();
            }
            int iN02 = y93.n0(str, '=', i, 4);
            if (iN02 == -1 || iN02 > iN0) {
                arrayList.add(str.substring(i, iN0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iN02));
                arrayList.add(str.substring(iN02 + 1, iN0));
            }
            i = iN0 + 1;
        }
        return arrayList;
    }

    public final i01 a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            c.q("scheme == null");
            return null;
        }
        String strX = cl3.x(this.b, 0, 0, 7);
        String strX2 = cl3.x(this.c, 0, 0, 7);
        String str2 = this.d;
        if (str2 == null) {
            c.q("host == null");
            return null;
        }
        int iB = b();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(rx.d0(arrayList2, 10));
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList3.add(cl3.x((String) obj, 0, 0, 7));
        }
        ArrayList arrayList4 = this.g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(rx.d0(arrayList4, 10));
            int size2 = arrayList4.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList4.get(i2);
                i2++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? cl3.x(str3, 0, 0, 3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.h;
        return new i01(str, strX, strX2, str2, iB, arrayList3, arrayList, str4 != null ? cl3.x(str4, 0, 0, 7) : null, toString());
    }

    public final int b() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        String str = this.a;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(i01 i01Var, String str) {
        int i;
        int i2;
        int iB;
        int i3;
        char cCharAt;
        byte[] bArr = jv3.a;
        int iF = jv3.f(0, str.length(), str);
        int iG = jv3.g(iF, str.length(), str);
        byte b = -1;
        if (iG - iF < 2) {
            i = -1;
        } else {
            char cCharAt2 = str.charAt(iF);
            if ((s51.r(cCharAt2, 97) >= 0 && s51.r(cCharAt2, 122) <= 0) || (s51.r(cCharAt2, 65) >= 0 && s51.r(cCharAt2, 90) <= 0)) {
                i = iF + 1;
                while (true) {
                    if (i >= iG) {
                        break;
                    }
                    char cCharAt3 = str.charAt(i);
                    if (('a' <= cCharAt3 && cCharAt3 < '{') || (('A' <= cCharAt3 && cCharAt3 < '[') || (('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                        i++;
                    } else if (cCharAt3 != ':') {
                        break;
                    }
                }
                i = -1;
            }
        }
        int i4 = 1;
        if (i != -1) {
            if (fa3.d0(str, "https:", iF, true)) {
                this.a = "https";
                iF += 6;
            } else {
                if (!fa3.d0(str, "http:", iF, true)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                }
                this.a = "http";
                iF += 5;
            }
        } else {
            if (i01Var == null) {
                c.p("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? y93.F0(6, str).concat("...") : str));
                return;
            }
            this.a = i01Var.a;
        }
        int i5 = iF;
        int i6 = 0;
        while (true) {
            i2 = i4;
            if (i5 >= iG || !((cCharAt = str.charAt(i5)) == '/' || cCharAt == '\\')) {
                break;
            }
            i6++;
            i5++;
            i4 = i2;
        }
        ArrayList arrayList = this.f;
        byte b2 = 35;
        if (i6 >= 2 || i01Var == null || !s51.n(i01Var.a, this.a)) {
            int i7 = iF + i6;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                iB = jv3.b(i7, iG, str, "@/\\?#");
                byte bCharAt = iB != iG ? str.charAt(iB) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i8 == 0) {
                        int iC = jv3.c(str, ':', i7, iB);
                        String strJ = cl3.j(i7, str, " \"':;<=>@[]^`{}|/\\?#", iC, 112);
                        if (i9 != 0) {
                            strJ = this.b + "%40" + strJ;
                        }
                        this.b = strJ;
                        if (iC != iB) {
                            this.c = cl3.j(iC + 1, str, " \"':;<=>@[]^`{}|/\\?#", iB, 112);
                            i8 = i2;
                        }
                        i9 = i2;
                    } else {
                        this.c += "%40" + cl3.j(i7, str, " \"':;<=>@[]^`{}|/\\?#", iB, 112);
                    }
                    i7 = iB + 1;
                    b2 = 35;
                    b = -1;
                }
            }
            int i10 = i7;
            while (true) {
                if (i10 < iB) {
                    char cCharAt4 = str.charAt(i10);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i10++;
                            if (i10 < iB) {
                            }
                        } while (str.charAt(i10) != ']');
                    }
                    i10++;
                } else {
                    i10 = iB;
                    break;
                }
            }
            int i11 = i10 + 1;
            if (i11 < iB) {
                this.d = hv3.b(cl3.x(str, i7, i10, 4));
                try {
                    i3 = Integer.parseInt(cl3.j(i11, str, "", iB, 120));
                } catch (NumberFormatException unused) {
                }
                if (i2 > i3 || i3 >= 65536) {
                    i3 = -1;
                }
                this.e = i3;
                if (i3 == -1) {
                    throw new IllegalArgumentException(("Invalid URL port: \"" + str.substring(i11, iB) + '\"').toString());
                }
            } else {
                this.d = hv3.b(cl3.x(str, i7, i10, 4));
                String str2 = this.a;
                str2.getClass();
                this.e = str2.equals("http") ? 80 : str2.equals("https") ? 443 : -1;
            }
            if (this.d == null) {
                throw new IllegalArgumentException(("Invalid URL host: \"" + str.substring(i7, i10) + '\"').toString());
            }
            iF = iB;
        } else {
            this.b = i01Var.e();
            this.c = i01Var.a();
            this.d = i01Var.d;
            this.e = i01Var.e;
            arrayList.clear();
            arrayList.addAll(i01Var.c());
            if (iF == iG || str.charAt(iF) == '#') {
                String strD = i01Var.d();
                this.g = strD != null ? d(cl3.j(0, strD, " \"'<>#", 0, 83)) : null;
            }
        }
        int iB2 = jv3.b(iF, iG, str, "?#");
        if (iF != iB2) {
            char cCharAt5 = str.charAt(iF);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iF++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iF < iB2) {
                int iB3 = jv3.b(iF, iB2, str, "/\\");
                boolean z = iB3 < iB2;
                String strJ2 = cl3.j(iF, str, " \"<>^`{}|/\\?#", iB3, 112);
                if (!strJ2.equals(".") && !strJ2.equalsIgnoreCase("%2e")) {
                    if (!strJ2.equals("..") && !strJ2.equalsIgnoreCase("%2e.") && !strJ2.equalsIgnoreCase(".%2e") && !strJ2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) arrayList.get(arrayList.size() - 1)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strJ2);
                        } else {
                            arrayList.add(strJ2);
                        }
                        if (z) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iF = z ? iB3 + 1 : iB3;
            }
        }
        if (iB2 < iG && str.charAt(iB2) == '?') {
            int iC2 = jv3.c(str, '#', iB2, iG);
            this.g = d(cl3.j(iB2 + 1, str, " \"'<>#", iC2, 80));
            iB2 = iC2;
        }
        if (iB2 >= iG || str.charAt(iB2) != '#') {
            return;
        }
        this.h = cl3.j(iB2 + 1, str, "", iG, 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.b.length() > 0 || this.c.length() > 0) {
            sb.append(this.b);
            if (this.c.length() > 0) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        String str2 = this.d;
        if (str2 != null) {
            if (y93.i0(str2, ':')) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        int i = -1;
        if (this.e != -1 || this.a != null) {
            int iB = b();
            String str3 = this.a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iB);
            } else {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
                if (iB != i) {
                }
            }
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.g;
            arrayList2.getClass();
            j41 j41VarN = y02.N(y02.S(0, arrayList2.size()), 2);
            int i3 = j41VarN.f;
            int i4 = j41VarN.g;
            int i5 = j41VarN.h;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    String str4 = (String) arrayList2.get(i3);
                    String str5 = (String) arrayList2.get(i3 + 1);
                    if (i3 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
