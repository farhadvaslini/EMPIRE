package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tg3 {
    public final d42 a = b32.w(null);
    public af b;
    public final l73 c;

    public tg3(af afVar) {
        db3 db3Var = new db3(13);
        afVar.getClass();
        ye yeVar = new ye(afVar);
        ArrayList arrayList = yeVar.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) db3Var.h(((xe) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ze zeVar = (ze) list.get(i2);
                arrayList3.add(new xe(zeVar.a, zeVar.b, zeVar.c, zeVar.d));
            }
            vx.f0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = yeVar.d();
        this.c = new l73();
    }

    public static ze c(ze zeVar, pg3 pg3Var) {
        int iC = pg3Var.b.c(r3.f - 1, false);
        if (zeVar.b < iC) {
            return ze.a(zeVar, null, Math.min(zeVar.c, iC), 11);
        }
        return null;
    }

    public final void a(int i, nv0 nv0Var) {
        int i2;
        char c;
        boolean z;
        Object obj;
        nv0Var.b0(1154651354);
        char c2 = 2;
        int i3 = (nv0Var.h(this) ? 4 : 2) | i;
        if (nv0Var.R(i3 & 1, (i3 & 3) != 2)) {
            jc jcVar = (jc) nv0Var.j(s20.s);
            af afVar = this.b;
            List listA = afVar.a(afVar.g.length());
            int size = listA.size();
            int i4 = 0;
            while (i4 < size) {
                ze zeVar = (ze) listA.get(i4);
                int i5 = zeVar.b;
                Object obj2 = zeVar.a;
                if (i5 != zeVar.c) {
                    nv0Var.a0(725478935);
                    Object objO = nv0Var.O();
                    Object obj3 = c20.a;
                    Object objE = objO;
                    if (objO == obj3) {
                        objE = nc2.e(nv0Var);
                    }
                    qr1 qr1Var = (qr1) objE;
                    c = c2;
                    bq1 bq1VarZ = vm1.z(yp1.a, new er1(24, this, zeVar));
                    Object objO2 = nv0Var.O();
                    if (objO2 == obj3) {
                        z = true;
                        Object db3Var = new db3(14);
                        nv0Var.j0(db3Var);
                        obj = db3Var;
                    } else {
                        z = true;
                        obj = objO2;
                    }
                    bq1 bq1VarO = cl3.o(su2.a(bq1VarZ, false, (ns0) obj).d(new zg3(new pc2(this, zeVar))), qr1Var);
                    eb2.a.getClass();
                    bq1 bq1VarY = b32.y(bq1VarO, f80.A0);
                    boolean zH = nv0Var.h(this) | nv0Var.f(zeVar) | nv0Var.h(jcVar);
                    Object objO3 = nv0Var.O();
                    Object obj4 = objO3;
                    if (zH || objO3 == obj3) {
                        Object me1Var = new me1(this, zeVar, jcVar);
                        nv0Var.j0(me1Var);
                        obj4 = me1Var;
                    }
                    i2 = i3;
                    boolean z2 = false;
                    eo.a(rn.z(bq1VarY, qr1Var, null, (cs0) obj4, 508), nv0Var, 0);
                    og1 og1Var = (og1) obj2;
                    ug3 ug3VarA = og1Var.a();
                    if (ug3VarA == null || (ug3VarA.a == null && ug3VarA.b == null && ug3VarA.c == null && ug3VarA.d == null)) {
                        nv0Var.a0(728331710);
                        nv0Var.p(false);
                    } else {
                        nv0Var.a0(726303039);
                        Object objO4 = nv0Var.O();
                        Object obj5 = objO4;
                        if (objO4 == obj3) {
                            Object pg1Var = new pg1(qr1Var);
                            nv0Var.j0(pg1Var);
                            obj5 = pg1Var;
                        }
                        pg1 pg1Var2 = (pg1) obj5;
                        Object objO5 = nv0Var.O();
                        Object obj6 = objO5;
                        if (objO5 == obj3) {
                            Object l80Var = new l80(pg1Var2, z2 ? 1 : 0, 16);
                            nv0Var.j0(l80Var);
                            obj6 = l80Var;
                        }
                        rn.l((rs0) obj6, nv0Var, dm3.a);
                        a42 a42Var = pg1Var2.b;
                        a42 a42Var2 = pg1Var2.b;
                        Boolean boolValueOf = Boolean.valueOf((a42Var.g() & 2) != 0 ? z : false);
                        Boolean boolValueOf2 = Boolean.valueOf((a42Var2.g() & 1) != 0 ? z : false);
                        Boolean boolValueOf3 = Boolean.valueOf((a42Var2.g() & 4) != 0 ? z : false);
                        ug3 ug3VarA2 = og1Var.a();
                        h83 h83Var = ug3VarA2 != null ? ug3VarA2.a : null;
                        ug3 ug3VarA3 = og1Var.a();
                        h83 h83Var2 = ug3VarA3 != null ? ug3VarA3.b : null;
                        ug3 ug3VarA4 = og1Var.a();
                        h83 h83Var3 = ug3VarA4 != null ? ug3VarA4.c : null;
                        ug3 ug3VarA5 = og1Var.a();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, h83Var, h83Var2, h83Var3, ug3VarA5 != null ? ug3VarA5.d : null};
                        boolean zH2 = nv0Var.h(this) | nv0Var.f(zeVar);
                        Object objO6 = nv0Var.O();
                        Object obj7 = objO6;
                        if (zH2 || objO6 == obj3) {
                            Object er1Var = new er1(this, zeVar, pg1Var2, 23);
                            nv0Var.j0(er1Var);
                            obj7 = er1Var;
                        }
                        b(objArr, (ns0) obj7, nv0Var, (i2 << 6) & 896);
                        nv0Var.p(false);
                    }
                    nv0Var.p(false);
                } else {
                    i2 = i3;
                    c = c2;
                    nv0Var.a0(728345598);
                    nv0Var.p(false);
                }
                i4++;
                c2 = c;
                i3 = i2;
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new pt2(i, 13, this);
        }
    }

    public final void b(Object[] objArr, ns0 ns0Var, nv0 nv0Var, int i) {
        nv0Var.b0(-2083052099);
        int i2 = (i & 48) == 0 ? (nv0Var.h(ns0Var) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(this) ? 256 : 128;
        }
        nv0Var.Y(-358306546, Integer.valueOf(objArr.length));
        int i3 = i2 | (nv0Var.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= nv0Var.h(obj) ? 4 : 0;
        }
        nv0Var.p(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        int i4 = 1;
        if (nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(ns0Var);
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
            }
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zH = nv0Var.h(this) | ((i3 & 112) == 32);
            Object objO = nv0Var.O();
            if (zH || objO == c20.a) {
                objO = new zl(this, ns0Var, i4);
                nv0Var.j0(objO);
            }
            rn.i(array, (ns0) objO, nv0Var);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(this, objArr, ns0Var, i, 18);
        }
    }
}
