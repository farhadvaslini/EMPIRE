package defpackage;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class lr0 extends xz {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final nr0 mFragments;
    boolean mResumed;
    final rf1 mFragmentLifecycleRegistry = new rf1(this, true);
    boolean mStopped = true;

    public lr0() {
        final wf wfVar = (wf) this;
        this.mFragments = new nr0(new kr0(wfVar));
        getSavedStateRegistry().c(LIFECYCLE_TAG, new hr0(0, wfVar));
        final int i = 0;
        addOnConfigurationChangedListener(new q30() { // from class: ir0
            @Override // defpackage.q30
            public final void accept(Object obj) {
                int i2 = i;
                wf wfVar2 = wfVar;
                switch (i2) {
                    case 0:
                        wfVar2.mFragments.a();
                        break;
                    default:
                        wfVar2.mFragments.a();
                        break;
                }
            }
        });
        final int i2 = 1;
        addOnNewIntentListener(new q30() { // from class: ir0
            @Override // defpackage.q30
            public final void accept(Object obj) {
                int i22 = i2;
                wf wfVar2 = wfVar;
                switch (i22) {
                    case 0:
                        wfVar2.mFragments.a();
                        break;
                    default:
                        wfVar2.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new jr0(wfVar, 0));
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.h.e.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                br3 viewModelStore = getViewModelStore();
                z90 z90Var = fj1.c;
                d60 d60Var = d60.b;
                d60Var.getClass();
                pl plVar = new pl(viewModelStore, z90Var, d60Var);
                lu luVarA = rk2.a(fj1.class);
                String strB = luVarA.b();
                if (strB == null) {
                    c.p("Local and anonymous classes can not be ViewModels");
                    return;
                }
                l83 l83Var = ((fj1) plVar.y(luVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB))).b;
                if (l83Var.e() > 0) {
                    printWriter.print(str2);
                    printWriter.println("Loaders:");
                    if (l83Var.e() > 0) {
                        if (l83Var.f(0) != null) {
                            qn1.b();
                            return;
                        }
                        printWriter.print(str2);
                        printWriter.print("  #");
                        printWriter.print(l83Var.c(0));
                        printWriter.print(": ");
                        throw null;
                    }
                }
            }
            vr0 vr0Var = this.mFragments.a.h;
            vr0Var.getClass();
            String str3 = str + "    ";
            pl plVar2 = vr0Var.c;
            ArrayList arrayList = (ArrayList) plVar2.g;
            HashMap map = (HashMap) plVar2.h;
            if (!map.isEmpty()) {
                printWriter.print(str);
                printWriter.println("Active Fragments:");
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    nc2.u(it.next());
                    printWriter.print(str);
                    printWriter.println("null");
                }
            }
            int size2 = arrayList.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                if (size2 > 0) {
                    if (arrayList.get(0) != null) {
                        qn1.b();
                        return;
                    }
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(0);
                    printWriter.print(": ");
                    throw null;
                }
            }
            ArrayList arrayList2 = vr0Var.d;
            if (arrayList2 != null && (size = arrayList2.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i = 0; i < size; i++) {
                    cl clVar = (cl) vr0Var.d.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(clVar.toString());
                    clVar.b(str3, printWriter, true);
                }
            }
            printWriter.print(str);
            printWriter.println("Back Stack Index: " + vr0Var.h.get());
            synchronized (vr0Var.a) {
                try {
                    int size3 = vr0Var.a.size();
                    if (size3 > 0) {
                        printWriter.print(str);
                        printWriter.println("Pending Actions:");
                        for (int i2 = 0; i2 < size3; i2++) {
                            cl clVar2 = (cl) vr0Var.a.get(i2);
                            printWriter.print(str);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                            printWriter.println(clVar2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            printWriter.print(str);
            printWriter.println("FragmentManager misc state:");
            printWriter.print(str);
            printWriter.print("  mHost=");
            printWriter.println(vr0Var.r);
            printWriter.print(str);
            printWriter.print("  mContainer=");
            printWriter.println(vr0Var.s);
            printWriter.print(str);
            printWriter.print("  mCurState=");
            printWriter.print(vr0Var.q);
            printWriter.print(" mStateSaved=");
            printWriter.print(vr0Var.y);
            printWriter.print(" mStopped=");
            printWriter.print(vr0Var.z);
            printWriter.print(" mDestroyed=");
            printWriter.println(vr0Var.A);
        }
    }

    public final ur0 getSupportFragmentManager() {
        return this.mFragments.a.h;
    }

    @Deprecated
    public final ej1 getSupportLoaderManager() {
        return new gj1(this, getViewModelStore());
    }

    public final void markFragmentsCreated() {
        Iterator it = ((vr0) getSupportFragmentManager()).c.v().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                qn1.b();
                return;
            }
        }
    }

    @Override // defpackage.xz, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.xz, defpackage.wz, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(ef1.ON_CREATE);
        vr0 vr0Var = this.mFragments.a.h;
        vr0Var.y = false;
        vr0Var.z = false;
        vr0Var.E.getClass();
        vr0Var.c(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        vr0 vr0Var = this.mFragments.a.h;
        boolean zIsChangingConfigurations = true;
        vr0Var.A = true;
        vr0Var.e(true);
        Iterator it = vr0Var.b().iterator();
        if (it.hasNext()) {
            ((n83) it.next()).a();
            throw null;
        }
        pl plVar = vr0Var.c;
        kr0 kr0Var = vr0Var.r;
        if (kr0Var != null) {
            zIsChangingConfigurations = ((xr0) plVar.j).e;
        } else {
            wf wfVar = kr0Var.f;
            if (wfVar != null) {
                zIsChangingConfigurations = true ^ wfVar.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it2 = vr0Var.i.values().iterator();
            while (it2.hasNext()) {
                ArrayList arrayList = ((el) it2.next()).f;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    String str = (String) obj;
                    xr0 xr0Var = (xr0) plVar.j;
                    xr0Var.getClass();
                    if (ur0.h(3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    HashMap map = xr0Var.d;
                    HashMap map2 = xr0Var.c;
                    xr0 xr0Var2 = (xr0) map2.get(str);
                    if (xr0Var2 != null) {
                        xr0Var2.d();
                        map2.remove(str);
                    }
                    br3 br3Var = (br3) map.get(str);
                    if (br3Var != null) {
                        br3Var.a();
                        map.remove(str);
                    }
                }
            }
        }
        vr0Var.c(-1);
        kr0 kr0Var2 = vr0Var.r;
        if (kr0Var2 != null) {
            kr0Var2.i.removeOnTrimMemoryListener(vr0Var.m);
        }
        kr0 kr0Var3 = vr0Var.r;
        if (kr0Var3 != null) {
            kr0Var3.i.removeOnConfigurationChangedListener(vr0Var.l);
        }
        kr0 kr0Var4 = vr0Var.r;
        if (kr0Var4 != null) {
            kr0Var4.i.removeOnMultiWindowModeChangedListener(vr0Var.n);
        }
        kr0 kr0Var5 = vr0Var.r;
        if (kr0Var5 != null) {
            kr0Var5.i.removeOnPictureInPictureModeChangedListener(vr0Var.o);
        }
        kr0 kr0Var6 = vr0Var.r;
        if (kr0Var6 != null) {
            kr0Var6.i.removeMenuProvider(vr0Var.p);
        }
        vr0Var.r = null;
        vr0Var.s = null;
        if (vr0Var.f != null) {
            vr0Var.g.e();
            vr0Var.f = null;
        }
        y3 y3Var = vr0Var.u;
        if (y3Var != null) {
            y3Var.b();
            vr0Var.v.b();
            vr0Var.w.b();
        }
        this.mFragmentLifecycleRegistry.e(ef1.ON_DESTROY);
    }

    @Override // defpackage.xz, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            vr0 vr0Var = this.mFragments.a.h;
            if (vr0Var.q >= 1) {
                Iterator it = vr0Var.c.v().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next() != null) {
                        qn1.b();
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.h.c(5);
        this.mFragmentLifecycleRegistry.e(ef1.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // defpackage.xz, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.h.e(true);
    }

    public final void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(ef1.ON_RESUME);
        vr0 vr0Var = this.mFragments.a.h;
        vr0Var.y = false;
        vr0Var.z = false;
        vr0Var.E.getClass();
        vr0Var.c(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            vr0 vr0Var = this.mFragments.a.h;
            vr0Var.y = false;
            vr0Var.z = false;
            vr0Var.E.getClass();
            vr0Var.c(4);
        }
        this.mFragments.a.h.e(true);
        this.mFragmentLifecycleRegistry.e(ef1.ON_START);
        vr0 vr0Var2 = this.mFragments.a.h;
        vr0Var2.y = false;
        vr0Var2.z = false;
        vr0Var2.E.getClass();
        vr0Var2.c(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        vr0 vr0Var = this.mFragments.a.h;
        vr0Var.z = true;
        vr0Var.E.getClass();
        vr0Var.c(4);
        this.mFragmentLifecycleRegistry.e(ef1.ON_STOP);
    }

    public final void setEnterSharedElementCallback(n23 n23Var) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public final void setExitSharedElementCallback(n23 n23Var) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public final void startActivityFromFragment(gr0 gr0Var, Intent intent, int i, Bundle bundle) {
        if (i != -1) {
            throw null;
        }
        startActivityForResult(intent, -1, bundle);
    }

    @Deprecated
    public final void startIntentSenderFromFragment(gr0 gr0Var, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i != -1) {
            throw null;
        }
        startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    public final void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public final void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    public final void startActivityFromFragment(gr0 gr0Var, Intent intent, int i) {
        startActivityFromFragment(gr0Var, intent, i, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Deprecated
    public final void onAttachFragment(gr0 gr0Var) {
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
