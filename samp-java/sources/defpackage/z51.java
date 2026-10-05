package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class z51 extends IOException {
    public boolean f;

    public static z51 a() {
        return new z51("Protocol message had invalid UTF-8.");
    }

    public static y51 b() {
        return new y51("Protocol message tag had invalid wire type.");
    }

    public static z51 c() {
        return new z51("CodedInputStream encountered a malformed varint.");
    }

    public static z51 d() {
        return new z51("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static z51 e() {
        return new z51("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
