package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class x90 {
    public static final vb2 a;

    static {
        a = new vb2((30 & 1) == 0, zs2.f, true, 0);
    }

    public static final void a(je3 je3Var, xd3 xd3Var, nv0 nv0Var, int i) {
        nv0 nv0Var2;
        Context context;
        nv0Var.b0(1904307118);
        int i2 = (nv0Var.f(je3Var) ? 4 : 2) | i | (nv0Var.h(xd3Var) ? 32 : 16);
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                nv0Var.a0(-1009482584);
                context = (Context) nv0Var.j(x7.b);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-1009433480);
                nv0Var.p(false);
                context = null;
            }
            boolean zH = nv0Var.h(xd3Var) | ((i2 & 14) == 4) | nv0Var.h(context);
            Object objO = nv0Var.O();
            if (zH || objO == c20.a) {
                objO = new v1(xd3Var, context, je3Var, 7);
                nv0Var.j0(objO);
            }
            nv0Var2 = nv0Var;
            m40.b(null, null, (ns0) objO, nv0Var2, 0, 3);
        } else {
            nv0Var2 = nv0Var;
            nv0Var2.U();
        }
        xj2 xj2VarT = nv0Var2.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i, 13, je3Var, xd3Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x0655, code lost:
    
        r4 = new defpackage.x01(r21.b(), r13 | r10.a);
        r15.a.put(r2, new java.lang.ref.WeakReference(r4));
        r0 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x054b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x029d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final int i, long j, nv0 nv0Var, final int i2) throws XmlPullParserException, IOException {
        TypedValue typedValue;
        int i3;
        boolean z;
        Object obj;
        Object g9Var;
        o32 wmVar;
        Object xmVar;
        long jB;
        long j2;
        int i4;
        int i5;
        int i6;
        char c;
        int i7;
        TypedArray typedArrayObtainStyledAttributes;
        int i8;
        TypedArray typedArrayObtainStyledAttributes2;
        int i9;
        int i10;
        int i11;
        char c2;
        int i12;
        int i13;
        ColorStateList colorStateListA;
        final long j3 = j;
        nv0Var.b0(-1240244237);
        int i14 = (i2 & 6) == 0 ? i2 | (nv0Var.d(i) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i14 |= nv0Var.e(j3) ? 32 : 16;
        }
        int i15 = i14;
        if (nv0Var.R(i15 & 1, (i15 & 19) != 18)) {
            ee2 ee2Var = x7.b;
            Context context = (Context) nv0Var.j(ee2Var);
            boolean zF = nv0Var.f(context) | ((i15 & 14) == 4);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                objO = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                nv0Var.j0(objO);
            }
            int iIntValue = ((Number) objO).intValue();
            if (iIntValue == -1) {
                xj2 xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    final int i16 = 1;
                    xj2VarT.d = new rs0() { // from class: v90
                        @Override // defpackage.rs0
                        public final Object f(Object obj2, Object obj3) throws XmlPullParserException, IOException {
                            int i17 = i16;
                            dm3 dm3Var = dm3.a;
                            int i18 = i2;
                            long j4 = j3;
                            int i19 = i;
                            nv0 nv0Var2 = (nv0) obj2;
                            ((Integer) obj3).getClass();
                            switch (i17) {
                                case 0:
                                    x90.b(i19, j4, nv0Var2, jo3.y(i18 | 1));
                                    break;
                                default:
                                    x90.b(i19, j4, nv0Var2, jo3.y(i18 | 1));
                                    break;
                            }
                            return dm3Var;
                        }
                    };
                    return;
                }
                return;
            }
            Context context2 = (Context) nv0Var.j(ee2Var);
            Resources resources = (Resources) nv0Var.j(x7.c);
            wl2 wl2Var = (wl2) nv0Var.j(x7.e);
            synchronized (wl2Var) {
                typedValue = (TypedValue) wl2Var.a.b(iIntValue);
                if (typedValue == null) {
                    typedValue = new TypedValue();
                    resources.getValue(iIntValue, typedValue, true);
                    or1 or1Var = wl2Var.a;
                    int iD = or1Var.d(iIntValue);
                    Object[] objArr = or1Var.c;
                    Object obj2 = objArr[iD];
                    or1Var.b[iD] = iIntValue;
                    objArr[iD] = typedValue;
                }
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence == null || !y93.j0(charSequence, ".xml")) {
                i3 = i15;
                z = true;
                nv0Var.a0(-1771643000);
                boolean zF2 = nv0Var.f(context2.getTheme()) | nv0Var.f(charSequence) | nv0Var.d(iIntValue);
                Object objO2 = nv0Var.O();
                if (zF2 || objO2 == c20.a) {
                    obj = null;
                    try {
                        Drawable drawable = resources.getDrawable(iIntValue, null);
                        drawable.getClass();
                        g9Var = new g9(((BitmapDrawable) drawable).getBitmap());
                        nv0Var.j0(g9Var);
                    } catch (Exception e) {
                        throw new kz("Error attempting to load resource: " + ((Object) charSequence), e);
                    }
                } else {
                    g9Var = objO2;
                    obj = null;
                }
                wmVar = new wm((g9) g9Var);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-1771798434);
                Resources.Theme theme = context2.getTheme();
                int i17 = typedValue.changingConfigurations;
                z01 z01Var = (z01) nv0Var.j(x7.d);
                y01 y01Var = new y01(theme, iIntValue);
                WeakReference weakReference = (WeakReference) z01Var.a.get(y01Var);
                x01 x01Var = weakReference != null ? (x01) weakReference.get() : null;
                if (x01Var == null) {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!s51.n(xml.getName(), "vector")) {
                        c.p("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return;
                    }
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    kc kcVar = new kc();
                    kcVar.d = xml;
                    kcVar.a = 0;
                    e4 e4Var = new e4();
                    e4Var.b = new float[64];
                    kcVar.e = e4Var;
                    int[] iArr = vm1.a;
                    TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr, 0, 0);
                    kcVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                    boolean z2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null ? typedArrayObtainAttributes.getBoolean(5, false) : false;
                    kcVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                    float fC = kcVar.c(typedArrayObtainAttributes, "viewportWidth", 7, 0.0f);
                    float fC2 = kcVar.c(typedArrayObtainAttributes, "viewportHeight", 8, 0.0f);
                    if (fC <= 0.0f) {
                        throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                    }
                    if (fC2 <= 0.0f) {
                        throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                    }
                    float dimension = typedArrayObtainAttributes.getDimension(3, 0.0f);
                    kcVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                    float dimension2 = typedArrayObtainAttributes.getDimension(2, 0.0f);
                    kcVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                    if (typedArrayObtainAttributes.hasValue(1)) {
                        TypedValue typedValue2 = new TypedValue();
                        typedArrayObtainAttributes.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            i3 = i15;
                            j2 = wx.g;
                            i4 = typedArrayObtainAttributes.getInt(6, -1);
                            kcVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                            if (i4 == -1) {
                                i5 = 5;
                                float f = dimension / resources.getDisplayMetrics().density;
                                float f2 = dimension2 / resources.getDisplayMetrics().density;
                                typedArrayObtainAttributes.recycle();
                                v01 v01Var = new v01(null, f, f2, fC, fC2, j2, i5, z2, 1);
                                int i18 = 0;
                                while (true) {
                                    z = true;
                                    if (xml.getEventType() != 1) {
                                        if (xml.getDepth() >= 1 || xml.getEventType() != 3) {
                                            List listA = ni0.f;
                                            XmlPullParser xmlPullParser = (XmlPullParser) kcVar.d;
                                            int i19 = i18;
                                            e4 e4Var2 = (e4) kcVar.e;
                                            XmlResourceParser xmlResourceParser = xml;
                                            int eventType = xmlPullParser.getEventType();
                                            if (eventType != 2) {
                                                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                                    int i20 = i19 + 1;
                                                    for (int i21 = 0; i21 < i20; i21++) {
                                                        ArrayList arrayList = v01Var.i;
                                                        if (v01Var.k) {
                                                            m21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                        }
                                                        u01 u01Var = (u01) arrayList.remove(arrayList.size() - 1);
                                                        ((u01) arrayList.get(arrayList.size() - 1)).j.add(new uo3(u01Var.a, u01Var.b, u01Var.c, u01Var.d, u01Var.e, u01Var.f, u01Var.g, u01Var.h, u01Var.i, u01Var.j));
                                                    }
                                                    int[] iArr2 = kcVar.b;
                                                    if (iArr2 == null || (i13 = kcVar.c) == 0) {
                                                        i6 = i17;
                                                        i18 = 0;
                                                        c = '\t';
                                                    } else {
                                                        int i22 = i13 - 1;
                                                        kcVar.c = i22;
                                                        i18 = iArr2[i22];
                                                        i6 = i17;
                                                        c = '\t';
                                                    }
                                                }
                                                i6 = i17;
                                                c = '\t';
                                                i18 = i19;
                                            } else {
                                                String name = xmlPullParser.getName();
                                                if (name != null) {
                                                    int iHashCode = name.hashCode();
                                                    i6 = i17;
                                                    if (iHashCode == -1649314686) {
                                                        c = '\t';
                                                        if (name.equals("clip-path")) {
                                                            int[] iArr3 = vm1.d;
                                                            if (theme == null) {
                                                                typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                                                                i7 = 0;
                                                            } else {
                                                                i7 = 0;
                                                                typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, 0, 0);
                                                            }
                                                            kcVar.e(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                            String string = typedArrayObtainStyledAttributes.getString(i7);
                                                            kcVar.e(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                            String str = string == null ? "" : string;
                                                            String string2 = typedArrayObtainStyledAttributes.getString(1);
                                                            kcVar.e(typedArrayObtainStyledAttributes.getChangingConfigurations());
                                                            if (string2 == null) {
                                                                int i23 = vo3.a;
                                                            } else {
                                                                listA = e4.a(e4Var2, string2);
                                                            }
                                                            List list = listA;
                                                            typedArrayObtainStyledAttributes.recycle();
                                                            if (v01Var.k) {
                                                                m21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                            }
                                                            v01Var.i.add(new u01(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list, 512));
                                                            i18 = i19 + 1;
                                                        } else {
                                                            i18 = i19;
                                                        }
                                                    } else if (iHashCode != 3433509) {
                                                        if (iHashCode == 98629247 && name.equals("group")) {
                                                            int[] iArr4 = vm1.b;
                                                            TypedArray typedArrayObtainAttributes2 = theme == null ? resources.obtainAttributes(attributeSetAsAttributeSet, iArr4) : theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr4, 0, 0);
                                                            kcVar.e(typedArrayObtainAttributes2.getChangingConfigurations());
                                                            float fC3 = kcVar.c(typedArrayObtainAttributes2, "rotation", 5, 0.0f);
                                                            float f3 = typedArrayObtainAttributes2.getFloat(1, 0.0f);
                                                            kcVar.e(typedArrayObtainAttributes2.getChangingConfigurations());
                                                            float f4 = typedArrayObtainAttributes2.getFloat(2, 0.0f);
                                                            kcVar.e(typedArrayObtainAttributes2.getChangingConfigurations());
                                                            float fC4 = kcVar.c(typedArrayObtainAttributes2, "scaleX", 3, 1.0f);
                                                            float fC5 = kcVar.c(typedArrayObtainAttributes2, "scaleY", 4, 1.0f);
                                                            float fC6 = kcVar.c(typedArrayObtainAttributes2, "translateX", 6, 0.0f);
                                                            float fC7 = kcVar.c(typedArrayObtainAttributes2, "translateY", 7, 0.0f);
                                                            String string3 = typedArrayObtainAttributes2.getString(0);
                                                            kcVar.e(typedArrayObtainAttributes2.getChangingConfigurations());
                                                            String str2 = string3 == null ? "" : string3;
                                                            typedArrayObtainAttributes2.recycle();
                                                            int i24 = vo3.a;
                                                            if (v01Var.k) {
                                                                m21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                            }
                                                            v01Var.i.add(new u01(str2, fC3, f3, f4, fC4, fC5, fC6, fC7, listA, 512));
                                                            int[] iArrCopyOf = kcVar.b;
                                                            if (iArrCopyOf == null) {
                                                                iArrCopyOf = new int[4];
                                                                kcVar.b = iArrCopyOf;
                                                            } else if (kcVar.c >= iArrCopyOf.length) {
                                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                                                kcVar.b = iArrCopyOf;
                                                            }
                                                            int i25 = kcVar.c;
                                                            kcVar.c = i25 + 1;
                                                            iArrCopyOf[i25] = i19;
                                                            i18 = 0;
                                                            c = '\t';
                                                        }
                                                    } else if (name.equals("path")) {
                                                        int[] iArr5 = vm1.c;
                                                        if (theme == null) {
                                                            typedArrayObtainStyledAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr5);
                                                            i8 = 0;
                                                        } else {
                                                            i8 = 0;
                                                            typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr5, 0, 0);
                                                        }
                                                        kcVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                                            c.p("No path data available");
                                                            return;
                                                        }
                                                        String string4 = typedArrayObtainStyledAttributes2.getString(i8);
                                                        kcVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                        String str3 = string4 == null ? "" : string4;
                                                        String string5 = typedArrayObtainStyledAttributes2.getString(2);
                                                        kcVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                        if (string5 == null) {
                                                            int i26 = vo3.a;
                                                        } else {
                                                            listA = e4.a(e4Var2, string5);
                                                        }
                                                        List list2 = listA;
                                                        s4 s4VarB = kcVar.b(typedArrayObtainStyledAttributes2, theme, "fillColor", 1);
                                                        float fC8 = kcVar.c(typedArrayObtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                                        int i27 = !jo3.n((XmlPullParser) kcVar.d, "strokeLineCap") ? -1 : typedArrayObtainStyledAttributes2.getInt(8, -1);
                                                        kcVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                        if (i27 == 0) {
                                                            i9 = 0;
                                                            i10 = jo3.n((XmlPullParser) kcVar.d, "strokeLineJoin") ? -1 : typedArrayObtainStyledAttributes2.getInt(9, -1);
                                                            kcVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                            if (i10 != 0) {
                                                                if (i10 == 1) {
                                                                    i11 = 1;
                                                                } else if (i10 == 2) {
                                                                    i11 = 2;
                                                                }
                                                                float fC9 = kcVar.c(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                                s4 s4VarB2 = kcVar.b(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                                float fC10 = kcVar.c(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                                float fC11 = kcVar.c(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                                float fC12 = kcVar.c(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                                float fC13 = kcVar.c(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                                float fC14 = kcVar.c(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                                if (jo3.n((XmlPullParser) kcVar.d, "fillType")) {
                                                                    c2 = '\r';
                                                                    i12 = typedArrayObtainStyledAttributes2.getInt(13, 0);
                                                                } else {
                                                                    c2 = '\r';
                                                                    i12 = 0;
                                                                }
                                                                kcVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                                typedArrayObtainStyledAttributes2.recycle();
                                                                Shader shader = (Shader) s4VarB.b;
                                                                int i28 = s4VarB.a;
                                                                dp epVar = (shader != null && i28 == 0) ? null : shader != null ? new ep(shader) : new w73(vp.b(i28));
                                                                Shader shader2 = (Shader) s4VarB2.b;
                                                                int i29 = s4VarB2.a;
                                                                dp epVar2 = (shader2 == null && i29 == 0) ? null : shader2 != null ? new ep(shader2) : new w73(vp.b(i29));
                                                                int i30 = i12 != 0 ? 0 : 1;
                                                                if (v01Var.k) {
                                                                    m21.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                                }
                                                                ((u01) v01Var.i.get(r0.size() - 1)).j.add(new yo3(str3, list2, i30, epVar, fC8, epVar2, fC10, fC11, i9, i11, fC9, fC14, fC12, fC13));
                                                                i18 = i19;
                                                                c = '\t';
                                                            }
                                                            i11 = 0;
                                                            float fC92 = kcVar.c(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                            s4 s4VarB22 = kcVar.b(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                            float fC102 = kcVar.c(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                            float fC112 = kcVar.c(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                            float fC122 = kcVar.c(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                            float fC132 = kcVar.c(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                            float fC142 = kcVar.c(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                            if (jo3.n((XmlPullParser) kcVar.d, "fillType")) {
                                                            }
                                                            kcVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                            typedArrayObtainStyledAttributes2.recycle();
                                                            Shader shader3 = (Shader) s4VarB.b;
                                                            int i282 = s4VarB.a;
                                                            if (shader3 != null) {
                                                                Shader shader22 = (Shader) s4VarB22.b;
                                                                int i292 = s4VarB22.a;
                                                                if (shader22 == null) {
                                                                    if (i12 != 0) {
                                                                    }
                                                                    if (v01Var.k) {
                                                                    }
                                                                    ((u01) v01Var.i.get(r0.size() - 1)).j.add(new yo3(str3, list2, i30, epVar, fC8, epVar2, fC102, fC112, i9, i11, fC92, fC142, fC122, fC132));
                                                                    i18 = i19;
                                                                    c = '\t';
                                                                }
                                                            }
                                                        } else {
                                                            if (i27 == 1) {
                                                                i9 = 1;
                                                            } else if (i27 == 2) {
                                                                i9 = 2;
                                                            }
                                                            if (jo3.n((XmlPullParser) kcVar.d, "strokeLineJoin")) {
                                                            }
                                                            kcVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                            if (i10 != 0) {
                                                            }
                                                            i11 = 0;
                                                            float fC922 = kcVar.c(typedArrayObtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                            s4 s4VarB222 = kcVar.b(typedArrayObtainStyledAttributes2, theme, "strokeColor", 3);
                                                            float fC1022 = kcVar.c(typedArrayObtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                            float fC1122 = kcVar.c(typedArrayObtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                            float fC1222 = kcVar.c(typedArrayObtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                            float fC1322 = kcVar.c(typedArrayObtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                            float fC1422 = kcVar.c(typedArrayObtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                            if (jo3.n((XmlPullParser) kcVar.d, "fillType")) {
                                                            }
                                                            kcVar.e(typedArrayObtainStyledAttributes2.getChangingConfigurations());
                                                            typedArrayObtainStyledAttributes2.recycle();
                                                            Shader shader32 = (Shader) s4VarB.b;
                                                            int i2822 = s4VarB.a;
                                                            if (shader32 != null) {
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i6 = i17;
                                                }
                                                c = '\t';
                                                i18 = i19;
                                            }
                                            xmlResourceParser.next();
                                            xml = xmlResourceParser;
                                            i17 = i6;
                                        } else {
                                            z = true;
                                        }
                                    }
                                }
                            } else {
                                if (i4 == 3) {
                                    i5 = 3;
                                } else if (i4 != 5) {
                                    if (i4 != 9) {
                                        switch (i4) {
                                            case 14:
                                                i5 = 13;
                                                break;
                                            case jo3.g /* 15 */:
                                                i5 = 14;
                                                break;
                                            case 16:
                                                i5 = 12;
                                                break;
                                        }
                                    } else {
                                        i5 = 9;
                                    }
                                }
                                float f5 = dimension / resources.getDisplayMetrics().density;
                                float f22 = dimension2 / resources.getDisplayMetrics().density;
                                typedArrayObtainAttributes.recycle();
                                v01 v01Var2 = new v01(null, f5, f22, fC, fC2, j2, i5, z2, 1);
                                int i182 = 0;
                                while (true) {
                                    z = true;
                                    if (xml.getEventType() != 1) {
                                    }
                                    xmlResourceParser.next();
                                    xml = xmlResourceParser;
                                    i17 = i6;
                                }
                            }
                        } else {
                            if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                                TypedValue typedValue3 = new TypedValue();
                                typedArrayObtainAttributes.getValue(1, typedValue3);
                                int i31 = typedValue3.type;
                                if (i31 == 2) {
                                    throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                                }
                                if (i31 < 28 || i31 > 31) {
                                    Resources resources2 = typedArrayObtainAttributes.getResources();
                                    i3 = i15;
                                    int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
                                    ThreadLocal threadLocal = ly.a;
                                    try {
                                        colorStateListA = ly.a(resources2, resources2.getXml(resourceId), theme);
                                    } catch (Exception e2) {
                                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                                        colorStateListA = null;
                                    }
                                } else {
                                    colorStateListA = ColorStateList.valueOf(typedValue3.data);
                                    i3 = i15;
                                }
                                kcVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                                jB = colorStateListA == null ? vp.b(colorStateListA.getDefaultColor()) : wx.g;
                            } else {
                                i3 = i15;
                            }
                            colorStateListA = null;
                            kcVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                            if (colorStateListA == null) {
                            }
                        }
                    } else {
                        i3 = i15;
                        jB = wx.g;
                    }
                    j2 = jB;
                    i4 = typedArrayObtainAttributes.getInt(6, -1);
                    kcVar.e(typedArrayObtainAttributes.getChangingConfigurations());
                    if (i4 == -1) {
                    }
                } else {
                    i3 = i15;
                    z = true;
                }
                wmVar = b32.A(x01Var.a, nv0Var);
                nv0Var.p(false);
                obj = null;
            }
            boolean z3 = (i3 & 112) == 32 ? z : false;
            Object objO3 = nv0Var.O();
            if (z3 || objO3 == c20.a) {
                if (j == 16) {
                    j3 = j;
                    xmVar = obj;
                } else {
                    j3 = j;
                    xmVar = new xm(5, j3);
                }
                nv0Var.j0(xmVar);
                objO3 = xmVar;
            } else {
                j3 = j;
            }
            eo.a(r51.w(j43.k(yp1.a, l40.e), wmVar, (yx) objO3), nv0Var, 0);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT2 = nv0Var.t();
        if (xj2VarT2 != null) {
            final int i32 = 0;
            xj2VarT2.d = new rs0() { // from class: v90
                @Override // defpackage.rs0
                public final Object f(Object obj22, Object obj3) throws XmlPullParserException, IOException {
                    int i172 = i32;
                    dm3 dm3Var = dm3.a;
                    int i183 = i2;
                    long j4 = j3;
                    int i192 = i;
                    nv0 nv0Var2 = (nv0) obj22;
                    ((Integer) obj3).getClass();
                    switch (i172) {
                        case 0:
                            x90.b(i192, j4, nv0Var2, jo3.y(i183 | 1));
                            break;
                        default:
                            x90.b(i192, j4, nv0Var2, jo3.y(i183 | 1));
                            break;
                    }
                    return dm3Var;
                }
            };
        }
    }

    public static final void c(je3 je3Var, yd3 yd3Var, cs0 cs0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? nv0Var.f(je3Var) : nv0Var.h(je3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? nv0Var.f(yd3Var) : nv0Var.h(yd3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        boolean z = false;
        if (nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && nv0Var.f(yd3Var));
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            if (z2 || objO == zjVar) {
                objO = new ul1(new yl1(17, new u1(13, yd3Var, cs0Var)));
                nv0Var.j0(objO);
            }
            ul1 ul1Var = (ul1) objO;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && nv0Var.h(je3Var))) {
                z = true;
            }
            Object objO2 = nv0Var.O();
            if (z || objO2 == zjVar) {
                objO2 = new ja(11, je3Var);
                nv0Var.j0(objO2);
            }
            xa.a(ul1Var, (cs0) objO2, a, gq.N(1315155414, new y7(12, yd3Var, je3Var), nv0Var), nv0Var, 3456, 0);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new eb(je3Var, yd3Var, cs0Var, i, 7);
        }
    }

    public static final void d(bq1 bq1Var, d00 d00Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(d00Var) ? 32 : 16;
        }
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            r51.f(bq1Var, he3.a, d00Var, nv0Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new xb(bq1Var, d00Var, i, i3);
        }
    }
}
