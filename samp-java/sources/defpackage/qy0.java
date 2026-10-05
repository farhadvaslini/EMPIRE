package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qy0 extends aq1 implements f42 {
    public tm t;

    @Override // defpackage.f42
    public final Object b0(ua0 ua0Var, Object obj) {
        bp2 bp2Var = obj instanceof bp2 ? (bp2) obj : null;
        if (bp2Var == null) {
            bp2Var = new bp2();
        }
        bp2Var.c = new f60(this.t);
        return bp2Var;
    }
}
