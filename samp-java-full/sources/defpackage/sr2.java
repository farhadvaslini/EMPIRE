package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class sr2 extends x implements z50 {
    public final p40 k;

    public sr2(p40 p40Var, o50 o50Var) {
        super(o50Var, true);
        this.k = p40Var;
    }

    @Override // defpackage.q61
    public void A(Object obj) {
        this.k.t(vp.R(obj));
    }

    @Override // defpackage.q61
    public final boolean X() {
        return true;
    }

    @Override // defpackage.z50
    public final z50 d() {
        p40 p40Var = this.k;
        if (p40Var instanceof z50) {
            return (z50) p40Var;
        }
        return null;
    }

    @Override // defpackage.q61
    public void w(Object obj) throws vb0 {
        s51.A(vr.I(this.k), vp.R(obj));
    }

    public void s0() {
    }
}
