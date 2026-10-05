package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hz {
    public final Object a;
    public final er b;
    public final ss0 c;
    public final Object d;
    public final Throwable e;

    public /* synthetic */ hz(Object obj, er erVar, ss0 ss0Var, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : erVar, (i & 4) != 0 ? null : ss0Var, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static hz a(hz hzVar, er erVar, Throwable th, int i) {
        Object obj = hzVar.a;
        if ((i & 2) != 0) {
            erVar = hzVar.b;
        }
        er erVar2 = erVar;
        ss0 ss0Var = hzVar.c;
        Object obj2 = hzVar.d;
        if ((i & 16) != 0) {
            th = hzVar.e;
        }
        return new hz(obj, erVar2, ss0Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz)) {
            return false;
        }
        hz hzVar = (hz) obj;
        return s51.n(this.a, hzVar.a) && s51.n(this.b, hzVar.b) && s51.n(this.c, hzVar.c) && s51.n(this.d, hzVar.d) && s51.n(this.e, hzVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        er erVar = this.b;
        int iHashCode2 = (iHashCode + (erVar == null ? 0 : erVar.hashCode())) * 31;
        ss0 ss0Var = this.c;
        int iHashCode3 = (iHashCode2 + (ss0Var == null ? 0 : ss0Var.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public hz(Object obj, er erVar, ss0 ss0Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = erVar;
        this.c = ss0Var;
        this.d = obj2;
        this.e = th;
    }
}
