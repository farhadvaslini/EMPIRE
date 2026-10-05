package defpackage;

import android.app.Application;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yg2 extends mb3 implements rs0 {
    public int j;
    public int k;
    public int l;
    public Application m;
    public ih2 n;
    public int o;
    public final /* synthetic */ Application p;
    public final /* synthetic */ ih2 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg2(Application application, ih2 ih2Var, p40 p40Var) {
        super(2, p40Var);
        this.p = application;
        this.q = ih2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((yg2) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new yg2(this.p, this.q, p40Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0071 -> B:31:0x0092). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:30:0x008e). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Application application;
        ih2 ih2Var;
        int i;
        int i2;
        Exception e;
        int i3;
        int i4;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        int i5 = this.o;
        try {
            if (i5 == 0) {
                y02.Q(obj);
                application = this.p;
                ih2Var = this.q;
                i = 3;
                i2 = 0;
                if (i2 < i) {
                }
                return dm3Var;
            }
            if (i5 == 1) {
                i2 = this.l;
                i3 = this.k;
                i = this.j;
                ih2Var = this.n;
                application = this.m;
                try {
                    y02.Q(obj);
                } catch (Exception e2) {
                    e = e2;
                    ti tiVar = ui.a;
                    i4 = i2 + 1;
                    ui.c(ti.i, "RaksampInstanceManager", by1.h("Unable to restore persisted RAKSAMP instances (attempt ", "/3)", i4), e);
                    if (i4 < 3) {
                    }
                    i2 = i3 + 1;
                    if (i2 < i) {
                    }
                    return dm3Var;
                }
                dh2 dh2Var = dh2.a;
                dh2.g = true;
                return dm3Var;
            }
            if (i5 != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = this.k;
            int i7 = this.j;
            ih2 ih2Var2 = this.n;
            Application application2 = this.m;
            y02.Q(obj);
            application = application2;
            ih2Var = ih2Var2;
            i = i7;
            i3 = i6;
            i2 = i3 + 1;
            if (i2 < i) {
                try {
                } catch (Exception e3) {
                    e = e3;
                    i3 = i2;
                    ti tiVar2 = ui.a;
                    i4 = i2 + 1;
                    ui.c(ti.i, "RaksampInstanceManager", by1.h("Unable to restore persisted RAKSAMP instances (attempt ", "/3)", i4), e);
                    if (i4 < 3) {
                        long j = dh2.k[i2];
                        this.m = application;
                        this.n = ih2Var;
                        this.j = i;
                        this.k = i3;
                        this.l = i2;
                        this.o = 2;
                        if (ur.A(j, this) != y50Var) {
                            i6 = i3;
                            i7 = i;
                            ih2Var2 = ih2Var;
                            application2 = application;
                            application = application2;
                            ih2Var = ih2Var2;
                            i = i7;
                            i3 = i6;
                        }
                        return y50Var;
                    }
                    i2 = i3 + 1;
                    if (i2 < i) {
                    }
                    return dm3Var;
                }
                dh2 dh2Var2 = dh2.a;
                this.m = application;
                this.n = ih2Var;
                this.j = i;
                this.k = i2;
                this.l = i2;
                this.o = 1;
                if (dh2.a(application, ih2Var, this) != y50Var) {
                    i3 = i2;
                    dh2 dh2Var3 = dh2.a;
                    dh2.g = true;
                }
                return y50Var;
            }
            return dm3Var;
        } catch (CancellationException e4) {
            throw e4;
        }
    }
}
