package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l92 {
    public static final /* synthetic */ l92[] f;
    public static final /* synthetic */ mj0 g;

    static {
        l92[] l92VarArr = {new l92("Installed", 0), new l92("Catalog", 1)};
        f = l92VarArr;
        g = new mj0(l92VarArr);
    }

    public static l92 valueOf(String str) {
        return (l92) Enum.valueOf(l92.class, str);
    }

    public static l92[] values() {
        return (l92[]) f.clone();
    }
}
