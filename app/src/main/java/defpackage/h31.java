package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class h31 {
    public static final h31 e = new h31(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public h31(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static h31 a(h31 h31Var, h31 h31Var2) {
        return b(Math.max(h31Var.a, h31Var2.a), Math.max(h31Var.b, h31Var2.b), Math.max(h31Var.c, h31Var2.c), Math.max(h31Var.d, h31Var2.d));
    }

    public static h31 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new h31(i, i2, i3, i4);
    }

    public static h31 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return gf.j(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h31.class != obj.getClass()) {
            return false;
        }
        h31 h31Var = (h31) obj;
        return this.d == h31Var.d && this.a == h31Var.a && this.c == h31Var.c && this.b == h31Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
