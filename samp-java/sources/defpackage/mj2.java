package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mj2 {
    public final ij2 a;
    public final ArrayList b;
    public final int c;
    public final yj0 d;
    public final ll2 e;
    public final int f;
    public final int g;
    public final int h;
    public final f5 i;
    public final fs j;
    public final yl1 k;
    public final f5 l;
    public final xc0 m;
    public final HostnameVerifier n;
    public final f5 o;
    public final ProxySelector p;
    public final boolean q;
    public final SocketFactory r;
    public final SSLSocketFactory s;
    public final X509TrustManager t;
    public final pq u;
    public int v;

    public mj2(ij2 ij2Var, ArrayList arrayList, int i, yj0 yj0Var, ll2 ll2Var, int i2, int i3, int i4, f5 f5Var, fs fsVar, yl1 yl1Var, f5 f5Var2, xc0 xc0Var, HostnameVerifier hostnameVerifier, f5 f5Var3, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, pq pqVar) {
        ll2Var.getClass();
        f5Var.getClass();
        fsVar.getClass();
        yl1Var.getClass();
        f5Var2.getClass();
        xc0Var.getClass();
        hostnameVerifier.getClass();
        f5Var3.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.a = ij2Var;
        this.b = arrayList;
        this.c = i;
        this.d = yj0Var;
        this.e = ll2Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = f5Var;
        this.j = fsVar;
        this.k = yl1Var;
        this.l = f5Var2;
        this.m = xc0Var;
        this.n = hostnameVerifier;
        this.o = f5Var3;
        this.p = proxySelector;
        this.q = z;
        this.r = socketFactory;
        this.s = sSLSocketFactory;
        this.t = x509TrustManager;
        this.u = pqVar;
    }

    public static mj2 a(mj2 mj2Var, int i, yj0 yj0Var, ll2 ll2Var, int i2) {
        int i3 = (i2 & 1) != 0 ? mj2Var.c : i;
        yj0 yj0Var2 = (i2 & 2) != 0 ? mj2Var.d : yj0Var;
        ll2 ll2Var2 = (i2 & 4) != 0 ? mj2Var.e : ll2Var;
        int i4 = mj2Var.f;
        int i5 = mj2Var.g;
        int i6 = mj2Var.h;
        f5 f5Var = mj2Var.i;
        fs fsVar = mj2Var.j;
        yl1 yl1Var = mj2Var.k;
        f5 f5Var2 = mj2Var.l;
        xc0 xc0Var = mj2Var.m;
        HostnameVerifier hostnameVerifier = mj2Var.n;
        f5 f5Var3 = mj2Var.o;
        ProxySelector proxySelector = mj2Var.p;
        boolean z = mj2Var.q;
        SocketFactory socketFactory = mj2Var.r;
        SSLSocketFactory sSLSocketFactory = mj2Var.s;
        X509TrustManager x509TrustManager = mj2Var.t;
        pq pqVar = mj2Var.u;
        ll2Var2.getClass();
        f5Var.getClass();
        fsVar.getClass();
        yl1Var.getClass();
        f5Var2.getClass();
        xc0Var.getClass();
        hostnameVerifier.getClass();
        f5Var3.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new mj2(mj2Var.a, mj2Var.b, i3, yj0Var2, ll2Var2, i4, i5, i6, f5Var, fsVar, yl1Var, f5Var2, xc0Var, hostnameVerifier, f5Var3, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, pqVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fb, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0211, code lost:
    
        r25 = " must call proceed() exactly once";
        r20 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028f  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r48v0, types: [mj2] */
    /* JADX WARN: Type inference failed for: r48v1 */
    /* JADX WARN: Type inference failed for: r48v2 */
    /* JADX WARN: Type inference failed for: r48v3 */
    /* JADX WARN: Type inference failed for: r48v4 */
    /* JADX WARN: Type inference failed for: r48v5 */
    /* JADX WARN: Type inference failed for: r48v6 */
    /* JADX WARN: Type inference failed for: r48v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ln2 b(defpackage.ll2 r49) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj2.b(ll2):ln2");
    }
}
