package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ov0 implements i20 {
    public final f20 f;

    public ov0(f20 f20Var) {
        this.f = f20Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ov0) {
            return this.f.equals(((ov0) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() * 31;
    }
}
