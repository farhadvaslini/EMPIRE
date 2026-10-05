package defpackage;

import top.th1nk.samp.feature.game.GameAudioPlayer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class av0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ gv0 h;
    public final /* synthetic */ float i;

    public /* synthetic */ av0(int i, gv0 gv0Var, int i2, float f) {
        this.f = i2;
        this.g = i;
        this.h = gv0Var;
        this.i = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        float f = this.i;
        gv0 gv0Var = this.h;
        int i2 = this.g;
        switch (i) {
            case 0:
                GameAudioPlayer.cleoSetStreamVolume$lambda$0(i2, gv0Var, f);
                break;
            case 1:
                GameAudioPlayer.cleoSetStreamProgressSeconds$lambda$0(i2, gv0Var, f);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                GameAudioPlayer.cleoSetStreamProgress$lambda$0(i2, gv0Var, f);
                break;
            default:
                GameAudioPlayer.cleoSetStreamSpeed$lambda$0(i2, gv0Var, f);
                break;
        }
    }
}
