package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class il0 implements bk0 {
    public final oj2 f;
    public final id3 g;
    public long h;
    public final CopyOnWriteArrayList i;
    public final LinkedBlockingDeque j;

    public il0(oj2 oj2Var, id3 id3Var) {
        id3Var.getClass();
        this.f = oj2Var;
        this.g = id3Var;
        this.h = Long.MIN_VALUE;
        this.i = new CopyOnWriteArrayList();
        this.j = new LinkedBlockingDeque();
    }

    public final void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            yo2 yo2Var = (yo2) it.next();
            yo2Var.cancel();
            yo2 yo2VarA = yo2Var.a();
            if (yo2VarA != null) {
                this.f.p.addLast(yo2VarA);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public final xo2 b() {
        yo2 fl0Var;
        oj2 oj2Var = this.f;
        if (oj2Var.a(null)) {
            try {
                fl0Var = oj2Var.b();
            } catch (Throwable th) {
                fl0Var = new fl0(th);
            }
            if (fl0Var.e()) {
                return new xo2(fl0Var, (Throwable) null, 6);
            }
            if (fl0Var instanceof fl0) {
                return ((fl0) fl0Var).a;
            }
            this.i.add(fl0Var);
            this.g.d().c(new hl0(lv3.b + " connect " + oj2Var.i.h.g(), fl0Var, this), 0L);
        }
        return null;
    }

    @Override // defpackage.bk0
    public final jj2 c() throws IOException {
        xo2 xo2VarB;
        long j;
        xo2 xo2Var;
        IOException iOException = null;
        while (true) {
            try {
                if (this.i.isEmpty() && !this.f.a(null)) {
                    break;
                }
                if (this.f.k.v) {
                    throw new IOException("Canceled");
                }
                k71 k71Var = this.g.a;
                long jNanoTime = System.nanoTime();
                long j2 = this.h - jNanoTime;
                if (this.i.isEmpty() || j2 <= 0) {
                    xo2VarB = b();
                    j = 250000000;
                    this.h = jNanoTime + 250000000;
                } else {
                    j = j2;
                    xo2VarB = null;
                }
                if (xo2VarB == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.i;
                    if (copyOnWriteArrayList.isEmpty() || (xo2Var = (xo2) this.j.poll(j, timeUnit)) == null) {
                        xo2VarB = null;
                    } else {
                        copyOnWriteArrayList.remove(xo2Var.a);
                        xo2VarB = xo2Var;
                    }
                    if (xo2VarB == null) {
                    }
                }
                boolean z = false;
                if (xo2VarB.b == null && xo2VarB.c == null) {
                    a();
                    if (!xo2VarB.a.e()) {
                        xo2VarB = xo2VarB.a.c();
                    }
                    if (xo2VarB.b == null && xo2VarB.c == null) {
                        z = true;
                    }
                    if (z) {
                        jj2 jj2VarD = xo2VarB.a.d();
                        a();
                        return jj2VarD;
                    }
                }
                Throwable th = xo2VarB.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        uq.j(iOException, th);
                    }
                    if (((IOException) th) instanceof rg0) {
                        break;
                    }
                }
                yo2 yo2Var = xo2VarB.b;
                if (yo2Var != null) {
                    this.f.p.addFirst(yo2Var);
                }
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
        a();
        iOException.getClass();
        throw iOException;
    }

    @Override // defpackage.bk0
    public final oj2 e() {
        return this.f;
    }
}
