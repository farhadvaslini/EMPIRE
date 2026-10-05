package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gj0 extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ hj0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj0(hj0 hj0Var, int i) {
        super(1);
        this.g = i;
        this.h = hj0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        mm0 mm0Var;
        mm0 mm0Var2;
        int i = this.g;
        ti0 ti0Var = ti0.h;
        ti0 ti0Var2 = ti0.g;
        ti0 ti0Var3 = ti0.f;
        hj0 hj0Var = this.h;
        switch (i) {
            case 0:
                ck3 ck3Var = (ck3) obj;
                boolean zB = ck3Var.b(ti0Var3, ti0Var2);
                Object obj2 = null;
                if (zB) {
                    hs hsVar = hj0Var.y.a.c;
                    if (hsVar != null) {
                        obj2 = hsVar.c;
                    }
                } else if (ck3Var.b(ti0Var2, ti0Var)) {
                    hs hsVar2 = hj0Var.z.a.c;
                    if (hsVar2 != null) {
                        obj2 = hsVar2.c;
                    }
                } else {
                    obj2 = dj0.e;
                }
                return obj2 == null ? dj0.e : obj2;
            default:
                ck3 ck3Var2 = (ck3) obj;
                if (ck3Var2.b(ti0Var3, ti0Var2)) {
                    q43 q43Var = hj0Var.y.a.b;
                    return (q43Var == null || (mm0Var2 = q43Var.b) == null) ? dj0.d : mm0Var2;
                }
                if (!ck3Var2.b(ti0Var2, ti0Var)) {
                    return dj0.d;
                }
                q43 q43Var2 = hj0Var.z.a.b;
                return (q43Var2 == null || (mm0Var = q43Var2.b) == null) ? dj0.d : mm0Var;
        }
    }
}
