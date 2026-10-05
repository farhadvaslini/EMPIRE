package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class d00 implements rs0, ss0, ts0, us0, vs0, ws0, xs0, ys0, ds0, es0, gs0, hs0, is0, js0, ks0, ls0, ms0, os0, ps0 {
    public final int f;
    public final boolean g;
    public Object h;
    public xj2 i;
    public ArrayList j;

    public d00(int i, Object obj, boolean z) {
        this.f = i;
        this.g = z;
        this.h = obj;
    }

    @Override // defpackage.xs0
    public final /* bridge */ /* synthetic */ Object b(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, nv0 nv0Var, Integer num) {
        return k(obj, bool, obj2, obj3, obj4, nv0Var, num.intValue());
    }

    public final Object d(int i, nv0 nv0Var) {
        nv0Var.b0(this.f);
        o(nv0Var);
        int iP = i | (nv0Var.f(this) ? gq.p(2, 0) : gq.p(1, 0));
        Object obj = this.h;
        obj.getClass();
        cl3.i(2, obj);
        Object objF = ((rs0) obj).f(nv0Var, Integer.valueOf(iP));
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new c00(2, this, d00.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objF;
    }

    @Override // defpackage.ss0
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
        return i(obj, (nv0) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.rs0
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2) {
        return d(((Number) obj2).intValue(), (nv0) obj);
    }

    public final Object i(Object obj, nv0 nv0Var, int i) {
        nv0Var.b0(this.f);
        o(nv0Var);
        int i2 = 2;
        int iP = nv0Var.f(this) ? gq.p(2, 1) : gq.p(1, 1);
        Object obj2 = this.h;
        obj2.getClass();
        cl3.i(3, obj2);
        Object objE = ((ss0) obj2).e(obj, nv0Var, Integer.valueOf(iP | i));
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xc(i, i2, this, obj);
        }
        return objE;
    }

    @Override // defpackage.us0
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return n(obj, obj2, obj3, (nv0) obj4, ((Number) obj5).intValue());
    }

    public final Object k(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, nv0 nv0Var, int i) {
        nv0Var.b0(this.f);
        o(nv0Var);
        int iP = nv0Var.f(this) ? gq.p(2, 6) : gq.p(1, 6);
        Object obj5 = this.h;
        obj5.getClass();
        cl3.i(8, obj5);
        Object objB = ((xs0) obj5).b(obj, bool, obj2, obj3, obj4, nv0Var, Integer.valueOf(i | iP));
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new b00(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objB;
    }

    @Override // defpackage.ts0
    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        return m(obj, obj2, (nv0) obj3, ((Number) obj4).intValue());
    }

    public final Object m(Object obj, Object obj2, nv0 nv0Var, int i) {
        nv0Var.b0(this.f);
        o(nv0Var);
        int iP = nv0Var.f(this) ? gq.p(2, 2) : gq.p(1, 2);
        Object obj3 = this.h;
        obj3.getClass();
        cl3.i(4, obj3);
        Object objL = ((ts0) obj3).l(obj, obj2, nv0Var, Integer.valueOf(iP | i));
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(i, this, obj, obj2);
        }
        return objL;
    }

    public final Object n(Object obj, Object obj2, Object obj3, nv0 nv0Var, int i) {
        nv0Var.b0(this.f);
        o(nv0Var);
        int iP = nv0Var.f(this) ? gq.p(2, 3) : gq.p(1, 3);
        Object obj4 = this.h;
        obj4.getClass();
        cl3.i(5, obj4);
        Object objJ = ((us0) obj4).j(obj, obj2, obj3, nv0Var, Integer.valueOf(iP | i));
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new v4(this, obj, obj2, obj3, i);
        }
        return objJ;
    }

    public final void o(nv0 nv0Var) {
        xj2 xj2VarZ;
        if (!this.g || (xj2VarZ = nv0Var.z()) == null) {
            return;
        }
        xj2VarZ.b |= 1;
        xj2 xj2Var = this.i;
        if (xj2Var == null || !xj2Var.a() || xj2Var == xj2VarZ || s51.n(xj2Var.c, xj2VarZ.c)) {
            this.i = xj2VarZ;
            return;
        }
        ArrayList arrayList = this.j;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.j = arrayList2;
            arrayList2.add(xj2VarZ);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xj2 xj2Var2 = (xj2) arrayList.get(i);
            if (xj2Var2 == null || !xj2Var2.a() || xj2Var2 == xj2VarZ || s51.n(xj2Var2.c, xj2VarZ.c)) {
                arrayList.set(i, xj2VarZ);
                return;
            }
        }
        arrayList.add(xj2VarZ);
    }
}
