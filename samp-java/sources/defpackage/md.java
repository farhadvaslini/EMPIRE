package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class md extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.g = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.g;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                return new y1((l73) obj4, obj3, (zd) obj2, 1);
            default:
                h62 h62Var = (h62) obj;
                ab1 ab1VarT = h62Var.t();
                if (ab1VarT != null) {
                    boolean zM = ((en1) obj4).M();
                    c33 c33Var = ((j33) obj3).t;
                    if (zM) {
                        c33Var.k = ab1VarT;
                    } else {
                        c33Var.j = ab1VarT;
                    }
                }
                h62Var.C((i62) obj2, 0, 0, 0.0f);
                return dm3.a;
        }
    }
}
