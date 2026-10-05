package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class af0 extends mb3 implements ss0 {
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af0(int i, p40 p40Var, int i2) {
        super(i, p40Var);
        this.j = i2;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((gy1) obj2).a;
                new af0(i2, (p40) obj3, 0).o(dm3Var);
                break;
            case 1:
                ((Number) obj2).floatValue();
                new af0(i2, (p40) obj3, 1).o(dm3Var);
                break;
            default:
                long j2 = ((gy1) obj2).a;
                new af0(i2, (p40) obj3, 2).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                y02.Q(obj);
                break;
            case 1:
                y02.Q(obj);
                break;
            default:
                y02.Q(obj);
                break;
        }
        return dm3Var;
    }
}
