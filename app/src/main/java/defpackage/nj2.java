package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nj2 extends nn2 {
    public final String g;
    public final long h;
    public final ej2 i;

    public nj2(String str, long j, ej2 ej2Var) {
        this.g = str;
        this.h = j;
        this.i = ej2Var;
    }

    @Override // defpackage.nn2
    public final long b() {
        return this.h;
    }

    @Override // defpackage.nn2
    public final jn1 c() {
        String str = this.g;
        if (str != null) {
            uk2 uk2Var = jn1.c;
            try {
                return br.y(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.nn2
    public final rp f() {
        return this.i;
    }
}
