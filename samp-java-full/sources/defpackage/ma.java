package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ma implements x50 {
    public final View f;
    public final gg3 g;
    public final x50 h;
    public final AtomicReference i = new AtomicReference(null);

    public ma(View view, gg3 gg3Var, x50 x50Var) {
        this.f = view;
        this.g = gg3Var;
        this.h = x50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ze1 ze1Var, q40 q40Var) {
        ka kaVar;
        if (q40Var instanceof ka) {
            kaVar = (ka) q40Var;
            int i = kaVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kaVar.k = i - Integer.MIN_VALUE;
            } else {
                kaVar = new ka(this, q40Var);
            }
        }
        Object obj = kaVar.i;
        int i2 = kaVar.k;
        if (i2 == 0) {
            y02.Q(obj);
            i iVar = new i(2, ze1Var, this);
            p40 p40Var = null;
            j jVar = new j(this, p40Var, 3);
            kaVar.k = 1;
            if (ur.w(new n9(iVar, this.i, jVar, p40Var, 15), kaVar) == y50.f) {
                return;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            y02.Q(obj);
        }
        c.d();
    }

    @Override // defpackage.x50
    public final o50 h() {
        return this.h.h();
    }
}
