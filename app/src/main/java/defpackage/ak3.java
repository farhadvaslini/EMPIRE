package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ak3 implements e93 {
    public final ek3 f;
    public ns0 g;
    public ns0 h;
    public final /* synthetic */ bk3 i;

    public ak3(bk3 bk3Var, ek3 ek3Var, ns0 ns0Var, ns0 ns0Var2) {
        this.i = bk3Var;
        this.f = ek3Var;
        this.g = ns0Var;
        this.h = ns0Var2;
    }

    public final void a(ck3 ck3Var, Object obj, ue ueVar) {
        Object objH = this.h.h(ck3Var.c());
        boolean zG = this.i.c.g();
        ek3 ek3Var = this.f;
        if (zG) {
            ek3Var.g(this.h.h(ck3Var.a()), objH, (mm0) this.g.h(ck3Var));
        } else {
            ek3Var.h(objH, (mm0) this.g.h(ck3Var), obj, ueVar);
        }
    }

    @Override // defpackage.e93
    public final Object getValue() {
        a(this.i.c.f(), null, null);
        return this.f.o.getValue();
    }
}
