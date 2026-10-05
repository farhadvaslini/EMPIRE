package defpackage;

import android.net.ssl.EchConfigList;
import android.net.ssl.InvalidEchDataException;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class h6 implements r73 {
    public final /* synthetic */ int a;

    public /* synthetic */ h6(int i) {
        this.a = i;
    }

    @Override // defpackage.r73
    public final String a(SSLSocket sSLSocket) {
        switch (this.a) {
            case 0:
                try {
                    String applicationProtocol = sSLSocket.getApplicationProtocol();
                    if (applicationProtocol == null) {
                        return null;
                    }
                    if (applicationProtocol.equals("")) {
                        return null;
                    }
                    return applicationProtocol;
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            default:
                String applicationProtocol2 = sSLSocket.getApplicationProtocol();
                if (applicationProtocol2 == null || applicationProtocol2.equals("")) {
                    return null;
                }
                return applicationProtocol2;
        }
    }

    @Override // defpackage.r73
    public final boolean b() {
        switch (this.a) {
            case 0:
                m62 m62Var = m62.a;
                if (Build.VERSION.SDK_INT >= 29) {
                }
                break;
            default:
                m62 m62Var2 = m62.a;
                if (Build.VERSION.SDK_INT >= 37) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.r73
    public final boolean c(SSLSocket sSLSocket) {
        switch (this.a) {
        }
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // defpackage.r73
    public final void d(SSLSocket sSLSocket, String str, List list, kq kqVar) throws IOException {
        EchConfigList echConfigListFromBytes;
        int i = this.a;
        list.getClass();
        switch (i) {
            case 0:
                try {
                    SSLSockets.setUseSessionTickets(sSLSocket, true);
                    SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                    m62 m62Var = m62.a;
                    sSLParameters.setApplicationProtocols((String[]) h01.k(list).toArray(new String[0]));
                    sSLSocket.setSSLParameters(sSLParameters);
                    return;
                } catch (IllegalArgumentException e) {
                    throw new IOException("Android internal error", e);
                }
            default:
                SSLSockets.setUseSessionTickets(sSLSocket, true);
                try {
                    SSLParameters sSLParameters2 = sSLSocket.getSSLParameters();
                    m62 m62Var2 = m62.a;
                    sSLParameters2.setApplicationProtocols((String[]) h01.k(list).toArray(new String[0]));
                    sSLSocket.setSSLParameters(sSLParameters2);
                    if (str == null || kqVar == null) {
                        return;
                    }
                    try {
                        echConfigListFromBytes = EchConfigList.fromBytes(kqVar.k());
                        break;
                    } catch (InvalidEchDataException unused) {
                        echConfigListFromBytes = null;
                    }
                    if (echConfigListFromBytes != null) {
                        SSLSockets.setEchConfigList(sSLSocket, echConfigListFromBytes);
                        return;
                    }
                    return;
                } catch (IllegalArgumentException e2) {
                    throw new IOException("Android internal error", e2);
                }
        }
    }
}
