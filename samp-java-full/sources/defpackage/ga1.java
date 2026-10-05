package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ga1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ sa1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ga1(sa1 sa1Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = sa1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                ((ga1) m((p40) obj2, Integer.valueOf(((Number) obj).intValue()))).o(dm3Var);
                return dm3Var;
            case 1:
                ((ga1) m((p40) obj2, Integer.valueOf(((Number) obj).intValue()))).o(dm3Var);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((ga1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return ((ga1) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((ga1) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((ga1) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        sa1 sa1Var = this.l;
        switch (i) {
            case 0:
                ga1 ga1Var = new ga1(sa1Var, p40Var, 0);
                ga1Var.k = ((Number) obj).intValue();
                return ga1Var;
            case 1:
                ga1 ga1Var2 = new ga1(sa1Var, p40Var, 1);
                ga1Var2.k = ((Number) obj).intValue();
                return ga1Var2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new ga1(sa1Var, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new ga1(sa1Var, p40Var, 3);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new ga1(sa1Var, p40Var, 4);
            default:
                return new ga1(sa1Var, p40Var, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (defpackage.ur.w(r2, r9) == r5) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [p40] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v10, types: [i93] */
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
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        aa2 aa2VarO;
        ?? q92Var = 0;
        str = null;
        String str = null;
        switch (this.j) {
            case 0:
                int i = this.k;
                y02.Q(obj);
                i93 i93Var = this.l.E;
                Integer num = new Integer(i);
                i93Var.getClass();
                i93Var.j(null, num);
                return dm3.a;
            case 1:
                int i2 = this.k;
                y02.Q(obj);
                i93 i93Var2 = this.l.F;
                Integer num2 = new Integer(i2);
                i93Var2.getClass();
                i93Var2.j(null, num2);
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                sa1 sa1Var = this.l;
                y92 y92Var = sa1Var.g;
                y50 y50Var = y50.f;
                int i3 = this.k;
                try {
                    if (i3 == 0) {
                        y02.Q(obj);
                        this.k = 1;
                        if (y92Var.c(this) == y50Var) {
                            return y50Var;
                        }
                    } else {
                        if (i3 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    ?? r9 = sa1Var.i;
                    q92 q92VarD = sa1Var.h.d();
                    if (q92VarD != null) {
                        String str2 = q92VarD.d;
                        if (str2 != null && (aa2VarO = y92Var.o(str2)) != null) {
                            str = aa2VarO.c;
                        }
                        q92Var = new q92(q92VarD.a, q92VarD.b, q92VarD.c, q92VarD.d, q92VarD.e, str);
                    }
                    r9.i(q92Var);
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    ti tiVar = ui.a;
                    ui.c(ti.i, "LauncherViewModel", "Unable to restore plugin session state", e2);
                }
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                y50 y50Var2 = y50.f;
                int i4 = this.k;
                try {
                    if (i4 == 0) {
                        y02.Q(obj);
                        qy2 qy2Var = this.l.c;
                        this.k = 1;
                        if (qy2Var.g(this) == y50Var2) {
                            return y50Var2;
                        }
                    } else {
                        if (i4 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    break;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    ti tiVar2 = ui.a;
                    ui.c(ti.i, "LauncherViewModel", "Unable to migrate server settings", e4);
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                y50 y50Var3 = y50.f;
                int i5 = this.k;
                if (i5 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var2 = this.l.c;
                    this.k = 1;
                    if (qy2Var2.h(this) == y50Var3) {
                        return y50Var3;
                    }
                } else {
                    if (i5 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            default:
                sa1 sa1Var2 = this.l;
                i93 i93Var3 = sa1Var2.n;
                y50 y50Var4 = y50.f;
                int i6 = this.k;
                try {
                    if (i6 == 0) {
                        y02.Q(obj);
                        Boolean bool = Boolean.TRUE;
                        i93Var3.getClass();
                        i93Var3.j(null, bool);
                        on0 on0Var = sa1Var2.d;
                        this.k = 1;
                        obj = lr.E(on0Var, this);
                        if (obj == y50Var4) {
                        }
                        return y50Var4;
                    }
                    if (i6 != 1) {
                        if (i6 != 2) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                        Boolean bool2 = Boolean.FALSE;
                        i93Var3.getClass();
                        i93Var3.j(null, bool2);
                        return dm3.a;
                    }
                    y02.Q(obj);
                    l lVar = new l((List) obj, sa1Var2, q92Var, 20);
                    this.k = 2;
                } catch (Throwable th) {
                    Boolean bool3 = Boolean.FALSE;
                    i93Var3.getClass();
                    i93Var3.j(null, bool3);
                    throw th;
                }
                break;
        }
    }
}
