package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class c90 implements mf1 {
    public final /* synthetic */ int f = 0;
    public final Object g;
    public final Object h;

    public c90(nf1 nf1Var) {
        this.g = nf1Var;
        ou ouVar = ou.c;
        Class<?> cls = nf1Var.getClass();
        mu muVar = (mu) ouVar.a.get(cls);
        this.h = muVar == null ? ouVar.a(cls, null) : muVar;
    }

    @Override // defpackage.mf1
    public final void i(of1 of1Var, ef1 ef1Var) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                a90 a90Var = (a90) obj;
                switch (b90.a[ef1Var.ordinal()]) {
                    case 1:
                        a90Var.getClass();
                        break;
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        a90Var.c(of1Var);
                        break;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        a90Var.f(of1Var);
                        break;
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                        a90Var.getClass();
                        break;
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        a90Var.b(of1Var);
                        break;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        a90Var.getClass();
                        break;
                    case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                        c.p("ON_ANY must not been send by anybody");
                        break;
                    default:
                        c.k();
                        break;
                }
                mf1 mf1Var = (mf1) obj2;
                if (mf1Var != null) {
                    mf1Var.i(of1Var, ef1Var);
                }
                break;
            case 1:
                if (ef1Var == ef1.ON_START) {
                    ((gf1) obj).b(this);
                    ((tq2) obj2).d();
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ry1 ry1Var = (ry1) obj;
                int i2 = wy1.a[ef1Var.ordinal()];
                if (i2 == 1) {
                    ry1Var.g(true);
                    break;
                } else if (i2 == 2) {
                    ry1Var.g(false);
                    break;
                } else if (i2 == 3) {
                    ry1Var.e();
                    ((gf1) obj2).b(this);
                    break;
                }
                break;
            default:
                HashMap map = ((mu) obj2).a;
                mu.a((List) map.get(ef1Var), of1Var, ef1Var, obj);
                mu.a((List) map.get(ef1.ON_ANY), of1Var, ef1Var, obj);
                break;
        }
    }

    public c90(a90 a90Var, mf1 mf1Var) {
        a90Var.getClass();
        this.g = a90Var;
        this.h = mf1Var;
    }

    public c90(gf1 gf1Var, tq2 tq2Var) {
        this.g = gf1Var;
        this.h = tq2Var;
    }

    public c90(ry1 ry1Var, xy1 xy1Var, gf1 gf1Var) {
        this.g = ry1Var;
        this.h = gf1Var;
    }
}
