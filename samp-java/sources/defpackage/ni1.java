package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ni1 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ oi1 b;

    public ni1(oi1 oi1Var) {
        this.b = oi1Var;
        a();
    }

    public final void a() {
        nn1 nn1Var = this.b.h;
        wn1 wn1Var = nn1Var.v;
        if (wn1Var != null) {
            nn1Var.i();
            ArrayList arrayList = nn1Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((wn1) arrayList.get(i)) == wn1Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wn1 getItem(int i) {
        oi1 oi1Var = this.b;
        nn1 nn1Var = oi1Var.h;
        nn1Var.i();
        ArrayList arrayList = nn1Var.j;
        oi1Var.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (wn1) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        oi1 oi1Var = this.b;
        nn1 nn1Var = oi1Var.h;
        nn1Var.i();
        int size = nn1Var.j.size();
        oi1Var.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.g.inflate(2131427344, viewGroup, false);
        }
        ((ro1) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
