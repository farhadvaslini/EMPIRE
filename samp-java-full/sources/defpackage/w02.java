package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class w02 extends vr {
    public final jk2 l;

    public w02(jk2 jk2Var) {
        this.l = jk2Var;
    }

    @Override // defpackage.vr
    public final jk2 A() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w02) {
            return this.l.equals(((w02) obj).l);
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode();
    }
}
