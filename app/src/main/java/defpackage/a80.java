package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class a80 extends mb3 implements rs0 {
    public ok2 j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ok2 m;
    public final /* synthetic */ b80 n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(ok2 ok2Var, b80 b80Var, Object obj, boolean z, p40 p40Var) {
        super(2, p40Var);
        this.m = ok2Var;
        this.n = b80Var;
        this.o = obj;
        this.p = z;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((a80) m((p40) obj2, (dm0) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        a80 a80Var = new a80(this.m, this.n, this.o, this.p, p40Var);
        a80Var.l = obj;
        return a80Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r10 == r8) goto L21;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws IOException {
        dm0 dm0Var;
        ok2 ok2Var;
        int i = this.k;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.o;
        b80 b80Var = this.n;
        ok2 ok2Var2 = this.m;
        y50 y50Var = y50.f;
        if (i == 0) {
            y02.Q(obj);
            dm0 dm0Var2 = (dm0) this.l;
            c43 c43VarI = b80Var.i();
            this.l = dm0Var2;
            this.j = ok2Var2;
            this.k = 1;
            Integer num = new Integer(((AtomicInteger) c43VarI.b.g).incrementAndGet());
            if (num != y50Var) {
                dm0Var = dm0Var2;
                obj = num;
                ok2Var = ok2Var2;
            }
            return y50Var;
        }
        if (i != 1) {
            if (i != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
            if (this.p) {
                b80Var.g.I(new a70(obj2 != null ? obj2.hashCode() : 0, ok2Var2.f, obj2));
            }
            return dm3Var;
        }
        ok2Var = this.j;
        dm0Var = (dm0) this.l;
        y02.Q(obj);
        ok2Var.f = ((Number) obj).intValue();
        this.l = null;
        this.j = null;
        this.k = 2;
        if (dm0Var.b.get()) {
            c.q("This scope has already been closed.");
            return null;
        }
        Object objM = lq.m(dm0Var.a, new y70(dm0Var, obj2, null), this);
        if (objM != y50Var) {
            objM = dm3Var;
        }
    }
}
