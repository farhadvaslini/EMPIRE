package defpackage;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hf2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ String l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hf2(String str, int i, p40 p40Var, int i2) {
        super(2, p40Var);
        this.j = i2;
        this.l = str;
        this.m = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) throws JSONException {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        es1 es1Var = (es1) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                return ((hf2) m(p40Var, es1Var)).o(dm3Var);
            default:
                ((hf2) m(p40Var, es1Var)).o(dm3Var);
                return dm3Var;
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                hf2 hf2Var = new hf2(this.l, this.m, p40Var, 0);
                hf2Var.k = obj;
                return hf2Var;
            default:
                hf2 hf2Var2 = new hf2(this.l, this.m, p40Var, 1);
                hf2Var2.k = obj;
                return hf2Var2;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) throws JSONException {
        int i = this.j;
        int i2 = this.m;
        String str = this.l;
        dm3 dm3Var = dm3.a;
        es1 es1Var = (es1) this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                ec2 ec2Var = lf2.b;
                String str2 = (String) es1Var.c(ec2Var);
                if (str2 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
                        if (jSONArrayOptJSONArray != null) {
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = y02.S(0, jSONArrayOptJSONArray.length()).iterator();
                            while (it.hasNext()) {
                                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(((e41) it).nextInt());
                                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt("id") != i2) {
                                    jSONArray.put(jSONObjectOptJSONObject);
                                }
                            }
                            if (jSONArray.length() > 0) {
                                jSONObject.put(str, jSONArray);
                            } else {
                                jSONObject.remove(str);
                            }
                            es1Var.d(ec2Var, jSONObject.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
                break;
            default:
                y02.Q(obj);
                ec2 ec2Var2 = ih2.b;
                String str3 = (String) es1Var.c(ec2Var2);
                if (str3 != null) {
                    try {
                        JSONArray jSONArray2 = new JSONArray(str3);
                        JSONArray jSONArray3 = new JSONArray();
                        int length = jSONArray2.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i3);
                            if (!s51.n(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("host") : null, str) || jSONObjectOptJSONObject2.optInt("port") != i2) {
                                jSONArray3.put(jSONObjectOptJSONObject2);
                            }
                        }
                        if (jSONArray3.length() > 0) {
                            es1Var.d(ec2Var2, jSONArray3.toString());
                        } else {
                            ec2Var2.getClass();
                            es1Var.b();
                            es1Var.a.remove(ec2Var2);
                        }
                    } catch (Exception unused2) {
                    }
                }
                break;
        }
        return dm3Var;
        return dm3Var;
    }
}
