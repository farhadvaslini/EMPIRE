package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class or0 implements LayoutInflater.Factory2 {
    public final ur0 f;

    public or0(ur0 ur0Var) {
        this.f = ur0Var;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        boolean zEquals = mr0.class.getName().equals(str);
        ur0 ur0Var = this.f;
        if (zEquals) {
            return new mr0(context, attributeSet, ur0Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, of2.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = gr0.class.isAssignableFrom(sr0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        ur0Var.g();
                    }
                    if (string != null) {
                        pl plVar = ur0Var.c;
                        ArrayList arrayList = (ArrayList) plVar.g;
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            if (arrayList.get(size) != null) {
                                qn1.b();
                                return null;
                            }
                        }
                        Iterator it = ((HashMap) plVar.h).values().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                qn1.b();
                                return null;
                            }
                        }
                    }
                    if (id != -1) {
                        ur0Var.g();
                    }
                    sr0 sr0Var = ur0Var.t;
                    context.getClassLoader();
                    sr0Var.a(attributeValue);
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
