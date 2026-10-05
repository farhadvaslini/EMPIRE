package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cl2 implements x50, al2 {
    public static final or i = new or(0);
    public final o50 f;
    public final cl2 g = this;
    public volatile o50 h;

    public cl2(o50 o50Var) {
        this.f = o50Var;
    }

    public final void b() {
        synchronized (this.g) {
            try {
                o50 o50Var = this.h;
                if (o50Var == null) {
                    this.h = i;
                } else {
                    cr0 cr0Var = new cr0(0);
                    j61 j61Var = (j61) o50Var.m(f5.b0);
                    if (j61Var != null) {
                        j61Var.c(cr0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.al2
    public final void d() {
        b();
    }

    @Override // defpackage.al2
    public final void e() {
        b();
    }

    @Override // defpackage.x50
    public final o50 h() {
        o50 o50VarK;
        o50 o50Var = this.h;
        if (o50Var == null || o50Var == i) {
            j20 j20Var = (j20) this.f.m(j20.g);
            o50 bl2Var = j20Var != null ? new bl2(j20Var, this) : li0.f;
            synchronized (this.g) {
                try {
                    o50 o50Var2 = this.h;
                    if (o50Var2 == null) {
                        o50 o50Var3 = this.f;
                        o50VarK = o50Var3.k(new l61((j61) o50Var3.m(f5.b0))).k(li0.f).k(bl2Var);
                    } else if (o50Var2 == i) {
                        o50 o50Var4 = this.f;
                        l61 l61Var = new l61((j61) o50Var4.m(f5.b0));
                        l61Var.F(new cr0(0));
                        o50VarK = o50Var4.k(l61Var).k(li0.f).k(bl2Var);
                    } else {
                        o50VarK = o50Var2;
                    }
                    this.h = o50VarK;
                } catch (Throwable th) {
                    throw th;
                }
            }
            o50Var = o50VarK;
        }
        o50Var.getClass();
        return o50Var;
    }

    @Override // defpackage.al2
    public final void a() {
    }
}
