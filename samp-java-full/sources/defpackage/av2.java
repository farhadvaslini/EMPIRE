package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class av2 implements rs0 {
    public final /* synthetic */ int f;

    public /* synthetic */ av2(int i) {
        this.f = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                if (obj != null || obj2 != null) {
                    qn1.b();
                }
                return null;
            case 1:
                return obj == null ? obj2 : obj;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                vu2 vu2Var = (vu2) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                qu2 qu2Var = ((vu2) obj).d;
                cv2 cv2Var = zu2.u;
                Object objG = qu2Var.f.g(cv2Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = vu2Var.d.f.g(cv2Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return (t33) ((s33) obj2).c.g.getValue();
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                lf3 lf3Var = (lf3) obj2;
                return vr.L(Float.valueOf(lf3Var.a.g()), Boolean.valueOf(((t02) lf3Var.f.getValue()) == t02.f));
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                m50 m50Var = (m50) obj2;
                if (!(m50Var instanceof qj3)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? m50Var : Integer.valueOf(iIntValue + 1);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                m50 m50Var2 = (m50) obj2;
                if (m50Var2 instanceof qj3) {
                    return (qj3) m50Var2;
                }
                return null;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                th3 th3Var = (th3) obj;
                m50 m50Var3 = (m50) obj2;
                if (m50Var3 instanceof qj3) {
                    o50 o50Var = th3Var.a;
                    Trace.beginSection(null);
                    Object[] objArr = th3Var.b;
                    int i2 = th3Var.d;
                    objArr[i2] = dm3Var;
                    qj3[] qj3VarArr = th3Var.c;
                    th3Var.d = i2 + 1;
                    qj3VarArr[i2] = (qj3) m50Var3;
                }
                return th3Var;
            default:
                f5.G.h(obj);
                return dm3Var;
        }
    }
}
