package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class t20 extends ee2 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public t20(ns0 ns0Var) {
        super(new q20(17));
        this.c = new u20(ns0Var);
    }

    @Override // defpackage.ee2
    public final he2 a(Object obj) {
        switch (this.b) {
            case 0:
                return new he2(this, obj, obj == null, null, null, true);
            default:
                return new he2(this, obj, obj == null, (h73) this.c, null, true);
        }
    }

    @Override // defpackage.ee2
    public oo3 b() {
        switch (this.b) {
            case 0:
                return (u20) this.c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(cs0 cs0Var) {
        super(cs0Var);
        m22 m22Var = m22.u;
        this.c = m22Var;
    }
}
