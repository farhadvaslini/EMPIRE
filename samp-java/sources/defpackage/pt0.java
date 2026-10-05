package defpackage;

import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class pt0 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ GameActivity g;

    public /* synthetic */ pt0(int i, GameActivity gameActivity) {
        this.f = i;
        this.g = gameActivity;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        GameActivity gameActivity = this.g;
        switch (i) {
            case 0:
                return GameActivity.initializePluginRuntimeAndSamp$lambda$12(gameActivity);
            case 1:
                return GameActivity.initializePluginRuntimeAndSamp$lambda$7(gameActivity);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                GameActivity.initializePluginRuntimeAndSamp$lambda$9(gameActivity);
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return GameActivity.initializePluginRuntimeAndSamp$lambda$10(gameActivity);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return Long.valueOf(GameActivity.initializePluginRuntimeAndSamp$lambda$11(gameActivity));
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                GameActivity.showNativeDialog$lambda$9(gameActivity);
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                GameActivity.showNativeDialog$lambda$10(gameActivity);
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                lu0 lu0Var = GameActivity.Companion;
                return new nw(gameActivity);
            case 8:
                return GameActivity.launchClientVersionName_delegate$lambda$0(gameActivity);
            case vr.g /* 9 */:
                lu0 lu0Var2 = GameActivity.Companion;
                return Boolean.valueOf(gameActivity.getIntent().getBooleanExtra("native_keyboard_enabled", false));
            case vr.h /* 10 */:
                return GameActivity.launchLanguageTag_delegate$lambda$0(gameActivity);
            case 11:
                return Integer.valueOf(GameActivity.gameFontSize_delegate$lambda$0(gameActivity));
            case vr.i /* 12 */:
                lu0 lu0Var3 = GameActivity.Companion;
                return Boolean.valueOf(gameActivity.getIntent().getBooleanExtra("show_chat_timestamp", false));
            case 13:
                return Boolean.valueOf(GameActivity.radarAtBottomLeft_delegate$lambda$0(gameActivity));
            case 14:
                return GameActivity.launchNickname_delegate$lambda$0(gameActivity);
            case jo3.g /* 15 */:
                lu0 lu0Var4 = GameActivity.Companion;
                return new qy2(gameActivity);
            case 16:
                return GameActivity.launchClientVersion_delegate$lambda$0(gameActivity);
            case 17:
                return GameActivity.setupChatInputOverlay$lambda$2(gameActivity);
            case 18:
                return GameActivity.setupChatInputOverlay$lambda$3(gameActivity);
            default:
                GameActivity.s0(gameActivity);
                return dm3Var;
        }
    }
}
