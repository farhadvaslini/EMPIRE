package defpackage;

import top.th1nk.samp.feature.game.GameAudioPlayer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class cv0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ gv0 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ float j;

    public /* synthetic */ cv0(int i, gv0 gv0Var, int i2, float f, int i3) {
        this.f = i3;
        this.g = i;
        this.h = gv0Var;
        this.i = i2;
        this.j = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        float f = this.j;
        int i2 = this.i;
        gv0 gv0Var = this.h;
        int i3 = this.g;
        switch (i) {
            case 0:
                GameAudioPlayer.cleoSetStreamVolumeWithTransition$lambda$0(i3, gv0Var, i2, f);
                break;
            default:
                GameAudioPlayer.cleoSetStreamSpeedWithTransition$lambda$0(i3, gv0Var, i2, f);
                break;
        }
    }
}
