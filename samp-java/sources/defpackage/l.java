package defpackage;

import android.content.Context;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.m
            oa2 r0 = (defpackage.oa2) r0
            i93 r0 = r0.o
            java.lang.Object r1 = r8.l
            rs0 r1 = (defpackage.rs0) r1
            int r2 = r8.k
            r3 = 0
            h92 r4 = defpackage.h92.a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L25
            if (r2 == r6) goto L21
            if (r2 != r5) goto L1b
            defpackage.y02.Q(r9)
            goto L67
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r8)
            return r3
        L21:
            defpackage.y02.Q(r9)
            goto L4f
        L25:
            defpackage.y02.Q(r9)
            java.lang.Object r9 = r8.n
            os1 r9 = (defpackage.os1) r9
            java.lang.Object r9 = r9.getValue()
            k92 r9 = (defpackage.k92) r9
            boolean r2 = defpackage.s51.n(r9, r4)
            if (r2 != 0) goto L72
            boolean r2 = r9 instanceof defpackage.i92
            if (r2 != 0) goto L72
            boolean r2 = r9 instanceof defpackage.j92
            y50 r7 = defpackage.y50.f
            if (r2 == 0) goto L56
            j92 r9 = (defpackage.j92) r9
            java.lang.String r9 = r9.a
            r8.k = r6
            java.lang.Object r8 = r1.f(r9, r8)
            if (r8 != r7) goto L4f
            goto L66
        L4f:
            r0.getClass()
            r0.j(r3, r4)
            goto L72
        L56:
            boolean r2 = r9 instanceof defpackage.g92
            if (r2 == 0) goto L6e
            g92 r9 = (defpackage.g92) r9
            java.lang.String r9 = r9.a
            r8.k = r5
            java.lang.Object r8 = r1.f(r9, r8)
            if (r8 != r7) goto L67
        L66:
            return r7
        L67:
            r0.getClass()
            r0.j(r3, r4)
            goto L72
        L6e:
            defpackage.c.k()
            return r3
        L72:
            dm3 r8 = defpackage.dm3.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.q(java.lang.Object):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.o(java.lang.Object):java.lang.Object");
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
