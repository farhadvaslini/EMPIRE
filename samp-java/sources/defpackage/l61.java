package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class l61 extends q61 {
    public final boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l61(j61 j61Var) {
        super(true);
        boolean z = true;
        V(j61Var);
        mt mtVarR = R();
        nt ntVar = mtVarR instanceof nt ? (nt) mtVarR : null;
        if (ntVar == null) {
            z = false;
            break;
        }
        q61 q61VarQ = ntVar.q();
        while (!q61VarQ.O()) {
            mt mtVarR2 = q61VarQ.R();
            nt ntVar2 = mtVarR2 instanceof nt ? (nt) mtVarR2 : null;
            if (ntVar2 == null) {
                z = false;
                break;
            }
            q61VarQ = ntVar2.q();
        }
        this.j = z;
    }

    @Override // defpackage.q61
    public final boolean O() {
        return this.j;
    }

    @Override // defpackage.q61
    public final boolean P() {
        return true;
    }
}
