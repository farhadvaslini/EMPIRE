package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tn1 {
    public final String a;
    public final String b;
    public final cs0 c;

    public tn1(String str, String str2, cs0 cs0Var) {
        str.getClass();
        str2.getClass();
        cs0Var.getClass();
        this.a = str;
        this.b = str2;
        this.c = cs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn1)) {
            return false;
        }
        tn1 tn1Var = (tn1) obj;
        return s51.n(this.a, tn1Var.a) && s51.n(this.b, tn1Var.b) && s51.n(this.c, tn1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + by1.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("MenuItem(label=", this.a, ", subtitle=", this.b, ", onClick=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
