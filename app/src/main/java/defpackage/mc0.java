package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mc0 implements cs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ mc0(os1 os1Var, ns0 ns0Var, boolean z) {
        this.h = os1Var;
        this.i = ns0Var;
        this.g = z;
    }

    @Override // defpackage.cs0
    public final Object a() {
        switch (this.f) {
            case 0:
                boolean z = this.g;
                tq2 tq2Var = (tq2) this.h;
                String str = (String) this.i;
                if (z) {
                    vq2 vq2Var = tq2Var.a;
                    synchronized (vq2Var.c) {
                    }
                }
                return dm3.a;
            default:
                os1 os1Var = (os1) this.h;
                ns0 ns0Var = (ns0) this.i;
                boolean z2 = this.g;
                os1Var.setValue(new hk0());
                ns0Var.h(Boolean.valueOf(!z2));
                return dm3.a;
        }
    }

    public /* synthetic */ mc0(boolean z, tq2 tq2Var, String str) {
        this.g = z;
        this.h = tq2Var;
        this.i = str;
    }
}
