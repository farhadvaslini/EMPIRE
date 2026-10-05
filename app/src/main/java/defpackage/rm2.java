package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rm2 extends mb3 implements rs0 {
    public f83 j;
    public f83 k;
    public String l;
    public hm2 m;
    public i93 n;
    public int o;
    public final /* synthetic */ sm2 p;
    public final /* synthetic */ String q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm2(sm2 sm2Var, String str, boolean z, p40 p40Var) {
        super(2, p40Var);
        this.p = sm2Var;
        this.q = str;
        this.r = z;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((rm2) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new rm2(this.p, this.q, this.r, p40Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae A[Catch: Exception -> 0x0023, CancellationException -> 0x011a, TryCatch #2 {CancellationException -> 0x011a, Exception -> 0x0023, blocks: (B:8:0x001e, B:53:0x00d3, B:61:0x00f2, B:15:0x002e, B:43:0x00a2, B:45:0x00ae, B:47:0x00b2, B:54:0x00db, B:58:0x00e4, B:59:0x00eb, B:18:0x0035, B:28:0x0060, B:30:0x0064, B:32:0x0068, B:38:0x007a, B:40:0x0084, B:39:0x007f, B:36:0x0071, B:21:0x003c, B:23:0x0044, B:25:0x0049), top: B:72:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db A[Catch: Exception -> 0x0023, CancellationException -> 0x011a, TryCatch #2 {CancellationException -> 0x011a, Exception -> 0x0023, blocks: (B:8:0x001e, B:53:0x00d3, B:61:0x00f2, B:15:0x002e, B:43:0x00a2, B:45:0x00ae, B:47:0x00b2, B:54:0x00db, B:58:0x00e4, B:59:0x00eb, B:18:0x0035, B:28:0x0060, B:30:0x0064, B:32:0x0068, B:38:0x007a, B:40:0x0084, B:39:0x007f, B:36:0x0071, B:21:0x003c, B:23:0x0044, B:25:0x0049), top: B:72:0x0010 }] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        f83 f83Var;
        Throwable thA;
        Object objA;
        i93 i93Var;
        hm2 hm2Var;
        String str;
        hm2 hm2Var2;
        String str2 = this.q;
        sm2 sm2Var = this.p;
        i93 i93Var2 = sm2Var.n;
        y50 y50Var = y50.f;
        int i = this.o;
        p40 p40Var = null;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ti tiVar = ui.a;
            ui.c(ti.i, "ResourceViewModel", "Unable to load resource source list", e2);
            String message = e2.getMessage();
            c83 c83Var = new c83(message != null ? message : "Unknown error", str2);
            i93Var2.getClass();
            i93Var2.j(null, c83Var);
        }
        if (i == 0) {
            y02.Q(obj);
            Object value = i93Var2.getValue();
            f83Var = value instanceof f83 ? (f83) value : null;
            j90 j90Var = ac0.a;
            x80 x80Var = x80.h;
            pw pwVar = new pw(sm2Var, str2, p40Var, 9);
            this.j = f83Var;
            this.o = 1;
            obj = cl3.G(x80Var, pwVar, this);
            if (obj == y50Var) {
            }
            return y50Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i93Var = this.n;
                hm2Var2 = this.m;
                str = this.l;
                y02.Q(obj);
                hm2Var = hm2Var2;
                objA = new f83(str, hm2Var.a);
                i93Var.getClass();
                i93Var.j(null, objA);
                return dm3.a;
            }
            f83Var = this.k;
            y02.Q(obj);
            Object obj2 = ((rn2) obj).f;
            boolean z = this.r;
            thA = rn2.a(obj2);
            if (thA == null) {
                String message2 = thA.getMessage();
                if (message2 == null) {
                    message2 = "Unknown error";
                }
                objA = f83Var != null ? f83.a(f83Var, false, message2) : new c83(message2, str2);
                i93Var = i93Var2;
                i93Var.getClass();
                i93Var.j(null, objA);
                return dm3.a;
            }
            hm2Var = (hm2) obj2;
            if (!z) {
                str = str2;
                i93Var = i93Var2;
                objA = new f83(str, hm2Var.a);
                i93Var.getClass();
                i93Var.j(null, objA);
                return dm3.a;
            }
            sm2Var.v.i(str2);
            qy2 qy2Var = sm2Var.d;
            this.j = null;
            this.k = null;
            this.l = str2;
            this.m = hm2Var;
            this.n = i93Var2;
            this.o = 3;
            if (qy2Var.A(str2, this) != y50Var) {
                hm2Var2 = hm2Var;
                str = str2;
                i93Var = i93Var2;
                hm2Var = hm2Var2;
                objA = new f83(str, hm2Var.a);
                i93Var.getClass();
                i93Var.j(null, objA);
                return dm3.a;
            }
            return y50Var;
        }
        f83Var = this.j;
        y02.Q(obj);
        hm2 hm2Var3 = (hm2) obj;
        if (!s51.n(f83Var != null ? f83Var.b : null, str2) && hm2Var3 != null) {
            f83Var = new f83(str2, hm2Var3.a);
        }
        Object objA2 = f83Var != null ? f83.a(f83Var, true, null) : new e83(str2);
        i93Var2.getClass();
        i93Var2.j(null, objA2);
        j90 j90Var2 = ac0.a;
        x80 x80Var2 = x80.h;
        hd1 hd1Var = new hd1(sm2Var, str2, p40Var, 15);
        this.j = null;
        this.k = f83Var;
        this.o = 2;
        obj = cl3.G(x80Var2, hd1Var, this);
        if (obj != y50Var) {
            Object obj22 = ((rn2) obj).f;
            boolean z2 = this.r;
            thA = rn2.a(obj22);
            if (thA == null) {
            }
        }
        return y50Var;
    }
}
