package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pd0 implements ns0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ mk2 g;

    public /* synthetic */ pd0(yl1 yl1Var, rd0 rd0Var, mk2 mk2Var) {
        this.g = mk2Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        mk3 mk3Var = mk3.f;
        mk2 mk2Var = this.g;
        switch (i) {
            case 0:
                rd0 rd0Var = (rd0) obj;
                if (!rd0Var.s) {
                    return mk3.g;
                }
                if (rd0Var.u != null) {
                    m21.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                rd0Var.u = null;
                mk2Var.f = mk2Var.f;
                return mk3Var;
            default:
                if (!((yy0) obj).v) {
                    return mk3Var;
                }
                mk2Var.f = false;
                return mk3.h;
        }
    }
}
