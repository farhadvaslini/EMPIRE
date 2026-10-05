package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jr0 implements zy1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xz b;

    public /* synthetic */ jr0(xz xzVar, int i) {
        this.a = i;
        this.b = xzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x034f  */
    @Override // defpackage.zy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xz xzVar) {
        int i;
        Bundle bundle;
        Bundle bundle2;
        int i2 = this.a;
        xz xzVar2 = this.b;
        switch (i2) {
            case 0:
                kr0 kr0Var = ((wf) xzVar2).mFragments.a;
                wf wfVar = kr0Var.i;
                vr0 vr0Var = kr0Var.h;
                pl plVar = vr0Var.c;
                pl plVar2 = vr0Var.c;
                if (vr0Var.r != null) {
                    c.q("Already attached");
                    return;
                }
                vr0Var.r = kr0Var;
                vr0Var.s = kr0Var;
                vr0Var.k.add(kr0Var);
                xy1 onBackPressedDispatcher = wfVar.getOnBackPressedDispatcher();
                vr0Var.f = onBackPressedDispatcher;
                onBackPressedDispatcher.a(kr0Var, vr0Var.g);
                br3 viewModelStore = wfVar.getViewModelStore();
                d60 d60Var = d60.b;
                d60Var.getClass();
                pl plVar3 = new pl(viewModelStore, xr0.f, d60Var);
                lu luVarA = rk2.a(xr0.class);
                String strB = luVarA.b();
                if (strB == null) {
                    c.p("Local and anonymous classes can not be ViewModels");
                    return;
                }
                xr0 xr0Var = (xr0) plVar3.y(luVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
                vr0Var.E = xr0Var;
                plVar.j = xr0Var;
                HashMap map = (HashMap) plVar.h;
                HashMap map2 = (HashMap) plVar.i;
                kr0 kr0Var2 = vr0Var.r;
                int i3 = 3;
                if (kr0Var2 != null) {
                    tq2 savedStateRegistry = kr0Var2.i.getSavedStateRegistry();
                    savedStateRegistry.c("android:support:fragments", new hr0(i3, vr0Var));
                    Bundle bundleA = savedStateRegistry.a("android:support:fragments");
                    if (bundleA != null) {
                        for (String str : bundleA.keySet()) {
                            if (str.startsWith("result_") && (bundle2 = bundleA.getBundle(str)) != null) {
                                bundle2.setClassLoader(vr0Var.r.f.getClassLoader());
                                vr0Var.j.put(str.substring(7), bundle2);
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : bundleA.keySet()) {
                            if (str2.startsWith("fragment_") && (bundle = bundleA.getBundle(str2)) != null) {
                                bundle.setClassLoader(vr0Var.r.f.getClassLoader());
                                arrayList.add((yr0) bundle.getParcelable("state"));
                            }
                        }
                        map2.clear();
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            yr0 yr0Var = (yr0) obj;
                            map2.put(yr0Var.g, yr0Var);
                        }
                        wr0 wr0Var = (wr0) bundleA.getParcelable("state");
                        if (wr0Var == null) {
                            i = 2;
                        } else {
                            map.clear();
                            ArrayList arrayList2 = wr0Var.f;
                            int size2 = arrayList2.size();
                            int i5 = 0;
                            while (i5 < size2) {
                                Object obj2 = arrayList2.get(i5);
                                i5++;
                                yr0 yr0Var2 = (yr0) map2.remove((String) obj2);
                                if (yr0Var2 != null) {
                                    if (vr0Var.E.b.get(yr0Var2.g) != null) {
                                        qn1.b();
                                        return;
                                    }
                                    ClassLoader classLoader = vr0Var.r.f.getClassLoader();
                                    vr0Var.t.a(yr0Var2.f);
                                    Bundle bundle3 = yr0Var2.o;
                                    if (bundle3 == null) {
                                        throw null;
                                    }
                                    bundle3.setClassLoader(classLoader);
                                    throw null;
                                }
                            }
                            xr0 xr0Var2 = vr0Var.E;
                            xr0Var2.getClass();
                            Iterator it = new ArrayList(xr0Var2.b.values()).iterator();
                            if (it.hasNext()) {
                                it.next().getClass();
                                qn1.b();
                                return;
                            }
                            ArrayList arrayList3 = wr0Var.g;
                            ((ArrayList) plVar.g).clear();
                            if (arrayList3 != null) {
                                Iterator it2 = arrayList3.iterator();
                                if (it2.hasNext()) {
                                    String str3 = (String) it2.next();
                                    nc2.u(map.get(str3));
                                    c.q(nc2.i("No instantiated fragment for (", str3, ")"));
                                    return;
                                }
                            }
                            if (wr0Var.h != null) {
                                vr0Var.d = new ArrayList(wr0Var.h.length);
                                int i6 = 0;
                                while (true) {
                                    dl[] dlVarArr = wr0Var.h;
                                    if (i6 < dlVarArr.length) {
                                        dl dlVar = dlVarArr[i6];
                                        ArrayList arrayList4 = dlVar.g;
                                        cl clVar = new cl(vr0Var);
                                        int[] iArr = dlVar.f;
                                        int i7 = 0;
                                        int i8 = 0;
                                        while (true) {
                                            int length = iArr.length;
                                            ArrayList arrayList5 = clVar.a;
                                            if (i7 < length) {
                                                zr0 zr0Var = new zr0();
                                                int i9 = i7 + 1;
                                                zr0Var.a = iArr[i7];
                                                if (ur0.h(2)) {
                                                    Log.v("FragmentManager", "Instantiate " + clVar + " op #" + i8 + " base fragment #" + iArr[i9]);
                                                }
                                                zr0Var.g = ff1.values()[dlVar.h[i8]];
                                                zr0Var.h = ff1.values()[dlVar.i[i8]];
                                                int i10 = i7 + 2;
                                                zr0Var.b = iArr[i9] != 0;
                                                int i11 = iArr[i10];
                                                zr0Var.c = i11;
                                                int i12 = iArr[i7 + 3];
                                                zr0Var.d = i12;
                                                int i13 = i7 + 5;
                                                int i14 = iArr[i7 + 4];
                                                zr0Var.e = i14;
                                                i7 += 6;
                                                int i15 = iArr[i13];
                                                zr0Var.f = i15;
                                                clVar.b = i11;
                                                clVar.c = i12;
                                                clVar.d = i14;
                                                clVar.e = i15;
                                                arrayList5.add(zr0Var);
                                                zr0Var.c = clVar.b;
                                                zr0Var.d = clVar.c;
                                                zr0Var.e = clVar.d;
                                                zr0Var.f = clVar.e;
                                                i8++;
                                            } else {
                                                clVar.f = dlVar.j;
                                                clVar.h = dlVar.k;
                                                clVar.g = true;
                                                clVar.i = dlVar.m;
                                                clVar.j = dlVar.n;
                                                clVar.k = dlVar.o;
                                                clVar.l = dlVar.p;
                                                clVar.m = dlVar.q;
                                                clVar.n = dlVar.r;
                                                clVar.o = dlVar.s;
                                                clVar.q = dlVar.l;
                                                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                                                    String str4 = (String) arrayList4.get(i16);
                                                    if (str4 != null) {
                                                        zr0 zr0Var2 = (zr0) arrayList5.get(i16);
                                                        nc2.u(((HashMap) plVar2.h).get(str4));
                                                        zr0Var2.getClass();
                                                    }
                                                }
                                                clVar.a(1);
                                                if (ur0.h(2)) {
                                                    StringBuilder sbM = nc2.m("restoreAllState: back stack #", " (index ", i6);
                                                    sbM.append(clVar.q);
                                                    sbM.append("): ");
                                                    sbM.append(clVar);
                                                    Log.v("FragmentManager", sbM.toString());
                                                    PrintWriter printWriter = new PrintWriter(new ok1());
                                                    clVar.b("  ", printWriter, false);
                                                    printWriter.close();
                                                }
                                                vr0Var.d.add(clVar);
                                                i6++;
                                            }
                                        }
                                    } else {
                                        i = 2;
                                    }
                                }
                            } else {
                                i = 2;
                                vr0Var.d = null;
                            }
                            vr0Var.h.set(wr0Var.i);
                            String str5 = wr0Var.j;
                            if (str5 != null) {
                                nc2.u(((HashMap) plVar2.h).get(str5));
                            }
                            ArrayList arrayList6 = wr0Var.k;
                            if (arrayList6 != null) {
                                for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                                    vr0Var.i.put((String) arrayList6.get(i17), (el) wr0Var.l.get(i17));
                                }
                            }
                            vr0Var.x = new ArrayDeque(wr0Var.m);
                        }
                    }
                }
                kr0 kr0Var3 = vr0Var.r;
                if (kr0Var3 != null) {
                    z3 activityResultRegistry = kr0Var3.i.getActivityResultRegistry();
                    String strConcat = "FragmentManager:".concat("");
                    int i18 = i;
                    vr0Var.u = activityResultRegistry.c(strConcat.concat("StartActivityForResult"), new r3(i18), new qr0(vr0Var, 1));
                    vr0Var.v = activityResultRegistry.c(strConcat.concat("StartIntentSenderForResult"), new r3(3), new qr0(vr0Var, i18));
                    vr0Var.w = activityResultRegistry.c(strConcat.concat("RequestPermissions"), new r3(1), new qr0(vr0Var, 0));
                }
                kr0 kr0Var4 = vr0Var.r;
                if (kr0Var4 != null) {
                    kr0Var4.i.addOnConfigurationChangedListener(vr0Var.l);
                }
                kr0 kr0Var5 = vr0Var.r;
                if (kr0Var5 != null) {
                    kr0Var5.i.addOnTrimMemoryListener(vr0Var.m);
                }
                kr0 kr0Var6 = vr0Var.r;
                if (kr0Var6 != null) {
                    kr0Var6.i.addOnMultiWindowModeChangedListener(vr0Var.n);
                }
                kr0 kr0Var7 = vr0Var.r;
                if (kr0Var7 != null) {
                    kr0Var7.i.addOnPictureInPictureModeChangedListener(vr0Var.o);
                }
                kr0 kr0Var8 = vr0Var.r;
                if (kr0Var8 != null) {
                    kr0Var8.i.addMenuProvider(vr0Var.p);
                    return;
                }
                return;
            default:
                xz.e(xzVar2, xzVar);
                return;
        }
    }
}
