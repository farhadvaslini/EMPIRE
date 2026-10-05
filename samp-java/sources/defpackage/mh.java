package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mh implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ mh(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                vh vhVar = (vh) obj;
                if (!vhVar.getInternalPopup().a()) {
                    vhVar.k.m(vhVar.getTextDirection(), vhVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = vhVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                sh shVar = (sh) obj;
                vh vhVar2 = shVar.K;
                if (vhVar2.isAttachedToWindow() && vhVar2.getGlobalVisibleRect(shVar.I)) {
                    shVar.s();
                    shVar.c();
                } else {
                    shVar.dismiss();
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ds dsVar = (ds) obj;
                ArrayList arrayList = dsVar.m;
                if (dsVar.a() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((cs) arrayList.get(0)).a.C) {
                        View view = dsVar.t;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((cs) obj2).a.c();
                            }
                        } else {
                            dsVar.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                y83 y83Var = (y83) obj;
                lo1 lo1Var = y83Var.m;
                if (y83Var.a() && !lo1Var.C) {
                    View view2 = y83Var.r;
                    if (view2 != null && view2.isShown()) {
                        lo1Var.c();
                    } else {
                        y83Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
