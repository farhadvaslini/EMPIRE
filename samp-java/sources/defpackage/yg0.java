package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class yg0 {
    public void b(yb3 yb3Var, yb3 yb3Var2, Window window, View view, boolean z, boolean z2) {
        yb3Var.getClass();
        yb3Var2.getClass();
        window.getClass();
        view.getClass();
        oz2.K(window, false);
        window.setStatusBarColor(z ? yb3Var.b : yb3Var.a);
        window.setNavigationBarColor(z2 ? yb3Var2.b : yb3Var2.a);
        k71 k71Var = new k71(view);
        int i = Build.VERSION.SDK_INT;
        g12 pt3Var = i >= 35 ? new pt3(window, k71Var) : i >= 30 ? new ot3(window, k71Var) : new nt3(window, k71Var);
        pt3Var.c0(!z);
        pt3Var.b0(!z2);
    }

    public void a(Window window) {
    }
}
