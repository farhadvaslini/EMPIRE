package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ld extends u71 implements rs0 {
    public final /* synthetic */ int g = 1;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(d00 d00Var, int i) {
        super(2);
        this.h = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.g;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                ti0 ti0Var = (ti0) obj;
                ti0 ti0Var2 = (ti0) obj2;
                ti0 ti0Var3 = ti0.h;
                return Boolean.valueOf(ti0Var == ti0Var3 && ti0Var2 == ti0Var3 && !((ek0) obj3).a.e);
            default:
                ((Number) obj2).intValue();
                h33.b((d00) obj3, (nv0) obj, jo3.y(7));
                return dm3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(ek0 ek0Var) {
        super(2);
        this.h = ek0Var;
    }
}
