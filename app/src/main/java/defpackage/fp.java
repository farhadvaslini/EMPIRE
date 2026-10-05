package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fp implements dg3 {
    public final o13 a;
    public final float b;

    public fp(o13 o13Var, float f) {
        this.a = o13Var;
        this.b = f;
    }

    @Override // defpackage.dg3
    public final long a() {
        int i = wx.h;
        return wx.g;
    }

    @Override // defpackage.dg3
    public final dp b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp)) {
            return false;
        }
        fp fpVar = (fp) obj;
        return s51.n(this.a, fpVar.a) && Float.compare(this.b, fpVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.dg3
    public final float t() {
        return this.b;
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ")";
    }
}
