package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m70 extends mb3 implements ss0 {
    public final /* synthetic */ int j = 1;
    public int k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m70(b80 b80Var, p40 p40Var) {
        super(3, p40Var);
        this.l = b80Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return new m70((b80) this.l, (p40) obj3).o(dm3Var);
            default:
                ((Boolean) obj2).getClass();
                m70 m70Var = new m70(3, (p40) obj3);
                m70Var.l = (pl0) obj;
                return m70Var.o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) throws IOException {
        int i = this.j;
        y50 y50Var = y50.f;
        p40 p40Var = null;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    b80 b80Var = (b80) this.l;
                    this.k = 1;
                    if (b80.c(b80Var, this) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i2 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            default:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    pl0 pl0Var = (pl0) this.l;
                    this.k = 1;
                    if (!pl0Var.b.get()) {
                        Object objM = lq.m(pl0Var.a, new x5(pl0Var, p40Var, 4), this);
                        return objM == y50Var ? y50Var : objM;
                    }
                    c.q("This scope has already been closed.");
                } else {
                    if (i3 == 1) {
                        y02.Q(obj);
                        return obj;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    public /* synthetic */ m70(int i, p40 p40Var) {
        super(i, p40Var);
    }
}
