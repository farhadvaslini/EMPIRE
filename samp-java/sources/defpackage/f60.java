package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class f60 extends vr {
    public final g5 l;

    public f60(tm tmVar) {
        this.l = tmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f60) && s51.n(this.l, ((f60) obj).l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    @Override // defpackage.vr
    public final int l(int i, int i2, bb1 bb1Var) {
        return this.l.a(i2, i, bb1Var);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.l + ")";
    }
}
