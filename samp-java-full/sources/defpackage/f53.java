package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class f53 extends mb3 implements ss0 {
    public /* synthetic */ long j;
    public final /* synthetic */ h53 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f53(h53 h53Var, p40 p40Var) {
        super(3, p40Var);
        this.k = h53Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        long j = ((gy1) obj2).a;
        f53 f53Var = new f53(this.k, (p40) obj3);
        f53Var.j = j;
        dm3 dm3Var = dm3.a;
        f53Var.o(dm3Var);
        return dm3Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        y02.Q(obj);
        long j = this.j;
        h53 h53Var = this.k;
        h53Var.v.h((h53Var.r == t02.f ? Float.intBitsToFloat((int) (j & 4294967295L)) : h53Var.o ? h53Var.m.g() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32))) - h53Var.u.g());
        return dm3.a;
    }
}
