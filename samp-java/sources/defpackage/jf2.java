package defpackage;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jf2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf2(String str, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = str;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        es1 es1Var = (es1) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                ((jf2) m(p40Var, es1Var)).o(dm3Var);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((jf2) m(p40Var, es1Var)).o(dm3Var);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((jf2) m(p40Var, es1Var)).o(dm3Var);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((jf2) m(p40Var, es1Var)).o(dm3Var);
                break;
            default:
                ((jf2) m(p40Var, es1Var)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        String str = this.l;
        switch (i) {
            case 0:
                jf2 jf2Var = new jf2(str, p40Var, 0);
                jf2Var.k = obj;
                return jf2Var;
            case 1:
                jf2 jf2Var2 = new jf2(str, p40Var, 1);
                jf2Var2.k = obj;
                return jf2Var2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                jf2 jf2Var3 = new jf2(str, p40Var, 2);
                jf2Var3.k = obj;
                return jf2Var3;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                jf2 jf2Var4 = new jf2(str, p40Var, 3);
                jf2Var4.k = obj;
                return jf2Var4;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                jf2 jf2Var5 = new jf2(str, p40Var, 4);
                jf2Var5.k = obj;
                return jf2Var5;
            default:
                jf2 jf2Var6 = new jf2(str, p40Var, 5);
                jf2Var6.k = obj;
                return jf2Var6;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        String str = this.l;
        es1 es1Var = (es1) this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                ec2 ec2Var = lf2.b;
                String str2 = (String) es1Var.c(ec2Var);
                if (str2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        jSONObject.remove(str);
                        es1Var.d(ec2Var, jSONObject.toString());
                    } catch (Exception unused) {
                    }
                }
                break;
            case 1:
                y02.Q(obj);
                es1Var.d(qy2.L, str);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y02.Q(obj);
                es1Var.d(qy2.D, str);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                y02.Q(obj);
                es1Var.d(qy2.B, str);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                y02.Q(obj);
                es1Var.d(qy2.x, str);
                break;
            default:
                y02.Q(obj);
                es1Var.d(qy2.E, str);
                break;
        }
        return dm3Var;
        return dm3Var;
    }
}
