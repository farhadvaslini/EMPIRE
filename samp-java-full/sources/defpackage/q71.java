package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class q71 {
    public final Float a;
    public ng0 b;

    public q71(Float f, ng0 ng0Var) {
        this.a = f;
        this.b = ng0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q71)) {
            return false;
        }
        q71 q71Var = (q71) obj;
        return q71Var.a.equals(this.a) && s51.n(q71Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + nc2.b(0, this.a.hashCode() * 31, 31);
    }
}
