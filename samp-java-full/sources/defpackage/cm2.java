package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cm2 {
    public final hm2 a;
    public final String b;

    public cm2(hm2 hm2Var, String str) {
        this.a = hm2Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm2)) {
            return false;
        }
        cm2 cm2Var = (cm2) obj;
        return this.a.equals(cm2Var.a) && this.b.equals(cm2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ResponseData(sourceList=" + this.a + ", rawJson=" + this.b + ")";
    }
}
