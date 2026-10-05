package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class f23 {
    public final to2 a;
    public final to2 b;
    public final to2 c;
    public final to2 d;
    public final to2 e;
    public final to2 f;
    public final to2 g;
    public final to2 h;

    public f23() {
        to2 to2Var = a23.a;
        to2 to2Var2 = a23.b;
        to2 to2Var3 = a23.c;
        to2 to2Var4 = a23.d;
        to2 to2Var5 = a23.f;
        to2 to2Var6 = a23.e;
        to2 to2Var7 = a23.g;
        to2 to2Var8 = a23.h;
        this.a = to2Var;
        this.b = to2Var2;
        this.c = to2Var3;
        this.d = to2Var4;
        this.e = to2Var5;
        this.f = to2Var6;
        this.g = to2Var7;
        this.h = to2Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f23)) {
            return false;
        }
        f23 f23Var = (f23) obj;
        return s51.n(this.a, f23Var.a) && s51.n(this.b, f23Var.b) && s51.n(this.c, f23Var.c) && s51.n(this.d, f23Var.d) && s51.n(this.e, f23Var.e) && s51.n(this.f, f23Var.f) && s51.n(this.g, f23Var.g) && s51.n(this.h, f23Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
