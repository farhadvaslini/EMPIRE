package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class g1 extends d1 {
    public static g1 c;

    @Override // defpackage.d1
    public final int[] e(int i) {
        int length = i().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && i().charAt(i) == '\n' && (i().charAt(i) == '\n' || (i != 0 && i().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !r(i2)) {
            i2++;
        }
        return h(i, i2);
    }

    @Override // defpackage.d1
    public final int[] p(int i) {
        int length = i().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && i().charAt(i - 1) == '\n' && !r(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (i().charAt(i2) == '\n' || (i2 != 0 && i().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return h(i2, i);
    }

    public final boolean r(int i) {
        if (i <= 0 || i().charAt(i - 1) == '\n') {
            return false;
        }
        return i == i().length() || i().charAt(i) == '\n';
    }
}
