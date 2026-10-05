package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kq2 {
    public final sv2 a;
    public final long b;
    public final xy2 c;
    public final String d;
    public final String e;

    public kq2(sv2 sv2Var, long j, xy2 xy2Var, String str) {
        sv2Var.getClass();
        xy2Var.getClass();
        this.a = sv2Var;
        this.b = j;
        this.c = xy2Var;
        this.d = str;
        String lowerCase = sv2Var.c.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.e = lowerCase;
    }

    public static kq2 a(kq2 kq2Var, xy2 xy2Var, String str, int i) {
        sv2 sv2Var = kq2Var.a;
        long j = kq2Var.b;
        if ((i & 4) != 0) {
            xy2Var = kq2Var.c;
        }
        xy2 xy2Var2 = xy2Var;
        if ((i & 8) != 0) {
            str = kq2Var.d;
        }
        String str2 = str;
        kq2Var.getClass();
        sv2Var.getClass();
        xy2Var2.getClass();
        str2.getClass();
        return new kq2(sv2Var, j, xy2Var2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq2)) {
            return false;
        }
        kq2 kq2Var = (kq2) obj;
        return s51.n(this.a, kq2Var.a) && this.b == kq2Var.b && this.c == kq2Var.c && s51.n(this.d, kq2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + nc2.c(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "SavedServer(address=" + this.a + ", addedAtMillis=" + this.b + ", textEncoding=" + this.c + ", password=" + this.d + ")";
    }
}
