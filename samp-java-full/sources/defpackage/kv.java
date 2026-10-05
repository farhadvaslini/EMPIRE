package defpackage;

import top.th1nk.samp.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kv {
    public static final /* synthetic */ kv[] g;
    public static final /* synthetic */ mj0 h;
    public final int f;

    static {
        kv[] kvVarArr = {new kv(0, R.string.launcher_cleo_tab_installed, "Installed"), new kv(1, R.string.launcher_cleo_tab_catalog, "Catalog")};
        g = kvVarArr;
        h = new mj0(kvVarArr);
    }

    public kv(int i, int i2, String str) {
        this.f = i2;
    }

    public static kv valueOf(String str) {
        return (kv) Enum.valueOf(kv.class, str);
    }

    public static kv[] values() {
        return (kv[]) g.clone();
    }
}
