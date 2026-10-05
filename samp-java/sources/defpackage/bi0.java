package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bi0 {
    public int a = 1;
    public final bp1 b;
    public bp1 c;
    public bp1 d;
    public int e;
    public int f;

    public bi0(bp1 bp1Var) {
        this.b = bp1Var;
        this.c = bp1Var;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        zo1 zo1VarB = this.c.b.b();
        int iA = zo1VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) zo1VarB.i).get(iA + zo1VarB.f) == 0) || this.e == 65039;
    }
}
