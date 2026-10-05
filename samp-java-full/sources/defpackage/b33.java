package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class b33 extends u71 implements ss0 {
    public final /* synthetic */ y23 g;
    public final /* synthetic */ gk3 h;
    public final /* synthetic */ ns0 i;
    public final /* synthetic */ c33 j;
    public final /* synthetic */ x23 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ d33 m;
    public final /* synthetic */ r03 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b33(y23 y23Var, gk3 gk3Var, ns0 ns0Var, c33 c33Var, x23 x23Var, boolean z, d33 d33Var, r03 r03Var) {
        super(3);
        this.g = y23Var;
        this.h = gk3Var;
        this.i = ns0Var;
        this.j = c33Var;
        this.k = x23Var;
        this.l = z;
        this.m = d33Var;
        this.n = r03Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        nv0 nv0Var;
        Object obj4;
        gk3 gk3VarZ;
        boolean z;
        Object obj5;
        bk3 bk3Var;
        m23 m23Var;
        Boolean bool;
        bq1 bq1Var = (bq1) obj;
        nv0 nv0Var2 = (nv0) obj2;
        ((Number) obj3).intValue();
        nv0Var2.a0(-1539505585);
        y23 y23Var = this.g;
        String str = y23Var.a;
        nv0Var2.Y(-1996110647, str);
        Object objO = nv0Var2.O();
        c33 c33Var = this.j;
        zj zjVar = c20.a;
        if (objO == zjVar) {
            n73 n73Var = c33Var.n;
            Object m23Var2 = n73Var.get(str);
            if (m23Var2 == null) {
                m23Var2 = new m23(str, c33Var);
                n73Var.put(str, m23Var2);
            }
            objO = (m23) m23Var2;
            nv0Var2.j0(objO);
        }
        m23 m23Var3 = (m23) objO;
        gk3 gk3Var = this.h;
        nv0Var2.Y(-1996106866, gk3Var);
        ns0 ns0Var = this.i;
        if (gk3Var != null) {
            u10 u10Var = gk3Var.a;
            nv0Var2.a0(-1749734647);
            String string = str.toString();
            boolean zF = nv0Var2.f(gk3Var);
            Object objO2 = nv0Var2.O();
            if (zF || objO2 == zjVar) {
                objO2 = u10Var.h();
                nv0Var2.j0(objO2);
            }
            if (gk3Var.g()) {
                objO2 = u10Var.h();
            }
            nv0Var2.a0(1498260051);
            Boolean bool2 = (Boolean) ns0Var.h(objO2);
            bool2.getClass();
            nv0Var2.p(false);
            Object value = gk3Var.d.getValue();
            nv0Var2.a0(1498260051);
            Boolean bool3 = (Boolean) ns0Var.h(value);
            bool3.getClass();
            nv0Var2.p(false);
            nv0Var = nv0Var2;
            gk3VarZ = w7.F(gk3Var, bool2, bool3, string, nv0Var, 0);
            if (gk3Var.g()) {
                nv0Var.a0(782538635);
                nv0Var.p(false);
            } else {
                nv0Var.a0(782386797);
                Object value2 = gk3Var.e.getValue();
                if (value2 == null) {
                    nv0Var.a0(782437481);
                    nv0Var.p(false);
                    bool = null;
                } else {
                    nv0Var.a0(782437482);
                    nv0Var.a0(1498260051);
                    bool = (Boolean) ns0Var.h(value2);
                    bool.getClass();
                    nv0Var.p(false);
                    nv0Var.p(false);
                }
                gk3VarZ.q(bool);
                nv0Var.p(false);
            }
            nv0Var.p(false);
            obj4 = null;
        } else {
            nv0Var = nv0Var2;
            nv0Var.a0(-1749482679);
            cl3.i(1, ns0Var);
            Boolean bool4 = (Boolean) ns0Var.h(dm3.a);
            boolean zBooleanValue = bool4.booleanValue();
            Object objO3 = nv0Var.O();
            if (objO3 == zjVar) {
                if (!m23Var3.c().isEmpty()) {
                    zBooleanValue = !zBooleanValue;
                }
                objO3 = new ps1(Boolean.valueOf(zBooleanValue));
                nv0Var.j0(objO3);
            }
            ps1 ps1Var = (ps1) objO3;
            ps1Var.c.setValue(bool4);
            obj4 = null;
            gk3VarZ = w7.Z(ps1Var, null, nv0Var, 0, 2);
            nv0Var.p(false);
        }
        gk3 gk3Var2 = gk3VarZ;
        nv0Var.Y(-1996043323, Boolean.valueOf(c33Var.a()));
        nv0 nv0Var3 = nv0Var;
        bk3 bk3VarG = w7.G(gk3Var2, rn.n1, null, nv0Var3, 0, 2);
        nv0Var3.p(false);
        boolean zF2 = nv0Var3.f(gk3Var2);
        Object objO4 = nv0Var3.O();
        if (zF2 || objO4 == zjVar) {
            z = false;
            obj5 = obj4;
            bk3Var = bk3VarG;
            objO4 = new vn(c33Var, gk3Var2, bk3Var, this.n, m23Var3.h);
            nv0Var3.j0(objO4);
        } else {
            obj5 = obj4;
            z = false;
            bk3Var = bk3VarG;
        }
        vn vnVar = (vn) objO4;
        if (!s51.n((bk3) vnVar.d.getValue(), bk3Var)) {
            vnVar.d.setValue(bk3Var);
            vnVar.h.setValue(obj5);
            vnVar.f = wn.a;
        }
        vnVar.e.setValue(this.n);
        nv0Var3.p(z);
        Object objO5 = nv0Var3.O();
        x23 x23Var = this.k;
        boolean z2 = this.l;
        d33 d33Var = this.m;
        if (objO5 == zjVar) {
            m23Var = m23Var3;
            o23 o23Var = new o23(m23Var, vnVar, x23Var, z2, d33Var, y23Var);
            nv0Var3.j0(o23Var);
            objO5 = o23Var;
        } else {
            m23Var = m23Var3;
        }
        o23 o23Var2 = (o23) objO5;
        y23Var.c.setValue(o23Var2);
        o23Var2.i.setValue(m23Var);
        o23Var2.l.setValue(Boolean.valueOf(z2));
        o23Var2.j.setValue(vnVar);
        o23Var2.k.setValue(x23Var);
        o23Var2.m.setValue(d33Var);
        z32 z32Var = o23Var2.g;
        if (z32Var.g() != 0.0f) {
            z32Var.h(0.0f);
            a42 a42Var = o23Var2.f().b.l;
            a42Var.h(a42Var.g() + 1);
        }
        o23Var2.h.setValue(Boolean.TRUE);
        o23Var2.n.setValue(y23Var);
        nv0Var3.p(z);
        bq1 bq1VarD = bq1Var.d(new j23(o23Var2));
        nv0Var3.p(z);
        return bq1VarD;
    }
}
