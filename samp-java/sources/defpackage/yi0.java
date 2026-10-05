package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yi0 extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ ij0 h;
    public final /* synthetic */ ek0 i;
    public final /* synthetic */ u23 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yi0(ij0 ij0Var, ek0 ek0Var, u23 u23Var, int i) {
        super(1);
        this.g = i;
        this.h = ij0Var;
        this.i = ek0Var;
        this.j = u23Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.g;
        ij0 ij0Var = this.h;
        u23 u23Var = this.j;
        ek0 ek0Var = this.i;
        float f = 1.0f;
        switch (i) {
            case 0:
                int iOrdinal = ((ti0) obj).ordinal();
                if (iOrdinal == 0) {
                    cl0 cl0Var = ij0Var.a.a;
                    if (cl0Var != null) {
                        f = cl0Var.a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        c.k();
                        return null;
                    }
                    cl0 cl0Var2 = ek0Var.a.a;
                    f = cl0Var2 != null ? cl0Var2.a : u23Var.g;
                }
                return Float.valueOf(f);
            default:
                int iOrdinal2 = ((ti0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    kr2 kr2Var = ij0Var.a.d;
                    if (kr2Var != null) {
                        f = kr2Var.a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        c.k();
                        return null;
                    }
                    kr2 kr2Var2 = ek0Var.a.d;
                    f = kr2Var2 != null ? kr2Var2.a : u23Var.h;
                }
                return Float.valueOf(f);
        }
    }
}
