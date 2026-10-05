package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class wf extends lr0 implements ag {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private jg mDelegate;
    private Resources mResources;

    @Override // defpackage.xz, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        vg vgVar = (vg) getDelegate();
        vgVar.x();
        ((ViewGroup) vgVar.F.findViewById(R.id.content)).addView(view, layoutParams);
        vgVar.r.a(vgVar.q.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        Configuration configuration;
        Method method;
        vg vgVar = (vg) getDelegate();
        vgVar.T = true;
        int i = vgVar.X;
        if (i == -100) {
            i = jg.g;
        }
        int iD = vgVar.D(context, i);
        int i2 = 0;
        if (jg.c(context) && jg.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (jg.n) {
                    try {
                        rj1 rj1Var = jg.h;
                        if (rj1Var == null) {
                            if (jg.i == null) {
                                jg.i = rj1.a(r51.A(context));
                            }
                            if (!jg.i.a.a.isEmpty()) {
                                jg.h = jg.i;
                            }
                        } else if (!rj1Var.equals(jg.i)) {
                            rj1 rj1Var2 = jg.h;
                            jg.i = rj1Var2;
                            r51.x(context, rj1Var2.a.a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!jg.k) {
                jg.f.execute(new eg(context, i2));
            }
        }
        rj1 rj1VarQ = vg.q(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(vg.u(context, iD, rj1VarQ, null, false));
            } catch (IllegalStateException unused) {
                if (!(context instanceof o40)) {
                }
            }
        } else if (!(context instanceof o40)) {
            try {
                ((o40) context).a(vg.u(context, iD, rj1VarQ, null, false));
            } catch (IllegalStateException unused2) {
                if (vg.o0) {
                }
            }
        } else if (vg.o0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i3 = configuration3.mcc;
                    int i4 = configuration4.mcc;
                    if (i3 != i4) {
                        configuration.mcc = i4;
                    }
                    int i5 = configuration3.mnc;
                    int i6 = configuration4.mnc;
                    if (i5 != i6) {
                        configuration.mnc = i6;
                    }
                    og.a(configuration3, configuration4, configuration);
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration3.colorMode & 3;
                    int i28 = configuration4.colorMode & 3;
                    if (i27 != i28) {
                        configuration.colorMode |= i28;
                    }
                    int i29 = configuration3.colorMode & 12;
                    int i30 = configuration4.colorMode & 12;
                    if (i29 != i30) {
                        configuration.colorMode |= i30;
                    }
                    int i31 = configuration3.uiMode & 15;
                    int i32 = configuration4.uiMode & 15;
                    if (i31 != i32) {
                        configuration.uiMode |= i32;
                    }
                    int i33 = configuration3.uiMode & 48;
                    int i34 = configuration4.uiMode & 48;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration3.screenWidthDp;
                    int i36 = configuration4.screenWidthDp;
                    if (i35 != i36) {
                        configuration.screenWidthDp = i36;
                    }
                    int i37 = configuration3.screenHeightDp;
                    int i38 = configuration4.screenHeightDp;
                    if (i37 != i38) {
                        configuration.screenHeightDp = i38;
                    }
                    int i39 = configuration3.smallestScreenWidthDp;
                    int i40 = configuration4.smallestScreenWidthDp;
                    if (i39 != i40) {
                        configuration.smallestScreenWidthDp = i40;
                    }
                    int i41 = configuration3.densityDpi;
                    int i42 = configuration4.densityDpi;
                    if (i41 != i42) {
                        configuration.densityDpi = i42;
                    }
                }
            }
            Configuration configurationU = vg.u(context, iD, rj1VarQ, configuration, true);
            o40 o40Var = new o40(context, top.th1nk.samp.R.style.Theme_AppCompat_Empty);
            o40Var.a(configurationU);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = o40Var.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        gf.k(theme);
                    } else {
                        synchronized (gv3.M) {
                            if (gv3.O) {
                                method = gv3.N;
                                if (method != null) {
                                }
                            } else {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    gv3.N = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                gv3.O = true;
                                method = gv3.N;
                                if (method != null) {
                                    try {
                                        method.invoke(theme, null);
                                    } catch (IllegalAccessException | InvocationTargetException e2) {
                                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                        gv3.N = null;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = o40Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        j2 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.wz, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        j2 supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final <T extends View> T findViewById(int i) {
        vg vgVar = (vg) getDelegate();
        vgVar.x();
        return (T) vgVar.q.findViewById(i);
    }

    public final jg getDelegate() {
        if (this.mDelegate == null) {
            hg hgVar = jg.f;
            this.mDelegate = new vg(this, null, this, this);
        }
        return this.mDelegate;
    }

    public final m2 getDrawerToggleDelegate() {
        ((vg) getDelegate()).getClass();
        return new m22(26);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        vg vgVar = (vg) getDelegate();
        if (vgVar.t == null) {
            vgVar.B();
            j2 j2Var = vgVar.s;
            vgVar.t = new bb3(j2Var != null ? j2Var.e() : vgVar.p);
        }
        return vgVar.t;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = to3.a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public final j2 getSupportActionBar() {
        vg vgVar = (vg) getDelegate();
        vgVar.B();
        return vgVar.s;
    }

    public final Intent getSupportParentActivityIntent() {
        return vr.E(this);
    }

    public final void h() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(top.th1nk.samp.R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(top.th1nk.samp.R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(top.th1nk.samp.R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(top.th1nk.samp.R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // defpackage.xz, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vg vgVar = (vg) getDelegate();
        if (vgVar.K && vgVar.E) {
            vgVar.B();
            j2 j2Var = vgVar.s;
            if (j2Var != null) {
                j2Var.g();
            }
        }
        yg ygVarA = yg.a();
        Context context = vgVar.p;
        synchronized (ygVarA) {
            zl2 zl2Var = ygVarA.a;
            synchronized (zl2Var) {
                xk1 xk1Var = (xk1) zl2Var.b.get(context);
                if (xk1Var != null) {
                    xk1Var.a();
                }
            }
        }
        vgVar.W = new Configuration(vgVar.p.getResources().getConfiguration());
        vgVar.o(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    public final void onCreateSupportNavigateUpTaskStack(jd3 jd3Var) {
        jd3Var.getClass();
        Intent intentE = vr.E(this);
        if (intentE == null) {
            intentE = vr.E(this);
        }
        if (intentE != null) {
            ComponentName component = intentE.getComponent();
            if (component == null) {
                component = intentE.resolveActivity(jd3Var.g.getPackageManager());
            }
            jd3Var.a(component);
            jd3Var.f.add(intentE);
        }
    }

    @Override // defpackage.lr0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().e();
    }

    @Override // defpackage.lr0, defpackage.xz, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        j2 supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // defpackage.xz, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((vg) getDelegate()).x();
    }

    @Override // defpackage.lr0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        vg vgVar = (vg) getDelegate();
        vgVar.B();
        j2 j2Var = vgVar.s;
        if (j2Var != null) {
            j2Var.m(true);
        }
    }

    @Override // defpackage.lr0, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((vg) getDelegate()).o(true, false);
    }

    @Override // defpackage.lr0, android.app.Activity
    public void onStop() {
        super.onStop();
        vg vgVar = (vg) getDelegate();
        vgVar.B();
        j2 j2Var = vgVar.s;
        if (j2Var != null) {
            j2Var.m(false);
        }
    }

    public final boolean onSupportNavigateUp() {
        Intent intentE = vr.E(this);
        if (intentE == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentE)) {
            navigateUpTo(intentE);
            return true;
        }
        jd3 jd3Var = new jd3(this);
        onCreateSupportNavigateUpTaskStack(jd3Var);
        jd3Var.b();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().m(charSequence);
    }

    public final e3 onWindowStartingSupportActionMode(d3 d3Var) {
        return null;
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        j2 supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.xz, android.app.Activity
    public final void setContentView(int i) {
        h();
        getDelegate().i(i);
    }

    public final void setSupportActionBar(Toolbar toolbar) {
        vg vgVar = (vg) getDelegate();
        if (vgVar.o instanceof Activity) {
            vgVar.B();
            j2 j2Var = vgVar.s;
            if (j2Var instanceof gs3) {
                c.q("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            vgVar.t = null;
            if (j2Var != null) {
                j2Var.h();
            }
            vgVar.s = null;
            if (toolbar != null) {
                Object obj = vgVar.o;
                xi3 xi3Var = new xi3(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : vgVar.u, vgVar.r);
                vgVar.s = xi3Var;
                vgVar.r.g = xi3Var.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                vgVar.r.g = null;
            }
            vgVar.b();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((vg) getDelegate()).Y = i;
    }

    public final e3 startSupportActionMode(d3 d3Var) {
        return getDelegate().n(d3Var);
    }

    public final void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public final void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public final boolean supportRequestWindowFeature(int i) {
        return getDelegate().h(i);
    }

    public final boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // defpackage.xz, android.app.Activity
    public void setContentView(View view) {
        h();
        getDelegate().j(view);
    }

    @Override // defpackage.xz, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        getDelegate().k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Deprecated
    public final void onSupportContentChanged() {
    }

    public final void onLocalesChanged(rj1 rj1Var) {
    }

    public final void onNightModeChanged(int i) {
    }

    public final void onPrepareSupportNavigateUpTaskStack(jd3 jd3Var) {
    }

    public final void onSupportActionModeFinished(e3 e3Var) {
    }

    public final void onSupportActionModeStarted(e3 e3Var) {
    }

    @Deprecated
    public final void setSupportProgress(int i) {
    }

    @Deprecated
    public final void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public final void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public final void setSupportProgressBarVisibility(boolean z) {
    }
}
