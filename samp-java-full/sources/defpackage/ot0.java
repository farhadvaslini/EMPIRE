package defpackage;

import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ot0 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ GameActivity g;

    public /* synthetic */ ot0(int i, GameActivity gameActivity) {
        this.f = i;
        this.g = gameActivity;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        boolean zNativeIsRpcFilterEnabled;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        GameActivity gameActivity = this.g;
        switch (i) {
            case 0:
                GameActivity.initializePluginRuntimeAndSamp$lambda$2(gameActivity, (String) obj);
                return dm3Var;
            case 1:
                GameActivity.initializePluginRuntimeAndSamp$lambda$13(gameActivity, (d82) obj);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                GameActivity.initializePluginRuntimeAndSamp$lambda$16(gameActivity, (String) obj);
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                int iIntValue = ((Integer) obj).intValue();
                lu0 lu0Var = GameActivity.Companion;
                try {
                    zNativeIsRpcFilterEnabled = gameActivity.nativeIsRpcFilterEnabled(iIntValue);
                    break;
                } catch (UnsatisfiedLinkError unused) {
                    zNativeIsRpcFilterEnabled = false;
                }
                return Boolean.valueOf(zNativeIsRpcFilterEnabled);
            default:
                return Boolean.valueOf(GameActivity.initializePluginRuntimeAndSamp$lambda$8(gameActivity, (String) obj));
        }
    }
}
