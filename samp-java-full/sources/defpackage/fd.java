package defpackage;

import android.app.Application;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fd extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd(Object obj, Object obj2, Object obj3, Object obj4, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.n = obj;
        this.o = obj2;
        this.p = obj3;
        this.q = obj4;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((fd) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.q;
        Object obj3 = this.p;
        switch (i) {
            case 0:
                fd fdVar = new fd((js) this.n, (ed) this.o, (os1) obj3, (os1) obj2, p40Var, 0);
                fdVar.m = obj;
                return fdVar;
            case 1:
                return new fd((tw) obj3, (vu) obj2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                fd fdVar2 = new fd((at1) obj3, (ns0) obj2, p40Var, 2);
                fdVar2.o = obj;
                return fdVar2;
            default:
                return new fd((gf1) this.n, (ff1) this.o, (x50) obj3, (l) obj2, p40Var, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x033c, code lost:
    
        if (defpackage.cl3.G(r0, r2, r20) == r15) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03b3, code lost:
    
        if (defpackage.cl3.G(r0, r3, r20) == r15) goto L204;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0280 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Type inference failed for: r0v40, types: [i93, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v16, types: [p40] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, p40] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Object, p40] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, p40] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r5v23 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:214:0x0417 -> B:216:0x041b). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        x50 x50Var;
        kp it;
        Object objB;
        o50 o50VarQ;
        sw swVar;
        File file;
        String str;
        Object obj2;
        Object objE;
        ?? r11;
        File file2;
        String str2;
        Object obj3;
        Throwable thA;
        int i;
        String str3;
        Object objG;
        tw twVar;
        ?? r4;
        ?? r5;
        ?? r13;
        ?? r132;
        File file3;
        ns0 ns0Var;
        bt1 bt1Var;
        xs1 xs1Var;
        at1 at1Var;
        xs1 xs1Var2;
        Object objH;
        bt1 bt1Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        qk2 qk2Var;
        qk2 qk2Var2;
        ef1 ef1Var;
        ef1 ef1Var2;
        j61 j61Var;
        mf1 mf1Var;
        j61 j61Var2;
        mf1 mf1Var2;
        int i2 = 4;
        int i3 = 2;
        int i4 = 0;
        switch (this.j) {
            case 0:
                js jsVar = (js) this.n;
                y50 y50Var = y50.f;
                int i5 = this.k;
                if (i5 == 0) {
                    y02.Q(obj);
                    x50Var = (x50) this.m;
                    it = jsVar.iterator();
                    this.m = x50Var;
                    this.l = it;
                    this.k = 1;
                    objB = it.b(this);
                    if (objB == y50Var) {
                    }
                    if (((Boolean) objB).booleanValue()) {
                    }
                } else {
                    if (i5 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (kp) this.l;
                    x50Var = (x50) this.m;
                    y02.Q(obj);
                    objB = obj;
                    if (((Boolean) objB).booleanValue()) {
                        Object objC = it.c();
                        Object objA = vs.a(jsVar.g());
                        cl3.t(x50Var, null, new n9(objA == null ? objC : objA, (ed) this.o, (os1) this.p, (os1) this.q, null, 1), 3);
                        this.m = x50Var;
                        this.l = it;
                        this.k = 1;
                        objB = it.b(this);
                        if (objB == y50Var) {
                            return y50Var;
                        }
                        if (((Boolean) objB).booleanValue()) {
                            return dm3.a;
                        }
                    }
                }
                break;
            case 1:
                ti tiVar = ti.i;
                vu vuVar = (vu) this.q;
                tw twVar2 = (tw) this.p;
                y50 y50Var2 = y50.f;
                int i6 = this.k;
                ?? r112 = "CleoViewModel";
                ?? r133 = 5;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                if (i6 == 0) {
                    y02.Q(obj);
                    Application application = twVar2.b;
                    application.getClass();
                    file = new File(application.getCacheDir(), "cleo-" + UUID.randomUUID() + ".zip");
                    try {
                        this.l = file;
                        this.k = 1;
                        objE = tw.e(twVar2, vuVar, file, this);
                        if (objE != y50Var2) {
                            thA = rn2.a(objE);
                            if (thA != null) {
                            }
                        }
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        e = e2;
                        str = "CleoViewModel";
                        obj2 = null;
                        i4 = 0;
                        r11 = file;
                        r13 = obj2;
                        ti tiVar2 = ui.a;
                        ui.c(tiVar, str, "CLEO installation failed unexpectedly", e);
                        ?? r0 = twVar2.p;
                        Application application2 = twVar2.b;
                        application2.getClass();
                        String string = application2.getString(R.string.launcher_cleo_error_install);
                        string.getClass();
                        fv fvVar = new fv(string);
                        r0.getClass();
                        r0.j(r13, fvVar);
                        kx1 kx1Var = kx1.g;
                        j90 j90Var = ac0.a;
                        x80 x80Var = x80.h;
                        kx1Var.getClass();
                        o50 o50VarQ2 = pq.Q(kx1Var, x80Var);
                        sw swVar2 = new sw(r11, r13, i4);
                        this.l = r13;
                        this.m = r13;
                        this.n = r13;
                        this.o = r13;
                        this.k = 4;
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                        r133 = 0;
                        i3 = 5;
                        i4 = 0;
                        r112 = file;
                        kx1 kx1Var2 = kx1.g;
                        j90 j90Var2 = ac0.a;
                        x80 x80Var2 = x80.h;
                        kx1Var2.getClass();
                        o50VarQ = pq.Q(kx1Var2, x80Var2);
                        swVar = new sw(r112, r133, i4);
                        this.l = r133;
                        this.m = th;
                        this.n = r133;
                        this.o = r133;
                        this.k = i3;
                        if (cl3.G(o50VarQ, swVar, this) != y50Var2) {
                        }
                    }
                    return y50Var2;
                }
                if (i6 == 1) {
                    file = (File) this.l;
                    try {
                        y02.Q(obj);
                        objE = ((rn2) obj).f;
                        try {
                            thA = rn2.a(objE);
                            break;
                        } catch (CancellationException e3) {
                            e = e3;
                            throw e;
                        } catch (Exception e4) {
                            e = e4;
                            file2 = file;
                            str2 = "CleoViewModel";
                            obj3 = null;
                            i4 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            r112 = file;
                            r133 = 0;
                            i3 = 5;
                            i4 = 0;
                            kx1 kx1Var22 = kx1.g;
                            j90 j90Var22 = ac0.a;
                            x80 x80Var22 = x80.h;
                            kx1Var22.getClass();
                            o50VarQ = pq.Q(kx1Var22, x80Var22);
                            swVar = new sw(r112, r133, i4);
                            this.l = r133;
                            this.m = th;
                            this.n = r133;
                            this.o = r133;
                            this.k = i3;
                            if (cl3.G(o50VarQ, swVar, this) != y50Var2) {
                            }
                        }
                    } catch (CancellationException e5) {
                        e = e5;
                        throw e;
                    } catch (Exception e6) {
                        e = e6;
                        str = "CleoViewModel";
                        obj2 = null;
                        i4 = 0;
                        r11 = file;
                        r13 = obj2;
                        ti tiVar22 = ui.a;
                        ui.c(tiVar, str, "CLEO installation failed unexpectedly", e);
                        ?? r02 = twVar2.p;
                        Application application22 = twVar2.b;
                        application22.getClass();
                        String string2 = application22.getString(R.string.launcher_cleo_error_install);
                        string2.getClass();
                        fv fvVar2 = new fv(string2);
                        r02.getClass();
                        r02.j(r13, fvVar2);
                        kx1 kx1Var3 = kx1.g;
                        j90 j90Var3 = ac0.a;
                        x80 x80Var3 = x80.h;
                        kx1Var3.getClass();
                        o50 o50VarQ22 = pq.Q(kx1Var3, x80Var3);
                        sw swVar22 = new sw(r11, r13, i4);
                        this.l = r13;
                        this.m = r13;
                        this.n = r13;
                        this.o = r13;
                        this.k = 4;
                        break;
                    } catch (Throwable th4) {
                        th = th4;
                        file3 = file;
                        i3 = 5;
                        r133 = 0;
                        r112 = file3;
                        i4 = 0;
                        kx1 kx1Var222 = kx1.g;
                        j90 j90Var222 = ac0.a;
                        x80 x80Var222 = x80.h;
                        kx1Var222.getClass();
                        o50VarQ = pq.Q(kx1Var222, x80Var222);
                        swVar = new sw(r112, r133, i4);
                        this.l = r133;
                        this.m = th;
                        this.n = r133;
                        this.o = r133;
                        this.k = i3;
                        if (cl3.G(o50VarQ, swVar, this) != y50Var2) {
                        }
                        return y50Var2;
                    }
                    if (thA != null) {
                        try {
                            i93 i93Var = twVar2.p;
                            hv hvVar = new hv(ev.h, vuVar.a, i2);
                            i93Var.getClass();
                            i93Var.j(null, hvVar);
                            j90 j90Var4 = ac0.a;
                            x80 x80Var4 = x80.h;
                            r133 = 0;
                            r112 = file;
                            str3 = "CleoViewModel";
                            i4 = 0;
                            i = 5;
                            try {
                                rw rwVar = new rw(twVar2, r112, vuVar, r133, 0);
                                this.l = r112;
                                this.m = null;
                                this.n = twVar2;
                                this.o = vuVar;
                                this.k = 2;
                                objG = cl3.G(x80Var4, rwVar, this);
                                if (objG != y50Var2) {
                                    twVar = twVar2;
                                    r4 = r112;
                                    r133 = r133;
                                    tw.f(twVar, ((rn2) objG).f, vuVar);
                                    r5 = r4;
                                    r132 = r133;
                                    kx1 kx1Var4 = kx1.g;
                                    j90 j90Var5 = ac0.a;
                                    x80 x80Var5 = x80.h;
                                    kx1Var4.getClass();
                                    o50 o50VarQ3 = pq.Q(kx1Var4, x80Var5);
                                    sw swVar3 = new sw(r5, r132, i4);
                                    this.l = r132;
                                    this.m = r132;
                                    this.n = r132;
                                    this.o = r132;
                                    this.k = 3;
                                }
                            } catch (CancellationException e7) {
                                e = e7;
                                throw e;
                            } catch (Exception e8) {
                                e = e8;
                                str = str3;
                                r11 = r112;
                                r13 = r133;
                                ti tiVar222 = ui.a;
                                ui.c(tiVar, str, "CLEO installation failed unexpectedly", e);
                                ?? r022 = twVar2.p;
                                Application application222 = twVar2.b;
                                application222.getClass();
                                String string22 = application222.getString(R.string.launcher_cleo_error_install);
                                string22.getClass();
                                fv fvVar22 = new fv(string22);
                                r022.getClass();
                                r022.j(r13, fvVar22);
                                kx1 kx1Var32 = kx1.g;
                                j90 j90Var32 = ac0.a;
                                x80 x80Var32 = x80.h;
                                kx1Var32.getClass();
                                o50 o50VarQ222 = pq.Q(kx1Var32, x80Var32);
                                sw swVar222 = new sw(r11, r13, i4);
                                this.l = r13;
                                this.m = r13;
                                this.n = r13;
                                this.o = r13;
                                this.k = 4;
                            } catch (Throwable th5) {
                                th = th5;
                                i3 = i;
                                kx1 kx1Var2222 = kx1.g;
                                j90 j90Var2222 = ac0.a;
                                x80 x80Var2222 = x80.h;
                                kx1Var2222.getClass();
                                o50VarQ = pq.Q(kx1Var2222, x80Var2222);
                                swVar = new sw(r112, r133, i4);
                                this.l = r133;
                                this.m = th;
                                this.n = r133;
                                this.o = r133;
                                this.k = i3;
                                if (cl3.G(o50VarQ, swVar, this) != y50Var2) {
                                }
                                return y50Var2;
                            }
                            break;
                        } catch (CancellationException e9) {
                            e = e9;
                            i = 5;
                        } catch (Exception e10) {
                            e = e10;
                            r112 = file;
                            str3 = "CleoViewModel";
                            r133 = 0;
                            i4 = 0;
                            i = 5;
                        } catch (Throwable th6) {
                            th = th6;
                            r112 = file;
                            r133 = 0;
                            i4 = 0;
                            i = 5;
                        }
                        return y50Var2;
                    }
                    file2 = file;
                    str2 = "CleoViewModel";
                    obj3 = null;
                    i4 = 0;
                    try {
                        ti tiVar3 = ui.a;
                        ui.c(tiVar, str2, "CLEO package download failed", thA);
                        i93 i93Var2 = twVar2.p;
                        Application application3 = twVar2.b;
                        application3.getClass();
                        String string3 = application3.getString(R.string.launcher_cleo_error_download);
                        string3.getClass();
                        fv fvVar3 = new fv(string3);
                        i93Var2.getClass();
                        i93Var2.j(null, fvVar3);
                        r5 = file2;
                        r132 = obj3;
                        kx1 kx1Var42 = kx1.g;
                        j90 j90Var52 = ac0.a;
                        x80 x80Var52 = x80.h;
                        kx1Var42.getClass();
                        o50 o50VarQ32 = pq.Q(kx1Var42, x80Var52);
                        sw swVar32 = new sw(r5, r132, i4);
                        this.l = r132;
                        this.m = r132;
                        this.n = r132;
                        this.o = r132;
                        this.k = 3;
                    } catch (CancellationException e11) {
                        throw e11;
                    } catch (Exception e12) {
                        e = e12;
                        str = str2;
                        r11 = file2;
                        r13 = obj3;
                        ti tiVar2222 = ui.a;
                        ui.c(tiVar, str, "CLEO installation failed unexpectedly", e);
                        ?? r0222 = twVar2.p;
                        Application application2222 = twVar2.b;
                        application2222.getClass();
                        String string222 = application2222.getString(R.string.launcher_cleo_error_install);
                        string222.getClass();
                        fv fvVar222 = new fv(string222);
                        r0222.getClass();
                        r0222.j(r13, fvVar222);
                        kx1 kx1Var322 = kx1.g;
                        j90 j90Var322 = ac0.a;
                        x80 x80Var322 = x80.h;
                        kx1Var322.getClass();
                        o50 o50VarQ2222 = pq.Q(kx1Var322, x80Var322);
                        sw swVar2222 = new sw(r11, r13, i4);
                        this.l = r13;
                        this.m = r13;
                        this.n = r13;
                        this.o = r13;
                        this.k = 4;
                    }
                    break;
                } else {
                    if (i6 != 2) {
                        if (i6 == 3 || i6 == 4) {
                            y02.Q(obj);
                            return dm3.a;
                        }
                        if (i6 != 5) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th7 = (Throwable) this.m;
                        y02.Q(obj);
                        throw th7;
                    }
                    vuVar = (vu) this.o;
                    tw twVar3 = (tw) this.n;
                    File file4 = (File) this.l;
                    try {
                        y02.Q(obj);
                        twVar = twVar3;
                        str3 = "CleoViewModel";
                        i = 5;
                        r133 = 0;
                        i4 = 0;
                        objG = obj;
                        r4 = file4;
                    } catch (CancellationException e13) {
                        e = e13;
                        throw e;
                    } catch (Exception e14) {
                        e = e14;
                        str = "CleoViewModel";
                        i4 = 0;
                        r11 = file4;
                        r13 = 0;
                        ti tiVar22222 = ui.a;
                        ui.c(tiVar, str, "CLEO installation failed unexpectedly", e);
                        ?? r02222 = twVar2.p;
                        Application application22222 = twVar2.b;
                        application22222.getClass();
                        String string2222 = application22222.getString(R.string.launcher_cleo_error_install);
                        string2222.getClass();
                        fv fvVar2222 = new fv(string2222);
                        r02222.getClass();
                        r02222.j(r13, fvVar2222);
                        kx1 kx1Var3222 = kx1.g;
                        j90 j90Var3222 = ac0.a;
                        x80 x80Var3222 = x80.h;
                        kx1Var3222.getClass();
                        o50 o50VarQ22222 = pq.Q(kx1Var3222, x80Var3222);
                        sw swVar22222 = new sw(r11, r13, i4);
                        this.l = r13;
                        this.m = r13;
                        this.n = r13;
                        this.o = r13;
                        this.k = 4;
                        break;
                    } catch (Throwable th8) {
                        th = th8;
                        file3 = file4;
                        i3 = 5;
                        r133 = 0;
                        r112 = file3;
                        i4 = 0;
                        kx1 kx1Var22222 = kx1.g;
                        j90 j90Var22222 = ac0.a;
                        x80 x80Var22222 = x80.h;
                        kx1Var22222.getClass();
                        o50VarQ = pq.Q(kx1Var22222, x80Var22222);
                        swVar = new sw(r112, r133, i4);
                        this.l = r133;
                        this.m = th;
                        this.n = r133;
                        this.o = r133;
                        this.k = i3;
                        if (cl3.G(o50VarQ, swVar, this) != y50Var2) {
                        }
                    }
                    try {
                        tw.f(twVar, ((rn2) objG).f, vuVar);
                        r5 = r4;
                        r132 = r133;
                        kx1 kx1Var422 = kx1.g;
                        j90 j90Var522 = ac0.a;
                        x80 x80Var522 = x80.h;
                        kx1Var422.getClass();
                        o50 o50VarQ322 = pq.Q(kx1Var422, x80Var522);
                        sw swVar322 = new sw(r5, r132, i4);
                        this.l = r132;
                        this.m = r132;
                        this.n = r132;
                        this.o = r132;
                        this.k = 3;
                        break;
                    } catch (CancellationException e15) {
                        e = e15;
                        throw e;
                    } catch (Exception e16) {
                        e = e16;
                        r112 = r4;
                        str = str3;
                        r11 = r112;
                        r13 = r133;
                        ti tiVar222222 = ui.a;
                        ui.c(tiVar, str, "CLEO installation failed unexpectedly", e);
                        ?? r022222 = twVar2.p;
                        Application application222222 = twVar2.b;
                        application222222.getClass();
                        String string22222 = application222222.getString(R.string.launcher_cleo_error_install);
                        string22222.getClass();
                        fv fvVar22222 = new fv(string22222);
                        r022222.getClass();
                        r022222.j(r13, fvVar22222);
                        kx1 kx1Var32222 = kx1.g;
                        j90 j90Var32222 = ac0.a;
                        x80 x80Var32222 = x80.h;
                        kx1Var32222.getClass();
                        o50 o50VarQ222222 = pq.Q(kx1Var32222, x80Var32222);
                        sw swVar222222 = new sw(r11, r13, i4);
                        this.l = r13;
                        this.m = r13;
                        this.n = r13;
                        this.o = r13;
                        this.k = 4;
                        break;
                    } catch (Throwable th9) {
                        th = th9;
                        r112 = r4;
                        i3 = i;
                        kx1 kx1Var222222 = kx1.g;
                        j90 j90Var222222 = ac0.a;
                        x80 x80Var222222 = x80.h;
                        kx1Var222222.getClass();
                        o50VarQ = pq.Q(kx1Var222222, x80Var222222);
                        swVar = new sw(r112, r133, i4);
                        this.l = r133;
                        this.m = th;
                        this.n = r133;
                        this.o = r133;
                        this.k = i3;
                        if (cl3.G(o50VarQ, swVar, this) != y50Var2) {
                        }
                    }
                }
                kx1 kx1Var2222222 = kx1.g;
                j90 j90Var2222222 = ac0.a;
                x80 x80Var2222222 = x80.h;
                kx1Var2222222.getClass();
                o50VarQ = pq.Q(kx1Var2222222, x80Var2222222);
                swVar = new sw(r112, r133, i4);
                this.l = r133;
                this.m = th;
                this.n = r133;
                this.o = r133;
                this.k = i3;
                if (cl3.G(o50VarQ, swVar, this) != y50Var2) {
                    throw th;
                }
                return y50Var2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                at1 at1Var2 = (at1) this.p;
                y50 y50Var3 = y50.f;
                int i7 = this.k;
                try {
                    try {
                        if (i7 == 0) {
                            y02.Q(obj);
                            m50 m50VarM = ((x50) this.o).h().m(f5.b0);
                            m50VarM.getClass();
                            xs1 xs1Var3 = new xs1((j61) m50VarM);
                            AtomicReference atomicReference3 = at1Var2.a;
                            while (true) {
                                xs1 xs1Var4 = (xs1) atomicReference3.get();
                                if (xs1Var4 != null) {
                                    us1 us1Var = us1.f;
                                    if (us1Var.compareTo(us1Var) < 0) {
                                        throw new CancellationException("Current mutation had a higher priority");
                                    }
                                }
                                while (!atomicReference3.compareAndSet(xs1Var4, xs1Var3)) {
                                    if (atomicReference3.get() != xs1Var4) {
                                    }
                                    break;
                                }
                                if (xs1Var4 != null) {
                                    xs1Var4.a.c(new vs1("Mutation interrupted"));
                                }
                                dt1 dt1Var = at1Var2.b;
                                ns0Var = (ns0) this.q;
                                this.o = xs1Var3;
                                this.l = dt1Var;
                                this.m = ns0Var;
                                this.n = at1Var2;
                                this.k = 1;
                                if (dt1Var.f(this) != y50Var3) {
                                    bt1Var = dt1Var;
                                    xs1Var = xs1Var3;
                                }
                            }
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    c.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                at1Var = (at1) this.m;
                                bt1Var2 = (bt1) this.l;
                                xs1Var2 = (xs1) this.o;
                                try {
                                    y02.Q(obj);
                                    objH = obj;
                                    atomicReference2 = at1Var.a;
                                    while (!atomicReference2.compareAndSet(xs1Var2, null) && atomicReference2.get() == xs1Var2) {
                                    }
                                    ((dt1) bt1Var2).i(null);
                                    return objH;
                                } catch (Throwable th10) {
                                    th = th10;
                                    atomicReference = at1Var.a;
                                    while (!atomicReference.compareAndSet(xs1Var2, null)) {
                                    }
                                    throw th;
                                }
                            }
                            at1Var2 = (at1) this.n;
                            ns0 ns0Var2 = (ns0) this.m;
                            bt1 bt1Var3 = (bt1) this.l;
                            xs1Var = (xs1) this.o;
                            y02.Q(obj);
                            bt1Var = bt1Var3;
                            ns0Var = ns0Var2;
                        }
                        this.o = xs1Var;
                        this.l = bt1Var;
                        this.m = at1Var;
                        this.n = null;
                        this.k = 2;
                        objH = ns0Var.h(this);
                        if (objH != y50Var3) {
                            xs1Var2 = xs1Var;
                            bt1Var2 = bt1Var;
                            atomicReference2 = at1Var.a;
                            while (!atomicReference2.compareAndSet(xs1Var2, null)) {
                            }
                            ((dt1) bt1Var2).i(null);
                            return objH;
                        }
                        return y50Var3;
                    } catch (Throwable th11) {
                        th = th11;
                        xs1Var2 = xs1Var;
                        atomicReference = at1Var.a;
                        while (!atomicReference.compareAndSet(xs1Var2, null) && atomicReference.get() == xs1Var2) {
                        }
                        throw th;
                    }
                    at1Var = at1Var2;
                } catch (Throwable th12) {
                    ((dt1) 3).i(null);
                    throw th12;
                }
                break;
            default:
                dm3 dm3Var = dm3.a;
                gf1 gf1Var = (gf1) this.n;
                y50 y50Var4 = y50.f;
                int i8 = this.k;
                if (i8 == 0) {
                    y02.Q(obj);
                    if (((rf1) gf1Var).i != ff1.f) {
                        qk2 qk2Var3 = new qk2();
                        qk2 qk2Var4 = new qk2();
                        try {
                            ff1 ff1Var = (ff1) this.o;
                            x50 x50Var2 = (x50) this.p;
                            l lVar = (l) this.q;
                            this.l = qk2Var3;
                            this.m = qk2Var4;
                            this.k = 1;
                            jr jrVar = new jr(1, vr.I(this));
                            jrVar.s();
                            ef1.Companion.getClass();
                            ff1Var.getClass();
                            int iOrdinal = ff1Var.ordinal();
                            if (iOrdinal == 2) {
                                ef1Var = ef1.ON_CREATE;
                            } else if (iOrdinal == 3) {
                                ef1Var = ef1.ON_START;
                            } else if (iOrdinal != 4) {
                                ef1Var2 = null;
                                hl2 hl2Var = new hl2(ef1Var2, qk2Var3, x50Var2, cf1.a(ff1Var), jrVar, new dt1(), lVar);
                                qk2Var4.f = hl2Var;
                                gf1Var.a(hl2Var);
                                if (jrVar.q() != y50Var4) {
                                    return y50Var4;
                                }
                                qk2Var = qk2Var4;
                                qk2Var2 = qk2Var3;
                                j61Var2 = (j61) qk2Var2.f;
                                if (j61Var2 != null) {
                                }
                                mf1Var2 = (mf1) qk2Var.f;
                                if (mf1Var2 != null) {
                                }
                            } else {
                                ef1Var = ef1.ON_RESUME;
                            }
                            ef1Var2 = ef1Var;
                            hl2 hl2Var2 = new hl2(ef1Var2, qk2Var3, x50Var2, cf1.a(ff1Var), jrVar, new dt1(), lVar);
                            qk2Var4.f = hl2Var2;
                            gf1Var.a(hl2Var2);
                            if (jrVar.q() != y50Var4) {
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            qk2Var = qk2Var4;
                            qk2Var2 = qk2Var3;
                            j61Var = (j61) qk2Var2.f;
                            if (j61Var != null) {
                            }
                            mf1Var = (mf1) qk2Var.f;
                            if (mf1Var != null) {
                            }
                            throw th;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qk2Var = (qk2) this.m;
                    qk2Var2 = (qk2) this.l;
                    try {
                        y02.Q(obj);
                        j61Var2 = (j61) qk2Var2.f;
                        if (j61Var2 != null) {
                            j61Var2.c(null);
                        }
                        mf1Var2 = (mf1) qk2Var.f;
                        if (mf1Var2 != null) {
                            gf1Var.b(mf1Var2);
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        j61Var = (j61) qk2Var2.f;
                        if (j61Var != null) {
                            j61Var.c(null);
                        }
                        mf1Var = (mf1) qk2Var.f;
                        if (mf1Var != null) {
                            gf1Var.b(mf1Var);
                        }
                        throw th;
                    }
                }
                return dm3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fd(Object obj, Object obj2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.p = obj;
        this.q = obj2;
    }
}
