package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t91 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ nu1 g;
    public final /* synthetic */ sa1 h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ go3 j;
    public final /* synthetic */ os1 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ e93 m;
    public final /* synthetic */ os1 n;
    public final /* synthetic */ os1 o;

    public /* synthetic */ t91(nu1 nu1Var, sa1 sa1Var, Context context, go3 go3Var, os1 os1Var, String str, e93 e93Var, os1 os1Var2, os1 os1Var3, int i) {
        this.f = i;
        this.g = nu1Var;
        this.h = sa1Var;
        this.i = context;
        this.j = go3Var;
        this.k = os1Var;
        this.l = str;
        this.m = e93Var;
        this.n = os1Var2;
        this.o = os1Var3;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    hb3.a(j43.c, null, ((fy) nv0Var.j(hy.a)).n, 0L, 0.0f, 0.0f, null, gq.N(-701900712, new t91(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, 1), nv0Var), nv0Var, 12582918, 122);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    yh1.b(j43.c, false, null, gq.N(-59954446, new t91(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, 2), nv0Var2), nv0Var2, 3078);
                }
                break;
            default:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    h33.a(null, gq.N(-251795084, new aa1(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o), nv0Var3), nv0Var3, 48);
                }
                break;
        }
        return dm3Var;
    }
}
