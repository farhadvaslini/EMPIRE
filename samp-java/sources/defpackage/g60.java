package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class g60 extends vr {
    public final um l;

    public g60(um umVar) {
        this.l = umVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g60) && s51.n(this.l, ((g60) obj).l);
    }

    public final int hashCode() {
        return Float.hashCode(this.l.a);
    }

    @Override // defpackage.vr
    public final int l(int i, int i2, bb1 bb1Var) {
        return this.l.a(i2, i);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.l + ")";
    }
}
