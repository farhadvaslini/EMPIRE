package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public interface rp extends z73, ReadableByteChannel {
    InputStream A();

    kq g(long j);

    String q(long j);

    byte readByte();

    int readInt();

    short readShort();

    int s(r02 r02Var);

    void skip(long j);

    void t(long j);

    String y(Charset charset);
}
