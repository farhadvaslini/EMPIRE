package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class st2 implements rs0 {
    public final /* synthetic */ boolean f;

    public st2(boolean z) {
        this.f = z;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            qt2.a.b(this.f, null, nv0Var, 3072);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
