package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hv implements jv {
    public final ev a;
    public final String b;
    public final cd0 c;

    public /* synthetic */ hv(ev evVar, String str, int i) {
        this(evVar, (i & 2) != 0 ? null : str, (cd0) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv)) {
            return false;
        }
        hv hvVar = (hv) obj;
        return this.a == hvVar.a && s51.n(this.b, hvVar.b) && s51.n(this.c, hvVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        cd0 cd0Var = this.c;
        return iHashCode2 + (cd0Var != null ? cd0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Running(phase=" + this.a + ", scriptId=" + this.b + ", progress=" + this.c + ")";
    }

    public hv(ev evVar, String str, cd0 cd0Var) {
        this.a = evVar;
        this.b = str;
        this.c = cd0Var;
    }
}
