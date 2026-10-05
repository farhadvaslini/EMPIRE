package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qd0 implements ns0 {
    public final /* synthetic */ qk2 f;
    public final /* synthetic */ rd0 g;
    public final /* synthetic */ yl1 h;

    public qd0(qk2 qk2Var, rd0 rd0Var, yl1 yl1Var) {
        this.f = qk2Var;
        this.g = rd0Var;
        this.h = yl1Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        nk3 nk3Var = (nk3) obj;
        rd0 rd0Var = (rd0) nk3Var;
        if (!((s8) ((h7) vr.Y(this.g)).getDragAndDropManager()).b.contains(rd0Var) || !br.l(rd0Var, lr.I(this.h))) {
            return mk3.f;
        }
        this.f.f = nk3Var;
        return mk3.h;
    }
}
