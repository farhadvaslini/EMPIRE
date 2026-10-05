package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class uk {
    public final lv1 a;
    public final xy1 b;

    public uk(lv1 lv1Var, xy1 xy1Var) {
        this.a = lv1Var;
        this.b = xy1Var;
        if ((lv1Var == null ? xy1Var : lv1Var) != null) {
            return;
        }
        c.p("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }

    public final void a(d1 d1Var) {
        lv1 lv1Var = this.a;
        if (lv1Var != null) {
            lv1.a(lv1Var, (sk) d1Var.b);
            return;
        }
        xy1 xy1Var = this.b;
        if (xy1Var == null) {
            c.q("Unreachable");
            return;
        }
        tk tkVar = (tk) d1Var.a;
        tkVar.getClass();
        ry1 ry1Var = new ry1(tkVar, new ty1(null, tkVar));
        tkVar.a.add(ry1Var);
        lv1.a(xy1Var.b().c, ry1Var);
    }

    public final void b(d1 d1Var) throws Exception {
        if (this.a != null) {
            ((sk) d1Var.b).e();
        } else if (this.b != null) {
            ((tk) d1Var.a).e();
        } else {
            c.q("Unreachable");
        }
    }
}
