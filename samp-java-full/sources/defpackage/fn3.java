package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fn3 extends q40 {
    public boolean i;
    public String j;
    public List k;
    public Set l;
    public /* synthetic */ Object m;
    public final /* synthetic */ hn3 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn3(hn3 hn3Var, q40 q40Var) {
        super(q40Var);
        this.n = hn3Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        Object objB = this.n.b(false, this);
        return objB == y50.f ? objB : new rn2(objB);
    }
}
