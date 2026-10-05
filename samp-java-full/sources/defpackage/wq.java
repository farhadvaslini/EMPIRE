package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wq {
    public static final wq b = new wq(0);
    public static final wq c = new wq(1);
    public final /* synthetic */ int a;

    public /* synthetic */ wq(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ll2 a(ln2 ln2Var, yj0 yj0Var, mj2 mj2Var) throws ProtocolException {
        i01 i01VarH;
        ln2 ln2Var2;
        wo2 wo2Var = yj0Var != null ? yj0Var.b().c : null;
        int i = ln2Var.i;
        String str = ln2Var.f.b;
        boolean z = false;
        if (i == 307 || i == 308) {
            if (mj2Var.a.f.h) {
                String strB = ln2.b(ln2Var, "Location");
                ll2 ll2Var = ln2Var.f;
                if (strB != null && (i01VarH = ll2Var.a.h(strB)) != null && (s51.n(i01VarH.a, ll2Var.a.a) || mj2Var.a.f.i)) {
                    pl plVarA = ll2Var.a();
                    str.getClass();
                    if (!str.equals("GET") && !str.equals("HEAD")) {
                        int i2 = ln2Var.i;
                        if (i2 == 303) {
                            z = !str.equals("PROPFIND");
                        } else if (i2 != 307 && i2 != 308 && !str.equals("PROPFIND") && !str.equals("QUERY")) {
                            z = true;
                        }
                        if (z) {
                            plVarA.A("GET");
                            ((tx0) plVarA.i).m("Transfer-Encoding");
                            ((tx0) plVarA.i).m("Content-Length");
                            ((tx0) plVarA.i).m("Content-Type");
                        } else {
                            plVarA.A(str);
                        }
                    }
                    if (!lv3.a(ll2Var.a, i01VarH)) {
                        ((tx0) plVarA.i).m("Authorization");
                    }
                    plVarA.g = i01VarH;
                    return new ll2(plVarA);
                }
            }
        } else {
            if (i == 401) {
                mj2Var.i.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    ln2 ln2Var3 = ln2Var.p;
                    if ((ln2Var3 == null || ln2Var3.i != 503) && c(ln2Var, Integer.MAX_VALUE) == 0) {
                        return ln2Var.f;
                    }
                } else {
                    if (i == 407) {
                        wo2Var.getClass();
                        if (wo2Var.b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        mj2Var.o.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                            default:
                                return null;
                        }
                    } else if (mj2Var.q && (((ln2Var2 = ln2Var.p) == null || ln2Var2.i != 408) && c(ln2Var, 0) <= 0)) {
                        return ln2Var.f;
                    }
                }
            } else if (yj0Var != null && !s51.n(((bk0) yj0Var.c).e().i.h.d, ((ak0) yj0Var.d).f().f().a.h.d)) {
                jj2 jj2VarB = yj0Var.b();
                synchronized (jj2VarB) {
                    jj2VarB.k = true;
                }
                return ln2Var.f;
            }
        }
        return null;
    }

    public static boolean b(IOException iOException, ij2 ij2Var, mj2 mj2Var, ll2 ll2Var) {
        boolean z = iOException instanceof b30;
        if (!mj2Var.q) {
            return false;
        }
        if ((!z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        yj0 yj0Var = ij2Var.w;
        if (yj0Var == null || !yj0Var.a) {
            return false;
        }
        bk0 bk0Var = ij2Var.m;
        bk0Var.getClass();
        oj2 oj2VarE = bk0Var.e();
        yj0 yj0Var2 = ij2Var.w;
        return oj2VarE.a(yj0Var2 != null ? yj0Var2.b() : null);
    }

    public static int c(ln2 ln2Var, int i) {
        String strB = ln2.b(ln2Var, "Retry-After");
        if (strB == null) {
            return i;
        }
        Pattern patternCompile = Pattern.compile("\\d+");
        patternCompile.getClass();
        if (!patternCompile.matcher(strB).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strB);
        numValueOf.getClass();
        return numValueOf.intValue();
    }
}
