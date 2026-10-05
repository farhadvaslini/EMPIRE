package defpackage;

import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bd implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ bd(List list, ns0 ns0Var, ns0 ns0Var2, SimpleDateFormat simpleDateFormat) {
        this.f = 8;
        this.h = list;
        this.g = ns0Var;
        this.i = ns0Var2;
        this.j = simpleDateFormat;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    @Override // defpackage.ns0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.j;
        Object obj3 = this.g;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ed edVar = (ed) obj5;
                pe peVar = (pe) obj4;
                ns0 ns0Var = (ns0) obj3;
                mk2 mk2Var = (mk2) obj2;
                ne neVar = (ne) obj;
                t22.O(neVar, edVar.c);
                d42 d42Var = neVar.e;
                Object objA = ed.a(edVar, d42Var.getValue());
                if (!s51.n(objA, d42Var.getValue())) {
                    edVar.c.g.setValue(objA);
                    peVar.g.setValue(objA);
                    if (ns0Var != null) {
                        ns0Var.h(edVar);
                    }
                    neVar.a();
                    mk2Var.f = true;
                } else if (ns0Var != null) {
                    ns0Var.h(edVar);
                }
                break;
            case 1:
                qf0 qf0Var = (qf0) obj;
                qf0Var.getClass();
                ((fl) obj5).a.b(qf0Var, (ua0) obj4, (ab1) obj2, (ns0) obj3);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ye1 ye1Var = (ye1) obj5;
                gg3 gg3Var = (gg3) obj4;
                bg3 bg3Var = (bg3) obj3;
                b11 b11Var = (b11) obj2;
                if (ye1Var.b()) {
                    a31 a31Var = ye1Var.d;
                    w40 w40Var = ye1Var.v;
                    w40 w40Var2 = ye1Var.w;
                    qk2 qk2Var = new qk2();
                    v1 v1Var = new v1(a31Var, w40Var, qk2Var, 28);
                    j72 j72Var = gg3Var.a;
                    j72Var.a(bg3Var, b11Var, v1Var, w40Var2);
                    jg3 jg3Var = new jg3(gg3Var, j72Var);
                    gg3Var.b.set(jg3Var);
                    qk2Var.f = jg3Var;
                    ye1Var.e = jg3Var;
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                f21 f21Var = (f21) obj4;
                nk2 nk2Var = (nk2) obj3;
                x50 x50Var = (x50) obj2;
                long jLongValue = ((Long) obj).longValue();
                e93 e93Var = (e93) ((os1) obj5).getValue();
                long jLongValue2 = e93Var != null ? ((Number) e93Var.getValue()).longValue() : jLongValue;
                long j = f21Var.c;
                qs1 qs1Var = f21Var.a;
                if (j == Long.MIN_VALUE || nk2Var.f != t22.y(x50Var.h())) {
                    f21Var.c = jLongValue;
                    Object[] objArr = qs1Var.f;
                    int i2 = qs1Var.h;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ((d21) objArr[i3]).k = true;
                    }
                    nk2Var.f = t22.y(x50Var.h());
                }
                float f = nk2Var.f;
                if (f == 0.0f) {
                    Object[] objArr2 = qs1Var.f;
                    int i4 = qs1Var.h;
                    for (int i5 = 0; i5 < i4; i5++) {
                        d21 d21Var = (d21) objArr2[i5];
                        d21Var.h.setValue(d21Var.i.c);
                        d21Var.k = true;
                    }
                } else {
                    long j2 = (long) ((jLongValue2 - f21Var.c) / f);
                    Object[] objArr3 = qs1Var.f;
                    int i6 = qs1Var.h;
                    boolean z = true;
                    for (int i7 = 0; i7 < i6; i7++) {
                        d21 d21Var2 = (d21) objArr3[i7];
                        if (!d21Var2.j) {
                            d21Var2.m.b.setValue(Boolean.FALSE);
                            if (d21Var2.k) {
                                d21Var2.k = false;
                                d21Var2.l = j2;
                            }
                            long j3 = j2 - d21Var2.l;
                            d21Var2.h.setValue(d21Var2.i.b(j3));
                            d21Var2.j = d21Var2.i.g(j3);
                        }
                        if (!d21Var2.j) {
                            z = false;
                        }
                    }
                    f21Var.d.setValue(Boolean.valueOf(!z));
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nd1 nd1Var = (nd1) obj5;
                nd1Var.c = new yj0((zc1) obj4, (ra3) obj3, (sc2) obj2);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                os1 os1Var = (os1) obj5;
                os1 os1Var2 = (os1) obj4;
                os1 os1Var3 = (os1) obj3;
                z32 z32Var = (z32) obj2;
                z60 z60Var = (z60) obj;
                z60Var.getClass();
                if (((Boolean) os1Var3.getValue()).booleanValue()) {
                    z32Var.h(z60Var.d() >= 0.5f ? 1.0f : 0.0f);
                    ((ns0) os1Var.getValue()).h(Boolean.valueOf(z32Var.g() == 1.0f));
                    os1Var3.setValue(Boolean.FALSE);
                } else {
                    z32Var.h(((Boolean) os1Var2.getValue()).booleanValue() ? 0.0f : 1.0f);
                    ((ns0) os1Var.getValue()).h(Boolean.valueOf(z32Var.g() == 1.0f));
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nk2 nk2Var2 = (nk2) obj5;
                wq1 wq1Var = (wq1) obj4;
                us2 us2Var = (us2) obj3;
                a4 a4Var = (a4) obj2;
                ne neVar2 = (ne) obj;
                float fFloatValue = ((Number) neVar2.e.getValue()).floatValue() - nk2Var2.f;
                if (br.n(fFloatValue)) {
                    if (((Boolean) a4Var.h(Float.valueOf(nk2Var2.f))).booleanValue()) {
                        neVar2.a();
                    }
                    break;
                } else if (!br.n(fFloatValue - wq1Var.e(us2Var, fFloatValue))) {
                    neVar2.a();
                    break;
                } else {
                    nk2Var2.f += fFloatValue;
                    if (((Boolean) a4Var.h(Float.valueOf(nk2Var2.f))).booleanValue()) {
                    }
                }
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                qt1 qt1Var = (qt1) obj;
                qt1Var.getClass();
                ((mk2) obj2).f = true;
                ((wt1) obj5).a((fu1) obj4, (Bundle) obj3, qt1Var, ni0.f);
                break;
            case 8:
                List list = (List) obj5;
                ae1 ae1Var = (ae1) obj;
                ae1Var.getClass();
                ae1.W(ae1Var, null, s51.d, 3);
                ae1Var.X(list.size(), new la(18, new s12(27), list), new jw(7, list), new d00(802480018, new ug2(list, (ns0) obj3, (ns0) obj4, (SimpleDateFormat) obj2), true));
                ae1.W(ae1Var, null, s51.f, 3);
                break;
            default:
                y92 y92Var = (y92) obj5;
                k82 k82Var = ((y31) obj4).a;
                rs0 rs0Var = (rs0) obj3;
                os1 os1Var4 = (os1) obj2;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() && y92Var.m(k82Var.b)) {
                    os1Var4.setValue(k82Var.b);
                } else {
                    rs0Var.f(k82Var.b, bool);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ bd(mk2 mk2Var, wt1 wt1Var, fu1 fu1Var, Bundle bundle) {
        this.f = 7;
        this.j = mk2Var;
        this.h = wt1Var;
        this.i = fu1Var;
        this.g = bundle;
    }

    public /* synthetic */ bd(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.h = obj;
        this.i = obj2;
        this.g = obj3;
        this.j = obj4;
    }

    public /* synthetic */ bd(fl flVar, ua0 ua0Var, ab1 ab1Var, ns0 ns0Var) {
        this.f = 1;
        this.h = flVar;
        this.i = ua0Var;
        this.j = ab1Var;
        this.g = ns0Var;
    }
}
