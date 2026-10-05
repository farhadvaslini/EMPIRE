package defpackage;

import java.text.BreakIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends d1 {
    public static e1 e;
    public static e1 f;
    public static e1 g;
    public static final sl2 h = sl2.g;
    public static final sl2 i = sl2.f;
    public final /* synthetic */ int c;
    public Object d;

    @Override // defpackage.d1
    public final int[] e(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i2 >= length) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        s51.F("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            s51.F("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return h(i2, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        s51.F("impl");
                        throw null;
                    }
                    i2 = breakIterator2.following(i2);
                } while (i2 != -1);
                return null;
            case 1:
                if (i().length() <= 0 || i2 >= i().length()) {
                    return null;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!u(i2) && (!u(i2) || (i2 != 0 && u(i2 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        s51.F("impl");
                        throw null;
                    }
                    i2 = breakIterator3.following(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    s51.F("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i2);
                if (iFollowing2 == -1 || !t(iFollowing2)) {
                    return null;
                }
                return h(i2, iFollowing2);
            default:
                if (i().length() <= 0 || i2 >= i().length()) {
                    return null;
                }
                pg3 pg3Var = (pg3) this.d;
                sl2 sl2Var = h;
                if (i2 < 0) {
                    if (pg3Var == null) {
                        s51.F("layoutResult");
                        throw null;
                    }
                    iD = pg3Var.b.d(0);
                } else {
                    if (pg3Var == null) {
                        s51.F("layoutResult");
                        throw null;
                    }
                    int iD2 = pg3Var.b.d(i2);
                    iD = r(iD2, sl2Var) == i2 ? iD2 : iD2 + 1;
                }
                pg3 pg3Var2 = (pg3) this.d;
                if (pg3Var2 == null) {
                    s51.F("layoutResult");
                    throw null;
                }
                if (iD >= pg3Var2.b.f) {
                    return null;
                }
                return h(r(iD, sl2Var), r(iD, i) + 1);
        }
    }

    @Override // defpackage.d1
    public final int[] p(int i2) {
        int iD;
        switch (this.c) {
            case 0:
                int length = i().length();
                if (length <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length) {
                    i2 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.d;
                    if (breakIterator == null) {
                        s51.F("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = (BreakIterator) this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            s51.F("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return h(iPreceding, i2);
                    }
                    if (breakIterator2 == null) {
                        s51.F("impl");
                        throw null;
                    }
                    i2 = breakIterator2.preceding(i2);
                } while (i2 != -1);
                return null;
            case 1:
                int length2 = i().length();
                if (length2 <= 0 || i2 <= 0) {
                    return null;
                }
                if (i2 > length2) {
                    i2 = length2;
                }
                while (i2 > 0 && !u(i2 - 1) && !t(i2)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.d;
                    if (breakIterator3 == null) {
                        s51.F("impl");
                        throw null;
                    }
                    i2 = breakIterator3.preceding(i2);
                    if (i2 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.d;
                if (breakIterator4 == null) {
                    s51.F("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i2);
                if (iPreceding2 == -1 || !u(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !u(iPreceding2 - 1)) {
                    return h(iPreceding2, i2);
                }
                return null;
            default:
                if (i().length() <= 0 || i2 <= 0) {
                    return null;
                }
                int length3 = i().length();
                pg3 pg3Var = (pg3) this.d;
                sl2 sl2Var = i;
                if (i2 > length3) {
                    if (pg3Var == null) {
                        s51.F("layoutResult");
                        throw null;
                    }
                    iD = pg3Var.b.d(i().length());
                } else {
                    if (pg3Var == null) {
                        s51.F("layoutResult");
                        throw null;
                    }
                    int iD2 = pg3Var.b.d(i2);
                    iD = r(iD2, sl2Var) + 1 == i2 ? iD2 : iD2 - 1;
                }
                if (iD < 0) {
                    return null;
                }
                return h(r(iD, h), r(iD, sl2Var) + 1);
        }
    }

    public int r(int i2, sl2 sl2Var) {
        pg3 pg3Var = (pg3) this.d;
        if (pg3Var == null) {
            s51.F("layoutResult");
            throw null;
        }
        int iG = pg3Var.g(i2);
        pg3 pg3Var2 = (pg3) this.d;
        if (pg3Var2 == null) {
            s51.F("layoutResult");
            throw null;
        }
        sl2 sl2VarH = pg3Var2.h(iG);
        pg3 pg3Var3 = (pg3) this.d;
        if (sl2Var != sl2VarH) {
            if (pg3Var3 != null) {
                return pg3Var3.g(i2);
            }
            s51.F("layoutResult");
            throw null;
        }
        if (pg3Var3 != null) {
            return pg3Var3.b.c(i2, false) - 1;
        }
        s51.F("layoutResult");
        throw null;
    }

    public void s(String str) {
        switch (this.c) {
            case 0:
                this.a = str;
                BreakIterator breakIterator = (BreakIterator) this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    s51.F("impl");
                    throw null;
                }
            default:
                this.a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    s51.F("impl");
                    throw null;
                }
        }
    }

    public boolean t(int i2) {
        if (i2 <= 0 || !u(i2 - 1)) {
            return false;
        }
        return i2 == i().length() || !u(i2);
    }

    public boolean u(int i2) {
        if (i2 < 0 || i2 >= i().length()) {
            return false;
        }
        return Character.isLetterOrDigit(i().codePointAt(i2));
    }
}
