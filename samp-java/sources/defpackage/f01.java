package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class f01 {
    static {
        kq kqVar = kq.i;
        zj.e("\"\\");
        zj.e("\t ,=");
    }

    public static final boolean a(ln2 ln2Var) {
        if (s51.n(ln2Var.f.b, "HEAD")) {
            return false;
        }
        int i = ln2Var.i;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && lv3.e(ln2Var) == -1 && !"chunked".equalsIgnoreCase(ln2.b(ln2Var, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.f5 r36, defpackage.i01 r37, defpackage.ux0 r38) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f01.b(f5, i01, ux0):void");
    }
}
