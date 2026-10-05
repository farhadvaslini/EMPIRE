package defpackage;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class my1 {
    public static final List D = lv3.k(new de2[]{de2.HTTP_2, de2.HTTP_1_1});
    public static final List E = lv3.k(new d30[]{d30.e, d30.f});
    public final k71 A;
    public final id3 B;
    public final yl1 C;
    public final pl a;
    public final List b;
    public final List c;
    public final qn1 d;
    public final boolean e;
    public final boolean f;
    public final f5 g;
    public final boolean h;
    public final boolean i;
    public final f5 j;
    public final xc0 k;
    public final ProxySelector l;
    public final f5 m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    public final X509TrustManager p;
    public final List q;
    public final List r;
    public final HostnameVerifier s;
    public final fs t;
    public final pq u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final long z;

    public my1(ly1 ly1Var) throws NoSuchAlgorithmException, KeyStoreException {
        this.a = ly1Var.a;
        this.b = lv3.j(ly1Var.c);
        this.c = lv3.j(ly1Var.d);
        this.d = ly1Var.e;
        this.e = ly1Var.f;
        this.f = ly1Var.g;
        this.g = ly1Var.h;
        this.h = ly1Var.i;
        this.i = ly1Var.j;
        this.j = ly1Var.k;
        this.k = ly1Var.l;
        ProxySelector proxySelector = ly1Var.m;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = ux1.a;
        }
        this.l = proxySelector;
        this.m = ly1Var.n;
        this.n = ly1Var.o;
        List list = ly1Var.r;
        this.q = list;
        this.r = ly1Var.s;
        this.s = ly1Var.t;
        this.v = ly1Var.w;
        this.w = ly1Var.x;
        this.x = ly1Var.y;
        this.y = ly1Var.z;
        this.z = ly1Var.A;
        k71 k71Var = ly1Var.B;
        this.A = k71Var == null ? new k71(11) : k71Var;
        id3 id3Var = ly1Var.C;
        this.B = id3Var == null ? id3.l : id3Var;
        yl1 yl1Var = ly1Var.b;
        if (yl1Var == null) {
            yl1Var = new yl1(14);
            ly1Var.b = yl1Var;
        }
        this.C = yl1Var;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((d30) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = ly1Var.p;
                    if (sSLSocketFactory == null) {
                        m62 m62Var = m62.a;
                        m62.a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        trustManagers.getClass();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.p = x509TrustManager;
                                m62 m62Var2 = m62.a;
                                m62Var2.getClass();
                                try {
                                    SSLContext sSLContextL = m62Var2.l();
                                    sSLContextL.init(null, new TrustManager[]{x509TrustManager}, null);
                                    SSLSocketFactory socketFactory = sSLContextL.getSocketFactory();
                                    socketFactory.getClass();
                                    this.o = socketFactory;
                                    pq pqVarC = m62.a.c(x509TrustManager);
                                    this.u = pqVarC;
                                    fs fsVar = ly1Var.u;
                                    fsVar.getClass();
                                    this.t = s51.n(fsVar.b, pqVarC) ? fsVar : new fs(fsVar.a, pqVarC);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        String string = Arrays.toString(trustManagers);
                        string.getClass();
                        qn1.e("Unexpected default trust managers: ".concat(string));
                        throw null;
                    }
                    this.o = sSLSocketFactory;
                    pq pqVar = ly1Var.v;
                    pqVar.getClass();
                    this.u = pqVar;
                    X509TrustManager x509TrustManager2 = ly1Var.q;
                    x509TrustManager2.getClass();
                    this.p = x509TrustManager2;
                    fs fsVar2 = ly1Var.u;
                    fsVar2.getClass();
                    this.t = s51.n(fsVar2.b, pqVar) ? fsVar2 : new fs(fsVar2.a, pqVar);
                }
            }
            this.o = null;
            this.u = null;
            this.p = null;
            this.t = fs.c;
        } else {
            this.o = null;
            this.u = null;
            this.p = null;
            this.t = fs.c;
        }
        X509TrustManager x509TrustManager3 = this.p;
        pq pqVar2 = this.u;
        SSLSocketFactory sSLSocketFactory2 = this.o;
        List list2 = this.c;
        List list3 = this.b;
        list3.getClass();
        if (list3.contains(null)) {
            qn1.g(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            qn1.g(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.q;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((d30) it2.next()).a) {
                    if (sSLSocketFactory2 == null) {
                        c.q("sslSocketFactory == null");
                        throw null;
                    }
                    if (pqVar2 == null) {
                        c.q("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager3 != null) {
                        return;
                    }
                    c.q("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            c.q("Check failed.");
            throw null;
        }
        if (pqVar2 != null) {
            c.q("Check failed.");
            throw null;
        }
        if (x509TrustManager3 != null) {
            c.q("Check failed.");
            throw null;
        }
        if (s51.n(this.t, fs.c)) {
            return;
        }
        c.q("Check failed.");
        throw null;
    }
}
