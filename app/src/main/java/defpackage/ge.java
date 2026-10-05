package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ge extends u71 implements ss0 {
    public final /* synthetic */ ns0 g;
    public final /* synthetic */ gk3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(ns0 ns0Var, gk3 gk3Var) {
        super(3);
        this.g = ns0Var;
        this.h = gk3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // defpackage.ss0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, Object obj2, Object obj3) {
        long j;
        en1 en1Var = (en1) obj;
        i62 i62VarT = ((xm1) obj2).t(((m30) obj3).a);
        if (en1Var.M()) {
            if (((Boolean) this.g.h(this.h.d.getValue())).booleanValue()) {
                j = (((long) i62VarT.f) << 32) | (((long) i62VarT.g) & 4294967295L);
            } else {
                j = 0;
            }
        }
        return en1Var.I0((int) (j >> 32), (int) (4294967295L & j), oi0.f, new fe(i62VarT, 0));
    }
}
