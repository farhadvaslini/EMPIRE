package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ut1 {
    public final ak2 a;
    public final i93 b;
    public final i93 c;
    public boolean d;
    public final cj2 e;
    public final cj2 f;
    public final yv1 g;
    public final /* synthetic */ nu1 h;

    public ut1(nu1 nu1Var, yv1 yv1Var) {
        yv1Var.getClass();
        this.h = nu1Var;
        this.a = new ak2(13);
        i93 i93VarE = s51.e(ni0.f);
        this.b = i93VarE;
        i93 i93VarE2 = s51.e(si0.f);
        this.c = i93VarE2;
        this.e = new cj2(i93VarE, null);
        this.f = new cj2(i93VarE2, null);
        this.g = yv1Var;
    }

    public final void a(qt1 qt1Var) {
        qt1Var.getClass();
        synchronized (this.a) {
            i93 i93Var = this.b;
            i93Var.j(null, qx.E0((Collection) i93Var.getValue(), qt1Var));
        }
    }

    public final qt1 b(fu1 fu1Var, Bundle bundle) {
        wt1 wt1Var = this.h.b;
        wt1Var.getClass();
        return h01.m(wt1Var.a.c, fu1Var, bundle, wt1Var.h(), wt1Var.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(qt1 qt1Var) {
        xt1 xt1Var;
        br3 br3Var;
        qt1Var.getClass();
        wt1 wt1Var = this.h.b;
        i93 i93Var = wt1Var.h;
        String str = qt1Var.k;
        LinkedHashMap linkedHashMap = wt1Var.w;
        boolean zN = s51.n(linkedHashMap.get(qt1Var), Boolean.TRUE);
        i93 i93Var2 = this.c;
        i93Var2.j(null, oz2.A((Set) i93Var2.getValue(), qt1Var));
        linkedHashMap.remove(qt1Var);
        mj mjVar = wt1Var.f;
        if (mjVar.contains(qt1Var)) {
            if (this.d) {
                return;
            }
            wt1Var.s();
            i93 i93Var3 = wt1Var.g;
            ArrayList arrayList = new ArrayList(mjVar);
            i93Var3.getClass();
            i93Var3.j(null, arrayList);
            ArrayList arrayListP = wt1Var.p();
            i93Var.getClass();
            i93Var.j(null, arrayListP);
            return;
        }
        wt1Var.r(qt1Var);
        if (qt1Var.m.j.i.compareTo(ff1.h) >= 0) {
            qt1Var.a(ff1.f);
        }
        if (!mjVar.isEmpty()) {
            Iterator it = mjVar.iterator();
            while (it.hasNext()) {
                if (s51.n(((qt1) it.next()).k, str)) {
                    break;
                }
            }
            if (!zN) {
                str.getClass();
                br3Var = (br3) xt1Var.b.remove(str);
                if (br3Var != null) {
                }
            }
        } else if (!zN && (xt1Var = wt1Var.o) != null) {
            str.getClass();
            br3Var = (br3) xt1Var.b.remove(str);
            if (br3Var != null) {
                br3Var.a();
            }
        }
        wt1Var.s();
        ArrayList arrayListP2 = wt1Var.p();
        i93Var.getClass();
        i93Var.j(null, arrayListP2);
    }

    public final void d(qt1 qt1Var, boolean z) {
        qt1Var.getClass();
        wt1 wt1Var = this.h.b;
        me1 me1Var = new me1(this, qt1Var, z);
        wt1Var.getClass();
        yv1 yv1VarB = wt1Var.s.b(qt1Var.g.f);
        wt1Var.w.put(qt1Var, Boolean.valueOf(z));
        if (!yv1VarB.equals(this.g)) {
            Object obj = wt1Var.t.get(yv1VarB);
            obj.getClass();
            ((ut1) obj).d(qt1Var, z);
            return;
        }
        bo1 bo1Var = wt1Var.v;
        if (bo1Var != null) {
            bo1Var.h(qt1Var);
            me1Var.a();
            return;
        }
        mj mjVar = wt1Var.f;
        int iIndexOf = mjVar.indexOf(qt1Var);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + qt1Var + " as it was not found on the current back stack");
            return;
        }
        int i = iIndexOf + 1;
        if (i != mjVar.h) {
            wt1Var.m(((qt1) mjVar.get(i)).g.g.a, true, false);
        }
        wt1.o(wt1Var, qt1Var);
        me1Var.a();
        wt1Var.b.a();
        wt1Var.b();
    }

    public final void e(qt1 qt1Var, boolean z) {
        Object objPrevious;
        qt1Var.getClass();
        i93 i93Var = this.c;
        Iterable iterable = (Iterable) i93Var.getValue();
        boolean z2 = iterable instanceof Collection;
        cj2 cj2Var = this.e;
        if (!z2 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((qt1) it.next()) == qt1Var) {
                    Iterable iterable2 = (Iterable) cj2Var.f.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((qt1) it2.next()) == qt1Var) {
                        }
                    }
                    return;
                }
            }
        }
        i93Var.j(null, oz2.F((Set) i93Var.getValue(), qt1Var));
        i93 i93Var2 = cj2Var.f;
        i93 i93Var3 = cj2Var.f;
        List list = (List) i93Var2.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            qt1 qt1Var2 = (qt1) objPrevious;
            if (!s51.n(qt1Var2, qt1Var) && ((List) i93Var3.getValue()).lastIndexOf(qt1Var2) < ((List) i93Var3.getValue()).lastIndexOf(qt1Var)) {
                break;
            }
        }
        qt1 qt1Var3 = (qt1) objPrevious;
        if (qt1Var3 != null) {
            i93Var.j(null, oz2.F((Set) i93Var.getValue(), qt1Var3));
        }
        d(qt1Var, z);
    }

    public final void f(qt1 qt1Var) {
        qt1Var.getClass();
        wt1 wt1Var = this.h.b;
        wt1Var.getClass();
        yv1 yv1VarB = wt1Var.s.b(qt1Var.g.f);
        if (!yv1VarB.equals(this.g)) {
            Object obj = wt1Var.t.get(yv1VarB);
            if (obj != null) {
                ((ut1) obj).f(qt1Var);
                return;
            } else {
                qn1.e(nc2.j(new StringBuilder("NavigatorBackStack for "), qt1Var.g.f, " should already be created"));
                return;
            }
        }
        ns0 ns0Var = wt1Var.u;
        if (ns0Var != null) {
            ns0Var.h(qt1Var);
            a(qt1Var);
        } else {
            Log.i("NavController", "Ignoring add of destination " + qt1Var.g + " outside of the call to navigate(). ");
        }
    }
}
