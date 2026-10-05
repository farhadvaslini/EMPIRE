package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ wb g;

    public /* synthetic */ qb(wb wbVar, int i) {
        this.f = i;
        this.g = wbVar;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        wb wbVar = this.g;
        switch (i) {
            case 0:
                cs0 cs0Var = (cs0) obj;
                View view = wbVar.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    cs0Var.a();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new v6(cs0Var, 2));
                    }
                }
                return dm3Var;
            case 1:
                ActionMode actionMode = wbVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ActionMode actionMode2 = wbVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return dm3Var;
            default:
                wbVar.e.e();
                return new c4(3, wbVar);
        }
    }
}
