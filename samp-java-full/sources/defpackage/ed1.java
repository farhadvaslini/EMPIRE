package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ed1 implements e93 {
    public final d42 f;
    public int g;

    public ed1(int i) {
        int i2 = (i / 30) * 30;
        this.f = new d42(y02.S(Math.max(i2 - 100, 0), i2 + 130), m22.u);
        this.g = i;
    }

    public final void a(int i) {
        if (i != this.g) {
            this.g = i;
            int i2 = (i / 30) * 30;
            this.f.setValue(y02.S(Math.max(i2 - 100, 0), i2 + 130));
        }
    }

    @Override // defpackage.e93
    public final Object getValue() {
        return (l41) this.f.getValue();
    }
}
