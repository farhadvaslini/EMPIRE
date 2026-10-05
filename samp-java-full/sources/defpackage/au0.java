package defpackage;

import java.util.function.IntConsumer;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class au0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ int h;

    public /* synthetic */ au0(int i, GameActivity gameActivity) {
        this.f = 0;
        this.h = i;
        this.g = gameActivity;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f;
        int i2 = this.h;
        Object obj = this.g;
        switch (i) {
            case 0:
                GameActivity.setCleoMenuActiveIndex$lambda$0(i2, (GameActivity) obj);
                break;
            case 1:
                GameActivity.hideNativeTextDraw$lambda$0((GameActivity) obj, i2);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                GameActivity.j0(i2, (GameActivity) obj);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                GameActivity.vibrateCleo$lambda$0((GameActivity) obj, i2);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                GameActivity.hideCleoDialogIfId$lambda$0((GameActivity) obj, i2);
                break;
            default:
                ((IntConsumer) obj).accept(i2);
                break;
        }
    }

    public /* synthetic */ au0(int i, int i2, Object obj) {
        this.f = i2;
        this.g = obj;
        this.h = i;
    }
}
