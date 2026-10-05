package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fa2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final p72 h;
    public final List i;

    public fa2(String str, String str2, String str3, String str4, String str5, String str6, String str7, p72 p72Var, List list) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = p72Var;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa2)) {
            return false;
        }
        fa2 fa2Var = (fa2) obj;
        return s51.n(this.a, fa2Var.a) && s51.n(this.b, fa2Var.b) && this.c.equals(fa2Var.c) && s51.n(this.d, fa2Var.d) && this.e.equals(fa2Var.e) && this.f.equals(fa2Var.f) && this.g.equals(fa2Var.g) && this.h == fa2Var.h && this.i.equals(fa2Var.i);
    }

    public final int hashCode() {
        int iA = by1.a(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.i.hashCode() + ((this.h.hashCode() + by1.a(by1.a(by1.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("PluginRuntimeDescriptor(id=", this.a, ", version=", this.b, ", apiVersion=");
        nc2.w(sbN, this.c, ", packageSha256=", this.d, ", entryPath=");
        nc2.w(sbN, this.e, ", installPath=", this.f, ", dataPath=");
        sbN.append(this.g);
        sbN.append(", activationMode=");
        sbN.append(this.h);
        sbN.append(", permissions=");
        sbN.append(this.i);
        sbN.append(")");
        return sbN.toString();
    }
}
