package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hr2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ rs0 g;
    public final /* synthetic */ d00 h;
    public final /* synthetic */ rs0 i;
    public final /* synthetic */ rs0 j;
    public final /* synthetic */ ss1 k;
    public final /* synthetic */ rs0 l;

    public hr2(int i, rs0 rs0Var, d00 d00Var, rs0 rs0Var2, rs0 rs0Var3, ss1 ss1Var, rs0 rs0Var4) {
        this.f = i;
        this.g = rs0Var;
        this.h = d00Var;
        this.i = rs0Var2;
        this.j = rs0Var3;
        this.k = ss1Var;
        this.l = rs0Var4;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            w22.d(this.f, this.g, this.h, this.i, this.j, this.k, this.l, nv0Var, 0);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
