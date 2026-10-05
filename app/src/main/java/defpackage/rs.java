package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rs implements gn0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ rs(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    @Override // defpackage.gn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, p40 p40Var) {
        qs qsVar;
        int i = this.f;
        boolean z = true;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.j;
        Object obj3 = this.g;
        Object obj4 = this.h;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                qk2 qk2Var = (qk2) obj3;
                if (p40Var instanceof qs) {
                    qsVar = (qs) p40Var;
                    int i2 = qsVar.l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        qsVar.l = i2 - Integer.MIN_VALUE;
                    } else {
                        qsVar = new qs(this, p40Var);
                    }
                }
                Object obj6 = qsVar.j;
                int i3 = qsVar.l;
                if (i3 == 0) {
                    y02.Q(obj6);
                    j61 j61Var = (j61) qk2Var.f;
                    if (j61Var != null) {
                        j61Var.c(new kt("Child of the scoped flow was cancelled"));
                        qsVar.i = obj;
                        qsVar.l = 1;
                        Object objX = j61Var.x(qsVar);
                        y50 y50Var = y50.f;
                        if (objX == y50Var) {
                        }
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    obj = qsVar.i;
                    y02.Q(obj6);
                }
                qk2Var.f = cl3.t((x50) obj4, null, new ps((ss) obj5, (gn0) obj2, obj, null), 1);
                break;
            case 1:
                sf3 sf3Var = (sf3) obj5;
                ye1 ye1Var = (ye1) obj3;
                if (((Boolean) obj).booleanValue() && ye1Var.b()) {
                    gq.Q((gg3) obj4, ye1Var, sf3Var.n(), (b11) obj2, sf3Var.b);
                } else {
                    gq.x(ye1Var);
                }
                break;
            default:
                s41 s41Var = (s41) obj;
                ok2 ok2Var = (ok2) obj5;
                ok2 ok2Var2 = (ok2) obj4;
                ok2 ok2Var3 = (ok2) obj3;
                if (s41Var instanceof zc2) {
                    ok2Var3.f++;
                } else if ((s41Var instanceof ad2) || (s41Var instanceof yc2)) {
                    ok2Var3.f--;
                } else if (s41Var instanceof zy0) {
                    ok2Var2.f++;
                } else if (s41Var instanceof az0) {
                    ok2Var2.f--;
                } else if (s41Var instanceof wo0) {
                    ok2Var.f++;
                } else if (s41Var instanceof xo0) {
                    ok2Var.f--;
                }
                boolean z2 = false;
                boolean z3 = ok2Var3.f > 0;
                boolean z4 = ok2Var2.f > 0;
                boolean z5 = ok2Var.f > 0;
                m80 m80Var = (m80) obj2;
                if (m80Var.u != z3) {
                    m80Var.u = z3;
                    z2 = true;
                }
                if (m80Var.v != z4) {
                    m80Var.v = z4;
                    z2 = true;
                }
                if (m80Var.w != z5) {
                    m80Var.w = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    vr.J(m80Var);
                }
                break;
        }
        return dm3Var;
    }
}
