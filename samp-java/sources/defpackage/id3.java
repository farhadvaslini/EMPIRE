package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class id3 {
    public static final Logger k;
    public static final id3 l;
    public final k71 a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final e7 j;

    static {
        Logger logger = Logger.getLogger(id3.class.getName());
        logger.getClass();
        k = logger;
        l = new id3(new k71(new kv3(nc2.j(new StringBuilder(), lv3.b, " TaskRunner"), true)));
    }

    public id3(k71 k71Var) {
        Logger logger = k;
        logger.getClass();
        this.a = k71Var;
        this.b = logger;
        this.c = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new e7(5, this);
    }

    public static final void a(id3 id3Var, ed3 ed3Var, long j, boolean z) {
        TimeZone timeZone = lv3.a;
        hd3 hd3Var = ed3Var.c;
        hd3Var.getClass();
        if (hd3Var.d != ed3Var) {
            c.q("Check failed.");
            return;
        }
        boolean z2 = hd3Var.f;
        hd3Var.f = false;
        hd3Var.d = null;
        id3Var.h.remove(hd3Var);
        if (j != -1 && !z2 && !hd3Var.c) {
            hd3Var.d(ed3Var, j, true);
        }
        if (hd3Var.e.isEmpty()) {
            return;
        }
        id3Var.i.add(hd3Var);
        if (z) {
            return;
        }
        id3Var.e();
    }

    public final ed3 b() {
        long j;
        ed3 ed3Var;
        boolean z;
        TimeZone timeZone = lv3.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = Long.MAX_VALUE;
            int i = 0;
            ed3 ed3Var2 = null;
            while (true) {
                if (i >= size) {
                    j = jNanoTime;
                    ed3Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                ed3 ed3Var3 = (ed3) ((hd3) obj).e.get(0);
                j = jNanoTime;
                ed3Var = null;
                long jMax = Math.max(0L, ed3Var3.d - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (ed3Var2 != null) {
                        z = true;
                        break;
                    }
                    ed3Var2 = ed3Var3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.h;
            if (ed3Var2 != null) {
                TimeZone timeZone2 = lv3.a;
                ed3Var2.d = -1L;
                hd3 hd3Var = ed3Var2.c;
                hd3Var.getClass();
                hd3Var.e.remove(ed3Var2);
                arrayList.remove(hd3Var);
                hd3Var.d = ed3Var2;
                arrayList2.add(hd3Var);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return ed3Var2;
            }
            if (this.d) {
                if (jMin >= this.e - j) {
                    return ed3Var;
                }
                notify();
                return ed3Var;
            }
            this.d = true;
            this.e = j + jMin;
            try {
                try {
                    TimeZone timeZone3 = lv3.a;
                    if (jMin > 0) {
                        long j2 = jMin / 1000000;
                        long j3 = jMin - (1000000 * j2);
                        if (j2 > 0 || jMin > 0) {
                            wait(j2, (int) j3);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = lv3.a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((hd3) arrayList2.get(size2)).a();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        hd3 hd3Var2 = (hd3) arrayList.get(size3);
                        hd3Var2.a();
                        if (hd3Var2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.d = false;
            }
        }
    }

    public final void c(hd3 hd3Var) {
        hd3Var.getClass();
        TimeZone timeZone = lv3.a;
        if (hd3Var.d == null) {
            boolean zIsEmpty = hd3Var.e.isEmpty();
            ArrayList arrayList = this.i;
            if (zIsEmpty) {
                arrayList.remove(hd3Var);
            } else {
                byte[] bArr = jv3.a;
                arrayList.getClass();
                if (!arrayList.contains(hd3Var)) {
                    arrayList.add(hd3Var);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final hd3 d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new hd3(this, by1.e(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = lv3.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        e7 e7Var = this.j;
        e7Var.getClass();
        ((ThreadPoolExecutor) this.a.g).execute(e7Var);
    }
}
