package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k82 {
    public static final uk2 l = new uk2("^[a-z][a-z0-9]*(?:\\.[a-z0-9][a-z0-9_-]*)+$");
    public static final uk2 m = new uk2("^[a-z][a-z0-9]*(?:\\.[a-z0-9_]+)+$");
    public static final Set n = oz2.L("singleplayer", "multiplayer");
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final p72 h;
    public final List i;
    public final List j;
    public final r72 k;

    public k82(int i, String str, String str2, String str3, String str4, String str5, String str6, p72 p72Var, List list, List list2, r72 r72Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = p72Var;
        this.i = list;
        this.j = list2;
        this.k = r72Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k82)) {
            return false;
        }
        k82 k82Var = (k82) obj;
        return this.a == k82Var.a && s51.n(this.b, k82Var.b) && s51.n(this.c, k82Var.c) && s51.n(this.d, k82Var.d) && this.e.equals(k82Var.e) && this.f.equals(k82Var.f) && this.g.equals(k82Var.g) && this.h == k82Var.h && this.i.equals(k82Var.i) && this.j.equals(k82Var.j) && s51.n(this.k, k82Var.k);
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + by1.a(by1.a(by1.a(by1.a(by1.a(by1.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31)) * 31;
        r72 r72Var = this.k;
        return iHashCode + (r72Var == null ? 0 : r72Var.a.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PluginManifest(schemaVersion=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", name=");
        nc2.w(sb, this.c, ", version=", this.d, ", apiVersion=");
        nc2.w(sb, this.e, ", entry=", this.f, ", description=");
        sb.append(this.g);
        sb.append(", activationMode=");
        sb.append(this.h);
        sb.append(", permissions=");
        sb.append(this.i);
        sb.append(", contexts=");
        sb.append(this.j);
        sb.append(", author=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
