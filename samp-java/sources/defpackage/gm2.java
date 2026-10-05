package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.dm2
            if (r0 == 0) goto L13
            r0 = r6
            dm2 r0 = (defpackage.dm2) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            dm2 r0 = new dm2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.i
            int r6 = r0.k
            r1 = 1
            if (r6 == 0) goto L2c
            if (r6 != r1) goto L25
            defpackage.y02.Q(r4)
            goto L81
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.y02.Q(r4)
            pl r4 = new pl     // Catch: java.lang.Throwable -> L4b
            r6 = 7
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L4b
            r4.E(r5)     // Catch: java.lang.Throwable -> L4b
            r4.s()     // Catch: java.lang.Throwable -> L4b
            ll2 r5 = new ll2     // Catch: java.lang.Throwable -> L4b
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4b
            my1 r4 = defpackage.gm2.b     // Catch: java.lang.Throwable -> L4b
            r4.getClass()     // Catch: java.lang.Throwable -> L4b
            ij2 r6 = new ij2     // Catch: java.lang.Throwable -> L4b
            r6.<init>(r4, r5)     // Catch: java.lang.Throwable -> L4b
            goto L51
        L4b:
            r4 = move-exception
            qn2 r6 = new qn2
            r6.<init>(r4)
        L51:
            java.lang.Throwable r4 = defpackage.rn2.a(r6)
            if (r4 != 0) goto L86
            ij2 r6 = (defpackage.ij2) r6
            r0.k = r1
            jr r4 = new jr
            p40 r5 = defpackage.vr.I(r0)
            r4.<init>(r1, r5)
            r4.s()
            em2 r5 = new em2
            r0 = 0
            r5.<init>(r6, r0)
            r4.v(r5)
            fm2 r5 = new fm2
            r5.<init>(r4, r0)
            r6.e(r5)
            java.lang.Object r4 = r4.q()
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L81
            return r5
        L81:
            rn2 r4 = (defpackage.rn2) r4
            java.lang.Object r4 = r4.f
            return r4
        L86:
            qn2 r5 = new qn2
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm2.a(java.lang.String, q40):java.lang.Object");
    }
}
