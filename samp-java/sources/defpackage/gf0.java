package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class gf0 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ if0 g;

    public /* synthetic */ gf0(if0 if0Var, int i) {
        this.f = i;
        this.g = if0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        long j;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        if0 if0Var = this.g;
        switch (i) {
            case 0:
                uw0 uw0Var = (uw0) obj;
                uw0Var.getClass();
                uw0Var.o(true);
                uw0Var.P((c23) if0Var.u.g);
                uw0Var.D0(1);
                break;
            case 1:
                qf0 qf0Var = (qf0) obj;
                qf0Var.getClass();
                pr prVarK = qf0Var.Z().k();
                float fG = if0Var.D.g();
                if (fG != 0.0f) {
                    prVarK.g(fG, fG);
                }
                if0Var.x.f(qf0Var, new gf0(if0Var, 3));
                if (fG != 0.0f) {
                    float f = -fG;
                    prVarK.g(f, f);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                qf0 qf0Var2 = (qf0) obj;
                qf0Var2.getClass();
                qw0 qw0Var = if0Var.A;
                if (qw0Var != null) {
                    float fG2 = if0Var.D.g();
                    int i2 = (int) fG2;
                    int i3 = i2 * 2;
                    long jIntBitsToFloat = (((long) (((int) Float.intBitsToFloat((int) (qf0Var2.a() & 4294967295L))) + i3)) & 4294967295L) | (((long) (((int) Float.intBitsToFloat((int) (qf0Var2.a() >> 32))) + i3)) << 32);
                    gf0 gf0Var = if0Var.E;
                    gf0Var.getClass();
                    qf0Var2.g0(qw0Var, jIntBitsToFloat, new i(24, vr.X(if0Var).E, gf0Var));
                    if (fG2 == 0.0f) {
                        j = 0;
                    } else {
                        long j2 = -i2;
                        j = (j2 & 4294967295L) | (j2 << 32);
                    }
                    if (!i41.a(qw0Var.t, j)) {
                        qw0Var.t = j;
                        qw0Var.a.G(qw0Var.u, (int) (j >> 32), (int) (j & 4294967295L));
                    }
                    lr.z(qf0Var2, qw0Var);
                }
                break;
            default:
                qf0 qf0Var3 = (qf0) obj;
                qf0Var3.getClass();
                if0Var.t.b(qf0Var3, if0Var.z, (ab1) if0Var.C.getValue(), if0Var.w);
                break;
        }
        return dm3Var;
    }
}
