package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class k41 extends e41 {
    public final int f;
    public final int g;
    public boolean h;
    public int i;

    public k41(int i, int i2, int i3) {
        this.f = i3;
        this.g = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.h = z;
        this.i = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h;
    }

    @Override // defpackage.e41
    public final int nextInt() {
        int i = this.i;
        if (i != this.g) {
            this.i = this.f + i;
            return i;
        }
        if (this.h) {
            this.h = false;
            return i;
        }
        c.n();
        return 0;
    }
}
