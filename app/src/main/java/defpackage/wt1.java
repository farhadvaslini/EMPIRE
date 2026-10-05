package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wt1 {
    public final nu1 a;
    public final q91 b;
    public iu1 c;
    public Bundle d;
    public Bundle[] e;
    public final mj f = new mj();
    public final i93 g;
    public final i93 h;
    public final cj2 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public of1 n;
    public xt1 o;
    public final ArrayList p;
    public ff1 q;
    public final x1 r;
    public final zv1 s;
    public final LinkedHashMap t;
    public ns0 u;
    public bo1 v;
    public final LinkedHashMap w;
    public int x;
    public final ArrayList y;
    public final s23 z;

    public wt1(nu1 nu1Var, q91 q91Var) {
        this.a = nu1Var;
        this.b = q91Var;
        ni0 ni0Var = ni0.f;
        this.g = s51.e(ni0Var);
        i93 i93VarE = s51.e(ni0Var);
        this.h = i93VarE;
        this.i = new cj2(i93VarE, null);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new ArrayList();
        this.q = ff1.g;
        this.r = new x1(2, this);
        this.s = new zv1();
        this.t = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = r51.b(2, jp.g);
    }

    public static fu1 d(int i, fu1 fu1Var, fu1 fu1Var2, boolean z) {
        if (fu1Var.g.a == i && (fu1Var2 == null || (fu1Var.equals(fu1Var2) && s51.n(fu1Var.h, fu1Var2.h)))) {
            return fu1Var;
        }
        iu1 iu1Var = fu1Var instanceof iu1 ? (iu1) fu1Var : null;
        if (iu1Var == null) {
            iu1Var = fu1Var.h;
            iu1Var.getClass();
        }
        return iu1Var.k.c(i, iu1Var, fu1Var2, z);
    }

    public static /* synthetic */ void o(wt1 wt1Var, qt1 qt1Var) {
        wt1Var.n(qt1Var, false, new mj());
    }

    public final void a(fu1 fu1Var, Bundle bundle, qt1 qt1Var, List list) {
        Object objPrevious;
        Object objPrevious2;
        qh0 qh0Var = this.a.c;
        fu1 fu1Var2 = qt1Var.g;
        boolean z = fu1Var2 instanceof lb0;
        mj mjVar = this.f;
        if (!z) {
            while (!mjVar.isEmpty() && (((qt1) mjVar.last()).g instanceof lb0) && m(((qt1) mjVar.last()).g.g.a, true, false)) {
            }
        }
        mj<qt1> mjVar2 = new mj();
        Object obj = null;
        if (fu1Var instanceof iu1) {
            fu1 fu1Var3 = fu1Var2;
            do {
                fu1Var3.getClass();
                fu1Var3 = fu1Var3.h;
                if (fu1Var3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious2 = listIterator.previous();
                            if (s51.n(((qt1) objPrevious2).g, fu1Var3)) {
                                break;
                            }
                        } else {
                            objPrevious2 = null;
                            break;
                        }
                    }
                    qt1 qt1VarM = (qt1) objPrevious2;
                    if (qt1VarM == null) {
                        qt1VarM = h01.m(qh0Var, fu1Var3, bundle, h(), this.o);
                    }
                    mjVar2.addFirst(qt1VarM);
                    if (!mjVar.isEmpty() && ((qt1) mjVar.last()).g == fu1Var3) {
                        o(this, (qt1) mjVar.last());
                    }
                }
                if (fu1Var3 == null) {
                    break;
                }
            } while (fu1Var3 != fu1Var);
        }
        fu1 fu1Var4 = mjVar2.isEmpty() ? fu1Var2 : ((qt1) mjVar2.first()).g;
        while (fu1Var4 != null && c(fu1Var4.g.a, fu1Var4) != fu1Var4) {
            fu1Var4 = fu1Var4.h;
            if (fu1Var4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        objPrevious = listIterator2.previous();
                        if (s51.n(((qt1) objPrevious).g, fu1Var4)) {
                            break;
                        }
                    } else {
                        objPrevious = null;
                        break;
                    }
                }
                qt1 qt1VarM2 = (qt1) objPrevious;
                if (qt1VarM2 == null) {
                    qt1VarM2 = h01.m(qh0Var, fu1Var4, fu1Var4.a(bundle2), h(), this.o);
                }
                mjVar2.addFirst(qt1VarM2);
            }
        }
        if (!mjVar2.isEmpty()) {
            fu1Var2 = ((qt1) mjVar2.first()).g;
        }
        while (!mjVar.isEmpty() && (((qt1) mjVar.last()).g instanceof iu1)) {
            fu1 fu1Var5 = ((qt1) mjVar.last()).g;
            fu1Var5.getClass();
            if (((iu1) fu1Var5).k.b.b(fu1Var2.g.a) != null) {
                break;
            } else {
                o(this, (qt1) mjVar.last());
            }
        }
        qt1 qt1Var2 = (qt1) mjVar.f();
        if (qt1Var2 == null) {
            qt1Var2 = (qt1) mjVar2.f();
        }
        if (!s51.n(qt1Var2 != null ? qt1Var2.g : null, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                fu1 fu1Var6 = ((qt1) objPrevious3).g;
                iu1 iu1Var = this.c;
                iu1Var.getClass();
                if (s51.n(fu1Var6, iu1Var)) {
                    obj = objPrevious3;
                    break;
                }
            }
            qt1 qt1VarM3 = (qt1) obj;
            if (qt1VarM3 == null) {
                iu1 iu1Var2 = this.c;
                iu1Var2.getClass();
                iu1 iu1Var3 = this.c;
                iu1Var3.getClass();
                qt1VarM3 = h01.m(qh0Var, iu1Var2, iu1Var3.a(bundle), h(), this.o);
            }
            mjVar2.addFirst(qt1VarM3);
        }
        for (qt1 qt1Var3 : mjVar2) {
            Object obj2 = this.t.get(this.s.b(qt1Var3.g.f));
            if (obj2 == null) {
                qn1.e(nc2.j(new StringBuilder("NavigatorBackStack for "), fu1Var.f, " should already be created"));
                return;
            }
            ((ut1) obj2).a(qt1Var3);
        }
        mjVar.addAll(mjVar2);
        mjVar.addLast(qt1Var);
        ArrayList arrayListE0 = qx.E0(mjVar2, qt1Var);
        int size = arrayListE0.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayListE0.get(i);
            i++;
            qt1 qt1Var4 = (qt1) obj3;
            iu1 iu1Var4 = qt1Var4.g.h;
            if (iu1Var4 != null) {
                j(qt1Var4, e(iu1Var4.g.a));
            }
        }
    }

    public final boolean b() {
        mj mjVar;
        while (true) {
            mjVar = this.f;
            if (mjVar.isEmpty() || !(((qt1) mjVar.last()).g instanceof iu1)) {
                break;
            }
            o(this, (qt1) mjVar.last());
        }
        qt1 qt1Var = (qt1) mjVar.h();
        ArrayList arrayList = this.y;
        if (qt1Var != null) {
            arrayList.add(qt1Var);
        }
        this.x++;
        s();
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList arrayListO0 = qx.O0(arrayList);
            arrayList.clear();
            int size = arrayListO0.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListO0.get(i2);
                i2++;
                qt1 qt1Var2 = (qt1) obj;
                Iterator it = qx.N0(this.p).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        qn1.b();
                        return false;
                    }
                    fu1 fu1Var = qt1Var2.g;
                    qt1Var2.m.a();
                    throw null;
                }
                this.z.q(qt1Var2);
            }
            ArrayList arrayList2 = new ArrayList(mjVar);
            i93 i93Var = this.g;
            i93Var.getClass();
            i93Var.j(null, arrayList2);
            ArrayList arrayListP = p();
            i93 i93Var2 = this.h;
            i93Var2.getClass();
            i93Var2.j(null, arrayListP);
        }
        return qt1Var != null;
    }

    public final fu1 c(int i, fu1 fu1Var) {
        fu1 fu1Var2;
        iu1 iu1Var = this.c;
        if (iu1Var == null) {
            return null;
        }
        if (iu1Var.g.a == i) {
            if (fu1Var == null) {
                return iu1Var;
            }
            if (s51.n(iu1Var, fu1Var) && fu1Var.h == null) {
                return this.c;
            }
        }
        qt1 qt1Var = (qt1) this.f.h();
        if (qt1Var == null || (fu1Var2 = qt1Var.g) == null) {
            fu1Var2 = this.c;
            fu1Var2.getClass();
        }
        return d(i, fu1Var2, fu1Var, false);
    }

    public final qt1 e(int i) {
        Object objPrevious;
        mj mjVar = this.f;
        ListIterator<E> listIterator = mjVar.listIterator(mjVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((qt1) objPrevious).g.g.a == i) {
                break;
            }
        }
        qt1 qt1Var = (qt1) objPrevious;
        if (qt1Var != null) {
            return qt1Var;
        }
        StringBuilder sbM = nc2.m("No destination with ID ", " is on the NavController's back stack. The current destination is ", i);
        sbM.append(f());
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    public final fu1 f() {
        qt1 qt1Var = (qt1) this.f.h();
        if (qt1Var != null) {
            return qt1Var.g;
        }
        return null;
    }

    public final iu1 g() {
        iu1 iu1Var = this.c;
        if (iu1Var != null) {
            iu1Var.getClass();
            return iu1Var;
        }
        c.q("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final ff1 h() {
        return this.n == null ? ff1.h : this.q;
    }

    public final iu1 i() {
        fu1 fu1Var;
        qt1 qt1Var = (qt1) this.f.h();
        if (qt1Var == null || (fu1Var = qt1Var.g) == null) {
            fu1Var = this.c;
            fu1Var.getClass();
        }
        iu1 iu1Var = fu1Var instanceof iu1 ? (iu1) fu1Var : null;
        if (iu1Var != null) {
            return iu1Var;
        }
        iu1 iu1Var2 = fu1Var.h;
        iu1Var2.getClass();
        return iu1Var2;
    }

    public final void j(qt1 qt1Var, qt1 qt1Var2) {
        this.j.put(qt1Var, qt1Var2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(qt1Var2) == null) {
            linkedHashMap.put(qt1Var2, new ak());
        }
        Object obj = linkedHashMap.get(qt1Var2);
        obj.getClass();
        ((ak) obj).a.incrementAndGet();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(fu1 fu1Var, Bundle bundle, vu1 vu1Var) {
        boolean z;
        int iNextIndex;
        fu1 fu1Var2;
        int iNextIndex2;
        int i;
        fu1Var.getClass();
        Iterator it = this.t.values().iterator();
        while (it.hasNext()) {
            ((ut1) it.next()).d = true;
        }
        mk2 mk2Var = new mk2();
        boolean zM = (vu1Var == null || (i = vu1Var.c) == -1) ? false : m(i, vu1Var.d, vu1Var.e);
        Bundle bundleA = fu1Var.a(bundle);
        if (vu1Var != null && vu1Var.b && this.l.containsKey(Integer.valueOf(fu1Var.g.a))) {
            mk2Var.f = q(fu1Var.g.a, bundleA, vu1Var);
            z = false;
        } else if (vu1Var == null || !vu1Var.a) {
            z = false;
            if (!z) {
                qt1 qt1VarM = h01.m(this.a.c, fu1Var, bundleA, h(), this.o);
                yv1 yv1VarB = this.s.b(fu1Var.f);
                List listK = vr.K(qt1VarM);
                this.u = new bd(mk2Var, this, fu1Var, bundleA);
                yv1VarB.d(listK, vu1Var);
                this.u = null;
            }
        } else {
            qt1 qt1Var = (qt1) this.f.h();
            mj mjVar = this.f;
            ListIterator listIterator = mjVar.listIterator(mjVar.a());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (((qt1) listIterator.previous()).g == fu1Var) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            if (iNextIndex != -1) {
                if (fu1Var instanceof iu1) {
                    int i2 = iu1.l;
                    List listL = pv2.L(new sc3(pv2.H((iu1) fu1Var, new fi1(22)), new fi1(15), 1));
                    if (this.f.h - iNextIndex == listL.size()) {
                        mj mjVar2 = this.f;
                        List listSubList = mjVar2.subList(iNextIndex, mjVar2.h);
                        ArrayList arrayList = new ArrayList(rx.d0(listSubList, 10));
                        Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((qt1) it2.next()).g.g.a));
                        }
                        if (arrayList.equals(listL)) {
                            mj<qt1> mjVar3 = new mj();
                            while (vr.C(this.f) >= iNextIndex) {
                                qt1 qt1Var2 = (qt1) vx.i0(this.f);
                                r(qt1Var2);
                                qt1 qt1Var3 = new qt1(qt1Var2.f, qt1Var2.g, qt1Var2.g.a(bundle), qt1Var2.i, qt1Var2.j, qt1Var2.k, qt1Var2.l);
                                st1 st1Var = qt1Var3.m;
                                ff1 ff1Var = qt1Var2.i;
                                st1Var.getClass();
                                ff1Var.getClass();
                                st1Var.d = ff1Var;
                                st1 st1Var2 = qt1Var3.m;
                                ff1 ff1Var2 = qt1Var2.m.k;
                                st1Var2.getClass();
                                ff1Var2.getClass();
                                st1Var2.k = ff1Var2;
                                st1Var2.b();
                                mjVar3.addFirst(qt1Var3);
                            }
                            for (qt1 qt1Var4 : mjVar3) {
                                iu1 iu1Var = qt1Var4.g.h;
                                if (iu1Var != null) {
                                    j(qt1Var4, e(iu1Var.g.a));
                                }
                                this.f.addLast(qt1Var4);
                            }
                            for (qt1 qt1Var5 : mjVar3) {
                                yv1 yv1VarB2 = this.s.b(qt1Var5.g.f);
                                fu1 fu1Var3 = qt1Var5.g;
                                if (fu1Var3 == null) {
                                    fu1Var3 = null;
                                }
                                if (fu1Var3 != null) {
                                    yv1VarB2.c(fu1Var3);
                                    ut1 ut1VarB = yv1VarB2.b();
                                    synchronized (ut1VarB.a) {
                                        try {
                                            ArrayList arrayListO0 = qx.O0((Collection) ut1VarB.e.f.getValue());
                                            ListIterator listIterator2 = arrayListO0.listIterator(arrayListO0.size());
                                            while (true) {
                                                if (listIterator2.hasPrevious()) {
                                                    if (s51.n(((qt1) listIterator2.previous()).k, qt1Var5.k)) {
                                                        iNextIndex2 = listIterator2.nextIndex();
                                                        break;
                                                    }
                                                } else {
                                                    iNextIndex2 = -1;
                                                    break;
                                                }
                                            }
                                            arrayListO0.set(iNextIndex2, qt1Var5);
                                            i93 i93Var = ut1VarB.b;
                                            i93Var.getClass();
                                            i93Var.j(null, arrayListO0);
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    z = false;
                } else if (qt1Var == null || (fu1Var2 = qt1Var.g) == null || fu1Var.g.a != fu1Var2.g.a) {
                }
                if (!z) {
                }
            }
        }
        this.b.a();
        Iterator it3 = this.t.values().iterator();
        while (it3.hasNext()) {
            ((ut1) it3.next()).d = false;
        }
        if (zM || mk2Var.f || z) {
            b();
        } else {
            s();
        }
    }

    public final void l(String str, vu1 vu1Var) {
        if (this.c == null) {
            c.j("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this, 46);
            return;
        }
        iu1 iu1VarI = i();
        eu1 eu1VarG = iu1VarI.g(str, true, iu1VarI);
        if (eu1VarG == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + str + " cannot be found in the navigation graph " + this.c);
        }
        fu1 fu1Var = eu1VarG.f;
        Bundle bundleA = fu1Var.a(eu1VarG.g);
        if (bundleA == null) {
            bundleA = vp.u((r32[]) Arrays.copyOf(new r32[0], 0));
        }
        int i = fu1.j;
        String str2 = (String) fu1Var.g.e;
        Uri uri = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        uri.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleA.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        k(fu1Var, bundleA, vu1Var);
    }

    public final boolean m(int i, boolean z, boolean z2) {
        fu1 fu1Var;
        boolean z3;
        mj mjVar = this.f;
        final int i2 = 0;
        if (mjVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = qx.F0(mjVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                fu1Var = null;
                break;
            }
            fu1 fu1Var2 = ((qt1) it.next()).g;
            String str = fu1Var2.f;
            yf yfVar = fu1Var2.g;
            yv1 yv1VarB = this.s.b(str);
            if (z || yfVar.a != i) {
                arrayList.add(yv1VarB);
            }
            if (yfVar.a == i) {
                fu1Var = fu1Var2;
                break;
            }
        }
        if (fu1Var == null) {
            int i3 = fu1.j;
            Log.i("NavController", "Ignoring popBackStack to destination " + pq.w(this.a.c, i) + " as it was not found on the current back stack");
            return false;
        }
        mk2 mk2Var = new mk2();
        mj mjVar2 = new mj();
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z3 = z2;
                break;
            }
            int i5 = i4 + 1;
            yv1 yv1Var = (yv1) arrayList.get(i4);
            mk2 mk2Var2 = new mk2();
            qt1 qt1Var = (qt1) mjVar.last();
            z3 = z2;
            bo1 bo1Var = new bo1(mk2Var2, mk2Var, this, z3, mjVar2);
            yv1Var.getClass();
            qt1Var.getClass();
            this.v = bo1Var;
            yv1Var.e(qt1Var, z3);
            this.v = null;
            if (!mk2Var2.f) {
                break;
            }
            i4 = i5;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.l;
            if (!z) {
                zl0 zl0Var = new zl0(new sc3(pv2.H(fu1Var, new fi1(16)), new ns0(this) { // from class: vt1
                    public final /* synthetic */ wt1 g;

                    {
                        this.g = this;
                    }

                    @Override // defpackage.ns0
                    public final Object h(Object obj) {
                        boolean zContainsKey;
                        int i6 = i2;
                        wt1 wt1Var = this.g;
                        fu1 fu1Var3 = (fu1) obj;
                        switch (i6) {
                            case 0:
                                fu1Var3.getClass();
                                zContainsKey = wt1Var.l.containsKey(Integer.valueOf(fu1Var3.g.a));
                                break;
                            default:
                                fu1Var3.getClass();
                                zContainsKey = wt1Var.l.containsKey(Integer.valueOf(fu1Var3.g.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (zl0Var.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((fu1) zl0Var.next()).g.a);
                    tt1 tt1Var = (tt1) mjVar2.f();
                    linkedHashMap.put(numValueOf, tt1Var != null ? (String) tt1Var.a.b : null);
                }
            }
            if (!mjVar2.isEmpty()) {
                w9 w9Var = ((tt1) mjVar2.first()).a;
                final int i6 = 1;
                zl0 zl0Var2 = new zl0(new sc3(pv2.H(c(w9Var.a, null), new fi1(17)), new ns0(this) { // from class: vt1
                    public final /* synthetic */ wt1 g;

                    {
                        this.g = this;
                    }

                    @Override // defpackage.ns0
                    public final Object h(Object obj) {
                        boolean zContainsKey;
                        int i62 = i6;
                        wt1 wt1Var = this.g;
                        fu1 fu1Var3 = (fu1) obj;
                        switch (i62) {
                            case 0:
                                fu1Var3.getClass();
                                zContainsKey = wt1Var.l.containsKey(Integer.valueOf(fu1Var3.g.a));
                                break;
                            default:
                                fu1Var3.getClass();
                                zContainsKey = wt1Var.l.containsKey(Integer.valueOf(fu1Var3.g.a));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (zl0Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((fu1) zl0Var2.next()).g.a), (String) w9Var.b);
                }
                if (linkedHashMap.values().contains((String) w9Var.b)) {
                    this.m.put((String) w9Var.b, mjVar2);
                }
            }
        }
        this.b.a();
        return mk2Var.f;
    }

    public final void n(qt1 qt1Var, boolean z, mj mjVar) {
        xt1 xt1Var;
        cj2 cj2Var;
        Set set;
        qt1Var.getClass();
        mj mjVar2 = this.f;
        qt1 qt1Var2 = (qt1) mjVar2.last();
        if (!s51.n(qt1Var2, qt1Var)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(qt1Var.g);
            fu1 fu1Var = qt1Var2.g;
            sb.append(", which is not the top of the back stack (");
            sb.append(fu1Var);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        vx.i0(mjVar2);
        ut1 ut1Var = (ut1) this.t.get(this.s.b(qt1Var2.g.f));
        boolean z2 = true;
        if ((ut1Var == null || (cj2Var = ut1Var.f) == null || (set = (Set) cj2Var.f.getValue()) == null || !set.contains(qt1Var2)) && !this.k.containsKey(qt1Var2)) {
            z2 = false;
        }
        ff1 ff1Var = qt1Var2.m.j.i;
        ff1 ff1Var2 = ff1.h;
        if (ff1Var.compareTo(ff1Var2) >= 0) {
            if (z) {
                qt1Var2.a(ff1Var2);
                mjVar.addFirst(new tt1(qt1Var2));
            }
            if (z2) {
                qt1Var2.a(ff1Var2);
            } else {
                qt1Var2.a(ff1.f);
                r(qt1Var2);
            }
        }
        if (z || z2 || (xt1Var = this.o) == null) {
            return;
        }
        String str = qt1Var2.k;
        str.getClass();
        br3 br3Var = (br3) xt1Var.b.remove(str);
        if (br3Var != null) {
            br3Var.a();
        }
    }

    public final ArrayList p() {
        ff1 ff1Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.t.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ff1Var = ff1.i;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((ut1) it.next()).f.f.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                qt1 qt1Var = (qt1) obj;
                if (!arrayList.contains(qt1Var) && qt1Var.m.k.compareTo(ff1Var) < 0) {
                    arrayList2.add(obj);
                }
            }
            vx.f0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.f) {
            qt1 qt1Var2 = (qt1) obj2;
            if (!arrayList.contains(qt1Var2) && qt1Var2.m.k.compareTo(ff1Var) >= 0) {
                arrayList3.add(obj2);
            }
        }
        vx.f0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            if (!(((qt1) obj3).g instanceof iu1)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final boolean q(int i, Bundle bundle, vu1 vu1Var) {
        fu1 fu1VarG;
        qt1 qt1Var;
        fu1 fu1Var;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.l;
        int i2 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (s51.n((String) it.next(), str)) {
                it.remove();
            }
        }
        mj<tt1> mjVar = (mj) cl3.g(this.m).remove(str);
        qh0 qh0Var = this.a.c;
        ArrayList arrayList = new ArrayList();
        qt1 qt1Var2 = (qt1) this.f.h();
        if (qt1Var2 == null || (fu1VarG = qt1Var2.g) == null) {
            fu1VarG = g();
        }
        if (mjVar != null) {
            for (tt1 tt1Var : mjVar) {
                w9 w9Var = tt1Var.a;
                w9 w9Var2 = tt1Var.a;
                fu1 fu1VarD = d(w9Var.a, fu1VarG, null, true);
                if (fu1VarD == null) {
                    int i3 = fu1.j;
                    qn1.o("Restore State failed: destination ", pq.w(qh0Var, w9Var2.a), " cannot be found from the current destination ", fu1VarG);
                    return false;
                }
                ff1 ff1VarH = h();
                xt1 xt1Var = this.o;
                qh0Var.getClass();
                ff1VarH.getClass();
                Bundle bundle3 = (Bundle) w9Var2.c;
                if (bundle3 != null) {
                    Context context = qh0Var.a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String str2 = (String) w9Var2.b;
                Bundle bundle4 = (Bundle) w9Var2.d;
                str2.getClass();
                arrayList.add(new qt1(qh0Var, fu1VarD, bundle2, ff1VarH, xt1Var, str2, bundle4));
                fu1VarG = fu1VarD;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((qt1) obj).g instanceof iu1)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            qt1 qt1Var3 = (qt1) obj2;
            List list = (List) qx.z0(arrayList2);
            if (s51.n((list == null || (qt1Var = (qt1) qx.y0(list)) == null || (fu1Var = qt1Var.g) == null) ? null : fu1Var.f, qt1Var3.g.f)) {
                list.add(qt1Var3);
            } else {
                arrayList2.add(vr.N(qt1Var3));
            }
        }
        mk2 mk2Var = new mk2();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            yv1 yv1VarB = this.s.b(((qt1) qx.q0(list2)).g.f);
            ArrayList arrayList4 = arrayList;
            this.u = new a4(mk2Var, arrayList4, new ok2(), this, bundle, 4);
            yv1VarB.d(list2, vu1Var);
            this.u = null;
            arrayList = arrayList4;
        }
        return mk2Var.f;
    }

    public final void r(qt1 qt1Var) {
        qt1Var.getClass();
        qt1 qt1Var2 = (qt1) this.j.remove(qt1Var);
        if (qt1Var2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.k;
        ak akVar = (ak) linkedHashMap.get(qt1Var2);
        Integer numValueOf = akVar != null ? Integer.valueOf(akVar.a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            ut1 ut1Var = (ut1) this.t.get(this.s.b(qt1Var2.g.f));
            if (ut1Var != null) {
                ut1Var.c(qt1Var2);
            }
            linkedHashMap.remove(qt1Var2);
        }
    }

    public final void s() {
        ak akVar;
        cj2 cj2Var;
        Set set;
        ArrayList arrayListO0 = qx.O0(this.f);
        if (arrayListO0.isEmpty()) {
            return;
        }
        ArrayList arrayListN = vr.N(((qt1) qx.y0(arrayListO0)).g);
        ArrayList arrayList = new ArrayList();
        if (qx.y0(arrayListN) instanceof lb0) {
            Iterator it = qx.F0(arrayListO0).iterator();
            while (it.hasNext()) {
                fu1 fu1Var = ((qt1) it.next()).g;
                arrayList.add(fu1Var);
                if (!(fu1Var instanceof lb0) && !(fu1Var instanceof iu1)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (qt1 qt1Var : qx.F0(arrayListO0)) {
            ff1 ff1Var = qt1Var.m.k;
            fu1 fu1Var2 = qt1Var.g;
            fu1 fu1Var3 = (fu1) qx.r0(arrayListN);
            ff1 ff1Var2 = ff1.j;
            ff1 ff1Var3 = ff1.i;
            if (fu1Var3 != null && fu1Var3.g.a == fu1Var2.g.a) {
                if (ff1Var != ff1Var2) {
                    ut1 ut1Var = (ut1) this.t.get(this.s.b(qt1Var.g.f));
                    if (s51.n((ut1Var == null || (cj2Var = ut1Var.f) == null || (set = (Set) cj2Var.f.getValue()) == null) ? null : Boolean.valueOf(set.contains(qt1Var)), Boolean.TRUE) || ((akVar = (ak) this.k.get(qt1Var)) != null && akVar.a.get() == 0)) {
                        map.put(qt1Var, ff1Var3);
                    } else {
                        map.put(qt1Var, ff1Var2);
                    }
                }
                fu1 fu1Var4 = (fu1) qx.r0(arrayList);
                if (fu1Var4 != null && fu1Var4.g.a == fu1Var2.g.a) {
                    vx.h0(arrayList);
                }
                vx.h0(arrayListN);
                iu1 iu1Var = fu1Var2.h;
                if (iu1Var != null) {
                    arrayListN.add(iu1Var);
                }
            } else if (arrayList.isEmpty() || fu1Var2.g.a != ((fu1) qx.q0(arrayList)).g.a) {
                qt1Var.a(ff1.h);
            } else {
                fu1 fu1Var5 = (fu1) vx.h0(arrayList);
                if (ff1Var == ff1Var2) {
                    qt1Var.a(ff1Var3);
                } else if (ff1Var != ff1Var3) {
                    map.put(qt1Var, ff1Var3);
                }
                iu1 iu1Var2 = fu1Var5.h;
                if (iu1Var2 != null && !arrayList.contains(iu1Var2)) {
                    arrayList.add(iu1Var2);
                }
            }
        }
        int size = arrayListO0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListO0.get(i);
            i++;
            qt1 qt1Var2 = (qt1) obj;
            ff1 ff1Var4 = (ff1) map.get(qt1Var2);
            if (ff1Var4 != null) {
                qt1Var2.a(ff1Var4);
            } else {
                qt1Var2.m.b();
            }
        }
    }
}
