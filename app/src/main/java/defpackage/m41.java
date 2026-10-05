package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m41 {
    public static final m41 e = new m41(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public m41(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((long) ((b() / 2) + this.b)) & 4294967295L) | (((long) ((d() / 2) + this.a)) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m41)) {
            return false;
        }
        m41 m41Var = (m41) obj;
        return this.a == m41Var.a && this.b == m41Var.b && this.c == m41Var.c && this.d == m41Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + nc2.b(this.c, nc2.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = nc2.l("IntRect.fromLTRB(", this.a, ", ", this.b, ", ");
        sbL.append(this.c);
        sbL.append(", ");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }
}
