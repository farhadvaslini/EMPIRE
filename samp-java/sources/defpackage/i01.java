package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class i01 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public i01(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(y93.n0(str, ':', length, 4) + 1, y93.n0(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iN0 = y93.n0(str, '/', length, 4);
        return str.substring(iN0, jv3.b(iN0, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iN0 = y93.n0(str, '/', length, 4);
        int iB = jv3.b(iN0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iN0 < iB) {
            int i = iN0 + 1;
            int iC = jv3.c(str, '/', i, iB);
            arrayList.add(str.substring(i, iC));
            iN0 = iC;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iN0 = y93.n0(str, '?', 0, 6) + 1;
        return str.substring(iN0, jv3.c(str, '#', iN0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, jv3.b(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i01) && ((i01) obj).i.equals(this.i);
    }

    public final boolean f() {
        return s51.n(this.a, "https");
    }

    public final String g() {
        g01 g01Var;
        try {
            g01Var = new g01();
            g01Var.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            g01Var = null;
        }
        g01Var.getClass();
        g01Var.b = cl3.j(0, "", " \"':;<=>@[]^`{}|/\\?#", 0, 123);
        g01Var.c = cl3.j(0, "", " \"':;<=>@[]^`{}|/\\?#", 0, 123);
        return g01Var.a().i;
    }

    public final i01 h(String str) {
        g01 g01Var;
        try {
            g01Var = new g01();
            g01Var.c(this, str);
        } catch (IllegalArgumentException unused) {
            g01Var = null;
        }
        if (g01Var != null) {
            return g01Var.a();
        }
        return null;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI i() {
        String strSubstring;
        String strReplaceAll;
        g01 g01Var = new g01();
        String str = this.a;
        g01Var.a = str;
        g01Var.b = e();
        g01Var.c = a();
        g01Var.d = this.d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.e;
        g01Var.e = i2 != i ? i2 : -1;
        ArrayList arrayList = g01Var.f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        g01Var.g = strD != null ? g01.d(cl3.j(0, strD, " \"'<>#", 0, 83)) : null;
        if (this.h == null) {
            strSubstring = null;
        } else {
            String str2 = this.i;
            strSubstring = str2.substring(y93.n0(str2, '#', 0, 6) + 1);
        }
        g01Var.h = strSubstring;
        String str3 = g01Var.d;
        if (str3 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str3).replaceAll("");
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        g01Var.d = strReplaceAll;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.set(i3, cl3.j(0, (String) arrayList.get(i3), "[]", 0, 99));
        }
        ArrayList arrayList2 = g01Var.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str4 = (String) arrayList2.get(i4);
                arrayList2.set(i4, str4 != null ? cl3.j(0, str4, "\\^`{|}", 0, 67) : null);
            }
        }
        String str5 = g01Var.h;
        g01Var.h = str5 != null ? cl3.j(0, str5, " \"#<>\\^`{|}", 0, 35) : null;
        String string = g01Var.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                strReplaceAll2.getClass();
                URI uriCreate = URI.create(strReplaceAll2);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}
