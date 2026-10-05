package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ge2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ gh3 h;
    public final /* synthetic */ rs0 i;
    public final /* synthetic */ int j;

    public /* synthetic */ ge2(long j, gh3 gh3Var, rs0 rs0Var, int i, int i2) {
        this.f = i2;
        this.g = j;
        this.h = gh3Var;
        this.i = rs0Var;
        this.j = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iY = jo3.y(i2 | 1);
                jo3.b(this.g, this.h, this.i, (nv0) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(i2 | 1);
                oz2.b(this.g, this.h, this.i, (nv0) obj, iY2);
                break;
        }
        return dm3Var;
    }
}
