package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tw2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qy2 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tw2(qy2 qy2Var, String str, String str2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = qy2Var;
        this.m = str;
        this.n = str2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) throws JSONException {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        es1 es1Var = (es1) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((tw2) m(p40Var, es1Var)).o(dm3Var);
                break;
            default:
                ((tw2) m(p40Var, es1Var)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                tw2 tw2Var = new tw2(this.l, this.m, this.n, p40Var, 0);
                tw2Var.k = obj;
                return tw2Var;
            default:
                tw2 tw2Var2 = new tw2(this.l, this.m, this.n, p40Var, 1);
                tw2Var2.k = obj;
                return tw2Var2;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) throws JSONException {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        String str = this.n;
        String str2 = this.m;
        switch (i) {
            case 0:
                es1 es1Var = (es1) this.k;
                y02.Q(obj);
                ec2 ec2Var = qy2.y;
                LinkedHashMap linkedHashMap = new LinkedHashMap(qy2.a(this.l, (String) es1Var.c(ec2Var)));
                ai1 ai1VarX = vr.x();
                ai1VarX.add(str);
                Object obj2 = (List) linkedHashMap.get(str2);
                if (obj2 == null) {
                    obj2 = ni0.f;
                }
                Iterator it = pv2.K(new jm0(new vj(1, obj2), false, new im(9, str)), 2).iterator();
                while (it.hasNext()) {
                    ai1VarX.add((String) it.next());
                }
                linkedHashMap.put(str2, vr.r(ai1VarX));
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    JSONArray jSONArray = new JSONArray();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next());
                    }
                    jSONObject.put(str3, jSONArray);
                }
                String string = jSONObject.toString();
                string.getClass();
                es1Var.d(ec2Var, string);
                break;
            default:
                es1 es1Var2 = (es1) this.k;
                y02.Q(obj);
                ec2 ec2Var2 = qy2.w;
                String str4 = (String) es1Var2.c(ec2Var2);
                if (str4 == null) {
                    str4 = "";
                }
                qy2 qy2Var = this.l;
                es1Var2.e(ec2Var2, qx.x0(pv2.L(new sc3(pv2.J(new vj(4, str4), new vw2(1, qy2Var, qy2.class, "decodeServer", "decodeServer(Ljava/lang/String;)Ltop/th1nk/samp/core/config/SavedServer;", 0, 0, 1)), new er1(15, str2, str), 1)), "\n", null, null, new vw2(1, qy2Var, qy2.class, "encodeServer", "encodeServer(Ltop/th1nk/samp/core/config/SavedServer;)Ljava/lang/String;", 0, 0, 0), 30));
                break;
        }
        return dm3Var;
    }
}
