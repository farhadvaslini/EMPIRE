package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ct1 implements hr, or3 {
    public final jr f;
    public final /* synthetic */ dt1 g;

    public ct1(dt1 dt1Var, jr jrVar) {
        this.g = dt1Var;
        this.f = jrVar;
    }

    @Override // defpackage.hr
    public final ai0 B(Object obj, ss0 ss0Var) {
        dt1 dt1Var = this.g;
        ir irVar = new ir(dt1Var, this);
        ai0 ai0VarJ = this.f.J((dm3) obj, irVar);
        if (ai0VarJ != null) {
            dt1.j.set(dt1Var, null);
        }
        return ai0VarJ;
    }

    @Override // defpackage.hr
    public final boolean C(Throwable th) {
        return this.f.C(th);
    }

    @Override // defpackage.hr
    public final void D(Object obj) throws vb0 {
        this.f.D(obj);
    }

    @Override // defpackage.or3
    public final void a(kt2 kt2Var, int i) {
        this.f.a(kt2Var, i);
    }

    @Override // defpackage.p40
    public final o50 i() {
        return this.f.j;
    }

    @Override // defpackage.p40
    public final void t(Object obj) {
        this.f.t(obj);
    }

    @Override // defpackage.hr
    public final void y(Object obj, ss0 ss0Var) throws vb0 {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = dt1.j;
        dt1 dt1Var = this.g;
        atomicReferenceFieldUpdater.set(dt1Var, null);
        xc1 xc1Var = new xc1(9, dt1Var, this);
        jr jrVar = this.f;
        jrVar.G(dm3.a, jrVar.h, new ir(0, xc1Var));
    }
}
