package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qn2 implements Serializable {
    public final Throwable f;

    public qn2(Throwable th) {
        th.getClass();
        this.f = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qn2) {
            return s51.n(this.f, ((qn2) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f + ')';
    }
}
