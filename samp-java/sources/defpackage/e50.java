package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class e50 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ kb2 l;
    public final /* synthetic */ qe3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e50(kb2 kb2Var, qe3 qe3Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = kb2Var;
        this.m = qe3Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((e50) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new e50(this.l, this.m, p40Var, 0);
            case 1:
                return new e50(this.l, this.m, p40Var, 1);
            default:
                return new e50(this.l, this.m, p40Var, 2);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        qe3 qe3Var = this.m;
        kb2 kb2Var = this.l;
        y50 y50Var = y50.f;
        dm3 dm3Var = dm3.a;
        p40 p40Var = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y02.Q(obj);
                    }
                    break;
                } else {
                    y02.Q(obj);
                    this.k = 1;
                    Object objW = ur.w(new rw(kb2Var, qe3Var, p40Var, 5), this);
                    if (objW != y50Var) {
                        objW = dm3Var;
                    }
                    if (objW == y50Var) {
                    }
                }
                break;
            case 1:
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y02.Q(obj);
                    }
                    break;
                } else {
                    y02.Q(obj);
                    this.k = 1;
                    Object objT = vp.t(kb2Var, new br0(qe3Var, p40Var, i2), this);
                    if (objT != y50Var) {
                        objT = dm3Var;
                    }
                    if (objT == y50Var) {
                    }
                }
                break;
            default:
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y02.Q(obj);
                    }
                    break;
                } else {
                    y02.Q(obj);
                    this.k = 1;
                    uk1 uk1Var = new uk1(qe3Var, 0);
                    vk1 vk1Var = new vk1(qe3Var, 0);
                    vk1 vk1Var2 = new vk1(qe3Var, 1);
                    u uVar = new u(19, qe3Var);
                    float f = le0.a;
                    Object objT2 = vp.t(kb2Var, new he0(new q20(19), new ir(3, uk1Var), uVar, vk1Var2, new s(20, vk1Var), (p40) null), this);
                    if (objT2 != y50Var) {
                        objT2 = dm3Var;
                    }
                    if (objT2 != y50Var) {
                        objT2 = dm3Var;
                    }
                    if (objT2 != y50Var) {
                        objT2 = dm3Var;
                    }
                    if (objT2 == y50Var) {
                    }
                }
                break;
        }
        return dm3Var;
    }
}
