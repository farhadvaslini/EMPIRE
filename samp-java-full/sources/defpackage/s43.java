package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class s43 {
    public static final s43 f;
    public static final s43 g;
    public static final /* synthetic */ s43[] h;

    static {
        s43 s43Var = new s43("THUMB", 0);
        f = s43Var;
        s43 s43Var2 = new s43("TRACK", 1);
        g = s43Var2;
        h = new s43[]{s43Var, s43Var2};
    }

    public static s43 valueOf(String str) {
        return (s43) Enum.valueOf(s43.class, str);
    }

    public static s43[] values() {
        return (s43[]) h.clone();
    }
}
