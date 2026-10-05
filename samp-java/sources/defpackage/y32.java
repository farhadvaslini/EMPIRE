package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class y32 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        kh3[] kh3VarArr = jh3.b;
        a = jh3.c;
    }

    public static final x32 a(x32 x32Var, int i, int i2, long j, fg3 fg3Var, w62 w62Var, eg1 eg1Var, int i3, int i4, wg3 wg3Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        fg3 fg3Var2 = fg3Var;
        w62 w62Var2 = w62Var;
        eg1 eg1Var2 = eg1Var;
        int i7 = i3;
        int i8 = i4;
        wg3 wg3Var2 = wg3Var;
        if (i5 == 0 || i5 == x32Var.a) {
            kh3[] kh3VarArr = jh3.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (jh3.a(j3, x32Var.c)) {
                }
            }
            if ((fg3Var2 == null || fg3Var2.equals(x32Var.d)) && ((i6 == 0 || i6 == x32Var.b) && ((w62Var2 == null || w62Var2.equals(x32Var.e)) && ((eg1Var2 == null || eg1Var2.equals(x32Var.f)) && ((i7 == 0 || i7 == x32Var.g) && ((i8 == 0 || i8 == x32Var.h) && (wg3Var2 == null || wg3Var2.equals(x32Var.i)))))))) {
                return x32Var;
            }
        } else {
            j2 = 0;
        }
        kh3[] kh3VarArr2 = jh3.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = x32Var.c;
        }
        if (fg3Var2 == null) {
            fg3Var2 = x32Var.d;
        }
        if (i5 == 0) {
            i5 = x32Var.a;
        }
        if (i6 == 0) {
            i6 = x32Var.b;
        }
        w62 w62Var3 = x32Var.e;
        if (w62Var3 != null && w62Var2 == null) {
            w62Var2 = w62Var3;
        }
        if (eg1Var2 == null) {
            eg1Var2 = x32Var.f;
        }
        if (i7 == 0) {
            i7 = x32Var.g;
        }
        if (i8 == 0) {
            i8 = x32Var.h;
        }
        if (wg3Var2 == null) {
            wg3Var2 = x32Var.i;
        }
        return new x32(i5, i6, j3, fg3Var2, w62Var2, eg1Var2, i7, i8, wg3Var2);
    }
}
