package defpackage;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kc {
    public int a;
    public int[] b;
    public int c;
    public Object d;
    public Object e;

    public int a(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.d;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            uj.I(jArr, jArr2, 0, 0, jArr.length);
            uj.K(0, 0, 14, this.b, iArr);
            this.d = jArr2;
            this.b = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int length2 = ((int[]) this.e).length;
        if (this.c >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            uj.K(0, 0, 14, (int[]) this.e, iArr2);
            this.e = iArr2;
        }
        int i7 = this.c;
        int[] iArr3 = (int[]) this.e;
        this.c = iArr3[i7];
        long[] jArr3 = (long[]) this.d;
        jArr3[i3] = j;
        this.b[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (s51.s(jArr3[i8], j) <= 0) {
                break;
            }
            d(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.s4 b(android.content.res.TypedArray r5, android.content.res.Resources.Theme r6, java.lang.String r7, int r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            java.lang.Object r0 = r4.d
            org.xmlpull.v1.XmlPullParser r0 = (org.xmlpull.v1.XmlPullParser) r0
            boolean r7 = defpackage.jo3.n(r0, r7)
            r0 = 0
            r1 = 0
            if (r7 == 0) goto L40
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r5.getValue(r8, r7)
            int r2 = r7.type
            r3 = 28
            if (r2 < r3) goto L26
            r3 = 31
            if (r2 > r3) goto L26
            int r6 = r7.data
            s4 r7 = new s4
            r7.<init>(r6, r0)
            goto L45
        L26:
            android.content.res.Resources r7 = r5.getResources()
            int r8 = r5.getResourceId(r8, r1)
            s4 r6 = defpackage.s4.d(r7, r8, r6)     // Catch: java.lang.Exception -> L34
            r7 = r6
            goto L3d
        L34:
            r6 = move-exception
            java.lang.String r7 = "ComplexColorCompat"
            java.lang.String r8 = "Failed to inflate ComplexColor."
            android.util.Log.e(r7, r8, r6)
            r7 = r0
        L3d:
            if (r7 == 0) goto L40
            goto L45
        L40:
            s4 r7 = new s4
            r7.<init>(r1, r0)
        L45:
            int r5 = r5.getChangingConfigurations()
            r4.e(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc.b(android.content.res.TypedArray, android.content.res.Resources$Theme, java.lang.String, int):s4");
    }

    public float c(TypedArray typedArray, String str, int i, float f) {
        if (jo3.n((XmlPullParser) this.d, str)) {
            f = typedArray.getFloat(i, f);
        }
        e(typedArray.getChangingConfigurations());
        return f;
    }

    public void d(int i, int i2) {
        long[] jArr = (long[]) this.d;
        int[] iArr = this.b;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public void e(int i) {
        this.a = i | this.a;
    }
}
