package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class a30 implements yo2, zj0 {
    public final id3 a;
    public final lj2 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final ij2 h;
    public final oj2 i;
    public final wo2 j;
    public final List k;
    public final ll2 l;
    public final int m;
    public final boolean n;
    public final qg0 o;
    public volatile boolean p;
    public Socket q;
    public Socket r;
    public mx0 s;
    public de2 t;
    public pi u;
    public jj2 v;

    public a30(id3 id3Var, lj2 lj2Var, int i, int i2, int i3, int i4, boolean z, ij2 ij2Var, oj2 oj2Var, wo2 wo2Var, List list, ll2 ll2Var, int i5, boolean z2, qg0 qg0Var) {
        id3Var.getClass();
        lj2Var.getClass();
        wo2Var.getClass();
        this.a = id3Var;
        this.b = lj2Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = ij2Var;
        this.i = oj2Var;
        this.j = wo2Var;
        this.k = list;
        this.l = ll2Var;
        this.m = i5;
        this.n = z2;
        this.o = qg0Var;
    }

    public static a30 l(a30 a30Var, wo2 wo2Var, int i, boolean z, qg0 qg0Var, int i2) {
        return new a30(a30Var.a, a30Var.b, a30Var.c, a30Var.d, a30Var.e, a30Var.f, a30Var.g, a30Var.h, a30Var.i, (i2 & 1) != 0 ? a30Var.j : wo2Var, a30Var.k, a30Var.l, (i2 & 8) != 0 ? a30Var.m : i, (i2 & 16) != 0 ? a30Var.n : z, (i2 & 32) != 0 ? a30Var.o : qg0Var);
    }

    @Override // defpackage.yo2
    public final yo2 a() {
        return new a30(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    @Override // defpackage.yo2
    public final xo2 c() throws Throwable {
        Socket socket = this.q;
        if (socket == null) {
            c.p("TCP not connected");
            return null;
        }
        if (e()) {
            c.q("already connected");
            return null;
        }
        List list = this.j.a.j;
        this.h.x.add(this);
        boolean z = false;
        try {
            try {
                if (this.l != null) {
                    xo2 xo2VarK = k();
                    if (xo2VarK.c != null) {
                        this.h.x.remove(this);
                        Socket socket2 = this.r;
                        if (socket2 != null) {
                            lv3.c(socket2);
                        }
                        lv3.c(socket);
                        return xo2VarK;
                    }
                }
                m4 m4Var = this.j.a;
                if (m4Var.c != null) {
                    pi piVar = this.u;
                    if (piVar == null) {
                        s51.F("socket");
                        throw null;
                    }
                    if (((ej2) piVar.h).g.c()) {
                        pi piVar2 = this.u;
                        if (piVar2 == null) {
                            s51.F("socket");
                            throw null;
                        }
                        if (((dj2) piVar2.i).g.c()) {
                            this.h.i.getClass();
                            m4 m4Var2 = this.j.a;
                            SSLSocketFactory sSLSocketFactory = m4Var2.c;
                            i01 i01Var = m4Var2.h;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, i01Var.d, i01Var.e, true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            a30 a30VarO = o(list, sSLSocket);
                            d30 d30Var = (d30) list.get(a30VarO.m);
                            d30Var.a(sSLSocket, a30VarO.n);
                            try {
                                j(sSLSocket, d30Var);
                                this.h.i.getClass();
                            } catch (SSLException e) {
                                a30VarO.n(list, sSLSocket, e);
                                throw e;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.r = socket;
                List list2 = m4Var.i;
                de2 de2Var = de2.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(de2Var)) {
                    de2Var = de2.HTTP_1_1;
                }
                this.t = de2Var;
                id3 id3Var = this.a;
                lj2 lj2Var = this.b;
                wo2 wo2Var = this.j;
                Socket socket3 = this.r;
                socket3.getClass();
                mx0 mx0Var = this.s;
                de2 de2Var2 = this.t;
                de2Var2.getClass();
                pi piVar3 = this.u;
                if (piVar3 == null) {
                    s51.F("socket");
                    throw null;
                }
                this.b.getClass();
                jj2 jj2Var = new jj2(id3Var, lj2Var, wo2Var, socket, socket3, mx0Var, de2Var2, piVar3);
                this.v = jj2Var;
                jj2Var.i();
                pj0 pj0Var = this.h.i;
                wo2 wo2Var2 = this.j;
                InetSocketAddress inetSocketAddress = wo2Var2.c;
                Proxy proxy = wo2Var2.b;
                pj0Var.getClass();
                inetSocketAddress.getClass();
                proxy.getClass();
                try {
                    xo2 xo2Var = new xo2(this, (Throwable) null, 6);
                    this.h.x.remove(this);
                    return xo2Var;
                } catch (IOException e2) {
                    e = e2;
                    z = true;
                    pj0 pj0Var2 = this.h.i;
                    wo2 wo2Var3 = this.j;
                    InetSocketAddress inetSocketAddress2 = wo2Var3.c;
                    Proxy proxy2 = wo2Var3.b;
                    pj0Var2.getClass();
                    inetSocketAddress2.getClass();
                    proxy2.getClass();
                    this.b.getClass();
                    this.j.getClass();
                    xo2 xo2Var2 = new xo2(this, (a30) null, e);
                    this.h.x.remove(this);
                    if (!z) {
                        Socket socket4 = this.r;
                        if (socket4 != null) {
                            lv3.c(socket4);
                        }
                        lv3.c(socket);
                    }
                    return xo2Var2;
                } catch (Throwable th) {
                    th = th;
                    z = true;
                    this.h.x.remove(this);
                    if (!z) {
                        Socket socket5 = this.r;
                        if (socket5 != null) {
                            lv3.c(socket5);
                        }
                        lv3.c(socket);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.yo2, defpackage.zj0
    public final void cancel() {
        this.p = true;
        Socket socket = this.q;
        if (socket != null) {
            lv3.c(socket);
        }
    }

    @Override // defpackage.yo2
    public final jj2 d() {
        k71 k71Var = this.h.f.A;
        wo2 wo2Var = this.j;
        synchronized (k71Var) {
            wo2Var.getClass();
            ((LinkedHashSet) k71Var.g).remove(wo2Var);
        }
        jj2 jj2Var = this.v;
        jj2Var.getClass();
        this.j.getClass();
        xn2 xn2VarD = this.i.d(this, this.k);
        if (xn2VarD != null) {
            return xn2VarD.a;
        }
        synchronized (jj2Var) {
            lj2 lj2Var = this.b;
            lj2Var.getClass();
            TimeZone timeZone = lv3.a;
            lj2Var.d.add(jj2Var);
            lj2Var.b.c(lj2Var.c, 0L);
            this.h.b(jj2Var);
        }
        this.h.i.getClass();
        return jj2Var;
    }

    @Override // defpackage.yo2
    public final boolean e() {
        return this.t != null;
    }

    @Override // defpackage.zj0
    public final wo2 f() {
        return this.j;
    }

    @Override // defpackage.yo2
    public final xo2 g() {
        Socket socket;
        Socket socket2;
        if (this.q != null) {
            c.q("TCP already connected");
            return null;
        }
        this.h.x.add(this);
        boolean z = false;
        try {
            try {
                pj0 pj0Var = this.h.i;
                wo2 wo2Var = this.j;
                InetSocketAddress inetSocketAddress = wo2Var.c;
                Proxy proxy = wo2Var.b;
                pj0Var.getClass();
                inetSocketAddress.getClass();
                proxy.getClass();
                this.b.getClass();
                this.j.getClass();
                i();
                z = true;
                xo2 xo2Var = new xo2(this, (Throwable) null, 6);
                this.h.x.remove(this);
                return xo2Var;
            } catch (IOException e) {
                wo2 wo2Var2 = this.j;
                wo2Var2.a.getClass();
                if (wo2Var2.b.type() != Proxy.Type.DIRECT) {
                    m4 m4Var = this.j.a;
                    m4Var.g.connectFailed(m4Var.h.i(), this.j.b.address(), e);
                }
                pj0 pj0Var2 = this.h.i;
                wo2 wo2Var3 = this.j;
                InetSocketAddress inetSocketAddress2 = wo2Var3.c;
                Proxy proxy2 = wo2Var3.b;
                pj0Var2.getClass();
                inetSocketAddress2.getClass();
                proxy2.getClass();
                this.b.getClass();
                this.j.getClass();
                xo2 xo2Var2 = new xo2(this, e, 2);
                this.h.x.remove(this);
                if (!z && (socket = this.q) != null) {
                    lv3.c(socket);
                }
                return xo2Var2;
            }
        } catch (Throwable th) {
            this.h.x.remove(this);
            if (!z && (socket2 = this.q) != null) {
                lv3.c(socket2);
            }
            throw th;
        }
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.j.b.type();
        int i = type == null ? -1 : z20.a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.j.a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.j.b);
        }
        this.q = socketCreateSocket;
        if (this.p) {
            c.r("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            m62 m62Var = m62.a;
            m62.a.e(socketCreateSocket, this.j.c, this.e);
            try {
                this.u = new pi(new pl(socketCreateSocket));
            } catch (NullPointerException e) {
                if (s51.n(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, d30 d30Var) {
        de2 de2VarT;
        m4 m4Var = this.j.a;
        try {
            if (d30Var.b) {
                m62 m62Var = m62.a;
                m62.a.d(sSLSocket, m4Var.h.d, m4Var.i, this.j.d);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            mx0 mx0VarZ = gq.z(session);
            HostnameVerifier hostnameVerifier = m4Var.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(m4Var.h.d, session)) {
                List listA = mx0VarZ.a();
                if (listA.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + m4Var.h.d + " not verified (no certificates)");
                }
                Object obj = listA.get(0);
                obj.getClass();
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n            |Hostname ");
                sb.append(m4Var.h.d);
                sb.append(" not verified:\n            |    certificate: ");
                fs fsVar = fs.c;
                sb.append(uq.D(x509Certificate));
                sb.append("\n            |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n            |    subjectAltNames: ");
                sb.append(qx.D0(ky1.a(x509Certificate, 7), ky1.a(x509Certificate, 2)));
                sb.append("\n            ");
                throw new SSLPeerUnverifiedException(z93.V(sb.toString()));
            }
            fs fsVar2 = m4Var.e;
            fsVar2.getClass();
            this.s = new mx0(mx0VarZ.a, mx0VarZ.b, mx0VarZ.c, new ok(fsVar2, mx0VarZ, m4Var, 4));
            m4Var.h.d.getClass();
            Iterator it = fsVar2.a.iterator();
            String strG = null;
            if (it.hasNext()) {
                nc2.u(it.next());
                throw null;
            }
            if (d30Var.b) {
                m62 m62Var2 = m62.a;
                strG = m62.a.g(sSLSocket);
            }
            this.r = sSLSocket;
            this.u = new pi(new pl(sSLSocket));
            if (strG != null) {
                de2.g.getClass();
                de2VarT = h01.t(strG);
            } else {
                de2VarT = de2.HTTP_1_1;
            }
            this.t = de2VarT;
            m62 m62Var3 = m62.a;
            m62.a.getClass();
        } catch (Throwable th) {
            m62 m62Var4 = m62.a;
            m62.a.getClass();
            lv3.c(sSLSocket);
            throw th;
        }
    }

    public final xo2 k() throws IOException {
        ll2 ll2Var = this.l;
        ll2Var.getClass();
        wo2 wo2Var = this.j;
        String str = "CONNECT " + lv3.i(wo2Var.a.h, true) + " HTTP/1.1";
        pi piVar = this.u;
        if (piVar == null) {
            s51.F("socket");
            throw null;
        }
        nz0 nz0Var = new nz0(null, this, piVar);
        pi piVar2 = this.u;
        if (piVar2 == null) {
            s51.F("socket");
            throw null;
        }
        ((ej2) piVar2.h).f.a().g(this.c);
        pi piVar3 = this.u;
        if (piVar3 == null) {
            s51.F("socket");
            throw null;
        }
        ((dj2) piVar3.i).f.a().g(this.d);
        nz0Var.j(ll2Var.c, str);
        nz0Var.c();
        kn2 kn2VarH = nz0Var.h();
        kn2VarH.a = ll2Var;
        ln2 ln2VarA = kn2VarH.a();
        int i = ln2VarA.i;
        long jE = lv3.e(ln2VarA);
        if (jE != -1) {
            lz0 lz0VarI = nz0Var.i(ln2VarA.f.a, jE);
            lv3.g(lz0VarI, Integer.MAX_VALUE);
            lz0VarI.close();
        }
        if (i == 200) {
            return new xo2(this, (Throwable) null, 6);
        }
        if (i != 407) {
            c.r(by1.e(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        wo2Var.a.f.getClass();
        c.r("Failed to authenticate with proxy");
        return null;
    }

    public final a30 m(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        int i = this.m;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            d30 d30Var = (d30) list.get(i2);
            d30Var.getClass();
            if (d30Var.a && (((strArr = d30Var.d) == null || jv3.d(strArr, sSLSocket.getEnabledProtocols(), ot1.b)) && ((strArr2 = d30Var.c) == null || jv3.d(strArr2, sSLSocket.getEnabledCipherSuites(), ju.c)))) {
                return l(this, null, i2, i != -1, null, 39);
            }
        }
        return null;
    }

    public final a30 n(List list, SSLSocket sSLSocket, SSLException sSLException) throws rg0 {
        list.getClass();
        if (this.o != null) {
            return null;
        }
        m62 m62Var = m62.a;
        qg0 qg0VarF = m62.a.f(sSLException);
        if (qg0VarF != null) {
            HostnameVerifier hostnameVerifier = this.j.a.d;
            hostnameVerifier.getClass();
            if (!hostnameVerifier.verify(qg0VarF.a, sSLSocket.getSession())) {
                throw new rg0(nc2.j(new StringBuilder("public_name '"), qg0VarF.a, "' not verified"), sSLException);
            }
            wo2 wo2Var = this.j;
            return l(this, new wo2(wo2Var.a, wo2Var.b, wo2Var.c, qg0VarF.b), 0, false, qg0VarF, 30);
        }
        if (!this.g) {
            return null;
        }
        if (((sSLException instanceof SSLHandshakeException) && (sSLException.getCause() instanceof CertificateException)) || (sSLException instanceof SSLPeerUnverifiedException)) {
            return null;
        }
        return m(list, sSLSocket);
    }

    public final a30 o(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        list.getClass();
        if (this.m != -1) {
            return this;
        }
        a30 a30VarM = m(list, sSLSocket);
        if (a30VarM != null) {
            return a30VarM;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.n);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // defpackage.zj0
    public final void h() {
    }

    @Override // defpackage.zj0
    public final void b(ij2 ij2Var, IOException iOException) {
    }
}
