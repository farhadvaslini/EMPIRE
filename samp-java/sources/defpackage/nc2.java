package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract /* synthetic */ class nc2 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int a(int i, float f, int i2) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int b(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int c(long j, int i, int i2) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static kz d(String str) {
        m21.d(str);
        return new kz();
    }

    public static qr1 e(nv0 nv0Var) {
        qr1 qr1Var = new qr1();
        nv0Var.j0(qr1Var);
        return qr1Var;
    }

    public static he2 f(long j, t20 t20Var) {
        return t20Var.a(new wx(j));
    }

    public static String g(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String h(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder k(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder l(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder n(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void o(int i, int i2, int i3, int i4, int i5) {
        gq.h(i);
        gq.h(i2);
        gq.h(i3);
        gq.h(i4);
        gq.h(i5);
    }

    public static void p(int i, d00 d00Var, nv0 nv0Var, boolean z) {
        d00Var.f(nv0Var, Integer.valueOf(i));
        nv0Var.p(z);
    }

    public static void q(int i, nv0 nv0Var, int i2, z00 z00Var) {
        nv0Var.j0(Integer.valueOf(i));
        nv0Var.b(z00Var, Integer.valueOf(i2));
    }

    public static void r(int i, nv0 nv0Var, z00 z00Var, nv0 nv0Var2) {
        y02.F(z00Var, nv0Var, Integer.valueOf(i));
        y02.C(nv0Var2);
    }

    public static void s(long j, StringBuilder sb, String str) {
        sb.append((Object) wx.i(j));
        sb.append(str);
    }

    public static void t(pi piVar, long j) {
        piVar.k().i();
        piVar.Q(j);
    }

    public static /* synthetic */ void u(Object obj) {
        if (obj == null) {
            return;
        }
        qn1.b();
    }

    public static void v(StringBuilder sb, float f, String str, float f2, String str2) {
        sb.append(f);
        sb.append(str);
        sb.append(f2);
        sb.append(str2);
    }

    public static void w(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static kz x(String str) {
        yi1.b(str);
        return new kz();
    }

    public static kz y(String str) {
        p21.b(str);
        return new kz();
    }

    public static /* synthetic */ int z(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }
}
