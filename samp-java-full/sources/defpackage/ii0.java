package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ii0 implements g11 {
    public final boolean f;

    public ii0(boolean z) {
        this.f = z;
    }

    @Override // defpackage.g11
    public final boolean b() {
        return this.f;
    }

    @Override // defpackage.g11
    public final gx1 d() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
