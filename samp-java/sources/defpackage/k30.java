package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k30 implements r73 {
    public static final i30 a = new i30();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, j30.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (j30.a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // defpackage.r73
    public final String a(SSLSocket sSLSocket) {
        if (c(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.r73
    public final boolean b() {
        return b;
    }

    @Override // defpackage.r73
    public final boolean c(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.r73
    public final void d(SSLSocket sSLSocket, String str, List list, kq kqVar) {
        list.getClass();
        if (c(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            m62 m62Var = m62.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) h01.k(list).toArray(new String[0]));
        }
    }
}
