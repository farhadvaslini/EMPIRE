package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class z10 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ a20 f;

    public z10(a20 a20Var) {
        this.f = a20Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f.f(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        a20 a20Var = this.f;
        a20Var.g.a.clear();
        wl2 wl2Var = a20Var.h;
        synchronized (wl2Var) {
            wl2Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        a20 a20Var = this.f;
        a20Var.g.a.clear();
        wl2 wl2Var = a20Var.h;
        synchronized (wl2Var) {
            wl2Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.f.t.a.setValue(Boolean.valueOf(z));
    }
}
