package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class om2 extends mb3 implements rs0 {
    public long j;
    public long k;
    public nm2 l;
    public int m;
    public final /* synthetic */ sm2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om2(sm2 sm2Var, p40 p40Var) {
        super(2, p40Var);
        this.n = sm2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((om2) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new om2(this.n, p40Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (r2.k(r5, r18) == r11) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a A[Catch: Exception -> 0x0023, CancellationException -> 0x00fb, TryCatch #2 {CancellationException -> 0x00fb, Exception -> 0x0023, blocks: (B:9:0x001e, B:16:0x0032, B:30:0x0083, B:32:0x008a, B:35:0x009e, B:37:0x00a2, B:40:0x00c8, B:42:0x00cc, B:19:0x0039, B:25:0x0065, B:27:0x0072, B:22:0x0042), top: B:53:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[Catch: Exception -> 0x0023, CancellationException -> 0x00fb, TryCatch #2 {CancellationException -> 0x00fb, Exception -> 0x0023, blocks: (B:9:0x001e, B:16:0x0032, B:30:0x0083, B:32:0x008a, B:35:0x009e, B:37:0x00a2, B:40:0x00c8, B:42:0x00cc, B:19:0x0039, B:25:0x0065, B:27:0x0072, B:22:0x0042), top: B:53:0x0012 }] */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        long jCurrentTimeMillis;
        Object objG;
        nm2 nm2Var;
        long jCurrentTimeMillis2;
        sm2 sm2Var = this.n;
        s23 s23Var = sm2Var.t;
        i93 i93Var = sm2Var.l;
        int i = this.m;
        p40 p40Var = null;
        y50 y50Var = y50.f;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            jm2 jm2Var = new jm2(message);
            i93Var.getClass();
            i93Var.j(null, jm2Var);
        }
        if (i == 0) {
            y02.Q(obj);
            im2 im2Var = im2.a;
            i93Var.getClass();
            i93Var.j(null, im2Var);
            jCurrentTimeMillis = System.currentTimeMillis();
            j90 j90Var = ac0.a;
            x80 x80Var = x80.h;
            hm hmVar = new hm(sm2Var, p40Var, 9);
            this.j = jCurrentTimeMillis;
            this.m = 1;
            objG = cl3.G(x80Var, hmVar, this);
            if (objG == y50Var) {
            }
            return y50Var;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5) {
                    y02.Q(obj);
                    return dm3.a;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j = this.k;
            jCurrentTimeMillis = this.j;
            nm2Var = this.l;
            y02.Q(obj);
            jCurrentTimeMillis2 = j;
            i93Var.i(nm2Var);
            if (!(nm2Var instanceof mm2)) {
                t53 t53Var = new t53();
                this.l = null;
                this.j = jCurrentTimeMillis;
                this.k = jCurrentTimeMillis2;
                this.m = 3;
                if (s23Var.k(t53Var, this) == y50Var) {
                    return y50Var;
                }
                return dm3.a;
            }
            if (!(nm2Var instanceof km2)) {
                if (nm2Var instanceof jm2) {
                    u53 u53Var = new u53(((jm2) nm2Var).a);
                    this.l = null;
                    this.j = jCurrentTimeMillis;
                    this.k = jCurrentTimeMillis2;
                    this.m = 5;
                }
                return dm3.a;
            }
            s53 s53Var = new s53(vr.K(new Integer(((km2) nm2Var).a.size())));
            this.l = null;
            this.j = jCurrentTimeMillis;
            this.k = jCurrentTimeMillis2;
            this.m = 4;
            if (s23Var.k(s53Var, this) == y50Var) {
                return y50Var;
            }
            return dm3.a;
        }
        jCurrentTimeMillis = this.j;
        y02.Q(obj);
        objG = obj;
        nm2Var = (nm2) objG;
        jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 < 500) {
            this.l = nm2Var;
            this.j = jCurrentTimeMillis;
            this.k = jCurrentTimeMillis2;
            this.m = 2;
            if (ur.A(500 - jCurrentTimeMillis2, this) == y50Var) {
            }
            return y50Var;
        }
        i93Var.i(nm2Var);
        if (!(nm2Var instanceof mm2)) {
        }
    }
}
