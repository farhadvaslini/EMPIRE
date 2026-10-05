package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dn extends xu1 {
    public final /* synthetic */ int e;

    public static int[] f(String str) {
        return new int[]{((Number) xu1.a.d(str)).intValue()};
    }

    public static long[] g(String str) {
        return new long[]{((Number) xu1.b.d(str)).longValue()};
    }

    public static boolean[] h(String str) {
        return new boolean[]{((Boolean) xu1.c.d(str)).booleanValue()};
    }

    @Override // defpackage.xu1
    public final Object a(String str, Bundle bundle) {
        switch (this.e) {
            case 0:
                bundle.getClass();
                if (!bundle.containsKey(str) || g12.X(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                jo3.q(str);
                throw null;
            case 1:
                bundle.getClass();
                if (!bundle.containsKey(str) || g12.X(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                jo3.q(str);
                throw null;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                bundle.getClass();
                if (!bundle.containsKey(str) || g12.X(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                jo3.q(str);
                throw null;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                bundle.getClass();
                if (!bundle.containsKey(str) || g12.X(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                jo3.q(str);
                throw null;
            default:
                bundle.getClass();
                if (!bundle.containsKey(str) || g12.X(str, bundle)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                jo3.q(str);
                throw null;
        }
    }

    @Override // defpackage.xu1
    public final String b() {
        switch (this.e) {
            case 0:
                return "boolean[]";
            case 1:
                return "float[]";
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return "integer[]";
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return "long[]";
            default:
                return "string[]";
        }
    }

    @Override // defpackage.xu1
    public final Object c(Object obj, String str) {
        switch (this.e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return h(str);
                }
                boolean[] zArrH = h(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrH, 0, zArrCopyOf, length, 1);
                return zArrCopyOf;
            case 1:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return new float[]{Float.parseFloat(str)};
                }
                float[] fArr2 = {Float.parseFloat(str)};
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArr2, 0, fArrCopyOf, length2, 1);
                return fArrCopyOf;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return f(str);
                }
                int[] iArrF = f(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrF, 0, iArrCopyOf, length3, 1);
                return iArrCopyOf;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return g(str);
                }
                long[] jArrG = g(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrG, 0, jArrCopyOf, length4, 1);
                return jArrCopyOf;
            default:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                String[] strArr2 = {str};
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(strArr2, 0, objArrCopyOf, length5, 1);
                return (String[]) objArrCopyOf;
        }
    }

    @Override // defpackage.xu1
    public final Object d(String str) {
        switch (this.e) {
            case 0:
                return h(str);
            case 1:
                return new float[]{Float.parseFloat(str)};
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return f(str);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return g(str);
            default:
                return new String[]{str};
        }
    }

    @Override // defpackage.xu1
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.e) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                str.getClass();
                if (zArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putBooleanArray(str, zArr);
                }
                break;
            case 1:
                float[] fArr = (float[]) obj;
                str.getClass();
                if (fArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putFloatArray(str, fArr);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                int[] iArr = (int[]) obj;
                str.getClass();
                if (iArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putIntArray(str, iArr);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                long[] jArr = (long[]) obj;
                str.getClass();
                if (jArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putLongArray(str, jArr);
                }
                break;
            default:
                String[] strArr = (String[]) obj;
                str.getClass();
                if (strArr == null) {
                    bundle.putString(str, null);
                } else {
                    bundle.putStringArray(str, strArr);
                }
                break;
        }
    }
}
