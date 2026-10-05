package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class tj0 implements Runnable, Comparable, kc0 {
    private volatile Object _heap;
    public long f;
    public int g = -1;

    public tj0(long j) {
        this.f = j;
    }

    @Override // defpackage.kc0
    public final void a() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                ai0 ai0Var = r51.B1;
                if (obj == ai0Var) {
                    return;
                }
                uj0 uj0Var = obj instanceof uj0 ? (uj0) obj : null;
                if (uj0Var != null) {
                    synchronized (uj0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof sh3 ? (sh3) obj2 : null) != null) {
                            uj0Var.b(this.g);
                        }
                    }
                }
                this._heap = ai0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(long j, uj0 uj0Var, vj0 vj0Var) {
        synchronized (this) {
            if (this._heap == r51.B1) {
                return 2;
            }
            synchronized (uj0Var) {
                try {
                    tj0[] tj0VarArr = uj0Var.a;
                    tj0 tj0Var = tj0VarArr != null ? tj0VarArr[0] : null;
                    if (vj0.n.get(vj0Var) == 1) {
                        return 1;
                    }
                    if (tj0Var == null) {
                        uj0Var.c = j;
                    } else {
                        long j2 = tj0Var.f;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - uj0Var.c > 0) {
                            uj0Var.c = j;
                        }
                    }
                    long j3 = this.f;
                    long j4 = uj0Var.c;
                    if (j3 - j4 < 0) {
                        this.f = j4;
                    }
                    uj0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f - ((tj0) obj).f;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public final void d(uj0 uj0Var) {
        if (this._heap != r51.B1) {
            this._heap = uj0Var;
        } else {
            c.p("Failed requirement.");
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f + ']';
    }
}
