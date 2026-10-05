package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class e51 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public Object k;
    public Object l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e51(ContentResolver contentResolver, Uri uri, fu3 fu3Var, np npVar, Context context, p40 p40Var) {
        super(2, p40Var);
        this.j = 2;
        this.n = contentResolver;
        this.q = uri;
        this.r = fu3Var;
        this.o = npVar;
        this.p = context;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((e51) m((p40) obj2, (x50) obj)).o(dm3Var);
            case 1:
                return ((e51) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((e51) m((p40) obj2, (gn0) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.p;
        Object obj3 = this.o;
        Object obj4 = this.r;
        switch (i) {
            case 0:
                e51 e51Var = new e51((ts1) obj3, (f51) obj4, (ns0) obj2, p40Var, 0);
                e51Var.n = obj;
                return e51Var;
            case 1:
                e51 e51Var2 = new e51((ts1) obj3, (zs1) obj4, (ns0) obj2, p40Var, 1);
                e51Var2.n = obj;
                return e51Var2;
            default:
                e51 e51Var3 = new e51((ContentResolver) this.n, (Uri) this.q, (fu3) obj4, (np) obj3, (Context) obj2, p40Var);
                e51Var3.l = obj;
                return e51Var3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #4 {all -> 0x002e, blocks: (B:9:0x0028, B:19:0x0058, B:23:0x0069, B:25:0x0071, B:15:0x003e, B:18:0x0051), top: B:131:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:10:0x002b). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e51.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e51(ts1 ts1Var, Object obj, ns0 ns0Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.o = ts1Var;
        this.r = obj;
        this.p = ns0Var;
    }
}
