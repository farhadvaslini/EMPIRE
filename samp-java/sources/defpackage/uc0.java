package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class uc0 implements xc0 {
    @Override // defpackage.xc0
    public final List a(String str) throws UnknownHostException {
        str.getClass();
        m62 m62Var = m62.a;
        m62.a.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return uj.Z(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    @Override // defpackage.xc0
    public final ml1 b(wc0 wc0Var) {
        m62 m62Var = m62.a;
        m62.a.getClass();
        return new ml1(id3.l, b21.b, wc0Var);
    }

    public final String toString() {
        return "Dns.SYSTEM";
    }
}
