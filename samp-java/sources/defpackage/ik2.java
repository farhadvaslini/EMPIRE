package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ik2 implements mf1 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ ik2(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.mf1
    public final void i(of1 of1Var, ef1 ef1Var) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                wq2 wq2Var = (wq2) obj;
                if (ef1Var != ef1.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                of1Var.getLifecycle().b(this);
                Bundle bundleA = wq2Var.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    c.q("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, ik2.class.getClassLoader()).asSubclass(rq2.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(wq2Var instanceof cr3)) {
                                    qn1.g(wq2Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                                    return;
                                }
                                LinkedHashMap linkedHashMap = ((cr3) wq2Var).getViewModelStore().a;
                                tq2 savedStateRegistry = wq2Var.getSavedStateRegistry();
                                Iterator it = qx.R0(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    vq3 vq3Var = (vq3) linkedHashMap.get(it.next());
                                    if (vq3Var != null) {
                                        vp.q(vq3Var, savedStateRegistry, wq2Var.getLifecycle());
                                    }
                                }
                                if (!qx.R0(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(by1.g("Failed to instantiate ", str2), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(nc2.i("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            case 1:
                xz xzVar = (xz) obj;
                xzVar.g();
                xzVar.getLifecycle().b(this);
                return;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                new HashMap();
                sv0[] sv0VarArr = (sv0[]) obj;
                if (sv0VarArr.length > 0) {
                    sv0 sv0Var = sv0VarArr[0];
                    throw null;
                }
                if (sv0VarArr.length <= 0) {
                    return;
                }
                sv0 sv0Var2 = sv0VarArr[0];
                throw null;
            default:
                if (ef1Var != ef1.ON_CREATE) {
                    qn1.g(ef1Var, "Next event must be ON_CREATE, it was ");
                    return;
                } else {
                    of1Var.getLifecycle().b(this);
                    ((pq2) obj).b();
                    return;
                }
        }
    }
}
