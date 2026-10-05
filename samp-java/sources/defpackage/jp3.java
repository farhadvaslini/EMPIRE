package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jp3 extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ kp3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp3(kp3 kp3Var, int i) {
        super(1);
        this.g = i;
        this.h = kp3Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        long j;
        int i = this.g;
        kp3 kp3Var = this.h;
        switch (i) {
            case 0:
                ck3 ck3Var = (ck3) obj;
                ti0 ti0Var = ti0.f;
                ti0 ti0Var2 = ti0.g;
                if (ck3Var.b(ti0Var, ti0Var2)) {
                    fk3 fk3Var = kp3Var.u.a;
                    return dj0.c;
                }
                if (!ck3Var.b(ti0Var2, ti0.h)) {
                    return dj0.c;
                }
                fk3 fk3Var2 = kp3Var.v.a;
                return dj0.c;
            default:
                int iOrdinal = ((ti0) obj).ordinal();
                if (iOrdinal == 0) {
                    fk3 fk3Var3 = kp3Var.u.a;
                    j = wx.f;
                } else if (iOrdinal == 1) {
                    fk3 fk3Var4 = kp3Var.u.a;
                    fk3 fk3Var5 = kp3Var.v.a;
                    j = wx.f;
                } else {
                    if (iOrdinal != 2) {
                        c.k();
                        return null;
                    }
                    fk3 fk3Var6 = kp3Var.v.a;
                    j = kp3Var.w.f;
                }
                return new wx(j);
        }
    }
}
