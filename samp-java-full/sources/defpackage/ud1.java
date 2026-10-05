package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ud1 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ xd1 g;

    public /* synthetic */ ud1(xd1 xd1Var, int i) {
        this.f = i;
        this.g = xd1Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        int i2 = 0;
        xd1 xd1Var = this.g;
        switch (i) {
            case 0:
                ad1 ad1Var = (ad1) xd1Var.t.a();
                int iA = ad1Var.a();
                while (true) {
                    if (i2 >= iA) {
                        i2 = -1;
                    } else if (!ad1Var.b(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int iIntValue = ((Integer) obj).intValue();
                ad1 ad1Var2 = (ad1) xd1Var.t.a();
                if (iIntValue < 0 || iIntValue >= ad1Var2.a()) {
                    p21.a("Can't scroll to index " + iIntValue + ", it is out of bounds [0, " + ad1Var2.a() + ")");
                }
                cl3.t(xd1Var.d1(), null, new wd1(xd1Var, iIntValue, (p40) null, 0), 3);
                return Boolean.TRUE;
        }
    }
}
