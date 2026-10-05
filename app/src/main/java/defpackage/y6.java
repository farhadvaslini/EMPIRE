package defpackage;

import android.os.Build;
import top.th1nk.samp.feature.game.GameAudioPlayer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int f;

    public /* synthetic */ y6(xh xhVar, int i) {
        this.f = 4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                as1 as1Var = h7.Q0;
                synchronized (as1Var) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        Object[] objArr = as1Var.a;
                        int i2 = as1Var.b;
                        int i3 = 0;
                        if (i < 30) {
                            while (i3 < i2) {
                                h7 h7Var = (h7) objArr[i3];
                                boolean showLayoutBounds = h7Var.getShowLayoutBounds();
                                Class cls = h7.N0;
                                h7Var.setShowLayoutBounds(vm1.y());
                                if (showLayoutBounds != h7Var.getShowLayoutBounds()) {
                                    h7Var.post(new x6(h7Var, 2));
                                }
                                i3++;
                            }
                        } else {
                            while (i3 < i2) {
                                h7 h7Var2 = (h7) objArr[i3];
                                h7Var2.post(new x6(h7Var2, 3));
                                i3++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                GameAudioPlayer.resume$lambda$0();
                return;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                GameAudioPlayer.pause$lambda$0();
                return;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                GameAudioPlayer.stop$lambda$0();
                return;
            default:
                return;
        }
    }

    public /* synthetic */ y6(int i) {
        this.f = i;
    }

    private final void a() {
    }
}
