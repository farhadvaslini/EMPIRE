package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements ns0 {
    public final /* synthetic */ int f;

    public /* synthetic */ u0(int i) {
        this.f = i;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        boolean z = false;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                ob2 ob2Var = (ob2) obj;
                if (ob2Var != null && ob2Var.a == 2) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 1:
                bq1 bq1Var = b2.a;
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                Class cls = h7.N0;
                return Boolean.TRUE;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return Boolean.valueOf(jo3.o((vu2) obj));
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return (j72) obj;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                n52 n52Var = (n52) obj;
                t20 t20Var = x7.a;
                n52Var.getClass();
                vp.Q(n52Var, t20Var);
                return ((Context) vp.Q(n52Var, x7.b)).getResources();
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.valueOf(jo3.o((vu2) obj));
            case 8:
                a71[] a71VarArr = bv2.a;
                ((dv2) obj).a(zu2.y, dm3Var);
                return dm3Var;
            case vr.g /* 9 */:
                a71[] a71VarArr2 = bv2.a;
                ((dv2) obj).a(zu2.x, dm3Var);
                return dm3Var;
            case vr.h /* 10 */:
                tc tcVar = (tc) obj;
                tcVar.getHandler().post(new v6(tcVar.w, 4));
                return dm3Var;
            case 11:
                u0 u0Var = tc.F;
                return dm3Var;
            case vr.i /* 12 */:
                return dm3Var;
            case 13:
                return Boolean.valueOf(!(((we) obj) instanceof x32));
            case 14:
                kl klVar = (kl) obj;
                klVar.getClass();
                vr.J(klVar);
                return dm3Var;
            case jo3.g /* 15 */:
                ((kl) obj).r1();
                return dm3Var;
            case 16:
                zk1 zk1Var = (zk1) obj;
                zk1Var.i(rn.g, (int) (zk1Var.c().i0() >> 32));
                zk1Var.i(rn.f, 0.0f);
                return dm3Var;
            case 17:
                int i2 = wl.a;
                return dm3Var;
            case 18:
                ((vb1) obj).c();
                return dm3Var;
            case 19:
                return dm3Var;
            case 20:
                n52 n52Var2 = (n52) obj;
                r93 r93Var = x7.b;
                n52Var2.getClass();
                if (((Context) vp.Q(n52Var2, r93Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return bp.b;
                }
                zo.a.getClass();
                return yo.c;
            case 21:
                bv2.i((dv2) obj, 0);
                return dm3Var;
            case 22:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case 23:
                nk3 nk3Var = (nk3) obj;
                nk3Var.getClass();
                g42 g42Var = (g42) nk3Var;
                g42Var.u = false;
                y02.w(g42Var);
                return Boolean.FALSE;
            case 24:
                bv2.i((dv2) obj, 0);
                return dm3Var;
            case 25:
                bv2.i((dv2) obj, 1);
                return dm3Var;
            case 26:
                x31 x31Var = (x31) obj;
                x31Var.getClass();
                return x31Var.a;
            case 27:
                vu vuVar = (vu) obj;
                vuVar.getClass();
                return vuVar.a;
            case 28:
                w10 w10Var = (w10) obj;
                tb1 tb1Var = w10Var instanceof tb1 ? (tb1) w10Var : null;
                if (tb1Var != null && tb1Var.W) {
                    m21.c("Apply is called on deactivated node " + w10Var);
                }
                return dm3Var;
            default:
                return Boolean.valueOf(!(((zp1) obj) instanceof b20));
        }
    }
}
