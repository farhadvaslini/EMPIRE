package defpackage;

import android.os.SystemClock;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class e7 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ e7(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int actionMasked;
        int i;
        ed3 ed3VarB;
        long jNanoTime;
        switch (this.f) {
            case 0:
                h7 h7Var = (h7) this.g;
                h7Var.removeCallbacks(this);
                MotionEvent motionEvent = h7Var.s0;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i2 = 7;
                if (actionMasked == 7) {
                    i = i2;
                } else if (actionMasked != 8) {
                    if (actionMasked != 9) {
                        i2 = 2;
                    }
                    i = i2;
                } else {
                    i = 9;
                }
                h7Var.K(motionEvent, i, h7Var.t0, false);
                return;
            case 1:
                zi1 zi1Var = (zi1) this.g;
                cg0 cg0Var = zi1Var.h;
                dk dkVar = zi1Var.f;
                if (zi1Var.t) {
                    if (zi1Var.r) {
                        zi1Var.r = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        dkVar.e = jCurrentAnimationTimeMillis;
                        dkVar.g = -1L;
                        dkVar.f = jCurrentAnimationTimeMillis;
                        dkVar.h = 0.5f;
                    }
                    if ((dkVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > dkVar.g + ((long) dkVar.i)) || !zi1Var.e()) {
                        zi1Var.t = false;
                        return;
                    }
                    if (zi1Var.s) {
                        zi1Var.s = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        cg0Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (dkVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = dkVar.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - dkVar.f;
                    dkVar.f = jCurrentAnimationTimeMillis2;
                    zi1Var.v.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * dkVar.d));
                    WeakHashMap weakHashMap = mq3.a;
                    cg0Var.postOnAnimation(this);
                    return;
                }
                return;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                cg0 cg0Var2 = (cg0) this.g;
                cg0Var2.q = null;
                cg0Var2.drawableStateChanged();
                return;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((ur0) this.g).e(true);
                return;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.g;
                if (searchView$SearchAutoComplete.k) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.k = false;
                    return;
                }
                return;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                id3 id3Var = (id3) this.g;
                synchronized (id3Var) {
                    id3Var.g++;
                    ed3VarB = id3Var.b();
                }
                if (ed3VarB == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    ed3 ed3Var = ed3VarB;
                    try {
                        threadCurrentThread.setName(ed3Var.a);
                        Logger logger = ((id3) this.g).b;
                        hd3 hd3Var = ed3Var.c;
                        hd3Var.getClass();
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            oz2.l(logger, ed3Var, hd3Var, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jA = ed3Var.a();
                            if (zIsLoggable) {
                                oz2.l(logger, ed3Var, hd3Var, "finished run in " + oz2.q(System.nanoTime() - jNanoTime));
                            }
                            id3 id3Var2 = (id3) this.g;
                            synchronized (id3Var2) {
                                id3.a(id3Var2, ed3Var, jA, true);
                                ed3VarB = id3Var2.b();
                            }
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                oz2.l(logger, ed3Var, hd3Var, "failed a run in " + oz2.q(System.nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            id3 id3Var3 = (id3) this.g;
                            synchronized (id3Var3) {
                                id3.a(id3Var3, ed3Var, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th3) {
                            threadCurrentThread.setName(name);
                            throw th3;
                        }
                    }
                } while (ed3VarB != null);
                threadCurrentThread.setName(name);
                return;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Toolbar) this.g).u();
                return;
            default:
                xi3 xi3Var = (xi3) this.g;
                Window.Callback callback = xi3Var.b;
                Menu menuP = xi3Var.p();
                nn1 nn1Var = menuP instanceof nn1 ? (nn1) menuP : null;
                if (nn1Var != null) {
                    nn1Var.w();
                }
                try {
                    menuP.clear();
                    if (!callback.onCreatePanelMenu(0, menuP) || !callback.onPreparePanel(0, null, menuP)) {
                        menuP.clear();
                        break;
                    }
                    if (nn1Var != null) {
                        nn1Var.v();
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    if (nn1Var != null) {
                        nn1Var.v();
                    }
                    throw th4;
                }
        }
    }
}
