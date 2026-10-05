package defpackage;

import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ft0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ GameActivity g;

    public /* synthetic */ ft0(int i, GameActivity gameActivity) {
        this.f = i;
        this.g = gameActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        GameActivity gameActivity = this.g;
        switch (i) {
            case 0:
                GameActivity.hideEditObject$lambda$0(gameActivity);
                break;
            case 1:
                GameActivity.W(gameActivity);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                GameActivity.c0(gameActivity);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                GameActivity.T(gameActivity);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                GameActivity.startDisconnectWatcher$lambda$0(gameActivity);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                GameActivity.showTab$lambda$0(gameActivity);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                GameActivity.showWithoutReset$lambda$0(gameActivity);
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                GameActivity.C(gameActivity);
                break;
            case 8:
                GameActivity.hideWithoutReset$lambda$0(gameActivity);
                break;
            case vr.g /* 9 */:
                GameActivity.O0(gameActivity);
                break;
            case vr.h /* 10 */:
                GameActivity.hideTab$lambda$0(gameActivity);
                break;
            case 11:
                GameActivity.exitGame$lambda$0(gameActivity);
                break;
            case vr.i /* 12 */:
                GameActivity.n0(gameActivity);
                break;
            case 13:
                GameActivity.S0(gameActivity);
                break;
            case 14:
                GameActivity.I(gameActivity);
                break;
            case jo3.g /* 15 */:
                GameActivity.showCleoMenuArrow$lambda$0(gameActivity);
                break;
            case 16:
                GameActivity.clearNativeTextDraws$lambda$0(gameActivity);
                break;
            case 17:
                GameActivity.clearTab$lambda$0(gameActivity);
                break;
            case 18:
                GameActivity.scheduleCleoMenuStartupHint$lambda$0(gameActivity);
                break;
            default:
                GameActivity.y(gameActivity);
                break;
        }
    }
}
