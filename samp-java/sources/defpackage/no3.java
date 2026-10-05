package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class no3 {
    public static final j01 a = new j01(hy1.a, 0, 0);

    public static final xj3 a(nr3 nr3Var, af afVar) {
        xj3 xj3VarA = nr3Var.a(afVar);
        int length = afVar.g.length();
        af afVar2 = xj3VarA.a;
        iy1 iy1Var = xj3VarA.b;
        int length2 = afVar2.g.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(iy1Var.r(i), length2, i);
        }
        b(iy1Var.r(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(iy1Var.n(i2), length, i2);
        }
        c(iy1Var.n(length2), length, length2);
        return new xj3(afVar2, new j01(iy1Var, afVar.g.length(), afVar2.g.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbL = nc2.l("OffsetMapping.originalToTransformed returned invalid mapping: ", i3, " -> ", i, " is not in range of transformed text [0, ");
        sbL.append(i2);
        sbL.append("]");
        p21.c(sbL.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbL = nc2.l("OffsetMapping.transformedToOriginal returned invalid mapping: ", i3, " -> ", i, " is not in range of original text [0, ");
        sbL.append(i2);
        sbL.append("]");
        p21.c(sbL.toString());
    }
}
