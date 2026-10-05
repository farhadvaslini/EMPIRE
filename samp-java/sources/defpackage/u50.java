package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class u50 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(u50.class, "workerCtl$volatile");
    public final ou3 f;
    public final qk2 g;
    public v50 h;
    public long i;
    private volatile int indexInArray;
    public long j;
    public int k;
    public boolean l;
    public final /* synthetic */ w50 m;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public u50(w50 w50Var, int i) {
        this.m = w50Var;
        setDaemon(true);
        setContextClassLoader(w50.class.getClassLoader());
        this.f = new ou3();
        this.g = new qk2();
        this.h = v50.i;
        this.nextParkedWorker = w50.p;
        int iNanoTime = (int) System.nanoTime();
        this.k = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final fd3 a(boolean z) {
        fd3 fd3VarE;
        fd3 fd3VarE2;
        long j;
        v50 v50Var = this.h;
        w50 w50Var = this.m;
        ou3 ou3Var = this.f;
        v50 v50Var2 = v50.f;
        if (v50Var != v50Var2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = w50.n;
            do {
                j = atomicLongFieldUpdater.get(w50Var);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    fd3 fd3VarG = ou3Var.g();
                    return (fd3VarG == null && (fd3VarG = (fd3) w50Var.k.d()) == null) ? i(1) : fd3VarG;
                }
            } while (!w50.n.compareAndSet(w50Var, j, j - 4398046511104L));
            this.h = v50Var2;
        }
        if (z) {
            boolean z2 = d(w50Var.f * 2) == 0;
            if (z2 && (fd3VarE2 = e()) != null) {
                return fd3VarE2;
            }
            fd3 fd3VarE3 = ou3Var.e();
            if (fd3VarE3 != null) {
                return fd3VarE3;
            }
            if (!z2 && (fd3VarE = e()) != null) {
                return fd3VarE;
            }
        } else {
            fd3 fd3VarE4 = e();
            if (fd3VarE4 != null) {
                return fd3VarE4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.k;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.k = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final fd3 e() {
        int iD = d(2);
        w50 w50Var = this.m;
        ew0 ew0Var = w50Var.k;
        ew0 ew0Var2 = w50Var.j;
        if (iD == 0) {
            fd3 fd3Var = (fd3) ew0Var2.d();
            return fd3Var != null ? fd3Var : (fd3) ew0Var.d();
        }
        fd3 fd3Var2 = (fd3) ew0Var.d();
        return fd3Var2 != null ? fd3Var2 : (fd3) ew0Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.m.i);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(v50 v50Var) {
        v50 v50Var2 = this.h;
        boolean z = v50Var2 == v50.f;
        if (z) {
            w50.n.addAndGet(this.m, 4398046511104L);
        }
        if (v50Var2 != v50Var) {
            this.h = v50Var;
        }
        return z;
    }

    public final fd3 i(int i) {
        fd3 fd3VarH;
        long jI;
        AtomicLongFieldUpdater atomicLongFieldUpdater = w50.n;
        w50 w50Var = this.m;
        int i2 = (int) (atomicLongFieldUpdater.get(w50Var) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            u50 u50Var = (u50) w50Var.l.b(iD);
            if (u50Var != null && u50Var != this) {
                ou3 ou3Var = u50Var.f;
                ou3Var.getClass();
                if (i == 3) {
                    fd3VarH = ou3Var.f();
                } else {
                    boolean z = i == 1;
                    int i4 = ou3.d.get(ou3Var);
                    int i5 = ou3.c.get(ou3Var);
                    while (i4 != i5 && (!z || ou3.e.get(ou3Var) != 0)) {
                        int i6 = i4 + 1;
                        fd3VarH = ou3Var.h(i4, z);
                        if (fd3VarH != null) {
                            break;
                        }
                        i4 = i6;
                    }
                    fd3VarH = null;
                }
                qk2 qk2Var = this.g;
                if (fd3VarH != null) {
                    qk2Var.f = fd3VarH;
                    jI = -1;
                } else {
                    jI = ou3Var.i(i, qk2Var);
                }
                if (jI == -1) {
                    fd3 fd3Var = (fd3) qk2Var.f;
                    qk2Var.f = null;
                    return fd3Var;
                }
                if (jI > 0) {
                    jMin = Math.min(jMin, jI);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.j = jMin;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u50.run():void");
    }
}
