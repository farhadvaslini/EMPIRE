package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class y63 implements Iterable, t61 {
    public static final y63 j = new y63(0, 0, 0, null);
    public final long f;
    public final long g;
    public final long h;
    public final long[] i;

    public y63(long j2, long j3, long j4, long[] jArr) {
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = jArr;
    }

    public final y63 a(y63 y63Var) {
        long[] jArr;
        y63 y63VarB = this;
        y63 y63Var2 = j;
        if (y63Var == y63Var2) {
            return y63VarB;
        }
        if (y63VarB == y63Var2) {
            return y63Var2;
        }
        long j2 = y63Var.h;
        long j3 = y63Var.h;
        long[] jArr2 = y63Var.i;
        long j4 = y63Var.g;
        long j5 = y63Var.f;
        long j6 = y63VarB.h;
        if (j2 == j6 && jArr2 == (jArr = y63VarB.i)) {
            return new y63(y63VarB.f & (~j5), y63VarB.g & (~j4), j6, jArr);
        }
        if (jArr2 != null) {
            for (long j7 : jArr2) {
                y63VarB = y63VarB.b(j7);
            }
        }
        if (j4 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j4) != 0) {
                    y63VarB = y63VarB.b(((long) i) + j3);
                }
            }
        }
        if (j5 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != 0) {
                    y63VarB = y63VarB.b(((long) i2) + j3 + 64);
                }
            }
        }
        return y63VarB;
    }

    public final y63 b(long j2) {
        long[] jArr;
        int i;
        long[] jArr2;
        long j3 = j2 - this.h;
        if (s51.s(j3, 0L) >= 0 && s51.s(j3, 64L) < 0) {
            long j4 = 1 << ((int) j3);
            long j5 = this.g;
            if ((j5 & j4) != 0) {
                return new y63(this.f, j5 & (~j4), this.h, this.i);
            }
        } else if (s51.s(j3, 64L) >= 0 && s51.s(j3, 128L) < 0) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.f;
            if ((j7 & j6) != 0) {
                return new y63(j7 & (~j6), this.g, this.h, this.i);
            }
        } else if (s51.s(j3, 0L) < 0 && (jArr = this.i) != null && (i = w22.i(jArr, j2)) >= 0) {
            int length = jArr.length;
            int i2 = length - 1;
            if (i2 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i2];
                if (i > 0) {
                    uj.I(jArr, jArr3, 0, 0, i);
                }
                if (i < i2) {
                    uj.I(jArr, jArr3, i, i + 1, length);
                }
                jArr2 = jArr3;
            }
            return new y63(this.f, this.g, this.h, jArr2);
        }
        return this;
    }

    public final boolean c(long j2) {
        long[] jArr;
        long j3 = j2 - this.h;
        return (s51.s(j3, 0L) < 0 || s51.s(j3, 64L) >= 0) ? (s51.s(j3, 64L) < 0 || s51.s(j3, 128L) >= 0) ? s51.s(j3, 0L) <= 0 && (jArr = this.i) != null && w22.i(jArr, j2) >= 0 : ((1 << (((int) j3) + (-64))) & this.f) != 0 : ((1 << ((int) j3)) & this.g) != 0;
    }

    public final y63 e(y63 y63Var) {
        y63 y63VarF;
        long[] jArr;
        y63 y63VarF2 = this;
        y63 y63Var2 = j;
        if (y63Var == y63Var2) {
            return y63VarF2;
        }
        if (y63VarF2 == y63Var2) {
            return y63Var;
        }
        long j2 = y63Var.h;
        long j3 = y63Var.h;
        long[] jArr2 = y63Var.i;
        long j4 = y63Var.g;
        long j5 = y63Var.f;
        long j6 = y63VarF2.h;
        long j7 = y63VarF2.g;
        long j8 = y63VarF2.f;
        if (j2 == j6 && jArr2 == (jArr = y63VarF2.i)) {
            return new y63(j8 | j5, j7 | j4, j6, jArr);
        }
        int i = 0;
        long[] jArr3 = y63VarF2.i;
        if (jArr3 != null) {
            if (jArr2 != null) {
                for (long j9 : jArr2) {
                    y63VarF2 = y63VarF2.f(j9);
                }
            }
            if (j4 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j4) != 0) {
                        y63VarF2 = y63VarF2.f(((long) i2) + j3);
                    }
                }
            }
            if (j5 != 0) {
                while (i < 64) {
                    if (((1 << i) & j5) != 0) {
                        y63VarF2 = y63VarF2.f(((long) i) + j3 + 64);
                    }
                    i++;
                }
            }
            return y63VarF2;
        }
        if (jArr3 != null) {
            y63VarF = y63Var;
            for (long j10 : jArr3) {
                y63VarF = y63VarF.f(j10);
            }
        } else {
            y63VarF = y63Var;
        }
        long j11 = y63VarF2.h;
        if (j7 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j7) != 0) {
                    y63VarF = y63VarF.f(((long) i3) + j11);
                }
            }
        }
        if (j8 != 0) {
            while (i < 64) {
                if (((1 << i) & j8) != 0) {
                    y63VarF = y63VarF.f(((long) i) + j11 + 64);
                }
                i++;
            }
        }
        return y63VarF;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.y63 f(long r30) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y63.f(long):y63");
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return b32.u(new x63(this, null));
    }

    public final String toString() {
        String string = super.toString();
        ArrayList arrayList = new ArrayList(rx.d0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return string + " [" + sb.toString() + "]";
    }
}
