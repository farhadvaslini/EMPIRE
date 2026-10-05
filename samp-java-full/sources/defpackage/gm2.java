package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gm2 {
    public static final gm2 a = new gm2();
    public static final my1 b;
    public static final uk2 c;

    static {
        ly1 ly1Var = new ly1();
        ly1Var.a(10L);
        ly1Var.b(10L);
        b = new my1(ly1Var);
        c = new uk2("^[0-9a-fA-F]{64}$");
    }

    public static hm2 b(String str) throws JSONException {
        String string;
        String string2;
        long jLongValue;
        String string3;
        String string4;
        i01 i01VarA;
        int iIntValue;
        JSONArray jSONArray = new JSONObject(str).getJSONArray("sources");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        while (true) {
            bm2 bm2Var = null;
            if (i >= length) {
                break;
            }
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                Object objOpt = jSONObjectOptJSONObject.opt("name");
                String str2 = objOpt instanceof String ? (String) objOpt : null;
                if (str2 != null && (string = y93.G0(str2).toString()) != null) {
                    Object objOpt2 = jSONObjectOptJSONObject.opt("url");
                    String str3 = objOpt2 instanceof String ? (String) objOpt2 : null;
                    if (str3 != null && (string2 = y93.G0(str3).toString()) != null) {
                        Object objOpt3 = jSONObjectOptJSONObject.opt("size");
                        if (objOpt3 == null || objOpt3 == JSONObject.NULL) {
                            jLongValue = 0;
                        } else {
                            if (objOpt3 instanceof Byte) {
                                iIntValue = ((Number) objOpt3).byteValue();
                            } else if (objOpt3 instanceof Short) {
                                iIntValue = ((Number) objOpt3).shortValue();
                            } else if (objOpt3 instanceof Integer) {
                                iIntValue = ((Number) objOpt3).intValue();
                            } else if (objOpt3 instanceof Long) {
                                jLongValue = ((Number) objOpt3).longValue();
                            }
                            jLongValue = iIntValue;
                        }
                        Object objOpt4 = jSONObjectOptJSONObject.opt("checksum");
                        String str4 = "";
                        String str5 = (objOpt4 == null || objOpt4 == JSONObject.NULL) ? "" : objOpt4 instanceof String ? (String) objOpt4 : null;
                        if (str5 != null && (string3 = y93.G0(str5).toString()) != null) {
                            Object objOpt5 = jSONObjectOptJSONObject.opt("description");
                            if (objOpt5 != null && objOpt5 != JSONObject.NULL) {
                                str4 = objOpt5 instanceof String ? (String) objOpt5 : null;
                            }
                            if (str4 != null && (string4 = y93.G0(str4).toString()) != null && string.length() != 0) {
                                try {
                                    g01 g01Var = new g01();
                                    g01Var.c(null, string2);
                                    i01VarA = g01Var.a();
                                } catch (IllegalArgumentException unused) {
                                    i01VarA = null;
                                }
                                if (i01VarA != null && jLongValue >= 0 && (string3.length() <= 0 || c.c(string3))) {
                                    bm2Var = new bm2(string, string2, jLongValue, string3, string4);
                                }
                            }
                        }
                    }
                }
                if (bm2Var != null) {
                    arrayList.add(bm2Var);
                }
            }
            i++;
        }
        if (jSONArray.length() <= 0 || !arrayList.isEmpty()) {
            return new hm2(arrayList);
        }
        c.q("No valid resource sources");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, q40 q40Var) {
        dm2 dm2Var;
        Object qn2Var;
        if (q40Var instanceof dm2) {
            dm2Var = (dm2) q40Var;
            int i = dm2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dm2Var.k = i - Integer.MIN_VALUE;
            } else {
                dm2Var = new dm2(this, q40Var);
            }
        }
        Object objQ = dm2Var.i;
        int i2 = dm2Var.k;
        if (i2 == 0) {
            y02.Q(objQ);
            try {
                pl plVar = new pl(7);
                plVar.E(str);
                plVar.s();
                ll2 ll2Var = new ll2(plVar);
                my1 my1Var = b;
                my1Var.getClass();
                qn2Var = new ij2(my1Var, ll2Var);
            } catch (Throwable th) {
                qn2Var = new qn2(th);
            }
            Throwable thA = rn2.a(qn2Var);
            if (thA != null) {
                return new qn2(thA);
            }
            ij2 ij2Var = (ij2) qn2Var;
            dm2Var.k = 1;
            jr jrVar = new jr(1, vr.I(dm2Var));
            jrVar.s();
            jrVar.v(new em2(ij2Var, 0));
            ij2Var.e(new fm2(jrVar, 0));
            objQ = jrVar.q();
            y50 y50Var = y50.f;
            if (objQ == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objQ);
        }
        return ((rn2) objQ).f;
    }
}
