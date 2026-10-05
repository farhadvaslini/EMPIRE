package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class l extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, Object obj3, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r1.f(r9, r8) == r7) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r1.f(r9, r8) == r7) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object q(Object obj) {
        i93 i93Var = ((oa2) this.m).o;
        rs0 rs0Var = (rs0) this.l;
        int i = this.k;
        h92 h92Var = h92.a;
        if (i == 0) {
            y02.Q(obj);
            k92 k92Var = (k92) ((os1) this.n).getValue();
            if (!s51.n(k92Var, h92Var) && !(k92Var instanceof i92)) {
                boolean z = k92Var instanceof j92;
                y50 y50Var = y50.f;
                if (z) {
                    String str = ((j92) k92Var).a;
                    this.k = 1;
                } else {
                    if (!(k92Var instanceof g92)) {
                        c.k();
                        return null;
                    }
                    String str2 = ((g92) k92Var).a;
                    this.k = 2;
                }
                return y50Var;
            }
        } else if (i == 1) {
            y02.Q(obj);
            i93Var.getClass();
            i93Var.j(null, h92Var);
        } else {
            if (i != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
            i93Var.getClass();
            i93Var.j(null, h92Var);
        }
        return dm3.a;
    }

    private final Object r(Object obj) {
        int i = this.k;
        if (i == 0) {
            y02.Q(obj);
            lf2 lf2Var = (lf2) this.l;
            if (lf2Var != null) {
                String str = (String) this.m;
                int i2 = ((cf2) this.n).a;
                this.k = 1;
                Object objB = lf2Var.b(str, i2, this);
                y50 y50Var = y50.f;
                if (objB == y50Var) {
                    return y50Var;
                }
            }
        } else {
            if (i != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        return dm3.a;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) throws Throwable {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 1:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return ((l) m((p40) obj2, (fm1) obj)).o(dm3Var);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return ((l) m((p40) obj2, (r32) obj)).o(dm3Var);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return ((l) m((p40) obj2, (jd2) obj)).o(dm3Var);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 8:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.g /* 9 */:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case vr.h /* 10 */:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 11:
                return ((l) m((p40) obj2, (gn0) obj)).o(dm3Var);
            case vr.i /* 12 */:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 13:
                return ((l) m((p40) obj2, (cs2) obj)).o(dm3Var);
            case 14:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case jo3.g /* 15 */:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 16:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 17:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 18:
                ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
                return y50.f;
            case 19:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 20:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 21:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 22:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 23:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 24:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 25:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 26:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 27:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 28:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((l) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                return new l((qr1) this.l, (yc2) this.m, (kc0) obj2, p40Var, 0);
            case 1:
                return new l((rs0) this.l, this.m, (x50) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                l lVar = new l((cs0) this.m, (rs0) obj2, p40Var, 2);
                lVar.l = obj;
                return lVar;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                l lVar2 = new l((ss0) this.m, (d6) obj2, p40Var, 3);
                lVar2.l = obj;
                return lVar2;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                l lVar3 = new l((ts0) this.m, (d6) obj2, p40Var, 4);
                lVar3.l = obj;
                return lVar3;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                l lVar4 = new l((gk3) this.m, (os1) obj2, p40Var, 5);
                lVar4.l = obj;
                return lVar4;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new l((i93) this.m, (jj3) obj2, p40Var, 6);
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return new l((wo) this.l, (ex1) this.m, (u1) obj2, p40Var, 7);
            case 8:
                l lVar5 = new l((gn0) this.m, (ls) obj2, p40Var, 8);
                lVar5.l = obj;
                return lVar5;
            case vr.g /* 9 */:
                return new l((rs0) this.l, (tw) this.m, (os1) obj2, p40Var, 9);
            case vr.h /* 10 */:
                return new l((vu) this.l, (File) this.m, (tw) obj2, p40Var, 10);
            case 11:
                l lVar6 = new l((b80) obj2, p40Var, 11);
                lVar6.m = obj;
                return lVar6;
            case vr.i /* 12 */:
                l lVar7 = new l((b80) this.m, (rs0) obj2, p40Var, 12);
                lVar7.l = obj;
                return lVar7;
            case 13:
                l lVar8 = new l((l90) this.m, (rs0) obj2, p40Var, 13);
                lVar8.l = obj;
                return lVar8;
            case 14:
                return new l((l90) this.l, (ts1) this.m, (rs0) obj2, p40Var, 14);
            case jo3.g /* 15 */:
                return new l((o50) this.l, (fn0) this.m, (jd2) obj2, p40Var, 15);
            case 16:
                return new l((qr1) this.l, (s41) this.m, (kc0) obj2, p40Var, 16);
            case 17:
                return new l((np) obj2, p40Var, 17);
            case 18:
                return new l((sm2) this.l, (Context) this.m, (c63) obj2, p40Var, 18);
            case 19:
                return new l((sa1) this.m, (kq2) obj2, p40Var, 19);
            case 20:
                l lVar9 = new l((List) this.m, (sa1) obj2, p40Var, 20);
                lVar9.l = obj;
                return lVar9;
            case 21:
                return new l((sa1) this.l, (String) this.m, (String) obj2, p40Var, 21);
            case 22:
                return new l((sa1) this.l, (String) this.m, (cs0) obj2, p40Var, 22);
            case 23:
                l lVar10 = new l((sa1) this.m, (sv2) obj2, p40Var, 23);
                lVar10.l = obj;
                return lVar10;
            case 24:
                return new l((os1) this.l, (z60) this.m, (z32) obj2, p40Var, 24);
            case 25:
                return new l((it2) this.l, (os1) this.m, (z32) obj2, p40Var, 25);
            case 26:
                return new l((y92) obj2, p40Var, 26);
            case 27:
                return new l((rs0) this.l, (oa2) this.m, (os1) obj2, p40Var, 27);
            case 28:
                return new l((lf2) this.l, (String) this.m, (cf2) obj2, p40Var, 28);
            default:
                return new l((vi2) this.l, (vg2) this.m, (os1) obj2, p40Var, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x0496, code lost:
    
        if (r1.a(r2, r19) == r8) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04a4, code lost:
    
        if (defpackage.cl3.G(r2, r5, r19) == r8) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0676, code lost:
    
        if (r0 == r10) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0745, code lost:
    
        if (r2.f(r3, r19) == r4) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x075d, code lost:
    
        if (r2.f(r5, r19) == r4) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x08d8, code lost:
    
        if (defpackage.lr.s(r1, r0, r19) == r8) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e6 A[Catch: all -> 0x03ba, TryCatch #5 {all -> 0x03ba, blocks: (B:180:0x03b4, B:190:0x03de, B:192:0x03e6, B:193:0x03f3, B:200:0x0403, B:187:0x03d0, B:202:0x0406, B:204:0x040b, B:205:0x040c, B:186:0x03cb, B:194:0x03f4, B:196:0x03fa), top: B:534:0x03a8, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0881  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v34, types: [js] */
    /* JADX WARN: Type inference failed for: r2v36, types: [np] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [js] */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r2v78 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:188:0x03da -> B:190:0x03de). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        Object objQ;
        gn0 gn0Var;
        Object objG;
        d93 d93Var;
        kp kpVar;
        Object objB;
        boolean z;
        Object objE;
        String str;
        Object qn2Var;
        Object next;
        xy2 xy2VarM;
        Object objG2;
        dt1 dt1Var;
        int i = 5;
        ?? r2 = 3;
        int i2 = 2;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i3 = 1;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        Object obj2 = null;
        Object obj3 = null;
        switch (this.j) {
            case 0:
                y50 y50Var = y50.f;
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    qr1 qr1Var = (qr1) this.l;
                    yc2 yc2Var = (yc2) this.m;
                    this.k = 1;
                    if (qr1Var.b(yc2Var, this) == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i4 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                kc0 kc0Var = (kc0) this.n;
                if (kc0Var != null) {
                    kc0Var.a();
                }
                return dm3.a;
            case 1:
                y50 y50Var2 = y50.f;
                int i5 = this.k;
                if (i5 == 0) {
                    y02.Q(obj);
                    rs0 rs0Var = (rs0) this.l;
                    Object obj4 = this.m;
                    this.k = 1;
                    if (rs0Var.f(obj4, this) == y50Var2) {
                        return y50Var2;
                    }
                } else {
                    if (i5 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                ur.o((x50) this.n, new p5());
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y50 y50Var3 = y50.f;
                int i6 = this.k;
                if (i6 == 0) {
                    y02.Q(obj);
                    x50 x50Var = (x50) this.l;
                    qk2 qk2Var = new qk2();
                    p70 p70VarB = b32.B((cs0) this.m);
                    u5 u5Var = new u5(qk2Var, x50Var, (rs0) this.n, z2 ? 1 : 0);
                    this.k = 1;
                    if (p70VarB.a(u5Var, this) == y50Var3) {
                        return y50Var3;
                    }
                } else {
                    if (i6 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                y50 y50Var4 = y50.f;
                int i7 = this.k;
                if (i7 == 0) {
                    y02.Q(obj);
                    fm1 fm1Var = (fm1) this.l;
                    ss0 ss0Var = (ss0) this.m;
                    a6 a6Var = ((d6) this.n).n;
                    this.k = 1;
                    if (ss0Var.e(a6Var, fm1Var, this) == y50Var4) {
                        return y50Var4;
                    }
                } else {
                    if (i7 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                y50 y50Var5 = y50.f;
                int i8 = this.k;
                if (i8 == 0) {
                    y02.Q(obj);
                    r32 r32Var = (r32) this.l;
                    fm1 fm1Var2 = (fm1) r32Var.f;
                    Object obj5 = r32Var.g;
                    ts0 ts0Var = (ts0) this.m;
                    a6 a6Var2 = ((d6) this.n).n;
                    this.k = 1;
                    if (ts0Var.l(a6Var2, fm1Var2, obj5, this) == y50Var5) {
                        return y50Var5;
                    }
                } else {
                    if (i8 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                gk3 gk3Var = (gk3) this.m;
                y50 y50Var6 = y50.f;
                int i9 = this.k;
                if (i9 == 0) {
                    y02.Q(obj);
                    jd2 jd2Var = (jd2) this.l;
                    p70 p70VarB2 = b32.B(new be(i3, gk3Var));
                    u5 u5Var2 = new u5(jd2Var, gk3Var, (os1) this.n, i3);
                    this.k = 1;
                    if (p70VarB2.a(u5Var2, this) == y50Var6) {
                        return y50Var6;
                    }
                } else {
                    if (i9 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                i93 i93Var = (i93) this.m;
                jj3 jj3Var = (jj3) this.n;
                y50 y50Var7 = y50.f;
                int i10 = this.k;
                try {
                } catch (Throwable th) {
                    if (!jj3Var.b()) {
                        throw th;
                    }
                    km kmVar = new km(jj3Var, null);
                    this.l = th;
                    this.k = 3;
                    if (lr.s(i93Var, kmVar, this) != y50Var7) {
                        throw th;
                    }
                }
                if (i10 == 0) {
                    y02.Q(obj);
                    Boolean bool = Boolean.TRUE;
                    i93Var.getClass();
                    i93Var.j(null, bool);
                    ts1 ts1Var = ts1.h;
                    this.k = 1;
                    if (jj3Var.c(ts1Var, this) != y50Var7) {
                    }
                    return y50Var7;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        y02.Q(obj);
                        return dm3.a;
                    }
                    if (i10 != 3) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th2 = (Throwable) this.l;
                    y02.Q(obj);
                    throw th2;
                }
                y02.Q(obj);
                if (jj3Var.b()) {
                    km kmVar2 = new km(jj3Var, null);
                    this.k = 2;
                    break;
                }
                return dm3.a;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                dm3 dm3Var = dm3.a;
                wo woVar = (wo) this.l;
                y50 y50Var8 = y50.f;
                int i11 = this.k;
                if (i11 == 0) {
                    y02.Q(obj);
                    y30 y30Var = woVar.t;
                    uo uoVar = new uo(woVar, (ex1) this.m, (u1) this.n);
                    this.k = 1;
                    y30Var.getClass();
                    jk2 jk2Var = (jk2) uoVar.a();
                    if (jk2Var == null || y30.r1(y30Var, jk2Var, 0L, 0L, 3)) {
                        objQ = dm3Var;
                        if (objQ == y50Var8) {
                            return y50Var8;
                        }
                    } else {
                        jr jrVar = new jr(1, vr.I(this));
                        jrVar.s();
                        v30 v30Var = new v30(uoVar, jrVar);
                        po poVar = y30Var.y;
                        qs1 qs1Var = poVar.a;
                        jk2 jk2Var2 = (jk2) uoVar.a();
                        if (jk2Var2 == null) {
                            jrVar.t(dm3Var);
                        } else {
                            jrVar.v(new i(11, poVar, v30Var));
                            l41 l41VarS = y02.S(0, qs1Var.h);
                            int i12 = l41VarS.f;
                            int i13 = l41VarS.g;
                            if (i12 <= i13) {
                                while (true) {
                                    jk2 jk2Var3 = (jk2) ((v30) qs1Var.f[i13]).a.a();
                                    if (jk2Var3 != null) {
                                        jk2 jk2VarE = jk2Var2.e(jk2Var3);
                                        if (jk2VarE.equals(jk2Var2)) {
                                            qs1Var.a(i13 + 1, v30Var);
                                        } else if (!jk2VarE.equals(jk2Var3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i14 = qs1Var.h - 1;
                                            if (i14 <= i13) {
                                                while (true) {
                                                    ((v30) qs1Var.f[i13]).b.C(cancellationException);
                                                    if (i14 != i13) {
                                                        i14++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i13 != i12) {
                                        i13--;
                                    }
                                }
                                if (!y30Var.B) {
                                    y30Var.s1(0L);
                                }
                            } else {
                                qs1Var.a(0, v30Var);
                                if (!y30Var.B) {
                                }
                            }
                        }
                        objQ = jrVar.q();
                        if (objQ != y50Var8) {
                        }
                        if (objQ == y50Var8) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3Var;
            case 8:
                dm3 dm3Var2 = dm3.a;
                x50 x50Var2 = (x50) this.l;
                y50 y50Var9 = y50.f;
                int i15 = this.k;
                if (i15 == 0) {
                    y02.Q(obj);
                    gn0 gn0Var2 = (gn0) this.m;
                    js jsVarG = ((ls) this.n).g(x50Var2);
                    this.l = null;
                    this.k = 1;
                    Object objB2 = ur.B(gn0Var2, jsVarG, true, this);
                    if (objB2 != y50Var9) {
                        objB2 = dm3Var2;
                    }
                    if (objB2 == y50Var9) {
                        return y50Var9;
                    }
                } else {
                    if (i15 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3Var2;
            case vr.g /* 9 */:
                gv gvVar = gv.a;
                i93 i93Var2 = ((tw) this.m).p;
                rs0 rs0Var2 = (rs0) this.l;
                y50 y50Var10 = y50.f;
                int i16 = this.k;
                if (i16 == 0) {
                    y02.Q(obj);
                    jv jvVar = (jv) ((os1) this.n).getValue();
                    if (!s51.n(jvVar, gvVar) && !(jvVar instanceof hv)) {
                        if (jvVar instanceof iv) {
                            String str2 = ((iv) jvVar).a;
                            this.k = 1;
                            break;
                        } else {
                            if (!(jvVar instanceof fv)) {
                                c.k();
                                return null;
                            }
                            String str3 = ((fv) jvVar).a;
                            this.k = 2;
                            break;
                        }
                        return y50Var10;
                    }
                } else if (i16 == 1) {
                    y02.Q(obj);
                    i93Var2.getClass();
                    i93Var2.j(null, gvVar);
                } else {
                    if (i16 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    i93Var2.getClass();
                    i93Var2.j(null, gvVar);
                }
                return dm3.a;
            case vr.h /* 10 */:
                y50 y50Var11 = y50.f;
                int i17 = this.k;
                if (i17 != 0) {
                    if (i17 == 1) {
                        y02.Q(obj);
                        return obj;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                ul2 ul2Var = new ul2();
                vu vuVar = (vu) this.l;
                File file = (File) this.m;
                tw twVar = (tw) this.n;
                this.k = 1;
                jr jrVar2 = new jr(1, vr.I(this));
                jrVar2.s();
                jrVar2.v(new va(i2, ul2Var));
                ul2Var.a(vuVar.g, file, vuVar.i, 33554432L, true, new pi(twVar, vuVar, jrVar2, i));
                Object objQ2 = jrVar2.q();
                return objQ2 == y50Var11 ? y50Var11 : objQ2;
            case 11:
                dm3 dm3Var3 = dm3.a;
                b80 b80Var = (b80) this.n;
                y50 y50Var12 = y50.f;
                int i18 = this.k;
                if (i18 == 0) {
                    y02.Q(obj);
                    gn0Var = (gn0) this.m;
                    this.m = gn0Var;
                    this.k = 1;
                    objG = cl3.G(b80Var.b.h(), new k70(b80Var, z9 ? 1 : 0, i2), this);
                    if (objG != y50Var12) {
                    }
                    return y50Var12;
                }
                if (i18 != 1) {
                    if (i18 != 2) {
                        if (i18 == 3) {
                            y02.Q(obj);
                            return dm3Var3;
                        }
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d93Var = (a70) this.l;
                    gn0Var = (gn0) this.m;
                    y02.Q(obj);
                    on0 on0Var = new on0(new p70(0, new un0(new qn0(i3, new qn0((int) (z5 ? 1 : 0), (Object) new k70(b80Var, z12 ? 1 : 0, z6 ? 1 : 0), b80Var.g.g), new l70(i2, z11 ? 1 : 0, z4 ? 1 : 0)), new pw(d93Var, z10 ? 1 : 0, i), z3 ? 1 : 0)), new m70(b80Var, (p40) null), 0);
                    this.m = null;
                    this.l = null;
                    this.k = 3;
                    if (!(gn0Var instanceof xh3)) {
                        throw ((xh3) gn0Var).f;
                    }
                    Object objA = on0Var.a(gn0Var, this);
                    if (objA != y50Var12) {
                        objA = dm3Var3;
                    }
                } else {
                    gn0Var = (gn0) this.m;
                    y02.Q(obj);
                    objG = obj;
                }
                break;
                d93 d93Var2 = (d93) objG;
                if (!(d93Var2 instanceof a70)) {
                    if (d93Var2 instanceof ul3) {
                        c.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    if (d93Var2 instanceof zi2) {
                        throw ((zi2) d93Var2).b;
                    }
                    if (!(d93Var2 instanceof km0)) {
                        if (d93Var2 instanceof ww1) {
                            c.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            return null;
                        }
                        c.k();
                        return null;
                    }
                    return dm3Var3;
                }
                a70 a70Var = (a70) d93Var2;
                Object obj6 = a70Var.b;
                this.m = gn0Var;
                this.l = a70Var;
                this.k = 2;
                if (gn0Var.k(obj6, this) != y50Var12) {
                    d93Var = d93Var2;
                    on0 on0Var2 = new on0(new p70(0, new un0(new qn0(i3, new qn0((int) (z5 ? 1 : 0), (Object) new k70(b80Var, z12 ? 1 : 0, z6 ? 1 : 0), b80Var.g.g), new l70(i2, z11 ? 1 : 0, z4 ? 1 : 0)), new pw(d93Var, z10 ? 1 : 0, i), z3 ? 1 : 0)), new m70(b80Var, (p40) null), 0);
                    this.m = null;
                    this.l = null;
                    this.k = 3;
                    if (!(gn0Var instanceof xh3)) {
                    }
                }
                return y50Var12;
            case vr.i /* 12 */:
                b80 b80Var2 = (b80) this.m;
                y50 y50Var13 = y50.f;
                int i19 = this.k;
                if (i19 != 0) {
                    if (i19 == 1) {
                        y02.Q(obj);
                        return obj;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                x50 x50Var3 = (x50) this.l;
                gz gzVarB = vr.b();
                d93 d93VarA = b80Var2.g.A();
                if (d93VarA instanceof a70) {
                    d93VarA = new ww1(((a70) d93VarA).a);
                }
                uo1 uo1Var = new uo1((rs0) this.n, gzVarB, d93VarA, x50Var3.h());
                pl plVar = b80Var2.k;
                Object objL = ((np) plVar.i).l(uo1Var);
                if (objL instanceof ts) {
                    Throwable th3 = ((ts) objL).a;
                    if (th3 == null) {
                        throw new hx("Channel was closed normally");
                    }
                    throw th3;
                }
                if (objL instanceof us) {
                    c.q("Check failed.");
                    return null;
                }
                if (((AtomicInteger) ((yl1) plVar.j).g).getAndIncrement() == 0) {
                    cl3.t((x50) plVar.g, null, new hd1(plVar, z13 ? 1 : 0, 22), 3);
                }
                this.k = 1;
                Object objE2 = gzVarB.E(this);
                return objE2 == y50Var13 ? y50Var13 : objE2;
            case 13:
                d42 d42Var = ((l90) this.m).d;
                y50 y50Var14 = y50.f;
                int i20 = this.k;
                try {
                    if (i20 == 0) {
                        y02.Q(obj);
                        cs2 cs2Var = (cs2) this.l;
                        d42Var.setValue(Boolean.TRUE);
                        rs0 rs0Var3 = (rs0) this.n;
                        this.k = 1;
                        if (rs0Var3.f(cs2Var, this) == y50Var14) {
                            return y50Var14;
                        }
                    } else {
                        if (i20 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    d42Var.setValue(Boolean.FALSE);
                    return dm3.a;
                } catch (Throwable th4) {
                    d42Var.setValue(Boolean.FALSE);
                    throw th4;
                }
            case 14:
                y50 y50Var15 = y50.f;
                int i21 = this.k;
                if (i21 == 0) {
                    y02.Q(obj);
                    l90 l90Var = (l90) this.l;
                    zs1 zs1Var = l90Var.c;
                    k90 k90Var = l90Var.b;
                    ts1 ts1Var2 = (ts1) this.m;
                    l lVar = new l(l90Var, (rs0) this.n, z14 ? 1 : 0, 13);
                    this.k = 1;
                    zs1Var.getClass();
                    if (ur.w(new ys1(ts1Var2, zs1Var, lVar, k90Var, (p40) null), this) == y50Var15) {
                        return y50Var15;
                    }
                } else {
                    if (i21 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case jo3.g /* 15 */:
                jd2 jd2Var2 = (jd2) this.n;
                fn0 fn0Var = (fn0) this.m;
                o50 o50Var = (o50) this.l;
                y50 y50Var16 = y50.f;
                int i22 = this.k;
                if (i22 == 0) {
                    y02.Q(obj);
                    if (s51.n(o50Var, li0.f)) {
                        jn0 jn0Var = new jn0(jd2Var2, 0);
                        this.k = 1;
                    } else {
                        kn0 kn0Var = new kn0(fn0Var, jd2Var2, z15 ? 1 : 0, z7 ? 1 : 0);
                        this.k = 2;
                    }
                    break;
                } else {
                    if (i22 != 1 && i22 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 16:
                y50 y50Var17 = y50.f;
                int i23 = this.k;
                if (i23 == 0) {
                    y02.Q(obj);
                    qr1 qr1Var2 = (qr1) this.l;
                    s41 s41Var = (s41) this.m;
                    this.k = 1;
                    if (qr1Var2.b(s41Var, this) == y50Var17) {
                        return y50Var17;
                    }
                } else {
                    if (i23 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                kc0 kc0Var2 = (kc0) this.n;
                if (kc0Var2 != null) {
                    kc0Var2.a();
                }
                return dm3.a;
            case 17:
                y50 y50Var18 = y50.f;
                int i24 = this.k;
                try {
                    if (i24 == 0) {
                        y02.Q(obj);
                        r2 = (np) this.n;
                        kpVar = new kp(r2);
                        this.l = r2;
                        this.m = kpVar;
                        this.k = 1;
                        objB = kpVar.b(this);
                        r2 = r2;
                        if (objB == y50Var18) {
                        }
                        if (((Boolean) objB).booleanValue()) {
                        }
                    } else {
                        if (i24 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kpVar = (kp) this.m;
                        js jsVar = (js) this.l;
                        y02.Q(obj);
                        objB = obj;
                        r2 = jsVar;
                        if (((Boolean) objB).booleanValue()) {
                            iw0.b.set(false);
                            synchronized (a73.c) {
                                js1 js1Var = a73.j.h;
                                z = js1Var != null && js1Var.h();
                            }
                            if (z) {
                                a73.a();
                            }
                            this.l = r2;
                            this.m = kpVar;
                            this.k = 1;
                            objB = kpVar.b(this);
                            r2 = r2;
                            if (objB == y50Var18) {
                                return y50Var18;
                            }
                            if (((Boolean) objB).booleanValue()) {
                                r2.c(null);
                                return dm3.a;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        CancellationException cancellationException2 = th5 instanceof CancellationException ? th5 : null;
                        if (cancellationException2 == null) {
                            cancellationException2 = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException2.initCause(th5);
                        }
                        r2.c(cancellationException2);
                        throw th6;
                    }
                }
                break;
            case 18:
                y50 y50Var19 = y50.f;
                int i25 = this.k;
                if (i25 != 0) {
                    if (i25 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    c.d();
                    return null;
                }
                y02.Q(obj);
                s23 s23Var = ((sm2) this.l).u;
                yn0 yn0Var = new yn0(4, (Context) this.m, (c63) this.n);
                this.k = 1;
                s23Var.getClass();
                s23.j(s23Var, yn0Var, this);
                return y50Var19;
            case 19:
                kq2 kq2Var = (kq2) this.n;
                sa1 sa1Var = (sa1) this.m;
                y50 y50Var20 = y50.f;
                int i26 = this.k;
                if (i26 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var = sa1Var.c;
                    this.k = 1;
                    objE = qy2Var.e(this);
                    if (objE != y50Var20) {
                    }
                    return y50Var20;
                }
                if (i26 != 1) {
                    if (i26 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) this.l;
                    y02.Q(obj);
                    str = str4;
                    Intent intentE = sa1.e(sa1Var, kq2Var, (String) sa1Var.t.getValue(), kq2Var.c, kq2Var.d, str);
                    Application application = sa1Var.b;
                    application.getClass();
                    application.startActivity(intentE);
                    return dm3.a;
                }
                y02.Q(obj);
                objE = obj;
                String str5 = (String) objE;
                y92 y92Var = sa1Var.g;
                this.l = str5;
                this.k = 2;
                if (y92Var.c(this) != y50Var20) {
                    str = str5;
                    Intent intentE2 = sa1.e(sa1Var, kq2Var, (String) sa1Var.t.getValue(), kq2Var.c, kq2Var.d, str);
                    Application application2 = sa1Var.b;
                    application2.getClass();
                    application2.startActivity(intentE2);
                    return dm3.a;
                }
                return y50Var20;
            case 20:
                x50 x50Var4 = (x50) this.l;
                y50 y50Var21 = y50.f;
                int i27 = this.k;
                if (i27 == 0) {
                    y02.Q(obj);
                    List list = (List) this.m;
                    sa1 sa1Var2 = (sa1) this.n;
                    ArrayList arrayList = new ArrayList(rx.d0(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(cl3.t(x50Var4, null, new ka1(sa1Var2, (kq2) it.next(), z16 ? 1 : 0, i3), 3));
                    }
                    this.l = null;
                    this.k = 1;
                    if (cl3.s(arrayList, this) == y50Var21) {
                        return y50Var21;
                    }
                } else {
                    if (i27 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 21:
                y50 y50Var22 = y50.f;
                int i28 = this.k;
                if (i28 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var2 = ((sa1) this.l).c;
                    String str6 = (String) this.m;
                    String str7 = (String) this.n;
                    this.k = 1;
                    if (qy2Var2.u(str6, str7, this) == y50Var22) {
                        return y50Var22;
                    }
                } else {
                    if (i28 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 22:
                y50 y50Var23 = y50.f;
                int i29 = this.k;
                if (i29 == 0) {
                    y02.Q(obj);
                    qy2 qy2Var3 = ((sa1) this.l).c;
                    String str8 = (String) this.m;
                    this.k = 1;
                    if (qy2Var3.p(str8, this) == y50Var23) {
                        return y50Var23;
                    }
                } else {
                    if (i29 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                ((cs0) this.n).a();
                return dm3.a;
            case 23:
                sv2 sv2Var = (sv2) this.n;
                sa1 sa1Var3 = (sa1) this.m;
                i93 i93Var3 = sa1Var3.r;
                y50 y50Var24 = y50.f;
                int i30 = this.k;
                p40 p40Var = null;
                try {
                    if (i30 == 0) {
                        y02.Q(obj);
                        Iterator it2 = ((Iterable) sa1Var3.j0.f.getValue()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (s51.n(((yv2) next).a.a, sv2Var)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        yv2 yv2Var = (yv2) next;
                        if (yv2Var == null || (xy2VarM = yv2Var.a.c) == null) {
                            ak2 ak2Var = xy2.h;
                            String str9 = (String) sa1Var3.z.getValue();
                            ak2Var.getClass();
                            xy2VarM = ak2.m(str9);
                        }
                        xy2 xy2Var = xy2VarM;
                        ak2 ak2Var2 = sa1Var3.j;
                        this.l = null;
                        this.k = 1;
                        ak2Var2.getClass();
                        j90 j90Var = ac0.a;
                        objG2 = cl3.G(x80.h, new rw(ak2Var2, sv2Var, xy2Var, p40Var, 8), this);
                        if (objG2 == y50Var24) {
                            return y50Var24;
                        }
                    } else {
                        if (i30 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                        objG2 = obj;
                    }
                    qn2Var = (List) objG2;
                    break;
                } catch (Throwable th7) {
                    qn2Var = new qn2(th7);
                }
                if (rn2.a(qn2Var) != null) {
                    o72 o72Var = (o72) i93Var3.getValue();
                    boolean z17 = o72Var.a;
                    sv2 sv2Var2 = o72Var.b;
                    List list2 = o72Var.c;
                    list2.getClass();
                    i93Var3.j(null, new o72(z17, sv2Var2, list2, false, true));
                }
                ni0 ni0Var = ni0.f;
                if (qn2Var instanceof qn2) {
                    qn2Var = ni0Var;
                }
                o72 o72Var2 = new o72(sv2Var, (List) qn2Var, z8 ? 1 : 0, 16);
                i93Var3.getClass();
                i93Var3.j(null, o72Var2);
                return dm3.a;
            case 24:
                y50 y50Var25 = y50.f;
                int i31 = this.k;
                if (i31 == 0) {
                    y02.Q(obj);
                    p70 p70VarB3 = b32.B(new yb((os1) this.l, 20));
                    uh1 uh1Var = new uh1((z60) this.m, (z32) this.n, null);
                    this.k = 1;
                    if (lr.s(p70VarB3, uh1Var, this) == y50Var25) {
                        return y50Var25;
                    }
                } else {
                    if (i31 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 25:
                os1 os1Var = (os1) this.m;
                y50 y50Var26 = y50.f;
                int i32 = this.k;
                if (i32 == 0) {
                    y02.Q(obj);
                    if (((List) os1Var.getValue()).size() > 1) {
                        qt1 qt1Var = (qt1) ((List) os1Var.getValue()).get(((List) os1Var.getValue()).size() - 2);
                        it2 it2Var = (it2) this.l;
                        float fG = ((z32) this.n).g();
                        this.k = 1;
                        if (it2Var.w(fG, qt1Var, this) == y50Var26) {
                            return y50Var26;
                        }
                    }
                } else {
                    if (i32 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 26:
                y92 y92Var2 = (y92) this.n;
                i93 i93Var4 = y92Var2.h;
                y50 y50Var27 = y50.f;
                int i33 = this.k;
                try {
                    try {
                        try {
                            if (i33 == 0) {
                                y02.Q(obj);
                                dt1 dt1Var2 = y92Var2.e;
                                this.l = dt1Var2;
                                this.m = y92Var2;
                                this.k = 1;
                                if (dt1Var2.f(this) == y50Var27) {
                                    return y50Var27;
                                }
                                dt1Var = dt1Var2;
                            } else {
                                if (i33 != 1) {
                                    c.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                y92Var2 = (y92) this.m;
                                dt1Var = (dt1) this.l;
                                y02.Q(obj);
                            }
                            try {
                                File file2 = y92Var2.c;
                                if (file2.isDirectory()) {
                                    File[] fileArrListFiles = file2.listFiles();
                                    if (fileArrListFiles == null) {
                                        fileArrListFiles = new File[0];
                                    }
                                    for (File file3 : fileArrListFiles) {
                                        file3.getClass();
                                        em0.W(file3);
                                    }
                                }
                                y92Var2.k();
                            } finally {
                                dt1Var.i(null);
                            }
                        } finally {
                            Boolean bool2 = Boolean.TRUE;
                            i93Var4.getClass();
                            i93Var4.j(null, bool2);
                        }
                    } catch (Exception e) {
                        Log.w("PluginRepository", "Unable to initialize plugin repository", e);
                    }
                    return dm3.a;
                } catch (CancellationException e2) {
                    throw e2;
                }
            case 27:
                return q(obj);
            case 28:
                return r(obj);
            default:
                os1 os1Var2 = (os1) this.n;
                y50 y50Var28 = y50.f;
                int i34 = this.k;
                if (i34 == 0) {
                    y02.Q(obj);
                    if (!(((mg2) os1Var2.getValue()) instanceof ig2) && !(((mg2) os1Var2.getValue()) instanceof jg2)) {
                        vi2 vi2Var = (vi2) this.l;
                        vg2 vg2Var = (vg2) this.m;
                        String str10 = vg2Var.b;
                        int i35 = vg2Var.c;
                        String str11 = vg2Var.d;
                        xy2 xy2Var2 = vg2Var.e;
                        String str12 = vg2Var.f;
                        this.k = 1;
                        if (vi2Var.g(str10, i35, str11, xy2Var2, str12, this) == y50Var28) {
                            return y50Var28;
                        }
                    }
                } else {
                    if (i34 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.n = obj;
    }
}
