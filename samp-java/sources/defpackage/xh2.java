package defpackage;

import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class xh2 implements cs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ xh2(n82 n82Var, ot0 ot0Var, String str, e92 e92Var, d92 d92Var, os1 os1Var) {
        this.h = n82Var;
        this.j = ot0Var;
        this.g = str;
        this.k = e92Var;
        this.l = d92Var;
        this.i = os1Var;
    }

    @Override // defpackage.cs0
    public final Object a() throws PendingIntent.CanceledException {
        boolean z;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj = this.i;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                vm1.n(this.g, (x50) obj5, (os1) obj, (os1) obj4, (vi2) obj3, (vg2) obj2, "");
                break;
            case 1:
                cq2 cq2Var = (cq2) obj5;
                zq2 zq2Var = (zq2) obj;
                gq2 gq2Var = (gq2) obj4;
                Object[] objArr = (Object[]) obj2;
                boolean z2 = true;
                if (cq2Var.g != gq2Var) {
                    cq2Var.g = gq2Var;
                    z = true;
                } else {
                    z = false;
                }
                String str = cq2Var.h;
                String str2 = this.g;
                if (s51.n(str, str2)) {
                    z2 = z;
                } else {
                    cq2Var.h = str2;
                }
                cq2Var.f = zq2Var;
                cq2Var.i = obj3;
                cq2Var.j = objArr;
                fq2 fq2Var = cq2Var.k;
                if (fq2Var != null && z2) {
                    ((pi) fq2Var).S();
                    cq2Var.k = null;
                    cq2Var.b();
                }
                break;
            default:
                String str3 = ((n82) obj5).a;
                ((os1) obj).setValue(str3);
                ((ot0) obj4).h(new d82(this.g, ((e92) obj3).b, ((u82) ((d92) obj2)).a, "string", str3));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ xh2(cq2 cq2Var, zq2 zq2Var, gq2 gq2Var, String str, Object obj, Object[] objArr) {
        this.h = cq2Var;
        this.i = zq2Var;
        this.j = gq2Var;
        this.g = str;
        this.k = obj;
        this.l = objArr;
    }

    public /* synthetic */ xh2(String str, x50 x50Var, os1 os1Var, os1 os1Var2, vi2 vi2Var, vg2 vg2Var) {
        this.g = str;
        this.h = x50Var;
        this.i = os1Var;
        this.j = os1Var2;
        this.k = vi2Var;
        this.l = vg2Var;
    }
}
