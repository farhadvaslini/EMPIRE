package defpackage;

import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class b01 implements z73 {
    public final long f;
    public boolean g;
    public final hp h = new hp();
    public final hp i = new hp();
    public boolean j;
    public final /* synthetic */ d01 k;

    public b01(d01 d01Var, long j, boolean z) {
        this.k = d01Var;
        this.f = j;
        this.g = z;
    }

    @Override // defpackage.z73
    public final ci3 a() {
        return this.k.o;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        d01 d01Var = this.k;
        synchronized (d01Var) {
            this.j = true;
            hp hpVar = this.i;
            j = hpVar.g;
            hpVar.skip(j);
            d01Var.notifyAll();
        }
        if (j > 0) {
            d01 d01Var2 = this.k;
            TimeZone timeZone = lv3.a;
            d01Var2.g.i(j);
        }
        this.k.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc A[Catch: all -> 0x0025, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0008, B:7:0x0015, B:13:0x001f, B:47:0x00bc, B:61:0x00e2, B:62:0x00e7, B:17:0x0028, B:19:0x002e, B:21:0x0032, B:23:0x0036, B:27:0x0047, B:29:0x004b, B:31:0x0055, B:33:0x0072, B:35:0x0083, B:38:0x009a, B:41:0x00a4, B:43:0x00aa, B:44:0x00b6, B:58:0x00d8, B:59:0x00df), top: B:66:0x0008, inners: #0 }] */
    @Override // defpackage.z73
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long d(long r22, defpackage.hp r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b01.d(long, hp):long");
    }
}
