package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class f93 {
    public static final f93 f;
    public static final f93 g;
    public static final f93 h;
    public static final /* synthetic */ f93[] i;

    static {
        f93 f93Var = new f93("NoRequest", 0);
        f = f93Var;
        f93 f93Var2 = new f93("MatchFound", 1);
        g = f93Var2;
        f93 f93Var3 = new f93("VisibleContentAbsentDuringTransition", 2);
        h = f93Var3;
        i = new f93[]{f93Var, f93Var2, f93Var3, new f93("NoMatchFound", 3)};
    }

    public static f93 valueOf(String str) {
        return (f93) Enum.valueOf(f93.class, str);
    }

    public static f93[] values() {
        return (f93[]) i.clone();
    }
}
