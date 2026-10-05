package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class k53 implements i20, Iterable, t61 {
    public final j53 f;
    public final int g;
    public final int h;

    public k53(j53 j53Var, int i, int i2) {
        this.f = j53Var;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k53)) {
            return false;
        }
        k53 k53Var = (k53) obj;
        return k53Var.g == this.g && k53Var.h == this.h && k53Var.f == this.f;
    }

    public final int hashCode() {
        return (this.f.hashCode() * 31) + this.g;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j53 j53Var = this.f;
        if (j53Var.m != this.h) {
            l53.f();
        }
        int i = this.g;
        j53Var.g(i);
        return new dx0(j53Var, i + 1, j53Var.f[(i * 5) + 3] + i);
    }
}
