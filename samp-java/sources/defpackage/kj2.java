package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kj2 extends ed3 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj2(lj2 lj2Var, String str) {
        super(str, true);
        this.f = lj2Var;
    }

    @Override // defpackage.ed3
    public final long a() {
        switch (this.e) {
            case 0:
                lj2 lj2Var = (lj2) this.f;
                long jNanoTime = System.nanoTime();
                long j = (jNanoTime - lj2Var.a) + 1;
                Iterator it = lj2Var.d.iterator();
                it.getClass();
                jj2 jj2Var = null;
                long j2 = Long.MAX_VALUE;
                int i = 0;
                jj2 jj2Var2 = null;
                jj2 jj2Var3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    jj2 jj2Var4 = (jj2) it.next();
                    jj2Var4.getClass();
                    synchronized (jj2Var4) {
                        if (lj2Var.a(jj2Var4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = jj2Var4.q;
                            if (j3 < j) {
                                j = j3;
                                jj2Var2 = jj2Var4;
                            }
                            i++;
                            if (j3 < j2) {
                                j2 = j3;
                                jj2Var3 = jj2Var4;
                            }
                        }
                    }
                }
                if (jj2Var2 != null) {
                    jj2Var = jj2Var2;
                } else if (i > 5) {
                    j = j2;
                    jj2Var = jj2Var3;
                } else {
                    j = -1;
                }
                if (jj2Var == null) {
                    if (jj2Var3 != null) {
                        return (j2 + lj2Var.a) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return lj2Var.a;
                    }
                    return -1L;
                }
                synchronized (jj2Var) {
                    if (jj2Var.p.isEmpty() && jj2Var.q == j) {
                        jj2Var.j = true;
                        lj2Var.d.remove(jj2Var);
                        lv3.c(jj2Var.e);
                        if (!lj2Var.d.isEmpty()) {
                            return 0L;
                        }
                        hd3 hd3Var = lj2Var.b;
                        synchronized (hd3Var.a) {
                            if (hd3Var.a()) {
                                hd3Var.a.c(hd3Var);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((cs0) this.f).a();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj2(String str, cs0 cs0Var) {
        super(str, true);
        this.f = cs0Var;
    }
}
