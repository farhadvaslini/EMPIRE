package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zt2 {
    public static final zt2 f;
    public static final /* synthetic */ zt2[] g;

    static {
        zt2 zt2Var = new zt2("EditableText", 0);
        f = zt2Var;
        g = new zt2[]{zt2Var, new zt2("StaticText", 1)};
    }

    public static zt2 valueOf(String str) {
        return (zt2) Enum.valueOf(zt2.class, str);
    }

    public static zt2[] values() {
        return (zt2[]) g.clone();
    }
}
