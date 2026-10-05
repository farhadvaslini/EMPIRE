package defpackage;

import android.content.Context;
import android.widget.Toast;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jk1 extends mb3 implements rs0 {
    public int j;
    public final /* synthetic */ Context k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;
    public final /* synthetic */ os1 n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;
    public final /* synthetic */ os1 q;
    public final /* synthetic */ os1 r;
    public final /* synthetic */ b42 s;
    public final /* synthetic */ os1 t;
    public final /* synthetic */ a42 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk1(Context context, String str, String str2, os1 os1Var, String str3, String str4, os1 os1Var2, os1 os1Var3, b42 b42Var, os1 os1Var4, a42 a42Var, p40 p40Var) {
        super(2, p40Var);
        this.k = context;
        this.l = str;
        this.m = str2;
        this.n = os1Var;
        this.o = str3;
        this.p = str4;
        this.q = os1Var2;
        this.r = os1Var3;
        this.s = b42Var;
        this.t = os1Var4;
        this.u = a42Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((jk1) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new jk1(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, p40Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (defpackage.uq.h(r11.n, r11.m, r11.o, r11.p, r11.q, r11.r, r11.s, r11.t, r11.u, r11) == r10) goto L15;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        int i = this.j;
        y50 y50Var = y50.f;
        if (i == 0) {
            y02.Q(obj);
            j90 j90Var = ac0.a;
            x80 x80Var = x80.h;
            hm hmVar = new hm(this.m, null, 5);
            this.j = 1;
            if (cl3.G(x80Var, hmVar, this) != y50Var) {
            }
            return y50Var;
        }
        if (i != 1) {
            if (i != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
            Toast.makeText(this.k, this.l, 0).show();
            return dm3.a;
        }
        y02.Q(obj);
        this.j = 2;
    }
}
