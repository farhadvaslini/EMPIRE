package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class b93 extends mb3 implements ss0 {
    public int j;
    public /* synthetic */ gn0 k;
    public /* synthetic */ int l;
    public final /* synthetic */ c93 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b93(c93 c93Var, p40 p40Var) {
        super(3, p40Var);
        this.m = c93Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        b93 b93Var = new b93(this.m, (p40) obj3);
        b93Var.k = (gn0) obj;
        b93Var.l = iIntValue;
        return b93Var.o(dm3.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r4.k(defpackage.m33.f, r16) == r13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        if (r4.k(defpackage.m33.h, r16) != r13) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        c93 c93Var = this.m;
        long j = c93Var.b;
        gn0 gn0Var = this.k;
        int i = this.l;
        int i2 = this.j;
        y50 y50Var = y50.f;
        if (i2 == 0) {
            y02.Q(obj);
            if (i > 0) {
                this.k = null;
                this.l = i;
                this.j = 1;
            } else {
                long j2 = c93Var.a;
                this.k = gn0Var;
                this.l = i;
                this.j = 2;
                if (ur.A(j2, this) != y50Var) {
                    if (j <= 0) {
                    }
                }
            }
            return y50Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                y02.Q(obj);
                if (j <= 0) {
                    this.k = gn0Var;
                    this.l = i;
                    this.j = 3;
                    if (gn0Var.k(m33.g, this) != y50Var) {
                        this.k = gn0Var;
                        this.l = i;
                        this.j = 4;
                        if (ur.A(j, this) != y50Var) {
                        }
                    }
                }
                return y50Var;
            }
            if (i2 == 3) {
                y02.Q(obj);
                this.k = gn0Var;
                this.l = i;
                this.j = 4;
                if (ur.A(j, this) != y50Var) {
                    this.k = null;
                    this.l = i;
                    this.j = 5;
                }
                return y50Var;
            }
            if (i2 == 4) {
                y02.Q(obj);
                this.k = null;
                this.l = i;
                this.j = 5;
            } else if (i2 != 5) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        y02.Q(obj);
        return dm3.a;
    }
}
