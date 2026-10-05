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
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ln2 h() {
        /*
            r22 = this;
            r1 = r22
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            my1 r0 = r1.f
            java.util.List r0 = r0.b
            defpackage.vx.f0(r2, r0)
            wq r0 = new wq
            r3 = 4
            r0.<init>(r3)
            r2.add(r0)
            wq r0 = new wq
            r3 = 2
            r0.<init>(r3)
            r2.add(r0)
            wq r0 = new wq
            r3 = 3
            r0.<init>(r3)
            r2.add(r0)
            wq r0 = defpackage.wq.c
            r2.add(r0)
            my1 r0 = r1.f
            java.util.List r0 = r0.c
            defpackage.vx.f0(r2, r0)
            wq r0 = defpackage.wq.b
            r2.add(r0)
            mj2 r0 = new mj2
            ll2 r5 = r1.g
            my1 r3 = r1.f
            r5.getClass()
            r3.getClass()
            int r6 = r3.v
            int r7 = r3.w
            int r8 = r3.x
            f5 r9 = r3.g
            fs r10 = r3.t
            yl1 r11 = r3.C
            f5 r12 = r3.j
            xc0 r13 = r3.k
            javax.net.ssl.HostnameVerifier r14 = r3.s
            f5 r15 = r3.m
            java.net.ProxySelector r4 = r3.l
            r16 = r0
            boolean r0 = r3.e
            r17 = r0
            javax.net.SocketFactory r0 = r3.n
            r18 = r0
            javax.net.ssl.SSLSocketFactory r0 = r3.o
            r19 = r0
            javax.net.ssl.X509TrustManager r0 = r3.p
            pq r3 = r3.u
            r21 = r3
            r3 = 0
            r20 = r0
            r0 = r16
            r16 = r4
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = 0
            r3 = 0
            ll2 r4 = r1.g     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            ln2 r0 = r0.b(r4)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            boolean r4 = r1.v     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            if (r4 != 0) goto L8b
            r1.j(r2)
            return r0
        L8b:
            defpackage.jv3.a(r0)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            java.lang.String r4 = "Canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
            throw r0     // Catch: java.lang.Throwable -> L96 java.io.IOException -> L98
        L96:
            r0 = move-exception
            goto La2
        L98:
            r0 = move-exception
            r3 = 1
            java.io.IOException r0 = r1.j(r0)     // Catch: java.lang.Throwable -> L96
            r0.getClass()     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        La2:
            if (r3 != 0) goto La7
            r1.j(r2)
        La7:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij2.h():ln2");
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
