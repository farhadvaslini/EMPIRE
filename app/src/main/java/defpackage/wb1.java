package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class wb1 {
    public static final xa0 a = lq.h();

    public static final q12 a(tb1 tb1Var) {
        q12 q12Var = tb1Var.t;
        if (q12Var != null) {
            return q12Var;
        }
        throw nc2.d("LayoutNode should be attached to an owner");
    }
}
