package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class om0 implements js3 {
    public final int a;

    public om0(int i) {
        this.a = i;
    }

    @Override // defpackage.js3
    public final int a(ua0 ua0Var) {
        return 0;
    }

    @Override // defpackage.js3
    public final int b(ua0 ua0Var) {
        return this.a;
    }

    @Override // defpackage.js3
    public final int c(ua0 ua0Var, bb1 bb1Var) {
        return 0;
    }

    @Override // defpackage.js3
    public final int d(ua0 ua0Var, bb1 bb1Var) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof om0) && this.a == ((om0) obj).a;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final String toString() {
        return by1.h("Insets(left=0, top=", ", right=0, bottom=0)", this.a);
    }
}
