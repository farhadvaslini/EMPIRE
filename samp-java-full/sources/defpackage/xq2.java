package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xq2 implements zq3 {
    public final Application a;
    public final yq3 b;
    public final Bundle c;
    public final gf1 d;
    public final tq2 e;

    public xq2(Application application, wq2 wq2Var, Bundle bundle) {
        yq3 yq3Var;
        this.e = wq2Var.getSavedStateRegistry();
        this.d = wq2Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (yq3.c == null) {
                yq3.c = new yq3(application);
            }
            yq3Var = yq3.c;
            yq3Var.getClass();
        } else {
            yq3Var = new yq3(null);
        }
        this.b = yq3Var;
    }

    @Override // defpackage.zq3
    public final vq3 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        c.p("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.zq3
    public final vq3 b(Class cls, lr1 lr1Var) {
        ak2 ak2Var = r51.O1;
        LinkedHashMap linkedHashMap = lr1Var.a;
        String str = (String) linkedHashMap.get(ak2Var);
        if (str == null) {
            c.q("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(f80.B0) == null || linkedHashMap.get(f80.C0) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            c.q("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(yq3.d);
        boolean zIsAssignableFrom = vc.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? yq2.a(cls, yq2.b) : yq2.a(cls, yq2.a);
        return constructorA == null ? this.b.b(cls, lr1Var) : (!zIsAssignableFrom || application == null) ? yq2.b(cls, constructorA, f80.z(lr1Var)) : yq2.b(cls, constructorA, application, f80.z(lr1Var));
    }

    @Override // defpackage.zq3
    public final vq3 c(lu luVar, lr1 lr1Var) {
        return b(uq.t(luVar), lr1Var);
    }

    public final vq3 d(Class cls, String str) {
        lq2 lq2Var;
        gf1 gf1Var = this.d;
        if (gf1Var == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = vc.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? yq2.a(cls, yq2.b) : yq2.a(cls, yq2.a);
        if (constructorA == null) {
            if (application != null) {
                return this.b.a(cls);
            }
            if (ar3.a == null) {
                ar3.a = new ar3();
            }
            ar3.a.getClass();
            return br.q(cls);
        }
        tq2 tq2Var = this.e;
        tq2Var.getClass();
        Bundle bundleA = tq2Var.a(str);
        if (bundleA == null) {
            bundleA = this.c;
        }
        if (bundleA == null) {
            lq2Var = new lq2();
        } else {
            ClassLoader classLoader = lq2.class.getClassLoader();
            classLoader.getClass();
            bundleA.setClassLoader(classLoader);
            cm1 cm1Var = new cm1(bundleA.size());
            for (String str2 : bundleA.keySet()) {
                str2.getClass();
                cm1Var.put(str2, bundleA.get(str2));
            }
            lq2Var = new lq2(om1.W(cm1Var));
        }
        mq2 mq2Var = new mq2(str, lq2Var);
        mq2Var.h(gf1Var, tq2Var);
        ff1 ff1Var = ((rf1) gf1Var).i;
        if (ff1Var == ff1.g || ff1Var.compareTo(ff1.i) >= 0) {
            tq2Var.d();
        } else {
            gf1Var.a(new c90(gf1Var, tq2Var));
        }
        vq3 vq3VarB = (!zIsAssignableFrom || application == null) ? yq2.b(cls, constructorA, lq2Var) : yq2.b(cls, constructorA, application, lq2Var);
        vq3VarB.a("androidx.lifecycle.savedstate.vm.tag", mq2Var);
        return vq3VarB;
    }

    public xq2() {
        this.b = new yq3(null);
    }
}
