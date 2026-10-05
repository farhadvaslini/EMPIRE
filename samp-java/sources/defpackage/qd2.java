package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qd2 {
    public static final qd2 d = new qd2(0.0f, new ex(0.0f, 0.0f), 0);
    public final float a;
    public final ex b;
    public final int c;

    public qd2(float f, ex exVar, int i) {
        this.a = f;
        this.b = exVar;
        this.c = i;
        if (Float.isNaN(f)) {
            c.p("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd2)) {
            return false;
        }
        qd2 qd2Var = (qd2) obj;
        return this.a == qd2Var.a && s51.n(this.b, qd2Var.b) && this.c == qd2Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=" + this.c + ")";
    }
}
