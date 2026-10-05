package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class df {
    public static final df f;
    public static final df g;
    public static final df h;
    public static final df i;
    public static final df j;
    public static final df k;
    public static final df l;
    public static final /* synthetic */ df[] m;

    static {
        df dfVar = new df("Paragraph", 0);
        f = dfVar;
        df dfVar2 = new df("Span", 1);
        g = dfVar2;
        df dfVar3 = new df("VerbatimTts", 2);
        h = dfVar3;
        df dfVar4 = new df("Url", 3);
        i = dfVar4;
        df dfVar5 = new df("Link", 4);
        j = dfVar5;
        df dfVar6 = new df("Clickable", 5);
        k = dfVar6;
        df dfVar7 = new df("String", 6);
        l = dfVar7;
        m = new df[]{dfVar, dfVar2, dfVar3, dfVar4, dfVar5, dfVar6, dfVar7};
    }

    public static df valueOf(String str) {
        return (df) Enum.valueOf(df.class, str);
    }

    public static df[] values() {
        return (df[]) m.clone();
    }
}
