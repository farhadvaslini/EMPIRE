package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ko0 {
    public static final ko0 f;
    public static final /* synthetic */ ko0[] g;

    /* JADX INFO: Fake field, exist only in values array */
    ko0 EF0;

    static {
        ko0 ko0Var = new ko0("Visible", 0);
        ko0 ko0Var2 = new ko0("Clip", 1);
        f = ko0Var2;
        g = new ko0[]{ko0Var, ko0Var2, new ko0("ExpandIndicator", 2), new ko0("ExpandOrCollapseIndicator", 3)};
    }

    public static ko0 valueOf(String str) {
        return (ko0) Enum.valueOf(ko0.class, str);
    }

    public static ko0[] values() {
        return (ko0[]) g.clone();
    }
}
