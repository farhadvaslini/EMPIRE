package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class fi1 implements ns0 {
    public final /* synthetic */ int f;

    public /* synthetic */ fi1(int i) {
        this.f = i;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        uy0 uy0Var;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return dm3Var;
            case 1:
                ((String) obj).getClass();
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((ti) obj).getClass();
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                k62 k62Var = (k62) obj;
                if (k62Var.U()) {
                    al1 al1Var = k62Var.g;
                    if (!al1Var.t) {
                        ns0 ns0VarE = k62Var.f.e();
                        if (k62Var.f.b() != null) {
                            al1Var.k1();
                        } else if (ns0VarE == null) {
                            al1Var.m = null;
                            al1Var.n = null;
                            al1Var.l = null;
                            al1Var.k1();
                        } else {
                            al1Var.m = null;
                            al1Var.n = null;
                            al1Var.R0(k62Var, 9223372034707292159L, 0L);
                            al1Var.l = ns0VarE;
                        }
                    }
                }
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                k62 k62Var2 = (k62) obj;
                if (k62Var2.U() && (uy0Var = k62Var2.h) != null) {
                    al1 al1Var2 = k62Var2.g;
                    is1 is1Var = al1Var2.w;
                    js1 js1Var = is1Var != null ? (js1) is1Var.g(uy0Var) : null;
                    if (js1Var != null) {
                        yf yfVar = al1Var2.v;
                        if (yfVar != null) {
                            yfVar.h(uy0Var);
                        }
                        al1Var2.i1(js1Var);
                        js1Var.b();
                    }
                }
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((tb1) obj).m = true;
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Long) obj).getClass();
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                int i2 = vp1.b;
                return Boolean.TRUE;
            case 8:
                bv2.l((dv2) obj);
                return dm3Var;
            case vr.g /* 9 */:
                a71[] a71VarArr = bv2.a;
                ((dv2) obj).a(zu2.y, dm3Var);
                return dm3Var;
            case vr.h /* 10 */:
                t32 t32Var = (t32) obj;
                return nc2.h("[", t32Var.b, ", ", t32Var.c, ")");
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                return "  " + ((ec2) entry.getKey()).a + " = " + (value instanceof byte[] ? uj.W((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
            case vr.i /* 12 */:
                e60 e60Var = (e60) obj;
                e60Var.getClass();
                return new rt1(f80.z(e60Var));
            case 13:
                return new bl(f80.z((e60) obj));
            case 14:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case jo3.g /* 15 */:
                fu1 fu1Var = (fu1) obj;
                fu1Var.getClass();
                return Integer.valueOf(fu1Var.g.a);
            case 16:
                fu1 fu1Var2 = (fu1) obj;
                fu1Var2.getClass();
                iu1 iu1Var = fu1Var2.h;
                if (iu1Var == null || iu1Var.k.c != fu1Var2.g.a) {
                    return null;
                }
                return iu1Var;
            case 17:
                fu1 fu1Var3 = (fu1) obj;
                fu1Var3.getClass();
                iu1 iu1Var2 = fu1Var3.h;
                if (iu1Var2 == null || iu1Var2.k.c != fu1Var3.g.a) {
                    return null;
                }
                return iu1Var2;
            case 18:
                ((e60) obj).getClass();
                return new xt1();
            case 19:
                Context context2 = (Context) obj;
                context2.getClass();
                ContextWrapper contextWrapper = context2 instanceof ContextWrapper ? (ContextWrapper) context2 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 20:
                Context context3 = (Context) obj;
                context3.getClass();
                if (context3 instanceof Activity) {
                    return (Activity) context3;
                }
                return null;
            case 21:
                fu1 fu1Var4 = (fu1) obj;
                fu1Var4.getClass();
                return fu1Var4.h;
            case 22:
                fu1 fu1Var5 = (fu1) obj;
                fu1Var5.getClass();
                if (!(fu1Var5 instanceof iu1)) {
                    return null;
                }
                lu1 lu1Var = ((iu1) fu1Var5).k;
                return lu1Var.a(lu1Var.c);
            case 23:
                return ((qt1) obj).k;
            case 24:
                fu1 fu1Var6 = ((qt1) ((td) obj).c()).g;
                fu1Var6.getClass();
                int i3 = fu1.j;
                for (fu1 fu1Var7 : pq.y((g10) fu1Var6)) {
                }
                return null;
            case 25:
                ja jaVar = ((uw1) obj).a;
                if (jaVar != null) {
                    jaVar.a();
                }
                return dm3Var;
            case 26:
                ex1 ex1Var = (ex1) obj;
                tb1 tb1Var = ex1Var.z;
                try {
                    if (ex1Var.U()) {
                        ex1Var.X1(true);
                        break;
                    }
                    return dm3Var;
                } catch (Throwable th) {
                    tb1Var.b0(th);
                    throw null;
                }
            case 27:
                p12 p12Var = ((ex1) obj).a0;
                if (p12Var != null) {
                    ((tw0) p12Var).c();
                }
                return dm3Var;
            case 28:
                fy1 fy1Var = (fy1) obj;
                if (fy1Var.U()) {
                    fy1Var.f.k0();
                }
                return dm3Var;
            default:
                n52 n52Var = (n52) obj;
                int i4 = v9.a;
                r93 r93Var = x7.b;
                n52Var.getClass();
                Context context4 = (Context) vp.Q(n52Var, r93Var);
                ua0 ua0Var = (ua0) vp.Q(n52Var, s20.h);
                k12 k12Var = (k12) vp.Q(n52Var, l12.a);
                if (k12Var == null) {
                    return null;
                }
                return new x8(context4, ua0Var, k12Var.a, k12Var.b);
        }
    }
}
