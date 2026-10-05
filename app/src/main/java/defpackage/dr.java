package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dr implements fp0 {
    public static final dr a = new dr();
    public static Boolean b;

    @Override // defpackage.fp0
    public final boolean b() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw nc2.d("canFocus is read before it is written");
    }

    @Override // defpackage.fp0
    public final void c(boolean z) {
        b = Boolean.valueOf(z);
    }
}
