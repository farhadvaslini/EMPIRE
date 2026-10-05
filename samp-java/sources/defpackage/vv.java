package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class vv implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vv(qt1 qt1Var, List list, boolean z) {
        this.f = 1;
        this.i = qt1Var;
        this.g = z;
        this.h = list;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        final int i2 = 2;
        final int i3 = 1;
        final int i4 = 3;
        dm3 dm3Var = dm3.a;
        final int i5 = 0;
        Object obj2 = this.i;
        Object obj3 = this.h;
        final boolean z = this.g;
        switch (i) {
            case 0:
                List list = (List) obj3;
                ns0 ns0Var = (ns0) obj2;
                ae1 ae1Var = (ae1) obj;
                ae1Var.getClass();
                if (list.isEmpty()) {
                    ae1.W(ae1Var, null, vm1.o, 3);
                } else {
                    ae1Var.X(list.size(), new la(5, new u0(26), list), new jw(0, list), new d00(802480018, new kw(list, z, ns0Var), true));
                }
                ae1.W(ae1Var, null, vm1.p, 3);
                break;
            case 1:
                final qt1 qt1Var = (qt1) obj2;
                final List list2 = (List) obj3;
                mf1 mf1Var = new mf1() { // from class: ib0
                    @Override // defpackage.mf1
                    public final void i(of1 of1Var, ef1 ef1Var) {
                        boolean z2 = z;
                        List list3 = list2;
                        qt1 qt1Var2 = qt1Var;
                        if (z2 && !list3.contains(qt1Var2)) {
                            list3.add(qt1Var2);
                        }
                        if (ef1Var == ef1.ON_START && !list3.contains(qt1Var2)) {
                            list3.add(qt1Var2);
                        }
                        if (ef1Var == ef1.ON_STOP) {
                            list3.remove(qt1Var2);
                        }
                    }
                };
                qt1Var.m.j.a(mf1Var);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                final i32 i32Var = (i32) obj3;
                final x50 x50Var = (x50) obj2;
                dv2 dv2Var = (dv2) obj;
                if (!z) {
                    cs0 cs0Var = new cs0() { // from class: r22
                        @Override // defpackage.cs0
                        public final Object a() {
                            int i6 = i2;
                            x50 x50Var2 = x50Var;
                            i32 i32Var2 = i32Var;
                            boolean z2 = false;
                            switch (i6) {
                                case 0:
                                    if (i32Var2.a()) {
                                        cl3.t(x50Var2, null, new s22(0, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (i32Var2.c()) {
                                        cl3.t(x50Var2, null, new s22(1, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                    if (i32Var2.a()) {
                                        cl3.t(x50Var2, null, new s22(0, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (i32Var2.c()) {
                                        cl3.t(x50Var2, null, new s22(1, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    };
                    a71[] a71VarArr = bv2.a;
                    dv2Var.a(pu2.z, new y0(null, cs0Var));
                    dv2Var.a(pu2.B, new y0(null, new cs0() { // from class: r22
                        @Override // defpackage.cs0
                        public final Object a() {
                            int i6 = i4;
                            x50 x50Var2 = x50Var;
                            i32 i32Var2 = i32Var;
                            boolean z2 = false;
                            switch (i6) {
                                case 0:
                                    if (i32Var2.a()) {
                                        cl3.t(x50Var2, null, new s22(0, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (i32Var2.c()) {
                                        cl3.t(x50Var2, null, new s22(1, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                    if (i32Var2.a()) {
                                        cl3.t(x50Var2, null, new s22(0, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (i32Var2.c()) {
                                        cl3.t(x50Var2, null, new s22(1, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    }));
                } else {
                    cs0 cs0Var2 = new cs0() { // from class: r22
                        @Override // defpackage.cs0
                        public final Object a() {
                            int i6 = i5;
                            x50 x50Var2 = x50Var;
                            i32 i32Var2 = i32Var;
                            boolean z2 = false;
                            switch (i6) {
                                case 0:
                                    if (i32Var2.a()) {
                                        cl3.t(x50Var2, null, new s22(0, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (i32Var2.c()) {
                                        cl3.t(x50Var2, null, new s22(1, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                    if (i32Var2.a()) {
                                        cl3.t(x50Var2, null, new s22(0, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (i32Var2.c()) {
                                        cl3.t(x50Var2, null, new s22(1, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    };
                    a71[] a71VarArr2 = bv2.a;
                    dv2Var.a(pu2.y, new y0(null, cs0Var2));
                    dv2Var.a(pu2.A, new y0(null, new cs0() { // from class: r22
                        @Override // defpackage.cs0
                        public final Object a() {
                            int i6 = i3;
                            x50 x50Var2 = x50Var;
                            i32 i32Var2 = i32Var;
                            boolean z2 = false;
                            switch (i6) {
                                case 0:
                                    if (i32Var2.a()) {
                                        cl3.t(x50Var2, null, new s22(0, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (i32Var2.c()) {
                                        cl3.t(x50Var2, null, new s22(1, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                                    if (i32Var2.a()) {
                                        cl3.t(x50Var2, null, new s22(0, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (i32Var2.c()) {
                                        cl3.t(x50Var2, null, new s22(1, null, i32Var2), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    }));
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((h62) obj).C((i62) obj2, 0, 0, ((Number) ((e93) obj3).getValue()).floatValue() + (z ? 5.0f : 0.0f));
                break;
            default:
                String str = (String) obj3;
                z53 z53Var = (z53) obj2;
                dv2 dv2Var2 = (dv2) obj;
                if (z) {
                    a71[] a71VarArr3 = bv2.a;
                    cv2 cv2Var = zu2.k;
                    a71 a71Var = bv2.a[3];
                    dj1 dj1Var = new dj1(0);
                    cv2Var.getClass();
                    dv2Var2.a(cv2Var, dj1Var);
                }
                it1 it1Var = new it1(23, z53Var);
                a71[] a71VarArr4 = bv2.a;
                dv2Var2.a(pu2.v, new y0(null, it1Var));
                bv2.g(dv2Var2, str);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ vv(Object obj, boolean z, Object obj2, int i) {
        this.f = i;
        this.h = obj;
        this.g = z;
        this.i = obj2;
    }

    public /* synthetic */ vv(boolean z, Object obj, Object obj2, int i) {
        this.f = i;
        this.g = z;
        this.h = obj;
        this.i = obj2;
    }
}
