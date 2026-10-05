package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements Runnable {
    public final /* synthetic */ int f;
    public Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ x2(int i, Object obj, Object obj2) {
        this.f = i;
        this.h = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ln1 ln1Var;
        int i = 0;
        switch (this.f) {
            case 0:
                v2 v2Var = (v2) this.g;
                z2 z2Var = (z2) this.h;
                nn1 nn1Var = z2Var.h;
                if (nn1Var != null && (ln1Var = nn1Var.e) != null) {
                    ln1Var.l(nn1Var);
                }
                View view = (View) z2Var.m;
                if (view != null && view.getWindowToken() != null) {
                    if (v2Var.b()) {
                        z2Var.x = v2Var;
                    } else if (v2Var.e != null) {
                        v2Var.d(0, 0, false, false);
                        z2Var.x = v2Var;
                    }
                }
                z2Var.z = null;
                return;
            case 1:
                ((k3) this.g).a = this.h;
                return;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Application) this.g).unregisterActivityLifecycleCallbacks((k3) this.h);
                return;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                Object obj = this.h;
                Object obj2 = this.g;
                try {
                    Method method = l3.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        l3.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                k71 k71Var = (k71) this.g;
                Typeface typeface = (Typeface) this.h;
                xh xhVar = (xh) k71Var.g;
                if (xhVar != null) {
                    xhVar.k(typeface);
                    return;
                }
                return;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                break;
            default:
                ((lq0) this.g).accept(this.h);
                return;
        }
        while (true) {
            try {
                ((Runnable) this.g).run();
            } catch (Throwable th2) {
                lr.K(li0.f, th2);
            }
            Runnable runnableF = ((yf1) this.h).F();
            if (runnableF == null) {
                return;
            }
            try {
                this.g = runnableF;
                i++;
                if (i >= 16) {
                    yf1 yf1Var = (yf1) this.h;
                    if (s51.C(yf1Var.i, yf1Var)) {
                        yf1 yf1Var2 = (yf1) this.h;
                        s51.B(yf1Var2.i, yf1Var2, this);
                        return;
                    }
                }
            } catch (Throwable th3) {
                yf1 yf1Var3 = (yf1) this.h;
                synchronized (yf1Var3.l) {
                    yf1.m.decrementAndGet(yf1Var3);
                    throw th3;
                }
            }
        }
    }

    public /* synthetic */ x2(Object obj, boolean z, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
