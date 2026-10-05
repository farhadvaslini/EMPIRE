package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class if3 implements PointerInputEventHandler {
    public final /* synthetic */ x50 a;
    public final /* synthetic */ os1 b;
    public final /* synthetic */ qr1 c;
    public final /* synthetic */ os1 d;

    public if3(x50 x50Var, os1 os1Var, qr1 qr1Var, os1 os1Var2) {
        this.a = x50Var;
        this.b = os1Var;
        this.c = qr1Var;
        this.d = os1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(kb2 kb2Var, p40 p40Var) {
        hf3 hf3Var = new hf3(this.a, this.b, this.c, null);
        zb zbVar = new zb(this.d, 28);
        af0 af0Var = cd3.a;
        Object objW = ur.w(new m9(kb2Var, hf3Var, zbVar, new xc2(kb2Var), (p40) null, 14), p40Var);
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        if (objW != y50Var) {
            objW = dm3Var;
        }
        return objW == y50Var ? objW : dm3Var;
    }
}
