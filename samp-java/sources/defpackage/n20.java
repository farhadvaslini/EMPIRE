package defpackage;

import android.view.View;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class n20 implements ns0 {
    public final /* synthetic */ int f;

    public /* synthetic */ n20(int i, ee1 ee1Var) {
        this.f = 22;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        switch (this.f) {
            case 0:
                n52 n52Var = (n52) obj;
                t20 t20Var = xy0.a;
                n52Var.getClass();
                View view = ((ir3) vp.Q(n52Var, t20Var)).a;
                while (view != null) {
                    Object tag = view.getTag(2131230928);
                    if (tag != null) {
                        return tag;
                    }
                    Object objU = w22.u(view);
                    view = objU instanceof View ? (View) objU : null;
                }
                return null;
            case 1:
                m50 m50Var = (m50) obj;
                if (m50Var instanceof q50) {
                    return (q50) m50Var;
                }
                return null;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                bv2.l((dv2) obj);
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new i90(iIntValue, ((Float) obj3).floatValue(), new h90(0, list));
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                bv2.l((dv2) obj);
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return Boolean.valueOf(vm1.r(obj));
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return Boolean.TRUE;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new c43(absolutePath);
            case 8:
                return dm3.a;
            case vr.g /* 9 */:
                synchronized (a73.c) {
                    List list2 = a73.i;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((ns0) list2.get(i)).h(obj);
                    }
                }
                return dm3.a;
            case vr.h /* 10 */:
                ((String) obj).getClass();
                return dm3.a;
            case 11:
                ((yy0) obj).getClass();
                return Boolean.TRUE;
            case vr.i /* 12 */:
                bv2.i((dv2) obj, 0);
                return dm3.a;
            case 13:
                vg2 vg2Var = (vg2) obj;
                vg2Var.getClass();
                return vg2Var.a;
            case 14:
                ((td) obj).getClass();
                return dj0.g(n92.I(200, 6, null), 2);
            case jo3.g /* 15 */:
                ((td) obj).getClass();
                return dj0.f(n92.I(200, 6, null), 2);
            case 16:
                ((td) obj).getClass();
                return dj0.g(n92.I(200, 6, null), 2);
            case 17:
                yj1 yj1Var = (yj1) obj;
                yj1Var.getClass();
                return Integer.valueOf(yj1Var.a);
            case 18:
                ((td) obj).getClass();
                return dj0.f(n92.I(200, 6, null), 2);
            case 19:
                vb1 vb1Var = (vb1) obj;
                vb1Var.getClass();
                vb1Var.c();
                return dm3.a;
            case 20:
                ((Integer) obj).getClass();
                return null;
            case 21:
                List list3 = (List) obj;
                return new ie1(((Number) list3.get(0)).intValue(), ((Number) list3.get(1)).intValue());
            case 22:
                return dm3.a;
            case 23:
                return dm3.a;
            case 24:
                return dm3.a;
            case 25:
                return dm3.a;
            case 26:
                hf0 hf0Var = (hf0) obj;
                hf0Var.getClass();
                zx.a(hf0Var);
                rn.u(hf0Var, hf0Var.f * 8.0f);
                float f = hf0Var.f;
                gq.J(hf0Var, f * 24.0f, f * 24.0f, 12);
                return dm3.a;
            case 27:
                ((dv2) obj).getClass();
                return dm3.a;
            case 28:
                dv2 dv2Var = (dv2) obj;
                dv2Var.getClass();
                bv2.i(dv2Var, 2);
                return dm3.a;
            default:
                hf0 hf0Var2 = (hf0) obj;
                hf0Var2.getClass();
                zx.a(hf0Var2);
                rn.u(hf0Var2, hf0Var2.f * 2.0f);
                float f2 = hf0Var2.f;
                gq.J(hf0Var2, 12.0f * f2, f2 * 24.0f, 12);
                return dm3.a;
        }
    }

    public /* synthetic */ n20(int i) {
        this.f = i;
    }
}
