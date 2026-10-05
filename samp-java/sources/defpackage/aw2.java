package defpackage;

import java.util.List;
import java.util.Locale;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class aw2 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ aw2(aw2 aw2Var, vw2 vw2Var) {
        this.f = 12;
        this.g = aw2Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        int i2 = 1;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                String str = ((kq2) obj).e;
                String lowerCase = ((sv2) obj2).c.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return Boolean.valueOf(s51.n(str, lowerCase));
            case 1:
                ae1 ae1Var = (ae1) obj;
                ae1Var.getClass();
                List listN0 = qx.N0(((hp2) obj2).c.entrySet());
                ae1Var.X(listN0.size(), new la(25, new cr2(20), listN0), new jw(14, listN0), new d00(802480018, new kk1(2, listN0), true));
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ae1 ae1Var2 = (ae1) obj;
                ae1Var2.getClass();
                List list = ((o72) obj2).c;
                ae1Var2.X(list.size(), new la(23, new cr2(21), list), new jw(12, list), new d00(802480018, new kk1(i2, list), true));
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((m71) obj).getClass();
                ((ep0) ((bp0) obj2)).b(8, true, true);
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                sz2 sz2Var = (sz2) obj2;
                l22 l22Var = (l22) obj;
                l22Var.getClass();
                if (l22Var.equals(e22.a)) {
                    sz2Var.w.setValue(GameActivity.initializePluginRuntimeAndSamp$lambda$7(sz2Var.h.g));
                } else if (l22Var.equals(i22.a) || (l22Var instanceof h22)) {
                    sz2Var.t.setValue(GameActivity.initializePluginRuntimeAndSamp$lambda$10(sz2Var.k.g));
                    sz2Var.u = ((Number) sz2Var.l.a()).longValue();
                }
                sz2Var.d(l22Var);
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                t13 t13Var = (t13) obj2;
                uw0 uw0Var = (uw0) obj;
                uw0Var.g(uw0Var.h() * 3.0f);
                uw0Var.P(t13Var.a);
                uw0Var.o(t13Var.b);
                uw0Var.l(t13Var.c);
                uw0Var.q(t13Var.d);
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                x33 x33Var = (x33) obj2;
                uw0 uw0Var2 = (uw0) obj;
                uw0Var2.m(x33Var.t);
                uw0Var2.s(x33Var.u);
                uw0Var2.d(x33Var.v);
                uw0Var2.p(x33Var.w);
                uw0Var2.k(x33Var.x);
                uw0Var2.g(x33Var.y);
                uw0Var2.w(x33Var.z);
                uw0Var2.b(x33Var.A);
                uw0Var2.j(x33Var.B);
                uw0Var2.u(x33Var.C);
                uw0Var2.q0(x33Var.D);
                uw0Var2.P(x33Var.E);
                uw0Var2.o(x33Var.F);
                uw0Var2.r(x33Var.G);
                uw0Var2.l(x33Var.H);
                uw0Var2.q(x33Var.I);
                uw0Var2.D0(x33Var.J);
                uw0Var2.n(x33Var.K);
                uw0Var2.f(x33Var.L);
                uw0Var2.W0(x33Var.M);
                return dm3.a;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                e43 e43Var = (e43) obj2;
                lv2 lv2Var = e43Var.f;
                lv2Var.getClass();
                if (!s51.n(e43Var.f, lv2Var)) {
                    yb2.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                js1 js1Var = e43Var.e;
                Object obj3 = e43Var.c;
                if (js1Var != null) {
                    if (obj3 != null) {
                        yb2.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    js1Var.a(obj);
                } else if (obj3 == null) {
                    e43Var.c = obj;
                } else {
                    js1 js1Var2 = or2.a;
                    js1 js1Var3 = new js1();
                    js1Var3.a(obj3);
                    js1Var3.a(obj);
                    e43Var.e = js1Var3;
                    e43Var.c = null;
                }
                return dm3.a;
            case 8:
                return Boolean.valueOf(s51.n(((dl0) obj).a, (z53) obj2));
            case vr.g /* 9 */:
                p73 p73Var = (p73) obj2;
                synchronized (p73Var.g) {
                    o73 o73Var = p73Var.i;
                    o73Var.getClass();
                    Object obj4 = o73Var.b;
                    obj4.getClass();
                    int i3 = o73Var.d;
                    wr1 wr1Var = o73Var.c;
                    if (wr1Var == null) {
                        wr1Var = new wr1();
                        o73Var.c = wr1Var;
                        o73Var.f.m(obj4, wr1Var);
                    }
                    o73Var.b(obj, i3, obj4, wr1Var);
                }
                return dm3.a;
            case vr.h /* 10 */:
                ne neVar = (ne) obj;
                ((rs0) obj2).f(neVar.e.getValue(), rn.f1.b.h(neVar.f));
                return dm3.a;
            case 11:
                ((ns0) obj).h((vd3) obj2);
                return dm3.a;
            case vr.i /* 12 */:
                aw2 aw2Var = (aw2) obj2;
                nk3 nk3Var = (nk3) obj;
                if (nk3Var instanceof i4) {
                    aw2Var.h(((i4) nk3Var).t);
                    return Boolean.TRUE;
                }
                c.q("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 13:
                lf3 lf3Var = (lf3) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                z32 z32Var = lf3Var.a;
                float fG = z32Var.g() + fFloatValue;
                z32 z32Var2 = lf3Var.b;
                if (fG > z32Var2.g()) {
                    fFloatValue = z32Var2.g() - z32Var.g();
                } else if (fG < 0.0f) {
                    fFloatValue = -z32Var.g();
                }
                z32Var.h(z32Var.g() + fFloatValue);
                return Float.valueOf(fFloatValue);
            default:
                ug3 ug3Var = (ug3) obj2;
                ze zeVar = (ze) obj;
                we weVar = (we) zeVar.a;
                if (weVar instanceof ng1) {
                    ng1 ng1Var = (ng1) weVar;
                    if (ng1Var.b == null) {
                        return ze.a(zeVar, new ng1(ng1Var.a, ug3Var), 0, 14);
                    }
                }
                if (!(weVar instanceof mg1)) {
                    return zeVar;
                }
                mg1 mg1Var = (mg1) weVar;
                return mg1Var.b == null ? ze.a(zeVar, new mg1(mg1Var.a, ug3Var), 0, 14) : zeVar;
        }
    }

    public /* synthetic */ aw2(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
