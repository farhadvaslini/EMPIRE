package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bj0 extends u71 implements ns0 {
    public final /* synthetic */ boolean g;
    public final /* synthetic */ cs0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(boolean z, cs0 cs0Var) {
        super(1);
        this.g = z;
        this.h = cs0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        ((uw0) obj).o(!this.g && ((Boolean) this.h.a()).booleanValue());
        return dm3.a;
    }
}
