package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rw1 {
    public final qw1 a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public rw1(qw1 qw1Var, int i, int i2, int i3, String str) {
        this.a = qw1Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw1)) {
            return false;
        }
        rw1 rw1Var = (rw1) obj;
        return this.a == rw1Var.a && this.b == rw1Var.b && this.c == rw1Var.c && this.d == rw1Var.d && this.e.equals(rw1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + nc2.b(this.d, nc2.b(this.c, nc2.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkPacketFilterItem(category=");
        sb.append(this.a);
        sb.append(", direction=");
        sb.append(this.b);
        sb.append(", kind=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        sb.append(", name=");
        return nc2.j(sb, this.e, ")");
    }
}
