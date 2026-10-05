package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class xz extends wz implements cr3, rx0, wq2, yy1, mv1, d4 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final pz Companion = new pz();
    private br3 _viewModelStore;
    private final z3 activityResultRegistry;
    private int contentLayoutId;
    private final lc1 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final lc1 fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final AtomicInteger nextLocalRequestCode;
    private final lc1 onBackPressedDispatcher$delegate;
    private final lc1 onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<q30> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<q30> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<q30> onNewIntentListeners;
    private final CopyOnWriteArrayList<q30> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<q30> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<q30> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final sz reportFullyDrawnExecutor;
    private final uq2 savedStateRegistryController;
    private final h40 contextAwareHelper = new h40();
    private final sn1 menuHostHelper = new sn1(new lz(this, 1));

    public xz() {
        vq2 vq2Var = new vq2(this, new it1(14, this));
        uq2 uq2Var = new uq2(vq2Var);
        this.savedStateRegistryController = uq2Var;
        this.reportFullyDrawnExecutor = new tz(this);
        this.fullyDrawnReporter$delegate = new xb3(new mz(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new vz(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = new xb3(new mz(this, 2));
        if (super.getLifecycle() == null) {
            c.q("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i = 0;
        super.getLifecycle().a(new mf1(this) { // from class: oz
            public final /* synthetic */ xz g;

            {
                this.g = this;
            }

            @Override // defpackage.mf1
            public final void i(of1 of1Var, ef1 ef1Var) {
                Window window;
                View viewPeekDecorView;
                int i2 = i;
                xz xzVar = this.g;
                switch (i2) {
                    case 0:
                        if (ef1Var == ef1.ON_STOP && (window = xzVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        xz.c(xzVar, of1Var, ef1Var);
                        break;
                }
            }
        });
        final int i2 = 1;
        super.getLifecycle().a(new mf1(this) { // from class: oz
            public final /* synthetic */ xz g;

            {
                this.g = this;
            }

            @Override // defpackage.mf1
            public final void i(of1 of1Var, ef1 ef1Var) {
                Window window;
                View viewPeekDecorView;
                int i22 = i2;
                xz xzVar = this.g;
                switch (i22) {
                    case 0:
                        if (ef1Var == ef1.ON_STOP && (window = xzVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        xz.c(xzVar, of1Var, ef1Var);
                        break;
                }
            }
        });
        super.getLifecycle().a(new ik2(i2, this));
        vq2Var.a();
        f80.A(this);
        uq2Var.b.c(ACTIVITY_RESULT_TAG, new hr0(1, this));
        addOnContextAvailableListener(new jr0(this, 1));
        this.defaultViewModelProviderFactory$delegate = new xb3(new mz(this, 3));
        this.onBackPressedDispatcher$delegate = new xb3(new mz(this, 4));
    }

    public static Bundle a(xz xzVar) {
        Bundle bundle = new Bundle();
        z3 z3Var = xzVar.activityResultRegistry;
        z3Var.getClass();
        LinkedHashMap linkedHashMap = z3Var.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(z3Var.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(z3Var.g));
        return bundle;
    }

    public static bs0 b(xz xzVar) {
        return new bs0(xzVar.reportFullyDrawnExecutor, new mz(xzVar, 0));
    }

    public static void c(xz xzVar, of1 of1Var, ef1 ef1Var) {
        if (ef1Var == ef1.ON_DESTROY) {
            xzVar.contextAwareHelper.b = null;
            if (!xzVar.isChangingConfigurations()) {
                xzVar.getViewModelStore().a();
            }
            tz tzVar = (tz) xzVar.reportFullyDrawnExecutor;
            xz xzVar2 = tzVar.i;
            xzVar2.getWindow().getDecorView().removeCallbacks(tzVar);
            xzVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(tzVar);
        }
    }

    public static void d(xz xzVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!s51.n(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!s51.n(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    public static void e(xz xzVar, Context context) {
        context.getClass();
        Bundle bundleA = xzVar.savedStateRegistryController.b.a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            z3 z3Var = xzVar.activityResultRegistry;
            LinkedHashMap linkedHashMap = z3Var.b;
            LinkedHashMap linkedHashMap2 = z3Var.a;
            Bundle bundle = z3Var.g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                z3Var.d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        cl3.g(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                z3Var.b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        sz szVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((tz) szVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public final void addMenuProvider(qo1 qo1Var, of1 of1Var) {
        qo1Var.getClass();
        of1Var.getClass();
        sn1 sn1Var = this.menuHostHelper;
        sn1Var.b.add(qo1Var);
        sn1Var.a.run();
        gf1 lifecycle = of1Var.getLifecycle();
        HashMap map = sn1Var.c;
        rn1 rn1Var = (rn1) map.remove(qo1Var);
        if (rn1Var != null) {
            rn1Var.a.b(rn1Var.b);
            rn1Var.b = null;
        }
        map.put(qo1Var, new rn1(lifecycle, new nz(1, sn1Var, qo1Var)));
    }

    public final void addOnConfigurationChangedListener(q30 q30Var) {
        q30Var.getClass();
        this.onConfigurationChangedListeners.add(q30Var);
    }

    public final void addOnContextAvailableListener(zy1 zy1Var) {
        zy1Var.getClass();
        h40 h40Var = this.contextAwareHelper;
        h40Var.getClass();
        xz xzVar = h40Var.b;
        if (xzVar != null) {
            zy1Var.a(xzVar);
        }
        h40Var.a.add(zy1Var);
    }

    public final void addOnMultiWindowModeChangedListener(q30 q30Var) {
        q30Var.getClass();
        this.onMultiWindowModeChangedListeners.add(q30Var);
    }

    public final void addOnNewIntentListener(q30 q30Var) {
        q30Var.getClass();
        this.onNewIntentListeners.add(q30Var);
    }

    public final void addOnPictureInPictureModeChangedListener(q30 q30Var) {
        q30Var.getClass();
        this.onPictureInPictureModeChangedListeners.add(q30Var);
    }

    public final void addOnPictureInPictureUiStateChangedListener(q30 q30Var) {
        q30Var.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(q30Var);
    }

    public final void addOnTrimMemoryListener(q30 q30Var) {
        q30Var.getClass();
        this.onTrimMemoryListeners.add(q30Var);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final void enterPictureInPictureMode(d62 d62Var) {
        throw null;
    }

    public final void f(xy1 xy1Var) {
        super.getLifecycle().a(new nz(0, xy1Var, this));
    }

    public final void g() {
        if (this._viewModelStore == null) {
            rz rzVar = (rz) getLastNonConfigurationInstance();
            if (rzVar != null) {
                this._viewModelStore = rzVar.a;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new br3();
            }
        }
    }

    @Override // defpackage.d4
    public final z3 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.rx0
    public final e60 getDefaultViewModelCreationExtras() {
        lr1 lr1Var = new lr1();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = lr1Var.a;
        if (application != null) {
            linkedHashMap.put(yq3.d, getApplication());
        }
        linkedHashMap.put(f80.B0, this);
        linkedHashMap.put(f80.C0, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(f80.D0, extras);
        }
        return lr1Var;
    }

    @Override // defpackage.rx0
    public final zq3 getDefaultViewModelProviderFactory() {
        return (zq3) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public final bs0 getFullyDrawnReporter() {
        return (bs0) this.fullyDrawnReporter$delegate.getValue();
    }

    @za0
    public final Object getLastCustomNonConfigurationInstance() {
        return null;
    }

    @Override // defpackage.wz, defpackage.of1
    public final gf1 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // defpackage.mv1
    public final lv1 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().c;
    }

    @Override // defpackage.yy1
    public final xy1 getOnBackPressedDispatcher() {
        return (xy1) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // defpackage.wq2
    public final tq2 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.cr3
    public final br3 getViewModelStore() {
        if (getApplication() == null) {
            c.q("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        g();
        br3 br3Var = this._viewModelStore;
        br3Var.getClass();
        return br3Var;
    }

    public final void initializeViewTreeOwners() {
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
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(2131230858, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(2131230925, this);
    }

    public final void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @za0
    public final void onBackPressed() {
        ((sb0) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<q30> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // defpackage.wz, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        h40 h40Var = this.contextAwareHelper;
        h40Var.getClass();
        h40Var.b = this;
        Iterator it = h40Var.a.iterator();
        while (it.hasNext()) {
            ((zy1) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = kl2.g;
        il2.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        sn1 sn1Var = this.menuHostHelper;
        getMenuInflater();
        sn1Var.a();
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        this.menuHostHelper.b();
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<q30> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new kr1(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<q30> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ur0 ur0Var = ((rr0) ((qo1) it.next())).a;
            if (ur0Var.q >= 1) {
                Iterator it2 = ur0Var.c.v().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        qn1.b();
                        return;
                    }
                }
            }
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<q30> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new c62(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        h01 h01Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        int i2 = 15;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            h01Var = new h01(i2);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            h01Var = new h01(i2);
        } else {
            h01Var = new h01(i2);
        }
        Iterator<q30> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(h01Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.menuHostHelper.c();
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @za0
    public final Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        rz rzVar;
        br3 br3Var = this._viewModelStore;
        if (br3Var == null && (rzVar = (rz) getLastNonConfigurationInstance()) != null) {
            br3Var = rzVar.a;
        }
        if (br3Var == null) {
            return null;
        }
        rz rzVar2 = new rz();
        rzVar2.a = br3Var;
        return rzVar2;
    }

    @Override // defpackage.wz, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (super.getLifecycle() != null) {
            gf1 lifecycle = super.getLifecycle();
            lifecycle.getClass();
            rf1 rf1Var = (rf1) lifecycle;
            rf1Var.d("setCurrentState");
            rf1Var.f(ff1.h);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<q30> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> s3 registerForActivityResult(final q3 q3Var, final z3 z3Var, final o3 o3Var) {
        q3Var.getClass();
        z3Var.getClass();
        o3Var.getClass();
        final String str = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        LinkedHashMap linkedHashMap = z3Var.c;
        gf1 lifecycle = getLifecycle();
        if (((rf1) lifecycle).i.compareTo(ff1.i) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            ff1 ff1Var = ((rf1) lifecycle).i;
            sb.append(" is attempting to register while current state is ");
            sb.append(ff1Var);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        z3Var.d(str);
        x3 x3Var = (x3) linkedHashMap.get(str);
        if (x3Var == null) {
            x3Var = new x3(lifecycle);
        }
        mf1 mf1Var = new mf1() { // from class: u3
            @Override // defpackage.mf1
            public final void i(of1 of1Var, ef1 ef1Var) {
                z3 z3Var2 = z3Var;
                LinkedHashMap linkedHashMap2 = z3Var2.e;
                ef1 ef1Var2 = ef1.ON_START;
                String str2 = str;
                if (ef1Var2 != ef1Var) {
                    if (ef1.ON_STOP == ef1Var) {
                        linkedHashMap2.remove(str2);
                        return;
                    } else {
                        if (ef1.ON_DESTROY == ef1Var) {
                            z3Var2.e(str2);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = z3Var2.g;
                LinkedHashMap linkedHashMap3 = z3Var2.f;
                q3 q3Var2 = q3Var;
                o3 o3Var2 = o3Var;
                linkedHashMap2.put(str2, new w3(q3Var2, o3Var2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    o3Var2.a(obj);
                }
                n3 n3Var = (n3) gv3.F(str2, bundle);
                if (n3Var != null) {
                    bundle.remove(str2);
                    o3Var2.a(q3Var2.c(n3Var.g, n3Var.f));
                }
            }
        };
        x3Var.a.a(mf1Var);
        x3Var.b.add(mf1Var);
        linkedHashMap.put(str, x3Var);
        return new y3(z3Var, str, q3Var, 0);
    }

    public final void removeMenuProvider(qo1 qo1Var) {
        qo1Var.getClass();
        this.menuHostHelper.d(qo1Var);
    }

    public final void removeOnConfigurationChangedListener(q30 q30Var) {
        q30Var.getClass();
        this.onConfigurationChangedListeners.remove(q30Var);
    }

    public final void removeOnContextAvailableListener(zy1 zy1Var) {
        zy1Var.getClass();
        h40 h40Var = this.contextAwareHelper;
        h40Var.getClass();
        h40Var.a.remove(zy1Var);
    }

    public final void removeOnMultiWindowModeChangedListener(q30 q30Var) {
        q30Var.getClass();
        this.onMultiWindowModeChangedListeners.remove(q30Var);
    }

    public final void removeOnNewIntentListener(q30 q30Var) {
        q30Var.getClass();
        this.onNewIntentListeners.remove(q30Var);
    }

    public final void removeOnPictureInPictureModeChangedListener(q30 q30Var) {
        q30Var.getClass();
        this.onPictureInPictureModeChangedListeners.remove(q30Var);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(q30 q30Var) {
        q30Var.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(q30Var);
    }

    public final void removeOnTrimMemoryListener(q30 q30Var) {
        q30Var.getClass();
        this.onTrimMemoryListeners.remove(q30Var);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (b32.t()) {
                b32.d("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            bs0 fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                try {
                    fullyDrawnReporter.b = true;
                    ArrayList arrayList = fullyDrawnReporter.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((cs0) obj).a();
                    }
                    fullyDrawnReporter.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        sz szVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((tz) szVar).a(decorView);
        super.setContentView(i);
    }

    public final void setPictureInPictureParams(d62 d62Var) {
        throw null;
    }

    @Override // android.app.Activity
    @za0
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @za0
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @za0
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @za0
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        sz szVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((tz) szVar).a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        sz szVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((tz) szVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @za0
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<q30> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new kr1(z));
        }
    }

    @Override // android.app.Activity
    @za0
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<q30> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new c62(z));
        }
    }

    public final void addMenuProvider(qo1 qo1Var) {
        qo1Var.getClass();
        sn1 sn1Var = this.menuHostHelper;
        sn1Var.b.add(qo1Var);
        sn1Var.a.run();
    }

    public final void addMenuProvider(qo1 qo1Var, of1 of1Var, ff1 ff1Var) {
        qo1Var.getClass();
        of1Var.getClass();
        ff1Var.getClass();
        sn1 sn1Var = this.menuHostHelper;
        sn1Var.getClass();
        gf1 lifecycle = of1Var.getLifecycle();
        HashMap map = sn1Var.c;
        rn1 rn1Var = (rn1) map.remove(qo1Var);
        if (rn1Var != null) {
            rn1Var.a.b(rn1Var.b);
            rn1Var.b = null;
        }
        map.put(qo1Var, new rn1(lifecycle, new kf1(sn1Var, ff1Var, qo1Var, 1)));
    }

    public final <I, O> s3 registerForActivityResult(q3 q3Var, o3 o3Var) {
        q3Var.getClass();
        o3Var.getClass();
        return registerForActivityResult(q3Var, this.activityResultRegistry, o3Var);
    }
}
