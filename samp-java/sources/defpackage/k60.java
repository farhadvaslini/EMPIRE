package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k60 extends u71 implements rs0 {
    public final /* synthetic */ gk3 g;
    public final /* synthetic */ mm0 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ d00 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(gk3 gk3Var, mm0 mm0Var, Object obj, d00 d00Var) {
        super(2);
        this.g = gk3Var;
        this.h = mm0Var;
        this.i = obj;
        this.j = d00Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        Object objH;
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            bl3 bl3Var = rn.f1;
            gk3 gk3Var = this.g;
            boolean zG = gk3Var.g();
            u10 u10Var = gk3Var.a;
            zj zjVar = c20.a;
            if (zG) {
                nv0Var.a0(1666827533);
                nv0Var.p(false);
                objH = u10Var.h();
            } else {
                nv0Var.a0(1666573488);
                boolean zF = nv0Var.f(gk3Var);
                objH = nv0Var.O();
                if (zF || objH == zjVar) {
                    t63 t63VarL = jo3.l();
                    ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
                    t63 t63VarS = jo3.s(t63VarL);
                    try {
                        Object objH2 = u10Var.h();
                        jo3.v(t63VarL, t63VarS, ns0VarE);
                        nv0Var.j0(objH2);
                        objH = objH2;
                    } catch (Throwable th) {
                        jo3.v(t63VarL, t63VarS, ns0VarE);
                        throw th;
                    }
                }
                nv0Var.p(false);
            }
            nv0Var.a0(1378811975);
            Object obj3 = this.i;
            float f = s51.n(objH, obj3) ? 1.0f : 0.0f;
            nv0Var.p(false);
            Float fValueOf = Float.valueOf(f);
            boolean zF2 = nv0Var.f(gk3Var);
            Object objO = nv0Var.O();
            if (zF2 || objO == zjVar) {
                objO = b32.j(new j60(gk3Var, 0));
                nv0Var.j0(objO);
            }
            Object value = ((e93) objO).getValue();
            nv0Var.a0(1378811975);
            float f2 = s51.n(value, obj3) ? 1.0f : 0.0f;
            nv0Var.p(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zF3 = nv0Var.f(gk3Var);
            Object objO2 = nv0Var.O();
            if (zF3 || objO2 == zjVar) {
                objO2 = b32.j(new j60(gk3Var, 1));
                nv0Var.j0(objO2);
            }
            nv0Var.a0(955869654);
            nv0Var.p(false);
            ek3 ek3VarH = w7.H(gk3Var, fValueOf, fValueOf2, this.h, bl3Var, nv0Var, 0);
            boolean zF4 = nv0Var.f(ek3VarH);
            Object objO3 = nv0Var.O();
            if (zF4 || objO3 == zjVar) {
                objO3 = new kd(4, ek3VarH);
                nv0Var.j0(objO3);
            }
            bq1 bq1VarZ = vm1.z(yp1.a, (ns0) objO3);
            cn1 cn1VarD = eo.d(f5.g, false);
            int iHashCode = Long.hashCode(nv0Var.T);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarZ);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            y02.v(nv0Var, Integer.valueOf(iHashCode));
            y02.C(nv0Var);
            y02.F(f5.C, nv0Var, bq1VarM);
            this.j.e(obj3, nv0Var, 0);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
