package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.ListIterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class x72 {
    public static final uk2 a = new uk2("^[0-9a-fA-F]{64}$");
    public static final uk2 b = new uk2("^[a-z][a-z0-9]*(?:\\.[a-z0-9][a-z0-9_-]*)+$");

    public static final ai1 a(String str) throws JSONException {
        CharSequence charSequenceSubSequence;
        Object qn2Var;
        String host;
        String string;
        r72 r72Var;
        int length = str.length();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            char cCharAt = str.charAt(i);
            if (!ur.I(cCharAt) && cCharAt != 65279) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        String string2 = charSequenceSubSequence.toString();
        if (!y93.B0(string2, '{')) {
            c.p("Plugin catalog endpoint did not return a JSON object");
            return null;
        }
        JSONObject jSONObject = new JSONObject(string2);
        boolean z2 = true;
        if (jSONObject.optInt("schemaVersion", -1) != 1) {
            c.p("Unsupported plugin catalog schema");
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("plugins");
        if (jSONArray.length() > 256) {
            c.p("Plugin catalog is too large");
            return null;
        }
        ai1 ai1VarX = vr.x();
        int length2 = jSONArray.length();
        int i2 = 0;
        while (i2 < length2) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
            jSONObject2.getClass();
            String strB = b(jSONObject2, "sha256", 64);
            if (!a.c(strB)) {
                c.p("Invalid package checksum");
                return null;
            }
            String strB2 = b(jSONObject2, "id", 128);
            if (!b.c(strB2)) {
                c.p("Invalid plugin id");
                return null;
            }
            String strB3 = b(jSONObject2, "version", 64);
            try {
                ou2 ou2VarU = n32.u(strB3, z);
                if (ou2VarU == null) {
                    throw new IllegalStateException("Invalid semantic version");
                }
                qn2Var = new la2(ou2VarU);
            } catch (Throwable th) {
                qn2Var = new qn2(th);
            }
            if (qn2Var instanceof qn2) {
                c.p("Invalid plugin version");
                return null;
            }
            String strB4 = b(jSONObject2, "apiVersion", 64);
            if (!q72.a.c(y93.G0(strB4).toString())) {
                c.p("Invalid plugin API version");
                return null;
            }
            String strB5 = b(jSONObject2, "packageUrl", 2048);
            URI uri = new URI(strB5);
            if (fa3.Z(uri.getScheme(), "https", z2) && (host = uri.getHost()) != null && !y93.q0(host)) {
                String path = uri.getPath();
                path.getClass();
                if (fa3.Y(path, ".splug", z2)) {
                    String strB6 = b(jSONObject2, "name", 128);
                    Object objOpt = jSONObject2.opt("description");
                    if (objOpt != null && objOpt != JSONObject.NULL) {
                        if (objOpt instanceof String) {
                            String str2 = (String) objOpt;
                            if (str2.length() <= 2048) {
                                string = y93.G0(str2).toString();
                            }
                        }
                        c.p("Invalid description");
                        return null;
                    }
                    string = "";
                    Object objOpt2 = jSONObject2.opt("author");
                    if (objOpt2 == null || objOpt2 == JSONObject.NULL) {
                        r72Var = null;
                    } else {
                        if (!(objOpt2 instanceof JSONObject)) {
                            c.p("Invalid author");
                            return null;
                        }
                        r72Var = new r72(b((JSONObject) objOpt2, "name", 128));
                    }
                    ai1VarX.add(new w72(strB2, strB6, strB3, strB4, string, r72Var, strB5, strB));
                    i2++;
                    z = false;
                    z2 = true;
                }
            }
            c.p("Plugin package URL must use HTTPS and end with .splug");
            return null;
        }
        ai1 ai1VarR = vr.r(ai1VarX);
        ArrayList arrayList = new ArrayList(rx.d0(ai1VarR, 10));
        ListIterator listIterator = ai1VarR.listIterator(0);
        while (true) {
            jy0 jy0Var = (jy0) listIterator;
            if (!jy0Var.hasNext()) {
                break;
            }
            arrayList.add(((w72) jy0Var.next()).a);
        }
        if (qx.N0(qx.Q0(arrayList)).size() == ai1VarR.a()) {
            return ai1VarR;
        }
        c.p("Plugin catalog contains duplicate ids");
        return null;
    }

    public static final String b(JSONObject jSONObject, String str, int i) {
        Object objOpt = jSONObject.opt(str);
        String str2 = objOpt instanceof String ? (String) objOpt : null;
        if (str2 == null) {
            throw new IllegalStateException("Missing or invalid ".concat(str).toString());
        }
        String string = y93.G0(str2).toString();
        if (string.length() > 0 && string.length() <= i) {
            return string;
        }
        c.g("Invalid ".concat(str));
        return null;
    }
}
