package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class z33 extends gq {
    public final fe2 h;
    public final d42 i = b32.w(null);

    public z33(fe2 fe2Var) {
        this.h = fe2Var;
    }

    @Override // defpackage.gq
    public final Object A(fe2 fe2Var) {
        if (fe2Var != this.h) {
            m21.c("Check failed.");
        }
        Object value = this.i.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    @Override // defpackage.gq
    public final boolean v(fe2 fe2Var) {
        return fe2Var == this.h;
    }
}
