package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class br2 implements rs0 {
    public final /* synthetic */ int f;

    public /* synthetic */ br2(int i) {
        this.f = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        switch (this.f) {
            case 0:
                cq2 cq2Var = (cq2) obj;
                eg1 eg1Var = (eg1) obj2;
                return vr.m(er2.a(new bg1(eg1Var.a), er2.B, cq2Var), er2.a(new dg1(eg1Var.b), er2.C, cq2Var), er2.a(new cg1(eg1Var.c), er2.D, cq2Var));
            case 1:
                return Float.valueOf(((bg1) obj2).a);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return Integer.valueOf(((dg1) obj2).a);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return Integer.valueOf(((cg1) obj2).a);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((rp3) obj2).a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                cq2 cq2Var2 = (cq2) obj;
                x32 x32Var = (x32) obj2;
                Object objA = er2.a(new ld3(x32Var.a), er2.q, cq2Var2);
                Object objA2 = er2.a(new pe3(x32Var.b), er2.r, cq2Var2);
                Object objA3 = er2.a(new jh3(x32Var.c), er2.v, cq2Var2);
                fg3 fg3Var = x32Var.d;
                fg3 fg3Var2 = fg3.c;
                Object objA4 = er2.a(fg3Var, er2.l, cq2Var2);
                Object objA5 = er2.a(x32Var.e, s51.D, cq2Var2);
                eg1 eg1Var2 = x32Var.f;
                eg1 eg1Var3 = eg1.d;
                return vr.m(objA, objA2, objA3, objA4, objA5, er2.a(eg1Var2, er2.A, cq2Var2), er2.a(new zf1(x32Var.g), s51.F, cq2Var2), er2.a(new l01(x32Var.h), er2.s, cq2Var2), er2.a(x32Var.i, s51.G, cq2Var2));
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((io3) obj2).a;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                cq2 cq2Var3 = (cq2) obj;
                h83 h83Var = (h83) obj2;
                wx wxVar = new wx(h83Var.a.a());
                dr2 dr2Var = er2.p;
                Object objA6 = er2.a(wxVar, dr2Var, cq2Var3);
                jh3 jh3Var = new jh3(h83Var.b);
                dr2 dr2Var2 = er2.v;
                Object objA7 = er2.a(jh3Var, dr2Var2, cq2Var3);
                xq0 xq0Var = h83Var.c;
                xq0 xq0Var2 = xq0.g;
                Object objA8 = er2.a(xq0Var, er2.m, cq2Var3);
                Object objA9 = er2.a(h83Var.d, er2.t, cq2Var3);
                Object objA10 = er2.a(h83Var.e, er2.u, cq2Var3);
                String str = h83Var.g;
                Object objA11 = er2.a(new jh3(h83Var.h), dr2Var2, cq2Var3);
                Object objA12 = er2.a(h83Var.i, er2.n, cq2Var3);
                Object objA13 = er2.a(h83Var.j, er2.k, cq2Var3);
                qj1 qj1Var = h83Var.k;
                qj1 qj1Var2 = qj1.h;
                Object objA14 = er2.a(qj1Var, er2.y, cq2Var3);
                Object objA15 = er2.a(new wx(h83Var.l), dr2Var, cq2Var3);
                Object objA16 = er2.a(h83Var.m, er2.j, cq2Var3);
                r13 r13Var = h83Var.n;
                r13 r13Var2 = r13.d;
                return vr.m(objA6, objA7, objA8, objA9, objA10, -1, str, objA11, objA12, objA13, objA14, objA15, objA16, er2.a(r13Var, er2.o, cq2Var3));
            case 8:
                cq2 cq2Var4 = (cq2) obj;
                ug3 ug3Var = (ug3) obj2;
                h83 h83Var2 = ug3Var.a;
                ar2 ar2Var = er2.h;
                return vr.m(er2.a(h83Var2, ar2Var, cq2Var4), er2.a(ug3Var.b, ar2Var, cq2Var4), er2.a(ug3Var.c, ar2Var, cq2Var4), er2.a(ug3Var.d, ar2Var, cq2Var4));
            case vr.g /* 9 */:
                w62 w62Var = (w62) obj2;
                Boolean boolValueOf = Boolean.valueOf(w62Var.a);
                ar2 ar2Var2 = er2.a;
                return vr.m(boolValueOf, er2.a(new ci0(w62Var.b), s51.E, (cq2) obj));
            case vr.h /* 10 */:
                return Integer.valueOf(((ci0) obj2).a);
            case 11:
                return Integer.valueOf(((zf1) obj2).a);
            case vr.i /* 12 */:
                wg3 wg3Var = (wg3) obj2;
                return vr.m(er2.a(new vg3(wg3Var.a), s51.H, (cq2) obj), Boolean.valueOf(wg3Var.b));
            case 13:
                return Integer.valueOf(((vg3) obj2).a);
            case 14:
                return Integer.valueOf(((es2) obj2).a.g());
            case jo3.g /* 15 */:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = ni0.f;
                }
                return qx.D0(collection, list);
            case 16:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 17:
                Float f = (Float) obj;
                ((Float) obj2).floatValue();
                return f;
            case 18:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 19:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 20:
                return (no2) obj;
            case 21:
                return (String) obj;
            case 22:
                return (dm3) obj;
            case 23:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 24:
                return (z13) obj;
            case 25:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 26:
                return (g40) obj;
            case 27:
                return (d8) obj;
            case 28:
                return (z8) obj;
            default:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
        }
    }
}
