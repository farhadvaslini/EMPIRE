package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ty implements gn0 {
    public final /* synthetic */ np f;
    public final /* synthetic */ int g;

    public ty(np npVar, int i) {
        this.f = npVar;
        this.g = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, p40 p40Var) throws vb0 {
        sy syVar;
        Object obj2;
        if (p40Var instanceof sy) {
            syVar = (sy) p40Var;
            int i = syVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                syVar.k = i - Integer.MIN_VALUE;
            } else {
                syVar = new sy(this, p40Var);
            }
        }
        Object obj3 = syVar.i;
        int i2 = syVar.k;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        if (i2 == 0) {
            y02.Q(obj3);
            k11 k11Var = new k11(this.g, obj);
            syVar.k = 1;
            if (this.f.a(syVar, k11Var) != y50Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                y02.Q(obj3);
            }
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y02.Q(obj3);
        syVar.k = 2;
        o50 o50VarI = syVar.i();
        lq.r(o50VarI);
        p40 p40VarI = vr.I(syVar);
        wb0 wb0Var = p40VarI instanceof wb0 ? (wb0) p40VarI : null;
        if (wb0Var == null) {
            obj2 = dm3Var;
        } else {
            q50 q50Var = wb0Var.i;
            if (s51.C(q50Var, o50VarI)) {
                wb0Var.k = dm3Var;
                wb0Var.h = 1;
                q50Var.C(o50VarI, wb0Var);
            } else {
                o50 o50VarK = o50VarI.k(new yu3(yu3.g));
                wb0Var.k = dm3Var;
                wb0Var.h = 1;
                q50Var.C(o50VarK, wb0Var);
            }
            obj2 = y50Var;
        }
        if (obj2 != y50Var) {
            obj2 = dm3Var;
        }
        return obj2 == y50Var ? y50Var : dm3Var;
    }
}
