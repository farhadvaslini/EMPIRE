package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class g50 implements PointerInputEventHandler {
    public final /* synthetic */ qe3 a;
    public final /* synthetic */ sf3 b;

    public g50(qe3 qe3Var, sf3 sf3Var) {
        this.a = qe3Var;
        this.b = sf3Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(kb2 kb2Var, p40 p40Var) {
        Object objW = ur.w(new f50(kb2Var, this.a, this.b, null, 0), p40Var);
        return objW == y50.f ? objW : dm3.a;
    }
}
