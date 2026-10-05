package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ij2 implements Cloneable {
    public final my1 f;
    public final ll2 g;
    public final lj2 h;
    public volatile pj0 i;
    public final hj2 j;
    public final AtomicBoolean k;
    public Object l;
    public bk0 m;
    public jj2 n;
    public boolean o;
    public yj0 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public volatile boolean v;
    public volatile yj0 w;
    public final CopyOnWriteArrayList x;

    static {
        AtomicReferenceFieldUpdater.newUpdater(ij2.class, pj0.class, "i");
    }

    public ij2(my1 my1Var, ll2 ll2Var) {
        my1Var.getClass();
        ll2Var.getClass();
        this.f = my1Var;
        this.g = ll2Var;
        this.h = (lj2) my1Var.C.g;
        my1Var.d.getClass();
        this.i = pj0.a;
        hj2 hj2Var = new hj2(this);
        hj2Var.g(0L);
        this.j = hj2Var;
        this.k = new AtomicBoolean();
        this.u = true;
        this.x = new CopyOnWriteArrayList();
        new AtomicReference(ll2Var.d);
    }

    public static final String a(ij2 ij2Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(ij2Var.v ? "canceled " : "");
        sb.append("call");
        sb.append(" to ");
        sb.append(ij2Var.g.a.g());
        return sb.toString();
    }

    public final void b(jj2 jj2Var) {
        jj2Var.getClass();
        TimeZone timeZone = lv3.a;
        if (this.n != null) {
            c.q("Check failed.");
        } else {
            this.n = jj2Var;
            jj2Var.p.add(new gj2(this, this.l));
        }
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketK;
        TimeZone timeZone = lv3.a;
        jj2 jj2Var = this.n;
        if (jj2Var != null) {
            synchronized (jj2Var) {
                socketK = k();
            }
            if (this.n == null) {
                if (socketK != null) {
                    lv3.c(socketK);
                }
                this.i.getClass();
            } else if (socketK != null) {
                c.q("Check failed.");
                return null;
            }
        }
        if (!this.o && this.j.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        pj0 pj0Var = this.i;
        if (iOException == null) {
            pj0Var.getClass();
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        pj0Var.getClass();
        return interruptedIOException;
    }

    public final Object clone() {
        return new ij2(this.f, this.g);
    }

    public final void d() {
        if (this.v) {
            return;
        }
        this.v = true;
        yj0 yj0Var = this.w;
        if (yj0Var != null) {
            ((ak0) yj0Var.d).cancel();
        }
        Iterator it = this.x.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((yo2) it.next()).cancel();
        }
        this.i.getClass();
    }

    public final void e(zq zqVar) {
        if (!this.k.compareAndSet(false, true)) {
            c.q("Already Executed");
            return;
        }
        m62 m62Var = m62.a;
        this.l = m62.a.h();
        this.i.getClass();
        pl plVar = this.f.a;
        fj2 fj2Var = new fj2(this, zqVar);
        plVar.getClass();
        pl.B(plVar, fj2Var, null, null, 6);
    }

    public final ln2 f() {
        if (!this.k.compareAndSet(false, true)) {
            c.q("Already Executed");
            return null;
        }
        this.j.h();
        m62 m62Var = m62.a;
        this.l = m62.a.h();
        this.i.getClass();
        try {
            pl plVar = this.f.a;
            synchronized (plVar) {
                ((ArrayDeque) plVar.j).add(this);
            }
            return h();
        } finally {
            pl plVar2 = this.f.a;
            plVar2.getClass();
            pl.B(plVar2, null, this, null, 5);
        }
    }

    public final void g(boolean z) {
        yj0 yj0Var;
        synchronized (this) {
            if (!this.u) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (yj0Var = this.w) != null) {
            ((ak0) yj0Var.d).cancel();
            ((ij2) yj0Var.b).i(yj0Var, true, true, true, true, null);
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ln2 h() {
        ArrayList arrayList = new ArrayList();
        vx.f0(arrayList, this.f.b);
        arrayList.add(new wq(4));
        arrayList.add(new wq(2));
        arrayList.add(new wq(3));
        arrayList.add(wq.c);
        vx.f0(arrayList, this.f.c);
        arrayList.add(wq.b);
        ll2 ll2Var = this.g;
        my1 my1Var = this.f;
        ll2Var.getClass();
        my1Var.getClass();
        mj2 mj2Var = new mj2(this, arrayList, 0, null, ll2Var, my1Var.v, my1Var.w, my1Var.x, my1Var.g, my1Var.t, my1Var.C, my1Var.j, my1Var.k, my1Var.s, my1Var.m, my1Var.l, my1Var.e, my1Var.n, my1Var.o, my1Var.p, my1Var.u);
        boolean z = false;
        try {
            try {
                ln2 ln2VarB = mj2Var.b(this.g);
                if (this.v) {
                    jv3.a(ln2VarB);
                    throw new IOException("Canceled");
                }
                j(null);
                return ln2VarB;
            } catch (IOException e) {
                z = true;
                IOException iOExceptionJ = j(e);
                iOExceptionJ.getClass();
                throw iOExceptionJ;
            }
        } catch (Throwable th) {
            if (!z) {
            }
            throw th;
        }
        if (!z) {
            j(null);
        }
        throw th;
    }

    public final IOException i(yj0 yj0Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        yj0Var.getClass();
        if (yj0Var.equals(this.w)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (!this.q) {
                            if ((z2 || !this.r) && ((!z4 || !this.s) && (!z3 || !this.t))) {
                            }
                        }
                        if (z) {
                            this.q = false;
                        }
                        if (z2) {
                            this.r = false;
                        }
                        if (z4) {
                            this.s = false;
                        }
                        if (z3) {
                            this.t = false;
                        }
                        boolean z7 = (this.q || this.r || this.s || this.t) ? false : true;
                        if (z7) {
                            if (!this.u) {
                                z5 = true;
                            }
                        }
                        boolean z8 = z5;
                        z5 = z7;
                        z6 = z8;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = z2 ? false : false;
                }
            }
            if (z5) {
                this.w = null;
                jj2 jj2Var = this.n;
                if (jj2Var != null) {
                    synchronized (jj2Var) {
                        jj2Var.m++;
                    }
                }
            }
            if (z6) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.u) {
                this.u = false;
                if (!this.q && !this.r && !this.s) {
                    if (!this.t) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket k() {
        jj2 jj2Var = this.n;
        jj2Var.getClass();
        TimeZone timeZone = lv3.a;
        ArrayList arrayList = jj2Var.p;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (s51.n(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            c.q("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.n = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        jj2Var.q = System.nanoTime();
        lj2 lj2Var = this.h;
        ConcurrentLinkedQueue concurrentLinkedQueue = lj2Var.d;
        TimeZone timeZone2 = lv3.a;
        if (!jj2Var.j) {
            lj2Var.b.c(lj2Var.c, 0L);
            return null;
        }
        jj2Var.j = true;
        concurrentLinkedQueue.remove(jj2Var);
        if (concurrentLinkedQueue.isEmpty()) {
            hd3 hd3Var = lj2Var.b;
            synchronized (hd3Var.a) {
                if (hd3Var.a()) {
                    hd3Var.a.c(hd3Var);
                }
            }
        }
        return jj2Var.e;
    }
}
