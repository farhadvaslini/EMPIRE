package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class p70 implements fn0 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ p70(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.fn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gn0 gn0Var, p40 p40Var) throws Throwable {
        ah2 ah2Var;
        z zVar;
        kp2 kp2Var;
        Throwable th;
        int i = this.f;
        p40 p40Var2 = null;
        Object obj = this.g;
        y50 y50Var = y50.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                Object objA = ((un0) obj).a(new o70(gn0Var, 0), p40Var);
                return objA == y50Var ? objA : dm3Var;
            case 1:
                Object objK = gn0Var.k((Serializable) obj, p40Var);
                return objK == y50Var ? objK : dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                if (p40Var instanceof ah2) {
                    ah2Var = (ah2) p40Var;
                    int i2 = ah2Var.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ah2Var.j = i2 - Integer.MIN_VALUE;
                    } else {
                        ah2Var = new ah2(this, p40Var);
                    }
                }
                Object obj2 = ah2Var.i;
                int i3 = ah2Var.j;
                if (i3 == 0) {
                    y02.Q(obj2);
                    fn0[] fn0VarArr = (fn0[]) obj;
                    int i4 = 3;
                    p90 p90Var = new p90(i4, fn0VarArr);
                    b6 b6Var = new b6(i4, p40Var2, 2);
                    ah2Var.j = 1;
                    if (uq.m(ah2Var, gn0Var, p90Var, b6Var, fn0VarArr) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i3 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj2);
                }
                return dm3Var;
            default:
                if (p40Var instanceof z) {
                    zVar = (z) p40Var;
                    int i5 = zVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        zVar.l = i5 - Integer.MIN_VALUE;
                    } else {
                        zVar = new z(this, p40Var);
                    }
                }
                Object obj3 = zVar.j;
                int i6 = zVar.l;
                if (i6 != 0) {
                    if (i6 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kp2Var = zVar.i;
                    try {
                        y02.Q(obj3);
                        kp2Var.p();
                        return dm3Var;
                    } catch (Throwable th2) {
                        th = th2;
                        kp2Var.p();
                        throw th;
                    }
                }
                y02.Q(obj3);
                o50 o50Var = zVar.g;
                o50Var.getClass();
                kp2 kp2Var2 = new kp2(gn0Var, o50Var);
                try {
                    zVar.i = kp2Var2;
                    zVar.l = 1;
                    Object objF = ((rs0) obj).f(kp2Var2, zVar);
                    if (objF != y50Var) {
                        objF = dm3Var;
                    }
                    if (objF == y50Var) {
                        return y50Var;
                    }
                    kp2Var = kp2Var2;
                    kp2Var.p();
                    return dm3Var;
                } catch (Throwable th3) {
                    kp2Var = kp2Var2;
                    th = th3;
                    kp2Var.p();
                    throw th;
                }
        }
    }
}
