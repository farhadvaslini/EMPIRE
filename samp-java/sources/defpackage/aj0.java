package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class aj0 extends u71 implements cs0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ u23 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aj0(u23 u23Var, int i) {
        super(0);
        this.g = i;
        this.h = u23Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.g;
        u23 u23Var = this.h;
        switch (i) {
            case 0:
                return u23Var;
            default:
                d42 d42Var = u23Var.b;
                Boolean bool = Boolean.FALSE;
                d42Var.setValue(bool);
                u23Var.e(false);
                wc1 wc1Var = u23Var.c;
                ((d42) wc1Var.a).setValue(bool);
                ((d42) wc1Var.c).setValue(bool);
                ((d42) wc1Var.e).setValue(bool);
                ((d42) wc1Var.g).setValue(bool);
                u23Var.f = wx.f;
                u23Var.g = 1.0f;
                u23Var.h = 1.0f;
                np3 np3Var = u23Var.l;
                if (np3Var != null) {
                    d70[] d70VarArr = np3Var.d;
                    uj.O(0, d70VarArr.length, null, d70VarArr);
                    np3Var.e = 0;
                }
                u23Var.i = wj3.b;
                u23Var.j = 0L;
                u23Var.k = 1.0f;
                return dm3.a;
        }
    }
}
