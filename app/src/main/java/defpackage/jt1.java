package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jt1 {
    public final kt1 a;
    public final ArrayList b;

    public jt1(kt1 kt1Var, ArrayList arrayList) {
        this.a = kt1Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt1)) {
            return false;
        }
        jt1 jt1Var = (jt1) obj;
        return this.a.equals(jt1Var.a) && this.b.equals(jt1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedLayout(key=" + this.a + ", lines=" + this.b + ")";
    }
}
