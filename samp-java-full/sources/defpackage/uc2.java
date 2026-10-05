package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class uc2 {
    public final int a;
    public final int b;

    public uc2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc2)) {
            return false;
        }
        uc2 uc2Var = (uc2) obj;
        return this.a == uc2Var.a && this.b == uc2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nc2.h("PrependScroll(index=", this.a, ", scrollOffset=", this.b, ")");
    }
}
