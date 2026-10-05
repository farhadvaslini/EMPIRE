package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class s01 {
    public static final bq1 a = j43.k(yp1.a, cl3.t0);

    public static final void a(final w01 w01Var, String str, bq1 bq1Var, long j, nv0 nv0Var, final int i, final int i2) {
        String str2;
        nv0 nv0Var2;
        final long j2;
        final bq1 bq1Var2;
        nv0Var.b0(-126890956);
        int i3 = (nv0Var.f(w01Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= nv0Var.f(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 256 : 128;
        }
        int i5 = i3 | (((i2 & 8) == 0 && nv0Var.e(j)) ? 2048 : 1024);
        if (nv0Var.R(i5 & 1, (i5 & 1171) != 1170)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                if (i4 != 0) {
                    bq1Var = yp1.a;
                }
                if ((i2 & 8) != 0) {
                    j = ((wx) nv0Var.j(t30.a)).a;
                    i5 &= -7169;
                }
                bq1 bq1Var3 = bq1Var;
                long j3 = j;
                nv0Var.q();
                str2 = str;
                nv0Var2 = nv0Var;
                b(b32.A(w01Var, nv0Var), str2, bq1Var3, j3, nv0Var2, (i5 & 112) | 8 | (i5 & 896) | (i5 & 7168));
                bq1Var2 = bq1Var3;
                j2 = j3;
            } else {
                nv0Var.U();
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                }
                bq1 bq1Var32 = bq1Var;
                long j32 = j;
                nv0Var.q();
                str2 = str;
                nv0Var2 = nv0Var;
                b(b32.A(w01Var, nv0Var), str2, bq1Var32, j32, nv0Var2, (i5 & 112) | 8 | (i5 & 896) | (i5 & 7168));
                bq1Var2 = bq1Var32;
                j2 = j32;
            }
        } else {
            str2 = str;
            nv0Var2 = nv0Var;
            nv0Var2.U();
            j2 = j;
            bq1Var2 = bq1Var;
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            final String str3 = str2;
            xj2VarT.d = new rs0() { // from class: r01
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s01.a(w01Var, str3, bq1Var2, j2, (nv0) obj, jo3.y(i | 1), i2);
                    return dm3.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.o32 r16, java.lang.String r17, defpackage.bq1 r18, long r19, defpackage.nv0 r21, int r22) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s01.b(o32, java.lang.String, bq1, long, nv0, int):void");
    }
}
