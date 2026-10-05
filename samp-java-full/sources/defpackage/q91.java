package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q91 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ nu1 g;

    public /* synthetic */ q91(nu1 nu1Var, int i) {
        this.f = i;
        this.g = nu1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // defpackage.cs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        boolean z;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        nu1 nu1Var = this.g;
        switch (i) {
            case 0:
                nu1Var.c();
                break;
            case 1:
                nu1Var.c();
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nu1Var.c();
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nu1Var.c();
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nu1Var.c();
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                nu1Var.c();
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nu1Var.c();
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                nu1Var.c();
                break;
            case 8:
                nu1.b(nu1Var, "log_launcher");
                break;
            case vr.g /* 9 */:
                nu1.b(nu1Var, "log_samp");
                break;
            case vr.h /* 10 */:
                nu1.b(nu1Var, "log_chat");
                break;
            case 11:
                nu1.b(nu1Var, "log_raksamp");
                break;
            case vr.i /* 12 */:
                nu1.b(nu1Var, "log_launcher");
                break;
            case 13:
                nu1.b(nu1Var, "log_samp");
                break;
            case 14:
                nu1.b(nu1Var, "settings_general");
                break;
            case jo3.g /* 15 */:
                nu1.b(nu1Var, "settings_ingame");
                break;
            case 16:
                nu1.b(nu1Var, "settings_notifications");
                break;
            case 17:
                nu1.b(nu1Var, "settings_debug");
                break;
            case 18:
                nu1.b(nu1Var, "settings_about");
                break;
            case 19:
                nu1Var.c();
                break;
            case 20:
                nu1Var.c();
                break;
            case 21:
                nu1Var.c();
                break;
            default:
                tk tkVar = nu1Var.f;
                if (nu1Var.g) {
                    z = nu1Var.a() > 1;
                }
                tkVar.f(z);
                break;
        }
        return dm3Var;
    }
}
