package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class oa implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ rb2 g;

    public /* synthetic */ oa(rb2 rb2Var, int i) {
        this.f = i;
        this.g = rb2Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        rb2 rb2Var = this.g;
        switch (i) {
            case 0:
                rb2Var.m10setPopupContentSizefhxjrPA((p41) obj);
                rb2Var.r();
                break;
            case 1:
                ab1 ab1VarF = ((ab1) obj).F();
                ab1VarF.getClass();
                rb2Var.q(ab1VarF);
                break;
            default:
                cs0 cs0Var = (cs0) obj;
                Handler handler = rb2Var.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = rb2Var.getHandler();
                    if (handler2 != null) {
                        handler2.post(new v6(cs0Var, 5));
                    }
                } else {
                    cs0Var.a();
                }
                break;
        }
        return dm3Var;
    }
}
