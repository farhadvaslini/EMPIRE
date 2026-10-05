package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lm3 implements lc1, Serializable {
    public cs0 f;
    public Object g;

    @Override // defpackage.lc1
    public final Object getValue() {
        if (this.g == m22.z) {
            cs0 cs0Var = this.f;
            cs0Var.getClass();
            this.g = cs0Var.a();
            this.f = null;
        }
        return this.g;
    }

    public final String toString() {
        return this.g != m22.z ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
