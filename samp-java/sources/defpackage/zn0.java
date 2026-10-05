package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zn0 extends mb3 implements ss0 {
    public final /* synthetic */ int j;
    public gn0 k;
    public int l;
    public /* synthetic */ gn0 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ zs0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(p40 p40Var, na1 na1Var) {
        super(3, p40Var);
        this.j = 1;
        this.o = na1Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        zs0 zs0Var = this.o;
        gn0 gn0Var = (gn0) obj;
        switch (i) {
            case 0:
                zn0 zn0Var = new zn0((rs0) zs0Var, (p40) obj3, 0);
                zn0Var.m = gn0Var;
                zn0Var.n = obj2;
                return zn0Var.o(dm3Var);
            case 1:
                zn0 zn0Var2 = new zn0((p40) obj3, (na1) zs0Var);
                zn0Var2.m = gn0Var;
                zn0Var2.n = (Object[]) obj2;
                return zn0Var2.o(dm3Var);
            default:
                zn0 zn0Var3 = new zn0((ss0) zs0Var, (p40) obj3, 2);
                zn0Var3.m = gn0Var;
                zn0Var3.n = (Object[]) obj2;
                return zn0Var3.o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        Object objF;
        Object objJ;
        Object objE;
        int i = this.j;
        dm3 dm3Var = dm3.a;
        zs0 zs0Var = this.o;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                gn0 gn0Var = this.m;
                Object obj2 = this.n;
                int i2 = this.l;
                if (i2 == 0) {
                    y02.Q(obj);
                    this.m = null;
                    this.n = null;
                    this.k = gn0Var;
                    this.l = 1;
                    objF = ((rs0) zs0Var).f(obj2, this);
                    if (objF != y50Var) {
                    }
                } else if (i2 == 1) {
                    gn0Var = this.k;
                    y02.Q(obj);
                    objF = obj;
                } else if (i2 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                this.m = null;
                this.n = null;
                this.k = null;
                this.l = 2;
                if (gn0Var.k(objF, this) != y50Var) {
                }
                break;
            case 1:
                gn0 gn0Var2 = this.m;
                Object[] objArr = (Object[]) this.n;
                int i3 = this.l;
                if (i3 == 0) {
                    y02.Q(obj);
                    na1 na1Var = (na1) zs0Var;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Object obj5 = objArr[2];
                    Object obj6 = objArr[3];
                    this.m = null;
                    this.n = null;
                    this.k = gn0Var2;
                    this.l = 1;
                    objJ = na1Var.j(obj3, obj4, obj5, obj6, this);
                    if (objJ != y50Var) {
                    }
                } else if (i3 == 1) {
                    gn0Var2 = this.k;
                    y02.Q(obj);
                    objJ = obj;
                } else if (i3 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                this.m = null;
                this.n = null;
                this.k = null;
                this.l = 2;
                if (gn0Var2.k(objJ, this) != y50Var) {
                }
                break;
            default:
                gn0 gn0Var3 = this.m;
                Object[] objArr2 = (Object[]) this.n;
                int i4 = this.l;
                if (i4 == 0) {
                    y02.Q(obj);
                    Object obj7 = objArr2[0];
                    Object obj8 = objArr2[1];
                    this.m = null;
                    this.n = null;
                    this.k = gn0Var3;
                    this.l = 1;
                    objE = ((ss0) zs0Var).e(obj7, obj8, this);
                    if (objE != y50Var) {
                    }
                } else if (i4 == 1) {
                    gn0Var3 = this.k;
                    y02.Q(obj);
                    objE = obj;
                } else if (i4 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                this.m = null;
                this.n = null;
                this.k = null;
                this.l = 2;
                if (gn0Var3.k(objE, this) != y50Var) {
                }
                break;
        }
        return y50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn0(zs0 zs0Var, p40 p40Var, int i) {
        super(3, p40Var);
        this.j = i;
        this.o = zs0Var;
    }
}
