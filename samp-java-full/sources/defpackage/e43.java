package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class e43 extends u10 {
    public Object b;
    public Object c;
    public js1 d;
    public js1 e;
    public lv2 f;
    public final aw2 g;
    public final b4 h;

    public e43() {
        super(2);
        this.g = new aw2(7, this);
        pt2 pt2Var = new pt2(8, this);
        a73.e(a73.a);
        synchronized (a73.c) {
            a73.h = qx.E0(a73.h, pt2Var);
        }
        this.h = new b4(4, pt2Var);
    }

    @Override // defpackage.u10
    public final void d(lv2 lv2Var) {
        this.c = null;
        this.e = null;
    }

    @Override // defpackage.u10
    public final void e() {
        synchronized (this.a) {
            try {
                this.b = this.c;
                if (this.e == null) {
                    this.d = null;
                } else {
                    if (this.d == null) {
                        js1 js1Var = or2.a;
                        this.d = new js1();
                    }
                    js1 js1Var2 = this.d;
                    this.d = this.e;
                    this.e = js1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.u10
    public final void g() {
        this.h.b();
        this.c = null;
        this.e = null;
        synchronized (this.a) {
            this.f = null;
            this.b = null;
            this.d = null;
        }
    }

    @Override // defpackage.u10
    public final ns0 k(lv2 lv2Var) {
        lv2 lv2Var2 = this.f;
        if (lv2Var2 != null && !lv2Var2.equals(lv2Var)) {
            yb2.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f = lv2Var;
        return this.g;
    }

    @Override // defpackage.u10
    public final void l(js jsVar) {
        this.f = null;
        this.c = null;
        this.e = null;
        e();
    }
}
