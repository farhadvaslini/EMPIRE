package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class b6 extends mb3 implements ss0 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(a31 a31Var, n9 n9Var, p40 p40Var) {
        super(3, p40Var);
        this.j = 0;
        this.l = a31Var;
        this.m = n9Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.j;
        int i2 = 3;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return new b6((a31) this.l, (n9) this.m, (p40) obj3).o(dm3Var);
            case 1:
                b6 b6Var = new b6(i2, (p40) obj3, 1);
                b6Var.l = (gn0) obj;
                b6Var.m = obj2;
                return b6Var.o(dm3Var);
            default:
                b6 b6Var2 = new b6(i2, (p40) obj3, 2);
                b6Var2.l = (gn0) obj;
                b6Var2.m = (Object[]) obj2;
                return b6Var2.o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) throws Throwable {
        p70 p70Var;
        int i = this.j;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y02.Q(obj);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                c6 c6Var = (c6) ((a31) this.l).g;
                n9 n9Var = (n9) this.m;
                this.k = 1;
                return n9Var.f(c6Var, this) == y50Var ? y50Var : dm3Var;
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
                gn0 gn0Var = (gn0) this.l;
                r32 r32Var = (r32) this.m;
                Map map = (Map) r32Var.f;
                if (!((Boolean) r32Var.g).booleanValue() || map.isEmpty()) {
                    p70Var = new p70(i2, ni0.f);
                } else {
                    Collection<vg2> collectionValues = map.values();
                    ArrayList arrayList = new ArrayList(rx.d0(collectionValues, 10));
                    for (vg2 vg2Var : collectionValues) {
                        arrayList.add(new qn0(vg2Var.g.f, vg2Var, 6));
                    }
                    p70Var = new p70(2, (fn0[]) qx.N0(arrayList).toArray(new fn0[0]));
                }
                this.l = null;
                this.m = null;
                this.k = 1;
                if (gn0Var instanceof xh3) {
                    throw ((xh3) gn0Var).f;
                }
                Object objA = p70Var.a(gn0Var, this);
                if (objA != y50Var) {
                    objA = dm3Var;
                }
                return objA == y50Var ? y50Var : dm3Var;
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
                gn0 gn0Var2 = (gn0) this.l;
                List listZ = uj.Z((r32[]) ((Object[]) this.m));
                this.l = null;
                this.m = null;
                this.k = 1;
                return gn0Var2.k(listZ, this) == y50Var ? y50Var : dm3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6(int i, p40 p40Var, int i2) {
        super(i, p40Var);
        this.j = i2;
    }
}
