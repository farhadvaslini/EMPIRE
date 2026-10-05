package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dc2 {
    public final String a;
    public final ns0 b;
    public final x50 c;
    public final Object d = new Object();
    public volatile ih2 e;

    public dc2(String str, ns0 ns0Var, x50 x50Var) {
        this.a = str;
        this.b = ns0Var;
        this.c = x50Var;
    }

    public final ih2 a(Context context, a71 a71Var) {
        ih2 ih2Var;
        a71Var.getClass();
        ih2 ih2Var2 = this.e;
        if (ih2Var2 != null) {
            return ih2Var2;
        }
        synchronized (this.d) {
            try {
                if (this.e == null) {
                    Context applicationContext = context.getApplicationContext();
                    ns0 ns0Var = this.b;
                    applicationContext.getClass();
                    List list = (List) ns0Var.h(applicationContext);
                    x50 x50Var = this.c;
                    int i = 7;
                    me1 me1Var = new me1(i, applicationContext, this);
                    list.getClass();
                    this.e = new ih2(new ih2(new b80(new ql0(new it1(i, me1Var)), vr.K(new j(list, null, 18)), new h01(12), x50Var)));
                }
                ih2Var = this.e;
                ih2Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return ih2Var;
    }
}
