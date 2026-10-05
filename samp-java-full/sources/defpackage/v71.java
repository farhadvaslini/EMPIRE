package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class v71 {
    public final boolean a;
    public final kq2 b;
    public final String c;
    public final List d;
    public final String e;
    public final boolean f;
    public final xy2 g;

    public v71(boolean z, kq2 kq2Var, String str, List list, String str2, boolean z2, xy2 xy2Var) {
        str.getClass();
        str2.getClass();
        xy2Var.getClass();
        this.a = z;
        this.b = kq2Var;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.f = z2;
        this.g = xy2Var;
    }

    public static v71 a(v71 v71Var, String str, String str2, xy2 xy2Var, int i) {
        boolean z = v71Var.a;
        kq2 kq2Var = v71Var.b;
        if ((i & 4) != 0) {
            str = v71Var.c;
        }
        String str3 = str;
        List list = v71Var.d;
        if ((i & 16) != 0) {
            str2 = v71Var.e;
        }
        String str4 = str2;
        boolean z2 = v71Var.f;
        if ((i & 64) != 0) {
            xy2Var = v71Var.g;
        }
        xy2 xy2Var2 = xy2Var;
        v71Var.getClass();
        str3.getClass();
        list.getClass();
        str4.getClass();
        xy2Var2.getClass();
        return new v71(z, kq2Var, str3, list, str4, z2, xy2Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v71)) {
            return false;
        }
        v71 v71Var = (v71) obj;
        return this.a == v71Var.a && s51.n(this.b, v71Var.b) && s51.n(this.c, v71Var.c) && s51.n(this.d, v71Var.d) && s51.n(this.e, v71Var.e) && this.f == v71Var.f && this.g == v71Var.g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        kq2 kq2Var = this.b;
        return this.g.hashCode() + by1.b(by1.a((this.d.hashCode() + by1.a((iHashCode + (kq2Var == null ? 0 : kq2Var.hashCode())) * 31, 31, this.c)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "LaunchDialogUiState(visible=" + this.a + ", server=" + this.b + ", nickname=" + this.c + ", recentNicknames=" + this.d + ", password=" + this.e + ", passwordProtected=" + this.f + ", textEncoding=" + this.g + ")";
    }

    public /* synthetic */ v71() {
        this(false, null, "", ni0.f, "", false, ak2.n(xy2.h));
    }
}
