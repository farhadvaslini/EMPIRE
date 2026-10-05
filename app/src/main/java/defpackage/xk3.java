package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xk3 implements Serializable {
    public final Integer f;
    public final Integer g;
    public final Object h;

    public xk3(Integer num, Integer num2, Object obj) {
        this.f = num;
        this.g = num2;
        this.h = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk3)) {
            return false;
        }
        xk3 xk3Var = (xk3) obj;
        return this.f.equals(xk3Var.f) && this.g.equals(xk3Var.g) && this.h.equals(xk3Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + (this.f.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "(" + this.f + ", " + this.g + ", " + this.h + ')';
    }
}
