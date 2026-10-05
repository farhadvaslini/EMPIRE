package defpackage;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vo extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vo(Object obj, Object obj2, Object obj3, Object obj4, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
        this.o = obj4;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) throws JSONException {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((vo) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                ((vo) m((p40) obj2, (es1) obj)).o(dm3Var);
                return dm3Var;
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.o;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        switch (i) {
            case 0:
                vo voVar = new vo((wo) obj5, (ex1) obj4, (u1) obj3, (ok) obj2, p40Var, 0);
                voVar.k = obj;
                return voVar;
            default:
                vo voVar2 = new vo((String) obj5, (mk2) obj4, (String) obj3, (String) obj2, p40Var, 1);
                voVar2.k = obj;
                return voVar2;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) throws JSONException {
        JSONObject jSONObject;
        Integer num;
        int i = this.j;
        Object obj2 = this.m;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.l;
        switch (i) {
            case 0:
                y02.Q(obj);
                x50 x50Var = (x50) this.k;
                wo woVar = (wo) obj5;
                p40 p40Var = null;
                cl3.t(x50Var, null, new l(woVar, (ex1) obj2, (u1) obj4, p40Var, 7), 3);
                return cl3.t(x50Var, null, new j(woVar, (ok) obj3, p40Var, 7), 3);
            default:
                String str = (String) obj5;
                es1 es1Var = (es1) this.k;
                y02.Q(obj);
                ec2 ec2Var = lf2.b;
                String str2 = (String) es1Var.c(ec2Var);
                if (str2 == null) {
                    str2 = "{}";
                }
                try {
                    jSONObject = new JSONObject(str2);
                    break;
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                if (jSONArrayOptJSONArray.length() < 30) {
                    Iterator it = y02.S(0, jSONArrayOptJSONArray.length()).iterator();
                    k41 k41Var = (k41) it;
                    if (k41Var.h) {
                        e41 e41Var = (e41) it;
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(e41Var.nextInt());
                        Integer num2 = new Integer(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optInt("id", 0) : 0);
                        while (k41Var.h) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(e41Var.nextInt());
                            Integer num3 = new Integer(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optInt("id", 0) : 0);
                            if (num2.compareTo(num3) < 0) {
                                num2 = num3;
                            }
                        }
                        num = num2;
                    } else {
                        num = null;
                    }
                    int iIntValue = num != null ? num.intValue() + 1 : 1;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", iIntValue);
                    jSONObject2.put("label", (String) obj4);
                    jSONObject2.put("text", (String) obj3);
                    jSONArrayOptJSONArray.put(jSONObject2);
                    jSONObject.put(str, jSONArrayOptJSONArray);
                    es1Var.d(ec2Var, jSONObject.toString());
                    ((mk2) obj2).f = true;
                }
                return dm3.a;
        }
    }
}
