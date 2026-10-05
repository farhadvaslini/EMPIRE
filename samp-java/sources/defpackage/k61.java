package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k61 extends CancellationException {
    public final transient q61 f;

    public k61(String str, Throwable th, q61 q61Var) {
        super(str);
        this.f = q61Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k61)) {
            return false;
        }
        k61 k61Var = (k61) obj;
        if (!s51.n(k61Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = k61Var.f;
        if (obj2 == null) {
            obj2 = kx1.g;
        }
        Object obj3 = this.f;
        if (obj3 == null) {
            obj3 = kx1.g;
        }
        return s51.n(obj2, obj3) && s51.n(k61Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f;
        if (obj == null) {
            obj = kx1.g;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f;
        if (obj == null) {
            obj = kx1.g;
        }
        sb.append(obj);
        return sb.toString();
    }
}
