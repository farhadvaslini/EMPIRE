package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yl3 {
    public ar2 a;
    public ar2 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(bg3 bg3Var) {
        ar2 ar2Var;
        af afVar = bg3Var.a;
        this.e = false;
        ar2 ar2Var2 = this.a;
        if (bg3Var.equals(ar2Var2 != null ? (bg3) ar2Var2.h : null)) {
            return;
        }
        String str = afVar.g;
        ar2 ar2Var3 = this.a;
        boolean zN = s51.n(str, ar2Var3 != null ? ((bg3) ar2Var3.h).a.g : null);
        ar2 ar2Var4 = this.a;
        if (zN) {
            if (ar2Var4 != null) {
                ar2Var4.h = bg3Var;
                return;
            }
            return;
        }
        this.a = new ar2(4, ar2Var4, bg3Var);
        this.b = null;
        int length = afVar.g.length() + this.c;
        this.c = length;
        if (length > 100000) {
            ar2 ar2Var5 = this.a;
            if ((ar2Var5 != null ? (ar2) ar2Var5.g : null) == null) {
                return;
            }
            while (true) {
                if (ar2Var5 == null) {
                    ar2Var = null;
                } else {
                    ar2 ar2Var6 = (ar2) ar2Var5.g;
                    if (ar2Var6 != null) {
                        ar2Var = (ar2) ar2Var6.g;
                    }
                }
                if (ar2Var == null) {
                    break;
                } else {
                    ar2Var5 = (ar2) ar2Var5.g;
                }
            }
            if (ar2Var5 != null) {
                ar2Var5.g = null;
            }
        }
    }
}
