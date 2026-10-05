package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class te3 implements dy, at0 {
    public final /* synthetic */ id1 a;

    public te3(id1 id1Var) {
        this.a = id1Var;
    }

    @Override // defpackage.dy
    public final long a() {
        return ((wx) this.a.get()).a;
    }

    @Override // defpackage.at0
    public final zs0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dy) || !(obj instanceof at0)) {
            return false;
        }
        return this.a.equals(((at0) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
