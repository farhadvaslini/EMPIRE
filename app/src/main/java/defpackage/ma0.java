package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ma0 implements dy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ma0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.dy
    public final long a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                na0 na0Var = (na0) obj;
                long jA = na0Var.y.a();
                if (jA != 16) {
                    return jA;
                }
                ho2 ho2Var = (ho2) ur.z(na0Var, ko2.a);
                if (ho2Var != null) {
                    long j = ho2Var.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((wx) ur.z(na0Var, t30.a)).a;
            default:
                return ((mo2) obj).c;
        }
    }
}
