package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gl2 {
    public static final gl2 f;
    public static final /* synthetic */ gl2[] g;

    static {
        gl2 gl2Var = new gl2("Restart", 0);
        f = gl2Var;
        g = new gl2[]{gl2Var, new gl2("Reverse", 1)};
    }

    public static gl2 valueOf(String str) {
        return (gl2) Enum.valueOf(gl2.class, str);
    }

    public static gl2[] values() {
        return (gl2[]) g.clone();
    }
}
