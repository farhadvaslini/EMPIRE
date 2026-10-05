package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qv1 {
    public final i93 a = s51.e(rv1.h);
    public final i93 b;
    public final cj2 c;
    public final mj d;
    public final mj e;
    public nv1 f;
    public int g;
    public pv1 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public qv1() {
        i93 i93VarE = s51.e(new ov1());
        this.b = i93VarE;
        this.c = new cj2(i93VarE, null);
        this.d = new mj();
        this.e = new mj();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(lv1 lv1Var, pv1 pv1Var, int i) {
        lv1Var.getClass();
        if (pv1Var.a == null) {
            (i != 0 ? i != 1 ? this.i : this.j : this.k).add(pv1Var);
            pv1Var.a = lv1Var;
            ((ov1) this.c.f.getValue()).getClass();
            pv1Var.b(i != 0 ? i != 1 ? this.n : this.l : this.m);
            return;
        }
        StringBuilder sb = new StringBuilder("Input '");
        sb.append(pv1Var);
        lv1 lv1Var2 = pv1Var.a;
        sb.append("' is already added to dispatcher ");
        sb.append(lv1Var2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final void b() {
        boolean z;
        boolean z2;
        ov1 ov1Var;
        mj mjVar = this.d;
        if (mjVar == null || !mjVar.isEmpty()) {
            Iterator it = mjVar.iterator();
            while (it.hasNext()) {
                if (((nv1) it.next()).b) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        mj mjVar2 = this.e;
        if (mjVar2 == null || !mjVar2.isEmpty()) {
            Iterator it2 = mjVar2.iterator();
            while (it2.hasNext()) {
                if (((nv1) it2.next()).b) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        boolean z3 = z || z2;
        boolean z4 = this.m != z;
        boolean z5 = this.l != z2;
        boolean z6 = this.n != z3;
        LinkedHashSet linkedHashSet = this.k;
        if (z4) {
            Iterator it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                ((pv1) it3.next()).b(z);
            }
        }
        LinkedHashSet linkedHashSet2 = this.j;
        if (z5) {
            Iterator it4 = linkedHashSet2.iterator();
            while (it4.hasNext()) {
                ((pv1) it4.next()).b(z2);
            }
        }
        LinkedHashSet linkedHashSet3 = this.i;
        if (z6) {
            Iterator it5 = linkedHashSet3.iterator();
            while (it5.hasNext()) {
                ((pv1) it5.next()).b(z3);
            }
        }
        this.m = z;
        this.l = z2;
        this.n = z3;
        nv1 nv1VarC = this.f;
        if (nv1VarC == null) {
            nv1VarC = c(0);
        }
        nv1 nv1VarC2 = this.f;
        if (nv1VarC2 == null) {
            nv1VarC2 = c(0);
        }
        if (s51.n(nv1VarC2, nv1VarC)) {
            if (nv1VarC2 == null) {
                ov1Var = new ov1();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it6 = mjVar.iterator();
                while (it6.hasNext()) {
                    boolean z7 = ((nv1) it6.next()).b;
                }
                Iterator<E> it7 = mjVar2.iterator();
                while (it7.hasNext()) {
                    boolean z8 = ((nv1) it7.next()).b;
                }
                vp vpVar = nv1VarC2.a;
                ai1 ai1VarX = vr.x();
                vx.f0(ai1VarX, arrayList);
                ai1VarX.add(vpVar);
                vx.f0(ai1VarX, ni0.f);
                ov1Var = new ov1(arrayList.size(), vr.r(ai1VarX));
            }
            i93 i93Var = this.b;
            if (s51.n((ov1) i93Var.getValue(), ov1Var)) {
                return;
            }
            i93Var.j(null, ov1Var);
            Iterator it8 = linkedHashSet.iterator();
            while (it8.hasNext()) {
                ((pv1) it8.next()).getClass();
            }
            Iterator it9 = linkedHashSet2.iterator();
            while (it9.hasNext()) {
                ((pv1) it9.next()).getClass();
            }
            Iterator it10 = linkedHashSet3.iterator();
            while (it10.hasNext()) {
                ((pv1) it10.next()).getClass();
            }
        }
    }

    public final nv1 c(int i) {
        Object next;
        Object next2;
        mj mjVar = this.e;
        mj mjVar2 = this.d;
        Object obj = null;
        if (i == -1) {
            Iterator it = mjVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((nv1) next).b) {
                    break;
                }
            }
            nv1 nv1Var = (nv1) next;
            if (nv1Var != null) {
                return nv1Var;
            }
            Iterator it2 = mjVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (((nv1) next3).b) {
                    obj = next3;
                    break;
                }
            }
            return (nv1) obj;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
            }
            Iterator it3 = mjVar2.iterator();
            while (it3.hasNext()) {
                ((nv1) it3.next()).getClass();
            }
            Iterator it4 = mjVar.iterator();
            while (it4.hasNext()) {
                ((nv1) it4.next()).getClass();
            }
            return null;
        }
        Iterator it5 = mjVar2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it5.next();
            if (((nv1) next2).b) {
                break;
            }
        }
        nv1 nv1Var2 = (nv1) next2;
        if (nv1Var2 != null) {
            return nv1Var2;
        }
        Iterator it6 = mjVar.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object next4 = it6.next();
            if (((nv1) next4).b) {
                obj = next4;
                break;
            }
        }
        return (nv1) obj;
    }
}
