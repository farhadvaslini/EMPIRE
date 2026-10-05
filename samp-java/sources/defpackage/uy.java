package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class uy extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy(Object obj, int i, Object obj2, Object obj3, p40 p40Var, int i2) {
        super(2, p40Var);
        this.j = i2;
        this.m = obj;
        this.l = i;
        this.n = obj2;
        this.o = obj3;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((uy) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.o;
        Object obj3 = this.n;
        Object obj4 = this.m;
        switch (i) {
            case 0:
                return new uy((fn0[]) obj4, this.l, (AtomicInteger) obj3, (np) obj2, p40Var, 0);
            case 1:
                return new uy((os1) obj4, this.l, (z60) obj3, (a42) obj2, p40Var, 1);
            default:
                return new uy((a42) obj4, this.l, (ns0) obj3, (os1) obj2, p40Var, 2);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.o;
        Object obj3 = this.n;
        Object obj4 = this.m;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                np npVar = (np) obj2;
                int i2 = this.k;
                try {
                    if (i2 == 0) {
                        y02.Q(obj);
                        int i3 = this.l;
                        fn0 fn0Var = ((fn0[]) obj4)[i3];
                        ty tyVar = new ty(npVar, i3);
                        this.k = 1;
                        if (fn0Var.a(tyVar, this) == y50Var) {
                            return y50Var;
                        }
                    } else {
                        if (i2 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    if (atomicInteger.decrementAndGet() != 0) {
                        return dm3Var;
                    }
                    lv2.q(npVar);
                    return dm3Var;
                } finally {
                    if (atomicInteger.decrementAndGet() == 0) {
                        lv2.q(npVar);
                    }
                }
            case 1:
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y02.Q(obj);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                p70 p70VarB = b32.B(new yb((os1) obj4, 18));
                ia1 ia1Var = new ia1(this.l, (z60) obj3, (a42) obj2, null, 2);
                this.k = 1;
                return lr.s(p70VarB, ia1Var, this) == y50Var ? y50Var : dm3Var;
            default:
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        y02.Q(obj);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                p70 p70VarB2 = b32.B(new zg1((a42) obj4, 0));
                ia1 ia1Var2 = new ia1(this.l, (ns0) obj3, (os1) obj2, null, 3);
                this.k = 1;
                return lr.s(p70VarB2, ia1Var2, this) == y50Var ? y50Var : dm3Var;
        }
    }
}
