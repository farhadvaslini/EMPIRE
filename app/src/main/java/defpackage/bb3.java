package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bb3 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public bb3(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        ab3 ab3Var = new ab3(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = ab3Var.a;
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z = z;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            ab3Var.b = 0;
                            ab3Var.c = 0;
                            ab3Var.d = 0;
                            ab3Var.e = 0;
                            ab3Var.f = true;
                            ab3Var.g = true;
                        } else if (name2.equals("item")) {
                            if (!ab3Var.h) {
                                xn1 xn1Var = ab3Var.z;
                                if (xn1Var == null || !xn1Var.b.hasSubMenu()) {
                                    ab3Var.h = true;
                                    ab3Var.b(menu2.add(ab3Var.b, ab3Var.i, ab3Var.j, ab3Var.k));
                                } else {
                                    ab3Var.h = true;
                                    ab3Var.b(menu2.addSubMenu(ab3Var.b, ab3Var.i, ab3Var.j, ab3Var.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z = z;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z = z;
                z2 = z2;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pf2.p);
                        ab3Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        ab3Var.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        ab3Var.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        ab3Var.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        ab3Var.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        ab3Var.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, pf2.q);
                            ab3Var.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            ab3Var.j = (typedArrayObtainStyledAttributes2.getInt(5, ab3Var.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, ab3Var.d) & 65535);
                            ab3Var.k = typedArrayObtainStyledAttributes2.getText(7);
                            ab3Var.l = typedArrayObtainStyledAttributes2.getText(8);
                            ab3Var.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            ab3Var.n = string == null ? (char) 0 : string.charAt(0);
                            ab3Var.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            ab3Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                            ab3Var.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                ab3Var.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                ab3Var.r = ab3Var.e;
                            }
                            ab3Var.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            ab3Var.t = typedArrayObtainStyledAttributes2.getBoolean(4, ab3Var.f);
                            ab3Var.u = typedArrayObtainStyledAttributes2.getBoolean(1, ab3Var.g);
                            ab3Var.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            ab3Var.y = typedArrayObtainStyledAttributes2.getString(12);
                            ab3Var.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            ab3Var.x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && ab3Var.w == 0 && ab3Var.x == null) {
                                ab3Var.z = (xn1) ab3Var.a(string3, f, this.b);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                ab3Var.z = null;
                            }
                            ab3Var.A = typedArrayObtainStyledAttributes2.getText(17);
                            ab3Var.B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                ab3Var.D = wf0.b(typedArrayObtainStyledAttributes2.getInt(19, -1), ab3Var.D);
                            } else {
                                ab3Var.D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = rn.B(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                ab3Var.C = colorStateList;
                            } else {
                                ab3Var.C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            ab3Var.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            ab3Var.h = true;
                            SubMenu subMenuAddSubMenu = menu2.addSubMenu(ab3Var.b, ab3Var.i, ab3Var.j, ab3Var.k);
                            ab3Var.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof nn1)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof nn1) {
                    nn1 nn1Var = (nn1) menu;
                    if (!nn1Var.p) {
                        nn1Var.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((nn1) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((nn1) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
