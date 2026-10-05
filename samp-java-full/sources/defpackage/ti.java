package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ti {
    public static final ti g;
    public static final ti h;
    public static final ti i;
    public static final ti j;
    public static final /* synthetic */ ti[] k;
    public static final /* synthetic */ mj0 l;
    public final int f;

    static {
        ti tiVar = new ti(0, 3, "Debug");
        g = tiVar;
        ti tiVar2 = new ti(1, 4, "Info");
        h = tiVar2;
        ti tiVar3 = new ti(2, 5, "Warn");
        i = tiVar3;
        ti tiVar4 = new ti(3, 6, "Error");
        j = tiVar4;
        ti[] tiVarArr = {tiVar, tiVar2, tiVar3, tiVar4};
        k = tiVarArr;
        l = new mj0(tiVarArr);
    }

    public ti(int i2, int i3, String str) {
        this.f = i3;
    }

    public static ti valueOf(String str) {
        return (ti) Enum.valueOf(ti.class, str);
    }

    public static ti[] values() {
        return (ti[]) k.clone();
    }
}
