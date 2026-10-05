package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class tv implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cd0 g;

    public /* synthetic */ tv(cd0 cd0Var, int i) {
        this.f = i;
        this.g = cd0Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        cd0 cd0Var = this.g;
        switch (i) {
            case 0:
                long j = cd0Var.b;
                return Float.valueOf(j > 0 ? y02.g(cd0Var.a / j, 0.0f, 1.0f) : 0.0f);
            default:
                long j2 = cd0Var.b;
                return Float.valueOf(j2 > 0 ? cd0Var.a / j2 : 0.0f);
        }
    }
}
