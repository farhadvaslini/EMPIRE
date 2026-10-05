package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class j63 {
    public static final j63 f;
    public static final /* synthetic */ j63[] g;

    static {
        j63 j63Var = new j63("Dismissed", 0);
        f = j63Var;
        g = new j63[]{j63Var, new j63("ActionPerformed", 1)};
    }

    public static j63 valueOf(String str) {
        return (j63) Enum.valueOf(j63.class, str);
    }

    public static j63[] values() {
        return (j63[]) g.clone();
    }
}
