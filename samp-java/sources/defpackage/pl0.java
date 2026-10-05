package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class pl0 implements cx {
    public final File a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public pl0(File file) {
        this.a = file;
    }

    @Override // defpackage.cx
    public final void close() {
        this.b.set(true);
    }
}
