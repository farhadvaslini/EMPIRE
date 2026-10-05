package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wo2 {
    public final m4 a;
    public final Proxy b;
    public final InetSocketAddress c;
    public final kq d;

    public wo2(m4 m4Var, Proxy proxy, InetSocketAddress inetSocketAddress, kq kqVar) {
        m4Var.getClass();
        proxy.getClass();
        inetSocketAddress.getClass();
        this.a = m4Var;
        this.b = proxy;
        this.c = inetSocketAddress;
        this.d = kqVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wo2)) {
            return false;
        }
        wo2 wo2Var = (wo2) obj;
        return s51.n(wo2Var.a, this.a) && s51.n(wo2Var.b, this.b) && s51.n(wo2Var.c, this.c) && s51.n(wo2Var.d, this.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31;
        kq kqVar = this.d;
        return iHashCode + (kqVar != null ? kqVar.hashCode() : 0);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        m4 m4Var = this.a;
        i01 i01Var = m4Var.h;
        i01 i01Var2 = m4Var.h;
        String str = i01Var.d;
        InetSocketAddress inetSocketAddress = this.c;
        InetAddress address = inetSocketAddress.getAddress();
        String strB = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : hv3.b(hostAddress);
        if (y93.i0(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (i01Var2.e != inetSocketAddress.getPort() || str.equals(strB)) {
            sb.append(":");
            sb.append(i01Var2.e);
        }
        if (!str.equals(strB)) {
            if (s51.n(this.b, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strB == null) {
                sb.append("<unresolved>");
            } else if (y93.i0(strB, ':')) {
                sb.append("[");
                sb.append(strB);
                sb.append("]");
            } else {
                sb.append(strB);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        if (this.d != null) {
            sb.append(" with ECH");
        }
        return sb.toString();
    }
}
