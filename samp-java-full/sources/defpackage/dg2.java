package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dg2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ lf2 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ os1 p;
    public final /* synthetic */ os1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg2(lf2 lf2Var, String str, String str2, String str3, os1 os1Var, os1 os1Var2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = lf2Var;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.p = os1Var;
        this.q = os1Var2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((dg2) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new dg2(this.l, this.m, this.n, this.o, this.p, this.q, p40Var, 0);
            default:
                return new dg2(this.l, this.m, this.n, this.o, this.p, this.q, p40Var, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Object objA;
        int i = this.j;
        os1 os1Var = this.q;
        y50 y50Var = y50.f;
        os1 os1Var2 = this.p;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    lf2 lf2Var = this.l;
                    if (lf2Var != null) {
                        cf2 cf2Var = (cf2) os1Var2.getValue();
                        String str = this.m;
                        String str2 = this.n;
                        String str3 = this.o;
                        if (cf2Var != null) {
                            int i3 = cf2Var.a;
                            this.k = 1;
                            if (lf2Var.d(str, i3, str2, str3, this) == y50Var) {
                                return y50Var;
                            }
                        } else {
                            this.k = 2;
                            if (lf2Var.a(str, str2, str3, this) == y50Var) {
                                return y50Var;
                            }
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                os1Var.setValue(Boolean.FALSE);
                os1Var2.setValue(null);
                return dm3Var;
            default:
                int i4 = this.k;
                String str4 = this.o;
                String str5 = this.n;
                lf2 lf2Var2 = this.l;
                String str6 = this.m;
                if (i4 == 0) {
                    y02.Q(obj);
                    List list = p03.a;
                    if (((cf2) os1Var2.getValue()) != null) {
                        cf2 cf2Var2 = (cf2) os1Var2.getValue();
                        cf2Var2.getClass();
                        int i5 = cf2Var2.a;
                        this.k = 1;
                        if (lf2Var2.b(str6, i5, this) == y50Var) {
                            return y50Var;
                        }
                        this.k = 2;
                        if (lf2Var2.a(str6, str5, str4, this) == y50Var) {
                        }
                        List list2 = p03.a;
                        os1Var.setValue(Boolean.FALSE);
                        os1Var2.setValue(null);
                    } else {
                        this.k = 3;
                        objA = lf2Var2.a(str6, str5, str4, this);
                        if (objA == y50Var) {
                            return y50Var;
                        }
                        if (((Boolean) objA).booleanValue()) {
                        }
                    }
                } else if (i4 == 1) {
                    y02.Q(obj);
                    this.k = 2;
                    if (lf2Var2.a(str6, str5, str4, this) == y50Var) {
                        return y50Var;
                    }
                    List list22 = p03.a;
                    os1Var.setValue(Boolean.FALSE);
                    os1Var2.setValue(null);
                } else if (i4 == 2) {
                    y02.Q(obj);
                    List list222 = p03.a;
                    os1Var.setValue(Boolean.FALSE);
                    os1Var2.setValue(null);
                } else {
                    if (i4 != 3) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    objA = obj;
                    if (((Boolean) objA).booleanValue()) {
                        List list2222 = p03.a;
                        os1Var.setValue(Boolean.FALSE);
                        os1Var2.setValue(null);
                    }
                }
                return dm3Var;
        }
    }
}
