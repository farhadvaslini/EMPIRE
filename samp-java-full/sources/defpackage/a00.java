package defpackage;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class a00 extends Dialog implements of1, yy1, mv1, wq2 {
    public rf1 f;
    public final uq2 g;
    public final xb3 h;
    public final xb3 i;

    public a00(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, i);
        this.g = new uq2(new vq2(this, new it1(14, this)));
        final int i2 = 0;
        this.h = new xb3(new cs0(this) { // from class: zz
            public final /* synthetic */ a00 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                int i3 = i2;
                a00 a00Var = this.g;
                switch (i3) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        a00Var.getNavigationEventDispatcher().b(sb0Var);
                        return sb0Var;
                    default:
                        return new xy1(new v(6, a00Var));
                }
            }
        });
        final int i3 = 1;
        this.i = new xb3(new cs0(this) { // from class: zz
            public final /* synthetic */ a00 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                int i32 = i3;
                a00 a00Var = this.g;
                switch (i32) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        a00Var.getNavigationEventDispatcher().b(sb0Var);
                        return sb0Var;
                    default:
                        return new xy1(new v(6, a00Var));
                }
            }
        });
    }

    public static void a(a00 a00Var) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.addContentView(view, layoutParams);
    }

    public final rf1 b() {
        rf1 rf1Var = this.f;
        if (rf1Var != null) {
            return rf1Var;
        }
        rf1 rf1Var2 = new rf1(this, true);
        this.f = rf1Var2;
        return rf1Var2;
    }

    public final void c() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.of1
    public final gf1 getLifecycle() {
        return b();
    }

    @Override // defpackage.mv1
    public final lv1 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().c;
    }

    @Override // defpackage.yy1
    public final xy1 getOnBackPressedDispatcher() {
        return (xy1) this.i.getValue();
    }

    @Override // defpackage.wq2
    public final tq2 getSavedStateRegistry() {
        return this.g.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((sb0) this.h.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            xy1 onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.c(onBackInvokedDispatcher);
        }
        this.g.a(bundle);
        b().e(ef1.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.g.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        b().e(ef1.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().e(ef1.ON_DESTROY);
        this.f = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.setContentView(view, layoutParams);
    }
}
