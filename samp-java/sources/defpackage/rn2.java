package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rn2 implements Serializable {
    public final Object f;

    public /* synthetic */ rn2(Object obj) {
        this.f = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof qn2) {
            return ((qn2) obj).f;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rn2) {
            return s51.n(this.f, ((rn2) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f;
        if (obj instanceof qn2) {
            return ((qn2) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
