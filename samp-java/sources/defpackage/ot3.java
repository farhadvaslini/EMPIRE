package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class ot3 extends g12 {
    public final WindowInsetsController c;
    public final k71 d;
    public final Window e;

    public ot3(Window window, k71 k71Var) {
        this.c = window.getInsetsController();
        this.d = k71Var;
        this.e = window;
    }

    @Override // defpackage.g12
    public void b0(boolean z) {
        i0(16, 16, z);
    }

    @Override // defpackage.g12
    public void c0(boolean z) {
        i0(8192, 8, z);
    }

    @Override // defpackage.g12
    public final void e0() {
        ((k71) this.d.g).s();
        this.c.show(0);
    }

    public final void i0(int i, int i2, boolean z) {
        Window window = this.e;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.c;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
