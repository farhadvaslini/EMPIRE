package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(defpackage.ug r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg.F(ug, android.view.KeyEvent):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(defpackage.ug r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg.H(ug, android.view.KeyEvent):boolean");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.o
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.jg.m
            monitor-enter(r0)
            defpackage.jg.f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.d0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.q
            android.view.View r0 = r0.getDecorView()
            kg r1 = r3.f0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.V = r0
            int r0 = r3.X
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.o
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            w33 r0 = defpackage.vg.m0
            java.lang.Object r1 = r3.o
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            w33 r0 = defpackage.vg.m0
            java.lang.Object r1 = r3.o
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            j2 r0 = r3.s
            if (r0 == 0) goto L63
            r0.h()
        L63:
            rg r0 = r3.b0
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            rg r3 = r3.c0
            if (r3 == 0) goto L71
            r3.c()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg.e():void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.nn1 r6) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg.l(nn1):void");
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
                    theme.resolveAttribute(2130903050, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        o40 o40Var = new o40(context, 0);
                        o40Var.getTheme().setTo(themeNewTheme);
                        context = o40Var;
                    }
                    this.z = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, 2130903065);
                    this.A = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    this.A.setContentView(this.z);
                    this.A.setWidth(-1);
                    context.getTheme().resolveAttribute(2130903044, typedValue, true);
                    this.z.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    this.A.setHeight(-2);
                    this.B = new kg(this, i);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.F.findViewById(2131230773);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg.o(boolean, boolean):boolean");
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
                hhVar = new ch(o40Var, attributeSet, 2130903213);
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
                hhVar = new xf(o40Var, attributeSet, 2130903091);
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
                    new bq3(2131230894, Boolean.class, 0, 28, 2).f(hhVar, Boolean.valueOf(z));
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
                    new bq3(2131230900, Boolean.class, 0, 28, 0).f(hhVar, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return hhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.q
            if (r1 != 0) goto L7e
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof defpackage.qg
            if (r2 != 0) goto L7a
            qg r0 = new qg
            r0.<init>(r7, r1)
            r7.r = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.p
            int[] r1 = defpackage.vg.n0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            yg r4 = defpackage.yg.a()
            monitor-enter(r4)
            zl2 r5 = r4.a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.e(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r7
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.q = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.k0
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.o
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.l0
            if (r1 == 0) goto L61
            defpackage.pg.c(r8, r1)
            r7.l0 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = defpackage.pg.a(r0)
            r7.k0 = r8
            goto L76
        L74:
            r7.k0 = r2
        L76:
            r7.J()
        L79:
            return
        L7a:
            defpackage.c.q(r0)
            return
        L7e:
            defpackage.c.q(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg.p(android.view.Window):void");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vg.v(android.view.KeyEvent):boolean");
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
            viewGroup = this.M ? (ViewGroup) layoutInflaterFrom.inflate(2131427350, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(2131427349, (ViewGroup) null);
        } else if (this.N) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(2131427340, (ViewGroup) null);
            this.L = false;
            this.K = false;
        } else if (this.K) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130903050, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new o40(context, typedValue.resourceId) : context).inflate(2131427351, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(2131230806);
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
            this.G = (TextView) viewGroup.findViewById(2131230912);
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(2131230760);
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
