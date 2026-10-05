package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zs {
    public final int a;
    public final int b;
    public final int c;

    public zs(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs)) {
            return false;
        }
        zs zsVar = (zs) obj;
        return this.a == zsVar.a && this.b == zsVar.b && this.c == zsVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + nc2.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbL = nc2.l("ChatColorSpan(start=", this.a, ", end=", this.b, ", color=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
