package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class y60 implements fn0 {
    public final /* synthetic */ p70 f;
    public final /* synthetic */ z60 g;
    public final /* synthetic */ float h;

    public y60(p70 p70Var, z60 z60Var, float f) {
        this.f = p70Var;
        this.g = z60Var;
        this.h = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gn0 gn0Var, p40 p40Var) throws Throwable {
        v60 v60Var;
        if (p40Var instanceof v60) {
            v60Var = (v60) p40Var;
            int i = v60Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                v60Var.j = i - Integer.MIN_VALUE;
            } else {
                v60Var = new v60(this, p40Var);
            }
        }
        Object obj = v60Var.i;
        int i2 = v60Var.j;
        if (i2 == 0) {
            y02.Q(obj);
            x60 x60Var = new x60(gn0Var, this.g, this.h);
            v60Var.j = 1;
            Object objA = this.f.a(x60Var, v60Var);
            y50 y50Var = y50.f;
            if (objA == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        return dm3.a;
    }
}
