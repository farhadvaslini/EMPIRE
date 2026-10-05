package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public s4 b(TypedArray typedArray, Resources.Theme theme, String str, int i) throws XmlPullParserException, IOException {
        s4 s4Var;
        Object obj = null;
        int i2 = 0;
        if (jo3.n((XmlPullParser) this.d, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 < 28 || i3 > 31) {
                try {
                    s4Var = s4.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    s4Var = null;
                }
                if (s4Var == null) {
                    s4Var = new s4(i2, obj);
                }
            } else {
                s4Var = new s4(typedValue.data, obj);
            }
        }
        e(typedArray.getChangingConfigurations());
        return s4Var;
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
