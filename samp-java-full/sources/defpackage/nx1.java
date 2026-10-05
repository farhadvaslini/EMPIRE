package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class nx1 {
    public final ws2 a;
    public final rs0 b;
    public ua0 c;
    public boolean d;
    public final a31 e = new a31(10);

    public nx1(ws2 ws2Var, rs0 rs0Var, ua0 ua0Var) {
        this.a = ws2Var;
        this.b = rs0Var;
        this.c = ua0Var;
    }

    public static void a(za2 za2Var) {
        List list = za2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((gb2) list.get(i)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(rs0 rs0Var, q40 q40Var) {
        mx1 mx1Var;
        if (q40Var instanceof mx1) {
            mx1Var = (mx1) q40Var;
            int i = mx1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mx1Var.k = i - Integer.MIN_VALUE;
            } else {
                mx1Var = new mx1(this, q40Var);
            }
        }
        Object obj = mx1Var.i;
        int i2 = mx1Var.k;
        p40 p40Var = null;
        if (i2 == 0) {
            y02.Q(obj);
            this.d = true;
            hd1 hd1Var = new hd1(this, rs0Var, p40Var, 8);
            mx1Var.k = 1;
            o50 o50Var = mx1Var.g;
            o50Var.getClass();
            wa3 wa3Var = new wa3(mx1Var, o50Var);
            Object objC = b32.C(wa3Var, true, wa3Var, hd1Var);
            y50 y50Var = y50.f;
            if (objC == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        this.d = false;
        return dm3.a;
    }
}
