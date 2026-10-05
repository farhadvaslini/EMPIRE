package defpackage;

import top.th1nk.samp.feature.raksamp.RaksampNativeBridge;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qi2 extends ct0 implements ss0 {
    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        float fFloatValue3 = ((Number) obj3).floatValue();
        vi2 vi2Var = (vi2) this.g;
        vi2Var.getClass();
        RaksampNativeBridge.INSTANCE.setPlayerPosition(vi2Var.c, fFloatValue, fFloatValue2, fFloatValue3);
        return dm3.a;
    }
}
