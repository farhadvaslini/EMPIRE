package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jm1 {
    public static im1 a(Object obj, Object obj2) {
        im1 im1VarB = (im1) obj;
        im1 im1Var = (im1) obj2;
        if (!im1Var.isEmpty()) {
            if (!im1VarB.f) {
                im1VarB = im1VarB.b();
            }
            im1VarB.a();
            if (!im1Var.isEmpty()) {
                im1VarB.putAll(im1Var);
            }
        }
        return im1VarB;
    }
}
