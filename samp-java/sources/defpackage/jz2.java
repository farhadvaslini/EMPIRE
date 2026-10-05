package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jz2 {
    public static final jz2 f;
    public static final jz2 g;
    public static final /* synthetic */ jz2[] h;
    public static final /* synthetic */ mj0 i;

    static {
        jz2 jz2Var = new jz2("Saved", 0);
        f = jz2Var;
        jz2 jz2Var2 = new jz2("Recommended", 1);
        g = jz2Var2;
        jz2[] jz2VarArr = {jz2Var, jz2Var2};
        h = jz2VarArr;
        i = new mj0(jz2VarArr);
    }

    public static jz2 valueOf(String str) {
        return (jz2) Enum.valueOf(jz2.class, str);
    }

    public static jz2[] values() {
        return (jz2[]) h.clone();
    }
}
