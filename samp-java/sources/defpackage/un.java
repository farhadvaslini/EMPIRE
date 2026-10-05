package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class un extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ vn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un(vn vnVar, int i) {
        super(1);
        this.g = i;
        this.h = vnVar;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.g;
        vn vnVar = this.h;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue() == ((Boolean) vnVar.b.d.getValue()).booleanValue()) {
                    jk2 jk2Var = vnVar.j;
                    jk2Var.getClass();
                    return jk2Var;
                }
                jk2 jk2Var2 = vnVar.i;
                jk2Var2.getClass();
                return jk2Var2;
            default:
                return vnVar.f;
        }
    }
}
