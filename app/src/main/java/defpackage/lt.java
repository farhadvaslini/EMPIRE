package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lt extends m61 {
    public final jr m;

    public lt(jr jrVar) {
        this.m = jrVar;
    }

    @Override // defpackage.m61
    public final boolean r() {
        return true;
    }

    @Override // defpackage.m61
    public final void s(Throwable th) {
        q61 q61VarQ = q();
        jr jrVar = this.m;
        Throwable thO = jrVar.o(q61VarQ);
        if (!jrVar.x() ? false : ((wb0) jrVar.i).n(thO)) {
            return;
        }
        jrVar.C(thO);
        if (jrVar.x()) {
            return;
        }
        jrVar.m();
    }
}
