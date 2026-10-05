package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hd3 {
    public final id3 a;
    public final String b;
    public boolean c;
    public ed3 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public hd3(id3 id3Var, String str) {
        this.a = id3Var;
        this.b = str;
    }

    public static void b(hd3 hd3Var, String str, cs0 cs0Var) {
        hd3Var.getClass();
        str.getClass();
        cs0Var.getClass();
        hd3Var.c(new kj2(str, cs0Var), 0L);
    }

    public final boolean a() {
        ed3 ed3Var = this.d;
        if (ed3Var != null && ed3Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((ed3) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                ed3 ed3Var2 = (ed3) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    oz2.l(logger, ed3Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(ed3 ed3Var, long j) {
        ed3Var.getClass();
        synchronized (this.a) {
            if (!this.c) {
                if (d(ed3Var, j, false)) {
                    this.a.c(this);
                }
                return;
            }
            boolean z = ed3Var.b;
            Logger logger = this.a.b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    oz2.l(logger, ed3Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    oz2.l(logger, ed3Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(ed3 ed3Var, long j, boolean z) {
        int size;
        int size2;
        int i;
        Logger logger = this.a.b;
        ed3Var.getClass();
        hd3 hd3Var = ed3Var.c;
        if (hd3Var != this) {
            if (hd3Var != null) {
                c.q("task is in multiple queues");
                return false;
            }
            ed3Var.c = this;
        }
        long jNanoTime = System.nanoTime();
        long j2 = jNanoTime + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(ed3Var);
        if (iIndexOf == -1) {
            ed3Var.d = j2;
            if (logger.isLoggable(Level.FINE)) {
                oz2.l(logger, ed3Var, this, z ? "run again after ".concat(oz2.q(j2 - jNanoTime)) : "scheduled after ".concat(oz2.q(j2 - jNanoTime)));
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                    size2 = -1;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                if (((ed3) obj).d - jNanoTime > j) {
                    break;
                }
                size2++;
            }
            if (size2 == -1) {
                size2 = arrayList.size();
            }
            arrayList.add(size2, ed3Var);
            if (size2 != 0) {
                return true;
            }
        } else if (ed3Var.d > j2) {
            arrayList.remove(iIndexOf);
            ed3Var.d = j2;
            if (logger.isLoggable(Level.FINE)) {
            }
            size = arrayList.size();
            size2 = 0;
            i = 0;
            while (true) {
                if (i < size) {
                }
                size2++;
            }
            if (size2 == -1) {
            }
            arrayList.add(size2, ed3Var);
            if (size2 != 0) {
            }
        } else if (logger.isLoggable(Level.FINE)) {
            oz2.l(logger, ed3Var, this, "already scheduled");
            return false;
        }
        return false;
    }

    public final void e() {
        id3 id3Var = this.a;
        TimeZone timeZone = lv3.a;
        synchronized (id3Var) {
            this.c = true;
            if (a()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
