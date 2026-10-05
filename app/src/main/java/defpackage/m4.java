package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m4 {
    public final xc0 a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final fs e;
    public final f5 f;
    public final ProxySelector g;
    public final i01 h;
    public final List i;
    public final List j;

    public m4(String str, int i, xc0 xc0Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, fs fsVar, f5 f5Var, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        xc0Var.getClass();
        socketFactory.getClass();
        f5Var.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = xc0Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = fsVar;
        this.f = f5Var;
        this.g = proxySelector;
        g01 g01Var = new g01();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            g01Var.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                c.p("unexpected scheme: ".concat(str2));
                throw null;
            }
            g01Var.a = "https";
        }
        String strB = hv3.b(cl3.x(str, 0, 0, 7));
        if (strB == null) {
            c.p("unexpected host: ".concat(str));
            throw null;
        }
        g01Var.d = strB;
        if (1 > i || i >= 65536) {
            c.g(by1.e(i, "unexpected port: "));
            throw null;
        }
        g01Var.e = i;
        this.h = g01Var.a();
        this.i = lv3.j(list);
        this.j = lv3.j(list2);
    }

    public final boolean a(m4 m4Var) {
        m4Var.getClass();
        return s51.n(this.a, m4Var.a) && s51.n(this.f, m4Var.f) && s51.n(this.i, m4Var.i) && s51.n(this.j, m4Var.j) && s51.n(this.g, m4Var.g) && s51.n(this.c, m4Var.c) && s51.n(this.d, m4Var.d) && s51.n(this.e, m4Var.e) && this.h.e == m4Var.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        return s51.n(this.h, m4Var.h) && a(m4Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + by1.a(527, 31, this.h.i)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        i01 i01Var = this.h;
        sb.append(i01Var.d);
        sb.append(':');
        sb.append(i01Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
