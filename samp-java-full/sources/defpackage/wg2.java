package defpackage;

import android.app.Application;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wg2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ int m;
    public Object n;
    public final /* synthetic */ Object o;
    public Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg2(String str, int i, String str2, xy2 xy2Var, String str3, p40 p40Var, int i2) {
        super(2, p40Var);
        this.j = i2;
        this.l = str;
        this.m = i;
        this.n = str2;
        this.o = xy2Var;
        this.p = str3;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((wg2) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                return new wg2((String) this.l, this.m, (String) this.n, (xy2) obj2, (String) this.p, p40Var, 0);
            case 1:
                return new wg2((String) this.l, this.m, (String) this.n, (xy2) obj2, (String) this.p, p40Var, 1);
            default:
                return new wg2((tw) obj2, this.m, p40Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:10:0x0032, B:42:0x00d1, B:44:0x00d5, B:46:0x00f9, B:45:0x00e5, B:16:0x0049, B:37:0x00a3, B:17:0x004d, B:26:0x0073, B:31:0x0084, B:33:0x008a, B:38:0x00ac, B:20:0x0058, B:22:0x0060, B:23:0x0068), top: B:79:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:10:0x0032, B:42:0x00d1, B:44:0x00d5, B:46:0x00f9, B:45:0x00e5, B:16:0x0049, B:37:0x00a3, B:17:0x004d, B:26:0x0073, B:31:0x0084, B:33:0x008a, B:38:0x00ac, B:20:0x0058, B:22:0x0060, B:23:0x0068), top: B:79:0x001b }] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Object objD;
        tw twVar;
        xu xuVar;
        Object avVar;
        rq rqVar;
        p40 p40Var = null;
        int i = 1;
        switch (this.j) {
            case 0:
                y50 y50Var = y50.f;
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    ih2 ih2Var = dh2.e;
                    if (ih2Var != null) {
                        String str = (String) this.l;
                        int i3 = this.m;
                        String str2 = (String) this.n;
                        xy2 xy2Var = (xy2) this.o;
                        String str3 = (String) this.p;
                        this.k = 1;
                        if (ih2Var.c(str, i3, str2, xy2Var, str3, this) == y50Var) {
                            return y50Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            case 1:
                y50 y50Var2 = y50.f;
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    ih2 ih2Var2 = dh2.e;
                    if (ih2Var2 != null) {
                        String str4 = (String) this.l;
                        int i5 = this.m;
                        String str5 = (String) this.n;
                        xy2 xy2Var2 = (xy2) this.o;
                        String str6 = (String) this.p;
                        this.k = 1;
                        if (ih2Var2.c(str4, i5, str5, xy2Var2, str6, this) == y50Var2) {
                            return y50Var2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3.a;
            default:
                dm3 dm3Var = dm3.a;
                int i6 = this.m;
                tw twVar2 = (tw) this.o;
                i93 i93Var = twVar2.n;
                i93 i93Var2 = twVar2.l;
                y50 y50Var3 = y50.f;
                int i7 = this.k;
                try {
                    if (i7 == 0) {
                        y02.Q(obj);
                        if (!(i93Var2.getValue() instanceof av)) {
                            zu zuVar = zu.a;
                            i93Var2.getClass();
                            i93Var2.j(null, zuVar);
                        }
                        tu tuVar = tu.a;
                        this.k = 1;
                        objD = tuVar.d(this);
                        if (objD == y50Var3) {
                        }
                        return y50Var3;
                    }
                    if (i7 != 1) {
                        if (i7 == 2) {
                            i93Var2 = (i93) this.n;
                            xuVar = (xu) this.l;
                            y02.Q(obj);
                            avVar = new av(xuVar.a, null, false);
                            i93Var2.getClass();
                            i93Var2.j(null, avVar);
                            if (i6 == twVar2.e) {
                            }
                            return dm3Var;
                        }
                        if (i7 != 3) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i93Var2 = (i93) this.p;
                        twVar = (tw) this.l;
                        y02.Q(obj);
                        rqVar = (rq) obj;
                        if (rqVar == null) {
                            avVar = new av(rqVar.a, new Long(rqVar.b), true);
                        } else {
                            Application application = twVar.b;
                            application.getClass();
                            String string = application.getString(R.string.launcher_cleo_error_catalog);
                            string.getClass();
                            avVar = new yu(string);
                        }
                        i93Var2.getClass();
                        i93Var2.j(null, avVar);
                        if (i6 == twVar2.e) {
                            Boolean bool = Boolean.FALSE;
                            i93Var.getClass();
                            i93Var.j(null, bool);
                        }
                        return dm3Var;
                    }
                    y02.Q(obj);
                    objD = ((rn2) obj).f;
                    int i8 = twVar2.e;
                    if (i6 != i8) {
                        if (i6 == i8) {
                        }
                        return dm3Var;
                    }
                    Throwable thA = rn2.a(objD);
                    if (thA == null) {
                        xu xuVar2 = (xu) objD;
                        j90 j90Var = ac0.a;
                        x80 x80Var = x80.h;
                        rw rwVar = new rw(twVar2, xuVar2, null);
                        this.l = xuVar2;
                        this.n = i93Var2;
                        this.k = 2;
                        if (cl3.G(x80Var, rwVar, this) != y50Var3) {
                            xuVar = xuVar2;
                            avVar = new av(xuVar.a, null, false);
                            i93Var2.getClass();
                            i93Var2.j(null, avVar);
                            if (i6 == twVar2.e) {
                            }
                            return dm3Var;
                        }
                    } else {
                        ti tiVar = ui.a;
                        ui.c(ti.i, "CleoViewModel", "Unable to load CLEO catalog", thA);
                        j90 j90Var2 = ac0.a;
                        x80 x80Var2 = x80.h;
                        hm hmVar = new hm(twVar2, p40Var, i);
                        this.l = twVar2;
                        this.n = null;
                        this.p = i93Var2;
                        this.k = 3;
                        obj = cl3.G(x80Var2, hmVar, this);
                        if (obj != y50Var3) {
                            twVar = twVar2;
                            rqVar = (rq) obj;
                            if (rqVar == null) {
                            }
                            i93Var2.getClass();
                            i93Var2.j(null, avVar);
                            if (i6 == twVar2.e) {
                            }
                            return dm3Var;
                        }
                    }
                    return y50Var3;
                } finally {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg2(tw twVar, int i, p40 p40Var) {
        super(2, p40Var);
        this.j = 2;
        this.o = twVar;
        this.m = i;
    }
}
