package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qz0 implements cs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ qz0(int i, a42 a42Var, os1 os1Var) {
        this.g = i;
        this.h = a42Var;
        this.i = os1Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj = this.i;
        Object obj2 = this.h;
        int i2 = this.g;
        switch (i) {
            case 0:
                wz0 wz0Var = (wz0) obj2;
                try {
                    wz0Var.B.k(i2, (nj0) obj);
                } catch (IOException e) {
                    nj0 nj0Var = nj0.i;
                    wz0Var.b(nj0Var, nj0Var, e);
                }
                break;
            default:
                ((a42) obj2).h(i2);
                ((os1) obj).setValue(Boolean.FALSE);
                break;
        }
        return dm3Var;
        return dm3Var;
    }

    public /* synthetic */ qz0(wz0 wz0Var, int i, nj0 nj0Var) {
        this.h = wz0Var;
        this.g = i;
        this.i = nj0Var;
    }
}
