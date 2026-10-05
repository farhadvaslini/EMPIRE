package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bp2 {
    public float a = 0.0f;
    public boolean b = true;
    public vr c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp2)) {
            return false;
        }
        bp2 bp2Var = (bp2) obj;
        return Float.compare(this.a, bp2Var.a) == 0 && this.b == bp2Var.b && s51.n(this.c, bp2Var.c);
    }

    public final int hashCode() {
        int iB = by1.b(Float.hashCode(this.a) * 31, 31, this.b);
        vr vrVar = this.c;
        return (iB + (vrVar == null ? 0 : vrVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
