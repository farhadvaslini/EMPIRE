package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nt3 extends g12 {
    public final Window c;
    public final k71 d;

    public nt3(Window window, k71 k71Var) {
        this.c = window;
        this.d = k71Var;
    }

    @Override // defpackage.g12
    public final void b0(boolean z) {
        if (!z) {
            i0(16);
            return;
        }
        Window window = this.c;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
    }

    @Override // defpackage.g12
    public final void c0(boolean z) {
        if (!z) {
            i0(8192);
            return;
        }
        Window window = this.c;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
    }

    @Override // defpackage.g12
    public final void e0() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((8 & i) != 0) {
                if (i == 1) {
                    i0(4);
                    this.c.clearFlags(1024);
                } else if (i == 2) {
                    i0(2);
                } else if (i == 8) {
                    ((k71) this.d.g).s();
                }
            }
        }
    }

    public final void i0(int i) {
        View decorView = this.c.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
