package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xj2 {
    public l20 a;
    public int b;
    public iv0 c;
    public rs0 d;
    public int e;
    public wr1 f;
    public is1 g;

    public xj2(l20 l20Var) {
        this.a = l20Var;
    }

    public final boolean a() {
        if (this.a != null) {
            iv0 iv0Var = this.c;
            if (iv0Var != null ? iv0Var.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final c61 b(Object obj) {
        c61 c61VarS;
        l20 l20Var = this.a;
        return (l20Var == null || (c61VarS = l20Var.s(this, obj)) == null) ? c61.f : c61VarS;
    }

    public final void c() {
        l20 l20Var = this.a;
        if (l20Var != null) {
            l20Var.t = true;
            l20Var.y.v();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i = this.b;
        this.b = z ? i | 32 : i & (-33);
    }
}
