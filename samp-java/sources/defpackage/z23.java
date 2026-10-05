package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class z23 extends u71 implements cs0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ y23 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z23(y23 y23Var, int i) {
        super(0);
        this.g = i;
        this.h = y23Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        m23 m23VarF;
        m23 m23VarF2;
        int i = this.g;
        boolean zA = false;
        y23 y23Var = this.h;
        switch (i) {
            case 0:
                o23 o23Var = (o23) y23Var.c.getValue();
                if (o23Var != null && (m23VarF = o23Var.f()) != null) {
                    zA = m23VarF.a();
                }
                return Boolean.valueOf(zA);
            default:
                o23 o23Var2 = (o23) y23Var.c.getValue();
                if (o23Var2 != null && (m23VarF2 = o23Var2.f()) != null) {
                    zA = m23VarF2.a();
                }
                return Boolean.valueOf(zA);
        }
    }
}
