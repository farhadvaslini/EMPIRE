package defpackage;

import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class m62 {
    public static volatile m62 a;
    public static final Logger b;

    static {
        try {
            for (Map.Entry entry : p9.b.entrySet()) {
                p9.b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        m62 g6Var = g6.e ? new g6() : null;
        if (g6Var == null) {
            g6Var = ia.e ? new ia() : null;
        }
        if (g6Var == null) {
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        }
        a = g6Var;
        b = Logger.getLogger(my1.class.getName());
    }

    public abstract pq c(X509TrustManager x509TrustManager);

    public abstract void d(SSLSocket sSLSocket, String str, List list, kq kqVar);

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        socket.connect(inetSocketAddress, i);
    }

    public qg0 f(SSLException sSLException) {
        return null;
    }

    public abstract String g(SSLSocket sSLSocket);

    public Object h() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public abstract boolean i(String str);

    public abstract void j(String str, int i, Throwable th);

    public void k(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(str, 5, (Throwable) obj);
    }

    public abstract SSLContext l();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
