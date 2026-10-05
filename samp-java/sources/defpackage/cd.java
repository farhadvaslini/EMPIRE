package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cd extends mb3 implements ns0 {
    public pe j;
    public mk2 k;
    public int l;
    public final /* synthetic */ ed m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ dd3 o;
    public final /* synthetic */ long p;
    public final /* synthetic */ ns0 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(ed edVar, Object obj, dd3 dd3Var, long j, ns0 ns0Var, p40 p40Var) {
        super(1, p40Var);
        this.m = edVar;
        this.n = obj;
        this.o = dd3Var;
        this.p = j;
        this.q = ns0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        long j = this.p;
        ns0 ns0Var = this.q;
        return new cd(this.m, this.n, this.o, j, ns0Var, (p40) obj).o(dm3.a);
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        ed edVar;
        pe peVar;
        mk2 mk2Var;
        long j;
        bd bdVar;
        pe peVar2;
        mk2 mk2Var2;
        CancellationException cancellationException;
        dd3 dd3Var = this.o;
        int i = this.l;
        ed edVar2 = this.m;
        if (i == 0) {
            y02.Q(obj);
            try {
                edVar2.c.h = (ue) edVar2.a.a.h(this.n);
                edVar2.e.setValue(dd3Var.c);
                edVar2.d.setValue(Boolean.TRUE);
                pe peVar3 = edVar2.c;
                peVar = new pe(peVar3.f, peVar3.g.getValue(), gv3.y(peVar3.h), peVar3.i, Long.MIN_VALUE, peVar3.k);
                mk2Var = new mk2();
                j = this.p;
                bdVar = new bd(edVar2, peVar, this.q, mk2Var, 0);
                edVar = edVar2;
            } catch (CancellationException e) {
                e = e;
                edVar = edVar2;
                cancellationException = e;
                ed.b(edVar);
                throw cancellationException;
            }
            try {
                this.j = peVar;
                this.k = mk2Var;
                this.l = 1;
                Object objL = t22.l(peVar, dd3Var, j, bdVar, this);
                y50 y50Var = y50.f;
                if (objL == y50Var) {
                    return y50Var;
                }
                peVar2 = peVar;
                mk2Var2 = mk2Var;
            } catch (CancellationException e2) {
                e = e2;
                cancellationException = e;
                ed.b(edVar);
                throw cancellationException;
            }
        } else {
            if (i != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mk2Var2 = this.k;
            peVar2 = this.j;
            try {
                y02.Q(obj);
                edVar = edVar2;
            } catch (CancellationException e3) {
                cancellationException = e3;
                edVar = edVar2;
                ed.b(edVar);
                throw cancellationException;
            }
        }
        ke keVar = mk2Var2.f ? ke.f : ke.g;
        ed.b(edVar);
        return new me(peVar2, keVar);
    }
}
