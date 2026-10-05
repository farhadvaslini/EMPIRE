package defpackage;

import top.th1nk.samp.feature.game.GameAudioPlayer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tu0 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ gv0 h;

    public /* synthetic */ tu0(int i, gv0 gv0Var, int i2) {
        this.f = i2;
        this.g = i;
        this.h = gv0Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        gv0 gv0Var = this.h;
        int i2 = this.g;
        switch (i) {
            case 0:
                GameAudioPlayer gameAudioPlayer = GameAudioPlayer.INSTANCE;
                return Boolean.valueOf(i2 == gv0Var.m);
            default:
                GameAudioPlayer gameAudioPlayer2 = GameAudioPlayer.INSTANCE;
                return Boolean.valueOf(i2 == gv0Var.l);
        }
    }
}
