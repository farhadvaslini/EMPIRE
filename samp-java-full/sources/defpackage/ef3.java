package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ef3 {
    public final tm a;
    public final tm b;

    public ef3() {
        tm tmVar = f5.s;
        this.a = tmVar;
        this.b = tmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef3)) {
            return false;
        }
        ef3 ef3Var = (ef3) obj;
        return s51.n(this.a, ef3Var.a) && s51.n(this.b, ef3Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + nc2.a(Boolean.hashCode(false) * 31, this.a.a, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
    }
}
