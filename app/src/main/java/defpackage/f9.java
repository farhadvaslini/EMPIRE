package defpackage;

import android.content.Context;
import android.os.Build;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class f9 implements ow0 {
    public static boolean f = true;
    public final h7 a;
    public final Object b = new Object();
    public uq3 c;
    public boolean d;
    public final d9 e;

    public f9(h7 h7Var) {
        this.a = h7Var;
        d9 d9Var = new d9();
        this.e = d9Var;
        if (h7Var.isAttachedToWindow()) {
            Context context = h7Var.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(d9Var);
                this.d = true;
            }
        }
        h7Var.addOnAttachStateChangeListener(new e9(0, this));
    }

    @Override // defpackage.ow0
    public final void a(qw0 qw0Var) {
        synchronized (this.b) {
            if (!qw0Var.s) {
                qw0Var.s = true;
                qw0Var.b();
            }
        }
    }

    @Override // defpackage.ow0
    public final qw0 b() {
        sw0 ax0Var;
        sw0 yw0Var;
        qw0 qw0Var;
        synchronized (this.b) {
            try {
                h7 h7Var = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    h7Var.getUniqueDrawingId();
                }
                if (i >= 29) {
                    yw0Var = new yw0();
                } else {
                    if (f) {
                        try {
                            ax0Var = new ww0(this.a, new sr(), new rr());
                        } catch (Throwable unused) {
                            f = false;
                            ax0Var = new ax0(c(this.a));
                        }
                    } else {
                        ax0Var = new ax0(c(this.a));
                    }
                    yw0Var = ax0Var;
                }
                qw0Var = new qw0(yw0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return qw0Var;
    }

    public final mf0 c(h7 h7Var) {
        uq3 uq3Var = this.c;
        if (uq3Var != null) {
            return uq3Var;
        }
        uq3 uq3Var2 = new uq3(h7Var.getContext());
        uq3Var2.setClipChildren(false);
        uq3Var2.setClipToPadding(false);
        uq3Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        h7Var.addView(uq3Var2, -1);
        this.c = uq3Var2;
        return uq3Var2;
    }
}
