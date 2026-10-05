package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ih0 extends vr {
    public final /* synthetic */ jh0 l;

    public ih0(jh0 jh0Var) {
        this.l = jh0Var;
    }

    @Override // defpackage.vr
    public final void O(Throwable th) {
        this.l.a.f(th);
    }

    @Override // defpackage.vr
    public final void P(pl plVar) {
        jh0 jh0Var = this.l;
        jh0Var.c = plVar;
        pl plVar2 = jh0Var.c;
        nh0 nh0Var = jh0Var.a;
        jh0Var.b = new pi(plVar2, nh0Var.g, nh0Var.i, Build.VERSION.SDK_INT >= 34 ? th0.a() : vp.F());
        nh0 nh0Var2 = jh0Var.a;
        ArrayList arrayList = new ArrayList();
        nh0Var2.a.writeLock().lock();
        try {
            nh0Var2.c = 1;
            arrayList.addAll(nh0Var2.b);
            nh0Var2.b.clear();
            nh0Var2.a.writeLock().unlock();
            nh0Var2.d.post(new lh0(arrayList, nh0Var2.c, null));
        } catch (Throwable th) {
            nh0Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
