package defpackage;

import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qt1 implements of1, cr3, rx0, wq2 {
    public final qh0 f;
    public fu1 g;
    public final Bundle h;
    public ff1 i;
    public final xt1 j;
    public final String k;
    public final Bundle l;
    public final st1 m = new st1(this);

    public qt1(qh0 qh0Var, fu1 fu1Var, Bundle bundle, ff1 ff1Var, xt1 xt1Var, String str, Bundle bundle2) {
        this.f = qh0Var;
        this.g = fu1Var;
        this.h = bundle;
        this.i = ff1Var;
        this.j = xt1Var;
        this.k = str;
        this.l = bundle2;
    }

    public final void a(ff1 ff1Var) {
        st1 st1Var = this.m;
        st1Var.getClass();
        st1Var.k = ff1Var;
        st1Var.b();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof qt1)) {
            qt1 qt1Var = (qt1) obj;
            Bundle bundle = qt1Var.h;
            if (s51.n(this.k, qt1Var.k) && s51.n(this.g, qt1Var.g) && s51.n(this.m.j, qt1Var.m.j) && s51.n(getSavedStateRegistry(), qt1Var.getSavedStateRegistry())) {
                Bundle bundle2 = this.h;
                if (s51.n(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!s51.n(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // defpackage.rx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.e60 getDefaultViewModelCreationExtras() {
        /*
            r5 = this;
            st1 r0 = r5.m
            r0.getClass()
            lr1 r1 = new lr1
            r1.<init>()
            ak2 r2 = defpackage.f80.B0
            qt1 r3 = r0.a
            java.util.LinkedHashMap r4 = r1.a
            r4.put(r2, r3)
            ak2 r2 = defpackage.f80.C0
            r4.put(r2, r3)
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L23
            ak2 r2 = defpackage.f80.D0
            r4.put(r2, r0)
        L23:
            r0 = 0
            qh0 r5 = r5.f
            if (r5 == 0) goto L39
            android.content.Context r5 = r5.a
            if (r5 == 0) goto L31
            android.content.Context r5 = r5.getApplicationContext()
            goto L32
        L31:
            r5 = r0
        L32:
            boolean r2 = r5 instanceof android.app.Application
            if (r2 == 0) goto L39
            android.app.Application r5 = (android.app.Application) r5
            goto L3a
        L39:
            r5 = r0
        L3a:
            if (r5 == 0) goto L3d
            r0 = r5
        L3d:
            if (r0 == 0) goto L44
            ak2 r5 = defpackage.yq3.d
            r4.put(r5, r0)
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt1.getDefaultViewModelCreationExtras():e60");
    }

    @Override // defpackage.rx0
    public final zq3 getDefaultViewModelProviderFactory() {
        return this.m.l;
    }

    @Override // defpackage.of1
    public final gf1 getLifecycle() {
        return this.m.j;
    }

    @Override // defpackage.wq2
    public final tq2 getSavedStateRegistry() {
        return this.m.h.b;
    }

    @Override // defpackage.cr3
    public final br3 getViewModelStore() {
        st1 st1Var = this.m;
        if (!st1Var.i) {
            c.q("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (st1Var.j.i == ff1.f) {
            c.q("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        xt1 xt1Var = st1Var.e;
        if (xt1Var == null) {
            c.q("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = st1Var.f;
        str.getClass();
        LinkedHashMap linkedHashMap = xt1Var.b;
        br3 br3Var = (br3) linkedHashMap.get(str);
        if (br3Var != null) {
            return br3Var;
        }
        br3 br3Var2 = new br3();
        linkedHashMap.put(str, br3Var2);
        return br3Var2;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.g.hashCode() + (this.k.hashCode() * 31);
        Bundle bundle = this.h;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.m.j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.m.toString();
    }
}
