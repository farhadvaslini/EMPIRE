package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class x60 implements gn0 {
    public final /* synthetic */ gn0 f;
    public final /* synthetic */ z60 g;
    public final /* synthetic */ float h;

    public x60(gn0 gn0Var, z60 z60Var, float f) {
        this.f = gn0Var;
        this.g = z60Var;
        this.h = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, p40 p40Var) {
        w60 w60Var;
        if (p40Var instanceof w60) {
            w60Var = (w60) p40Var;
            int i = w60Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                w60Var.j = i - Integer.MIN_VALUE;
            } else {
                w60Var = new w60(this, p40Var);
            }
        }
        Object obj2 = w60Var.i;
        int i2 = w60Var.j;
        if (i2 == 0) {
            y02.Q(obj2);
            if (Math.abs(((Number) obj).floatValue() - ((Number) this.g.h.e.getValue()).floatValue()) < this.h) {
                w60Var.j = 1;
                Object objK = this.f.k(obj, w60Var);
                y50 y50Var = y50.f;
                if (objK == y50Var) {
                    return y50Var;
                }
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj2);
        }
        return dm3.a;
    }
}
