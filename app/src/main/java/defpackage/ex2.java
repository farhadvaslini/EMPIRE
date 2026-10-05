package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ex2 implements gn0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ gn0 g;
    public final /* synthetic */ qy2 h;

    public /* synthetic */ ex2(gn0 gn0Var, qy2 qy2Var, int i) {
        this.f = i;
        this.g = gn0Var;
        this.h = qy2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // defpackage.gn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, p40 p40Var) {
        dx2 dx2Var;
        sx2 sx2Var;
        int iH;
        dy2 dy2Var;
        int i = this.f;
        qy2 qy2Var = this.h;
        dm3 dm3Var = dm3.a;
        gn0 gn0Var = this.g;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                if (p40Var instanceof dx2) {
                    dx2Var = (dx2) p40Var;
                    int i2 = dx2Var.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        dx2Var.j = i2 - Integer.MIN_VALUE;
                    } else {
                        dx2Var = new dx2(this, p40Var);
                    }
                }
                Object obj2 = dx2Var.i;
                int i3 = dx2Var.j;
                if (i3 == 0) {
                    y02.Q(obj2);
                    String str = (String) ((es1) obj).c(qy2.w);
                    if (str == null) {
                        str = "";
                    }
                    int i4 = 2;
                    List listL = pv2.L(new bm0(i4, pv2.J(new vj(4, str), new vw2(1, this.h, qy2.class, "decodeServer", "decodeServer(Ljava/lang/String;)Ltop/th1nk/samp/core/config/SavedServer;", 0, 0, 4)), new up0(20)));
                    dx2Var.j = 1;
                    if (gn0Var.k(listL, dx2Var) == y50Var) {
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj2);
                }
                break;
            case 1:
                if (p40Var instanceof sx2) {
                    sx2Var = (sx2) p40Var;
                    int i5 = sx2Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        sx2Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        sx2Var = new sx2(this, p40Var);
                    }
                }
                Object obj3 = sx2Var.i;
                int i6 = sx2Var.j;
                if (i6 == 0) {
                    y02.Q(obj3);
                    int iIntValue = ((Number) obj).intValue();
                    if (iIntValue == 0) {
                        Context context = qy2Var.a;
                        context.getClass();
                        iH = n32.h(context);
                    } else {
                        iH = y02.h(iIntValue, 8, 16);
                    }
                    Integer num = new Integer(iH);
                    sx2Var.j = 1;
                    if (gn0Var.k(num, sx2Var) == y50Var) {
                    }
                } else if (i6 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj3);
                }
                break;
            default:
                if (p40Var instanceof dy2) {
                    dy2Var = (dy2) p40Var;
                    int i7 = dy2Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        dy2Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        dy2Var = new dy2(this, p40Var);
                    }
                }
                Object obj4 = dy2Var.i;
                int i8 = dy2Var.j;
                if (i8 == 0) {
                    y02.Q(obj4);
                    Map mapA = qy2.a(qy2Var, (String) ((es1) obj).c(qy2.y));
                    dy2Var.j = 1;
                    if (gn0Var.k(mapA, dy2Var) == y50Var) {
                    }
                } else if (i8 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj4);
                }
                break;
        }
        return y50Var;
    }
}
