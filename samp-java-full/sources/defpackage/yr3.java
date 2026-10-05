package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yr3 implements mo1 {
    public final rm a;

    public yr3(rm rmVar) {
        this.a = rmVar;
    }

    @Override // defpackage.mo1
    public final int a(m41 m41Var, long j, int i, bb1 bb1Var) {
        int i2 = (int) (j >> 32);
        if (i >= i2) {
            return Math.round((1.0f + (bb1Var == bb1.f ? 0.0f : -0.0f)) * ((i2 - i) / 2.0f));
        }
        return y02.h(this.a.a(i, i2, bb1Var), 0, i2 - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yr3) && this.a.equals(((yr3) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "Horizontal(alignment=" + this.a + ", margin=0)";
    }
}
