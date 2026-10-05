package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xi0 extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ ij0 h;
    public final /* synthetic */ ek0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi0(ij0 ij0Var, ek0 ek0Var, int i) {
        super(1);
        this.g = i;
        this.h = ij0Var;
        this.i = ek0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.g;
        ek0 ek0Var = this.i;
        ti0 ti0Var = ti0.h;
        ij0 ij0Var = this.h;
        ti0 ti0Var2 = ti0.g;
        ti0 ti0Var3 = ti0.f;
        switch (i) {
            case 0:
                ck3 ck3Var = (ck3) obj;
                if (ck3Var.b(ti0Var3, ti0Var2)) {
                    cl0 cl0Var = ij0Var.a.a;
                    if (cl0Var == null || (r5 = cl0Var.b) == null) {
                    }
                } else if (ck3Var.b(ti0Var2, ti0Var)) {
                    cl0 cl0Var2 = ek0Var.a.a;
                    if (cl0Var2 == null || (r5 = cl0Var2.b) == null) {
                    }
                }
                break;
            default:
                ck3 ck3Var2 = (ck3) obj;
                if (ck3Var2.b(ti0Var3, ti0Var2)) {
                    kr2 kr2Var = ij0Var.a.d;
                    if (kr2Var == null || (r5 = kr2Var.c) == null) {
                    }
                } else if (ck3Var2.b(ti0Var2, ti0Var)) {
                    kr2 kr2Var2 = ek0Var.a.d;
                    if (kr2Var2 == null || (r5 = kr2Var2.c) == null) {
                    }
                }
                break;
        }
        return dj0.b;
    }
}
