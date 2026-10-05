package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import top.th1nk.samp.MainActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class vg0 implements Runnable {
    public final /* synthetic */ yg0 f;
    public final /* synthetic */ yb3 g;
    public final /* synthetic */ yb3 h;
    public final /* synthetic */ MainActivity i;
    public final /* synthetic */ View j;

    public /* synthetic */ vg0(yg0 yg0Var, yb3 yb3Var, yb3 yb3Var2, MainActivity mainActivity, View view) {
        this.f = yg0Var;
        this.g = yb3Var;
        this.h = yb3Var2;
        this.i = mainActivity;
        this.j = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Window window = this.i.getWindow();
        window.getClass();
        yb3 yb3Var = this.g;
        ns0 ns0Var = yb3Var.c;
        View view = this.j;
        Resources resources = view.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) ns0Var.h(resources)).booleanValue();
        yb3 yb3Var2 = this.h;
        ns0 ns0Var2 = yb3Var2.c;
        Resources resources2 = view.getResources();
        resources2.getClass();
        this.f.b(yb3Var, yb3Var2, window, view, zBooleanValue, ((Boolean) ns0Var2.h(resources2)).booleanValue());
    }
}
