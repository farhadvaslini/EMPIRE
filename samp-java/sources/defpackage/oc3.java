package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class oc3 implements ss0 {
    public final /* synthetic */ int f;

    public oc3(int i) {
        this.f = i;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        qc3 qc3Var = (qc3) obj;
        nv0 nv0Var = (nv0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? nv0Var.f(qc3Var) : nv0Var.h(qc3Var) ? 4 : 2;
        }
        if (nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            m22 m22Var = m22.v;
            qc3Var.getClass();
            m22Var.j(Float.NaN, 0.0f, 196656, 0L, nv0Var, new dc3(qc3Var.a, this.f, qc3Var.b), null);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
