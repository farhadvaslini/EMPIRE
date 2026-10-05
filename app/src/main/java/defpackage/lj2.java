package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lj2 {
    public final long a;
    public final hd3 b;
    public final kj2 c;
    public final ConcurrentLinkedQueue d;

    public lj2(id3 id3Var) {
        id3Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.a = 300000000000L;
        this.b = id3Var.d();
        this.c = new kj2(this, nc2.j(new StringBuilder(), lv3.b, " ConnectionPool connection closer"));
        this.d = new ConcurrentLinkedQueue();
    }

    public final int a(jj2 jj2Var, long j) {
        TimeZone timeZone = lv3.a;
        ArrayList arrayList = jj2Var.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + jj2Var.c.a.h + " was leaked. Did you forget to close a response body?";
                m62 m62Var = m62.a;
                m62.a.k(((gj2) reference).a, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    jj2Var.q = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
