package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class c50 implements cn1 {
    public final /* synthetic */ ye1 a;
    public final /* synthetic */ sf3 b;
    public final /* synthetic */ hs3 c;
    public final /* synthetic */ x50 d;
    public final /* synthetic */ ns0 e;
    public final /* synthetic */ bg3 f;
    public final /* synthetic */ iy1 g;
    public final /* synthetic */ ua0 h;
    public final /* synthetic */ so i;
    public final /* synthetic */ int j;

    public c50(ye1 ye1Var, sf3 sf3Var, hs3 hs3Var, x50 x50Var, ns0 ns0Var, bg3 bg3Var, iy1 iy1Var, ua0 ua0Var, so soVar, int i) {
        this.a = ye1Var;
        this.b = sf3Var;
        this.c = hs3Var;
        this.d = x50Var;
        this.e = ns0Var;
        this.f = bg3Var;
        this.g = iy1Var;
        this.h = ua0Var;
        this.i = soVar;
        this.j = i;
    }

    @Override // defpackage.cn1
    public final int b(k51 k51Var, List list, int i) {
        ye1 ye1Var = this.a;
        ye1Var.a.a(k51Var.getLayoutDirection());
        qk qkVar = (qk) ye1Var.a.g;
        if (qkVar != null) {
            return w22.j(qkVar.c());
        }
        c.q("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    @Override // defpackage.cn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dn1 c(defpackage.en1 r29, java.util.List r30, long r31) {
        /*
            Method dump skipped, instruction units count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c50.c(en1, java.util.List, long):dn1");
    }
}
