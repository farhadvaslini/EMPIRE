package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pt1 {
    public final xu1 a;
    public final boolean b = false;

    public pt1(xu1 xu1Var) {
        this.a = xu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pt1.class != obj.getClass()) {
            return false;
        }
        pt1 pt1Var = (pt1) obj;
        return this.b == pt1Var.b && this.a.equals(pt1Var.a);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 961) + (this.b ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(rk2.a(pt1.class).c());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: false");
        if (this.b) {
            sb.append(" DefaultValue: null");
        }
        return sb.toString();
    }
}
