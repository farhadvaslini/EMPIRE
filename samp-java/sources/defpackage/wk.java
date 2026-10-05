package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class wk implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ wk(boolean z, h53 h53Var) {
        this.f = 3;
        this.g = z;
        this.h = h53Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        int i2 = 1;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.h;
        boolean z = this.g;
        switch (i) {
            case 0:
                c10 c10Var = (c10) obj2;
                ((tk) c10Var.a).f(z);
                ((sk) c10Var.b).f(z);
                return new yk((vf1) obj, c10Var, 0);
            case 1:
                qf0 qf0Var = (qf0) obj;
                qf0Var.getClass();
                float fB = ((z60) obj2).b();
                qf0.h0(qf0Var, z ? wx.b(0.1f, wx.b) : wx.b(0.1f, wx.c), 0L, 0L, 1.0f - fB, null, 0, 118);
                qf0.h0(qf0Var, wx.b(fB * 0.03f, wx.b), 0L, 0L, 0.0f, null, 0, 126);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                n10 n10Var = (n10) obj2;
                n10Var.r(z);
                return new yk((vf1) obj, n10Var, 1);
            default:
                h53 h53Var = (h53) obj2;
                dv2 dv2Var = (dv2) obj;
                if (!z) {
                    a71[] a71VarArr = bv2.a;
                    dv2Var.a(zu2.j, dm3Var);
                }
                String strValueOf = String.valueOf(vm1.M(h53Var.i.g() * 100.0f) / 100.0f);
                a71[] a71VarArr2 = bv2.a;
                cv2 cv2Var = zu2.b;
                a71 a71Var = bv2.a[0];
                cv2Var.getClass();
                dv2Var.a(cv2Var, strValueOf);
                dv2Var.a(pu2.i, new y0(null, new a53(h53Var, i2)));
                return dm3Var;
        }
    }

    public /* synthetic */ wk(int i, Object obj, boolean z) {
        this.f = i;
        this.h = obj;
        this.g = z;
    }
}
