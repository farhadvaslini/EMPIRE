package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class i30 implements ea0 {
    @Override // defpackage.ea0
    public final boolean c(SSLSocket sSLSocket) {
        return k30.b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.ea0
    public final r73 e(SSLSocket sSLSocket) {
        return new k30();
    }
}
