package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class es {
    public static final es f;
    public static final es g;
    public static final es h;
    public static final es i;
    public static final es j;
    public static final /* synthetic */ es[] k;

    static {
        es esVar = new es("NotInstalled", 0);
        f = esVar;
        es esVar2 = new es("UpdateAvailable", 1);
        g = esVar2;
        es esVar3 = new es("Latest", 2);
        h = esVar3;
        es esVar4 = new es("LocalNewer", 3);
        i = esVar4;
        es esVar5 = new es("Incompatible", 4);
        j = esVar5;
        k = new es[]{esVar, esVar2, esVar3, esVar4, esVar5};
    }

    public static es valueOf(String str) {
        return (es) Enum.valueOf(es.class, str);
    }

    public static es[] values() {
        return (es[]) k.clone();
    }
}
