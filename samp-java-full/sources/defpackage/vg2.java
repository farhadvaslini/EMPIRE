package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vg2 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final xy2 e;
    public final String f;
    public final vi2 g;

    public vg2(String str, String str2, int i, String str3, xy2 xy2Var, String str4, vi2 vi2Var) {
        str2.getClass();
        str3.getClass();
        xy2Var.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = xy2Var;
        this.f = str4;
        this.g = vi2Var;
    }

    public static vg2 a(vg2 vg2Var, xy2 xy2Var, String str, int i) {
        String str2 = vg2Var.a;
        String str3 = vg2Var.b;
        int i2 = vg2Var.c;
        String str4 = vg2Var.d;
        if ((i & 16) != 0) {
            xy2Var = vg2Var.e;
        }
        xy2 xy2Var2 = xy2Var;
        vi2 vi2Var = vg2Var.g;
        str3.getClass();
        str4.getClass();
        xy2Var2.getClass();
        str.getClass();
        return new vg2(str2, str3, i2, str4, xy2Var2, str, vi2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vg2) {
            vg2 vg2Var = (vg2) obj;
            return this.a.equals(vg2Var.a) && s51.n(this.b, vg2Var.b) && this.c == vg2Var.c && s51.n(this.d, vg2Var.d) && this.e == vg2Var.e && s51.n(this.f, vg2Var.f) && this.g == vg2Var.g;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + by1.a((this.e.hashCode() + by1.a(nc2.b(this.c, by1.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("RaksampInstance(id=", this.a, ", host=", this.b, ", port=");
        sbN.append(this.c);
        sbN.append(", nickname=");
        sbN.append(this.d);
        sbN.append(", textEncoding=");
        sbN.append(this.e);
        sbN.append(", password=");
        sbN.append(this.f);
        sbN.append(", viewModel=");
        sbN.append(this.g);
        sbN.append(")");
        return sbN.toString();
    }
}
