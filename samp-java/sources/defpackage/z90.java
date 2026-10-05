package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class z90 implements zq3 {
    public static final z90 b = new z90(0);
    public final /* synthetic */ int a;

    public /* synthetic */ z90(int i) {
        this.a = i;
    }

    @Override // defpackage.zq3
    public final vq3 a(Class cls) {
        switch (this.a) {
            case 0:
                return br.q(cls);
            case 1:
                return new xr0(true);
            default:
                return new fj1();
        }
    }
}
