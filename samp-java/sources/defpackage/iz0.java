package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class iz0 {
    public static final sx0[] a;
    public static final Map b;

    static {
        sx0 sx0Var = new sx0(sx0.i, "");
        kq kqVar = sx0.f;
        sx0 sx0Var2 = new sx0(kqVar, "GET");
        sx0 sx0Var3 = new sx0(kqVar, "POST");
        kq kqVar2 = sx0.g;
        sx0 sx0Var4 = new sx0(kqVar2, "/");
        sx0 sx0Var5 = new sx0(kqVar2, "/index.html");
        kq kqVar3 = sx0.h;
        sx0 sx0Var6 = new sx0(kqVar3, "http");
        sx0 sx0Var7 = new sx0(kqVar3, "https");
        kq kqVar4 = sx0.e;
        sx0[] sx0VarArr = {sx0Var, sx0Var2, sx0Var3, sx0Var4, sx0Var5, sx0Var6, sx0Var7, new sx0(kqVar4, "200"), new sx0(kqVar4, "204"), new sx0(kqVar4, "206"), new sx0(kqVar4, "304"), new sx0(kqVar4, "400"), new sx0(kqVar4, "404"), new sx0(kqVar4, "500"), new sx0("accept-charset", ""), new sx0("accept-encoding", "gzip, deflate"), new sx0("accept-language", ""), new sx0("accept-ranges", ""), new sx0("accept", ""), new sx0("access-control-allow-origin", ""), new sx0("age", ""), new sx0("allow", ""), new sx0("authorization", ""), new sx0("cache-control", ""), new sx0("content-disposition", ""), new sx0("content-encoding", ""), new sx0("content-language", ""), new sx0("content-length", ""), new sx0("content-location", ""), new sx0("content-range", ""), new sx0("content-type", ""), new sx0("cookie", ""), new sx0("date", ""), new sx0("etag", ""), new sx0("expect", ""), new sx0("expires", ""), new sx0("from", ""), new sx0("host", ""), new sx0("if-match", ""), new sx0("if-modified-since", ""), new sx0("if-none-match", ""), new sx0("if-range", ""), new sx0("if-unmodified-since", ""), new sx0("last-modified", ""), new sx0("link", ""), new sx0("location", ""), new sx0("max-forwards", ""), new sx0("proxy-authenticate", ""), new sx0("proxy-authorization", ""), new sx0("range", ""), new sx0("referer", ""), new sx0("refresh", ""), new sx0("retry-after", ""), new sx0("server", ""), new sx0("set-cookie", ""), new sx0("strict-transport-security", ""), new sx0("transfer-encoding", ""), new sx0("user-agent", ""), new sx0("vary", ""), new sx0("via", ""), new sx0("www-authenticate", "")};
        a = sx0VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(sx0VarArr[i].a)) {
                linkedHashMap.put(sx0VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(kq kqVar) throws IOException {
        kqVar.getClass();
        int iB = kqVar.b();
        for (int i = 0; i < iB; i++) {
            byte bE = kqVar.e(i);
            if (65 <= bE && bE < 91) {
                c.r("PROTOCOL_ERROR response malformed: mixed case name: ".concat(kqVar.l()));
                return;
            }
        }
    }
}
