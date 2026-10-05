package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sn implements r73 {
    public static final qn a = new qn();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, rn.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }

    @Override // defpackage.r73
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.r73
    public final boolean b() {
        return b;
    }

    @Override // defpackage.r73
    public final boolean c(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.r73
    public final void d(SSLSocket sSLSocket, String str, List list, kq kqVar) {
        list.getClass();
        if (c(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            m62 m62Var = m62.a;
            parameters.setApplicationProtocols((String[]) h01.k(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
