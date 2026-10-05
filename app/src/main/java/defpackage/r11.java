package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class r11 {
    public static final r11 f;
    public static final r11 g;
    public static final r11 h;
    public static final /* synthetic */ r11[] i;

    static {
        r11 r11Var = new r11("Yes", 0);
        f = r11Var;
        r11 r11Var2 = new r11("No", 1);
        g = r11Var2;
        r11 r11Var3 = new r11("NotInitialized", 2);
        h = r11Var3;
        i = new r11[]{r11Var, r11Var2, r11Var3};
    }

    public static r11 valueOf(String str) {
        return (r11) Enum.valueOf(r11.class, str);
    }

    public static r11[] values() {
        return (r11[]) i.clone();
    }
}
