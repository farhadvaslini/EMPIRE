package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ll2 a(defpackage.ln2 r9, defpackage.yj0 r10, defpackage.mj2 r11) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq.a(ln2, yj0, mj2):ll2");
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
