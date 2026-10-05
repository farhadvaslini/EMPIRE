package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class j31 extends aq1 implements nk3 {
    public js3 t;
    public js3 u;

    public j31() {
        om0 om0Var = s51.Q;
        this.t = om0Var;
        this.u = om0Var;
    }

    @Override // defpackage.nk3
    public final Object K() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }

    @Override // defpackage.aq1
    public void h1() {
        n32.B(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new i31(this, 1));
        q1();
    }

    @Override // defpackage.aq1
    public void i1() {
        this.u = this.t;
        n32.D(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new i31(this, 0));
    }

    @Override // defpackage.aq1
    public final void j1() {
        this.t = s51.Q;
    }

    public abstract js3 p1(js3 js3Var);

    public void q1() {
        this.u = p1(this.t);
        n32.D(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new i31(this, 0));
    }
}
