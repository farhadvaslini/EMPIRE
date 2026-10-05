package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class yq implements s61, Serializable {
    public transient s61 f;
    public final Object g;
    public final Class h;
    public final String i;
    public final String j;
    public final boolean k;

    public yq(Object obj, Class cls, String str, String str2, boolean z) {
        this.g = obj;
        this.h = cls;
        this.i = str;
        this.j = str2;
        this.k = z;
    }

    public abstract s61 d();

    public final ku i() {
        boolean z = this.k;
        Class cls = this.h;
        if (!z) {
            return rk2.a(cls);
        }
        rk2.a.getClass();
        return new u12(cls);
    }
}
