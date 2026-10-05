package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l90 implements qs2 {
    public final ns0 a;
    public final k90 b = new k90(this);
    public final zs1 c = new zs1();
    public final d42 d;
    public final d42 e;
    public final d42 f;

    public l90(ns0 ns0Var) {
        this.a = ns0Var;
        Boolean bool = Boolean.FALSE;
        this.d = b32.w(bool);
        this.e = b32.w(bool);
        this.f = b32.w(bool);
    }

    @Override // defpackage.qs2
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.qs2
    public final Object d(ts1 ts1Var, rs0 rs0Var, q40 q40Var) {
        Object objW = ur.w(new l(this, ts1Var, rs0Var, null, 14), q40Var);
        return objW == y50.f ? objW : dm3.a;
    }

    @Override // defpackage.qs2
    public final float e(float f) {
        return ((Number) this.a.h(Float.valueOf(f))).floatValue();
    }
}
