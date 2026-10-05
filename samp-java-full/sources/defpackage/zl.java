package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zl implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ tg3 g;
    public final /* synthetic */ ns0 h;

    public /* synthetic */ zl(tg3 tg3Var, ns0 ns0Var, int i) {
        this.f = i;
        this.g = tg3Var;
        this.h = ns0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        ns0 ns0Var = this.h;
        tg3 tg3Var = this.g;
        switch (i) {
            case 0:
                pg3 pg3Var = (pg3) obj;
                if (tg3Var != null) {
                    tg3Var.a.setValue(pg3Var);
                }
                if (ns0Var != null) {
                    ns0Var.h(pg3Var);
                }
                return dm3.a;
            default:
                tg3Var.c.add(ns0Var);
                return new zk(8, tg3Var, ns0Var);
        }
    }
}
