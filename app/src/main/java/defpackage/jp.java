package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jp {
    public static final jp f;
    public static final jp g;
    public static final jp h;
    public static final /* synthetic */ jp[] i;

    static {
        jp jpVar = new jp("SUSPEND", 0);
        f = jpVar;
        jp jpVar2 = new jp("DROP_OLDEST", 1);
        g = jpVar2;
        jp jpVar3 = new jp("DROP_LATEST", 2);
        h = jpVar3;
        i = new jp[]{jpVar, jpVar2, jpVar3};
    }

    public static jp valueOf(String str) {
        return (jp) Enum.valueOf(jp.class, str);
    }

    public static jp[] values() {
        return (jp[]) i.clone();
    }
}
