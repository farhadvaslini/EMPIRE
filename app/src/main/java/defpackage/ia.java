package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ia extends m62 implements i40 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT < 29;
    }

    public ia() {
        x83 x83Var;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            x83Var = new x83(cls);
        } catch (Exception e2) {
            CopyOnWriteArraySet copyOnWriteArraySet = p9.a;
            p9.a(my1.class.getName(), 5, "unable to load android socket classes", e2);
            x83Var = null;
        }
        int i = 0;
        ArrayList arrayListR = uj.R(new r73[]{x83Var, new fa0(ob.e), new fa0(k30.a), new fa0(sn.a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListR.size();
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            if (((r73) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.i40
    public final void a(Context context) {
        this.c = context;
    }

    @Override // defpackage.i40
    public final Context b() {
        return this.c;
    }

    @Override // defpackage.m62
    public final pq c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        yk3 pmVar;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        p6 p6Var = x509TrustManagerExtensions != null ? new p6(x509TrustManager, x509TrustManagerExtensions) : null;
        if (p6Var != null) {
            return p6Var;
        }
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            pmVar = new ha(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused2) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            pmVar = new pm((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        }
        return new ql(pmVar);
    }

    @Override // defpackage.m62
    public final void d(SSLSocket sSLSocket, String str, List list, kq kqVar) {
        Object obj;
        list.getClass();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((r73) obj).c(sSLSocket)) {
                break;
            }
        }
        r73 r73Var = (r73) obj;
        if (r73Var != null) {
            r73Var.d(sSLSocket, str, list, kqVar);
        }
    }

    @Override // defpackage.m62
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // defpackage.m62
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((r73) obj).c(sSLSocket)) {
                break;
            }
        }
        r73 r73Var = (r73) obj;
        if (r73Var != null) {
            return r73Var.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.m62
    public final boolean i(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.m62
    public final void j(String str, int i, Throwable th) {
        if (i == 5) {
            Log.w("OkHttp", str, th);
        } else {
            Log.i("OkHttp", str, th);
        }
    }

    @Override // defpackage.m62
    public final SSLContext l() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
