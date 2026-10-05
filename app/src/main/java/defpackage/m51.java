package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m51 {
    public static final m51 f;
    public static final m51 g;
    public static final /* synthetic */ m51[] h;

    static {
        m51 m51Var = new m51("Min", 0);
        f = m51Var;
        m51 m51Var2 = new m51("Max", 1);
        g = m51Var2;
        h = new m51[]{m51Var, m51Var2};
    }

    public static m51 valueOf(String str) {
        return (m51) Enum.valueOf(m51.class, str);
    }

    public static m51[] values() {
        return (m51[]) h.clone();
    }
}
