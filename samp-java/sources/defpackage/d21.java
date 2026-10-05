package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class d21 implements e93 {
    public Float f;
    public Float g;
    public final d42 h;
    public dd3 i;
    public boolean j;
    public boolean k;
    public long l;
    public final /* synthetic */ f21 m;

    public d21(f21 f21Var, Float f, Float f2, c21 c21Var) {
        this.m = f21Var;
        this.f = f;
        this.g = f2;
        this.h = b32.w(f);
        this.i = new dd3(c21Var, rn.f1, this.f, this.g, null);
    }

    @Override // defpackage.e93
    public final Object getValue() {
        return this.h.getValue();
    }
}
