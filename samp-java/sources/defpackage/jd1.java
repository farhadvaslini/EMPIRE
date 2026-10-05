package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jd1 {
    public final Object a;
    public final kd1 b;
    public int d;
    public jd1 e;
    public boolean f;
    public int c = -1;
    public final d42 g = b32.w(null);

    public jd1(Object obj, kd1 kd1Var) {
        this.a = obj;
        this.b = kd1Var;
    }

    public final jd1 a() {
        if (this.f) {
            p21.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.f.add(this);
            jd1 jd1Var = (jd1) this.g.getValue();
            if (jd1Var != null) {
                jd1Var.a();
            } else {
                jd1Var = null;
            }
            this.e = jd1Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            p21.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            c();
        }
    }

    public final void c() {
        this.b.f.remove(this);
        jd1 jd1Var = this.e;
        if (jd1Var != null) {
            jd1Var.b();
        }
        this.e = null;
    }
}
