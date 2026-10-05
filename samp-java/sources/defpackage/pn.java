package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class pn implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ s33 g;

    public /* synthetic */ pn(s33 s33Var, int i) {
        this.f = i;
        this.g = s33Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        s33 s33Var = this.g;
        uw0 uw0Var = (uw0) obj;
        switch (i) {
            case 0:
                d6 d6Var = s33Var.c;
                float fG = d6Var.j.g();
                float fC = d6Var.d().c();
                float f = fG < fC ? fC - fG : 0.0f;
                uw0Var.s(f > 0.0f ? (Float.intBitsToFloat((int) (uw0Var.a() & 4294967295L)) + f) / Float.intBitsToFloat((int) (uw0Var.a() & 4294967295L)) : 1.0f);
                uw0Var.q0(d32.g(0.5f, 0.0f));
                break;
            default:
                d6 d6Var2 = s33Var.c;
                float fG2 = d6Var2.j.g();
                float fC2 = d6Var2.d().c();
                float f2 = fG2 < fC2 ? fC2 - fG2 : 0.0f;
                uw0Var.s(f2 > 0.0f ? 1.0f / ((Float.intBitsToFloat((int) (uw0Var.a() & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & uw0Var.a()))) : 1.0f);
                uw0Var.q0(d32.g(0.5f, 0.0f));
                break;
        }
        return dm3Var;
    }
}
