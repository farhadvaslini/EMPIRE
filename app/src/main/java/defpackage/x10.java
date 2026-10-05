package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class x10 extends w {
    public final d42 o;
    public boolean p;

    public x10(xz xzVar) {
        super(xzVar);
        this.o = b32.w(null);
    }

    @Override // defpackage.w
    public final void a(int i, nv0 nv0Var) {
        nv0Var.b0(420213850);
        int i2 = (nv0Var.h(this) ? 4 : 2) | i;
        if (nv0Var.R(i2 & 1, (i2 & 3) != 2)) {
            rs0 rs0Var = (rs0) this.o.getValue();
            if (rs0Var == null) {
                nv0Var.a0(-1238823553);
            } else {
                nv0Var.a0(98585282);
                rs0Var.f(nv0Var, 0);
            }
            nv0Var.p(false);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new u(i, 5, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return x10.class.getName();
    }

    @Override // defpackage.w
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.p;
    }

    public final void setContent(rs0 rs0Var) {
        this.p = true;
        this.o.setValue(rs0Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
