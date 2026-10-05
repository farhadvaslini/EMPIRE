package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dh1 implements PointerInputEventHandler {
    public final /* synthetic */ z60 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ x50 c;
    public final /* synthetic */ a42 d;
    public final /* synthetic */ ed e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;

    public dh1(z60 z60Var, int i, x50 x50Var, a42 a42Var, ed edVar, float f, boolean z) {
        this.a = z60Var;
        this.b = i;
        this.c = x50Var;
        this.d = a42Var;
        this.e = edVar;
        this.f = f;
        this.g = z;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(kb2 kb2Var, p40 p40Var) {
        z60 z60Var = this.a;
        t60 t60Var = new t60(z60Var, 7);
        int i = this.b;
        x50 x50Var = this.c;
        a42 a42Var = this.d;
        ed edVar = this.e;
        ch1 ch1Var = new ch1(z60Var, i, x50Var, a42Var, edVar, 0);
        ch1 ch1Var2 = new ch1(z60Var, i, x50Var, a42Var, edVar, 1);
        bh1 bh1Var = new bh1(z60Var, this.f, this.g, i, x50Var, edVar);
        float f = le0.a;
        Object objT = vp.t(kb2Var, new he0(t60Var, bh1Var, ch1Var, ch1Var2, (p40) null, 1), p40Var);
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        if (objT != y50Var) {
            objT = dm3Var;
        }
        return objT == y50Var ? objT : dm3Var;
    }
}
