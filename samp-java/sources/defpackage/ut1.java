package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.qt1 r9) {
        /*
            r8 = this;
            r9.getClass()
            nu1 r0 = r8.h
            wt1 r0 = r0.b
            i93 r1 = r0.h
            java.lang.String r2 = r9.k
            java.util.LinkedHashMap r3 = r0.w
            java.lang.Object r4 = r3.get(r9)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = defpackage.s51.n(r4, r5)
            i93 r5 = r8.c
            java.lang.Object r6 = r5.getValue()
            java.util.Set r6 = (java.util.Set) r6
            java.util.LinkedHashSet r6 = defpackage.oz2.A(r6, r9)
            r7 = 0
            r5.j(r7, r6)
            r3.remove(r9)
            mj r3 = r0.f
            boolean r5 = r3.contains(r9)
            if (r5 != 0) goto L8c
            r0.r(r9)
            st1 r8 = r9.m
            rf1 r8 = r8.j
            ff1 r8 = r8.i
            ff1 r5 = defpackage.ff1.h
            int r8 = r8.compareTo(r5)
            if (r8 < 0) goto L48
            ff1 r8 = defpackage.ff1.f
            r9.a(r8)
        L48:
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L4f
            goto L68
        L4f:
            java.util.Iterator r8 = r3.iterator()
        L53:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L68
            java.lang.Object r9 = r8.next()
            qt1 r9 = (defpackage.qt1) r9
            java.lang.String r9 = r9.k
            boolean r9 = defpackage.s51.n(r9, r2)
            if (r9 == 0) goto L53
            goto L7e
        L68:
            if (r4 != 0) goto L7e
            xt1 r8 = r0.o
            if (r8 == 0) goto L7e
            r2.getClass()
            java.util.LinkedHashMap r8 = r8.b
            java.lang.Object r8 = r8.remove(r2)
            br3 r8 = (defpackage.br3) r8
            if (r8 == 0) goto L7e
            r8.a()
        L7e:
            r0.s()
            java.util.ArrayList r8 = r0.p()
            r1.getClass()
            r1.j(r7, r8)
            return
        L8c:
            boolean r8 = r8.d
            if (r8 != 0) goto Laa
            r0.s()
            i93 r8 = r0.g
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r3)
            r8.getClass()
            r8.j(r7, r9)
            java.util.ArrayList r8 = r0.p()
            r1.getClass()
            r1.j(r7, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut1.c(qt1):void");
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
