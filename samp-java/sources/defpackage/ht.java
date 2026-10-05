package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class ht implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ht(e93 e93Var, e93 e93Var2, ga3 ga3Var, e93 e93Var3, ek3 ek3Var, ek3 ek3Var2, ga3 ga3Var2, ct ctVar) {
        this.f = 0;
        this.g = e93Var;
        this.h = e93Var2;
        this.l = ga3Var;
        this.i = e93Var3;
        this.j = ek3Var;
        this.k = ek3Var2;
        this.m = ga3Var2;
        this.n = ctVar;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        qf0 qf0Var;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = 0;
        Object obj2 = this.n;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.i;
        Object obj8 = this.h;
        Object obj9 = this.g;
        int i3 = 3;
        switch (i) {
            case 0:
                ga3 ga3Var = (ga3) obj4;
                e93 e93Var = (e93) obj7;
                e93 e93Var2 = (e93) obj6;
                e93 e93Var3 = (e93) obj5;
                ga3 ga3Var2 = (ga3) obj3;
                ct ctVar = (ct) obj2;
                qf0 qf0Var2 = (qf0) obj;
                long j = ((wx) ((e93) obj9).getValue()).a;
                long j2 = ((wx) ((e93) obj8).getValue()).a;
                float fT = qf0Var2.T(2.0f);
                float f = ga3Var.a;
                float f2 = f / 2.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (qf0Var2.a() >> 32));
                boolean zC = wx.c(j, j2);
                fm0 fm0Var = fm0.a;
                if (zC) {
                    qf0Var = qf0Var2;
                    qf0Var.S(j, (226 & 2) != 0 ? 0L : 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fT)) << 32) | (((long) Float.floatToRawIntBits(fT)) & 4294967295L), fm0Var);
                } else {
                    qf0Var = qf0Var2;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                    float f3 = fIntBitsToFloat - (f * 2.0f);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                    float fMax = Math.max(0.0f, fT - f);
                    qf0Var.S(j, (226 & 2) != 0 ? 0L : jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), fm0Var);
                    float f4 = fIntBitsToFloat - f;
                    float f5 = fT - f2;
                    qf0Var.S(j2, (226 & 2) != 0 ? 0L : (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), ga3Var);
                }
                long j3 = ((wx) e93Var.getValue()).a;
                float fFloatValue = ((Number) e93Var2.getValue()).floatValue();
                float fFloatValue2 = ((Number) e93Var3.getValue()).floatValue();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (qf0Var.a() >> 32));
                float fN = lq.N(0.4f, 0.5f, fFloatValue2);
                float fN2 = lq.N(0.7f, 0.5f, fFloatValue2);
                float fN3 = lq.N(0.5f, 0.5f, fFloatValue2);
                float fN4 = lq.N(0.3f, 0.5f, fFloatValue2);
                ctVar.a.h();
                da daVar = ctVar.a;
                daVar.a.moveTo(0.2f * fIntBitsToFloat2, fN3 * fIntBitsToFloat2);
                daVar.e(fN * fIntBitsToFloat2, fN2 * fIntBitsToFloat2);
                daVar.e(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fN4);
                fa faVar = ctVar.b;
                faVar.a.setPath(daVar != null ? daVar.a : null, false);
                da daVar2 = ctVar.c;
                daVar2.h();
                faVar.a(0.0f, faVar.a.getLength() * fFloatValue, daVar2);
                qf0.b1(qf0Var, ctVar.c, j3, 0.0f, ga3Var2, 52);
                return dm3Var;
            case 1:
                List list = (List) obj9;
                ae1 ae1Var = (ae1) obj;
                ae1Var.getClass();
                ae1Var.X(list.size(), new la(17, new s12(26), list), new jw(6, list), new d00(802480018, new hg2(list, (ns0) obj8, (cs0) obj7, (x50) obj6, (lf2) obj5, (String) obj4, (os1) obj3, (os1) obj2), true));
                ae1.W(ae1Var, null, rn.z, 3);
                return dm3Var;
            default:
                vj2 vj2Var = (vj2) obj9;
                String str = (String) obj8;
                cs0 cs0Var = (cs0) obj7;
                cs0 cs0Var2 = (cs0) obj6;
                ns0 ns0Var = (ns0) obj5;
                rs0 rs0Var = (rs0) obj4;
                ns0 ns0Var2 = (ns0) obj3;
                ns0 ns0Var3 = (ns0) obj2;
                ae1 ae1Var2 = (ae1) obj;
                ae1Var2.getClass();
                if (s51.n(vj2Var, uj2.a)) {
                    ae1.W(ae1Var2, null, rn.I, 3);
                    return dm3Var;
                }
                if (s51.n(vj2Var, tj2.a)) {
                    ae1.W(ae1Var2, null, new d00(2110460202, new vw(cs0Var, 2), true), 3);
                    return dm3Var;
                }
                if (!(vj2Var instanceof sj2)) {
                    c.k();
                    return null;
                }
                ae1.W(ae1Var2, null, new d00(777661001, new w91(14, vj2Var, cs0Var), true), 3);
                sj2 sj2Var = (sj2) vj2Var;
                if (sj2Var.c) {
                    ae1.W(ae1Var2, null, new d00(-1002326300, new vw(cs0Var, i3), true), 3);
                }
                boolean zQ0 = y93.q0(str);
                ArrayList arrayList = sj2Var.a;
                if (!zQ0) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj10 = arrayList.get(i4);
                        i4++;
                        if (y93.h0(((qj2) obj10).a.c, str, true)) {
                            arrayList2.add(obj10);
                        }
                    }
                    arrayList = arrayList2;
                }
                if (arrayList.isEmpty()) {
                    ae1.W(ae1Var2, null, new d00(231194523, new dz2(str, cs0Var, cs0Var2, i2), true), 3);
                    return dm3Var;
                }
                ae1Var2.X(arrayList.size(), new la(24, new cr2(22), arrayList), new jw(13, arrayList), new d00(802480018, new tu1(arrayList, ns0Var, rs0Var, ns0Var2, ns0Var3, 1), true));
                return dm3Var;
        }
    }

    public /* synthetic */ ht(Object obj, Object obj2, cs0 cs0Var, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = cs0Var;
        this.j = obj3;
        this.k = obj4;
        this.l = obj5;
        this.m = obj6;
        this.n = obj7;
    }
}
