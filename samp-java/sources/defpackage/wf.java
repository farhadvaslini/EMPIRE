package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.attachBaseContext(android.content.Context):void");
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
        decorView.setTag(2131230924, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(2131230928, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(2131230927, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(2131230926, this);
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
