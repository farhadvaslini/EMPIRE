package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mp0 {
    public static final mp0 f;
    public static final mp0 g;
    public static final mp0 h;
    public static final /* synthetic */ mp0[] i;

    static {
        mp0 mp0Var = new mp0("Active", 0);
        f = mp0Var;
        mp0 mp0Var2 = new mp0("ActiveParent", 1);
        g = mp0Var2;
        mp0 mp0Var3 = new mp0("Captured", 2);
        mp0 mp0Var4 = new mp0("Inactive", 3);
        h = mp0Var4;
        i = new mp0[]{mp0Var, mp0Var2, mp0Var3, mp0Var4};
    }

    public static mp0 valueOf(String str) {
        return (mp0) Enum.valueOf(mp0.class, str);
    }

    public static mp0[] values() {
        return (mp0[]) i.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                c.k();
                return false;
            }
        }
        return true;
    }
}
