package defpackage;

import top.th1nk.samp.feature.game.GameAudioPlayer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bv0 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ gv0 g;

    public /* synthetic */ bv0(int i, gv0 gv0Var) {
        this.f = i;
        this.g = gv0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        gv0 gv0Var = this.g;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                GameAudioPlayer.cleoSetStreamSpeedWithTransition$lambda$0$2(gv0Var, fFloatValue);
                break;
            default:
                GameAudioPlayer.cleoSetStreamVolumeWithTransition$lambda$0$2(gv0Var, fFloatValue);
                break;
        }
        return dm3Var;
    }
}
