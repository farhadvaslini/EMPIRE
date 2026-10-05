package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class up2 {
    public final String a;
    public final int b;

    public up2(int i, String str) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up2)) {
            return false;
        }
        up2 up2Var = (up2) obj;
        return s51.n(this.a, up2Var.a) && this.b == up2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SampPlayerInfo(name=" + this.a + ", score=" + this.b + ")";
    }
}
