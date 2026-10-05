package defpackage;

import java.net.URI;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class wu {
    public static final uk2 a = new uk2("^[0-9a-fA-F]{64}$");
    public static final uk2 b = new uk2("^[a-z][a-z0-9]*(?:[._-][a-z0-9]+)*$");

    public static final String a(JSONObject jSONObject, String str, int i) {
        Object objOpt = jSONObject.opt(str);
        if (objOpt == null || objOpt == JSONObject.NULL) {
            return "";
        }
        if (objOpt instanceof String) {
            String str2 = (String) objOpt;
            if (str2.length() <= i) {
                return y93.G0(str2).toString();
            }
        }
        c.g("Invalid ".concat(str));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ai1 b(String str) throws JSONException {
        CharSequence charSequenceSubSequence;
        String host;
        ai1 ai1Var;
        long jLongValue;
        int length = str.length();
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
        String string = charSequenceSubSequence.toString();
        if (!y93.B0(string, '{')) {
            c.p("CLEO catalog endpoint did not return a JSON object");
            return null;
        }
        JSONArray jSONArray = new JSONObject(string).getJSONArray("scripts");
        if (jSONArray.length() > 256) {
            c.p("CLEO catalog is too large");
            return null;
        }
        ai1 ai1VarX = vr.x();
        int length2 = jSONArray.length();
        for (int i2 = 0; i2 < length2; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            jSONObject.getClass();
            String strC = c(jSONObject, "id", 128);
            if (!b.c(strC)) {
                c.p("Invalid CLEO id");
                return null;
            }
            String strC2 = c(jSONObject, "kind", 3);
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = strC2.toLowerCase(locale);
            lowerCase.getClass();
            String strConcat = "script.".concat(lowerCase);
            lw.g.getClass();
            lw lwVarG = zj.g(strConcat);
            if (lwVarG == null) {
                c.q("Invalid CLEO script kind");
                return null;
            }
            String strC3 = c(jSONObject, "packageUrl", 2048);
            URI uri = new URI(strC3);
            if (fa3.Z(uri.getScheme(), "https", true) && (host = uri.getHost()) != null && !y93.q0(host)) {
                String path = uri.getPath();
                path.getClass();
                if (fa3.Y(path, ".zip", true)) {
                    String strC4 = c(jSONObject, "sha256", 64);
                    if (!a.c(strC4)) {
                        c.p("Invalid CLEO package checksum");
                        return null;
                    }
                    Object objOpt = jSONObject.opt("sizeBytes");
                    if (objOpt == null || objOpt == JSONObject.NULL) {
                        objOpt = null;
                    }
                    if (objOpt != null) {
                        ai1Var = null;
                        if (!(objOpt instanceof Number)) {
                            c.p("Invalid CLEO package size");
                            return null;
                        }
                        jLongValue = ((Number) objOpt).longValue();
                    } else {
                        ai1Var = null;
                        jLongValue = -1;
                    }
                    if (-1 > jLongValue || jLongValue >= 33554433) {
                        c.p("Invalid CLEO package size");
                        return ai1Var;
                    }
                    String strC5 = c(jSONObject, "name", 128);
                    String strC6 = c(jSONObject, "version", 64);
                    String strA = a(jSONObject, "description", 2048);
                    String strA2 = a(jSONObject, "author", 128);
                    ai1VarX.add(new vu(strC, strC5, strC6, lwVarG, strA, !y93.q0(strA2) ? strA2 : ai1Var, strC3, jLongValue, strC4));
                }
            }
            c.p("CLEO package URL must use HTTPS and end with .zip");
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
            arrayList.add(((vu) jy0Var.next()).a);
        }
        if (qx.N0(qx.Q0(arrayList)).size() == ai1VarR.a()) {
            return ai1VarR;
        }
        c.p("CLEO catalog contains duplicate ids");
        return null;
    }

    public static final String c(JSONObject jSONObject, String str, int i) {
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
