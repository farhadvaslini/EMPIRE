package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class p90 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ p90(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [g71, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v3, types: [as1] */
    /* JADX WARN: Type inference failed for: r9v2, types: [as1] */
    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                kj3 kj3Var = ((d43) obj).i;
                return new wx(vp.N(kj3Var.a, kj3Var.b, pg0.b.b(0.0f)));
            case 1:
                ArrayList arrayList = ((qv0) obj).a;
                is1 is1Var = new is1(arrayList.size());
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ?? r4 = (g71) arrayList.get(i2);
                    Object obj2 = r4.b;
                    int i3 = r4.a;
                    Object r61Var = obj2 != null ? new r61(Integer.valueOf(i3), r4.b) : Integer.valueOf(i3);
                    int iF = is1Var.f(r61Var);
                    boolean z = iF < 0;
                    Object obj3 = z ? null : is1Var.c[iF];
                    if (obj3 != null) {
                        if (obj3 instanceof as1) {
                            ?? r8 = (as1) obj3;
                            r8.b(r4);
                            r4 = r8;
                        } else {
                            Object[] objArr = cy1.a;
                            ?? as1Var = new as1(2);
                            as1Var.b(obj3);
                            as1Var.b(r4);
                            r4 = as1Var;
                        }
                    }
                    if (z) {
                        int i4 = ~iF;
                        is1Var.b[i4] = r61Var;
                        is1Var.c[i4] = r4;
                    } else {
                        is1Var.c[iF] = r4;
                    }
                }
                return new jr1(is1Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((vg2) obj).g.h();
                return dm3.a;
            default:
                return new r32[((fn0[]) obj).length];
        }
    }
}
