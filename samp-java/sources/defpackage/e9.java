package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class e9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e9(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f) {
            case 0:
                f9 f9Var = (f9) this.g;
                Context context = view.getContext();
                if (!f9Var.d) {
                    context.getApplicationContext().registerComponentCallbacks(f9Var.e);
                    f9Var.d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                f9 f9Var = (f9) obj;
                Context context = view.getContext();
                if (f9Var.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(f9Var.e);
                    f9Var.d = false;
                }
                break;
            case 1:
                ds dsVar = (ds) obj;
                ViewTreeObserver viewTreeObserver = dsVar.C;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        dsVar.C = view.getViewTreeObserver();
                    }
                    dsVar.C.removeGlobalOnLayoutListener(dsVar.n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y83 y83Var = (y83) obj;
                ViewTreeObserver viewTreeObserver2 = y83Var.t;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        y83Var.t = view.getViewTreeObserver();
                    }
                    y83Var.t.removeGlobalOnLayoutListener(y83Var.n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                w wVar = (w) obj;
                for (Object obj2 : pv2.H(wVar.getParent(), rq3.m)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(2131230831);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                wVar.e();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((w83) obj).c(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
