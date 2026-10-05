package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wd extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ yd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd(yd ydVar, int i) {
        super(1);
        this.g = i;
        this.h = ydVar;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.g;
        dm3 dm3Var = dm3.a;
        yd ydVar = this.h;
        switch (i) {
            case 0:
                i62 i62Var = ydVar.y;
                i62Var.getClass();
                long j = ydVar.A;
                h62.E((h62) obj, i62Var, ydVar.w.b.a((((long) i62Var.f) << 32) | (4294967295L & ((long) i62Var.g)), j, bb1.f));
                break;
            default:
                i62 i62Var2 = ydVar.x;
                i62Var2.getClass();
                long j2 = ydVar.z;
                h62.E((h62) obj, i62Var2, ydVar.w.b.a((((long) i62Var2.f) << 32) | (4294967295L & ((long) i62Var2.g)), j2, bb1.f));
                break;
        }
        return dm3Var;
    }
}
