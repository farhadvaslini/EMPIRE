package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nm implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ jj3 b;

    public /* synthetic */ nm(jj3 jj3Var, int i) {
        this.a = i;
        this.b = jj3Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(kb2 kb2Var, p40 p40Var) {
        int i = this.a;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        p40 p40Var2 = null;
        jj3 jj3Var = this.b;
        switch (i) {
            case 0:
                Object objW = ur.w(new mm(kb2Var, jj3Var, p40Var2, 0), p40Var);
                return objW == y50Var ? objW : dm3Var;
            default:
                Object objW2 = ur.w(new mm(kb2Var, jj3Var, p40Var2, 1), p40Var);
                return objW2 == y50Var ? objW2 : dm3Var;
        }
    }
}
