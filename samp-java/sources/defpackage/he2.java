package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class he2 {
    public final ee2 a;
    public final boolean b;
    public final h73 c;
    public final ns0 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public he2(ee2 ee2Var, Object obj, boolean z, h73 h73Var, ns0 ns0Var, boolean z2) {
        this.a = ee2Var;
        this.b = z;
        this.c = h73Var;
        this.d = ns0Var;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        e20.b("Unexpected form of a provided value");
        c.d();
        return null;
    }
}
