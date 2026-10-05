package defpackage;

import top.th1nk.samp.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qw1 {
    public static final qw1 g;
    public static final qw1 h;
    public static final qw1 i;
    public static final qw1 j;
    public static final qw1 k;
    public static final qw1 l;
    public static final qw1 m;
    public static final qw1 n;
    public static final /* synthetic */ qw1[] o;
    public static final /* synthetic */ mj0 p;
    public final int f;

    static {
        qw1 qw1Var = new qw1(0, R.string.game_network_filter_category_session, "Session");
        g = qw1Var;
        qw1 qw1Var2 = new qw1(1, R.string.game_network_filter_category_player, "Player");
        h = qw1Var2;
        qw1 qw1Var3 = new qw1(2, R.string.game_network_filter_category_camera, "Camera");
        i = qw1Var3;
        qw1 qw1Var4 = new qw1(3, R.string.game_network_filter_category_vehicle, "Vehicle");
        j = qw1Var4;
        qw1 qw1Var5 = new qw1(4, R.string.game_network_filter_category_world, "World");
        k = qw1Var5;
        qw1 qw1Var6 = new qw1(5, R.string.game_network_filter_category_interface, "Interface");
        l = qw1Var6;
        qw1 qw1Var7 = new qw1(6, R.string.game_network_filter_category_animation, "Animation");
        m = qw1Var7;
        qw1 qw1Var8 = new qw1(7, R.string.game_network_filter_category_sync, "Sync");
        n = qw1Var8;
        qw1[] qw1VarArr = {qw1Var, qw1Var2, qw1Var3, qw1Var4, qw1Var5, qw1Var6, qw1Var7, qw1Var8};
        o = qw1VarArr;
        p = new mj0(qw1VarArr);
    }

    public qw1(int i2, int i3, String str) {
        this.f = i3;
    }

    public static qw1 valueOf(String str) {
        return (qw1) Enum.valueOf(qw1.class, str);
    }

    public static qw1[] values() {
        return (qw1[]) o.clone();
    }
}
