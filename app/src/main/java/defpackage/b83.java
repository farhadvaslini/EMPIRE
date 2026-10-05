package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class b83 implements i20, Iterable, t61 {
    public final j53 f;
    public final int g;
    public final wk2 h;

    public b83(j53 j53Var, int i, pv0 pv0Var, wk2 wk2Var) {
        this.f = j53Var;
        this.g = i;
        this.h = wk2Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b83)) {
            return false;
        }
        b83 b83Var = (b83) obj;
        return b83Var.g == this.g && b83Var.f == this.f && b83Var.h.equals(this.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.f.hashCode() + (this.g * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a83(this.f, this.g, null, this.h);
    }
}
