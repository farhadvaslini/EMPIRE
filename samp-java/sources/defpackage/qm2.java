package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qm2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public final /* synthetic */ sm2 k;
    public final /* synthetic */ File l;
    public final /* synthetic */ File m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm2(sm2 sm2Var, File file, File file2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.k = sm2Var;
        this.l = file;
        this.m = file2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((qm2) m(p40Var, x50Var)).o(dm3Var);
                break;
            default:
                ((qm2) m(p40Var, x50Var)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new qm2(this.k, this.l, this.m, p40Var, 0);
            default:
                return new qm2(this.k, this.l, this.m, p40Var, 1);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        File file = this.m;
        File file2 = this.l;
        sm2 sm2Var = this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                sm2Var.f.b(file2, file, new pm2(sm2Var, file2, 0));
                break;
            default:
                y02.Q(obj);
                sm2Var.f.b(file2, file, new pm2(sm2Var, file2, 1));
                break;
        }
        return dm3Var;
    }
}
