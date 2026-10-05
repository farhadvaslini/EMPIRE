package defpackage;

import java.net.InetAddress;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vc0 {
    public final InetAddress a;
    public final String b;

    public vc0(String str, InetAddress inetAddress) {
        str.getClass();
        inetAddress.getClass();
        this.a = inetAddress;
        String strB = hv3.b(str);
        if (strB != null) {
            this.b = strB;
        } else {
            c.p("unexpected hostname: ".concat(str));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vc0)) {
            return false;
        }
        vc0 vc0Var = (vc0) obj;
        return s51.n(vc0Var.b, this.b) && s51.n(vc0Var.a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return this.b + '/' + this.a.getHostAddress();
    }
}
