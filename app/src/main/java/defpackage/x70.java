package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class x70 extends q40 {
    public boolean i;
    public Object j;
    public qk2 k;
    public Serializable l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ b80 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x70(b80 b80Var, q40 q40Var) {
        super(q40Var);
        this.o = b80Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return b80.h(this.o, false, this);
    }
}
