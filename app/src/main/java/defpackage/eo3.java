package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class eo3 extends mb3 implements rs0 {
    public boolean j;
    public dn3 k;
    public String l;
    public cn3 m;
    public int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ go3 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo3(boolean z, go3 go3Var, p40 p40Var) {
        super(2, p40Var);
        this.o = z;
        this.p = go3Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((eo3) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new eo3(this.o, this.p, p40Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (((java.lang.Boolean) r11).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b A[Catch: Exception -> 0x0037, CancellationException -> 0x0180, PHI: r11 r15
      0x009b: PHI (r11v13 boolean) = (r11v11 boolean), (r11v14 boolean) binds: [B:29:0x0097, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r15v2 java.lang.Object) = (r15v1 java.lang.Object), (r15v8 java.lang.Object) binds: [B:29:0x0097, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {CancellationException -> 0x0180, blocks: (B:7:0x002b, B:63:0x010d, B:65:0x0117, B:68:0x0133, B:10:0x003c, B:13:0x0042, B:31:0x009b, B:33:0x009f, B:35:0x00a6, B:38:0x00ab, B:40:0x00b0, B:42:0x00b8, B:45:0x00c7, B:47:0x00d4, B:70:0x0157, B:72:0x0160, B:50:0x00dc, B:55:0x00e9, B:57:0x00ef, B:59:0x00f7, B:53:0x00e3, B:14:0x004c, B:28:0x0086, B:15:0x0052, B:22:0x0067, B:25:0x0073, B:19:0x005d), top: B:80:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[Catch: Exception -> 0x0037, CancellationException -> 0x0180, TryCatch #0 {CancellationException -> 0x0180, blocks: (B:7:0x002b, B:63:0x010d, B:65:0x0117, B:68:0x0133, B:10:0x003c, B:13:0x0042, B:31:0x009b, B:33:0x009f, B:35:0x00a6, B:38:0x00ab, B:40:0x00b0, B:42:0x00b8, B:45:0x00c7, B:47:0x00d4, B:70:0x0157, B:72:0x0160, B:50:0x00dc, B:55:0x00e9, B:57:0x00ef, B:59:0x00f7, B:53:0x00e3, B:14:0x004c, B:28:0x0086, B:15:0x0052, B:22:0x0067, B:25:0x0073, B:19:0x005d), top: B:80:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[Catch: Exception -> 0x0037, CancellationException -> 0x0180, TryCatch #0 {CancellationException -> 0x0180, blocks: (B:7:0x002b, B:63:0x010d, B:65:0x0117, B:68:0x0133, B:10:0x003c, B:13:0x0042, B:31:0x009b, B:33:0x009f, B:35:0x00a6, B:38:0x00ab, B:40:0x00b0, B:42:0x00b8, B:45:0x00c7, B:47:0x00d4, B:70:0x0157, B:72:0x0160, B:50:0x00dc, B:55:0x00e9, B:57:0x00ef, B:59:0x00f7, B:53:0x00e3, B:14:0x004c, B:28:0x0086, B:15:0x0052, B:22:0x0067, B:25:0x0073, B:19:0x005d), top: B:80:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117 A[Catch: Exception -> 0x0131, CancellationException -> 0x0180, TryCatch #0 {CancellationException -> 0x0180, blocks: (B:7:0x002b, B:63:0x010d, B:65:0x0117, B:68:0x0133, B:10:0x003c, B:13:0x0042, B:31:0x009b, B:33:0x009f, B:35:0x00a6, B:38:0x00ab, B:40:0x00b0, B:42:0x00b8, B:45:0x00c7, B:47:0x00d4, B:70:0x0157, B:72:0x0160, B:50:0x00dc, B:55:0x00e9, B:57:0x00ef, B:59:0x00f7, B:53:0x00e3, B:14:0x004c, B:28:0x0086, B:15:0x0052, B:22:0x0067, B:25:0x0073, B:19:0x005d), top: B:80:0x001c }] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        dm3 dm3Var;
        Object objR;
        Object objE;
        boolean zBooleanValue;
        Object objB;
        dn3 dn3Var;
        ou2 ou2VarU;
        cn3 cn3VarG;
        Object objA;
        String str;
        String str2;
        ti tiVar = ti.i;
        zm3 zm3Var = zm3.a;
        xm3 xm3Var = xm3.a;
        boolean z = this.o;
        dm3 dm3Var2 = dm3.a;
        go3 go3Var = this.p;
        pi piVar = go3Var.c;
        i93 i93Var = go3Var.i;
        y50 y50Var = y50.f;
        try {
            try {
                switch (this.n) {
                    case 0:
                        y02.Q(obj);
                        if (z) {
                            this.n = 1;
                            objR = piVar.R(this);
                            if (objR == y50Var) {
                            }
                            break;
                        } else {
                            wm3 wm3Var = wm3.a;
                            i93Var.getClass();
                            i93Var.j(null, wm3Var);
                            this.n = 2;
                            objE = piVar.E(this);
                            if (objE != y50Var) {
                                zBooleanValue = ((Boolean) objE).booleanValue();
                                hn3 hn3Var = hn3.a;
                                this.j = zBooleanValue;
                                this.n = 3;
                                objB = hn3Var.b(zBooleanValue, this);
                                if (objB == y50Var) {
                                    if (!(objB instanceof qn2)) {
                                        i93Var.getClass();
                                        i93Var.j(null, xm3Var);
                                        return dm3Var2;
                                    }
                                    if (objB instanceof qn2) {
                                        objB = null;
                                    }
                                    dn3Var = (dn3) objB;
                                    if (dn3Var == null) {
                                        i93Var.getClass();
                                        i93Var.j(null, zm3Var);
                                        if (z) {
                                            this.k = null;
                                            this.j = zBooleanValue;
                                            this.n = 4;
                                            if (piVar.G(this) == y50Var) {
                                            }
                                        }
                                        return dm3Var2;
                                    }
                                    String str3 = dn3Var.a;
                                    String strF = go3.f(go3Var);
                                    hn3 hn3Var2 = hn3.a;
                                    dm3Var = dm3Var2;
                                    try {
                                        ou2 ou2VarU2 = n32.u(str3, true);
                                        if (ou2VarU2 != null && ((ou2VarU = n32.u(strF, true)) == null || ou2VarU2.compareTo(ou2VarU) > 0)) {
                                            cn3VarG = hn3.g(dn3Var);
                                            if (cn3VarG == null) {
                                                i93Var.getClass();
                                                i93Var.j(null, xm3Var);
                                                return dm3Var;
                                            }
                                            String str4 = cn3VarG.a;
                                            this.k = dn3Var;
                                            this.l = str3;
                                            this.m = cn3VarG;
                                            this.j = zBooleanValue;
                                            this.n = 6;
                                            objA = hn3Var2.a(dn3Var, str4, this);
                                            if (objA != y50Var) {
                                                str = str3;
                                                str2 = (String) objA;
                                                if (str2.length() == 0) {
                                                    ti tiVar2 = ui.a;
                                                    ui.c(tiVar, "UpdateViewModel", "No checksum available for " + cn3VarG.a + "; skipping verification", null);
                                                }
                                                vm3 vm3Var = new vm3(new qn3(str, cn3VarG.a, cn3VarG.b, str2, cn3VarG.c, dn3Var.d));
                                                i93Var.getClass();
                                                i93Var.j(null, vm3Var);
                                                return dm3Var;
                                            }
                                        } else {
                                            i93Var.getClass();
                                            i93Var.j(null, zm3Var);
                                            if (!z) {
                                                return dm3Var;
                                            }
                                            this.k = null;
                                            this.l = null;
                                            this.j = zBooleanValue;
                                            this.n = 5;
                                            if (piVar.G(this) != y50Var) {
                                                return dm3Var;
                                            }
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        i93Var.getClass();
                                        i93Var.j(null, xm3Var);
                                        ti tiVar3 = ui.a;
                                        ui.c(tiVar, "UpdateViewModel", "Update check failed unexpectedly", e);
                                        return dm3Var;
                                    }
                                }
                            }
                        }
                        return y50Var;
                    case 1:
                        y02.Q(obj);
                        objR = obj;
                        break;
                    case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                        y02.Q(obj);
                        objE = obj;
                        zBooleanValue = ((Boolean) objE).booleanValue();
                        hn3 hn3Var3 = hn3.a;
                        this.j = zBooleanValue;
                        this.n = 3;
                        objB = hn3Var3.b(zBooleanValue, this);
                        if (objB == y50Var) {
                        }
                        return y50Var;
                    case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                        zBooleanValue = this.j;
                        y02.Q(obj);
                        objB = ((rn2) obj).f;
                        if (!(objB instanceof qn2)) {
                        }
                        break;
                    case oc2.LONG_FIELD_NUMBER /* 4 */:
                    case oc2.STRING_FIELD_NUMBER /* 5 */:
                        y02.Q(obj);
                        return dm3Var2;
                    case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                        cn3VarG = this.m;
                        String str5 = this.l;
                        dn3 dn3Var2 = this.k;
                        y02.Q(obj);
                        dn3Var = dn3Var2;
                        str = str5;
                        dm3Var = dm3Var2;
                        objA = obj;
                        str2 = (String) objA;
                        if (str2.length() == 0) {
                        }
                        vm3 vm3Var2 = new vm3(new qn3(str, cn3VarG.a, cn3VarG.b, str2, cn3VarG.c, dn3Var.d));
                        i93Var.getClass();
                        i93Var.j(null, vm3Var2);
                        return dm3Var;
                    default:
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Exception e3) {
            e = e3;
            dm3Var = dm3Var2;
        }
    }
}
