package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fa0 implements r73 {
    public final ea0 a;
    public r73 b;

    public fa0(ea0 ea0Var) {
        this.a = ea0Var;
    }

    @Override // defpackage.r73
    public final String a(SSLSocket sSLSocket) {
        r73 r73VarE = e(sSLSocket);
        if (r73VarE != null) {
            return r73VarE.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.r73
    public final boolean b() {
        return true;
    }

    @Override // defpackage.r73
    public final boolean c(SSLSocket sSLSocket) {
        return this.a.c(sSLSocket);
    }

    @Override // defpackage.r73
    public final void d(SSLSocket sSLSocket, String str, List list, kq kqVar) {
        list.getClass();
        r73 r73VarE = e(sSLSocket);
        if (r73VarE != null) {
            r73VarE.d(sSLSocket, str, list, kqVar);
        }
    }

    public final synchronized r73 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.c(sSLSocket)) {
                this.b = this.a.e(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
