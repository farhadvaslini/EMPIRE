package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class r6 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ h7 g;

    public /* synthetic */ r6(h7 h7Var, int i) {
        this.f = i;
        this.g = h7Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        h7 h7Var = this.g;
        switch (i) {
            case 0:
                return new ma(h7Var, h7Var.getTextInputService(), (x50) obj);
            case 1:
                cs0 cs0Var = (cs0) obj;
                Handler handler = h7Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    cs0Var.a();
                } else {
                    Handler handler2 = h7Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new v6(cs0Var, 0));
                    }
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((ep0) h7Var.getFocusOwner()).g(((ro0) obj).a, false);
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return h7Var.getSavedStateRegistry();
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return Boolean.valueOf(h7Var.getScrollCaptureInProgress());
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return h7Var.getInputModeManager();
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return h7Var.getTextInputService();
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return h7Var.getSoftwareKeyboardController();
            case 8:
                return h7Var.getTextToolbar();
            default:
                return h7Var.getPointerIconService();
        }
    }
}
