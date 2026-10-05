package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class oc1 {
    public final int a;
    public final int b;

    public oc1(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (!(i >= 0)) {
            p21.a("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        p21.a("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc1)) {
            return false;
        }
        oc1 oc1Var = (oc1) obj;
        return this.a == oc1Var.a && this.b == oc1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nc2.h("Interval(start=", this.a, ", end=", this.b, ")");
    }
}
