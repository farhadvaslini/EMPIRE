package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ly {
    public static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i;
        int[] iArr;
        int i2;
        int iP;
        float f;
        int i3;
        float fCbrt;
        TypedValue typedValue;
        ?? r0 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr3 = nf2.a;
                ?? ObtainAttributes = theme2 == null ? r0.obtainAttributes(attributeSet2, iArr3) : theme2.obtainStyledAttributes(attributeSet2, iArr3, i4, i4);
                int resourceId = ObtainAttributes.getResourceId(i4, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r0.getValue(resourceId, typedValue, r4);
                    int i6 = typedValue.type;
                    if (i6 < 28 || i6 > 31) {
                        try {
                            color = a(r0, r0.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i4, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i4, -65281);
                    }
                    float f2 = ObtainAttributes.hasValue(r4) ? ObtainAttributes.getFloat(r4, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    ?? r16 = r4;
                    float f3 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                    ObtainAttributes.recycle();
                    int attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i7 = i4;
                    int i8 = i7;
                    while (i7 < attributeCount) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i7);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                            int i9 = i8 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i7, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i8] = attributeNameResource;
                            i8 = i9;
                        }
                        i7++;
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i8);
                    float f4 = 100.0f;
                    boolean z = (f3 < 0.0f || f3 > 100.0f) ? false : r16 == true ? 1 : 0;
                    if (f2 != 1.0f || z) {
                        int iAlpha = (int) ((Color.alpha(color) * f2) + 0.5f);
                        if (iAlpha < 0) {
                            i = 0;
                        } else {
                            i = 255;
                            if (iAlpha <= 255) {
                                i = iAlpha;
                            }
                        }
                        if (z) {
                            cr crVarA = cr.a(color);
                            float f5 = crVarA.a;
                            float f6 = crVarA.b;
                            lr3 lr3Var = lr3.k;
                            if (f6 < 1.0d || Math.round(f3) <= 0.0d || Math.round(f3) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                i2 = depth2;
                                iP = n92.p(f3);
                            } else {
                                float fMin = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
                                float f7 = 0.0f;
                                float f8 = f6;
                                boolean z2 = r16 == true ? 1 : 0;
                                cr crVar = null;
                                while (true) {
                                    if (Math.abs(f7 - f6) >= 0.4f) {
                                        float f9 = 1000.0f;
                                        float f10 = f4;
                                        float f11 = 0.0f;
                                        float f12 = 1000.0f;
                                        cr crVar2 = null;
                                        while (true) {
                                            if (Math.abs(f11 - f10) <= 0.01f) {
                                                iArr = iArrTrimStateSet;
                                                i2 = depth2;
                                                f = f4;
                                                break;
                                            }
                                            f = f4;
                                            float f13 = ((f10 - f11) / 2.0f) + f11;
                                            iArr = iArrTrimStateSet;
                                            int iD = cr.b(f13, f8, fMin).d(lr3.k);
                                            float fT = n92.t(Color.red(iD));
                                            float fT2 = n92.t(Color.green(iD));
                                            float fT3 = n92.t(Color.blue(iD));
                                            float[] fArr = n92.j[r16 == true ? 1 : 0];
                                            float f14 = ((fT3 * fArr[2]) + ((fT2 * fArr[r16 == true ? 1 : 0]) + (fT * fArr[0]))) / f;
                                            if (f14 <= 0.008856452f) {
                                                fCbrt = f14 * 903.2963f;
                                                i3 = iD;
                                            } else {
                                                i3 = iD;
                                                fCbrt = (((float) Math.cbrt(f14)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f3 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                cr crVarA2 = cr.a(i3);
                                                cr crVarB = cr.b(crVarA2.c, crVarA2.b, fMin);
                                                float f15 = crVarA2.d - crVarB.d;
                                                float f16 = crVarA2.e - crVarB.e;
                                                float f17 = crVarA2.f - crVarB.f;
                                                i2 = depth2;
                                                float fPow = (float) (Math.pow(Math.sqrt((f17 * f17) + (f16 * f16) + (f15 * f15)), 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    f12 = fPow;
                                                    f9 = fAbs;
                                                    crVar2 = crVarA2;
                                                }
                                            } else {
                                                i2 = depth2;
                                            }
                                            if (f9 == 0.0f && f12 == 0.0f) {
                                                break;
                                            }
                                            if (fCbrt < f3) {
                                                f11 = f13;
                                            } else {
                                                f10 = f13;
                                            }
                                            f4 = f;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i2;
                                        }
                                        cr crVar3 = crVar2;
                                        if (!z2) {
                                            if (crVar3 == null) {
                                                f6 = f8;
                                            } else {
                                                crVar = crVar3;
                                                f7 = f8;
                                            }
                                            f8 = ((f6 - f7) / 2.0f) + f7;
                                            f4 = f;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i2;
                                        } else {
                                            if (crVar3 != null) {
                                                iP = crVar3.d(lr3Var);
                                                break;
                                            }
                                            f8 = ((f6 - f7) / 2.0f) + f7;
                                            f4 = f;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i2;
                                            z2 = false;
                                        }
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        i2 = depth2;
                                        iP = crVar == null ? n92.p(f3) : crVar.d(lr3Var);
                                    }
                                }
                            }
                            color = iP;
                        } else {
                            iArr = iArrTrimStateSet;
                            i2 = depth2;
                        }
                        color = (16777215 & color) | (i << 24);
                    } else {
                        iArr = iArrTrimStateSet;
                        i2 = depth2;
                    }
                    int i10 = i5 + 1;
                    if (i10 > iArr2.length) {
                        int[] iArr5 = new int[i5 <= 4 ? 8 : i5 * 2];
                        System.arraycopy(iArr2, 0, iArr5, 0, i5);
                        iArr2 = iArr5;
                    }
                    iArr2[i5] = color;
                    if (i10 > objArr.length) {
                        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5 > 4 ? i5 * 2 : 8);
                        System.arraycopy(objArr, 0, objArr2, 0, i5);
                        objArr = objArr2;
                    }
                    objArr[i5] = iArr;
                    objArr = (int[][]) objArr;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i5 = i10;
                    r4 = r16 == true ? 1 : 0;
                    depth2 = i2;
                    i4 = 0;
                    r0 = resources;
                }
            } else {
                int i11 = depth2;
                r0 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                r4 = r4 == true ? 1 : 0;
                depth2 = i11;
                i4 = 0;
            }
        }
        int[] iArr6 = new int[i5];
        int[][] iArr7 = new int[i5][];
        System.arraycopy(iArr2, 0, iArr6, 0, i5);
        System.arraycopy(objArr, 0, iArr7, 0, i5);
        return new ColorStateList(iArr7, iArr6);
    }
}
