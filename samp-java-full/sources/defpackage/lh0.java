package defpackage;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.List;
import top.th1nk.samp.feature.game.GameAudioPlayer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lh0 implements Runnable {
    public final /* synthetic */ int f = 1;
    public final int g;
    public final Object h;

    public lh0(List list, int i, Throwable th) {
        jo3.h(list, "initCallbacks cannot be null");
        this.h = new ArrayList(list);
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.f) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = arrayList.size();
                if (this.g == 1) {
                    while (i < size) {
                        ((kh0) arrayList.get(i)).b();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((kh0) arrayList.get(i)).a();
                        i++;
                    }
                }
                break;
            default:
                Object obj = GameAudioPlayer.cleoStreams.get(Integer.valueOf(this.g));
                gv0 gv0Var = (gv0) this.h;
                if (obj == gv0Var && gv0Var.b) {
                    try {
                        gv0 gv0Var2 = (gv0) this.h;
                        MediaPlayer mediaPlayer = gv0Var2.n;
                        if (gv0Var2.a == 1 && mediaPlayer != null && mediaPlayer.isPlaying()) {
                            ((gv0) this.h).d = y02.h(mediaPlayer.getCurrentPosition(), 0, ((gv0) this.h).c);
                        }
                        break;
                    } catch (Exception unused) {
                    }
                    GameAudioPlayer.mainHandler.postDelayed(this, 50L);
                    break;
                }
                break;
        }
    }

    public lh0(int i, gv0 gv0Var) {
        this.g = i;
        this.h = gv0Var;
    }
}
