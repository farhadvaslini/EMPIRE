package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cc2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rs0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc2(rs0 rs0Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = rs0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((cc2) m((p40) obj2, (es1) obj)).o(dm3Var);
            case 1:
                return ((cc2) m((p40) obj2, (es1) obj)).o(dm3Var);
            default:
                return ((cc2) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        rs0 rs0Var = this.m;
        switch (i) {
            case 0:
                cc2 cc2Var = new cc2(rs0Var, p40Var, 0);
                cc2Var.l = obj;
                return cc2Var;
            case 1:
                cc2 cc2Var2 = new cc2(rs0Var, p40Var, 1);
                cc2Var2.l = obj;
                return cc2Var2;
            default:
                cc2 cc2Var3 = new cc2(rs0Var, p40Var, 2);
                cc2Var3.l = obj;
                return cc2Var3;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        rs0 rs0Var = this.m;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    es1 es1Var = (es1) this.l;
                    this.k = 1;
                    obj = rs0Var.f(es1Var, this);
                    if (obj == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i2 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                es1 es1Var2 = (es1) obj;
                es1Var2.getClass();
                ((AtomicBoolean) es1Var2.b.g).set(true);
                return es1Var2;
            case 1:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    es1 es1Var3 = new es1(new LinkedHashMap(((es1) this.l).a()), false);
                    this.l = es1Var3;
                    this.k = 1;
                    return rs0Var.f(es1Var3, this) == y50Var ? y50Var : es1Var3;
                }
                if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                es1 es1Var4 = (es1) this.l;
                y02.Q(obj);
                return es1Var4;
            default:
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    x50 x50Var = (x50) this.l;
                    this.k = 1;
                    if (rs0Var.f(x50Var, this) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i4 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
        }
    }
}
