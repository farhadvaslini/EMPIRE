package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class vq3 {
    public final wq3 a = new wq3();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        wq3 wq3Var = this.a;
        if (wq3Var != null) {
            if (wq3Var.d) {
                wq3.a(autoCloseable);
                return;
            }
            synchronized (wq3Var.a) {
                autoCloseable2 = (AutoCloseable) wq3Var.b.put(str, autoCloseable);
            }
            wq3.a(autoCloseable2);
        }
    }

    public final void b() {
        wq3 wq3Var = this.a;
        if (wq3Var != null && !wq3Var.d) {
            wq3Var.d = true;
            synchronized (wq3Var.a) {
                try {
                    Iterator it = wq3Var.b.values().iterator();
                    while (it.hasNext()) {
                        wq3.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = wq3Var.c.iterator();
                    while (it2.hasNext()) {
                        wq3.a((AutoCloseable) it2.next());
                    }
                    wq3Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        wq3 wq3Var = this.a;
        if (wq3Var == null) {
            return null;
        }
        synchronized (wq3Var.a) {
            autoCloseable = (AutoCloseable) wq3Var.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
