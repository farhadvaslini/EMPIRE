package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m33 {
    public static final m33 f;
    public static final m33 g;
    public static final m33 h;
    public static final /* synthetic */ m33[] i;

    static {
        m33 m33Var = new m33("START", 0);
        f = m33Var;
        m33 m33Var2 = new m33("STOP", 1);
        g = m33Var2;
        m33 m33Var3 = new m33("STOP_AND_RESET_REPLAY_CACHE", 2);
        h = m33Var3;
        i = new m33[]{m33Var, m33Var2, m33Var3};
    }

    public static m33 valueOf(String str) {
        return (m33) Enum.valueOf(m33.class, str);
    }

    public static m33[] values() {
        return (m33[]) i.clone();
    }
}
