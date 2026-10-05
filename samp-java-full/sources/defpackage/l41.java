package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class l41 extends j41 implements fx {
    public static final l41 i = new l41(1, 0, 1);

    @Override // defpackage.fx
    public final Comparable a() {
        return Integer.valueOf(this.f);
    }

    @Override // defpackage.fx
    public final Comparable b() {
        return Integer.valueOf(this.g);
    }

    @Override // defpackage.j41
    public final boolean equals(Object obj) {
        if (!(obj instanceof l41)) {
            return false;
        }
        if (isEmpty() && ((l41) obj).isEmpty()) {
            return true;
        }
        l41 l41Var = (l41) obj;
        return this.f == l41Var.f && this.g == l41Var.g;
    }

    @Override // defpackage.j41
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f * 31) + this.g;
    }

    @Override // defpackage.j41, defpackage.fx
    public final boolean isEmpty() {
        return this.f > this.g;
    }

    @Override // defpackage.j41
    public final String toString() {
        return this.f + ".." + this.g;
    }
}
