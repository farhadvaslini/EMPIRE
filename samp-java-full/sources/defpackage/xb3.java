package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xb3 implements lc1, Serializable {
    public cs0 f;
    public volatile Object g = m22.z;
    public final Object h = this;

    public xb3(cs0 cs0Var) {
        this.f = cs0Var;
    }

    @Override // defpackage.lc1
    public final Object getValue() {
        Object objA;
        Object obj = this.g;
        m22 m22Var = m22.z;
        if (obj != m22Var) {
            return obj;
        }
        synchronized (this.h) {
            objA = this.g;
            if (objA == m22Var) {
                cs0 cs0Var = this.f;
                cs0Var.getClass();
                objA = cs0Var.a();
                this.g = objA;
                this.f = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.g != m22.z ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
