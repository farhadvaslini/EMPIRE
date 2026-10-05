package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lz implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ xz g;

    public /* synthetic */ lz(xz xzVar, int i) {
        this.f = i;
        this.g = xzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        xz xzVar = this.g;
        switch (i) {
            case 0:
                xz.d(xzVar);
                break;
            default:
                xzVar.invalidateOptionsMenu();
                break;
        }
    }
}
