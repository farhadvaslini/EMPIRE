package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xd extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ yd h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xd(yd ydVar, long j, int i) {
        super(1);
        this.g = i;
        this.h = ydVar;
        this.i = j;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        mm0 mm0Var;
        int i = this.g;
        long j = this.i;
        yd ydVar = this.h;
        switch (i) {
            case 0:
                ck3 ck3Var = (ck3) obj;
                if (!s51.n(ck3Var.a(), ydVar.w.a())) {
                    e93 e93Var = (e93) ydVar.w.d.g(ck3Var.a());
                    j = e93Var != null ? ((p41) e93Var.getValue()).a : 0L;
                } else if (!p41.b(ydVar.D, -9223372034707292160L)) {
                    j = ydVar.D;
                }
                e93 e93Var2 = (e93) ydVar.w.d.g(ck3Var.c());
                j = e93Var2 != null ? ((p41) e93Var2.getValue()).a : 0L;
                l43 l43Var = (l43) ydVar.v.getValue();
                return (l43Var == null || (mm0Var = (mm0) l43Var.a.f(new p41(j), new p41(j))) == null) ? n92.F(0.0f, 400.0f, null, 5) : mm0Var;
            default:
                if (s51.n(obj, ydVar.w.a())) {
                    j = p41.b(ydVar.D, -9223372034707292160L) ? j : ydVar.D;
                } else {
                    e93 e93Var3 = (e93) ydVar.w.d.g(obj);
                    if (e93Var3 != null) {
                        j = ((p41) e93Var3.getValue()).a;
                    }
                }
                return new p41(j);
        }
    }
}
