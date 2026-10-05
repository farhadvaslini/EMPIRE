package defpackage;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tb {
    public final ub a;
    public final rb b;
    public final rb c;
    public final View d;

    public tb(ub ubVar, rb rbVar, rb rbVar2, View view) {
        this.a = ubVar;
        this.b = rbVar;
        this.c = rbVar2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        xd3 xd3Var = (xd3) this.b.a();
        final int i2 = 0;
        if (s51.n(xd3Var, null)) {
            return false;
        }
        menu.clear();
        List list = xd3Var.a;
        int size = list.size();
        final int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        while (i4 < size) {
            wd3 wd3Var = (wd3) list.get(i4);
            if (wd3Var instanceof ee3) {
                i = i5 + 1;
                Object obj = wd3Var.a;
                final ee3 ee3Var = (ee3) wd3Var;
                MenuItem menuItemAdd = menu.add(i6, s51.n(obj, r51.J1) ? R.id.cut : s51.n(obj, r51.K1) ? R.id.copy : s51.n(obj, r51.L1) ? R.id.paste : s51.n(obj, r51.M1) ? R.id.selectAll : s51.n(obj, r51.N1) ? R.id.autofill : i5, i5, ee3Var.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: sb
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        int i7 = i2;
                        Object obj2 = this;
                        Object obj3 = ee3Var;
                        switch (i7) {
                            case 0:
                                ((ee3) obj3).d.h(((tb) obj2).a);
                                break;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                jo3.w(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (wd3Var instanceof ke3) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i5 + 1;
                        final Context context = this.d.getContext();
                        ke3 ke3Var = (ke3) wd3Var;
                        final TextClassification textClassification = ke3Var.b;
                        int i7 = ke3Var.c;
                        Drawable drawable = ke3Var.d;
                        if (i7 < 0) {
                            MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i5, textClassification.getLabel());
                            menuItemAdd2.setShowAsAction(2);
                            menuItemAdd2.setIcon(drawable);
                            menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: sb
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    int i72 = i3;
                                    Object obj2 = textClassification;
                                    Object obj3 = context;
                                    switch (i72) {
                                        case 0:
                                            ((ee3) obj3).d.h(((tb) obj2).a);
                                            break;
                                        default:
                                            Context context2 = (Context) obj3;
                                            TextClassification textClassification2 = (TextClassification) obj2;
                                            String text = textClassification2.getText();
                                            jo3.w(PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592));
                                            break;
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i8 = i7 == 0 ? 1 : i2;
                            final RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i7);
                            MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i8 != 0 ? 16908353 : i2, i5, remoteAction.getTitle());
                            menuItemAdd3.setShowAsAction(i8 == 0 ? 0 : 2);
                            if (drawable != null) {
                                menuItemAdd3.setIcon(drawable);
                            }
                            menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ih3
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                    jo3.w(remoteAction.getActionIntent());
                                    return true;
                                }
                            });
                        }
                    }
                } else if (wd3Var instanceof ie3) {
                    i6++;
                }
                i4++;
                i2 = 0;
            }
            i5 = i;
            i4++;
            i2 = 0;
        }
        return true;
    }
}
