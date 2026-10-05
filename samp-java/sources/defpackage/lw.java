package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class lw {
    public static final zj g;
    public static final lw h;
    public static final lw i;
    public static final /* synthetic */ lw[] j;
    public static final /* synthetic */ mj0 k;
    public final String f;

    static {
        lw lwVar = new lw("Csa", "csa", 0);
        h = lwVar;
        lw lwVar2 = new lw("Csi", "csi", 1);
        i = lwVar2;
        lw[] lwVarArr = {lwVar, lwVar2, new lw("Cm", "cm", 2)};
        j = lwVarArr;
        k = new mj0(lwVarArr);
        g = new zj(8);
    }

    public lw(String str, String str2, int i2) {
        this.f = str2;
    }

    public static lw valueOf(String str) {
        return (lw) Enum.valueOf(lw.class, str);
    }

    public static lw[] values() {
        return (lw[]) j.clone();
    }
}
