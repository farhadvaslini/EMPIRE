package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class c30 {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public d30 a() {
        return new d30(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(ju... juVarArr) {
        if (!this.a) {
            c.p("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(juVarArr.length);
        for (ju juVar : juVarArr) {
            arrayList.add(juVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            c.p("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            c.p("At least one cipher suite is required");
        }
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.Serializable, java.lang.String[]] */
    public void c(ii3... ii3VarArr) {
        if (!this.a) {
            c.p("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(ii3VarArr.length);
        for (ii3 ii3Var : ii3VarArr) {
            arrayList.add(ii3Var.f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.a) {
            c.p("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            c.p("At least one TLS version is required");
        }
    }
}
