package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ty1 extends vp {
    public final sy1 g;
    public final of1 h;

    public ty1(of1 of1Var, sy1 sy1Var) {
        sy1Var.getClass();
        this.g = sy1Var;
        this.h = of1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty1)) {
            return false;
        }
        ty1 ty1Var = (ty1) obj;
        return s51.n(this.g, ty1Var.g) && s51.n(this.h, ty1Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        of1 of1Var = this.h;
        return iHashCode + (of1Var == null ? 0 : of1Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.g + ", owner=" + this.h + ')';
    }
}
