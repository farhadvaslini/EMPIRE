package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ko1 extends cg0 {
    public final int r;
    public final int s;
    public vn1 t;
    public wn1 u;

    public ko1(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.r = 21;
            this.s = 22;
        } else {
            this.r = 22;
            this.s = 21;
        }
    }

    @Override // defpackage.cg0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        kn1 kn1Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                kn1Var = (kn1) headerViewListAdapter.getWrappedAdapter();
            } else {
                kn1Var = (kn1) adapter;
                headersCount = 0;
            }
            wn1 wn1VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= kn1Var.getCount()) ? null : kn1Var.getItem(i);
            wn1 wn1Var = this.u;
            if (wn1Var != wn1VarB) {
                nn1 nn1Var = kn1Var.a;
                if (wn1Var != null) {
                    this.t.h(nn1Var, wn1Var);
                }
                this.u = wn1VarB;
                if (wn1VarB != null) {
                    this.t.j(nn1Var, wn1VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.s) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (kn1) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (kn1) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(vn1 vn1Var) {
        this.t = vn1Var;
    }

    @Override // defpackage.cg0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
