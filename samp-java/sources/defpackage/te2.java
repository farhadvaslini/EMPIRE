package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class te2 implements ss0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public te2(af2 af2Var, boolean z) {
        this.h = af2Var;
        this.g = z;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                io ioVar = (io) obj;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= nv0Var.f(ioVar) ? 4 : 2;
                }
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    nv0Var.U();
                } else {
                    re2.a.a((af2) obj4, this.g, ioVar.a(yp1.a, f5.h), 0L, 0L, 0.0f, nv0Var, 1572864);
                }
                break;
            default:
                int iIntValue2 = ((Number) obj3).intValue();
                x43.a.b((h53) obj, null, this.g, (r43) obj4, null, null, 0.0f, 0.0f, (nv0) obj2, (iIntValue2 & 14) | 100663296);
                break;
        }
        return dm3Var;
    }

    public te2(r43 r43Var, boolean z) {
        this.g = z;
        this.h = r43Var;
    }
}
