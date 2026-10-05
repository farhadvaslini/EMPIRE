package defpackage;

import android.os.SystemClock;
import top.th1nk.samp.feature.game.GameAudioPlayer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ gv0 g;
    public final /* synthetic */ cs0 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ int j;
    public final /* synthetic */ ns0 k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;

    public hv0(int i, gv0 gv0Var, cs0 cs0Var, long j, int i2, ns0 ns0Var, float f, float f2) {
        this.f = i;
        this.g = gv0Var;
        this.h = cs0Var;
        this.i = j;
        this.j = i2;
        this.k = ns0Var;
        this.l = f;
        this.m = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (GameAudioPlayer.cleoStreams.get(Integer.valueOf(this.f)) == this.g && ((Boolean) this.h.a()).booleanValue()) {
            float fG = y02.g((SystemClock.uptimeMillis() - this.i) / this.j, 0.0f, 1.0f);
            float f = this.m;
            float f2 = this.l;
            this.k.h(Float.valueOf(((f - f2) * fG) + f2));
            if (fG < 1.0f) {
                GameAudioPlayer.mainHandler.postDelayed(this, 16L);
            }
        }
    }
}
