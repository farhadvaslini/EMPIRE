package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vg extends jg implements ln1, LayoutInflater.Factory2 {
    public static final w33 m0 = new w33(0);
    public static final int[] n0 = {R.attr.windowBackground};
    public static final boolean o0 = !"robolectric".equals(Build.FINGERPRINT);
    public PopupWindow A;
    public kg B;
    public boolean E;
    public ViewGroup F;
    public TextView G;
    public View H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public ug[] Q;
    public ug R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public Configuration W;
    public final int X;
    public int Y;
    public int Z;
    public boolean a0;
    public rg b0;
    public rg c0;
    public boolean d0;
    public int e0;
    public boolean g0;
    public Rect h0;
    public Rect i0;
    public oi j0;
    public OnBackInvokedDispatcher k0;
    public OnBackInvokedCallback l0;
    public final Object o;
    public final Context p;
    public Window q;
    public qg r;
    public j2 s;
    public bb3 t;
    public CharSequence u;
    public ActionBarOverlayLayout v;
    public lg w;
    public lg x;
    public e3 y;
    public ActionBarContextView z;
    public er3 C = null;
    public final boolean D = true;
    public final kg f0 = new kg(this, 0);

    public vg(Context context, Window window, ag agVar, Object obj) {
        wf wfVar = null;
        this.X = -100;
        this.p = context;
        this.o = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof wf)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        wfVar = (wf) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (wfVar != null) {
                this.X = ((vg) wfVar.getDelegate()).X;
            }
        }
        if (this.X == -100) {
            String name = this.o.getClass().getName();
            w33 w33Var = m0;
            Integer num = (Integer) w33Var.get(name);
            if (num != null) {
                this.X = num.intValue();
                w33Var.remove(this.o.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        yg.c();
    }

    public static rj1 q(Context context) {
        rj1 rj1Var;
        rj1 rj1Var2;
        if (Build.VERSION.SDK_INT >= 33 || (rj1Var = jg.h) == null) {
            return null;
        }
        sj1 sj1Var = rj1Var.a;
        rj1 rj1VarB = og.b(context.getApplicationContext().getResources().getConfiguration());
        if (sj1Var.a.isEmpty()) {
            rj1Var2 = rj1.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < rj1VarB.a.a.size() + sj1Var.a.size()) {
                Locale locale = i < sj1Var.a.size() ? sj1Var.a.get(i) : rj1VarB.a.a.get(i - sj1Var.a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            rj1Var2 = new rj1(new sj1(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return rj1Var2.a.a.isEmpty() ? rj1VarB : rj1Var2;
    }

    public static Configuration u(Context context, int i, rj1 rj1Var, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (rj1Var != null) {
            og.d(configuration2, rj1Var);
        }
        return configuration2;
    }

    public final ug A(int i) {
        ug[] ugVarArr = this.Q;
        if (ugVarArr == null || ugVarArr.length <= i) {
            ug[] ugVarArr2 = new ug[i + 1];
            if (ugVarArr != null) {
                System.arraycopy(ugVarArr, 0, ugVarArr2, 0, ugVarArr.length);
            }
            this.Q = ugVarArr2;
            ugVarArr = ugVarArr2;
        }
        ug ugVar = ugVarArr[i];
        if (ugVar != null) {
            return ugVar;
        }
        ug ugVar2 = new ug();
        ugVar2.a = i;
        ugVar2.n = false;
        ugVarArr[i] = ugVar2;
        return ugVar2;
    }

    public final void B() {
        x();
        if (this.K && this.s == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                this.s = new gs3((Activity) obj, this.L);
            } else if (obj instanceof Dialog) {
                this.s = new gs3((Dialog) obj);
            }
            j2 j2Var = this.s;
            if (j2Var != null) {
                j2Var.l(this.g0);
            }
        }
    }

    public final void C(int i) {
        this.e0 = (1 << i) | this.e0;
        if (this.d0) {
            return;
        }
        View decorView = this.q.getDecorView();
        WeakHashMap weakHashMap = mq3.a;
        decorView.postOnAnimation(this.f0);
        this.d0 = true;
    }

    public final int D(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            c.q("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.c0 == null) {
                            this.c0 = new rg(this, context);
                        }
                        return this.c0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return z(context).f();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean E() {
        boolean z = this.S;
        this.S = false;
        ug ugVarA = A(0);
        if (!ugVarA.m) {
            e3 e3Var = this.y;
            if (e3Var != null) {
                e3Var.a();
                return true;
            }
            B();
            j2 j2Var = this.s;
            if (j2Var == null || !j2Var.b()) {
                return false;
            }
        } else if (!z) {
            t(ugVarA, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.k.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(ug ugVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = ugVar.m;
        int i2 = ugVar.a;
        if (z || this.V) {
            return;
        }
        Context context = this.p;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, ugVar.h)) {
            t(ugVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !H(ugVar, keyEvent)) {
            return;
        }
        tg tgVar = ugVar.e;
        if (tgVar != null && !ugVar.n) {
            View view = ugVar.g;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
            }
            ugVar.l = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = ugVar.c;
            layoutParams2.windowAnimations = ugVar.d;
            windowManager.addView(ugVar.e, layoutParams2);
            ugVar.m = true;
            if (i2 != 0) {
                J();
                return;
            }
            return;
        }
        if (tgVar == null) {
            B();
            j2 j2Var = this.s;
            Context contextE = j2Var != null ? j2Var.e() : null;
            if (contextE != null) {
                context = contextE;
            }
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(top.th1nk.samp.R.attr.actionBarPopupTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                themeNewTheme.applyStyle(i3, true);
            }
            themeNewTheme.resolveAttribute(top.th1nk.samp.R.attr.panelMenuListTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                themeNewTheme.applyStyle(i4, true);
            } else {
                themeNewTheme.applyStyle(top.th1nk.samp.R.style.Theme_AppCompat_CompactMenu, true);
            }
            o40 o40Var = new o40(context, 0);
            o40Var.getTheme().setTo(themeNewTheme);
            ugVar.j = o40Var;
            TypedArray typedArrayObtainStyledAttributes = o40Var.obtainStyledAttributes(pf2.j);
            ugVar.b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
            ugVar.d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            ugVar.e = new tg(this, ugVar.j);
            ugVar.c = 81;
        } else if (ugVar.n && tgVar.getChildCount() > 0) {
            ugVar.e.removeAllViews();
        }
        View view2 = ugVar.g;
        if (view2 == null) {
            if (ugVar.h != null) {
                if (this.x == null) {
                    this.x = new lg(this, 3);
                }
                lg lgVar = this.x;
                if (ugVar.i == null) {
                    oi1 oi1Var = new oi1(ugVar.j);
                    ugVar.i = oi1Var;
                    oi1Var.j = lgVar;
                    nn1 nn1Var = ugVar.h;
                    nn1Var.b(oi1Var, nn1Var.a);
                }
                oi1 oi1Var2 = ugVar.i;
                tg tgVar2 = ugVar.e;
                if (oi1Var2.i == null) {
                    oi1Var2.i = (ExpandedMenuView) oi1Var2.g.inflate(top.th1nk.samp.R.layout.abc_expanded_menu_layout, (ViewGroup) tgVar2, false);
                    if (oi1Var2.k == null) {
                        oi1Var2.k = new ni1(oi1Var2);
                    }
                    oi1Var2.i.setAdapter((ListAdapter) oi1Var2.k);
                    oi1Var2.i.setOnItemClickListener(oi1Var2);
                }
                ExpandedMenuView expandedMenuView = oi1Var2.i;
                ugVar.f = expandedMenuView;
                if (expandedMenuView != null) {
                }
            }
            ugVar.n = true;
            return;
        }
        ugVar.f = view2;
        if (ugVar.f != null) {
            if (ugVar.g == null) {
                oi1 oi1Var3 = ugVar.i;
                if (oi1Var3.k == null) {
                    oi1Var3.k = new ni1(oi1Var3);
                }
            }
            ViewGroup.LayoutParams layoutParams3 = ugVar.f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            ugVar.e.setBackgroundResource(ugVar.b);
            ViewParent parent = ugVar.f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(ugVar.f);
            }
            ugVar.e.addView(ugVar.f, layoutParams3);
            if (!ugVar.f.hasFocus()) {
                ugVar.f.requestFocus();
            }
        }
        ugVar.n = true;
        return;
        i = -2;
        ugVar.l = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams22.gravity = ugVar.c;
        layoutParams22.windowAnimations = ugVar.d;
        windowManager.addView(ugVar.e, layoutParams22);
        ugVar.m = true;
        if (i2 != 0) {
        }
    }

    public final boolean G(ug ugVar, int i, KeyEvent keyEvent) {
        nn1 nn1Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((ugVar.k || H(ugVar, keyEvent)) && (nn1Var = ugVar.h) != null) {
            return nn1Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(ug ugVar, KeyEvent keyEvent) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.V) {
            boolean z = ugVar.k;
            int i = ugVar.a;
            if (z) {
                return true;
            }
            ug ugVar2 = this.R;
            if (ugVar2 != null && ugVar2 != ugVar) {
                t(ugVar2, false);
            }
            Window.Callback callback = this.q.getCallback();
            if (callback != null) {
                ugVar.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.v) != null) {
                actionBarOverlayLayout4.k();
                ((bj3) actionBarOverlayLayout4.j).l = true;
            }
            if (ugVar.g == null && (!z2 || !(this.s instanceof xi3))) {
                nn1 nn1Var = ugVar.h;
                if (nn1Var == null || ugVar.o) {
                    if (nn1Var == null) {
                        Context context = this.p;
                        if ((i == 0 || i == 108) && this.v != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(top.th1nk.samp.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(top.th1nk.samp.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(top.th1nk.samp.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                o40 o40Var = new o40(context, 0);
                                o40Var.getTheme().setTo(themeNewTheme);
                                context = o40Var;
                            }
                        }
                        nn1 nn1Var2 = new nn1(context);
                        nn1Var2.e = this;
                        nn1 nn1Var3 = ugVar.h;
                        if (nn1Var2 != nn1Var3) {
                            if (nn1Var3 != null) {
                                nn1Var3.r(ugVar.i);
                            }
                            ugVar.h = nn1Var2;
                            oi1 oi1Var = ugVar.i;
                            if (oi1Var != null) {
                                nn1Var2.b(oi1Var, nn1Var2.a);
                            }
                        }
                        if (ugVar.h != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.v) != null) {
                                if (this.w == null) {
                                    this.w = new lg(this, 2);
                                }
                                actionBarOverlayLayout2.l(ugVar.h, this.w);
                            }
                            ugVar.h.w();
                            if (callback.onCreatePanelMenu(i, ugVar.h)) {
                                ugVar.o = false;
                            } else {
                                nn1 nn1Var4 = ugVar.h;
                                if (nn1Var4 != null) {
                                    if (nn1Var4 != null) {
                                        nn1Var4.r(ugVar.i);
                                    }
                                    ugVar.h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.v) != null) {
                                    actionBarOverlayLayout.l(null, this.w);
                                }
                            }
                        }
                    }
                }
                ugVar.h.w();
                Bundle bundle = ugVar.p;
                if (bundle != null) {
                    ugVar.h.s(bundle);
                    ugVar.p = null;
                }
                if (!callback.onPreparePanel(0, ugVar.g, ugVar.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.v) != null) {
                        actionBarOverlayLayout3.l(null, this.w);
                    }
                    ugVar.h.v();
                    return false;
                }
                ugVar.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                ugVar.h.v();
            }
            ugVar.k = true;
            ugVar.l = false;
            this.R = ugVar;
            return true;
        }
        return false;
    }

    public final void I() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void J() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.k0 != null && (A(0).m || this.y != null)) {
                z = true;
            }
            if (z && this.l0 == null) {
                this.l0 = pg.b(this.k0, this);
            } else {
                if (z || (onBackInvokedCallback = this.l0) == null) {
                    return;
                }
                pg.c(this.k0, onBackInvokedCallback);
                this.l0 = null;
            }
        }
    }

    @Override // defpackage.jg
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.p);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof vg) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.jg
    public final void b() {
        if (this.s != null) {
            B();
            if (this.s.f()) {
                return;
            }
            C(0);
        }
    }

    @Override // defpackage.jg
    public final void d() {
        String strG;
        this.T = true;
        o(false, true);
        y();
        Object obj = this.o;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strG = vr.G(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strG = null;
            }
            if (strG != null) {
                j2 j2Var = this.s;
                if (j2Var == null) {
                    this.g0 = true;
                } else {
                    j2Var.l(true);
                }
            }
            synchronized (jg.m) {
                jg.f(this);
                jg.l.add(new WeakReference(this));
            }
        }
        this.W = new Configuration(this.p.getResources().getConfiguration());
        this.U = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // defpackage.jg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        if (this.o instanceof Activity) {
            synchronized (jg.m) {
                jg.f(this);
            }
        }
        if (this.d0) {
            this.q.getDecorView().removeCallbacks(this.f0);
        }
        this.V = true;
        if (this.X != -100) {
            Object obj = this.o;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                m0.put(this.o.getClass().getName(), Integer.valueOf(this.X));
            } else {
                m0.remove(this.o.getClass().getName());
            }
        }
        j2 j2Var = this.s;
        if (j2Var != null) {
            j2Var.h();
        }
        rg rgVar = this.b0;
        if (rgVar != null) {
            rgVar.c();
        }
        rg rgVar2 = this.c0;
        if (rgVar2 != null) {
            rgVar2.c();
        }
    }

    @Override // defpackage.ln1
    public final boolean g(nn1 nn1Var, MenuItem menuItem) {
        ug ugVar;
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.V) {
            nn1 nn1VarK = nn1Var.k();
            ug[] ugVarArr = this.Q;
            int length = ugVarArr != null ? ugVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    ugVar = ugVarArr[i];
                    if (ugVar != null && ugVar.h == nn1VarK) {
                        break;
                    }
                    i++;
                } else {
                    ugVar = null;
                    break;
                }
            }
            if (ugVar != null) {
                return callback.onMenuItemSelected(ugVar.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.jg
    public final boolean h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.O && i == 108) {
            return false;
        }
        if (this.K && i == 1) {
            this.K = false;
        }
        if (i == 1) {
            I();
            this.O = true;
            return true;
        }
        if (i == 2) {
            I();
            this.I = true;
            return true;
        }
        if (i == 5) {
            I();
            this.J = true;
            return true;
        }
        if (i == 10) {
            I();
            this.M = true;
            return true;
        }
        if (i == 108) {
            I();
            this.K = true;
            return true;
        }
        if (i != 109) {
            return this.q.requestFeature(i);
        }
        I();
        this.L = true;
        return true;
    }

    @Override // defpackage.jg
    public final void i(int i) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.p).inflate(i, viewGroup);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.jg
    public final void j(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.r.a(this.q.getCallback());
    }

    @Override // defpackage.jg
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.r.a(this.q.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // defpackage.ln1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(nn1 nn1Var) {
        ActionMenuView actionMenuView;
        z2 z2Var;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((bj3) actionBarOverlayLayout.j).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f) != null && actionMenuView.x) {
                if (ViewConfiguration.get(this.p).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((bj3) actionBarOverlayLayout2.j).a.f;
                    if (actionMenuView2 != null) {
                        z2 z2Var2 = actionMenuView2.y;
                        if (z2Var2 != null) {
                            if (z2Var2.z == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.q.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.v;
                actionBarOverlayLayout3.k();
                if (((bj3) actionBarOverlayLayout3.j).a.o()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.v;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((bj3) actionBarOverlayLayout4.j).a.f;
                    if (actionMenuView3 != null && (z2Var = actionMenuView3.y) != null) {
                        z2Var.c();
                    }
                    if (this.V) {
                        return;
                    }
                    callback.onPanelClosed(108, A(0).h);
                    return;
                }
                if (callback == null || this.V) {
                    return;
                }
                if (this.d0 && (1 & this.e0) != 0) {
                    View decorView = this.q.getDecorView();
                    kg kgVar = this.f0;
                    decorView.removeCallbacks(kgVar);
                    kgVar.run();
                }
                ug ugVarA = A(0);
                nn1 nn1Var2 = ugVarA.h;
                if (nn1Var2 == null || ugVarA.o || !callback.onPreparePanel(0, ugVarA.g, nn1Var2)) {
                    return;
                }
                callback.onMenuOpened(108, ugVarA.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.v;
                actionBarOverlayLayout5.k();
                ((bj3) actionBarOverlayLayout5.j).a.u();
                return;
            }
        }
        ug ugVarA2 = A(0);
        ugVarA2.n = true;
        t(ugVarA2, false);
        F(ugVarA2, null);
    }

    @Override // defpackage.jg
    public final void m(CharSequence charSequence) {
        this.u = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        j2 j2Var = this.s;
        if (j2Var != null) {
            j2Var.n(charSequence);
            return;
        }
        TextView textView = this.G;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // defpackage.jg
    public final e3 n(d3 d3Var) {
        ViewGroup viewGroup;
        if (d3Var == null) {
            c.p("ActionMode callback can not be null.");
            return null;
        }
        e3 e3Var = this.y;
        if (e3Var != null) {
            e3Var.a();
        }
        a31 a31Var = new a31(4, this, d3Var);
        B();
        j2 j2Var = this.s;
        if (j2Var != null) {
            this.y = j2Var.o(a31Var);
        }
        if (this.y == null) {
            er3 er3Var = this.C;
            if (er3Var != null) {
                er3Var.b();
            }
            e3 e3Var2 = this.y;
            if (e3Var2 != null) {
                e3Var2.a();
            }
            int i = 1;
            if (this.z == null) {
                boolean z = this.N;
                Context context = this.p;
                if (z) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(top.th1nk.samp.R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        o40 o40Var = new o40(context, 0);
                        o40Var.getTheme().setTo(themeNewTheme);
                        context = o40Var;
                    }
                    this.z = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, top.th1nk.samp.R.attr.actionModePopupWindowStyle);
                    this.A = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    this.A.setContentView(this.z);
                    this.A.setWidth(-1);
                    context.getTheme().resolveAttribute(top.th1nk.samp.R.attr.actionBarSize, typedValue, true);
                    this.z.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    this.A.setHeight(-2);
                    this.B = new kg(this, i);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.F.findViewById(top.th1nk.samp.R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        B();
                        j2 j2Var2 = this.s;
                        Context contextE = j2Var2 != null ? j2Var2.e() : null;
                        if (contextE != null) {
                            context = contextE;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        this.z = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.z != null) {
                er3 er3Var2 = this.C;
                if (er3Var2 != null) {
                    er3Var2.b();
                }
                this.z.e();
                Context context2 = this.z.getContext();
                ActionBarContextView actionBarContextView = this.z;
                v83 v83Var = new v83();
                v83Var.h = context2;
                v83Var.i = actionBarContextView;
                v83Var.j = a31Var;
                nn1 nn1Var = new nn1(actionBarContextView.getContext());
                nn1Var.l = 1;
                v83Var.m = nn1Var;
                nn1Var.e = v83Var;
                if (((d3) a31Var.g).d(v83Var, nn1Var)) {
                    v83Var.h();
                    this.z.c(v83Var);
                    this.y = v83Var;
                    boolean z2 = this.E && (viewGroup = this.F) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = this.z;
                    if (z2) {
                        actionBarContextView2.setAlpha(0.0f);
                        er3 er3VarA = mq3.a(this.z);
                        er3VarA.a(1.0f);
                        this.C = er3VarA;
                        er3VarA.d(new mg(i, this));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        this.z.setVisibility(0);
                        if (this.z.getParent() instanceof View) {
                            View view = (View) this.z.getParent();
                            WeakHashMap weakHashMap = mq3.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (this.A != null) {
                        this.q.getDecorView().post(this.B);
                    }
                } else {
                    this.y = null;
                }
            }
            J();
            this.y = this.y;
        }
        J();
        return this.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.V) {
            return false;
        }
        int i2 = this.X;
        if (i2 == -100) {
            i2 = jg.g;
        }
        Context context = this.p;
        int iD = D(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        rj1 rj1VarQ = i3 < 33 ? q(context) : null;
        if (!z2 && rj1VarQ != null) {
            rj1VarQ = og.b(context.getResources().getConfiguration());
        }
        Configuration configurationU = u(context, iD, rj1VarQ, null, false);
        boolean z4 = this.a0;
        boolean z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        Object obj = this.o;
        if (z4 || !(obj instanceof Activity)) {
            this.a0 = true;
            i = this.Z;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.Z = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.Z = 0;
                }
                this.a0 = true;
                i = this.Z;
            }
        }
        Configuration configuration = this.W;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationU.uiMode & 48;
        rj1 rj1VarB = og.b(configuration);
        rj1 rj1VarB2 = rj1VarQ == null ? null : og.b(configurationU);
        int i6 = i4 != i5 ? 512 : 0;
        if (rj1VarB2 != null && !rj1VarB.equals(rj1VarB2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.T && ((o0 || this.U) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (!activity.isChild()) {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationU.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new v(z5 ? 1 : 0, activity));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (rj1VarB2 != null) {
                og.d(configuration2, rj1VarB2);
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = this.Y;
            if (i8 != 0) {
                context.setTheme(i8);
                context.getTheme().applyStyle(this.Y, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof of1) {
                    if (((rf1) ((of1) activity2).getLifecycle()).i.compareTo(ff1.h) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.U && !this.V) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (rj1VarB2 != null) {
            og.c(og.b(context.getResources().getConfiguration()));
        }
        if (i2 == 0) {
            z(context).q();
        } else {
            rg rgVar = this.b0;
            if (rgVar != null) {
                rgVar.c();
            }
        }
        rg rgVar2 = this.c0;
        if (i2 == 3) {
            if (rgVar2 == null) {
                this.c0 = new rg(this, context);
            }
            this.c0.q();
        } else if (rgVar2 != null) {
            rgVar2.c();
        }
        return z5;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Context o40Var;
        View hhVar;
        View view2 = null;
        if (this.j0 == null) {
            int[] iArr = pf2.j;
            Context context2 = this.p;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.j0 = new oi();
            } else {
                try {
                    this.j0 = (oi) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.j0 = new oi();
                }
            }
        }
        oi oiVar = this.j0;
        int i = to3.a;
        oiVar.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, pf2.x, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        o40Var = (resourceId == 0 || ((context instanceof o40) && ((o40) context).a == resourceId)) ? context : new o40(context, resourceId);
        str.getClass();
        switch (str) {
            case "RatingBar":
                hhVar = new hh(o40Var, attributeSet);
                break;
            case "CheckedTextView":
                hhVar = new cg(o40Var, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                hhVar = new eh(o40Var, attributeSet);
                break;
            case "TextView":
                hhVar = new gi(o40Var, attributeSet);
                break;
            case "ImageButton":
                hhVar = new ch(o40Var, attributeSet, top.th1nk.samp.R.attr.imageButtonStyle);
                break;
            case "SeekBar":
                hhVar = new jh(o40Var, attributeSet);
                break;
            case "Spinner":
                hhVar = new vh(o40Var, attributeSet);
                break;
            case "RadioButton":
                hhVar = new gh(o40Var, attributeSet);
                break;
            case "ToggleButton":
                hhVar = new mi(o40Var, attributeSet);
                break;
            case "ImageView":
                hhVar = new dh(o40Var, attributeSet, 0);
                break;
            case "AutoCompleteTextView":
                hhVar = new xf(o40Var, attributeSet, top.th1nk.samp.R.attr.autoCompleteTextViewStyle);
                break;
            case "CheckBox":
                hhVar = new bg(o40Var, attributeSet);
                break;
            case "EditText":
                hhVar = new ah(o40Var, attributeSet);
                break;
            case "Button":
                hhVar = new zf(o40Var, attributeSet);
                break;
            default:
                hhVar = null;
                break;
        }
        if (hhVar == null && context != o40Var) {
            Object[] objArr = oiVar.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = o40Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = oi.g;
                        if (i2 < 3) {
                            View viewA = oiVar.a(o40Var, str, strArr[i2]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewA2 = oiVar.a(o40Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            hhVar = view2;
        }
        if (hhVar != null) {
            Context context3 = hhVar.getContext();
            if ((context3 instanceof ContextWrapper) && hhVar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, oi.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    hhVar.setOnClickListener(new ni(hhVar, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = o40Var.obtainStyledAttributes(attributeSet, oi.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = mq3.a;
                    new bq3(top.th1nk.samp.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(hhVar, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = o40Var.obtainStyledAttributes(attributeSet, oi.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    mq3.j(hhVar, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = o40Var.obtainStyledAttributes(attributeSet, oi.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = mq3.a;
                    new bq3(top.th1nk.samp.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(hhVar, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return hhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Window window) {
        Drawable drawableE;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.q != null) {
            c.q("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof qg) {
            c.q("AppCompat has already installed itself into the Window");
            return;
        }
        qg qgVar = new qg(this, callback);
        this.r = qgVar;
        window.setCallback(qgVar);
        Context context = this.p;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, n0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableE = null;
        } else {
            yg ygVarA = yg.a();
            synchronized (ygVarA) {
                drawableE = ygVarA.a.e(context, resourceId, true);
            }
        }
        if (drawableE != null) {
            window.setBackgroundDrawable(drawableE);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.q = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.k0) != null) {
            return;
        }
        Object obj = this.o;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.l0) != null) {
            pg.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.l0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.k0 = pg.a(activity);
            } else {
                this.k0 = null;
            }
        }
        J();
    }

    public final void r(int i, ug ugVar, nn1 nn1Var) {
        if (nn1Var == null) {
            if (ugVar == null && i >= 0) {
                ug[] ugVarArr = this.Q;
                if (i < ugVarArr.length) {
                    ugVar = ugVarArr[i];
                }
            }
            if (ugVar != null) {
                nn1Var = ugVar.h;
            }
        }
        if ((ugVar == null || ugVar.m) && !this.V) {
            qg qgVar = this.r;
            Window.Callback callback = this.q.getCallback();
            qgVar.getClass();
            try {
                qgVar.j = true;
                callback.onPanelClosed(i, nn1Var);
            } finally {
                qgVar.j = false;
            }
        }
    }

    public final void s(nn1 nn1Var) {
        z2 z2Var;
        if (this.P) {
            return;
        }
        this.P = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.v;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((bj3) actionBarOverlayLayout.j).a.f;
        if (actionMenuView != null && (z2Var = actionMenuView.y) != null) {
            z2Var.c();
            v2 v2Var = z2Var.y;
            if (v2Var != null && v2Var.b()) {
                v2Var.i.dismiss();
            }
        }
        Window.Callback callback = this.q.getCallback();
        if (callback != null && !this.V) {
            callback.onPanelClosed(108, nn1Var);
        }
        this.P = false;
    }

    public final void t(ug ugVar, boolean z) {
        tg tgVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && ugVar.a == 0 && (actionBarOverlayLayout = this.v) != null) {
            actionBarOverlayLayout.k();
            if (((bj3) actionBarOverlayLayout.j).a.o()) {
                s(ugVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.p.getSystemService("window");
        if (windowManager != null && ugVar.m && (tgVar = ugVar.e) != null) {
            windowManager.removeView(tgVar);
            if (z) {
                r(ugVar.a, ugVar, null);
            }
        }
        ugVar.k = false;
        ugVar.l = false;
        ugVar.m = false;
        ugVar.f = null;
        ugVar.n = true;
        if (this.R == ugVar) {
            this.R = null;
        }
        if (ugVar.a == 0) {
            J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(KeyEvent keyEvent) {
        View decorView;
        boolean zU;
        boolean zH;
        ActionMenuView actionMenuView;
        z2 z2Var;
        Object obj = this.o;
        if ((!(obj instanceof f71) && !(obj instanceof t4)) || (decorView = this.q.getDecorView()) == null || !lr.w(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                qg qgVar = this.r;
                Window.Callback callback = this.q.getCallback();
                qgVar.getClass();
                try {
                    qgVar.i = true;
                    if (!callback.dispatchKeyEvent(keyEvent)) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode == 4) {
                                this.S = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    ug ugVarA = A(0);
                                    if (!ugVarA.m) {
                                        H(ugVarA, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.y == null) {
                                    ug ugVarA2 = A(0);
                                    ActionBarOverlayLayout actionBarOverlayLayout = this.v;
                                    Context context = this.p;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.k();
                                        Toolbar toolbar = ((bj3) actionBarOverlayLayout.j).a;
                                        if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f) == null || !actionMenuView.x || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            boolean z = ugVarA2.m;
                                            if (z || ugVarA2.l) {
                                                t(ugVarA2, true);
                                                zU = z;
                                                if (zU) {
                                                    AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                                    if (audioManager != null) {
                                                        audioManager.playSoundEffect(0);
                                                        return true;
                                                    }
                                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                                    return true;
                                                }
                                            } else {
                                                if (ugVarA2.k) {
                                                    if (ugVarA2.o) {
                                                        ugVarA2.k = false;
                                                        zH = H(ugVarA2, keyEvent);
                                                    } else {
                                                        zH = true;
                                                    }
                                                    if (zH) {
                                                        F(ugVarA2, keyEvent);
                                                        zU = true;
                                                        if (zU) {
                                                        }
                                                    }
                                                }
                                                zU = false;
                                                if (zU) {
                                                }
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
                                            actionBarOverlayLayout2.k();
                                            if (((bj3) actionBarOverlayLayout2.j).a.o()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = this.v;
                                                actionBarOverlayLayout3.k();
                                                ActionMenuView actionMenuView2 = ((bj3) actionBarOverlayLayout3.j).a.f;
                                                if (actionMenuView2 != null && (z2Var = actionMenuView2.y) != null && z2Var.c()) {
                                                    zU = true;
                                                }
                                                if (zU) {
                                                }
                                            } else {
                                                if (!this.V && H(ugVarA2, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.v;
                                                    actionBarOverlayLayout4.k();
                                                    zU = ((bj3) actionBarOverlayLayout4.j).a.u();
                                                }
                                                if (zU) {
                                                }
                                            }
                                            zU = false;
                                            if (zU) {
                                            }
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                        if (!E()) {
                            return false;
                        }
                    }
                } finally {
                    qgVar.i = false;
                }
            }
        }
        return true;
    }

    public final void w(int i) {
        ug ugVarA = A(i);
        if (ugVarA.h != null) {
            Bundle bundle = new Bundle();
            ugVarA.h.t(bundle);
            if (bundle.size() > 0) {
                ugVarA.p = bundle;
            }
            ugVarA.h.w();
            ugVarA.h.clear();
        }
        ugVarA.o = true;
        ugVarA.n = true;
        if ((i == 108 || i == 0) && this.v != null) {
            ug ugVarA2 = A(0);
            ugVarA2.k = false;
            H(ugVarA2, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.E) {
            return;
        }
        Context context = this.p;
        int[] iArr = pf2.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            c.q("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            h(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            h(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            h(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            h(10);
        }
        this.N = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        y();
        this.q.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.O) {
            viewGroup = this.M ? (ViewGroup) layoutInflaterFrom.inflate(top.th1nk.samp.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(top.th1nk.samp.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(top.th1nk.samp.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(top.th1nk.samp.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new o40(context, typedValue.resourceId) : context).inflate(top.th1nk.samp.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(top.th1nk.samp.R.id.decor_content_parent);
            this.v = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.q.getCallback());
            if (this.L) {
                this.v.j(109);
            }
            if (this.I) {
                this.v.j(2);
            }
            if (this.J) {
                this.v.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
        }
        lg lgVar = new lg(this, i);
        WeakHashMap weakHashMap = mq3.a;
        fq3.c(viewGroup, lgVar);
        if (this.v == null) {
            this.G = (TextView) viewGroup.findViewById(top.th1nk.samp.R.id.title);
        }
        boolean z = kr3.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(top.th1nk.samp.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.q.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new lg(this, i2));
        this.F = viewGroup;
        Object obj = this.o;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.u;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.v;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                j2 j2Var = this.s;
                if (j2Var != null) {
                    j2Var.n(title);
                } else {
                    TextView textView = this.G;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.F.findViewById(R.id.content);
        View decorView = this.q.getDecorView();
        contentFrameLayout2.l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.E = true;
        ug ugVarA = A(0);
        if (this.V || ugVarA.h != null) {
            return;
        }
        C(108);
    }

    public final void y() {
        if (this.q == null) {
            Object obj = this.o;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.q != null) {
            return;
        }
        c.q("We have not been given a Window");
    }

    public final d1 z(Context context) {
        if (this.b0 == null) {
            if (pi.o == null) {
                Context applicationContext = context.getApplicationContext();
                pi.o = new pi(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.b0 = new rg(this, pi.o);
        }
        return this.b0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
