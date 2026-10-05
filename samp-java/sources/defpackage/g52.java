package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class g52 {
    public final l20 a;
    public final g20 b;
    public final nv0 c;
    public final rs0 d;
    public final boolean e;
    public final tl3 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(i52.h);
    public long i = g12.G();
    public js1 j;
    public final zk2 k;
    public final fk2 l;

    public g52(l20 l20Var, g20 g20Var, nv0 nv0Var, ls1 ls1Var, rs0 rs0Var, boolean z, tl3 tl3Var, Object obj) {
        this.a = l20Var;
        this.b = g20Var;
        this.c = nv0Var;
        this.d = rs0Var;
        this.e = z;
        this.f = tl3Var;
        this.g = obj;
        js1 js1Var = or2.a;
        js1Var.getClass();
        this.j = js1Var;
        zk2 zk2Var = new zk2();
        zk2Var.g(ls1Var, nv0Var.B());
        this.k = zk2Var;
        this.l = new fk2(tl3Var.h);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((i52) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                case oc2.LONG_FIELD_NUMBER /* 4 */:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case oc2.STRING_FIELD_NUMBER /* 5 */:
                    b();
                    i52 i52Var = i52.k;
                    i52 i52Var2 = i52.l;
                    while (!atomicReference.compareAndSet(i52Var, i52Var2)) {
                        if (atomicReference.get() != i52Var) {
                            yb2.b("Unexpected state change from: " + i52Var + " to: " + i52Var2 + ".");
                            return;
                        }
                    }
                    return;
                case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new kz();
            }
        } catch (Exception e) {
            atomicReference.set(i52.f);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.a(this.f, this.k);
                    this.k.c();
                    this.k.d();
                } finally {
                    this.k.b();
                    this.a.v = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        return ((i52) this.h.get()).compareTo(i52.k) >= 0;
    }

    public final void d() {
        i52 i52Var;
        i52 i52Var2;
        boolean z;
        while (true) {
            AtomicReference atomicReference = this.h;
            i52Var = i52.i;
            i52Var2 = i52.k;
            if (atomicReference.compareAndSet(i52Var, i52Var2)) {
                z = true;
                break;
            } else if (atomicReference.get() != i52Var) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        yb2.b("Unexpected state change from: " + i52Var + " to: " + i52Var2 + ".");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean e(u33 u33Var) throws Exception {
        i52 i52Var = i52.j;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((i52) atomicReference.get()).ordinal();
            i52 i52Var2 = i52.i;
            l20 l20Var = this.a;
            g20 g20Var = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                    nv0 nv0Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        nv0Var.z = 0;
                        nv0Var.y = true;
                    }
                    this.j = g20Var.b(l20Var, u33Var, this.d);
                    if (z) {
                        if (nv0Var.F || nv0Var.z != 0) {
                            yb2.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        nv0Var.z = -1;
                        nv0Var.y = false;
                    }
                    i52 i52Var3 = i52.h;
                    while (true) {
                        if (!atomicReference.compareAndSet(i52Var3, i52Var2)) {
                            if (atomicReference.get() != i52Var3) {
                                yb2.b("Unexpected state change from: " + i52Var3 + " to: " + i52Var2 + ".");
                            }
                        }
                    }
                    if (this.j.g()) {
                        d();
                    }
                    return c();
                case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                    while (true) {
                        if (!atomicReference.compareAndSet(i52Var2, i52Var)) {
                            if (atomicReference.get() != i52Var2) {
                                yb2.b("Unexpected state change from: " + i52Var2 + " to: " + i52Var + ".");
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = g12.G();
                        this.j = g20Var.n(l20Var, u33Var, this.j);
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(i52Var, i52Var2)) {
                                if (atomicReference.get() != i52Var) {
                                    yb2.b("Unexpected state change from: " + i52Var + " to: " + i52Var2 + ".");
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        while (true) {
                            if (!atomicReference.compareAndSet(i52Var, i52Var2)) {
                                if (atomicReference.get() != i52Var) {
                                    yb2.b("Unexpected state change from: " + i52Var + " to: " + i52Var2 + ".");
                                }
                            }
                        }
                        throw th;
                    }
                case oc2.LONG_FIELD_NUMBER /* 4 */:
                    e20.b("Recursive call to resume()");
                    throw new kz();
                case oc2.STRING_FIELD_NUMBER /* 5 */:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new kz();
            }
        } catch (Exception e) {
            atomicReference.set(i52.f);
            throw e;
        }
    }
}
