package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class f83 implements g83 {
    public final List a;
    public final String b;
    public final boolean c;
    public final String d;

    public f83(List list, String str, boolean z, String str2) {
        str.getClass();
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public static f83 a(f83 f83Var, boolean z, String str) {
        List list = f83Var.a;
        String str2 = f83Var.b;
        list.getClass();
        str2.getClass();
        return new f83(list, str2, z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f83)) {
            return false;
        }
        f83 f83Var = (f83) obj;
        return s51.n(this.a, f83Var.a) && s51.n(this.b, f83Var.b) && this.c == f83Var.c && s51.n(this.d, f83Var.d);
    }

    public final int hashCode() {
        int iB = by1.b(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Ready(sources=" + this.a + ", sourceUrl=" + this.b + ", isRefreshing=" + this.c + ", refreshError=" + this.d + ")";
    }

    public /* synthetic */ f83(String str, ArrayList arrayList) {
        this(arrayList, str, false, null);
    }
}
