package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l9 extends ct0 implements ns0 {
    public final /* synthetic */ te1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(te1 te1Var) {
        super(1, r51.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.m = te1Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        float[] fArr = ((wm1) obj).a;
        ab1 ab1Var = (ab1) this.m.w.getValue();
        if (ab1Var != null) {
            if (!ab1Var.t0()) {
                ab1Var = null;
            }
            if (ab1Var != null) {
                ab1Var.Y(fArr);
            }
        }
        return dm3.a;
    }
}
