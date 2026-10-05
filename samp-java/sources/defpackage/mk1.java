package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mk1 extends mb3 implements rs0 {
    public /* synthetic */ Object j;
    public final /* synthetic */ String k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk1(String str, long j, p40 p40Var) {
        super(2, p40Var);
        this.k = str;
        this.l = j;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((mk1) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        mk1 mk1Var = new mk1(this.k, this.l, p40Var);
        mk1Var.j = obj;
        return mk1Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        Object qn2Var;
        y02.Q(obj);
        String str = this.k;
        try {
            qn2Var = uq.G(new File(str), this.l);
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        Throwable thA = rn2.a(qn2Var);
        if (thA != null) {
            ti tiVar = ui.a;
            ui.c(ti.i, "LogViewerScreen", "Unable to load earlier log page", thA);
        }
        if (qn2Var instanceof qn2) {
            return null;
        }
        return qn2Var;
    }
}
