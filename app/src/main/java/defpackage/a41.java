package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class a41 implements Comparable, Serializable {
    public static final a41 h = new a41(0, -31557014167219200L);
    public static final a41 i = new a41(999999999, 31556889864403199L);
    public final long f;
    public final int g;

    public a41(int i2, long j) {
        this.f = j;
        this.g = i2;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            c.p("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a41 a41Var = (a41) obj;
        a41Var.getClass();
        int iS = s51.s(this.f, a41Var.f);
        return iS != 0 ? iS : s51.r(this.g, a41Var.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a41)) {
            return false;
        }
        a41 a41Var = (a41) obj;
        return this.f == a41Var.f && this.g == a41Var.g;
    }

    public final int hashCode() {
        return (this.g * 51) + Long.hashCode(this.f);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.f;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i2 = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i3 = (int) j8;
        int i4 = ((i3 * 5) + 2) / 153;
        int i5 = ((i4 + 2) % 12) + 1;
        int i6 = (i3 - (((i4 * 306) + 5) / 10)) + 1;
        int i7 = (int) (j7 + j + ((long) (i4 / 10)));
        int i8 = i2 / 3600;
        int i9 = i2 - (i8 * 3600);
        int i10 = i9 / 60;
        int i11 = i9 - (i10 * 60);
        int i12 = 0;
        if (Math.abs(i7) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i7 >= 0) {
                sb2.append(i7 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i7 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i7 >= 10000) {
                sb.append('+');
            }
            sb.append(i7);
        }
        sb.append('-');
        f80.C(sb, sb, i5);
        sb.append('-');
        f80.C(sb, sb, i6);
        sb.append('T');
        f80.C(sb, sb, i8);
        sb.append(':');
        f80.C(sb, sb, i10);
        sb.append(':');
        f80.C(sb, sb, i11);
        int i13 = this.g;
        if (i13 != 0) {
            sb.append('.');
            while (true) {
                iArr = f80.d0;
                int i14 = i12 + 1;
                if (i13 % iArr[i14] != 0) {
                    break;
                }
                i12 = i14;
            }
            int i15 = i12 - (i12 % 3);
            String strValueOf = String.valueOf((i13 / iArr[i15]) + iArr[9 - i15]);
            strValueOf.getClass();
            sb.append(strValueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
