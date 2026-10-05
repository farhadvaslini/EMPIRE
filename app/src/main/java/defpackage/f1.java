package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends d1 {
    public static f1 e;
    public static final sl2 f = sl2.g;
    public static final sl2 g = sl2.f;
    public pg3 c;
    public vu2 d;

    @Override // defpackage.d1
    public final int[] e(int i) {
        int iE;
        if (i().length() > 0 && i < i().length()) {
            try {
                vu2 vu2Var = this.d;
                if (vu2Var == null) {
                    s51.F("node");
                    throw null;
                }
                jk2 jk2VarG = vu2Var.g();
                int iRound = Math.round(jk2VarG.d - jk2VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                pg3 pg3Var = this.c;
                if (pg3Var == null) {
                    s51.F("layoutResult");
                    throw null;
                }
                int iD = pg3Var.b.d(i);
                pg3 pg3Var2 = this.c;
                if (pg3Var2 == null) {
                    s51.F("layoutResult");
                    throw null;
                }
                float f2 = pg3Var2.b.f(iD) + iRound;
                pg3 pg3Var3 = this.c;
                if (pg3Var3 == null) {
                    s51.F("layoutResult");
                    throw null;
                }
                float f3 = pg3Var3.b.f(r0.f - 1);
                pg3 pg3Var4 = this.c;
                if (f2 < f3) {
                    if (pg3Var4 == null) {
                        s51.F("layoutResult");
                        throw null;
                    }
                    iE = pg3Var4.b.e(f2);
                } else {
                    if (pg3Var4 == null) {
                        s51.F("layoutResult");
                        throw null;
                    }
                    iE = pg3Var4.b.f;
                }
                return h(i, r(iE - 1, g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.d1
    public final int[] p(int i) {
        int iE;
        if (i().length() > 0 && i > 0) {
            try {
                vu2 vu2Var = this.d;
                if (vu2Var == null) {
                    s51.F("node");
                    throw null;
                }
                jk2 jk2VarG = vu2Var.g();
                int iRound = Math.round(jk2VarG.d - jk2VarG.b);
                int length = i().length();
                if (length <= i) {
                    i = length;
                }
                pg3 pg3Var = this.c;
                if (pg3Var == null) {
                    s51.F("layoutResult");
                    throw null;
                }
                int iD = pg3Var.b.d(i);
                pg3 pg3Var2 = this.c;
                if (pg3Var2 == null) {
                    s51.F("layoutResult");
                    throw null;
                }
                float f2 = pg3Var2.b.f(iD) - iRound;
                if (f2 > 0.0f) {
                    pg3 pg3Var3 = this.c;
                    if (pg3Var3 == null) {
                        s51.F("layoutResult");
                        throw null;
                    }
                    iE = pg3Var3.b.e(f2);
                } else {
                    iE = 0;
                }
                if (i == i().length() && iE < iD) {
                    iE++;
                }
                return h(r(iE, f), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int r(int i, sl2 sl2Var) {
        pg3 pg3Var = this.c;
        if (pg3Var == null) {
            s51.F("layoutResult");
            throw null;
        }
        int iG = pg3Var.g(i);
        pg3 pg3Var2 = this.c;
        if (pg3Var2 == null) {
            s51.F("layoutResult");
            throw null;
        }
        sl2 sl2VarH = pg3Var2.h(iG);
        pg3 pg3Var3 = this.c;
        if (sl2Var != sl2VarH) {
            if (pg3Var3 != null) {
                return pg3Var3.g(i);
            }
            s51.F("layoutResult");
            throw null;
        }
        if (pg3Var3 != null) {
            return pg3Var3.b.c(i, false) - 1;
        }
        s51.F("layoutResult");
        throw null;
    }
}
