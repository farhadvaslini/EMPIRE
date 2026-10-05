package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class f4 implements bt0, Serializable {
    public final Object f;
    public final Class g;
    public final String h;
    public final String i;
    public final boolean j = false;
    public final int k;
    public final int l;

    public f4(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.f = obj;
        this.g = cls;
        this.h = str;
        this.i = str2;
        this.k = i;
        this.l = i2 >> 1;
    }

    @Override // defpackage.bt0
    public final int c() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj;
        return this.j == f4Var.j && this.k == f4Var.k && this.l == f4Var.l && s51.n(this.f, f4Var.f) && this.g.equals(f4Var.g) && this.h.equals(f4Var.h) && this.i.equals(f4Var.i);
    }

    public final int hashCode() {
        Object obj = this.f;
        return ((((by1.a(by1.a((this.g.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.h), 31, this.i) + (this.j ? 1231 : 1237)) * 31) + this.k) * 31) + this.l;
    }

    public final String toString() {
        rk2.a.getClass();
        return sk2.a(this);
    }
}
