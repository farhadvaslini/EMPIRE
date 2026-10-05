package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class jq implements Iterable, Serializable {
    public static final jq h = new jq(c51.b);
    public static final zj i;
    public int f = 0;
    public final byte[] g;

    static {
        i = i6.a() ? new zj(3) : new zj(1);
    }

    public jq(byte[] bArr) {
        bArr.getClass();
        this.g = bArr;
    }

    public static int b(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            c.i(by1.h("Beginning index: ", " < 0", i2));
            return 0;
        }
        if (i3 < i2) {
            c.i(nc2.g(i2, i3, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        c.i(nc2.g(i3, i4, "End index: ", " >= "));
        return 0;
    }

    public static jq c(byte[] bArr, int i2, int i3) {
        byte[] bArrCopyOfRange;
        b(i2, i2 + i3, bArr.length);
        switch (i.f) {
            case 1:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3 + i2);
                break;
            default:
                bArrCopyOfRange = new byte[i3];
                System.arraycopy(bArr, i2, bArrCopyOfRange, 0, i3);
                break;
        }
        return new jq(bArrCopyOfRange);
    }

    public byte a(int i2) {
        return this.g[i2];
    }

    public void e(byte[] bArr, int i2) {
        System.arraycopy(this.g, 0, bArr, 0, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jq) || size() != ((jq) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof jq)) {
            return obj.equals(this);
        }
        jq jqVar = (jq) obj;
        int i2 = this.f;
        int i3 = jqVar.f;
        if (i2 != 0 && i3 != 0 && i2 != i3) {
            return false;
        }
        int size = size();
        if (size > jqVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > jqVar.size()) {
            StringBuilder sbM = nc2.m("Ran off end of other: 0, ", ", ", size);
            sbM.append(jqVar.size());
            throw new IllegalArgumentException(sbM.toString());
        }
        byte[] bArr = jqVar.g;
        int iF = f() + size;
        int iF2 = f();
        int iF3 = jqVar.f();
        while (iF2 < iF) {
            if (this.g[iF2] != bArr[iF3]) {
                return false;
            }
            iF2++;
            iF3++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    public byte g(int i2) {
        return this.g[i2];
    }

    public final int hashCode() {
        int i2 = this.f;
        if (i2 != 0) {
            return i2;
        }
        int size = size();
        int iF = f();
        int i3 = size;
        for (int i4 = iF; i4 < iF + size; i4++) {
            i3 = (i3 * 31) + this.g[i4];
        }
        if (i3 == 0) {
            i3 = 1;
        }
        this.f = i3;
        return i3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new hq(this);
    }

    public int size() {
        return this.g.length;
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            strConcat = w22.s(this);
        } else {
            int iB = b(0, 47, size());
            strConcat = w22.s(iB == 0 ? h : new iq(this.g, f(), iB)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return nc2.j(sb, strConcat, "\">");
    }
}
