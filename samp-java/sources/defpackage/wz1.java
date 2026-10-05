package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wz1 extends o02 {
    public static final wz1 d;
    public static final wz1 e;
    public static final wz1 f;
    public static final wz1 g;
    public final /* synthetic */ int c;

    static {
        int i = 1;
        d = new wz1(i, 2, 0);
        int i2 = 1;
        e = new wz1(i2, i2, 1);
        f = new wz1(i, 2, 2);
        int i3 = 1;
        g = new wz1(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz1(int i, int i2, int i3) {
        super(i, i2);
        this.c = i3;
    }

    @Override // defpackage.o02
    public final void a(lx lxVar, wi wiVar, m53 m53Var, zk2 zk2Var, p02 p02Var) {
        switch (this.c) {
            case 0:
                Object objA = ((cs0) lxVar.e(0)).a();
                iv0 iv0Var = (iv0) lxVar.e(1);
                int iD = lxVar.d(0);
                iv0Var.getClass();
                m53Var.U(m53Var.c(iv0Var), objA);
                wiVar.f(iD, objA);
                wiVar.d(objA);
                break;
            case 1:
                iv0 iv0Var2 = (iv0) lxVar.e(0);
                int iD2 = lxVar.d(0);
                wiVar.s();
                iv0Var2.getClass();
                wiVar.c(iD2, m53Var.D(m53Var.c(iv0Var2)));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                Object objE = lxVar.e(0);
                iv0 iv0Var3 = (iv0) lxVar.e(1);
                int iD3 = lxVar.d(0);
                if (objE instanceof rv0) {
                    rv0 rv0Var = (rv0) objE;
                    zk2Var.e.b(rv0Var);
                    zk2Var.d.a(rv0Var);
                }
                Object objK = m53Var.K(m53Var.c(iv0Var3), iD3, objE);
                if (objK instanceof rv0) {
                    zk2Var.e((rv0) objK);
                } else if (objK instanceof xj2) {
                    ((xj2) objK).c();
                }
                break;
            default:
                Object objE2 = lxVar.e(0);
                int iD4 = lxVar.d(0);
                if (objE2 instanceof rv0) {
                    rv0 rv0Var2 = (rv0) objE2;
                    zk2Var.e.b(rv0Var2);
                    zk2Var.d.a(rv0Var2);
                }
                Object objK2 = m53Var.K(m53Var.t, iD4, objE2);
                if (objK2 instanceof rv0) {
                    zk2Var.e((rv0) objK2);
                } else if (objK2 instanceof xj2) {
                    ((xj2) objK2).c();
                }
                break;
        }
    }

    @Override // defpackage.o02
    public iv0 b(lx lxVar) {
        switch (this.c) {
            case 0:
                return (iv0) lxVar.e(1);
            case 1:
                return (iv0) lxVar.e(0);
            default:
                return super.b(lxVar);
        }
    }
}
