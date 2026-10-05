package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mc3 {
    public final float a;
    public final float b;
    public final float c;

    public mc3(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc3)) {
            return false;
        }
        mc3 mc3Var = (mc3) obj;
        return jd0.b(this.a, mc3Var.a) && jd0.b(this.b, mc3Var.b) && jd0.b(this.c, mc3Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + nc2.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.a;
        sb.append((Object) jd0.c(f));
        sb.append(", right=");
        float f2 = this.b;
        sb.append((Object) jd0.c(f + f2));
        sb.append(", width=");
        sb.append((Object) jd0.c(f2));
        sb.append(", contentWidth=");
        sb.append((Object) jd0.c(this.c));
        sb.append(')');
        return sb.toString();
    }
}
