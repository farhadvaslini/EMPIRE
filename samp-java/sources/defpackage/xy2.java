package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xy2 {
    public static final ak2 h;
    public static final xy2 i;
    public static final xy2 j;
    public static final /* synthetic */ xy2[] k;
    public static final /* synthetic */ mj0 l;
    public final String f;
    public final int g;

    static {
        xy2 xy2Var = new xy2(0, 0, "Utf8", "utf8");
        xy2 xy2Var2 = new xy2(1, 1, "Gbk", "gbk");
        i = xy2Var2;
        xy2 xy2Var3 = new xy2(2, 2, "Windows1251", "windows1251");
        j = xy2Var3;
        xy2[] xy2VarArr = {xy2Var, xy2Var2, xy2Var3};
        k = xy2VarArr;
        l = new mj0(xy2VarArr);
        h = new ak2(7);
    }

    public xy2(int i2, int i3, String str, String str2) {
        this.f = str2;
        this.g = i3;
    }

    public static xy2 valueOf(String str) {
        return (xy2) Enum.valueOf(xy2.class, str);
    }

    public static xy2[] values() {
        return (xy2[]) k.clone();
    }
}
