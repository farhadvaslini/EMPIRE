package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class si1 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ wi1 g;

    public /* synthetic */ si1(wi1 wi1Var, int i) {
        this.f = i;
        this.g = wi1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        wi1 wi1Var = this.g;
        switch (i) {
            case 0:
                cg0 cg0Var = wi1Var.h;
                if (cg0Var != null) {
                    cg0Var.setListSelectionHidden(true);
                    cg0Var.requestLayout();
                }
                break;
            default:
                cg0 cg0Var2 = wi1Var.h;
                if (cg0Var2 != null && cg0Var2.isAttachedToWindow() && wi1Var.h.getCount() > wi1Var.h.getChildCount() && wi1Var.h.getChildCount() <= wi1Var.r) {
                    wi1Var.D.setInputMethodMode(2);
                    wi1Var.c();
                    break;
                }
                break;
        }
    }
}
