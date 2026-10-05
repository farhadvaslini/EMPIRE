package defpackage;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ja1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sa1 l;
    public final /* synthetic */ sv2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja1(sa1 sa1Var, sv2 sv2Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = sa1Var;
        this.m = sv2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((ja1) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        sv2 sv2Var = this.m;
        sa1 sa1Var = this.l;
        switch (i) {
            case 0:
                return new ja1(sa1Var, sv2Var, p40Var, 0);
            default:
                return new ja1(sa1Var, sv2Var, p40Var, 1);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        sv2 sv2Var = this.m;
        sa1 sa1Var = this.l;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var = sa1Var.c;
                    String str = (String) sa1Var.z.getValue();
                    xy2.h.getClass();
                    xy2 xy2VarM = ak2.m(str);
                    this.k = 1;
                    if (qy2Var.d(sv2Var, xy2VarM, this) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i2 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                LinkedHashSet linkedHashSet = sa1Var.J;
                String lowerCase = sv2Var.c.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                linkedHashSet.add(lowerCase);
                sa1Var.t(sv2Var);
                return dm3Var;
            default:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    return sa1.f(sa1Var, sv2Var, this) == y50Var ? y50Var : dm3Var;
                }
                if (i3 == 1) {
                    y02.Q(obj);
                    return dm3Var;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
