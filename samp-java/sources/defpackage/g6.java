package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.net.ssl.EchConfigList;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class g6 extends m62 implements i40 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public g6() {
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        ArrayList arrayListR = uj.R(new r73[]{i >= 37 ? new h6(1) : null, i >= 29 ? new h6(i2) : null, new fa0(ob.e), new fa0(k30.a), new fa0(sn.a)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListR.size();
        while (i2 < size) {
            Object obj = arrayListR.get(i2);
            i2++;
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
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        p6 p6Var = x509TrustManagerExtensions != null ? new p6(x509TrustManager, x509TrustManagerExtensions) : null;
        if (p6Var != null) {
            return p6Var;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new ql(new pm((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
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
    public final qg0 f(SSLException sSLException) {
        String publicHostname;
        kq kqVarK;
        byte[] bytes;
        if (Build.VERSION.SDK_INT >= 37 && f6.f(sSLException) && (publicHostname = f6.c(sSLException).getPublicHostname()) != null) {
            uk2 uk2Var = qg0.c;
            EchConfigList retryConfigList = f6.c(sSLException).getRetryConfigList();
            if (retryConfigList == null || (bytes = retryConfigList.toBytes()) == null) {
                kqVarK = null;
            } else {
                kq kqVar = kq.i;
                kqVarK = zj.k(bytes);
            }
            String strB = hv3.b(publicHostname);
            if (strB != null && !hv3.a.c(strB) && !qg0.c.c(strB)) {
                return new qg0(kqVarK, publicHostname);
            }
        }
        return null;
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
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard closeGuardI = m1.i();
        closeGuardI.open("response.body().close()");
        return closeGuardI;
    }

    @Override // defpackage.m62
    public final boolean i(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.m62
    public final void j(String str, int i, Throwable th) {
        if (i == 5) {
            boolean z = ia.e;
            Log.w("OkHttp", str, th);
        } else {
            boolean z2 = ia.e;
            Log.i("OkHttp", str, th);
        }
    }

    @Override // defpackage.m62
    public final void k(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, str);
        } else {
            obj.getClass();
            m1.j(obj).warnIfOpen();
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
