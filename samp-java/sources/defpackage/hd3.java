package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.ed3 r12, long r13, boolean r15) {
        /*
            r11 = this;
            id3 r0 = r11.a
            java.util.logging.Logger r0 = r0.b
            r12.getClass()
            hd3 r1 = r12.c
            r2 = 0
            if (r1 != r11) goto Ld
            goto L11
        Ld:
            if (r1 != 0) goto L87
            r12.c = r11
        L11:
            long r3 = java.lang.System.nanoTime()
            long r5 = r3 + r13
            java.util.ArrayList r1 = r11.e
            int r7 = r1.indexOf(r12)
            r8 = -1
            if (r7 == r8) goto L37
            long r9 = r12.d
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 > 0) goto L34
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L86
            java.lang.String r13 = "already scheduled"
            defpackage.oz2.l(r0, r12, r11, r13)
            return r2
        L34:
            r1.remove(r7)
        L37:
            r12.d = r5
            java.util.logging.Level r7 = java.util.logging.Level.FINE
            boolean r7 = r0.isLoggable(r7)
            if (r7 == 0) goto L5d
            if (r15 == 0) goto L4f
            long r5 = r5 - r3
            java.lang.String r15 = defpackage.oz2.q(r5)
            java.lang.String r5 = "run again after "
            java.lang.String r15 = r5.concat(r15)
            goto L5a
        L4f:
            long r5 = r5 - r3
            java.lang.String r15 = defpackage.oz2.q(r5)
            java.lang.String r5 = "scheduled after "
            java.lang.String r15 = r5.concat(r15)
        L5a:
            defpackage.oz2.l(r0, r12, r11, r15)
        L5d:
            int r11 = r1.size()
            r15 = r2
            r0 = r15
        L63:
            if (r0 >= r11) goto L78
            java.lang.Object r5 = r1.get(r0)
            int r0 = r0 + 1
            ed3 r5 = (defpackage.ed3) r5
            long r5 = r5.d
            long r5 = r5 - r3
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 <= 0) goto L75
            goto L79
        L75:
            int r15 = r15 + 1
            goto L63
        L78:
            r15 = r8
        L79:
            if (r15 != r8) goto L7f
            int r15 = r1.size()
        L7f:
            r1.add(r15, r12)
            if (r15 != 0) goto L86
            r11 = 1
            return r11
        L86:
            return r2
        L87:
            java.lang.String r11 = "task is in multiple queues"
            defpackage.c.q(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd3.d(ed3, long, boolean):boolean");
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
