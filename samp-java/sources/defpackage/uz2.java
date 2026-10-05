package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class uz2 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ z32 g;

    public /* synthetic */ uz2(z32 z32Var, int i) {
        this.f = i;
        this.g = z32Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        z32 z32Var = this.g;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                z32Var.h(fFloatValue);
                break;
            default:
                z32Var.h(fFloatValue);
                break;
        }
        return dm3Var;
    }
}
