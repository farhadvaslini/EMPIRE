package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class x30 extends mb3 implements rs0 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ y30 l;
    public final /* synthetic */ um3 m;
    public final /* synthetic */ zo n;
    public final /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(y30 y30Var, um3 um3Var, zo zoVar, long j, p40 p40Var) {
        super(2, p40Var);
        this.l = y30Var;
        this.m = um3Var;
        this.n = zoVar;
        this.o = j;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((x30) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        x30 x30Var = new x30(this.l, this.m, this.n, this.o, p40Var);
        x30Var.k = obj;
        return x30Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        y30 y30Var = this.l;
        po poVar = y30Var.y;
        int i = this.j;
        try {
            try {
                if (i == 0) {
                    y02.Q(obj);
                    j61 j61VarG = lq.G(((x50) this.k).h());
                    y30Var.B = true;
                    ws2 ws2Var = y30Var.u;
                    ts1 ts1Var = ts1.f;
                    w30 w30Var = new w30(this.m, y30Var, this.n, this.o, j61VarG, null);
                    this.j = 1;
                    Object objG = ws2Var.g(ts1Var, w30Var, this);
                    y50 y50Var = y50.f;
                    if (objG == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                poVar.b();
                y30Var.B = false;
                poVar.a(null);
                y30Var.z = false;
                return dm3.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            y30Var.B = false;
            poVar.a(null);
            y30Var.z = false;
            throw th;
        }
    }
}
