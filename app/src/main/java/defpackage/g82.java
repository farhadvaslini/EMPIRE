package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class g82 {
    public static final g82 f;
    public static final g82 g;
    public static final g82 h;
    public static final g82 i;
    public static final g82 j;
    public static final g82 k;
    public static final g82 l;
    public static final g82 m;
    public static final g82 n;
    public static final g82 o;
    public static final g82 p;
    public static final g82 q;
    public static final g82 r;
    public static final g82 s;
    public static final g82 t;
    public static final g82 u;
    public static final /* synthetic */ g82[] v;

    static {
        g82 g82Var = new g82("InvalidExtension", 0);
        f = g82Var;
        g82 g82Var2 = new g82("CannotReadPackage", 1);
        g = g82Var2;
        g82 g82Var3 = new g82("DownloadFailed", 2);
        h = g82Var3;
        g82 g82Var4 = new g82("PackageTooLarge", 3);
        i = g82Var4;
        g82 g82Var5 = new g82("ChecksumMismatch", 4);
        j = g82Var5;
        g82 g82Var6 = new g82("InvalidArchive", 5);
        k = g82Var6;
        g82 g82Var7 = new g82("MissingRootManifest", 6);
        l = g82Var7;
        g82 g82Var8 = new g82("InvalidManifest", 7);
        m = g82Var8;
        g82 g82Var9 = new g82("IncompatibleApi", 8);
        n = g82Var9;
        g82 g82Var10 = new g82("CatalogMismatch", 9);
        o = g82Var10;
        g82 g82Var11 = new g82("MissingEntry", 10);
        p = g82Var11;
        g82 g82Var12 = new g82("Downgrade", 11);
        q = g82Var12;
        g82 g82Var13 = new g82("TooManyPlugins", 12);
        r = g82Var13;
        g82 g82Var14 = new g82("VersionConflict", 13);
        s = g82Var14;
        g82 g82Var15 = new g82("UnsafePackage", 14);
        t = g82Var15;
        g82 g82Var16 = new g82("Unknown", 15);
        u = g82Var16;
        v = new g82[]{g82Var, g82Var2, g82Var3, g82Var4, g82Var5, g82Var6, g82Var7, g82Var8, g82Var9, g82Var10, g82Var11, g82Var12, g82Var13, g82Var14, g82Var15, g82Var16};
    }

    public static g82 valueOf(String str) {
        return (g82) Enum.valueOf(g82.class, str);
    }

    public static g82[] values() {
        return (g82[]) v.clone();
    }
}
