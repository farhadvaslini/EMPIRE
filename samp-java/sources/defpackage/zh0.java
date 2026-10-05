package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zh0 implements yh0 {
    public final int f;
    public int g = -1;
    public int h = -1;

    public zh0(int i) {
        this.f = i;
    }

    @Override // defpackage.yh0
    public final boolean j(CharSequence charSequence, int i, int i2, jl3 jl3Var) {
        int i3 = this.f;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.g = i;
        this.h = i2;
        return false;
    }

    @Override // defpackage.yh0
    public final Object a() {
        return this;
    }
}
