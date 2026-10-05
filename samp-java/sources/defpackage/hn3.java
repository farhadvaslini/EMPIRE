package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hn3 {
    public static final hn3 a = new hn3();
    public static final my1 b;

    static {
        ly1 ly1Var = new ly1();
        ly1Var.a(10L);
        ly1Var.b(10L);
        b = new my1(ly1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(java.lang.String r13) {
        /*
            r0 = 0
            if (r13 == 0) goto Lb5
            r1 = 1
            char[] r2 = new char[r1]
            r3 = 44
            r4 = 0
            r2[r4] = r3
            r3 = 6
            java.util.List r13 = defpackage.y93.z0(r13, r2, r3)
            java.util.Iterator r13 = r13.iterator()
        L14:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r13.next()
            java.lang.String r2 = (java.lang.String) r2
            char[] r5 = new char[r1]
            r6 = 59
            r5[r4] = r6
            java.util.List r2 = defpackage.y93.z0(r2, r5, r3)
            java.util.List r5 = defpackage.qx.o0(r1, r2)
            java.util.Iterator r5 = r5.iterator()
        L32:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.CharSequence r7 = defpackage.y93.G0(r7)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "rel="
            java.lang.String r7 = defpackage.y93.v0(r7, r8)
            char[] r8 = new char[r1]
            r9 = 34
            r8[r4] = r9
            int r9 = r7.length()
            int r9 = r9 - r1
            r10 = r4
            r11 = r10
        L5a:
            if (r10 > r9) goto L78
            if (r11 != 0) goto L60
            r12 = r10
            goto L61
        L60:
            r12 = r9
        L61:
            char r12 = r7.charAt(r12)
            boolean r12 = defpackage.uj.F(r8, r12)
            if (r11 != 0) goto L72
            if (r12 != 0) goto L6f
            r11 = r1
            goto L5a
        L6f:
            int r10 = r10 + 1
            goto L5a
        L72:
            if (r12 != 0) goto L75
            goto L78
        L75:
            int r9 = r9 + (-1)
            goto L5a
        L78:
            int r9 = r9 + 1
            java.lang.CharSequence r7 = r7.subSequence(r10, r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "next"
            boolean r7 = defpackage.s51.n(r7, r8)
            if (r7 == 0) goto L32
            goto L8c
        L8b:
            r6 = r0
        L8c:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L92
        L90:
            r2 = r0
            goto Lb2
        L92:
            java.lang.Object r2 = defpackage.qx.q0(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = defpackage.y93.G0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "<"
            java.lang.String r2 = defpackage.y93.v0(r2, r5)
            java.lang.String r5 = ">"
            java.lang.String r2 = defpackage.y93.w0(r2, r5)
            int r5 = r2.length()
            if (r5 <= 0) goto L90
        Lb2:
            if (r2 == 0) goto L14
            return r2
        Lb5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn3.d(java.lang.String):java.lang.String");
    }

    public static dn3 e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("tag_name", "");
        ArrayList arrayList = new ArrayList();
        Object objOpt = jSONObject.opt("assets");
        if (objOpt instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) objOpt;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString2 = jSONObjectOptJSONObject.optString("name");
                    strOptString2.getClass();
                    String string = y93.G0(strOptString2).toString();
                    String strOptString3 = jSONObjectOptJSONObject.optString("browser_download_url");
                    strOptString3.getClass();
                    String string2 = y93.G0(strOptString3).toString();
                    if (string.length() != 0 && string2.length() != 0) {
                        arrayList.add(new cn3(string, string2, jSONObjectOptJSONObject.optLong("size")));
                    }
                }
            }
        }
        strOptString.getClass();
        return new dn3(strOptString, arrayList, jSONObject.optBoolean("draft", false), jSONObject.optBoolean("prerelease", false));
    }

    public static ai1 f(String str) {
        JSONArray jSONArray = new JSONArray(str);
        ai1 ai1VarX = vr.x();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String string = jSONObjectOptJSONObject.toString();
                string.getClass();
                ai1VarX.add(e(string));
            }
        }
        return vr.r(ai1VarX);
    }

    public static cn3 g(dn3 dn3Var) {
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        ArrayList arrayList = dn3Var.b;
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (i2 >= length) {
                int size = arrayList.size();
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj2 = arrayList.get(i);
                    i++;
                    if (s51.n(((cn3) obj2).a, "app-universal-release.apk")) {
                        obj = obj2;
                        break;
                    }
                }
                return (cn3) obj;
            }
            String strI = nc2.i("app-", strArr[i2], "-release.apk");
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i3);
                i3++;
                if (s51.n(((cn3) obj3).a, strI)) {
                    obj = obj3;
                    break;
                }
            }
            cn3 cn3Var = (cn3) obj;
            if (cn3Var != null) {
                return cn3Var;
            }
            i2++;
        }
    }

    public static dn3 h(List list, boolean z) {
        list.getClass();
        Iterator it = list.iterator();
        r32 r32Var = null;
        while (it.hasNext()) {
            dn3 dn3Var = (dn3) it.next();
            boolean z2 = dn3Var.c;
            String str = dn3Var.a;
            if (!z2 && (z || !dn3Var.d)) {
                ou2 ou2VarU = n32.u(str, true);
                if (ou2VarU == null) {
                    try {
                        ti tiVar = ui.a;
                        ui.c(ti.i, "UpdateChecker", "Ignoring release with invalid SemVer tag: " + str, null);
                    } catch (Throwable unused) {
                    }
                } else if (r32Var == null || ou2VarU.compareTo((ou2) r32Var.g) > 0) {
                    r32Var = new r32(dn3Var, ou2VarU);
                }
            }
        }
        if (r32Var != null) {
            return (dn3) r32Var.f;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.dn3 r8, java.lang.String r9, defpackage.q40 r10) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn3.a(dn3, java.lang.String, q40):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r12 == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bb, code lost:
    
        if (r12 != r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00bb -> B:41:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r11, defpackage.q40 r12) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn3.b(boolean, q40):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, defpackage.q40 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gn3
            if (r0 == 0) goto L13
            r0 = r6
            gn3 r0 = (defpackage.gn3) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            gn3 r0 = new gn3
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.i
            int r6 = r0.k
            r1 = 1
            if (r6 == 0) goto L2c
            if (r6 != r1) goto L25
            defpackage.y02.Q(r4)
            goto L80
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.y02.Q(r4)
            pl r4 = new pl     // Catch: java.lang.Throwable -> L41
            r6 = 7
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L41
            r4.E(r5)     // Catch: java.lang.Throwable -> L41
            r4.s()     // Catch: java.lang.Throwable -> L41
            ll2 r5 = new ll2     // Catch: java.lang.Throwable -> L41
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L41
            goto L47
        L41:
            r4 = move-exception
            qn2 r5 = new qn2
            r5.<init>(r4)
        L47:
            java.lang.Throwable r4 = defpackage.rn2.a(r5)
            if (r4 != 0) goto L85
            ll2 r5 = (defpackage.ll2) r5
            r0.k = r1
            jr r4 = new jr
            p40 r6 = defpackage.vr.I(r0)
            r4.<init>(r1, r6)
            r4.s()
            my1 r6 = defpackage.hn3.b
            r6.getClass()
            ij2 r0 = new ij2
            r0.<init>(r6, r5)
            em2 r5 = new em2
            r5.<init>(r0, r1)
            r4.v(r5)
            fm2 r5 = new fm2
            r5.<init>(r4, r1)
            r0.e(r5)
            java.lang.Object r4 = r4.q()
            y50 r5 = defpackage.y50.f
            if (r4 != r5) goto L80
            return r5
        L80:
            rn2 r4 = (defpackage.rn2) r4
            java.lang.Object r4 = r4.f
            return r4
        L85:
            qn2 r5 = new qn2
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn3.c(java.lang.String, q40):java.lang.Object");
    }
}
