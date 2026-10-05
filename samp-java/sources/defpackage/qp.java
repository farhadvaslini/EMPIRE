package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public interface qp extends g43, WritableByteChannel {
    qp e(kq kqVar);

    @Override // defpackage.g43, java.io.Flushable
    void flush();

    qp w(String str);

    qp write(byte[] bArr);

    qp writeByte(int i);

    qp writeInt(int i);

    qp writeShort(int i);
}
